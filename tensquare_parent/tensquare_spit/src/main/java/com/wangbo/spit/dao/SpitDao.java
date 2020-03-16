package com.wangbo.spit.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.wangbo.spit.pojo.Spit;
/**
 * @author wangbo
 * @date 2020-03-16 17:24
 */
public interface SpitDao extends MongoRepository<Spit, String> {
}
