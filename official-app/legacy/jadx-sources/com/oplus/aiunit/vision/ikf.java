package com.oplus.aiunit.vision;

import com.heytap.health.base.reflect.ReflectException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class ikf {
    public final Object a;
    public final boolean b = true;

    public static class a {
    }

    public ikf(Class<?> cls) {
        this.a = cls;
    }

    public static <T extends AccessibleObject> T a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public static Class<?> i(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            throw new ReflectException(e2);
        }
    }

    public static ikf n(Class<?> cls) {
        return new ikf(cls);
    }

    public static ikf o(Object obj) {
        return new ikf(obj);
    }

    public static ikf p(String str) throws ReflectException {
        return n(i(str));
    }

    public static ikf q(Constructor<?> constructor, Object... objArr) throws ReflectException {
        try {
            return o(((Constructor) a(constructor)).newInstance(objArr));
        } catch (Exception e2) {
            throw new ReflectException(e2);
        }
    }

    public static ikf r(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            a(method);
            if (method.getReturnType() != Void.TYPE) {
                return o(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return o(obj);
        } catch (Exception e2) {
            throw new ReflectException(e2);
        }
    }

    public static Class<?>[] u(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? a.class : obj.getClass();
        }
        return clsArr;
    }

    public static Class<?> v(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (!cls.isPrimitive()) {
            return cls;
        }
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        return Void.TYPE == cls ? Void.class : cls;
    }

    public ikf b(String str) throws ReflectException {
        return c(str, new Object[0]);
    }

    public ikf c(String str, Object... objArr) throws ReflectException {
        Class<?>[] clsArrU = u(objArr);
        try {
            try {
                return r(f(str, clsArrU), this.a, objArr);
            } catch (NoSuchMethodException e2) {
                throw new ReflectException(e2);
            }
        } catch (NoSuchMethodException unused) {
            return r(s(str, clsArrU), this.a, objArr);
        }
    }

    public ikf d() throws ReflectException {
        return e(new Object[0]);
    }

    public ikf e(Object... objArr) throws ReflectException {
        Class<?>[] clsArrU = u(objArr);
        try {
            return q(t().getDeclaredConstructor(clsArrU), objArr);
        } catch (NoSuchMethodException e2) {
            for (Constructor<?> constructor : t().getDeclaredConstructors()) {
                if (m(constructor.getParameterTypes(), clsArrU)) {
                    return q(constructor, objArr);
                }
            }
            throw new ReflectException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof ikf) {
            return this.a.equals(((ikf) obj).j());
        }
        return false;
    }

    public final Method f(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsT = t();
        try {
            return clsT.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return clsT.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    clsT = clsT.getSuperclass();
                }
            } while (clsT != null);
            throw new NoSuchMethodException();
        }
    }

    public ikf g(String str) throws ReflectException {
        try {
            return o(h(str).get(this.a));
        } catch (Exception e2) {
            throw new ReflectException(e2);
        }
    }

    public final Field h(String str) throws ReflectException {
        Class<?> clsT = t();
        try {
            return (Field) a(clsT.getField(str));
        } catch (NoSuchFieldException e2) {
            do {
                try {
                    return (Field) a(clsT.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    clsT = clsT.getSuperclass();
                    if (clsT == null) {
                        throw new ReflectException(e2);
                    }
                }
            } while (clsT == null);
            throw new ReflectException(e2);
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public <T> T j() {
        return (T) this.a;
    }

    public <T> T k(String str) throws ReflectException {
        return (T) g(str).j();
    }

    public final boolean l(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && m(method.getParameterTypes(), clsArr);
    }

    public final boolean m(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != a.class && !v(clsArr[i]).isAssignableFrom(v(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    public final Method s(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsT = t();
        for (Method method : clsT.getMethods()) {
            if (l(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : clsT.getDeclaredMethods()) {
                if (l(method2, str, clsArr)) {
                    return method2;
                }
            }
            clsT = clsT.getSuperclass();
        } while (clsT != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + t() + ".");
    }

    public Class<?> t() {
        return this.b ? (Class) this.a : this.a.getClass();
    }

    public String toString() {
        return this.a.toString();
    }

    public ikf(Object obj) {
        this.a = obj;
    }
}
