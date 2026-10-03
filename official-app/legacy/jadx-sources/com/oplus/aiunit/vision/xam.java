package com.oplus.aiunit.vision;

import android.view.View;
import android.widget.RelativeLayout;
import com.amap.api.maps.offlinemap.OfflineMapActivity;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xam {
    public OfflineMapActivity i = null;

    public final int a(float f) {
        OfflineMapActivity offlineMapActivity = this.i;
        return offlineMapActivity != null ? (int) ((f * (offlineMapActivity.getResources().getDisplayMetrics().densityDpi / 160.0f)) + 0.5f) : (int) f;
    }

    public final void b() {
        this.i.showScr();
    }

    public abstract void c(View view);

    public final void d(OfflineMapActivity offlineMapActivity) {
        this.i = offlineMapActivity;
    }

    public abstract void e();

    public boolean f() {
        return true;
    }

    public abstract RelativeLayout g();

    public abstract void h();
}
