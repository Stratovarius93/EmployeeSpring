package com.rafael.falconi.Employee.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rafael.falconi.Employee.documents.Employee;
import com.rafael.falconi.Employee.dtos.EmployeeDto;
import com.rafael.falconi.Employee.repositories.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void createEmployee(EmployeeDto employeeDto) {

		Employee employee = new Employee(employeeDto.getId(), employeeDto.getSurname(), employeeDto.getActive());
		this.employeeRepository.save(employee);

	}

	public boolean putEmployee(String id, EmployeeDto employeeDto) {
		Employee employee = this.employeeRepository.findById(id);
		assert employee != null;
		employee.setActive(employeeDto.getActive());
		employee.setArea(employeeDto.getArea());
		employee.setEntry(employeeDto.getEntry());
		employee.setEntry(employeeDto.getEntry());
		employee.setSurname(employeeDto.getSurname());
		return true;
	}

	public List<EmployeeDto> readEmployeeAll() {
		List<Employee> employeeList = this.employeeRepository.findAll();
		List<EmployeeDto> employeeListDto = new ArrayList<EmployeeDto>();

		for (Employee employee : employeeList) {
			employeeListDto.add(new EmployeeDto(employee.getId(), employee.getSurname(), employee.getActive()));

		}

		return employeeListDto;
	}

	public Optional<EmployeeDto> readEmployee(String id) {
		Employee employeeBD = this.employeeRepository.findById(id);
		if (employeeBD == null) {
			return Optional.empty();
		} else {
			return Optional.of(new EmployeeDto(employeeBD));
		}
	}

}
