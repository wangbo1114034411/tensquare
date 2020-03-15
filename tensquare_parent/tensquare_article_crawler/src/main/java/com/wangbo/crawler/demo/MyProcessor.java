package com.wangbo.crawler.demo;


import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @author wangbo
 * @date 2020-03-15 17:04
 */
public class MyProcessor implements PageProcessor {
    public void process(Page page) {
        System.out.println(page.getHtml().toString());
    }
    public Site getSite() {
        return Site.me().setSleepTime(100).setRetryTimes(3);
    }
    public static void main(String[] args) {

        while (true){
            Spider.create( new MyProcessor()
            ).addUrl("https://gec.ve-china.com.cn/public/login?l=zh-cn").run();

        }

    }

}
