package com.lyc.listener.rabbitmq;

public class QueueListener2 {

    public void onMessage(String message) {
        System.out.println("QueueListener2 received "+message);
    }
}
