package ua.goit.java.restauranto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.goit.java.restauranto.service.interfaces.EmployeeService;


@Controller
public class MainController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        System.out.println(employeeService.findAll().toString());

        return "/index";
    }



}
