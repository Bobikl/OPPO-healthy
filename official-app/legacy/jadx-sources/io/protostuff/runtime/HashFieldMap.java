package io.protostuff.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
final class HashFieldMap<T> implements FieldMap<T> {
    private static final FieldComparator FIELD_COMPARATOR = new FieldComparator();
    private final List<Field<T>> fields;
    private final Map<String, Field<T>> fieldsByName = new HashMap();
    private final Map<Integer, Field<T>> fieldsByNumber = new HashMap();

    public HashFieldMap(Collection<Field<T>> collection) {
        for (Field<T> field : collection) {
            if (this.fieldsByName.containsKey(field.name)) {
                throw new IllegalStateException(this.fieldsByName.get(field.name) + " and " + field + " cannot have the same name.");
            }
            if (this.fieldsByNumber.containsKey(Integer.valueOf(field.number))) {
                throw new IllegalStateException(this.fieldsByNumber.get(Integer.valueOf(field.number)) + " and " + field + " cannot have the same number.");
            }
            this.fieldsByNumber.put(Integer.valueOf(field.number), field);
            this.fieldsByName.put(field.name, field);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        Collections.sort(arrayList, FIELD_COMPARATOR);
        this.fields = Collections.unmodifiableList(arrayList);
    }

    @Override // io.protostuff.runtime.FieldMap
    public Field<T> getFieldByName(String str) {
        return this.fieldsByName.get(str);
    }

    @Override // io.protostuff.runtime.FieldMap
    public Field<T> getFieldByNumber(int i) {
        return this.fieldsByNumber.get(Integer.valueOf(i));
    }

    @Override // io.protostuff.runtime.FieldMap
    public int getFieldCount() {
        return this.fields.size();
    }

    @Override // io.protostuff.runtime.FieldMap
    public List<Field<T>> getFields() {
        return this.fields;
    }

    public static class FieldComparator implements Comparator<Field<?>> {
        private FieldComparator() {
        }

        public static int compare(int i, int i2) {
            if (i < i2) {
                return -1;
            }
            return i == i2 ? 0 : 1;
        }

        @Override // java.util.Comparator
        public int compare(Field<?> field, Field<?> field2) {
            return compare(field.number, field2.number);
        }
    }
}
