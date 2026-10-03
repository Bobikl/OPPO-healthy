package com.platform.usercenter.tools.algorithm.disperse;

import com.platform.usercenter.tools.datastructure.StringUtil;

/* JADX INFO: loaded from: classes9.dex */
public class DisperseImplFactory {
    private static String DISPERSE_TYPE_HOUR_SECOND = "HourShareDisperse";

    public static IDisperseSpi createDisperseSpi(String str) {
        if (!StringUtil.isEmpty(str) && DISPERSE_TYPE_HOUR_SECOND.equals(str)) {
            return new HourShareDisperseAlgorithm();
        }
        return null;
    }
}
