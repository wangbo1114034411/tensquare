package com.wangbo.crawler;

import com.wangbo.crawler.processor.ArticlePipeline;
import com.wangbo.crawler.processor.ArticleProcessor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;
import us.codecraft.webmagic.Spider;

/**
 * @author wangbo
 * @date 2020-03-15 17:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {




    @Autowired
    private ArticlePipeline articlePipeline;
    @Autowired
    private ArticleProcessor articleProcessor;
    /**
     * 爬取用户数据
     */
    @Test
    public void ArticTask(){
        System.out.println("爬取用户");
        Spider spider = Spider.create(articleProcessor);
        spider.addUrl("https://blog.csdn.net");
        spider.addPipeline(articlePipeline);
        spider.start();
    }
}
