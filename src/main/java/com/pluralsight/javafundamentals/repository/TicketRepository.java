package com.pluralsight.javafundamentals.repository;

import com.pluralsight.javafundamentals.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
