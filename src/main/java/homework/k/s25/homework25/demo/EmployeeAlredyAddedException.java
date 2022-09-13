package homework.k.s25.homework25.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class EmployeeAlredyAddedException extends RuntimeException {
}
