package com.nk.thinkmal.ypage.controller;

import com.nk.thinkmal.common.vo.Result;
import com.nk.thinkmal.ypage.entity.Top100NumStudio;
import com.nk.thinkmal.ypage.service.impl.Top100NumStudioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 工作室出品动画排名前百数 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-08
 */
@RestController
@RequestMapping("/ypage/top100NumStudio")
public class Top100NumStudioController {
    @Autowired
    private Top100NumStudioServiceImpl top100NumStudioService;

    @GetMapping("/chart5")
    public Result<List<Top100NumStudio>> getCompare() {
        List<Top100NumStudio> list = top100NumStudioService.list();
        return Result.success(list,"查询成功");
    }
}
