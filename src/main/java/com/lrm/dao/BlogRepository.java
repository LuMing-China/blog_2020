package com.lrm.dao;

import com.lrm.po.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.persistence.Id;

/**
 * @author shkstart
 * @date 2020/5/12 - 12:58
 */
public interface BlogRepository extends JpaRepository<Blog,Long>,JpaSpecificationExecutor<Blog> {

}
