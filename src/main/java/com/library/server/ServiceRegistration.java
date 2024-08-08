package com.library.server;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class ServiceRegistration {

    public void serviceRegistration(String name, String text, int port) throws InterruptedException{
        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			System.out.println("Registration: InetAddress.getLocalHost():" + InetAddress.getLocalHost());

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", name, port, text);
            jmdns.registerService(serviceInfo);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
