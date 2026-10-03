package com.platform.usercenter.tools.env;

import com.platform.usercenter.BaseApp;

/* JADX INFO: loaded from: classes9.dex */
public final class EnvUtils {
    private EnvUtils() {
    }

    public static boolean isApkInDebug() {
        try {
            return (BaseApp.mContext.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
