package com.vfx.lib;

import android.content.Context;
import android.content.res.AssetManager;

/* JADX INFO: loaded from: classes10.dex */
public class VFXEngineHelper {
    private static final String TAG = "VFXEngineHelper";
    private static AssetManager sAssetManager = null;
    private static boolean sInited = false;
    private static String sPackageName;

    public static AssetManager getAssetManager() {
        return sAssetManager;
    }

    public static String getCocos2dxPackageName() {
        return sPackageName;
    }

    public static int getDPI() {
        return -1;
    }

    public static String getWritablePath() {
        return "";
    }

    public static void init(Context context) {
        if (sInited) {
            return;
        }
        sPackageName = context.getApplicationInfo().packageName;
        AssetManager assets = context.getAssets();
        sAssetManager = assets;
        nativeSetContext(context, assets);
        sInited = true;
    }

    private static native void nativeSetContext(Context context, AssetManager assetManager);
}
