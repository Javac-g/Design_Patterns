package com.company.Lab5.TemplateMethod.Example;

public class Facebook extends Network{

    public Facebook(String username,String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    boolean logIn(String username, String password) {
        System.out.println("Login successfully on Facebook");
        return true;
    }

    @Override
    void logOut() {
        System.out.println("User: " + username + " was logged out from Facebook");
    }

    @Override
    boolean sendData(byte[] data) {
        System.out.println("Message: " + new String(data) + " was posted on facebook");
        return true;
    }
}
