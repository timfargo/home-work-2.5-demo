package homework.k.s25.homework25.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException{
}
