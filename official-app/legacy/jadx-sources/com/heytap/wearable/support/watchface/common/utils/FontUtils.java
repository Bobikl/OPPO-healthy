package com.heytap.wearable.support.watchface.common.utils;

import android.content.Context;
import android.graphics.Typeface;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class FontUtils {
    private static final String SYSTEM_FONT_SANS = "sans";
    private static final String SYSTEM_FONT_SYS = "sys";
    private static final String TAG = "FontUtils";

    public static Typeface getFont(Context context, String str) {
        try {
            if (!str.startsWith("sys") && !str.startsWith(SYSTEM_FONT_SANS)) {
                return Typeface.createFromAsset(context.getAssets(), str);
            }
            return Typeface.create(str, 0);
        } catch (Exception unused) {
            SdkDebugLog.e(TAG, "[getFont] occurred exception:" + str);
            return Typeface.DEFAULT;
        }
    }

    public static void setAppTypeface(Context context, String str) {
        try {
            Field declaredField = Typeface.class.getDeclaredField("NORMAL");
            declaredField.setAccessible(true);
            declaredField.set(null, getFont(context, str));
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            SdkDebugLog.d(TAG, "[setAppTypeface] exception:" + e2.getMessage());
        }
    }
}
