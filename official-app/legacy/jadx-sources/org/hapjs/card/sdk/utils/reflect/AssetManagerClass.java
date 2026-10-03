package org.hapjs.card.sdk.utils.reflect;

import android.content.res.AssetManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class AssetManagerClass {
    private static Method addAssetPathMethod;
    private static Method ensureStringBlocks;

    public static int addAssetPath(AssetManager assetManager, String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (addAssetPathMethod == null) {
            addAssetPathMethod = AssetManager.class.getMethod("addAssetPath", String.class);
        }
        return ((Integer) addAssetPathMethod.invoke(assetManager, str)).intValue();
    }

    public static void ensureStringBlocks(AssetManager assetManager) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (ensureStringBlocks == null) {
            Method declaredMethod = AssetManager.class.getDeclaredMethod("ensureStringBlocks", new Class[0]);
            ensureStringBlocks = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        ensureStringBlocks.invoke(assetManager, new Object[0]);
    }
}
