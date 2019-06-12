package nav.egjostol.java2exceltest.domain;

import java.util.Date;

public class Employee {

    private final String name;
    private final String email;
    private final Date dateOfBirth;
    private final double salary;

    public Employee(String name, String email, Date dateOfBirth, double salary) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }
}
