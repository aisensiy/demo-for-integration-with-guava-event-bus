package com.example.domain.event;

import com.example.domain.user.UserCreatedEvent;

public interface EventHandler {
    void handleUserCreatedEvent(UserCreatedEvent userCreatedEvent);

}
