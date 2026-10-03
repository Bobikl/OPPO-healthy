package com.oplus.aiunit.vision;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.heytap.health.base.base.BaseActivity;

/* JADX INFO: loaded from: classes15.dex */
public interface vy0 {
    default Resources F0(Resources resources, BaseActivity baseActivity) {
        if (resources != null && m3()) {
            Configuration configuration = resources.getConfiguration();
            if (d95.e(resources.getDisplayMetrics().widthPixels, configuration, baseActivity, d95.b())) {
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        }
        return resources;
    }

    default boolean m3() {
        return true;
    }

    default void z1(BaseActivity baseActivity) {
        if (m3()) {
            d95.a(baseActivity);
        }
    }
}
