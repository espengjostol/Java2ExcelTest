package nav.egjostol.java2exceltest;

import nav.egjostol.java2exceltest.domaindesc.EmployeeDescriptor;
import nav.egjostol.java2exceltest.domaindesc.PeriodDescriptor;
import nav.egjostol.java2exceltest.domainmap.EmployeeRowFiller;
import nav.egjostol.java2exceltest.domainmap.PeriodRowFiller;
import nav.egjostol.java2exceltest.domainsrc.JavaEmployeeGetter;
import nav.egjostol.java2exceltest.domainsrc.JavaPeriodGetter;
import nav.egjostol.java2exceltest.poi.DataTransferrer;
import nav.egjostol.java2exceltest.poiexcel.ExcelWorkbookCreator;
import nav.egjostol.java2exceltest.entitymeta.EntitySupport;

import java.io.IOException;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        try {
            List<EntitySupport<?>> entitySupports = List.of(
                    new EntitySupport<>(new JavaEmployeeGetter(), new EmployeeDescriptor(), EmployeeRowFiller::setCellValues),
                    new EntitySupport<>(new JavaPeriodGetter(), new PeriodDescriptor(), PeriodRowFiller::setCellValues));

            DataTransferrer.transferEntitiesToWorkbook(entitySupports, new ExcelWorkbookCreator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
