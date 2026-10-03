package com.oplus.aiunit.vision;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.resposiveui.config.NearUIConfig;
import com.heytap.health.base.task.ThreadUtils;

/* JADX INFO: loaded from: classes15.dex */
public interface yy0 {
    /* JADX INFO: renamed from: U3, reason: merged with bridge method [inline-methods] */
    default void C2(BaseActivity baseActivity, NearUIConfig.Status status) {
        a7b.f("BaseActivityOrientation", "current ui config status:" + status);
        int i = 1;
        if (status == NearUIConfig.Status.FOLD) {
            int i2 = baseActivity.getResources().getConfiguration().orientation;
            if (r2()) {
                if (!BaseActivity.isExpanded && i2 == 1) {
                    return;
                }
            } else if (!z0()) {
                i = -1;
            } else if (!BaseActivity.isExpanded && i2 == 2) {
                return;
            } else {
                i = 0;
            }
        } else {
            BaseActivity.isExpanded = true;
            i = 13;
        }
        a7b.f("BaseActivityOrientation", "current orientation:" + baseActivity.getRequestedOrientation() + ", request orientation:" + i);
        if (baseActivity.getRequestedOrientation() != i) {
            baseActivity.setRequestedOrientation(i);
        }
    }

    default boolean r2() {
        return true;
    }

    default void r5(final BaseActivity baseActivity) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            j3(baseActivity);
        } else {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.wy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.j3(baseActivity);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    default void j3(final BaseActivity baseActivity) {
        com.heytap.health.base.resposiveui.config.a.m(baseActivity).q().observe(baseActivity, new Observer() { // from class: com.oplus.aiunit.vision.xy0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.C2(baseActivity, (NearUIConfig.Status) obj);
            }
        });
    }

    default boolean z0() {
        return false;
    }
}
