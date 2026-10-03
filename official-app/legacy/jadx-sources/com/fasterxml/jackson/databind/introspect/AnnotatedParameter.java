package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.oplus.aiunit.vision.g60;
import com.oplus.aiunit.vision.nc3;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public final class AnnotatedParameter extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final int _index;
    protected final AnnotatedWithParams _owner;
    protected final JavaType _type;

    public AnnotatedParameter(AnnotatedWithParams annotatedWithParams, JavaType javaType, i iVar, g60 g60Var, int i) {
        super(iVar, g60Var);
        this._owner = annotatedWithParams;
        this._type = javaType;
        this._index = i;
    }

    @Override // com.oplus.aiunit.vision.a60
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!nc3.H(obj, AnnotatedParameter.class)) {
            return false;
        }
        AnnotatedParameter annotatedParameter = (AnnotatedParameter) obj;
        return annotatedParameter._owner.equals(this._owner) && annotatedParameter._index == this._index;
    }

    @Override // com.oplus.aiunit.vision.a60
    public AnnotatedElement getAnnotated() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._owner.getDeclaringClass();
    }

    public int getIndex() {
        return this._index;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._owner.getMember();
    }

    @Override // com.oplus.aiunit.vision.a60
    public int getModifiers() {
        return this._owner.getModifiers();
    }

    @Override // com.oplus.aiunit.vision.a60
    public String getName() {
        return "";
    }

    public AnnotatedWithParams getOwner() {
        return this._owner;
    }

    public Type getParameterType() {
        return this._type;
    }

    @Override // com.oplus.aiunit.vision.a60
    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    @Override // com.oplus.aiunit.vision.a60
    public JavaType getType() {
        return this._type;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    @Override // com.oplus.aiunit.vision.a60
    public int hashCode() {
        return this._owner.hashCode() + this._index;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + getDeclaringClass().getName());
    }

    @Override // com.oplus.aiunit.vision.a60
    public String toString() {
        return "[parameter #" + getIndex() + ", annotations: " + this._annotations + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedParameter withAnnotations(g60 g60Var) {
        return g60Var == this._annotations ? this : this._owner.replaceParameterAnnotations(this._index, g60Var);
    }
}
