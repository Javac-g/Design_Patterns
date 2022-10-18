package com.company.Adapter.USB;

public class Main {
    public static void main(String...args){
        UsbConnectionHandler usbConnectionHandler = new UsbConnectionHandler();
        HdmiConnectionHandler hdmiConnectionHandler = new HdmiConnectionHandler();

        View view = new View();
        Adapter adapter = new Adapter(hdmiConnectionHandler);
        view.process(usbConnectionHandler);
        view.process(adapter);
    }
}
