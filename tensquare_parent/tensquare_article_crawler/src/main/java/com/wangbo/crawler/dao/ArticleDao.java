package com.wangbo.crawler.dao;


import com.wangbo.crawler.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
@Transactional
public interface ArticleDao extends JpaRepository<Article,String>,JpaSpecificationExecutor<Article>{

}
