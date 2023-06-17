package com.example.eventdriven;

import com.example.eventdriven.event.Event;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EventDrivenApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EventDrivenApplication.class, args);

        // Publish the event
        Event event = new Event("Hello, World!");
        context.publishEvent(event);
    }

    @EventListener
    public void handleEvent(Event event) {
        // Handle the event
        System.out.println("Received event: " + event.getMessage());
    }
}
