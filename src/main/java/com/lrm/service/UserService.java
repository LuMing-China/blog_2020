package com.lrm.service;

import com.lrm.po.User;

/**
 * @author shkstart
 * @date 2020/5/11 - 0:17
 */
public interface UserService {

    User checkUser(String username, String password);
}
