package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.oplus.aiunit.vision.a60;
import com.oplus.aiunit.vision.g60;
import com.oplus.aiunit.vision.nc3;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes13.dex */
public class VirtualAnnotatedMember extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final Class<?> _declaringClass;
    protected final String _name;
    protected final JavaType _type;

    public VirtualAnnotatedMember(i iVar, Class<?> cls, String str, JavaType javaType) {
        super(iVar, null);
        this._declaringClass = cls;
        this._type = javaType;
        this._name = str;
    }

    @Override // com.oplus.aiunit.vision.a60
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!nc3.H(obj, getClass())) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        return virtualAnnotatedMember._declaringClass == this._declaringClass && virtualAnnotatedMember._name.equals(this._name);
    }

    @Override // com.oplus.aiunit.vision.a60
    public Field getAnnotated() {
        return null;
    }

    public int getAnnotationCount() {
        return 0;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._declaringClass;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.a60
    public int getModifiers() {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.a60
    public String getName() {
        return this._name;
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
    public Object getValue(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot get virtual property '" + this._name + "'");
    }

    @Override // com.oplus.aiunit.vision.a60
    public int hashCode() {
        return this._name.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot set virtual property '" + this._name + "'");
    }

    @Override // com.oplus.aiunit.vision.a60
    public String toString() {
        return "[virtual " + getFullName() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public a60 withAnnotations(g60 g60Var) {
        return this;
    }
}
