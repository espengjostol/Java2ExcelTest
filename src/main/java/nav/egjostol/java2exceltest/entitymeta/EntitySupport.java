package nav.egjostol.java2exceltest.entitymeta;

import nav.egjostol.java2exceltest.sink.CellValueSetter;
import nav.egjostol.java2exceltest.source.EntityGetter;

import java.util.function.BiConsumer;

public class EntitySupport<T> {

    private final EntityGetter<T> entityGetter;
    private final EntityDescriptor entityDescriptor;
    private final BiConsumer<CellValueSetter, T> createRow;

    public EntitySupport(EntityGetter<T> entityGetter, EntityDescriptor entityDescriptor, BiConsumer<CellValueSetter, T> createRow) {
        this.entityGetter = entityGetter;
        this.entityDescriptor = entityDescriptor;
        this.createRow = createRow;
    }

    public EntityGetter<T> getEntityGetter() {
        return entityGetter;
    }

    public EntityDescriptor getEntityDescriptor() {
        return entityDescriptor;
    }

    public BiConsumer<CellValueSetter, T> getCreateRow() {
        return createRow;
    }
}
