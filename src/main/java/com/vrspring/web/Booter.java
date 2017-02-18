package com.vrspring.web;

import com.vrspring.web.config.MyBatisConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xie on 16/11/23.
 */
@ComponentScan
@EnableAutoConfiguration
public class Booter implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Booter.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyBatisConfig.class);
        ctx.refresh();
        LOGGER.info("========                      VRSpring启动 开始                     ========");
        SpringApplication.run(Booter.class, args);
        LOGGER.info("========                      VRSpring启动 完成                     ========");
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("========                      VRSpring启动中 ...                    ========");
    }
}
