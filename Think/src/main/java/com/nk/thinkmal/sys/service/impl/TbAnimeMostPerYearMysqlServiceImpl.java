package com.nk.thinkmal.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nk.thinkmal.sys.entity.TbAnimeMostPerYearMysql;
import com.nk.thinkmal.sys.mapper.TbAnimeMostPerYearMysqlMapper;
import com.nk.thinkmal.sys.service.ITbAnimeMostPerYearMysqlService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 1960年至今每年即是基于分数的排名最高的动画，又是基于人数的排名最高的动画 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2023-08-07
 */
@Service
public class TbAnimeMostPerYearMysqlServiceImpl extends ServiceImpl<TbAnimeMostPerYearMysqlMapper, TbAnimeMostPerYearMysql> implements ITbAnimeMostPerYearMysqlService {

}
