package sifu.arch.repository;

import org.springframework.stereotype.Repository;
import sifu.arch.entity.Employee;

import java.util.List;

@Repository
public class EmployeeRepository {
    public List<Employee> getEmployeeFromDB() {
        return List.of(new Employee(1,"Nguyen Van A", 19900115, 5000000),
                new Employee(2, "Tran Thi B", 19880520, 6000000),
                new Employee(3, "Le Van C", 19950930, 5500000));
    }
}
