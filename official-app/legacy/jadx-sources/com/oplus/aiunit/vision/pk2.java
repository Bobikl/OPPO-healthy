package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class pk2 {
    public static void a(View view, int i) {
        if (view == null) {
            return;
        }
        fj2 fj2Var = new fj2(view.getContext());
        fj2Var.u(i);
        view.setBackground(new hm2(new Drawable[]{fj2Var}));
        ph2.c(view, false);
    }

    public static void b(View view, int i, boolean z) {
        if (view == null) {
            return;
        }
        view.setBackground(new ik2(view.getContext(), i, z));
    }
}
