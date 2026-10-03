package com.oplus.aiunit.vision;

import android.net.wifi.WifiConfiguration;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.oplus.compat.utils.util.UnSupportedApiVersionException;
import com.oplus.epona.Request;
import com.oplus.epona.Response;
import com.oplus.utils.reflect.MethodName;
import com.oplus.utils.reflect.RefClass;
import com.oplus.utils.reflect.RefInt;
import com.oplus.utils.reflect.RefMethod;
import com.oplus.utils.reflect.RefObject;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gwl {

    @RequiresApi(api = 30)
    public static String EXTRA_WIFI_AP_FAILURE_DESCRIPTION;

    @RequiresApi(api = 21)
    public static String EXTRA_WIFI_AP_STATE;

    @RequiresApi(api = 30)
    public static String WIFI_AP_FAILURE_DESC_NO_5GHZ_SUPPORT;

    @RequiresApi(api = 21)
    public static int WIFI_AP_STATE_ENABLED;

    @RequiresApi(api = 21)
    public static int WIFI_AP_STATE_FAILED;

    @RequiresApi(api = 30)
    public static String WIFI_COUNTRY_CODE_CHANGED_ACTION;

    @RequiresApi(api = 29)
    public static int WIFI_GENERATION_4;

    @RequiresApi(api = 29)
    public static int WIFI_GENERATION_5;

    @RequiresApi(api = 29)
    public static int WIFI_GENERATION_6;

    @RequiresApi(api = 29)
    public static int WIFI_GENERATION_DEFAULT;

    public static class a {
        private static RefInt WIFI_GENERATION_4;
        private static RefInt WIFI_GENERATION_5;
        private static RefInt WIFI_GENERATION_6;
        private static RefInt WIFI_GENERATION_DEFAULT;

        static {
            if (!jvk.l() || jvk.m()) {
                return;
            }
            RefClass.load((Class<?>) a.class, "android.net.wifi.WifiManager");
        }
    }

    public static class b {
        private static RefObject<String> EXTRA_WIFI_AP_FAILURE_DESCRIPTION;
        private static RefObject<String> WIFI_AP_FAILURE_DESC_NO_5GHZ_SUPPORT;
        private static RefObject<String> WIFI_COUNTRY_CODE_CHANGED_ACTION;

        @MethodName(params = {boolean.class})
        private static RefMethod<Void> enableWifiCoverageExtendFeature;
        private static RefMethod<Boolean> isExtendingWifi;
        private static RefMethod<Boolean> isWifiCoverageExtendFeatureEnabled;

        static {
            if (!jvk.m() || jvk.n()) {
                return;
            }
            RefClass.load((Class<?>) b.class, "android.net.wifi.WifiManager");
        }
    }

    static {
        try {
            if (!jvk.n()) {
                if (jvk.m()) {
                    EXTRA_WIFI_AP_FAILURE_DESCRIPTION = (String) b.EXTRA_WIFI_AP_FAILURE_DESCRIPTION.get(null);
                    WIFI_COUNTRY_CODE_CHANGED_ACTION = (String) b.WIFI_COUNTRY_CODE_CHANGED_ACTION.get(null);
                    WIFI_AP_FAILURE_DESC_NO_5GHZ_SUPPORT = (String) b.WIFI_AP_FAILURE_DESC_NO_5GHZ_SUPPORT.get(null);
                } else {
                    if (!jvk.l()) {
                        throw new UnSupportedApiVersionException();
                    }
                    WIFI_GENERATION_DEFAULT = a.WIFI_GENERATION_DEFAULT.get(null);
                    WIFI_GENERATION_4 = a.WIFI_GENERATION_4.get(null);
                    WIFI_GENERATION_5 = a.WIFI_GENERATION_5.get(null);
                    WIFI_GENERATION_6 = a.WIFI_GENERATION_6.get(null);
                }
            }
            if (jvk.f()) {
                EXTRA_WIFI_AP_STATE = "wifi_state";
                WIFI_AP_STATE_FAILED = 14;
                WIFI_AP_STATE_ENABLED = 13;
            }
        } catch (Throwable th) {
            Log.e("WifiManagerNative", th.toString());
        }
    }

    @RequiresApi(api = 30)
    @Deprecated
    public static List<WifiConfiguration> a() throws UnSupportedApiVersionException {
        if (jvk.n()) {
            throw new UnSupportedApiVersionException("not supported upper S");
        }
        if (!jvk.m()) {
            throw new UnSupportedApiVersionException("Not Supported Before R");
        }
        Response responseD = ep6.o(new Request.b().c("android.net.wifi.WifiManager").b("getPrivilegedConfiguredNetWorks").a()).d();
        return responseD.isSuccessful() ? responseD.getBundle().getParcelableArrayList("result") : Collections.emptyList();
    }
}
