package com.company.Lab3.Proxy.Example;

public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("Data successfully saved");
    }
}
