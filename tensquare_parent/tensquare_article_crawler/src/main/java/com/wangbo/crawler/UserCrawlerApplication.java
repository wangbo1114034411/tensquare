package com.wangbo.crawler;

import com.wangbo.utils.IdWorker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author wangbo
 * @date 2020-03-15 17:00
 */
@SpringBootApplication
@EnableScheduling
public class UserCrawlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCrawlerApplication.class, args);
    }

    @Bean
    public IdWorker idWorkker(){
        return new IdWorker(1, 1);
    }

}