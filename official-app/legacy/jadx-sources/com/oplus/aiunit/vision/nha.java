package com.oplus.aiunit.vision;

import android.graphics.Rect;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class nha extends u4a {
    public final boolean a;

    public nha(boolean z) {
        this.a = z;
    }

    @Override // com.oplus.aiunit.vision.u4a
    @NonNull
    public Rect a(@NonNull ti0 ti0Var) {
        Rect bounds = ti0Var.e().getBounds();
        int iD = ti0Var.d();
        if (!this.a) {
            return bounds;
        }
        int iWidth = bounds.width();
        if (iWidth < iD) {
            return new Rect(0, 0, iD, bounds.height());
        }
        if (iWidth <= iD) {
            return bounds;
        }
        return new Rect(0, 0, iD, (int) ((iD / (iWidth / bounds.height())) + 0.5f));
    }
}
