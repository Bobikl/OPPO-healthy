package com.oplus.aiunit.vision;

import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public interface ov9 {
    default void a(View view, boolean z) {
        if (z) {
            b(view);
        } else {
            view.setOnTouchListener(null);
        }
    }

    default void b(View view) {
        c(view, false);
    }

    default void c(View view, boolean z) {
        view.setClickable(true);
        new dkc.a().d(view).b();
    }
}
