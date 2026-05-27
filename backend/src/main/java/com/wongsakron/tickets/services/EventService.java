package com.wongsakron.tickets.services;

import com.wongsakron.tickets.domain.CreateEventRequest;
import com.wongsakron.tickets.domain.entities.Event;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);
}
