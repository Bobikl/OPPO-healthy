package com.google.android.material.sidesheet;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
final class SheetUtils {
    private SheetUtils() {
    }

    public static boolean isSwipeMostlyHorizontal(float f, float f2) {
        return Math.abs(f) > Math.abs(f2);
    }
}
