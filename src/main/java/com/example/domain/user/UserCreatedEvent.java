package com.example.domain.user;

import com.example.domain.event.Event;

public class UserCreatedEvent extends Event {
    private final Payload payload;

    public UserCreatedEvent(User user) {
        super();
        this.payload = new Payload(user);
    }

    public static class Payload extends com.example.domain.event.Payload {
        private String email;
        private String id;

        public Payload(User user) {
            this.email = user.getEmail();
            this.id = user.getId();
        }
    }
}
