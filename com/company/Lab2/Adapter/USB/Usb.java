package com.company.Lab2.Adapter.USB;

public interface Usb {
    void connectToUsbPort(int index);
    String checkUsbConnection(int index);
    String countUsbConnetctions();
    String disconnectAllUsb();
}
