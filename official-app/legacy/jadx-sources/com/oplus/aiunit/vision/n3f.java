package com.oplus.aiunit.vision;

import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class n3f implements uv9 {
    @Override // com.oplus.aiunit.vision.uv9
    public boolean a(View view) {
        return !c(view);
    }

    @Override // com.oplus.aiunit.vision.uv9
    public boolean b(View view) {
        return !d(view);
    }

    public final boolean c(View view) {
        return view.canScrollVertically(1);
    }

    public final boolean d(View view) {
        return view.canScrollVertically(-1);
    }
}
