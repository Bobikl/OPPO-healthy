package com.oplus.aiunit.vision;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes12.dex */
public class v3h extends PorterDuffColorFilter {
    public v3h(@ColorInt int i) {
        super(i, PorterDuff.Mode.SRC_ATOP);
    }
}
