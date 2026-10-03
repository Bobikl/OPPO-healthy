package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.oplus.aiunit.vision.g60;
import com.oplus.aiunit.vision.nc3;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes13.dex */
public final class AnnotatedField extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final transient Field _field;
    protected Serialization _serialization;

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?> clazz;
        protected String name;

        public Serialization(Field field) {
            this.clazz = field.getDeclaringClass();
            this.name = field.getName();
        }
    }

    public AnnotatedField(i iVar, Field field, g60 g60Var) {
        super(iVar, g60Var);
        this._field = field;
    }

    @Override // com.oplus.aiunit.vision.a60
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!nc3.H(obj, AnnotatedField.class)) {
            return false;
        }
        Field field = ((AnnotatedField) obj)._field;
        if (field == null) {
            return this._field == null;
        }
        return field.equals(this._field);
    }

    public int getAnnotationCount() {
        return this._annotations.size();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._field.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._field;
    }

    @Override // com.oplus.aiunit.vision.a60
    public int getModifiers() {
        return this._field.getModifiers();
    }

    @Override // com.oplus.aiunit.vision.a60
    public String getName() {
        return this._field.getName();
    }

    @Override // com.oplus.aiunit.vision.a60
    public Class<?> getRawType() {
        return this._field.getType();
    }

    @Override // com.oplus.aiunit.vision.a60
    public JavaType getType() {
        return this._typeContext.a(this._field.getGenericType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._field.get(obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Failed to getValue() for field " + getFullName() + ": " + e2.getMessage(), e2);
        }
    }

    @Override // com.oplus.aiunit.vision.a60
    public int hashCode() {
        return this._field.getName().hashCode();
    }

    public boolean isTransient() {
        return Modifier.isTransient(getModifiers());
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Field declaredField = cls.getDeclaredField(serialization.name);
            if (!declaredField.isAccessible()) {
                nc3.g(declaredField, false);
            }
            return new AnnotatedField(null, declaredField, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.name + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._field.set(obj, obj2);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Failed to setValue() for field " + getFullName() + ": " + e2.getMessage(), e2);
        }
    }

    @Override // com.oplus.aiunit.vision.a60
    public String toString() {
        return "[field " + getFullName() + "]";
    }

    public Object writeReplace() {
        return new AnnotatedField(new Serialization(this._field));
    }

    @Override // com.oplus.aiunit.vision.a60
    public Field getAnnotated() {
        return this._field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedField withAnnotations(g60 g60Var) {
        return new AnnotatedField(this._typeContext, this._field, g60Var);
    }

    public AnnotatedField(Serialization serialization) {
        super(null, null);
        this._field = null;
        this._serialization = serialization;
    }
}
