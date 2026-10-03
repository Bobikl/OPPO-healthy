package com.oplus.aiunit.vision;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class ltm {
    public boolean a = false;
    public ArrayList<a> b = new ArrayList<>();

    public static class a {
        public String a;
        public Object b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?>[] f13831c;
        public Object[] d;

        public a(Object obj, String str, Object... objArr) {
            this.b = obj;
            this.a = str;
            if (objArr == null || objArr.length <= 0) {
                return;
            }
            this.f13831c = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                this.f13831c[i] = objArr[i].getClass();
            }
            this.d = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                this.d[i2] = objArr[i2];
            }
        }
    }

    public final synchronized void a() {
        Method declaredMethod;
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            for (int i = 0; i < this.b.size(); i++) {
                a aVar = this.b.get(i);
                try {
                    try {
                        try {
                            if (aVar.b != null) {
                                Class<?> cls = aVar.b.getClass();
                                try {
                                    declaredMethod = cls.getDeclaredMethod(aVar.a, aVar.f13831c);
                                } catch (NoSuchMethodException unused) {
                                    if (aVar.f13831c.length > 0) {
                                        Class<?>[] clsArr = new Class[aVar.f13831c.length];
                                        for (int i2 = 0; i2 < aVar.f13831c.length; i2++) {
                                            if (aVar.f13831c[i2].getInterfaces().length > 0) {
                                                clsArr[i2] = aVar.f13831c[i2].getInterfaces()[0];
                                            }
                                        }
                                        declaredMethod = cls.getDeclaredMethod(aVar.a, clsArr);
                                    } else {
                                        declaredMethod = null;
                                    }
                                }
                                if (declaredMethod != null) {
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(aVar.b, aVar.d);
                                }
                            }
                        } catch (NoSuchMethodException e2) {
                            e2.printStackTrace();
                        }
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    } catch (SecurityException e4) {
                        e4.printStackTrace();
                    }
                } catch (IllegalArgumentException e5) {
                    e5.printStackTrace();
                } catch (InvocationTargetException e6) {
                    e6.printStackTrace();
                }
            }
            this.b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Object obj, Object... objArr) {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 3) {
                this.b.add(new a(obj, stackTrace[3].getMethodName(), objArr));
            }
        } catch (Throwable unused) {
        }
        this.a = false;
    }
}
