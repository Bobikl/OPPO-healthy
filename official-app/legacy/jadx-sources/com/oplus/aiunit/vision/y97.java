package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.reflect.ReflectionException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public final class y97 {
    public final Field a;

    public y97(Field field) {
        this.a = field;
    }

    public Object a(Object obj) throws ReflectionException {
        try {
            return this.a.get(obj);
        } catch (IllegalAccessException e2) {
            throw new ReflectionException("Illegal access to field: " + d(), e2);
        } catch (IllegalArgumentException e3) {
            throw new ReflectionException("Object is not an instance of " + b(), e3);
        }
    }

    public Class b() {
        return this.a.getDeclaringClass();
    }

    public Class c(int i) {
        Type genericType = this.a.getGenericType();
        if (!(genericType instanceof ParameterizedType)) {
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
        if (actualTypeArguments.length - 1 < i) {
            return null;
        }
        Type type = actualTypeArguments[i];
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (!(type instanceof GenericArrayType)) {
            return null;
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        if (genericComponentType instanceof Class) {
            return dh0.a((Class) genericComponentType, 0).getClass();
        }
        return null;
    }

    public String d() {
        return this.a.getName();
    }

    public Class e() {
        return this.a.getType();
    }

    public boolean f() {
        return this.a.isAccessible();
    }

    public boolean g(Class<? extends Annotation> cls) {
        return this.a.isAnnotationPresent(cls);
    }

    public boolean h() {
        return Modifier.isStatic(this.a.getModifiers());
    }

    public boolean i() {
        return this.a.isSynthetic();
    }

    public boolean j() {
        return Modifier.isTransient(this.a.getModifiers());
    }

    public void k(Object obj, Object obj2) throws ReflectionException {
        try {
            this.a.set(obj, obj2);
        } catch (IllegalAccessException e2) {
            throw new ReflectionException("Illegal access to field: " + d(), e2);
        } catch (IllegalArgumentException e3) {
            throw new ReflectionException("Argument not valid for field: " + d(), e3);
        }
    }

    public void l(boolean z) {
        this.a.setAccessible(z);
    }
}
