package com.company.Lab2.Adapter.USB;

public interface Hdmi {
    void connectToHdmiPort(int index);
    String checkHdmiConnection(int index);
    String countHdmiConnetctions();
    String disconnectAllHdmi();
}
