package io.protostuff.runtime;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
interface FieldMap<T> {
    Field<T> getFieldByName(String str);

    Field<T> getFieldByNumber(int i);

    int getFieldCount();

    List<Field<T>> getFields();
}
