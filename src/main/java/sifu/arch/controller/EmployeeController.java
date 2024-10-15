package sifu.arch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sifu.arch.entity.Employee;
import sifu.arch.service.EmployeeService;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employees")
    public String employeeList(Model model){
        List<Employee> employees = employeeService.getListEmployee();
        model.addAttribute("employeeList",employees);

        System.out.println(model.getAttribute("employeeList"));
        System.out.println(model.asMap());

        return "employee";
    }
}
