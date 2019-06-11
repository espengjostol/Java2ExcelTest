package nav.egjostol.java2exceltest.map;

import nav.egjostol.java2exceltest.domain.Period;
import nav.egjostol.java2exceltest.poi.RowFiller;

public class PeriodRowFiller {

    public static void setCellValues(RowFiller filler, Period period) {
        int index = 0;
        filler.setCellValue(index++, period.getName());
        filler.setCellValue(index++, period.getStart());
        filler.setCellValue(index, period.getEnd());
    }
}
