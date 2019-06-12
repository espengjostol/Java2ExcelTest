package nav.egjostol.java2exceltest.domainsrc;

import nav.egjostol.java2exceltest.domain.Employee;
import nav.egjostol.java2exceltest.source.EntityGetter;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class JavaEmployeeGetter implements EntityGetter<Employee> {

    @Override
    public List<Employee> getEntities() {
        return List.of(
                new Employee("Rajeev Singh", "rajeev@example.com",
                        newDate(1992, Calendar.AUGUST, 21), 1200000.0),
                new Employee("Thomas Cook", "thomas@example.com",
                        newDate(1965, Calendar.NOVEMBER, 15), 1500000.0),
                new Employee("Steve Maiden", "steve@example.com",
                        newDate(1987, Calendar.MAY, 18), 1800000.0));
    }

    private static Date newDate(int year, int month, int dayOfMonth) {
        return new GregorianCalendar(year, month, dayOfMonth).getTime();
    }
}
