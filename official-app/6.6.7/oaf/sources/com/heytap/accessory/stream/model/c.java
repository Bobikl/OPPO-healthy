package com.heytap.accessory.stream.model;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public enum c {
    a,
    b;

    public static c a(int i) {
        if (i == 0) {
            return a;
        }
        if (i == 1) {
            return b;
        }
        throw new IllegalArgumentException("Invalid Result Status Parameter");
    }
}
