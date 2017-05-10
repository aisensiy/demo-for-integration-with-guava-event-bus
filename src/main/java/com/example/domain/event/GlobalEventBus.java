package com.example.domain.event;

public abstract class GlobalEventBus {
    private static GlobalEventBus instance;

    public static void init(GlobalEventBus eventBus) {
        instance = eventBus;
    }

    public static GlobalEventBus get() {
        if (instance == null) {
            throw new IllegalStateException("global event bus is null");
        }
        return instance;
    }

    public abstract void post(Event event);
    protected abstract void register(EventHandler eventHandler);
}
