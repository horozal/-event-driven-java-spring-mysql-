package com.example.eventdriven.event;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class Event extends ApplicationEvent {
    private final String message;

    public Event(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
