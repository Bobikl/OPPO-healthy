package com.platform.usercenter.oauth.util;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthJsonUtils {
    private static final String TAG = "AcJsonUtils";

    public static <T> T stringToClass(String str, Class<T> cls) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (T) new Gson().fromJson(str, (Class) cls);
        } catch (Throwable th) {
            AcOauthLogUtil.e(TAG, "stringToClass error: " + th.getMessage());
            return null;
        }
    }

    public static <T> T stringToClassByTypeToken(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (T) new Gson().fromJson(str, new TypeToken<T>() { // from class: com.platform.usercenter.oauth.util.AcOauthJsonUtils.1
            }.getType());
        } catch (Throwable th) {
            AcOauthLogUtil.e(TAG, "stringToClass error: " + th.getMessage());
            return null;
        }
    }

    public static String toJson(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return new Gson().toJson(obj);
        } catch (Throwable th) {
            AcOauthLogUtil.e(TAG, "toJson error: " + th.getMessage());
            return "";
        }
    }
}
