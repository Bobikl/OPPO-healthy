package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.net.bean.AcVerifyUrlConfigResponse;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class we {
    public static void b(final Context context) {
        zj.a().g(new Runnable() { // from class: com.oplus.aiunit.vision.ve
            @Override // java.lang.Runnable
            public final void run() {
                we.f(context);
            }
        });
    }

    public static String c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return String.format(Locale.US, str, str2, str3);
    }

    @WorkerThread
    public static String d(@NonNull Context context, @NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            AcLogUtil.e("AcOpenH5UrlHelper", "getUrl: urlKey is empty");
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        String strB = xe.b(applicationContext, str);
        if (!TextUtils.isEmpty(strB)) {
            AcLogUtil.i("AcOpenH5UrlHelper", "getUrl: SP cache hit, key=" + str);
            b(applicationContext);
            return strB;
        }
        AcLogUtil.i("AcOpenH5UrlHelper", "getUrl: SP cache miss, key=" + str + ", sync fetch from server");
        if (g(applicationContext)) {
            return xe.b(applicationContext, str);
        }
        AcLogUtil.e("AcOpenH5UrlHelper", "getUrl: sync fetch failed, key=" + str);
        return null;
    }

    @WorkerThread
    public static String e(@NonNull Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return c(d(context, gd.KEY_VERIFICATION_URL), str, str2);
        }
        AcLogUtil.e("AcOpenH5UrlHelper", "getVerifyUrl: sceneId is empty");
        return null;
    }

    public static /* synthetic */ void f(Context context) {
        AcLogUtil.i("AcOpenH5UrlHelper", "asyncRefreshCache: start");
        g(context);
    }

    @WorkerThread
    public static boolean g(Context context) {
        try {
            AcSdkNetResponse<AcVerifyUrlConfigResponse, Object> acSdkNetResponseA = w8.a(context, xe.c(context));
            if (acSdkNetResponseA.isSuccess() && acSdkNetResponseA.getData() != null) {
                AcVerifyUrlConfigResponse data = acSdkNetResponseA.getData();
                Map<String, String> businessUrlConfig = data.getBusinessUrlConfig();
                String version = data.getVersion();
                if (businessUrlConfig != null && !businessUrlConfig.isEmpty()) {
                    xe.d(context, version, businessUrlConfig);
                    AcLogUtil.i("AcOpenH5UrlHelper", "syncFetch success, version=" + version + ", urlMap size=" + businessUrlConfig.size());
                    return true;
                }
                AcLogUtil.e("AcOpenH5UrlHelper", "syncFetch: urlMap is empty");
                return false;
            }
            AcLogUtil.e("AcOpenH5UrlHelper", "syncFetch failed, urlConfigNet=" + acSdkNetResponseA);
            return false;
        } catch (Exception e2) {
            AcLogUtil.e("AcOpenH5UrlHelper", "syncFetch exception", e2);
            return false;
        }
    }
}
