package com.lifesense.weidong.lzsimplenetlibs.util;

import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class RequestCommonParamsUtils {
    public static final String SECRETKEY = "2a6bfL45*2219cZi44c7f78231e3cF80ensea13072eSb672_!";
    public static Map<String, Object> commonParameters = new ConcurrentHashMap();
    public static final String kRequestParam_AppType = "appType";
    public static final String kRequestParam_Random = "rnd";
    public static final String kRequestParam_TimeStamp = "ts";
    public static final String kRequestParam_Token = "requestToken";

    public static void addCommonParams(BaseRequest baseRequest) {
        generateRequestToken(baseRequest);
        for (Map.Entry<String, Object> entry : commonParameters.entrySet()) {
            baseRequest.addValue(entry.getKey(), entry.getValue());
        }
    }

    public static void generateRequestToken(BaseRequest baseRequest) {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        String string = UUID.randomUUID().toString();
        String strSubstring = string.substring(string.length() - 8);
        baseRequest.addUrlParams(kRequestParam_Token, MD5.getMD5Str(strSubstring + SECRETKEY + iCurrentTimeMillis));
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(iCurrentTimeMillis);
        baseRequest.addUrlParams("ts", sb.toString());
        baseRequest.addUrlParams(kRequestParam_Random, strSubstring);
    }

    public static void put(String str, Object obj) {
        if (commonParameters.containsKey(str) && commonParameters.get(str) == obj) {
            return;
        }
        commonParameters.put(str, obj);
    }
}
