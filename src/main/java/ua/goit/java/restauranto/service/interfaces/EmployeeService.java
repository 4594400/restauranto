package ua.goit.java.restauranto.service.interfaces;


import ua.goit.java.restauranto.entities.Employee;

import java.util.List;

public interface EmployeeService {
    void save(Employee employee);
    List<Employee> findAll();
}
