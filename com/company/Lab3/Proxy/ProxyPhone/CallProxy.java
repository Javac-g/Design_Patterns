package com.company.Lab3.Proxy.ProxyPhone;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;

public class CallProxy implements Call{
     Call phone = null;

    private  LocalDate startD = LocalDate.now();

    private  LocalDate endD = LocalDate.now();

    private String SD = startD.getYear() + "," + startD.getMonth() + "," + startD.getDayOfMonth() + " ";
    private String ED = endD.getYear() + "," + endD.getMonth() + "," + endD.getDayOfMonth()+ " ";

    public CallProxy(Call phone) {
        this.phone = phone;
    }

    @Override
    public void makeCall() {
        Instant start = Instant.now();
        System.out.println("Call started: " + start);

        phone.makeCall();

        Instant end = Instant.now();
        System.out.println("Call ended: " + end);
        long elapsed = Duration.between(start,end).toSeconds();
        System.out.println("CAll duration sec: " + elapsed);
    }
}
