package com.nk.thinkmal.sys.controller;

import com.nk.thinkmal.sys.service.impl.TbAnimeMostMembersYearTenMysqlServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 1960年至今追番人数最多的十年 前端控制器
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
@RestController
@RequestMapping("/sys/tbAnimeMostMembersYearTenMysql")
public class TbAnimeMostMembersYearTenMysqlController {
    @Autowired
    private TbAnimeMostMembersYearTenMysqlServiceImpl tbAnimeMostMembersYearTenMysqlService;
}
