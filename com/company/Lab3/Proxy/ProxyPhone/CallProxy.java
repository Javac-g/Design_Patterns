package com.company.Lab3.Proxy.ProxyPhone;

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
        System.out.println("Call started: " +SD+ LocalTime.now().getHour()+"Hour,"+LocalTime.now().getMinute()+"Min," + LocalTime.now().getSecond() + "sec" );
        phone.makeCall();
        System.out.println ("Call ended: " + ED + + LocalTime.now().getHour()+"Hour,"+LocalTime.now().getMinute()+"Min," + LocalTime.now().getSecond() + "sec" );
    }
}
