package com.rafael.falconi.Employee.documents;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Column {

	private List<Ticket>tickets;
	private String id;
	private String name;
	public Column() {
		// TODO Auto-generated constructor stub
	}
	public Column(List<Ticket> tickets, String id, String name) {
		super();
		this.tickets = tickets;
		this.id = id;
		this.name = name;
	}
	public List<Ticket> getTickets() {
		return tickets;
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
	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	@Override
	public String toString() {
		return "Column [tickets=" + tickets + ", id=" + id + ", name=" + name + "]";
	}

	
}
