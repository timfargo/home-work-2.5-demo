package homework.k.s25.homework25.demo;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Service
public class EmployeeService {
    private static final int LIMIT = 10;

    private final List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(String name, String surname,String patronymic) {
        Employee employee = new Employee(name, surname,patronymic);
        if (employees.contains(employee)) {
            throw new EmployeeAlredyAddedException();
        }
        if (employees.size()< LIMIT) {
            employees.add(employee);
            return employee;
        }
        throw new EmployeeStoragelsFullException();
    }

    public Employee findEmployee(String name, String surname,String patronymic) {
        Employee employee = new Employee(name, surname,patronymic);
        if (employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }


    public Employee removeEmployee(String name, String surname,String patronymic ) {
        Employee employee = new Employee(name, surname,patronymic);
        if (employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        employees.remove(employee);
        return employee;
    }

    public List<Employee> getAll() {
        return new ArrayList<>(employees);}
}
