package com.oplus.aiunit.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes10.dex */
public final class q9m {
    public static final Unsafe a = f();
    public static final boolean b = h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f15694c = g();
    public static final long d = b();

    public static class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    static {
        Field declaredField;
        try {
            declaredField = Buffer.class.getDeclaredField("address");
            declaredField.setAccessible(true);
        } catch (Throwable unused) {
            declaredField = null;
        }
        c(declaredField);
    }

    public static byte a(byte[] bArr, long j2) {
        return a.getByte(bArr, j2);
    }

    public static int b() {
        if (f15694c) {
            return a.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    public static void c(Field field) {
        Unsafe unsafe;
        if (field == null || (unsafe = a) == null) {
            return;
        }
        unsafe.objectFieldOffset(field);
    }

    public static void d(byte[] bArr, long j2, byte b2) {
        a.putByte(bArr, j2, b2);
    }

    public static long e(byte[] bArr, long j2) {
        return a.getLong(bArr, j2);
    }

    public static Unsafe f() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        Unsafe unsafe = a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("arrayBaseOffset", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean h() {
        Unsafe unsafe = a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", cls2);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
