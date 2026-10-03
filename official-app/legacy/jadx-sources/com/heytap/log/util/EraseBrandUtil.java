package com.heytap.log.util;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes19.dex */
public class EraseBrandUtil {
    private static Map<String, String> map = new ConcurrentHashMap(16);
    private static final String ENCODED_BRAND_O1 = "T1BQTw==";
    public static final String BRAND_O1 = decode(ENCODED_BRAND_O1);
    private static final String ENCODED_BRAND_O2 = "b3Bwbw==";
    public static final String BRAND_O2 = decode(ENCODED_BRAND_O2);
    private static final String ENCODED_BRAND_O3 = "T3Bwbw==";
    public static final String BRAND_O3 = decode(ENCODED_BRAND_O3);
    private static final String ENCODED_BRAND_R1 = "UmVhbG1l";
    public static final String BRAND_R1 = decode(ENCODED_BRAND_R1);
    private static final String ENCODED_BRAND_R2 = "cmVhbG1l";
    public static final String BRAND_R2 = decode(ENCODED_BRAND_R2);
    private static final String ENCODED_BRAND_P1 = "T25lUGx1cw==";
    public static final String BRAND_P1 = decode(ENCODED_BRAND_P1);
    private static final String ENCODED_BRAND_P2 = "b25lcGx1cw==";
    public static final String BRAND_P2 = decode(ENCODED_BRAND_P2);
    private static final String ENCODED_BRAND_OS1 = "Q29sb3JPUw==";
    public static final String BRAND_OS1 = decode(ENCODED_BRAND_OS1);
    private static final String ENCODED_BRAND_OS2 = "Q09MT1JPUw==";
    public static final String BRAND_OS2 = decode(ENCODED_BRAND_OS2);
    private static final String ENCODED_BRAND_OS3 = "Y29sb3Jvcw==";
    public static final String BRAND_OS3 = decode(ENCODED_BRAND_OS3);
    private static final String ENCODED_BRAND_OS4 = "Y29sb3JPUw==";
    public static final String BRAND_OS4 = decode(ENCODED_BRAND_OS4);
    private static final String ENCODE_BRAND_OS5 = "Y29sb3I=";
    public static final String BRAND_OS5 = decode(ENCODE_BRAND_OS5);
    private static final String ENCODE_BRAND_OS6 = "Q29sb3JCdWlsZA==";
    public static final String BRAND_OS6 = decode(ENCODE_BRAND_OS6);
    private static final String ENCODED_BRAND_OP1 = "T3BsdXNPUw==";
    public static final String BRAND_OP1 = decode(ENCODED_BRAND_OP1);
    private static final String ENCODED_H2OS = "SHlkcm9nZW4gT1Mg";
    public static final String BRAND_H2OS = decode(ENCODED_H2OS);
    private static final String ENCODED_O2OS = "T3h5Z2VuIE9TIA==";
    public static final String BRAND_O2OS = decode(ENCODED_O2OS);

    public static String decode(String str) {
        String str2 = map.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String str3 = new String(Base64.decode(str.getBytes(), 0));
        map.put(str, str3);
        return str3;
    }

    public static String encode(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }
}
