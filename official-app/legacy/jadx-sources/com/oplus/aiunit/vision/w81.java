package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class w81 implements tp9 {
    public static volatile boolean stopDownload = false;
    public Context a;
    public y7a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<nz9> f18156c;

    public void e(nz9 nz9Var) {
        if (this.f18156c == null) {
            this.f18156c = new ArrayList();
        }
        if (nz9Var == null || this.f18156c.contains(nz9Var)) {
            return;
        }
        this.f18156c.add(nz9Var);
    }

    public at9 f() {
        if (g()) {
            this.b.c();
        }
        return null;
    }

    public boolean g() {
        y7a y7aVar = this.b;
        if (y7aVar == null) {
            return false;
        }
        y7aVar.c();
        return false;
    }

    public void h(Context context, y7a y7aVar) {
        this.a = context.getApplicationContext();
        rqk.v(context);
        this.f18156c = new ArrayList();
        this.b = y7aVar;
        w93.a(y7aVar, "init params can not be null");
    }
}
