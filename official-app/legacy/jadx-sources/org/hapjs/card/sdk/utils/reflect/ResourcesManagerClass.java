package org.hapjs.card.sdk.utils.reflect;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ResourcesManagerClass {
    private static Class CLASS;
    private static Method appendLibAssetForMainAssetPathMethod;
    private static Method appendLibAssetsForMainAssetPathMethod;
    private static Method getInstanceMethod;
    private static Method getResourcesMethod;
    private static Field resourceReferencesField;

    public static void appendLibAssetForMainAssetPath(Object obj, String str, String str2, String str3) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (CLASS == null) {
            CLASS = Class.forName("android.app.ResourcesManager");
        }
        if (appendLibAssetsForMainAssetPathMethod == null) {
            try {
                appendLibAssetsForMainAssetPathMethod = CLASS.getDeclaredMethod("appendLibAssetsForMainAssetPath", String.class, String.class, String[].class);
            } catch (Exception e2) {
                Log.e("", "appendLibAssetsForMainAssetPathMethod not found " + e2.getMessage());
            }
        }
        Method method = appendLibAssetsForMainAssetPathMethod;
        if (method != null) {
            method.invoke(obj, str, str2, new String[]{str3});
            return;
        }
        if (appendLibAssetForMainAssetPathMethod == null) {
            appendLibAssetForMainAssetPathMethod = CLASS.getDeclaredMethod("appendLibAssetForMainAssetPath", String.class, String.class);
        }
        appendLibAssetForMainAssetPathMethod.invoke(obj, str2, str3);
    }

    public static Object getInstance() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (CLASS == null) {
            CLASS = Class.forName("android.app.ResourcesManager");
        }
        if (getInstanceMethod == null) {
            getInstanceMethod = CLASS.getDeclaredMethod("getInstance", new Class[0]);
        }
        return getInstanceMethod.invoke(null, new Object[0]);
    }

    public static ArrayList<WeakReference<Resources>> getResourceReferences(Object obj) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        if (CLASS == null) {
            CLASS = Class.forName("android.app.ResourcesManager");
        }
        if (resourceReferencesField == null) {
            Field declaredField = CLASS.getDeclaredField("mResourceReferences");
            resourceReferencesField = declaredField;
            declaredField.setAccessible(true);
        }
        return (ArrayList) resourceReferencesField.get(obj);
    }

    public static Object getResources(Object obj, IBinder iBinder, String str, String[] strArr, String[] strArr2, String[] strArr3, int i, Configuration configuration, Object obj2, ClassLoader classLoader) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (CLASS == null) {
            CLASS = Class.forName("android.app.ResourcesManager");
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (getResourcesMethod == null) {
                getResourcesMethod = CLASS.getDeclaredMethod("getResources", IBinder.class, String.class, String[].class, String[].class, String[].class, Integer.TYPE, Configuration.class, obj2.getClass(), ClassLoader.class, List.class);
            }
            return getResourcesMethod.invoke(obj, iBinder, str, strArr, strArr2, strArr3, Integer.valueOf(i), configuration, obj2, classLoader, null);
        }
        if (getResourcesMethod == null) {
            getResourcesMethod = CLASS.getDeclaredMethod("getResources", IBinder.class, String.class, String[].class, String[].class, String[].class, Integer.TYPE, Configuration.class, obj2.getClass(), ClassLoader.class);
        }
        return getResourcesMethod.invoke(obj, iBinder, str, strArr, strArr2, strArr3, Integer.valueOf(i), configuration, obj2, classLoader);
    }
}
