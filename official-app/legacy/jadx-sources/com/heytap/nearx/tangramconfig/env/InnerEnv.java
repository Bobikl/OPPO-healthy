package com.heytap.nearx.tangramconfig.env;

/* JADX INFO: loaded from: classes17.dex */
public class InnerEnv {
    private static String BASE_API_URL = null;
    private static final String CHECK_UPDATE_SUFFIX = "/v5/sdk/%scheckUpdate";
    private static final int[] TEST_URL_HOST = {121, 101, 101, 97, 98, 43, 62, 62, 112, 97, 97, 60, 114, 126, 127, 119, 63, 102, 112, 127, 104, 126, 125, 63, 114, 126, 124};
    private static final int[] CN_URL_HOST = {121, 101, 101, 97, 98, 43, 62, 62, 114, 125, 126, 100, 117, 114, 126, 127, 119, 60, 112, 97, 97, 60, 114, 127, 63, 121, 116, 104, 101, 112, 97, 124, 126, 115, 120, 63, 114, 126, 124};

    public static String getMultiProductConfigUpdateUrl(Boolean bool) {
        BASE_API_URL = AreaEnv.toString(CN_URL_HOST);
        if (bool.booleanValue()) {
            BASE_API_URL = AreaEnv.toString(TEST_URL_HOST);
        }
        return BASE_API_URL + String.format(CHECK_UPDATE_SUFFIX, "");
    }

    public static String getSingleProductConfigUpdateUrl(Boolean bool, String str) {
        BASE_API_URL = AreaEnv.toString(CN_URL_HOST);
        if (bool.booleanValue()) {
            BASE_API_URL = AreaEnv.toString(TEST_URL_HOST);
        }
        return BASE_API_URL + String.format(CHECK_UPDATE_SUFFIX, str);
    }

    public static String getSingleProductConfigUpdateUrls(String str, String str2) {
        return String.format(str, str2);
    }

    public static String getMultiProductConfigUpdateUrl(String str) {
        return str + String.format(CHECK_UPDATE_SUFFIX, "");
    }

    public static String getSingleProductConfigUpdateUrl(String str, String str2) {
        return str + String.format(CHECK_UPDATE_SUFFIX, str2);
    }
}
