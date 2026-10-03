package io.protostuff.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
final class ArrayFieldMap<T> implements FieldMap<T> {
    private final List<Field<T>> fields;
    private final Map<String, Field<T>> fieldsByName = new HashMap();
    private final Field<T>[] fieldsByNumber;

    public ArrayFieldMap(Collection<Field<T>> collection, int i) {
        this.fieldsByNumber = new Field[i + 1];
        for (Field<T> field : collection) {
            Field<T> fieldPut = this.fieldsByName.put(field.name, field);
            if (fieldPut != null) {
                throw new IllegalStateException(fieldPut + " and " + field + " cannot have the same name.");
            }
            Field<T>[] fieldArr = this.fieldsByNumber;
            int i2 = field.number;
            if (fieldArr[i2] != null) {
                throw new IllegalStateException("Fields '" + this.fieldsByNumber[field.number].name + "' " + this.fieldsByNumber[field.number] + " and '" + field.name + "' " + field + " cannot have the same number: " + field.number);
            }
            fieldArr[i2] = field;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (Field<T> field2 : this.fieldsByNumber) {
            if (field2 != null) {
                arrayList.add(field2);
            }
        }
        this.fields = Collections.unmodifiableList(arrayList);
    }

    @Override // io.protostuff.runtime.FieldMap
    public Field<T> getFieldByName(String str) {
        return this.fieldsByName.get(str);
    }

    @Override // io.protostuff.runtime.FieldMap
    public Field<T> getFieldByNumber(int i) {
        Field<T>[] fieldArr = this.fieldsByNumber;
        if (i < fieldArr.length) {
            return fieldArr[i];
        }
        return null;
    }

    @Override // io.protostuff.runtime.FieldMap
    public int getFieldCount() {
        return this.fields.size();
    }

    @Override // io.protostuff.runtime.FieldMap
    public List<Field<T>> getFields() {
        return this.fields;
    }
}
