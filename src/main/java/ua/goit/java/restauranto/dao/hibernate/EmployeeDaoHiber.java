package ua.goit.java.restauranto.dao.hibernate;


import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.restauranto.dao.interfaces.EmployeeDao;
import ua.goit.java.restauranto.entities.Employee;

import java.util.List;

public class EmployeeDaoHiber implements EmployeeDao {

    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return sessionFactory.getCurrentSession().createQuery("select e from Employee e").list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
