package com.wongsakron.tickets.mappers;

import com.wongsakron.tickets.domain.CreateEventRequest;
import com.wongsakron.tickets.domain.CreateTicketTypeRequest;
import com.wongsakron.tickets.domain.dtos.CreateEventRequestDto;
import com.wongsakron.tickets.domain.dtos.CreateEventResponseDto;
import com.wongsakron.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.wongsakron.tickets.domain.entities.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);
}
