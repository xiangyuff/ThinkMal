package com.nk.thinkmal.forum.mapper;

import com.nk.thinkmal.forum.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nk.thinkmal.sys.entity.Searchani;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
    @Select("select * from comment order by cid desc limit 10")
    public List<Comment> mcmt();

}
