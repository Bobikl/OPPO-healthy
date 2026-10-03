package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public final class grm {
    public static boolean a = new File("/system/framework/amap.jar").exists();

    public static int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static AssetManager b(Context context) {
        if (context == null) {
            return null;
        }
        AssetManager assets = context.getAssets();
        if (a) {
            try {
                assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, "/system/framework/amap.jar");
            } catch (Throwable th) {
                c2n.r(th, "ResourcesUtil", "getSelfAssets");
            }
        }
        return assets;
    }
}
