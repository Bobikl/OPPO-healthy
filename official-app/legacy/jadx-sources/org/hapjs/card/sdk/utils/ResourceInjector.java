package org.hapjs.card.sdk.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import org.hapjs.card.sdk.utils.reflect.AssetManagerClass;
import org.hapjs.card.sdk.utils.reflect.ResourcesClass;

/* JADX INFO: loaded from: classes11.dex */
public class ResourceInjector {
    private static final String TAG = "ResourceInjector";
    private static final Set<Object> sInjectedContexts = Collections.newSetFromMap(new WeakHashMap());

    private static boolean addAssetPathAboveL(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null && applicationContext != context) {
            addAssetPathAboveL(applicationContext, str);
        }
        try {
            AssetManagerClass.addAssetPath(context.getAssets(), str);
            return true;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            Log.w(TAG, "Fail to addAssetPathAboveL", e2);
            return false;
        }
    }

    private static boolean addAssetPathAboveO(Context context, String str, String str2) {
        try {
            ResourceInjectorForO.inject(context, str, str2);
            return true;
        } catch (Exception e2) {
            Log.w(TAG, "Fail to addAssetPathAboveO", e2);
            return false;
        }
    }

    private static Object getResourcesKey(Context context) {
        return ResourcesClass.getResourcesImplNoThrow(context.getResources());
    }

    public static synchronized boolean inject(Context context, Context context2, String str) {
        Object resourcesKey = getResourcesKey(context);
        if (resourcesKey == null) {
            Log.e(TAG, "key is null. context=" + context);
            return false;
        }
        Set<Object> set = sInjectedContexts;
        if (set.contains(resourcesKey)) {
            Log.d(TAG, "resources already injected. context=" + context);
            return true;
        }
        String platform = CardConfigHelper.getPlatform(context, context2);
        if (TextUtils.isEmpty(platform)) {
            Log.w(TAG, "Fail to inject resource, platform package: " + platform);
            return false;
        }
        addAssetPathAboveO(context, platform, str);
        Object resourcesKey2 = getResourcesKey(context);
        if (resourcesKey2 != null) {
            set.add(resourcesKey2);
            return true;
        }
        Log.e(TAG, "newKey is null. context=" + context);
        return false;
    }
}
