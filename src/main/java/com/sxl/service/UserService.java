package com.sxl.service;

import com.sxl.dao.UserDao;
import com.sxl.entity.User;

import java.util.List;

public class UserService {

    UserDao userDao = new UserDao();

    public User check(User user) {
        return userDao.select(user);
    }


    //查询所有用户并显示
    public List<User> list() {
        return userDao.list();
    }
}

