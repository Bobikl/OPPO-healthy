package com.heytap.wearable.support.watchface.common.utils;

/* JADX INFO: loaded from: classes2.dex */
public class DataUtils {
    public static int getFormatActivityData(int i, int i2) {
        if (i <= 0) {
            return 0;
        }
        return i > i2 ? i2 : i;
    }
}
