package ua.goit.java.restauranto.service.impl;


import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restauranto.dao.interfaces.EmployeeDao;
import ua.goit.java.restauranto.entities.Employee;
import ua.goit.java.restauranto.service.interfaces.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
