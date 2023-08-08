package com.nk.thinkmal.sys.mapper;

import com.nk.thinkmal.sys.entity.Searchani;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
@Mapper
public interface SearchaniMapper extends BaseMapper<Searchani> {
    @Select("select * from searchani where title = #{title}")
    public List<Searchani> msearch(String title);
}
