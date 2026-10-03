package com.platform.usercenter.oauth.util;

import android.util.Log;
import androidx.annotation.Keep;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthSystemPropertyUtils {
    private static final String TAG = "AcSystemPropertyUtils";
    private static volatile Method get;

    public static String get(String str, String str2) {
        try {
            if (get == null) {
                synchronized (AcOauthSystemPropertyUtils.class) {
                    if (get == null) {
                        get = Class.forName("android.os.SystemProperties").getDeclaredMethod(ParserTag.TAG_GET, String.class, String.class);
                    }
                }
            }
            return (String) get.invoke(null, str, str2);
        } catch (Throwable th) {
            Log.e(TAG, th.toString());
            return str2;
        }
    }
}
