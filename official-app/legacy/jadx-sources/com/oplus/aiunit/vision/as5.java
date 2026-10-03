package com.oplus.aiunit.vision;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public class as5 {
    public WeakReference<Activity> a;
    public WeakReference<LifecycleOwner> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference<View> f9478c;

    public as5(Activity activity, View view, LifecycleOwner lifecycleOwner) {
        this.a = new WeakReference<>(activity);
        this.b = new WeakReference<>(lifecycleOwner);
        this.f9478c = new WeakReference<>(view);
    }

    public void a(LifecycleObserver lifecycleObserver) {
        LifecycleOwner lifecycleOwner = this.b.get();
        StringBuilder sb = new StringBuilder();
        sb.append("addLifecycleObserver lifecycleOwner is ");
        sb.append(lifecycleOwner);
        if (lifecycleOwner != null) {
            kwa.c(lifecycleOwner.getLifecycle(), lifecycleObserver);
        }
    }

    public Activity b() {
        return this.a.get();
    }

    public View c() {
        return this.f9478c.get();
    }

    public void d(LifecycleObserver lifecycleObserver) {
        LifecycleOwner lifecycleOwner = this.b.get();
        StringBuilder sb = new StringBuilder();
        sb.append("removeLifecycleObserver lifecycleOwner is ");
        sb.append(lifecycleOwner);
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(lifecycleObserver);
        }
    }
}
