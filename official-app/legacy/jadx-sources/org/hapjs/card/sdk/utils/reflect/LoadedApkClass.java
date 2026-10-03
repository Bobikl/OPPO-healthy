package org.hapjs.card.sdk.utils.reflect;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes11.dex */
public class LoadedApkClass {
    private static Field splitResDirsField;

    public static Object getSplitResDirs(Object obj) throws IllegalAccessException, NoSuchFieldException {
        if (splitResDirsField == null) {
            Field declaredField = obj.getClass().getDeclaredField("mSplitResDirs");
            splitResDirsField = declaredField;
            declaredField.setAccessible(true);
        }
        return splitResDirsField.get(obj);
    }

    public static void setSplitResDirs(Object obj, String[] strArr) throws IllegalAccessException, NoSuchFieldException {
        if (splitResDirsField == null) {
            Field declaredField = obj.getClass().getDeclaredField("mSplitResDirs");
            splitResDirsField = declaredField;
            declaredField.setAccessible(true);
        }
        splitResDirsField.set(obj, strArr);
    }
}
