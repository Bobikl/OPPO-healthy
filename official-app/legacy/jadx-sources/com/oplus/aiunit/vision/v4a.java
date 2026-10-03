package com.oplus.aiunit.vision;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class v4a extends u4a {
    @Override // com.oplus.aiunit.vision.u4a
    @NonNull
    public Rect a(@NonNull ti0 ti0Var) {
        ti0Var.b();
        return b(null, ti0Var.e().getBounds(), ti0Var.d(), ti0Var.c());
    }

    @NonNull
    public Rect b(@Nullable s4a s4aVar, @NonNull Rect rect, int i, float f) {
        int iWidth = rect.width();
        if (iWidth <= i) {
            return rect;
        }
        return new Rect(0, 0, i, (int) ((rect.height() / (iWidth / i)) + 0.5f));
    }
}
