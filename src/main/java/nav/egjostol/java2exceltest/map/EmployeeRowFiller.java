package nav.egjostol.java2exceltest.map;

import nav.egjostol.java2exceltest.domain.Employee;
import nav.egjostol.java2exceltest.poi.RowFiller;

public class EmployeeRowFiller {

    public static void setCellValues(RowFiller filler, Employee employee) {
        int index = 0;
        filler.setCellValue(index++, employee.getName());
        filler.setCellValue(index++, employee.getEmail());
        filler.setCellValue(index++, employee.getDateOfBirth());
        filler.setCellValue(index, employee.getSalary());
    }
}
