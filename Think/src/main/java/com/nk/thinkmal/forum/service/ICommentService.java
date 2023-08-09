package com.nk.thinkmal.forum.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nk.thinkmal.forum.entity.Comment;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
public interface ICommentService extends IService<Comment> {

    void addcomment(Comment comment);
}
