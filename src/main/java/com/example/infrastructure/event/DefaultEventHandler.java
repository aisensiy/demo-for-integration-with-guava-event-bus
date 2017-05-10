package com.example.infrastructure.event;

import com.example.domain.event.EventHandler;
import com.example.domain.user.UserCreatedEvent;
import org.springframework.stereotype.Component;


@Component
public class DefaultEventHandler implements EventHandler {
    @Override
    public void handleUserCreatedEvent(UserCreatedEvent userCreatedEvent) {

    }
}
