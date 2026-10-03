package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.annotation.RequiresApi;
import com.heytap.health.esim.nec.NecBrowserActivity;
import com.lifesense.weidong.lzsimplenetlibs.util.RequestCommonParamsUtils;
import com.oplus.compat.utils.util.UnSupportedApiVersionException;
import com.oplus.epona.Request;
import com.oplus.epona.Response;
import com.oplus.inner.telephony.TelephonyManagerWrapper;
import com.oplus.utils.reflect.RefClass;
import com.oplus.utils.reflect.RefInt;

/* JADX INFO: loaded from: classes4.dex */
public class zqj {

    @RequiresApi(api = 29)
    public static final int LISTEN_PRECISE_CALL_STATE = 2048;

    @RequiresApi(api = 29)
    public static int NETWORK_CLASS_2_G;

    @RequiresApi(api = 29)
    public static int NETWORK_CLASS_3_G;

    @RequiresApi(api = 29)
    public static int NETWORK_CLASS_4_G;

    @RequiresApi(api = 29)
    public static int NETWORK_CLASS_5_G;

    public static class a {
        private static RefInt NETWORK_CLASS_2_G;
        private static RefInt NETWORK_CLASS_3_G;
        private static RefInt NETWORK_CLASS_4_G;
        private static RefInt NETWORK_CLASS_5_G;
        public static Class<?> a = RefClass.load((Class<?>) a.class, "com.oplus.internal.telephony.utils.OemTelephonyUtils");
    }

    static {
        try {
            if (jvk.n()) {
                NETWORK_CLASS_2_G = a.NETWORK_CLASS_2_G.get(null);
                NETWORK_CLASS_3_G = a.NETWORK_CLASS_3_G.get(null);
                NETWORK_CLASS_4_G = a.NETWORK_CLASS_4_G.get(null);
                NETWORK_CLASS_5_G = a.NETWORK_CLASS_5_G.get(null);
            } else if (jvk.j()) {
                NETWORK_CLASS_2_G = TelephonyManagerWrapper.NETWORK_CLASS_2_G;
                NETWORK_CLASS_3_G = TelephonyManagerWrapper.NETWORK_CLASS_3_G;
                NETWORK_CLASS_4_G = TelephonyManagerWrapper.NETWORK_CLASS_4_G;
            } else if (jvk.l()) {
                NETWORK_CLASS_2_G = ((Integer) c()).intValue();
                NETWORK_CLASS_3_G = ((Integer) d()).intValue();
                NETWORK_CLASS_4_G = ((Integer) e()).intValue();
            } else {
                Log.e("TelephonyManagerNative", "not supported before Q");
            }
        } catch (Throwable th) {
            Log.e("TelephonyManagerNative", th.toString());
        }
    }

    @RequiresApi(api = 30)
    public static String a(int i, int i2, int i3, String str) throws UnSupportedApiVersionException {
        if (!jvk.m()) {
            throw new UnSupportedApiVersionException("not supported before R");
        }
        Response responseD = ep6.o(new Request.b().c("android.telephony.TelephonyManager").b("getIccAuthenticationByEpona").d(NecBrowserActivity.SUB_ID, i).d(RequestCommonParamsUtils.kRequestParam_AppType, i2).d("authType", i3).g("data", str).a()).d();
        if (responseD.isSuccessful()) {
            return responseD.getBundle().getString("result");
        }
        Log.e("TelephonyManagerNative", responseD.getMessage());
        return null;
    }

    @RequiresApi(api = 30)
    public static String b(int i) throws UnSupportedApiVersionException {
        if (!jvk.m()) {
            throw new UnSupportedApiVersionException("not supported before R");
        }
        Response responseD = ep6.o(new Request.b().c("android.telephony.TelephonyManager").b("getSubscriberIdHasPara").d(NecBrowserActivity.SUB_ID, i).a()).d();
        if (responseD.isSuccessful()) {
            return responseD.getBundle().getString("result");
        }
        Log.e("TelephonyManagerNative", responseD.getMessage());
        return null;
    }

    public static Object c() {
        return arj.a();
    }

    public static Object d() {
        return arj.b();
    }

    public static Object e() {
        return arj.c();
    }
}
