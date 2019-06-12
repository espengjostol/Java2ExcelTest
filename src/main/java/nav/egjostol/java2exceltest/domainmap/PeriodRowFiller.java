package nav.egjostol.java2exceltest.domainmap;

import nav.egjostol.java2exceltest.domain.Period;
import nav.egjostol.java2exceltest.sink.CellValueSetter;

public class PeriodRowFiller {

    public static void setCellValues(CellValueSetter setter, Period period) {
        int index = 0;
        setter.setCellValue(index++, period.getName());
        setter.setCellValue(index++, period.getStart());
        setter.setCellValue(index, period.getEnd());
    }
}
