package com.heytap.health.core.widget.charts.utils;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.oplus.aiunit.vision.a7b;

/* JADX INFO: loaded from: classes16.dex */
public class SlicePageUtil implements LifecycleEventObserver {
    public static final long CHART_DETAILS_SLEEP_START_TIME = 1546257600000L;
    public static final long CHART_DETAILS_START_TIME = 1546272000000L;
    public static String k = "SlicePageUtil";
    public BarLineChartBase i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LifecycleOwner f3839j;

    public interface a {
    }

    public final void a() {
        this.i = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        LifecycleOwner lifecycleOwner2 = this.f3839j;
        if (lifecycleOwner2 != null && lifecycleOwner2.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            a7b.f(k, "onStateChanged DESTROYED");
            a();
        }
    }

    public void setListener(a aVar) {
    }
}
