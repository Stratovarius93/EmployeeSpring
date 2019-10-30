package com.rafael.falconi.Employee.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

//import com.rafael.falconi.Employee.documents.Category;

@Document
public class Employee {

	@Id
	private String id;

	private String surname;

	private Date entry;

	private Boolean active;

	@DBRef

	private Area area;

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Employee() {
		this.entry = new Date();
	}

	public Employee(String id, String surname, Boolean active) {
		super();
		this.id = id;
		this.surname = surname;
		this.active = active;

	}

	public Employee(String surname) {
		this.surname = surname;
	}

	public Employee(String id, String surname, Area area) {

		this.id = id;
		this.surname = surname;
		this.area = area;
	}

	public String getId() {
		return id;
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


	public void getDate() {
		// this.getEntry().setTime(date);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", surname=" + surname + ", entry=" + entry + ", active=" + active + ", category="
				 + ", area=" + area + "]";
	}

}