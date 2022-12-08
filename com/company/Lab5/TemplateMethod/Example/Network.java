package com.company.Lab5.TemplateMethod.Example;

public abstract class Network {
    String username;
    String password;
   abstract boolean logIn(String username,String password);
   abstract void logOut();
    abstract boolean sendData(byte[] data);

    public boolean post(String message){
        if(logIn(this.username,this.password)){
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

}
