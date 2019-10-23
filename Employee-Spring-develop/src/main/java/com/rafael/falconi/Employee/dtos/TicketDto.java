package com.rafael.falconi.Employee.dtos;

import com.rafael.falconi.Employee.documents.Ticket;
import com.rafael.falconi.Employee.dtos.EmployeeDto;

public class TicketDto {
	private String id;
	

	private String name;
	private String description;
	
	private EmployeeDto employeeDto;
	
	public TicketDto(Ticket ticket) {
		this.id = ticket.getId();
		this.name = ticket.getName();
		this.description = ticket.getDescription();
		this.employeeDto = new EmployeeDto(ticket.getEmployee());
	}
	
	public TicketDto(String id, String name, String description, EmployeeDto employee) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.employeeDto = employee;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EmployeeDto getEmployee() {
		return employeeDto;
	}

	public void setEmployee(EmployeeDto employee) {
		this.employeeDto = employee;
	}

	@Override
	public String toString() {
		return "TicketDto [id=" + id + ", name=" + name + ", description=" + description + ", employeeDto="
				+ employeeDto + "]";
	}


	
}
