package nav.egjostol.java2exceltest.domain;

import java.util.Date;

public class Period {

    private final String name;
    private final Date start;
    private final Date end;

    public Period(String name, Date start, Date end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}
