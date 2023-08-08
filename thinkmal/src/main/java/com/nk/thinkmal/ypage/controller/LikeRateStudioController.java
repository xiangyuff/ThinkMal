package com.nk.thinkmal.ypage.controller;

import com.nk.thinkmal.common.vo.Result;
import com.nk.thinkmal.ypage.entity.CompareStudio;
import com.nk.thinkmal.ypage.entity.LikeRateStudio;
import com.nk.thinkmal.ypage.service.impl.CompareStudioServiceImpl;
import com.nk.thinkmal.ypage.service.impl.LikeRateStudioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 工作室动画收藏率 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@RestController
@RequestMapping("/ypage/likeRateStudio")
public class LikeRateStudioController {
    @Autowired
    private LikeRateStudioServiceImpl likeRateStudioService;

    @GetMapping("/chart3")
    public Result<List<LikeRateStudio>> getCompare() {
        List<LikeRateStudio> list = likeRateStudioService.list();
        return Result.success(list,"查询成功");
    }
}
