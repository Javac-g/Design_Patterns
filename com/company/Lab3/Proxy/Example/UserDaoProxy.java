package com.company.Lab3.Proxy.Example;

public class UserDaoProxy implements UserDao{
    UserDao userDao = null;
    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("Start transaction");
        userDao.save();
        System.out.println("End transaction");
    }
}
