package com.company.Lab3.Proxy;

import com.company.Lab3.Proxy.ProxyPhone.Call;
import com.company.Lab3.Proxy.ProxyPhone.CallProxy;
import com.company.Lab3.Proxy.ProxyPhone.Phone;

public class Main {
    public static void main(String...args){
        Call call = new Phone();
        Call proxy = new CallProxy(call);
        proxy.makeCall();
    }
}
