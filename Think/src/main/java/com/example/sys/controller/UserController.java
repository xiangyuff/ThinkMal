package com.example.sys.controller;


import com.example.sys.model.po.User;
import com.example.sys.result.R;
import com.example.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ldx
 * @since 2023-08-09
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public R login(@RequestBody User user){
        String name = user.getUsername();
        String password = user.getPassword();
        User userDB = userService.getByNameAndPassword(name,password);
        if(userDB==null){
            return R.error(20001,"没有该用户");
        }
        return R.ok("登录成功").setData(userDB);

    }

    @PostMapping("/register")
    public R regiseter(@RequestBody User user){
        String name = user.getUsername();
        User checkName = userService.getByName(name);
        if(checkName!=null){
            return R.error(20001,"用户名已被注册");
        }
        userService.addUser(user);
        return R.ok("注册成功").setData(user);

    }

}
