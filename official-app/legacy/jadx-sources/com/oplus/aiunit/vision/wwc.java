package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.sports.service.BgConnect;
import com.oplus.compat.utils.util.UnSupportedApiVersionException;
import com.oplus.epona.Request;
import com.oplus.epona.Response;
import com.oplus.utils.reflect.RefClass;
import com.oplus.utils.reflect.RefMethod;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"LongLogTag"})
public class wwc {

    public static class a {
        private static RefMethod<Integer> getZenMode;

        static {
            RefClass.load((Class<?>) a.class, (Class<?>) NotificationManager.class);
        }
    }

    @RequiresApi(api = 30)
    public static int a() throws UnSupportedApiVersionException {
        if (jvk.n()) {
            return ((Integer) a.getZenMode.call((NotificationManager) ep6.g().getSystemService(BgConnect.KEY_NOTIFICATION), new Object[0])).intValue();
        }
        if (!jvk.m()) {
            throw new UnSupportedApiVersionException("Not supported before R");
        }
        Response responseD = ep6.o(new Request.b().c("android.app.NotificationManager").b("getZenMode").a()).d();
        if (responseD.isSuccessful()) {
            return responseD.getBundle().getInt("success");
        }
        return 0;
    }

    @RequiresApi(api = 29)
    public static void b(Context context, int i, Uri uri, String str) throws UnSupportedApiVersionException {
        if (jvk.m()) {
            if (ep6.o(new Request.b().c("android.app.NotificationManager").b("setZenMode").d("mode", i).f("conditionId", uri).g(EngineConstant.REASON, str).a()).d().isSuccessful()) {
                return;
            }
            Log.e("NotificationManagerNative", "setZenMode: call failed");
        } else {
            if (!jvk.l()) {
                throw new UnSupportedApiVersionException("Not supported before Q");
            }
            ((NotificationManager) context.getSystemService(BgConnect.KEY_NOTIFICATION)).setZenMode(i, uri, str);
        }
    }
}
