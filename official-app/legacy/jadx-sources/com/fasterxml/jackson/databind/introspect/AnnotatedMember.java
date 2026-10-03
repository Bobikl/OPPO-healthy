package com.fasterxml.jackson.databind.introspect;

import com.oplus.aiunit.vision.a60;
import com.oplus.aiunit.vision.g60;
import com.oplus.aiunit.vision.nc3;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AnnotatedMember extends a60 implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient g60 _annotations;
    protected final transient i _typeContext;

    public AnnotatedMember(i iVar, g60 g60Var) {
        this._typeContext = iVar;
        this._annotations = g60Var;
    }

    @Override // com.oplus.aiunit.vision.a60
    @Deprecated
    public Iterable<Annotation> annotations() {
        g60 g60Var = this._annotations;
        return g60Var == null ? Collections.emptyList() : g60Var.c();
    }

    public final void fixAccess(boolean z) {
        Member member = getMember();
        if (member != null) {
            nc3.g(member, z);
        }
    }

    public g60 getAllAnnotations() {
        return this._annotations;
    }

    @Override // com.oplus.aiunit.vision.a60
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        g60 g60Var = this._annotations;
        if (g60Var == null) {
            return null;
        }
        return (A) g60Var.get(cls);
    }

    public abstract Class<?> getDeclaringClass();

    public String getFullName() {
        return getDeclaringClass().getName() + "#" + getName();
    }

    public abstract Member getMember();

    @Deprecated
    public i getTypeContext() {
        return this._typeContext;
    }

    public abstract Object getValue(Object obj) throws UnsupportedOperationException, IllegalArgumentException;

    @Override // com.oplus.aiunit.vision.a60
    public final boolean hasAnnotation(Class<?> cls) {
        g60 g60Var = this._annotations;
        if (g60Var == null) {
            return false;
        }
        return g60Var.has(cls);
    }

    @Override // com.oplus.aiunit.vision.a60
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        g60 g60Var = this._annotations;
        if (g60Var == null) {
            return false;
        }
        return g60Var.hasOneOf(clsArr);
    }

    public abstract void setValue(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract a60 withAnnotations(g60 g60Var);

    public AnnotatedMember(AnnotatedMember annotatedMember) {
        this._typeContext = annotatedMember._typeContext;
        this._annotations = annotatedMember._annotations;
    }
}
