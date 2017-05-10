package com.example.domain.user;

import com.example.domain.event.EventHandler;
import com.example.domain.event.GlobalEventBus;
import com.example.infrastructure.event.DefaultGlobalEventBus;
import com.google.common.eventbus.Subscribe;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class UserTest {

    private FakeEventHandler eventHandler;

    @Before
    public void setUp() throws Exception {
        eventHandler = new FakeEventHandler();
        GlobalEventBus eventBus = new DefaultGlobalEventBus(eventHandler);
        GlobalEventBus.init(eventBus);
    }

    @Test
    public void should_trigger_user_created_event() throws Exception {
        User user = new User("123", "scxu@thoughtworks.com");
        assertThat(eventHandler.getUserCreatedEvent(), notNullValue());
    }
}

class FakeEventHandler implements EventHandler {

    private UserCreatedEvent userCreatedEvent;

    @Override
    @Subscribe
    public void handleUserCreatedEvent(UserCreatedEvent userCreatedEvent) {
        this.userCreatedEvent = userCreatedEvent;
    }

    public UserCreatedEvent getUserCreatedEvent() {
        return userCreatedEvent;
    }
}