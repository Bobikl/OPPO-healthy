package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class qi {
    public static String a = "AcRefInvokeUtil";

    public static <T> T a(String str, Class<T> cls) {
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                Method methodB = b(cls2, "getInstance");
                if (methodB == null) {
                    return (T) cls2.newInstance();
                }
                methodB.setAccessible(true);
                return (T) methodB.invoke(null, new Object[0]);
            }
        } catch (Exception e2) {
            AcLogUtil.e(a, "createObject exception " + e2);
        }
        return null;
    }

    @NonNull
    public static Method b(Class cls, String str) {
        try {
            return cls.getDeclaredMethod(str, new Class[0]);
        } catch (NoSuchMethodException e2) {
            AcLogUtil.e(a, "getMethod exception " + e2.getMessage());
            return null;
        }
    }

    public static Method c(String str, String str2, Class<?>... clsArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr);
        } catch (Exception e2) {
            AcLogUtil.w(a, "getStaticMethod error  = " + e2);
            return null;
        }
    }
}
