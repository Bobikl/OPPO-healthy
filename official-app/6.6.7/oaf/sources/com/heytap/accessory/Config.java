package com.heytap.accessory;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class Config {
    private static final int SDK_VERSION = 10202;
    public static final int SDK_VERSION_20201 = 20201;
    private static final String SDK_VERSION_NAME = "1.2.2";
    private static final String TAG = "Config";

    public static final class Permission {
        public static final String AWAKENABLE = "com.heytap.accessory.permission.AWAKENABLE";
        public static final String DISCOVERY = "com.heytap.accessory.permission.DISCOVERY";
        public static final String MESSAGE = "com.heytap.accessory.permission.PUSH_MESSAGE";
    }

    private Config() {
    }

    public static int getSdkVersionCode() {
        return 10202;
    }

    public static String getSdkVersionName() {
        return "1.2.2";
    }
}
