package com.nk.thinkmal.sys.controller;

import com.nk.thinkmal.common.vo.Result;
import com.nk.thinkmal.sys.entity.Searchani;
import com.nk.thinkmal.sys.mapper.SearchaniMapper;
import com.nk.thinkmal.sys.service.impl.SearchaniServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
@RestController
@RequestMapping("/sys/searchani")
public class SearchaniController {
    @Autowired
    private SearchaniServiceImpl searchaniService;

    @Autowired
    private SearchaniMapper searchaniMapper;

    //test
    @GetMapping("/all")
    public Result<List<Searchani> > getSearchani() {
        List<Searchani> list = searchaniService.list();
        return Result.success(list,"查询成功");
    }

    @GetMapping("/searchtitle")
    public Result<List<Searchani> > msearch(@RequestParam(value = "name") String title) {
        List<Searchani> mlst = searchaniMapper.msearch(title);
        return Result.success(mlst,"查询成功");
    }
}
