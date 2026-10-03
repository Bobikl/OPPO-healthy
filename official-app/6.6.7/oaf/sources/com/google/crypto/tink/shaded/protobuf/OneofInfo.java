package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
final class OneofInfo {
    private final Field caseField;
    private final int id;
    private final Field valueField;

    public OneofInfo(int i, Field field, Field field2) {
        this.id = i;
        this.caseField = field;
        this.valueField = field2;
    }

    public Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.id;
    }

    public Field getValueField() {
        return this.valueField;
    }
}
