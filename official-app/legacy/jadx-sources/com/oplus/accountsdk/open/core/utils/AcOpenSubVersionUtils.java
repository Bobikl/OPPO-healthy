package com.oplus.accountsdk.open.core.utils;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenSubVersionUtils {
    public static int SUB_VERSION = getSubVersionForAndroid();
    public static int TYPE_BUILD_VERSION_ABOVE_M = 1;
    public static int TYPE_BUILD_VERSION_BELOW_M = 2;

    public static int getSubVersionForAndroid() {
        return TYPE_BUILD_VERSION_ABOVE_M;
    }
}
