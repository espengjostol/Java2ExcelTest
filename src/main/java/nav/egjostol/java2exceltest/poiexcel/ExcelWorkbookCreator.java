package nav.egjostol.java2exceltest.poiexcel;

import nav.egjostol.java2exceltest.poi.WorkbookCreator;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWorkbookCreator implements WorkbookCreator {

    /**
     * XSSF = XML SpreadSheet Format; supports Office Open XML (XLSX) format files
     */
    @Override
    public Workbook createWorkbook() {
        return new XSSFWorkbook();
    }
}
