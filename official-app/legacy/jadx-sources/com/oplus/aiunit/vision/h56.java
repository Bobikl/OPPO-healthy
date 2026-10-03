package com.oplus.aiunit.vision;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h56 {
    @NonNull
    @CheckResult
    public static Rect a(@NonNull Drawable drawable) {
        return new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}
