package com.heytap.msp.sdk.common.utils;

/* JADX INFO: loaded from: classes19.dex */
public class ApiUtil {
    private static final String API_APP_DOWNLOAD = "/api/client/version/lastest";
    private static final String API_COMPATIBLE = "/api/client/compatible/route";
    private static final String API_COMPATIBLE_MULTI = "/api/client/compatible/batch-route";
    private static final String API_GLOBAL_CONFIG = "/api/client/config";
    private static String BASE_API_URL = "https://htms.heytapmobi.com";
    public static final int CONFIG_NATION = 1;

    public enum Nation {
        DOMESTIC(1),
        FOREIGN(2);

        private final int value;

        Nation(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static String getApiBaseApiUrl() {
        return BASE_API_URL;
    }

    public static String getCompatibleMultiUrl() {
        return getApiBaseApiUrl() + API_COMPATIBLE_MULTI;
    }

    public static String getCompatibleUrl() {
        return getApiBaseApiUrl() + API_COMPATIBLE;
    }

    public static String getDownloadAppUrl() {
        return getApiBaseApiUrl() + API_APP_DOWNLOAD;
    }

    public static String getGlobalConfigUrl() {
        return getApiBaseApiUrl() + API_GLOBAL_CONFIG;
    }
}
