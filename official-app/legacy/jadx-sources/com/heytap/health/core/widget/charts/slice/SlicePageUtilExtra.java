package com.heytap.health.core.widget.charts.slice;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.fhd;

/* JADX INFO: loaded from: classes16.dex */
public class SlicePageUtilExtra implements LifecycleEventObserver {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f3838j = "SlicePageUtilExtra";
    public LifecycleOwner i;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        LifecycleOwner lifecycleOwner2 = this.i;
        if (lifecycleOwner2 != null && lifecycleOwner2.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            a7b.f(f3838j, "onStateChanged DESTROYED");
            throw null;
        }
    }

    public void setListener(fhd fhdVar) {
    }
}
