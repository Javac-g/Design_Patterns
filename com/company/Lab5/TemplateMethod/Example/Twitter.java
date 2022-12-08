package com.company.Lab5.TemplateMethod.Example;

public class Twitter extends Network {
    public Twitter(String username,String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    boolean logIn(String username, String password) {
        System.out.println("Login successfully on Twitter");
        return true;
    }

    @Override
    void logOut() {
        System.out.println("User: " + username + " was logged out from Twitter");
    }

    @Override
    boolean sendData(byte[] data) {
        System.out.println("Message: " + new String(data) + " was posted on Twitter");
        return true;
    }
}
