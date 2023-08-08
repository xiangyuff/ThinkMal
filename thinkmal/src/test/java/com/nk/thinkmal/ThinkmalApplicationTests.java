package com.nk.thinkmal;

import com.nk.thinkmal.sys.entity.Searchani;
import com.nk.thinkmal.sys.mapper.SearchaniMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ThinkmalApplicationTests {

    @Resource
    private SearchaniMapper searchaniMapper;

    @Test
    void testMapper() {
        List<Searchani> searchanis = searchaniMapper.selectList(null);
        searchanis.forEach(System.out::println);
    }

}
