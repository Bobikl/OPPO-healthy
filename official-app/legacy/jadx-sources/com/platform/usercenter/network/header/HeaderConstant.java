package com.platform.usercenter.network.header;

import com.heytap.store.base.core.http.HttpUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class HeaderConstant {
    public static final String DEFAULT_CONTENT_CHARSET = "ISO-8859-1";
    public static String FORMAT_UTF_8 = "UTF-8";
    public static final String HEADER_SECURITY_CONTENT_TYPE = "application/encrypted-json";
    public static final String HEADER_X_PROTOCOL_VERSION = "X-Protocol-Version";
    public static final String HEAD_K_302_LOCATION = "Location";
    public static String HEAD_K_ACCEPT = "Accept";
    public static String HEAD_K_CONNECTION = "Connection";
    public static String HEAD_K_CONTENT_ENCODING = "Content-Encoding";
    public static String HEAD_K_CONTENT_LENGTH = "Content-Length";
    public static String HEAD_K_CONTENT_TYPE = "Content-Type";
    public static final String HEAD_K_RECEIVED_MILLIS = "X-Android-Received-Millis";
    public static final String HEAD_K_SENT_MILLIS = "X-Android-Sent-Millis";
    public static final String HEAD_V_APPLICATION_JSON = "application/json";
    public static String HEAD_V_CONNECTION_CLOSE = "close";
    public static String HEAD_V_CONNECTION_KEEP_ALIVE = "keep-alive";

    public static boolean checkNameAndValue(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                return false;
            }
        }
        if (str2 == null) {
            return false;
        }
        int length2 = str2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt2 = str2.charAt(i2);
            if ((cCharAt2 <= 31 && cCharAt2 != '\t') || cCharAt2 >= 127) {
                return false;
            }
        }
        return true;
    }

    public static String parseCharset(Map<String, String> map, String str) {
        String str2 = map.get(HEAD_K_CONTENT_TYPE);
        if (str2 != null) {
            String[] strArrSplit = str2.split(";");
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split(HttpUtils.EQUAL_SIGN);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static String parseCharset(Map<String, String> map) {
        return parseCharset(map, "ISO-8859-1");
    }
}
