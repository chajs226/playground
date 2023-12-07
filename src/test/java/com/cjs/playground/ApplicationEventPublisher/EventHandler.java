package com.cjs.playground.ApplicationEventPublisher;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {

    @EventListener
    @Async
    public void receiveEvent1(Event event) {
        System.out.println("=========");
        System.out.println(Thread.currentThread().toString());
        System.out.println("received event 1 : " + event.getData());
    }

    @EventListener
    @Async
    public void receiveEvent2(Event event) {
        System.out.println("=========");
        System.out.println(Thread.currentThread().toString());
        System.out.println("received event 2: " + event.getData());
    }

}
