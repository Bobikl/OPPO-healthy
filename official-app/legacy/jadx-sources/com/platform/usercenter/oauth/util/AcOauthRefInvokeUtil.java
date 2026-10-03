package com.platform.usercenter.oauth.util;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthRefInvokeUtil {
    private static String TAG = "AcRefInvokeUtil";

    public static <T> T createObject(String str, Class<T> cls) {
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                Method method = getMethod(cls2, "getInstance");
                if (method == null) {
                    return (T) cls2.newInstance();
                }
                method.setAccessible(true);
                return (T) method.invoke(null, new Object[0]);
            }
        } catch (Exception e2) {
            AcOauthLogUtil.e(TAG, "createObject exception " + e2);
        }
        return null;
    }

    @NonNull
    private static Method getMethod(Class cls, String str) {
        try {
            return cls.getDeclaredMethod(str, new Class[0]);
        } catch (NoSuchMethodException e2) {
            AcOauthLogUtil.e(TAG, "getMethod exception " + e2.getMessage());
            return null;
        }
    }
}
