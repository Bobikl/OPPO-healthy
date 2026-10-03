package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/km0;", "", "", "packageName", "", "permit", "", "a", "AUTH_LOCAL_DEVICE_INFO", "I", "AUTH_LOCAL_DATA_EXCHANGE", "AUTH_P2P_DEVICE_INFO", "AUTH_P2P_DATA_EXCHANGE", "AUTH_AWAKE", "AUTH_HEALTH_STEP", "AUTH_HEALTH_CALORIE", "AUTH_HEALTH_DISTANCE", "AUTH_HEALTH_HEIGHT", "AUTH_HEALTH_HEART_RATE", "AUTH_HEALTH_SLEEP", "AUTH_HEALTH_ECG", "AUTH_HEALTH_OXYGEN", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class km0 {
    public static final int AUTH_AWAKE = 7;
    public static final int AUTH_HEALTH_CALORIE = 9;
    public static final int AUTH_HEALTH_DISTANCE = 10;
    public static final int AUTH_HEALTH_ECG = 14;
    public static final int AUTH_HEALTH_HEART_RATE = 12;
    public static final int AUTH_HEALTH_HEIGHT = 11;
    public static final int AUTH_HEALTH_OXYGEN = 15;
    public static final int AUTH_HEALTH_SLEEP = 13;
    public static final int AUTH_HEALTH_STEP = 8;
    public static final int AUTH_LOCAL_DATA_EXCHANGE = 2;
    public static final int AUTH_LOCAL_DEVICE_INFO = 1;
    public static final int AUTH_P2P_DATA_EXCHANGE = 6;
    public static final int AUTH_P2P_DEVICE_INFO = 3;

    @NotNull
    public static final km0 INSTANCE = new km0();

    public final boolean a(@NotNull String packageName, int permit) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        ClientInfo clientInfoF = tf3.INSTANCE.f(packageName);
        if (clientInfoF == null) {
            return false;
        }
        if (((String) clientInfoF.b().second).charAt(permit - 1) == '1') {
            return true;
        }
        k25.b("AuthManager", "Auth permission denial, packageName=" + packageName + ", permit=" + permit);
        return false;
    }
}
