# Java2ExcelTest

Demonstrates Excel file creation using [Apache POI](https://poi.apache.org/) and Java 11.

One Excel file (workbook) is created, containing one sheet per Java domain class (entity type).
In each sheet one row is created per domain object (entity instance).
One column corresponds to one field in the domain class.

Two entity types are used (`Employee` and `Period`), resulting in an Excel workbook containing two sheets.

Usage:
1. `mvn clean install`.
2. Run `WorkbookWriterTest` class.
3. Expect file `poi-generated-file.xlsx` to be created in the `target` folder.
