package com.platform.usercenter.tools.datastructure;

/* JADX INFO: loaded from: classes9.dex */
public final class ArrayUtil {
    private ArrayUtil() {
    }

    public static <T> boolean isNullOrEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }
}
