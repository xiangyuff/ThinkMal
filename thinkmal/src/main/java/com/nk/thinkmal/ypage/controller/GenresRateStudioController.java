package com.nk.thinkmal.ypage.controller;

import com.nk.thinkmal.common.vo.Result;
import com.nk.thinkmal.ypage.entity.CompareStudio;
import com.nk.thinkmal.ypage.entity.GenresRateStudio;
import com.nk.thinkmal.ypage.service.impl.CompareStudioServiceImpl;
import com.nk.thinkmal.ypage.service.impl.GenresRateStudioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 最受关注题材里各工作室占比 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@RestController
@RequestMapping("/ypage/genresRateStudio")
public class GenresRateStudioController {
    @Autowired
    private GenresRateStudioServiceImpl genresRateStudioService;

    @GetMapping("/chart2")
    public Result<List<GenresRateStudio> > getCompare() {
        List<GenresRateStudio> list = genresRateStudioService.list();
        return Result.success(list,"查询成功");
    }
}
