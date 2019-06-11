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

    private final WorkbookCreator workbookCreator;
    private final List<SheetPopulator> sheetPopulators;
    private final String fileName;

    WorkbookWriter(WorkbookCreator workbookCreator, List<SheetPopulator> sheetPopulators, String fileName) {
        this.workbookCreator = workbookCreator;
        this.sheetPopulators = sheetPopulators;
        this.fileName = fileName;
    }

    void createFile() throws IOException {
        try (Workbook workbook = workbookCreator.createWorkbook()) {
            sheetPopulators.forEach(o -> o.populateSheet(workbook));
            writeToFile(workbook);
        }
    }

    private void writeToFile(Workbook workbook) throws IOException {
        try (FileOutputStream output = new FileOutputStream(fileName)) {
            workbook.write(output);
        }
    }
}
