package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

/* JADX INFO: loaded from: classes13.dex */
public final class ae4 {
    public final AnnotationIntrospector a;
    public final AnnotatedWithParams b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9307c;
    public final a[] d;

    public static final class a {
        public final AnnotatedParameter a;
        public final rc1 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JacksonInject.Value f9308c;

        public a(AnnotatedParameter annotatedParameter, rc1 rc1Var, JacksonInject.Value value) {
            this.a = annotatedParameter;
            this.b = rc1Var;
            this.f9308c = value;
        }
    }

    public ae4(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, a[] aVarArr, int i) {
        this.a = annotationIntrospector;
        this.b = annotatedWithParams;
        this.d = aVarArr;
        this.f9307c = i;
    }

    public static ae4 a(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, rc1[] rc1VarArr) {
        int parameterCount = annotatedWithParams.getParameterCount();
        a[] aVarArr = new a[parameterCount];
        for (int i = 0; i < parameterCount; i++) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i);
            aVarArr[i] = new a(parameter, rc1VarArr == null ? null : rc1VarArr[i], annotationIntrospector.findInjectableValue(parameter));
        }
        return new ae4(annotationIntrospector, annotatedWithParams, aVarArr, parameterCount);
    }

    public AnnotatedWithParams b() {
        return this.b;
    }

    public PropertyName c(int i) {
        rc1 rc1Var = this.d[i].b;
        if (rc1Var == null || !rc1Var.Q()) {
            return null;
        }
        return rc1Var.getFullName();
    }

    public PropertyName d(int i) {
        String strFindImplicitPropertyName = this.a.findImplicitPropertyName(this.d[i].a);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(strFindImplicitPropertyName);
    }

    public int e() {
        int i = -1;
        for (int i2 = 0; i2 < this.f9307c; i2++) {
            if (this.d[i2].f9308c == null) {
                if (i >= 0) {
                    return -1;
                }
                i = i2;
            }
        }
        return i;
    }

    public JacksonInject.Value f(int i) {
        return this.d[i].f9308c;
    }

    public int g() {
        return this.f9307c;
    }

    public PropertyName h(int i) {
        rc1 rc1Var = this.d[i].b;
        if (rc1Var != null) {
            return rc1Var.getFullName();
        }
        return null;
    }

    public AnnotatedParameter i(int i) {
        return this.d[i].a;
    }

    public rc1 j(int i) {
        return this.d[i].b;
    }

    public String toString() {
        return this.b.toString();
    }
}
