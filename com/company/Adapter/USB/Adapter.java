package com.company.Adapter.USB;

public class Adapter implements Usb{
    private Hdmi hdmi;

    public Adapter(Hdmi hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void connectToUsbPort(int index) {
        hdmi.connectToHdmiPort(index);
    }

    @Override
    public String checkUsbConnection(int index) {
        return hdmi.checkHdmiConnection(index);
    }

    @Override
    public String countUsbConnetctions() {
        return hdmi.countHdmiConnetctions();
    }

    @Override
    public String disconnectAllUsb() {
        return hdmi.disconnectAllHdmi();
    }
}
