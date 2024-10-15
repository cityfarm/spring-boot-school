package sifu.arch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sifu.arch.entity.Employee;
import sifu.arch.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getListEmployee(){
        return employeeRepository.getEmployeeFromDB();
    }
}
