package nav.egjostol.java2exceltest.domainmap;

import nav.egjostol.java2exceltest.domain.Employee;
import nav.egjostol.java2exceltest.sink.CellValueSetter;

public class EmployeeRowFiller {

    public static void setCellValues(CellValueSetter setter, Employee employee) {
        int index = 0;
        setter.setCellValue(index++, employee.getName());
        setter.setCellValue(index++, employee.getEmail());
        setter.setCellValue(index++, employee.getDateOfBirth());
        setter.setCellValue(index, employee.getSalary());
    }
}
