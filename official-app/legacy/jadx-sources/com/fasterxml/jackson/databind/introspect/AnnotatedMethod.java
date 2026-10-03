package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.oplus.aiunit.vision.g60;
import com.oplus.aiunit.vision.nc3;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public final class AnnotatedMethod extends AnnotatedWithParams {
    private static final long serialVersionUID = 1;
    protected final transient Method _method;
    protected Class<?>[] _paramClasses;
    protected Serialization _serialization;

    public static final class Serialization implements Serializable {
        private static final long serialVersionUID = 1;
        protected Class<?>[] args;
        protected Class<?> clazz;
        protected String name;

        public Serialization(Method method) {
            this.clazz = method.getDeclaringClass();
            this.name = method.getName();
            this.args = method.getParameterTypes();
        }
    }

    public AnnotatedMethod(i iVar, Method method, g60 g60Var, g60[] g60VarArr) {
        super(iVar, g60Var, g60VarArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this._method = method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._method.invoke(null, new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._method.invoke(null, obj);
    }

    public final Object callOn(Object obj) throws Exception {
        return this._method.invoke(obj, null);
    }

    public final Object callOnWith(Object obj, Object... objArr) throws Exception {
        return this._method.invoke(obj, objArr);
    }

    @Override // com.oplus.aiunit.vision.a60
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!nc3.H(obj, AnnotatedMethod.class)) {
            return false;
        }
        Method method = ((AnnotatedMethod) obj)._method;
        if (method == null) {
            return this._method == null;
        }
        return method.equals(this._method);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._method.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public String getFullName() {
        String fullName = super.getFullName();
        int parameterCount = getParameterCount();
        if (parameterCount == 0) {
            return fullName + "()";
        }
        if (parameterCount != 1) {
            return String.format("%s(%d params)", super.getFullName(), Integer.valueOf(getParameterCount()));
        }
        return fullName + "(" + getRawParameterType(0).getName() + ")";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    @Deprecated
    public Type getGenericParameterType(int i) {
        Type[] genericParameterTypes = getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i];
    }

    @Deprecated
    public Type[] getGenericParameterTypes() {
        return this._method.getGenericParameterTypes();
    }

    @Override // com.oplus.aiunit.vision.a60
    public int getModifiers() {
        return this._method.getModifiers();
    }

    @Override // com.oplus.aiunit.vision.a60
    public String getName() {
        return this._method.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return getRawParameterTypes().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i) {
        Type[] genericParameterTypes = this._method.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.a(genericParameterTypes[i]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i) {
        Class<?>[] rawParameterTypes = getRawParameterTypes();
        if (i >= rawParameterTypes.length) {
            return null;
        }
        return rawParameterTypes[i];
    }

    public Class<?>[] getRawParameterTypes() {
        if (this._paramClasses == null) {
            this._paramClasses = this._method.getParameterTypes();
        }
        return this._paramClasses;
    }

    public Class<?> getRawReturnType() {
        return this._method.getReturnType();
    }

    @Override // com.oplus.aiunit.vision.a60
    public Class<?> getRawType() {
        return this._method.getReturnType();
    }

    @Override // com.oplus.aiunit.vision.a60
    public JavaType getType() {
        return this._typeContext.a(this._method.getGenericReturnType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        try {
            return this._method.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new IllegalArgumentException("Failed to getValue() with method " + getFullName() + ": " + nc3.o(e2), e2);
        }
    }

    @Deprecated
    public boolean hasReturnType() {
        return getRawReturnType() != Void.TYPE;
    }

    @Override // com.oplus.aiunit.vision.a60
    public int hashCode() {
        return this._method.getName().hashCode();
    }

    public Object readResolve() {
        Serialization serialization = this._serialization;
        Class<?> cls = serialization.clazz;
        try {
            Method declaredMethod = cls.getDeclaredMethod(serialization.name, serialization.args);
            if (!declaredMethod.isAccessible()) {
                nc3.g(declaredMethod, false);
            }
            return new AnnotatedMethod(null, declaredMethod, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this._serialization.name + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this._method.invoke(obj, obj2);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new IllegalArgumentException("Failed to setValue() with method " + getFullName() + ": " + nc3.o(e2), e2);
        }
    }

    @Override // com.oplus.aiunit.vision.a60
    public String toString() {
        return "[method " + getFullName() + "]";
    }

    public Object writeReplace() {
        return new AnnotatedMethod(new Serialization(this._method));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._method.invoke(null, objArr);
    }

    @Override // com.oplus.aiunit.vision.a60
    public Method getAnnotated() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Method getMember() {
        return this._method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedMethod withAnnotations(g60 g60Var) {
        return new AnnotatedMethod(this._typeContext, this._method, g60Var, this._paramAnnotations);
    }

    public AnnotatedMethod(Serialization serialization) {
        super(null, null, null);
        this._method = null;
        this._serialization = serialization;
    }
}
