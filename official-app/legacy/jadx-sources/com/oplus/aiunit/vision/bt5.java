package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class bt5 {
    public final float a;

    public bt5(float f) {
        this.a = f;
    }

    @NonNull
    public static bt5 a(@NonNull Context context) {
        return new bt5(context.getResources().getDisplayMetrics().density);
    }

    public int b(int i) {
        return (int) ((i * this.a) + 0.5f);
    }
}
