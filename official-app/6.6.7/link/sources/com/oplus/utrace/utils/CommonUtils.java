package com.oplus.utrace.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/utrace/utils/CommonUtils;", "", "()V", "forcedValue", "", "buildConfig", "", "defaultValue", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonUtils {

    @NotNull
    public static final CommonUtils INSTANCE = new CommonUtils();

    private CommonUtils() {
    }

    @JvmStatic
    public static final boolean forcedValue(int buildConfig, boolean defaultValue) {
        if (buildConfig == 1) {
            return true;
        }
        if (buildConfig != 2) {
            return defaultValue;
        }
        return false;
    }
}
