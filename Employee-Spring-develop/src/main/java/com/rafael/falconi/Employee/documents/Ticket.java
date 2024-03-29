package com.rafael.falconi.Employee.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ticket {
	@Id
	private String id;
	private String name;
	private String description;
	
	@DBRef
	private Employee employee;
	/*1
	public Ticket() {
		// TODO Auto-generated constructor stub
	}*/
	public Ticket(String id, String name, String description, Employee employee) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.employee = employee;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", name=" + name + ", description=" + description + ", employee=" + employee + "]";
	}
	
}
