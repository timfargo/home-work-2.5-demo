package homework.k.s25.homework25.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("firstName") String name, @RequestParam("lastName") String surname,@RequestParam("getName")String patronymic) {
        return employeeService.addEmployee(name, surname,patronymic);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("firstName") String name, @RequestParam("lastName") String surname,@RequestParam("getName")String patronymic) {
        return employeeService.findEmployee(name, surname,patronymic);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("firstName") String name, @RequestParam("lastName") String surname,@RequestParam("getName")String patronymic) {
        return employeeService.removeEmployee(name, surname,patronymic);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return  employeeService.getAll();
    }
}

