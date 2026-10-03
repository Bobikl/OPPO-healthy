package com.heytap.health.oobe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.kli;
import com.oplus.aiunit.vision.mli;

/* JADX INFO: loaded from: classes17.dex */
public abstract class Stage implements LifecycleObserver {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public kli f5108j;
    public mli k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f5109l;
    public final String i = getClass().getName();
    public Handler m = new Handler(Looper.getMainLooper());

    public Stage() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
        if (this.m != null) {
            a7b.f(this.i, "destroy() Stage");
            this.m.removeCallbacksAndMessages(this);
        }
    }

    public void g(kli kliVar) {
        this.f5108j = kliVar;
    }

    public void h() {
        if (i() != null) {
            ((Activity) i()).finish();
        }
    }

    public Context i() {
        return this.f5108j.b();
    }

    public void j(int i, int i2, @Nullable Intent intent) {
        a7b.f(this.i, "onActivityResult");
    }

    public void k() {
    }

    public boolean l(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean m(@NonNull MenuItem menuItem) {
        return false;
    }

    public void n(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void o(mli mliVar) {
        a7b.f(this.i, "onStart");
        this.k = mliVar;
        this.f5108j.a(this);
    }

    public void p() {
        a7b.f(this.i, "onStop");
        this.f5108j.d(this);
    }

    public final void q(Runnable runnable) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.m.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void r(int i, @Nullable Intent intent) {
        ((Activity) i()).setResult(i, intent);
    }

    public Stage(Bundle bundle) {
        this.f5109l = bundle;
    }
}
