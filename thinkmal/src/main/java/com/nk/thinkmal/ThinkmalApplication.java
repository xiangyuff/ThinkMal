package com.nk.thinkmal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nk.thinkmal.*.mapper")
public class ThinkmalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThinkmalApplication.class, args);
    }

}
