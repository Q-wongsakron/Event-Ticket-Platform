package com.wongsakron.tickets.repositories;

import com.wongsakron.tickets.domain.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {

}
