package com.heytap.health.dialog;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.heytap.health.main.MainActivity;
import com.heytap.health.main.a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.as5;
import com.oplus.aiunit.vision.cs5;
import com.oplus.aiunit.vision.op;

/* JADX INFO: loaded from: classes16.dex */
public abstract class DialogSection implements LifecycleObserver {
    public as5 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public cs5 f4118n;
    public DialogSection p;
    public boolean q;
    public final String i = getClass().getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4116j = -1;
    public final int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4117l = 1;
    public int o = -1;

    public void b(as5 as5Var) {
        this.m = as5Var;
    }

    public void c() {
        this.q = true;
    }

    public Activity d() {
        as5 as5Var = this.m;
        return as5Var == null ? op.n().p() : as5Var.b();
    }

    public View e() {
        return this.m.c();
    }

    public boolean f() {
        return this.q;
    }

    public boolean g() {
        Activity activityD = d();
        return activityD != null && activityD.getClass().getSimpleName().equals("MainActivity") && ((MainActivity) activityD).J7() == a.c();
    }

    public void h(int i, int i2, @Nullable Intent intent) {
    }

    public void i(boolean z) {
    }

    public void j(cs5 cs5Var) {
        a7b.f(this.i, "onStart");
        this.f4118n = cs5Var;
        this.m.a(this);
    }

    public void k(DialogSection dialogSection) {
        if (dialogSection != null) {
            this.p = dialogSection;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onActivityDestroy() {
        this.m.d(this);
    }
}
