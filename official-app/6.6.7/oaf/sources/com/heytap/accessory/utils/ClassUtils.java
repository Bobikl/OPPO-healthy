package com.heytap.accessory.utils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class ClassUtils {
    public static boolean isChildClass(Class cls, Class cls2) {
        Class superclass;
        if (cls2 == null || cls == null || (superclass = cls2.getSuperclass()) == null) {
            return false;
        }
        if (superclass.equals(cls)) {
            return true;
        }
        return isChildClass(cls, superclass);
    }
}
