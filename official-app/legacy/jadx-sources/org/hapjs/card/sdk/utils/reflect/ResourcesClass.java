package org.hapjs.card.sdk.utils.reflect;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes11.dex */
public class ResourcesClass {
    private static final String TAG = "ResourcesClass";
    private static Field mAssetsField;
    private static Field mResourceImplField;

    public static Object getResourcesImpl(Resources resources) throws IllegalAccessException, NoSuchFieldException {
        if (mResourceImplField == null) {
            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
            mResourceImplField = declaredField;
            declaredField.setAccessible(true);
        }
        return mResourceImplField.get(resources);
    }

    public static Object getResourcesImplNoThrow(Resources resources) {
        try {
            return getResourcesImpl(resources);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            Log.e(TAG, "failed to getResourcesImpl", e2);
            return null;
        }
    }

    public static void setAssets(Resources resources, AssetManager assetManager) throws IllegalAccessException, NoSuchFieldException {
        if (mAssetsField == null) {
            Field declaredField = Resources.class.getDeclaredField("mAssets");
            mAssetsField = declaredField;
            declaredField.setAccessible(true);
        }
        mAssetsField.set(resources, assetManager);
    }

    public static void setResourcesImpl(Resources resources, Object obj) throws IllegalAccessException, NoSuchFieldException {
        if (mResourceImplField == null) {
            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
            mResourceImplField = declaredField;
            declaredField.setAccessible(true);
        }
        mResourceImplField.set(resources, obj);
    }
}
