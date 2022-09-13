package homework.k.s25.homework25.demo;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.security.Key;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


@Service
public class EmployeeService {
    private static final int LIMIT = 10;

    private final Map<String,Employee> employees = new HashMap<>();
    private String Key;

    public Employee addEmployee(String name, String surname,String patronymic) {
        Employee employee = new Employee(name, surname,patronymic);
        String key = getKey(name,surname,patronymic);
        if (employees.containsKey(Key)) {
            throw new EmployeeAlredyAddedException();
        }
        if (employees.size()< LIMIT) {
            employees.put(key,employee);
            return employee;
        }
        throw new EmployeeStoragelsFullException();
    }

    public Employee findEmployee(String name, String surname,String patronymic) {
        Employee employee = new Employee(name, surname,patronymic);
        String key = getKey(name,surname,patronymic);
        if (employees.containsKey(Key)) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }


    public Employee removeEmployee(String name, String surname,String patronymic ) {
        Employee employee = new Employee(name, surname,patronymic);
        String key = getKey(name,surname,patronymic);
        if (employees.containsKey(Key)) {
            throw new EmployeeNotFoundException();
        }
        employees.remove(employee);
        return employee;
    }
    
    public List<Employee> getAll() {
        return new ArrayList<>(employees.values());
    }
    
    private String getKey(String name,String surname,String patronymic){
        return name + "|" + surname + "|" + patronymic;
    }
    
    
}

