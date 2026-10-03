package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public interface os4 {
    public static final int INSTALL_PACKAGE_FAIL = 9;
    public static final int INSTALL_PACKAGE_SUCCESS = 8;
    public static final int NOT_ALLOW_SEND_FAIL = 10;
    public static final int STATUS_DEVICE_DISCONNECT = 2;
    public static final int STATUS_DEVICE_IN_FBE = 11;
    public static final int STATUS_DEVICE_STUB_MODULE = 3;
    public static final int STATUS_DEVICE_TIMEOUT = 4;
    public static final int STATUS_LOADING = 6;
    public static final int STATUS_LOAD_IDLE = 7;
    public static final int STATUS_NETWORK_ERROR = 1;
    public static final int STATUS_NETWORK_NONE = 5;
    public static final int STATUS_SERVER_ERROR = 0;
    public static final int STATUS_SUCCESS = -1;

    String getDeviceMac();

    void i6(String str, int i, int i2);
}
