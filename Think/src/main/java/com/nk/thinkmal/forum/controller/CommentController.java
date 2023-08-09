package com.nk.thinkmal.forum.controller;

import com.example.sys.model.po.User;
import com.example.sys.service.UserService;
import com.nk.thinkmal.common.vo.Result;
import com.nk.thinkmal.forum.entity.Comment;
import com.nk.thinkmal.forum.mapper.CommentMapper;
import com.nk.thinkmal.forum.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private ICommentService iCommentService;

    @GetMapping("/getcmt")
    public Result<List<Comment> > mcmt() {
        List<Comment> mlst = commentMapper.mcmt();
        return Result.success(mlst,"查询成功");
    }

    @PostMapping("/submit")
    public Result<Comment> submint(@RequestBody Comment comment) {
        iCommentService.addcomment(comment);
        return Result.success(comment,"添加成功");
    }
}
