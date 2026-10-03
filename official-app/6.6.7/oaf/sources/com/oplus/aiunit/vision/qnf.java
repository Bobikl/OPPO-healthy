package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001J*\u0010\u000e\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001J \u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001J$\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001J\u0016\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/qnf;", "", "T", "Ljava/lang/Class;", "clazz", "e", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "className", "fieldName", "obj", "value", "", "g", "f", "d", "c", "a", "Ljava/lang/reflect/Field;", "b", "Ljava/lang/Object;", "REFLECT_LOCK", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "sClassMap", "sFiledMap", "Ljava/lang/reflect/Method;", "sMethodMap", "Ljava/lang/reflect/Constructor;", "sConstructorMap", "<init>", "()V", "lib_utils_release"}, k = 1, mv = {1, 4, 0})
public final class qnf {
    public static final qnf INSTANCE = new qnf();
    public static final Object a = new Object();
    public static final HashMap<String, Class<?>> b = new HashMap<>();
    public static final HashMap<String, Field> c = new HashMap<>();
    public static final HashMap<String, Method> d = new HashMap<>();
    public static final HashMap<String, Constructor<?>> e = new HashMap<>();

    public final Class<?> a(String className) throws ClassNotFoundException, IllegalArgumentException {
        if (TextUtils.isEmpty(className)) {
            throw new IllegalArgumentException("class name is empty when get class, not allowed!");
        }
        HashMap<String, Class<?>> map = b;
        Class<?> cls = map.get(className);
        if (cls != null) {
            return cls;
        }
        synchronized (a) {
            Class<?> cls2 = map.get(className);
            if (cls2 != null) {
                return cls2;
            }
            Class<?> cls3 = Class.forName(className);
            map.put(className, cls3);
            return cls3;
        }
    }

    public final Field b(String className, String fieldName) throws NoSuchFieldException, ClassNotFoundException, IllegalArgumentException {
        if (TextUtils.isEmpty(className) || TextUtils.isEmpty(fieldName)) {
            throw new IllegalArgumentException("class name or field name is empty when get field, not allowed!");
        }
        String str = className + fieldName;
        HashMap<String, Field> map = c;
        Field field = map.get(str);
        if (field != null) {
            return field;
        }
        synchronized (a) {
            Field field2 = map.get(str);
            if (field2 != null) {
                return field2;
            }
            Class<?> clsA = INSTANCE.a(className);
            Field declaredField = clsA != null ? clsA.getDeclaredField(fieldName) : null;
            if (declaredField != null) {
                declaredField.setAccessible(true);
                map.put(str, declaredField);
            }
            Unit unit = Unit.INSTANCE;
            return declaredField;
        }
    }

    @Nullable
    public final Object c(@NotNull Class<?> clazz, @NotNull String fieldName, @NotNull Object obj) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        Intrinsics.checkParameterIsNotNull(fieldName, "fieldName");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        String name = clazz.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "clazz.name");
        return d(name, fieldName, obj);
    }

    @Nullable
    public final Object d(@NotNull String className, @NotNull String fieldName, @NotNull Object obj) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Intrinsics.checkParameterIsNotNull(className, "className");
        Intrinsics.checkParameterIsNotNull(fieldName, "fieldName");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        Field fieldB = b(className, fieldName);
        if (fieldB != null) {
            return fieldB.get(obj);
        }
        return null;
    }

    @Nullable
    public final <T> T e(@Nullable Class<T> clazz) throws IllegalAccessException, InstantiationException {
        if (clazz != null) {
            return clazz.newInstance();
        }
        return null;
    }

    public final void f(@NotNull Class<?> clazz, @NotNull String fieldName, @NotNull Object obj, @NotNull Object value) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        Intrinsics.checkParameterIsNotNull(fieldName, "fieldName");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        Intrinsics.checkParameterIsNotNull(value, "value");
        String name = clazz.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "clazz.name");
        g(name, fieldName, obj, value);
    }

    public final void g(@NotNull String className, @NotNull String fieldName, @NotNull Object obj, @NotNull Object value) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Intrinsics.checkParameterIsNotNull(className, "className");
        Intrinsics.checkParameterIsNotNull(fieldName, "fieldName");
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        Intrinsics.checkParameterIsNotNull(value, "value");
        Field fieldB = b(className, fieldName);
        if (fieldB != null) {
            fieldB.set(obj, value);
        }
    }
}
