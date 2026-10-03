package com.google.android.gms.internal.base;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;

/* JADX INFO: loaded from: classes13.dex */
final class zan {
    @ChecksSdkIntAtLeast(api = 33)
    public static boolean zaa() {
        return Build.VERSION.SDK_INT >= 33;
    }
}
