package com.authorshaven.authorshaven.service;

import com.authorshaven.authorshaven.dao.UserDao;
import com.authorshaven.authorshaven.model.User;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.insertUser(user);
    }

}
