package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;

/* JADX INFO: loaded from: classes13.dex */
public abstract class jia {
    public static final jia a;

    static {
        jia jiaVar;
        try {
            jiaVar = (jia) nc3.l(kia.class, false);
        } catch (Throwable unused) {
            jiaVar = null;
        }
        a = jiaVar;
    }

    public static jia d() {
        return a;
    }

    public abstract PropertyName a(AnnotatedParameter annotatedParameter);

    public abstract Boolean b(a60 a60Var);

    public abstract Boolean c(a60 a60Var);
}
