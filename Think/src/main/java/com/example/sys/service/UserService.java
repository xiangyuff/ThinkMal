package com.example.sys.service;

import com.example.sys.model.po.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ldx
 * @since 2023-08-09
 */
public interface UserService extends IService<User> {
    User getByNameAndPassword(String name,String password);

    User getByName(String name);

    void addUser(User user);
}
