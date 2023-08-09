package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.sys.mapper")
@MapperScan("com.nk.thinkmal.*.mapper")
public class ThinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThinkApplication.class, args);
    }

}
