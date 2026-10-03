package com.heytap.accessory.bean;

/* JADX INFO: loaded from: classes14.dex */
public class DiscoveryException extends GeneralException {
    public static final int ERROR_NONE = 0;
    public static final int ERROR_PARAMETER = 3;
    public static final int ERROR_REMOTE = 1;
    public static final int ERROR_UNINITIALIZED = 2;

    private DiscoveryException(int i, String str) {
        super(i, str);
    }

    public static DiscoveryException create(int i, String str) {
        return new DiscoveryException(i, str);
    }
}
