package com.oplus.aiunit.vision;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public class a3j {
    public final Method a;
    public final ThreadMode b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f9177c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9178e;
    public String f;

    public a3j(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.a = method;
        this.b = threadMode;
        this.f9177c = cls;
        this.d = i;
        this.f9178e = z;
    }

    public final synchronized void a() {
        if (this.f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.a.getName());
            sb.append('(');
            sb.append(this.f9177c.getName());
            this.f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a3j)) {
            return false;
        }
        a();
        a3j a3jVar = (a3j) obj;
        a3jVar.a();
        return this.f.equals(a3jVar.f);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
