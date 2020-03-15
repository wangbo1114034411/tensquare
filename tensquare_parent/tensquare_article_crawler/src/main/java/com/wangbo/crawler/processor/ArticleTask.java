package com.wangbo.crawler.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.scheduler.RedisScheduler;

/**
* 用户爬取任务类
*/
@Component
public class ArticleTask {

    @Autowired
    private ArticlePipeline articlePipeline;
    @Autowired
    private ArticleProcessor articleProcessor;
    /**
     * 爬取用户数据
     */
    @Scheduled(cron="0 35 22 ? * *")
    public void ArticTask(){
        System.out.println("爬取用户");
        Spider spider = Spider.create(articleProcessor);
        spider.addUrl("https://blog.csdn.net");
        spider.addPipeline(articlePipeline);
        spider.start();
    }
}