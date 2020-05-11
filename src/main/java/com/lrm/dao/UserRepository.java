package com.lrm.dao;

import com.lrm.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author shkstart
 * @date 2020/5/11 - 0:21
 */
public interface UserRepository extends JpaRepository<User,Long>{//User:不是dao操作的对象，Long表示主键的类型

    User findByUsernameAndPassword(String username,String password);
}
