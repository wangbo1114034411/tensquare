package com.wangbo.recruit.dao;



import com.wangbo.recruit.pojo.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface RecruitDao extends JpaRepository<Recruit,String>, JpaSpecificationExecutor<Recruit> {
	List<Recruit> findByStateOrderByCreatetimeDesc(String state);

    List<Recruit> findByStateNotOrderByCreatetimeDesc(String state);
}
