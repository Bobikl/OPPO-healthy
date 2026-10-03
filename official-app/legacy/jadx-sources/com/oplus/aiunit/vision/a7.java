package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.service.common.constants.AcConstants;
import com.platform.usercenter.account.ams.ipc.RequestConstant;

/* JADX INFO: loaded from: classes19.dex */
public class a7 {
    public static ContentObserver a = null;
    public static HandlerThread b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Handler f9214c = null;
    public static volatile int d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile int f9215e = -1;
    public static volatile int f = -1;
    public static volatile String g;

    public class a extends ContentObserver {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Uri b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f9216c;
        public final /* synthetic */ Uri d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Uri f9217e;
        public final /* synthetic */ Uri f;
        public final /* synthetic */ Uri g;
        public final /* synthetic */ Uri h;
        public final /* synthetic */ Uri i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Handler handler, Context context, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, Uri uri7, Uri uri8) {
            super(handler);
            this.a = context;
            this.b = uri;
            this.f9216c = uri2;
            this.d = uri3;
            this.f9217e = uri4;
            this.f = uri5;
            this.g = uri6;
            this.h = uri7;
            this.i = uri8;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, @Nullable Uri uri) {
            if (uri == null) {
                AcLogUtil.e("AcAccountUtils", "observerSystemSettings uri is null");
                return;
            }
            AcLogUtil.i("AcAccountUtils", "observerSystemSettings onChange uri: " + uri);
            if (a7.o(this.a)) {
                if (uri.equals(this.b)) {
                    int unused = a7.f = -1;
                    return;
                }
                if (uri.equals(this.f9216c)) {
                    int unused2 = a7.f9215e = -1;
                    return;
                } else if (uri.equals(this.d)) {
                    int unused3 = a7.d = -1;
                    return;
                } else {
                    if (uri.equals(this.f9217e)) {
                        String unused4 = a7.g = null;
                        return;
                    }
                    return;
                }
            }
            if (uri.equals(this.f)) {
                int unused5 = a7.f = -1;
                return;
            }
            if (uri.equals(this.g)) {
                int unused6 = a7.f9215e = -1;
            } else if (uri.equals(this.h)) {
                int unused7 = a7.d = -1;
            } else if (uri.equals(this.i)) {
                String unused8 = a7.g = null;
            }
        }
    }

    public static int f(Context context) {
        if (!l7.e(context)) {
            AcLogUtil.i("AcAccountUtils", "getAccountIdTokenHash not support read idToken hash");
            return 0;
        }
        try {
            if (f9215e == -1) {
                f9215e = w(context, RequestConstant.SETTING_KEY_ID_TOKEN_HASH);
            }
            return f9215e;
        } catch (Exception e2) {
            AcLogUtil.e("AcAccountUtils", "getAccountIdTokenHash e: " + e2.getMessage());
            return 0;
        }
    }

    public static int g(Context context) {
        if (!l7.e(context)) {
            AcLogUtil.i("AcAccountUtils", "not support read userinfo hash");
            return 0;
        }
        try {
            if (d == -1) {
                d = w(context, RequestConstant.SETTING_KEY_USERINFO_HASH);
            }
            return d;
        } catch (Throwable th) {
            AcLogUtil.e("AcAccountUtils", "getAccountInfoHash error", th);
            return 0;
        }
    }

    public static int h(Context context) {
        try {
            String strC = b8.b().c(context);
            if (TextUtils.isEmpty(strC)) {
                AcLogUtil.e("AcAccountUtils", "ac pkg is old version, not support");
                return 0;
            }
            Bundle bundleA = m7.a(context, strC);
            if (bundleA != null && !"support".equals(bundleA.getString("is_support_settings_login_status"))) {
                AcLogUtil.e("AcAccountUtils", "isAccountLogin uc version not support");
                return 0;
            }
            if (f == -1) {
                f = w(context, RequestConstant.SETTING_KEY_LOGIN);
            }
            return f;
        } catch (Throwable th) {
            AcLogUtil.e("AcAccountUtils", "get login status error: " + th);
            return 0;
        }
    }

    public static String i(Context context) {
        String str = "";
        if (r(context)) {
            try {
                if (TextUtils.isEmpty(g)) {
                    g = x(context, RequestConstant.SETTINGS_SDK_CONFIG_KEY);
                }
                str = g;
            } catch (Throwable th) {
                AcLogUtil.e("AcAccountUtils", "getAccountInfoHash error", th);
            }
        } else {
            AcLogUtil.e("AcAccountUtils", "sdkConfigSetting account app version not support");
            str = (String) da.e().a(context).b("SP_KEY_SDK_CONFIG", "");
        }
        return u(context, str);
    }

    public static boolean j(Context context) {
        try {
            int iF = f(context);
            if (iF == 0) {
                AcLogUtil.i("AcAccountUtils", "isAccountChange ac version is not support");
                return false;
            }
            String strM = aa.B().m(context);
            if (strM == null) {
                return s(context, iF);
            }
            return Integer.parseInt(strM) != iF;
        } catch (Exception e2) {
            AcLogUtil.e("AcAccountUtils", "isAccountChange e:" + e2.getMessage());
            return false;
        }
    }

    public static boolean k(Context context) {
        int iG = g(context);
        if (iG == 0) {
            AcLogUtil.i("AcAccountUtils", "isAccountInfoChanged ac version is not support");
            return true;
        }
        Integer numK = aa.B().k(context);
        return numK == null || numK.intValue() != iG;
    }

    public static boolean l(Context context) {
        return AcConstants.b.PACKAGE_NAME_NEW_ACCOUNT.equals(l7.a(context));
    }

    public static boolean m(Context context) {
        Bundle bundleA = m7.a(context, AcConstants.b.a());
        if (bundleA == null) {
            AcLogUtil.e("AcAccountUtils", "metadata bundle is null");
            return false;
        }
        boolean z = bundleA.getBoolean("UseAccountIdSdk");
        AcLogUtil.i("AcAccountUtils", "isNewSellMode isSupport: " + z);
        return z;
    }

    public static boolean n(Context context) {
        return AcConstants.b.PACKAGE_NAME_OPS_ACCOUNT.equals(l7.a(context));
    }

    public static boolean o(Context context) {
        Bundle bundleA;
        try {
            String strY = y(context);
            return (TextUtils.isEmpty(strY) || (bundleA = m7.a(context, strY)) == null || !"support".equals(bundleA.getString("is_read_account_settings_secure"))) ? false : true;
        } catch (Throwable th) {
            AcLogUtil.e("AcAccountUtils", "isReadAccountSettingsFromSecure error", th);
            return false;
        }
    }

    public static boolean p(Context context) {
        Bundle bundleA = m7.a(context, l7.a(context));
        if (bundleA == null || !"support".equals(bundleA.getString("is_support_multi_login_page"))) {
            return false;
        }
        AcLogUtil.e("AcAccountUtils", "is_support_multi_login_page account app version not support");
        return true;
    }

    public static boolean q(Context context) {
        Bundle bundleA = m7.a(context, l7.a(context));
        if (bundleA == null || !"support".equals(bundleA.getString("is_support_refresh_v1_background"))) {
            return false;
        }
        AcLogUtil.e("AcAccountUtils", "is_support_refresh_v1_background account app version not support");
        return true;
    }

    public static boolean r(Context context) {
        Bundle bundleA = m7.a(context, l7.a(context));
        return bundleA != null && bundleA.getBoolean("sdkConfigSetting");
    }

    public static boolean s(Context context, int i) {
        aa.B().w(context, i);
        return aa.B().m(context) != null;
    }

    public static String t(String str, String str2) {
        JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
        JsonObject asJsonObject2 = JsonParser.parseString(str2).getAsJsonObject();
        for (String str3 : asJsonObject2.keySet()) {
            asJsonObject.add(str3, asJsonObject2.get(str3));
        }
        return asJsonObject.toString();
    }

    public static String u(Context context, String str) {
        try {
            String strA = s8.a(context, "app_req_feq_config.json");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strA)) {
                AcLogUtil.i("AcAccountUtils", "merge json");
                str = t(strA, str);
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            AcLogUtil.i("AcAccountUtils", "read default json");
            return strA;
        } catch (Throwable th) {
            AcLogUtil.e("AcAccountUtils", "getSdkConfigBefore914 fail", th);
            return "";
        }
    }

    public static void v(Context context) {
        Context applicationContext = context.getApplicationContext();
        Uri uriFor = Settings.System.getUriFor(RequestConstant.SETTING_KEY_LOGIN);
        Uri uriFor2 = Settings.Secure.getUriFor(RequestConstant.SETTING_KEY_LOGIN);
        Uri uriFor3 = Settings.System.getUriFor(RequestConstant.SETTING_KEY_ID_TOKEN_HASH);
        Uri uriFor4 = Settings.Secure.getUriFor(RequestConstant.SETTING_KEY_ID_TOKEN_HASH);
        Uri uriFor5 = Settings.System.getUriFor(RequestConstant.SETTING_KEY_USERINFO_HASH);
        Uri uriFor6 = Settings.Secure.getUriFor(RequestConstant.SETTING_KEY_USERINFO_HASH);
        Uri uriFor7 = Settings.System.getUriFor(RequestConstant.SETTINGS_SDK_CONFIG_KEY);
        Uri uriFor8 = Settings.Secure.getUriFor(RequestConstant.SETTINGS_SDK_CONFIG_KEY);
        if (a != null) {
            applicationContext.getContentResolver().unregisterContentObserver(a);
            a = null;
            AcLogUtil.i("AcAccountUtils", "observerSystemSettings unregister old observer");
        }
        HandlerThread handlerThread = b;
        if (handlerThread == null || !handlerThread.isAlive()) {
            HandlerThread handlerThread2 = new HandlerThread("ac-settings-observer");
            b = handlerThread2;
            handlerThread2.start();
            f9214c = new Handler(b.getLooper());
            AcLogUtil.i("AcAccountUtils", "observerSystemSettings create observer thread");
        }
        a = new a(f9214c, applicationContext, uriFor2, uriFor4, uriFor6, uriFor8, uriFor, uriFor3, uriFor5, uriFor7);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        contentResolver.registerContentObserver(uriFor, false, a);
        contentResolver.registerContentObserver(uriFor2, false, a);
        contentResolver.registerContentObserver(uriFor3, false, a);
        contentResolver.registerContentObserver(uriFor4, false, a);
        contentResolver.registerContentObserver(uriFor5, false, a);
        contentResolver.registerContentObserver(uriFor6, false, a);
        contentResolver.registerContentObserver(uriFor7, false, a);
        contentResolver.registerContentObserver(uriFor8, false, a);
    }

    public static int w(Context context, String str) throws Settings.SettingNotFoundException {
        return o(context) ? Settings.Secure.getInt(context.getContentResolver(), str) : Settings.System.getInt(context.getContentResolver(), str);
    }

    @Nullable
    public static String x(Context context, String str) {
        return o(context) ? Settings.Secure.getString(context.getContentResolver(), str) : Settings.System.getString(context.getContentResolver(), str);
    }

    public static String y(Context context) {
        String strC = b8.b().c(context);
        return !TextUtils.isEmpty(strC) ? strC : l7.a(context);
    }
}
