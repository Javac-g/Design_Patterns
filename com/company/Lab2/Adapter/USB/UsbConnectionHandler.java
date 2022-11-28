package com.company.Lab2.Adapter.USB;

import java.util.ArrayList;
import java.util.List;

public class UsbConnectionHandler implements Usb{
    private List<Integer> list = new ArrayList<>();

    @Override
    public void connectToUsbPort(int index) {
        list.add(index);
    }

    @Override
    public String checkUsbConnection(int index) {
        if (list.get(index) != null){
            return "USB pont N: " + list.get(index) + ": connected";
        }
        return "USB pont N: " + list.get(index)+ ": not connected";
    }

    @Override
    public String countUsbConnetctions() {
        if(list.size() >=0){
            return "Connected usb ports: " + list.size();
        }
        return "Usb connections not find";
    }

    @Override
    public String disconnectAllUsb() {
        list.clear();
        return "All usb ports disconnected";
    }
}
