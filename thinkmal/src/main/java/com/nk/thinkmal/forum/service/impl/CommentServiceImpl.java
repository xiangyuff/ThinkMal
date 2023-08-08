package com.nk.thinkmal.forum.service.impl;

import com.nk.thinkmal.forum.entity.Comment;
import com.nk.thinkmal.forum.mapper.CommentMapper;
import com.nk.thinkmal.forum.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
