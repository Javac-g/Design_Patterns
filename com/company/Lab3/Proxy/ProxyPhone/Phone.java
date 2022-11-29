package com.company.Lab3.Proxy.ProxyPhone;

public class Phone implements Call{
    @Override
    public void makeCall() {
        System.out.println("\nMaking call");
        for(int i = 0 ; i < 10; i++){
            System.out.println("On line: " + i + " sec.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Off-line");
    }
}
