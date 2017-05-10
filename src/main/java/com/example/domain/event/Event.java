package com.example.domain.event;

import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class Event {
    private final String id;

    public Event() {
        this.id = UUID.randomUUID().toString();
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
