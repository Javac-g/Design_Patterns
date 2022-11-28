package com.company.Lab2.Adapter.USB;

public class View {
    public void process(Usb usb){
        System.out.println("Connecting to ports 1, 4, 6");
        usb.connectToUsbPort(1);
        usb.connectToUsbPort(4);
        usb.connectToUsbPort(6);
        System.out.println(usb.countUsbConnetctions());

        for (int i = 0; i <3 ;i++){
            System.out.println(usb.checkUsbConnection(i));
        }
        System.out.println(usb.disconnectAllUsb());
        System.out.println(usb.countUsbConnetctions());

    }
}
