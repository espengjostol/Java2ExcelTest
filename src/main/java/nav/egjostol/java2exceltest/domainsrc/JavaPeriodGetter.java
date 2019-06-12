package nav.egjostol.java2exceltest.domainsrc;

import nav.egjostol.java2exceltest.domain.Period;
import nav.egjostol.java2exceltest.source.EntityGetter;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class JavaPeriodGetter implements EntityGetter<Period> {

    @Override
    public List<Period> getEntities() {
        return List.of(
                new Period("p1",
                        newDate(2017, Calendar.JANUARY, 2),
                        newDate(2017, Calendar.AUGUST, 5)),
                new Period("p2",
                        newDate(2018, Calendar.AUGUST, 21),
                        newDate(2018, Calendar.SEPTEMBER, 29)));
    }


    private static Date newDate(int year, int month, int dayOfMonth) {
        return new GregorianCalendar(year, month, dayOfMonth).getTime();
    }
}
