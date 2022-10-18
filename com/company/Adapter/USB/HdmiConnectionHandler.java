package com.company.Adapter.USB;

import java.util.LinkedList;
import java.util.List;

public class HdmiConnectionHandler implements Hdmi{
    private List<Integer> list = new LinkedList<>();
    @Override
    public void connectToHdmiPort(int index) {
        list.add(index);
    }

    @Override
    public String checkHdmiConnection(int index) {
        if (list.get(index) != null){
            return "Hdmi pont N: " +  list.get(index) + ": connected";
        }
        return "Hdmi pont N: " +  list.get(index) + ": not connected";
    }

    @Override
    public String countHdmiConnetctions() {
        if(list.size() >=0){
            return "Connected hdmi ports: " + list.size();
        }
        return "Hdmi connections not find";
    }

    @Override
    public String disconnectAllHdmi() {
        list.clear();
        return "All usb ports disconnected";
    }
}
