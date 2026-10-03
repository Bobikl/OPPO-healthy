package com.oplus.aiunit.vision;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\official-device-assets\classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/g5g;", "", "", "mode", "", "a", "b", "c", "d", "MODE_UNKNOWN", "I", "MODE_HIGH_PERFORMANCE", "MODE_MIX", "MODE_RX", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
public final class g5g {

    @NotNull
    public static final g5g INSTANCE = new g5g();
    public static final int MODE_HIGH_PERFORMANCE = 1;
    public static final int MODE_MIX = 2;
    public static final int MODE_RX = 4;
    public static final int MODE_UNKNOWN = 0;

    @JvmStatic
    public static final boolean a(int mode) {
        return (mode & 1) == 1;
    }

    @JvmStatic
    public static final boolean b(int mode) {
        return (mode & 2) == 2;
    }

    @JvmStatic
    public static final boolean c(int mode) {
        return (mode & 4) == 4;
    }

    @JvmStatic
    public static final boolean d(int mode) {
        return mode == 0;
    }
}
