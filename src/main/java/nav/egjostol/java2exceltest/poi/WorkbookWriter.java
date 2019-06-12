package nav.egjostol.java2exceltest.poi;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Adapted from
 * https://www.callicoder.com/java-write-excel-file-apache-poi/
 */
class WorkbookWriter {

    static void createFile(WorkbookCreator workbookCreator, List<SheetPopulator> sheetPopulators, String fileName) throws IOException {
        try (Workbook workbook = workbookCreator.createWorkbook()) {
            sheetPopulators.forEach(o -> o.populateSheet(workbook));
            writeToFile(workbook, fileName);
        }
    }

    private static void writeToFile(Workbook workbook, String fileName) throws IOException {
        try (FileOutputStream output = new FileOutputStream(fileName)) {
            workbook.write(output);
        }
    }
}
