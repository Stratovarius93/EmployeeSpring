package com.rafael.falconi.Employee.dtos;

import java.util.List;

import com.rafael.falconi.Employee.dtos.TicketDto;
import com.rafael.falconi.Employee.documents.Column;
import com.rafael.falconi.Employee.documents.Ticket;

public class ColumnDto {
	private List<TicketDto>ticketsDto;
	
	private String id;
	private String name;
	
	public ColumnDto() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public ColumnDto(Column column) {
		// TODO Auto-generated constructor stub
		this.id = column.getId();
		this.name = column.getName();
		for(Ticket ticket : column.getTickets()){
			TicketDto ticketDto = new TicketDto(ticket);
			this.ticketsDto.add(ticketDto);
		}
	}
	public ColumnDto(List<TicketDto> ticketsDto, String id, String name) {
		super();
		this.ticketsDto = ticketsDto;
		this.id = id;
		this.name = name;
	}
	public List<TicketDto> getTicketsDto() {
		return ticketsDto;
	}
	public void setTicketsDto(List<TicketDto> ticketsDto) {
		this.ticketsDto = ticketsDto;
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
	@Override
	public String toString() {
		return "ColumnDto [ticketsDto=" + ticketsDto + ", id=" + id + ", name=" + name + "]";
	}
	
	
}
