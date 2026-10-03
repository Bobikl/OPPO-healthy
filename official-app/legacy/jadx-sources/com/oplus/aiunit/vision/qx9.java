package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.IInterface;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes2.dex */
public class qx9 {
    public final String a;
    public final Class<? extends cm9<? extends IInterface>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cm9<? extends IInterface> f15975c;

    public qx9(String str, Class<? extends cm9<? extends IInterface>> cls) {
        this.a = str;
        this.b = cls;
    }

    public final String a(String str) {
        return this.a + ": " + str;
    }

    public synchronized void b(PrintWriter printWriter, String[] strArr) {
        cm9<? extends IInterface> cm9Var;
        synchronized (this) {
            cm9Var = this.f15975c;
        }
        if (cm9Var != null) {
            cm9Var.a(printWriter, strArr);
        }
    }

    public synchronized cm9<? extends IInterface> c() {
        return this.f15975c;
    }

    public synchronized cm9<? extends IInterface> d(Context context) {
        cm9<? extends IInterface> cm9Var = this.f15975c;
        if (cm9Var != null) {
            return cm9Var;
        }
        Constructor<?> constructor = null;
        Constructor<?> constructor2 = null;
        for (Constructor<?> constructor3 : this.b.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor3.getParameterTypes();
            if (parameterTypes.length == 0) {
                constructor2 = constructor3;
            } else if (parameterTypes.length == 1 && parameterTypes[0] == Context.class) {
                constructor = constructor3;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            cm9<? extends IInterface> cm9Var2 = constructor != null ? (cm9) constructor.newInstance(context) : constructor2 != null ? (cm9) constructor2.newInstance(new Object[0]) : null;
            if (cm9Var2 == null) {
                a7b.m("IApiProvider", a("getIService: not find Constructor method"));
                return null;
            }
            a7b.f("IApiProvider", a("getIService: IApiProvider#Constructor"));
            try {
                cm9Var2.c(context);
                this.f15975c = cm9Var2;
                a7b.f("IApiProvider", a("getService: IApiProvider#onCreate delay=" + (System.currentTimeMillis() - jCurrentTimeMillis)));
            } catch (Exception e2) {
                a7b.m("IApiProvider", a("getService: IApiProvider#onCreate error " + e2));
                try {
                    cm9Var2.b(context);
                } catch (Exception e3) {
                    a7b.m("IApiProvider", a("getService: IApiProvider#onDestroy error " + e3));
                }
            }
            return this.f15975c;
        } catch (Exception e4) {
            a7b.m("IApiProvider", a("getService: IApiProvider#Constructor error " + e4));
            return null;
        }
    }

    public synchronized void e(Context context) {
        cm9<? extends IInterface> cm9Var = this.f15975c;
        if (cm9Var != null) {
            cm9Var.b(context);
        }
        this.f15975c = null;
    }

    public String toString() {
        return n04.OPEN_BRACE_REGEX + this.a + "#" + Integer.toHexString(hashCode()) + '}';
    }
}
