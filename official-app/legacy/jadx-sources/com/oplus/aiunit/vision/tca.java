package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.OplusBaseIntent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.oplus.compat.utils.util.UnSupportedApiVersionException;
import com.oplus.epona.Request;
import com.oplus.epona.Response;
import com.oplus.inner.content.IntentWrapper;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class tca {

    @RequiresApi(api = 24)
    public static String ACTION_CALL_PRIVILEGED;
    public static String EXTRA_USER_ID;
    public static int FLAG_RECEIVER_INCLUDE_BACKGROUND;

    @RequiresApi(api = 29)
    public static int OPLUS_FLAG_MUTIL_APP;

    @RequiresApi(api = 29)
    public static int OPLUS_FLAG_MUTIL_CHOOSER;

    static {
        try {
            if (jvk.n()) {
                OPLUS_FLAG_MUTIL_APP = 1024;
                OPLUS_FLAG_MUTIL_CHOOSER = 512;
                EXTRA_USER_ID = "android.intent.extra.USER_ID";
                FLAG_RECEIVER_INCLUDE_BACKGROUND = 16777216;
                ACTION_CALL_PRIVILEGED = "android.intent.action.CALL_PRIVILEGED";
                return;
            }
            if (jvk.m()) {
                OPLUS_FLAG_MUTIL_APP = 1024;
                OPLUS_FLAG_MUTIL_CHOOSER = 512;
                Response responseD = ep6.o(new Request.b().c("android.content.Intent").a()).d();
                if (!responseD.isSuccessful()) {
                    Log.e("IntentNative", "Epona Communication failed, static initializer failed.");
                    return;
                }
                EXTRA_USER_ID = responseD.getBundle().getString("EXTRA_USER_ID");
                FLAG_RECEIVER_INCLUDE_BACKGROUND = responseD.getBundle().getInt("FLAG_RECEIVER_INCLUDE_BACKGROUND");
                ACTION_CALL_PRIVILEGED = responseD.getBundle().getString("ACTION_CALL_PRIVILEGED");
                return;
            }
            if (jvk.l()) {
                OPLUS_FLAG_MUTIL_APP = ((Integer) b()).intValue();
                OPLUS_FLAG_MUTIL_CHOOSER = ((Integer) c()).intValue();
                ACTION_CALL_PRIVILEGED = (String) a();
                FLAG_RECEIVER_INCLUDE_BACKGROUND = 16777216;
                return;
            }
            if (jvk.k()) {
                FLAG_RECEIVER_INCLUDE_BACKGROUND = 16777216;
            } else if (jvk.g()) {
                ACTION_CALL_PRIVILEGED = "android.intent.action.CALL_PRIVILEGED";
            } else {
                Log.e("IntentNative", "Not supported before N");
                throw new UnSupportedApiVersionException("Not supported before N");
            }
        } catch (Throwable th) {
            Log.e("IntentNative", th.toString());
        }
    }

    public static Object a() {
        return uca.a();
    }

    public static Object b() {
        return uca.b();
    }

    public static Object c() {
        return uca.c();
    }

    @RequiresApi(api = 29)
    public static void d(@NonNull Intent intent, int i) throws UnSupportedApiVersionException {
        if (jvk.n()) {
            OplusBaseIntent oplusBaseIntent = (OplusBaseIntent) vqd.a(OplusBaseIntent.class, intent);
            if (oplusBaseIntent != null) {
                oplusBaseIntent.setOplusFlags(i);
                return;
            }
            return;
        }
        if (jvk.j()) {
            IntentWrapper.setOplusFlags(intent, i);
        } else {
            if (!jvk.l()) {
                throw new UnSupportedApiVersionException();
            }
            e(intent, i);
        }
    }

    public static void e(Intent intent, int i) {
        uca.d(intent, i);
    }
}
