package org.hapjs.card.sdk.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.hapjs.card.sdk.utils.reflect.AssetManagerClass;
import org.hapjs.card.sdk.utils.reflect.ContextImplClass;
import org.hapjs.card.sdk.utils.reflect.LoadedApkClass;
import org.hapjs.card.sdk.utils.reflect.ResourcesImplClass;
import org.hapjs.card.sdk.utils.reflect.ResourcesManagerClass;

/* JADX INFO: loaded from: classes11.dex */
class ResourceInjectorForO {
    private static final String TAG = "ResourceInjectorForO";

    private static String[] append(String[] strArr, String str) {
        if (contains(strArr, str)) {
            return strArr;
        }
        int length = (strArr != null ? strArr.length : 0) + 1;
        String[] strArr2 = new String[length];
        if (strArr != null) {
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        }
        strArr2[length - 1] = str;
        return strArr2;
    }

    @TargetApi(19)
    private static boolean contains(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (Objects.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(26)
    public static void inject(Context context, String str, String str2) throws Exception {
        try {
            Object resourcesManagerClass = ResourcesManagerClass.getInstance();
            Field declaredField = Class.forName("android.app.ResourcesManager").getDeclaredField("mResourceImpls");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(resourcesManagerClass);
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    Object obj = ((WeakReference) it.next()).get();
                    if (obj != null) {
                        AssetManagerClass.addAssetPath(ResourcesImplClass.getAssets(obj), str2);
                    }
                }
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
            Log.w(TAG, "Fail to addAssetPathAboveO", e2);
            String str3 = context.getApplicationInfo().publicSourceDir;
            injectPlatformAsset(context, str2);
            ResourcesManagerClass.appendLibAssetForMainAssetPath(ResourcesManagerClass.getInstance(), context.getPackageName(), str3, str2);
        }
    }

    @TargetApi(26)
    private static void injectPlatformAsset(Context context, String str) throws Exception {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        applicationInfo.splitSourceDirs = append(applicationInfo.splitSourceDirs, str);
        Object packageInfo = ContextImplClass.getPackageInfo(context);
        LoadedApkClass.setSplitResDirs(packageInfo, append((String[]) LoadedApkClass.getSplitResDirs(packageInfo), str));
    }
}
