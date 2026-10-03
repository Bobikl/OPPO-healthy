package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public abstract class pa9 {
    public Context a;
    public boolean b = false;

    public pa9(Context context) {
        this.a = context;
    }

    public abstract int a();

    public Context b() {
        return this.a;
    }

    public abstract void c();

    public boolean d() {
        return this.b;
    }

    public abstract void e(View view);

    public void f() {
    }

    public void g(boolean z) {
    }

    public void h() {
    }

    public void i() {
    }

    public void j(boolean z) {
        this.b = z;
    }
}
