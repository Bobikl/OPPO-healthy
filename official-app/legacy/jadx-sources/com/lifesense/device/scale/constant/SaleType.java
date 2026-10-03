package com.lifesense.device.scale.constant;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public enum SaleType {
    Unknown,
    InterConnection,
    S5Mini,
    S9Fit,
    S12Fit;

    public static SaleType getSaleType(String str) {
        if (TextUtils.isEmpty(str)) {
            return Unknown;
        }
        if (str.equalsIgnoreCase("LS112-B") || str.equalsIgnoreCase("112") || str.contains("LS112-B") || str.contains("LS212-B") || str.equalsIgnoreCase("LS213-B1")) {
            return InterConnection;
        }
        if (str.equalsIgnoreCase("LS215-B1")) {
            return S12Fit;
        }
        if (str.contains("LS215-B")) {
            return S9Fit;
        }
        return str.contains("LS213-B") ? S5Mini : Unknown;
    }
}
