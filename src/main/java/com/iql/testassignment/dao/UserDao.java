package com.iql.testassignment.dao;

import com.iql.testassignment.bean.User;

import java.util.List;

public interface UserDao {

    /*UserBean getById(long id);

    void save(UserBean userBean);*/

    List<User> searchByName(String name);
}
