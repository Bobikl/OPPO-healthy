package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.oplus.carlink.controlsdk.Constant;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class g1d {
    public static <T> T a(String str, Class<T> cls) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "getObjectFromJson return null";
        } else {
            try {
                return (T) new Gson().fromJson(str, (Class) cls);
            } catch (Exception unused) {
                str2 = "Exception when convert string to T";
            }
        }
        d1d.c("Utils", str2);
        return null;
    }

    public static <T> T b(String str, Type type) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) new Gson().fromJson(str, type);
        } catch (Exception unused) {
            d1d.c("Utils", "Exception when convert string to T");
            return null;
        }
    }

    public static String c(String str) {
        if ("200001".equalsIgnoreCase(str)) {
            return Constant.COMPANY_ID_CHANGAN;
        }
        if (Constant.COMPANY_ID_LINGPAO.equalsIgnoreCase(str)) {
            return Constant.COMPANY_ID_JIKE;
        }
        return "200045".equalsIgnoreCase(str) ? Constant.COMPANY_ID_LINGPAO : str;
    }
}
