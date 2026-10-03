package com.oplus.aiunit.vision;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class dlm {
    public static void a(View view, int i) {
        if (view == null || view.getVisibility() == i || !b(i)) {
            return;
        }
        view.setVisibility(i);
    }

    public static boolean b(int i) {
        return i == 0 || i == 8 || i == 4;
    }
}
