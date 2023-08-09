package com.nk.thinkmal.ypage.controller;

import com.nk.thinkmal.common.vo.Result;
import com.nk.thinkmal.ypage.entity.NumTop8StudioDwd;
import com.nk.thinkmal.ypage.service.impl.NumTop8StudioDwdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 工作室出品动画数量top8 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@RestController
@RequestMapping("/ypage/numTop8StudioDwd")
public class NumTop8StudioDwdController {
    @Autowired
    private NumTop8StudioDwdServiceImpl numTop8StudioDwdService;

    @GetMapping("/chart4")
    public Result<List<NumTop8StudioDwd>> getCompare() {
        List<NumTop8StudioDwd> list = numTop8StudioDwdService.list();
        return Result.success(list,"查询成功");
    }
}
