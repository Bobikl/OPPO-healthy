package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class bbd {
    public static final od1<Object, Object> a = new a();

    public static final class a implements od1<Object, Object> {
        @Override // com.oplus.aiunit.vision.od1
        public boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    public static int a(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
