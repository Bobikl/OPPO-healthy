package org.hapjs.card.sdk.utils.reflect;

import android.content.res.AssetManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class ResourcesImplClass {
    private static Class CLASS;
    private static Method getAssetsMethod;

    public static AssetManager getAssets(Object obj) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (CLASS == null) {
            CLASS = Class.forName("android.content.res.ResourcesImpl");
        }
        if (getAssetsMethod == null) {
            getAssetsMethod = CLASS.getDeclaredMethod("getAssets", new Class[0]);
        }
        return (AssetManager) getAssetsMethod.invoke(obj, new Object[0]);
    }
}
