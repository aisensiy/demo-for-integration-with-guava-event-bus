package com.example.infrastructure.event;

import com.example.domain.event.Event;
import com.example.domain.event.EventHandler;
import com.example.domain.event.GlobalEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DefaultGlobalEventBus extends GlobalEventBus {
    private final EventBus eventBus;

    @Autowired
    public DefaultGlobalEventBus(EventHandler eventHandler) {
        eventBus = new EventBus();
        register(eventHandler);
    }

    @Override
    public void post(Event event) {
        eventBus.post(event);
    }

    @Override
    protected void register(EventHandler eventHandler) {
        eventBus.register(eventHandler);
    }

    @PostConstruct
    public void init() {
        GlobalEventBus.init(this);
    }
}
