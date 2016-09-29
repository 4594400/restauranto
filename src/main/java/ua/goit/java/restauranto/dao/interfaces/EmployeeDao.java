package ua.goit.java.restauranto.dao.interfaces;


import ua.goit.java.restauranto.entities.Employee;

import java.util.List;

public interface EmployeeDao {
    void save(Employee employee);
    List<Employee> findAll();

    /*void delete(Employee employee);
    void deleteAll();
    Employee load(Long id);

    Employee findByName(String name);
    Employee findBySurname(String surname);
    Employee findByNameAndSurname(String name, String surname);*/
}
