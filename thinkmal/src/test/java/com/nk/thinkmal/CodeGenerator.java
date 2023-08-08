package com.nk.thinkmal;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/thinkmaldb?serverTimezone=UTC";
        String username = "root";
        String password = "123456";

        String modulename = "forum";
        String mapperlocation = "D:\\a_workbench_mwz\\IDEA_workplace\\thinkmal\\src\\main\\resources\\mapper\\"+modulename;
        String tables = "comment";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("baomidou") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            //.fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\a_workbench_mwz\\IDEA_workplace\\thinkmal\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.nk.thinkmal") // 设置父包名
                            .moduleName(modulename) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperlocation)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables); // 设置需要生成的表名
                            //.addTablePrefix("tb_anime_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
