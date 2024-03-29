package com.rafael.falconi.Employee.dtos;

import java.util.Date;

import com.rafael.falconi.Employee.documents.Area;
import com.rafael.falconi.Employee.documents.Employee;

public class EmployeeDto {

	private String id;

	private String surname;

	private Date entry;

	private Boolean active;

	private Area area;

	public EmployeeDto() {

	}

	public EmployeeDto(Employee employee) {
		super();
		this.id = employee.getId();
		this.surname = employee.getSurname();
		this.entry = employee.getEntry();
		this.active = employee.getActive();
		this.area = employee.getArea();
	}

	public EmployeeDto(String id, String surname, Boolean active) {
		super();
		this.id = id;
		this.surname = surname;
		this.active = active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getEntry() {
		return entry;
	}

	public void setEntry(Date entry) {
		this.entry = entry;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", surname=" + surname + ", entry=" + entry + ", active=" + active
				 + ", area=" + area + "]";
	}

}
