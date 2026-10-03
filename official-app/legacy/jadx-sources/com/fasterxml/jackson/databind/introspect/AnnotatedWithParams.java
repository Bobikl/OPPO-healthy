package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.oplus.aiunit.vision.g60;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AnnotatedWithParams extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final g60[] _paramAnnotations;

    public AnnotatedWithParams(i iVar, g60 g60Var, g60[] g60VarArr) {
        super(iVar, g60Var);
        this._paramAnnotations = g60VarArr;
    }

    public final void addOrOverrideParam(int i, Annotation annotation) {
        g60 g60Var = this._paramAnnotations[i];
        if (g60Var == null) {
            g60Var = new g60();
            this._paramAnnotations[i] = g60Var;
        }
        g60Var.b(annotation);
    }

    public abstract Object call() throws Exception;

    public abstract Object call(Object[] objArr) throws Exception;

    public abstract Object call1(Object obj) throws Exception;

    public final int getAnnotationCount() {
        return this._annotations.size();
    }

    @Deprecated
    public abstract Type getGenericParameterType(int i);

    public final AnnotatedParameter getParameter(int i) {
        return new AnnotatedParameter(this, getParameterType(i), this._typeContext, getParameterAnnotations(i), i);
    }

    public final g60 getParameterAnnotations(int i) {
        g60[] g60VarArr = this._paramAnnotations;
        if (g60VarArr == null || i < 0 || i >= g60VarArr.length) {
            return null;
        }
        return g60VarArr[i];
    }

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i);

    public abstract Class<?> getRawParameterType(int i);

    public AnnotatedParameter replaceParameterAnnotations(int i, g60 g60Var) {
        this._paramAnnotations[i] = g60Var;
        return getParameter(i);
    }

    public AnnotatedWithParams(AnnotatedWithParams annotatedWithParams, g60[] g60VarArr) {
        super(annotatedWithParams);
        this._paramAnnotations = g60VarArr;
    }
}
