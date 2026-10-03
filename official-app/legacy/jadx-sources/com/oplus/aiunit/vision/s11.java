package com.oplus.aiunit.vision;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes15.dex */
public interface s11 {
    /* JADX WARN: Multi-variable type inference failed */
    default void v4(Activity activity) {
        if (activity.getIntent() == null || activity.getIntent().getStringExtra("moveToBack") == null || !activity.getIntent().getStringExtra("moveToBack").equals("0")) {
            return;
        }
        if (!(activity instanceof LifecycleOwner)) {
            activity.moveTaskToBack(true);
        } else if (((LifecycleOwner) activity).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            activity.moveTaskToBack(true);
        }
    }
}
