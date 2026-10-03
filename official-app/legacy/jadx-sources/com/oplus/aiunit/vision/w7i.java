package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class w7i {
    public static a a;

    public interface a {
        void a(String str, String str2, Object... objArr);

        void b(String str, Throwable th, String str2, Object... objArr);

        void c(String str, String str2, Object... objArr);

        void d(String str, String str2, Object... objArr);

        void e(String str, String str2, Throwable th);

        void e(String str, String str2, Object... objArr);

        void w(String str, String str2, Throwable th);
    }

    public static void a(String str, String str2, Object... objArr) {
        a aVar = a;
        if (aVar != null) {
            aVar.c(hpm.a + str, str2, objArr);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        a aVar = a;
        if (aVar != null) {
            aVar.e(hpm.a + str, str2, th);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        a aVar = a;
        if (aVar != null) {
            aVar.d(hpm.a + str, str2, objArr);
        }
    }

    public static String d(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.getClass().getSimpleName() + "@0x" + Long.toHexString(obj.hashCode());
    }

    public static void e(String str, String str2, Object... objArr) {
        a aVar = a;
        if (aVar != null) {
            aVar.a(hpm.a + str, str2, objArr);
        }
    }

    public static void f(String str, Throwable th, String str2, Object... objArr) {
        a aVar = a;
        if (aVar != null) {
            aVar.b(str, th, str2, objArr);
        }
    }

    public static void g(a aVar) {
        a = aVar;
    }

    public static void h(String str, String str2, Throwable th) {
        a aVar = a;
        if (aVar != null) {
            aVar.w(hpm.a + str, str2, th);
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        a aVar = a;
        if (aVar != null) {
            aVar.e(hpm.a + str, str2, objArr);
        }
    }
}
