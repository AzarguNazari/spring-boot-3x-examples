package com.khoubyari.example.service;

import org.springframework.context.ApplicationEvent;

public class HotelServiceEvent extends ApplicationEvent {

    public HotelServiceEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "My HotelService Event";
    }
}