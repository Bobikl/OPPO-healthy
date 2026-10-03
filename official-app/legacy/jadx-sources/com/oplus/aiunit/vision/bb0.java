package com.oplus.aiunit.vision;

import android.app.Application;

/* JADX INFO: loaded from: classes15.dex */
public class bb0 {
    public final f8a a;
    public final g8a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p90 f9662c;

    public bb0(Application application) {
        p90 p90VarA = p90.a(application);
        this.f9662c = p90VarA;
        cb0 cb0Var = new cb0(application, p90VarA);
        this.b = cb0Var;
        f8a f8aVar = new f8a(cb0Var, p90VarA);
        this.a = f8aVar;
        f8aVar.f(application);
    }

    public static bb0 a(Application application) {
        return new bb0(application);
    }

    public void b() {
        this.a.g();
    }
}
