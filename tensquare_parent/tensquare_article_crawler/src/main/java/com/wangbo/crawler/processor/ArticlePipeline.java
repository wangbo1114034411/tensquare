package com.wangbo.crawler.processor;

import com.wangbo.crawler.dao.ArticleDao;
import com.wangbo.crawler.pojo.Article;
import com.wangbo.crawler.util.DownloadUtil;
import com.wangbo.utils.IdWorker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.io.IOException;

@Component
public class ArticlePipeline implements Pipeline {

    @Autowired
    private IdWorker idWorker;
    @Autowired
    private ArticleDao articleDao;

    public void process(ResultItems resultItems, Task task) {

        Article article = new Article();
        article.setColumnid(idWorker.nextId()+"");
        article.setChannelid("1");
        article.setColumnid("1");
        article.setTitle(resultItems.get("title"));
        article.setContent(resultItems.get("content"));
    }
}
