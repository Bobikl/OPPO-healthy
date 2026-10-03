package com.oplus.backup.sdk.common.utils;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes19.dex */
public class ReflectUtils {
    private static final String TAG = "ReflectUtils";

    public static Object invoke(Object obj, Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            return cls.getMethod(str, clsArr).invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            BRLog.e(TAG, "invoke, e =" + e2.getMessage());
            return null;
        } catch (IllegalArgumentException e3) {
            BRLog.e(TAG, "invoke, e =" + e3.getMessage());
            return null;
        } catch (NoSuchMethodException e4) {
            BRLog.e(TAG, "invoke, e =" + e4.getMessage());
            return null;
        } catch (InvocationTargetException e5) {
            BRLog.e(TAG, "invoke, e =" + e5.getMessage());
            return null;
        } catch (Exception e6) {
            BRLog.e(TAG, "invoke, e =" + e6.getMessage());
            return null;
        }
    }
}
