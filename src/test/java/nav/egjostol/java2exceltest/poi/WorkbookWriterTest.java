package nav.egjostol.java2exceltest.poi;

import nav.egjostol.java2exceltest.domain.Employee;
import nav.egjostol.java2exceltest.domain.Period;
import nav.egjostol.java2exceltest.domaindesc.EmployeeDescriptor;
import nav.egjostol.java2exceltest.domaindesc.PeriodDescriptor;
import nav.egjostol.java2exceltest.domainmap.EmployeeRowFiller;
import nav.egjostol.java2exceltest.domainmap.PeriodRowFiller;
import nav.egjostol.java2exceltest.entitymeta.EntitySupport;
import nav.egjostol.java2exceltest.poiexcel.ExcelWorkbookCreator;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

class WorkbookWriterTest {

    @Test
    void createExcelFile() throws IOException {
        List<SheetPopulator> populators = List.of(
                new SheetFiller<>(new EntitySupport<>(WorkbookWriterTest::prepareEmployees, new EmployeeDescriptor(), EmployeeRowFiller::setCellValues)),
                new SheetFiller<>(new EntitySupport<>(WorkbookWriterTest::preparePeriods, new PeriodDescriptor(), PeriodRowFiller::setCellValues)));

        WorkbookWriter.createFile(new ExcelWorkbookCreator(), populators, "poi-file-test.xlsx");
    }

    private static List<Employee> prepareEmployees() {
        return List.of(
                new Employee("Rajeev Singh", "rajeev@example.com",
                        newDate(1992, Calendar.AUGUST, 21), 1200000.0),
                new Employee("Thomas Cook", "thomas@example.com",
                        newDate(1965, Calendar.NOVEMBER, 15), 1500000.0),
                new Employee("Steve Maiden", "steve@example.com",
                        newDate(1987, Calendar.MAY, 18), 1800000.0));
    }

    private static List<Period> preparePeriods() {
        return List.of(
                new Period("p1",
                        newDate(2017, Calendar.JANUARY, 2),
                        newDate(2017, Calendar.AUGUST, 5)),
                new Period("p2",
                        newDate(2018, Calendar.AUGUST, 21),
                        newDate(2018, Calendar.SEPTEMBER, 29)),
                new Period("p3",
                        newDate(2019, Calendar.AUGUST, 3),
                        newDate(2019, Calendar.DECEMBER, 31)));
    }

    private static Date newDate(int year, int month, int dayOfMonth) {
        return new GregorianCalendar(year, month, dayOfMonth).getTime();
    }
}
