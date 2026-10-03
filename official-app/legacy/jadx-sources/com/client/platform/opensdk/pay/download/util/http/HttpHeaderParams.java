package com.client.platform.opensdk.pay.download.util.http;

import android.os.Build;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class HttpHeaderParams {
    private static final String ACCEPT_LANGUAGE = "Accept-Language";
    private static final String API_VERSION = "Api-Version";
    private static final String MAC_ADDRESS = "Mac-Address";
    private static final String ROM_VERSION = "Rom-Version";
    private static final String USER_AGENT = "User-Agent";

    private static String filterHeader(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            try {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt < 127) {
                    sb.append(cCharAt);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static String getApiVersion() {
        try {
            return String.valueOf(Build.VERSION.SDK_INT);
        } catch (Exception unused) {
            return "";
        }
    }

    public static HashMap<String, String> getHeaderParams() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", filterHeader(getUserAgent("", "", "")));
        map.put(API_VERSION, filterHeader(getApiVersion()));
        map.put(ROM_VERSION, "0");
        map.put(MAC_ADDRESS, "0");
        map.put(ACCEPT_LANGUAGE, getLanguageTag());
        return map;
    }

    public static String getLanguageTag() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return "id-ID".equalsIgnoreCase(languageTag) ? "in-ID" : languageTag;
    }

    public static String getUserAgent(String str, String str2, String str3) {
        return Build.BRAND + "/" + Build.MODEL.replaceAll("\u3000", "") + "/" + Build.VERSION.RELEASE + "/" + str + "/" + str2 + "/" + str3 + "/000000000000000/";
    }
}
