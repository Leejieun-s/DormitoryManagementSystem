package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@MapperScan("com.example.springboot.mapper")
public class Application implements CommandLineRunner {

    private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);
    @Value("${server.port}")
    private int serverPort;
    Date date = new Date();
    String time = String.format("%tc", date);
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("-----------------启动成功-----------------------");
        LOGGER.info("-----------------访问端口{}---------------------", serverPort);
        LOGGER.info("-----------------启动时间{}---------", time);
    }
}
