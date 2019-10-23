package com.rafael.falconi.Employee.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.rafael.falconi.Employee.documents.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {

	public Ticket findById(String id);
}
