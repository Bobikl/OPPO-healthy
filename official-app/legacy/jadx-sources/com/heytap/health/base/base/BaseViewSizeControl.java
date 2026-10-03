package com.heytap.health.base.base;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.oplus.aiunit.vision.y0l;

/* JADX INFO: loaded from: classes15.dex */
public interface BaseViewSizeControl extends LifecycleOwner {
    default boolean F5() {
        return true;
    }

    default void handleContentView(View view) {
        if (F5()) {
            y0l.d(this, view);
        }
    }
}
