package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class c6m {
    public static final int ARRAY_INDEX_STEP = 3;
    public static final int ARRAY_LAST_STEP = 4;
    public static final int FIELD_SELECTOR_STEP = 6;
    public static final int QUALIFIER_STEP = 2;
    public static final int QUAL_SELECTOR_STEP = 5;
    public static final int SCHEMA_NODE = Integer.MIN_VALUE;
    public static final int STEP_ROOT_PROP = 1;
    public static final int STEP_SCHEMA = 0;
    public static final int STRUCT_FIELD_STEP = 1;
    public List a = new ArrayList(5);

    public void a(f6m f6mVar) {
        this.a.add(f6mVar);
    }

    public f6m b(int i) {
        return (f6m) this.a.get(i);
    }

    public int c() {
        return this.a.size();
    }

    public String toString() {
        int iB;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < c(); i++) {
            stringBuffer.append(b(i));
            if (i < c() - 1 && ((iB = b(i + 1).b()) == 1 || iB == 2)) {
                stringBuffer.append(mla.SEPARATOR);
            }
        }
        return stringBuffer.toString();
    }
}
