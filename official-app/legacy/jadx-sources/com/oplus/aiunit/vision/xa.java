package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.base.common.util.AcParameterizedType;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class xa {
    public static <T> List<T> a(String str, Class<T> cls) {
        if (str == null) {
            return null;
        }
        try {
            if (str.isEmpty()) {
                return null;
            }
            return (List) new Gson().fromJson(str, new AcParameterizedType(cls));
        } catch (Exception e2) {
            AcLogUtil.e("AcJsonUtils", "jsonToList: " + e2.getMessage());
            return null;
        }
    }

    public static <T> T b(String str, TypeToken<T> typeToken) {
        if (str == null) {
            return null;
        }
        try {
            if (str.isEmpty()) {
                return null;
            }
            return (T) new Gson().fromJson(str, typeToken.getType());
        } catch (Exception e2) {
            AcLogUtil.e("AcJsonUtils", "jsonToType: " + e2.getMessage());
            return null;
        }
    }

    public static <T> T c(String str, Class<T> cls) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    return (T) new Gson().fromJson(str, (Class) cls);
                }
            } catch (Throwable th) {
                AcLogUtil.e("AcJsonUtils", "stringToClass error: " + th.getMessage());
            }
        }
        return null;
    }

    public static String d(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return new Gson().toJson(obj);
        } catch (Throwable th) {
            AcLogUtil.e("AcJsonUtils", "toJson error: " + th.getMessage());
            return "";
        }
    }
}
