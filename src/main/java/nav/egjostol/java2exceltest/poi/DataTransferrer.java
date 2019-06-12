package nav.egjostol.java2exceltest.poi;

import nav.egjostol.java2exceltest.entitymeta.EntitySupport;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataTransferrer {

    public static void transferEntitiesToWorkbook(List<EntitySupport<?>> entitySupports, WorkbookCreator workbookCreator) throws IOException {
        List<SheetPopulator> populators = entitySupports
                .stream()
                .map((Function<EntitySupport<?>, SheetFiller>) SheetFiller::new)
                .collect(Collectors.toList());

        WorkbookWriter.createFile(workbookCreator, populators, "poi-generated-file.xlsx");
    }
}
