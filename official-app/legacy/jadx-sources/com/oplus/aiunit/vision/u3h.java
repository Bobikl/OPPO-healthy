package com.oplus.aiunit.vision;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes19.dex */
public class u3h extends PorterDuffColorFilter {
    public u3h(@ColorInt int i) {
        super(i, PorterDuff.Mode.SRC_ATOP);
    }
}
