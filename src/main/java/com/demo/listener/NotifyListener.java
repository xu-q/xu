package com.demo.listener;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class NotifyListener {

    @EventListener(classes = NotifyEvent.class)
    @Order(3)
    public void notifyEamil(NotifyEvent notifyEvent) {
        System.out.println("邮件: " + notifyEvent.getMessage());
    }

    @EventListener
    @Order(2)
    public void notifyMessage(NotifyEvent notifyEvent) {
        System.out.println("短信: " + notifyEvent.getMessage());
    }

    @EventListener
    @Order(1)
    public void notifyQQ(NotifyEvent notifyEvent) {
        System.out.println("QQ: " + notifyEvent.getMessage());
    }
}
