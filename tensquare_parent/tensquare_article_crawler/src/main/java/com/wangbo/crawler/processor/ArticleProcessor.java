package com.wangbo.crawler.processor;

import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @author wangbo
 * @date 2020-03-15 22:03
 */
@Component
public class ArticleProcessor implements PageProcessor {
    @Override
    public void process(Page page) {
        page.addTargetRequests(page.getHtml().links().regex("https://blog.csdn.net/[a‐z 0‐9 ‐]+/article/details/[0‐9]{8}").all());
        String title= page.getHtml().xpath("//*[@id=\"mainBox\"]/main/div[1]/div/div/div[1]/h1").get();
        String content= page.getHtml().xpath("//*[@id=\"mainBox\"]/main/div[1]/article").get();
        if(title!=null && content!=null){ //如果有昵称和头像
            page.putField("title",title);
            page.putField("content",content);
        }else{
            page.setSkip(true);//跳过
        }
    }
    @Override
    public Site getSite() {
        return Site.me().setRetryTimes(3000).setSleepTime(100);
    }
}
