package com.demo.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @RequestMapping("/testNotify")
    public void testNotify() {
        NotifyEvent notifyEven = new NotifyEvent();
        notifyEven.setMessage("你好");
        applicationEventPublisher.publishEvent(notifyEven);


    }
}
