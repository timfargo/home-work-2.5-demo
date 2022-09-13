package homework.k.s25.homework25.demo;

import java.util.Objects;

public class Employee {


    private final String  name;
    private final String surname;
    private final String patronymic;

    public  Employee(String name,String surname,String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getPatronymic(){
        return patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
