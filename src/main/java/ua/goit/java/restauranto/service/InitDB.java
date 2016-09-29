package ua.goit.java.restauranto.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ua.goit.java.restauranto.entities.Employee;
import ua.goit.java.restauranto.entities.Position;
import ua.goit.java.restauranto.service.interfaces.EmployeeService;

import javax.annotation.PostConstruct;
import java.sql.Date;

@Controller
public class InitDB {

    @Autowired
    private EmployeeService employeeService;

    @PostConstruct
    public void init(){
        System.out.println("*** INIT DB START ***");

        Employee alfred = new Employee();
        alfred.setName("Альфред");
        alfred.setSurname("Котов");
        alfred.setBirthday(Date.valueOf("1980-10-22"));
        alfred.setPhoneNumber("111-11-11");
        alfred.setPosition(Position.MANAGER);
        alfred.setSalary(1050.0);
        alfred.setInfo("Карьеру успешного ресторатора прошел ступень за ступенью, начав с официанта в отеле Метрополь в 1991 году, далее работал барменом, метрдотелем, менеджером бара, заместителем директора, генеральным директором сети ресторанов холдинга Centraarchy");
        employeeService.save(alfred);

        Employee jenny = new Employee();
        jenny.setName("Джени");
        jenny.setSurname("Псакова");
        jenny.setBirthday(Date.valueOf("1995-05-25"));
        jenny.setPhoneNumber("222-22-22");
        jenny.setPosition(Position.ADMINISTRATOR);
        jenny.setSalary(1250.0);
        jenny.setInfo("С сентября 2011 по январь 2014 года работала официантом в ресторане FermA. С января 2014 года по настоящее время является администратором ресторана Centraarchy. В 2014 году с отличием окончила школу сомелье «Миллезим». Свободно владеет итальянским и английским языками.");
        employeeService.save(jenny);

        Employee billy = new Employee();
        billy.setName("Билли");
        billy.setSurname("Бонс");
        billy.setBirthday(Date.valueOf("1991-02-15"));
        billy.setPhoneNumber("333-33-33");
        billy.setPosition(Position.WAITER);
        billy.setSalary(1450.0);
        billy.setInfo("Билли является одним из рекордсменов по размеру средств, переданных на благотворительностью. В период с 1996 по 2007 год, в 2009 и в 2015 годах — самый богатый человек планеты по версии журнала Forbes. В свободное время подрабатывает в ресторане Centraarchy.");
        employeeService.save(billy);
    }
}
