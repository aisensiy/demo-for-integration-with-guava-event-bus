package com.example.domain.user;

import com.example.domain.event.GlobalEventBus;
import lombok.Data;

@Data
public class User {
    private String id;
    private String email;

    public User(String id, String email) {
        this.id = id;
        this.email = email;

        GlobalEventBus.get().post(new UserCreatedEvent(this));
    }
}
