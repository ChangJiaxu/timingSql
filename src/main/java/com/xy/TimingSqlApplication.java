package com.xy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description: 启动类
 * @author: JX。Chang
 * @date: 2021年10月18日 22:43
 */
@SpringBootApplication
@EnableScheduling
public class TimingSqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(TimingSqlApplication.class,args);
    }
}
