package nav.egjostol.java2exceltest.domaindesc;

import nav.egjostol.java2exceltest.entitymeta.EntityDescriptor;

public class PeriodDescriptor implements EntityDescriptor {

    private static final String ENTITY_NAME = "Periods";
    private static final String[] PROPERTY_NAMES = {"Name", "Start", "End"};

    public String getEntityName() {
        return ENTITY_NAME;
    }

    public String[] getPropertyNames() {
        return PROPERTY_NAMES;
    }
}
