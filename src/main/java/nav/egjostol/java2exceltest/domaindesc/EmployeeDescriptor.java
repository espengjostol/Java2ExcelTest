package nav.egjostol.java2exceltest.domaindesc;

import nav.egjostol.java2exceltest.entitymeta.EntityDescriptor;

public class EmployeeDescriptor implements EntityDescriptor {

    private static final String ENTITY_NAME = "Employees";
    private static final String[] PROPERTY_NAMES = {"Name", "Email", "Date Of Birth", "Salary"};

    public String getEntityName() {
        return ENTITY_NAME;
    }

    public String[] getPropertyNames() {
        return PROPERTY_NAMES;
    }
}
