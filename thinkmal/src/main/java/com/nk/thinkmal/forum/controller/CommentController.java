package com.nk.thinkmal.forum.controller;

import com.nk.thinkmal.common.vo.Result;
import com.nk.thinkmal.forum.entity.Comment;
import com.nk.thinkmal.forum.mapper.CommentMapper;
import com.nk.thinkmal.sys.entity.Searchani;
import com.nk.thinkmal.sys.mapper.SearchaniMapper;
import com.nk.thinkmal.sys.service.impl.SearchaniServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@RestController
@RequestMapping("/forum/comment")
public class CommentController {

    @Autowired
    private CommentMapper commentMapper;


    @GetMapping("/getcmt")
    public Result<List<Comment> > mcmt() {
        List<Comment> mlst = commentMapper.mcmt();
        return Result.success(mlst,"查询成功");
    }
}
