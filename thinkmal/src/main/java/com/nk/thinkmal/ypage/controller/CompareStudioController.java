package com.nk.thinkmal.ypage.controller;

import com.nk.thinkmal.common.vo.Result;
import com.nk.thinkmal.sys.entity.Searchani;
import com.nk.thinkmal.sys.mapper.SearchaniMapper;
import com.nk.thinkmal.ypage.entity.CompareStudio;
import com.nk.thinkmal.ypage.mapper.CompareStudioMapper;
import com.nk.thinkmal.ypage.service.impl.CompareStudioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 工作室五维比较 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@RestController
@RequestMapping("/ypage/compareStudio")
public class CompareStudioController {
    @Autowired
    private CompareStudioServiceImpl compareStudioService;

    @GetMapping("/chart1")
    public Result<List<CompareStudio>> getCompare() {
        List<CompareStudio> list = compareStudioService.list();
        return Result.success(list,"查询成功");
    }

}
