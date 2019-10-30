package com.rafael.falconi.Employee.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.rafael.falconi.Employee.documents.Employee;
import com.rafael.falconi.Employee.documents.Ticket;
import com.rafael.falconi.Employee.dtos.TicketDto;
import com.rafael.falconi.Employee.repositories.TicketRepository;
import com.rafael.falconi.Employee.repositories.EmployeeRepository;

public class TicketController {
	@Autowired
	private TicketRepository ticketRepository;
	private EmployeeRepository employeeRepository;
	
	public void createTicket(TicketDto ticketDto) {
		Employee employee = this.employeeRepository.findById(ticketDto.getEmployee().getId());
		Ticket ticket = new Ticket(ticketDto.getId(), ticketDto.getName(), ticketDto.getDescription(), employee);
		this.ticketRepository.save(ticket);
		
	}
}
