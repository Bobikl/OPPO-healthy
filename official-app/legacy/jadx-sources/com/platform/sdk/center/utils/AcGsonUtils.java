package com.platform.sdk.center.utils;

import com.google.gson.Gson;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcGsonUtils {
    private static Gson gson = new Gson();

    public static <T> T fromJson(String str, Class<T> cls) {
        try {
            return (T) gson.fromJson(str, (Class) cls);
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return null;
        }
    }

    public static String toJson(Object obj) {
        try {
            return gson.toJson(obj);
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return null;
        }
    }
}
