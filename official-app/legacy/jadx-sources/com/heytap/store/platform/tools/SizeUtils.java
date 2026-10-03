package com.heytap.store.platform.tools;

import android.content.res.Resources;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/heytap/store/platform/tools/SizeUtils;", "", "()V", "dp2px", "", "dpValue", "", "px2dp", "pxValue", "px2sp", "sp2px", "spValue", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class SizeUtils {
    public static final SizeUtils INSTANCE = new SizeUtils();

    private SizeUtils() {
    }

    public final int dp2px(float dpValue) {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        return (int) ((dpValue * system.getDisplayMetrics().density) + 0.5f);
    }

    public final int px2dp(float pxValue) {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        return (int) ((pxValue / system.getDisplayMetrics().density) + 0.5f);
    }

    public final int px2sp(float pxValue) {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        return (int) ((pxValue / system.getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final int sp2px(float spValue) {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        return (int) ((spValue * system.getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
