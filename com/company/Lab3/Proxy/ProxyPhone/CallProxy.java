package com.company.Lab3.Proxy.ProxyPhone;

import java.time.LocalDate;
import java.time.LocalTime;

public class CallProxy implements Call{
     Call phone = null;
    private LocalTime startT = LocalTime.now();
    private  LocalDate startD = LocalDate.now();
    private  LocalTime endT = LocalTime.now();
    private  LocalDate endD = LocalDate.now();

    private String SD = startD.getYear() + "," + startD.getMonth() + "," + startD.getDayOfMonth() + " ";
    private String ST = startT.getHour() + ":" + startT.getMinute() +":"+ startT.getSecond();
    private String ED = endD.getYear() + "," + endD.getMonth() + "," + endD.getDayOfMonth()+ " ";
    private String ET = endT.getHour() + ":" + endT.getMinute() +":"+ LocalTime.now().getSecond();
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
