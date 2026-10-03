package com.oplus.statistics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.statistics.OTrackContext;
import com.oplus.statistics.util.ApkInfoUtil;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class OTrackContext {
    public static Map<String, OTrackContext> d = new HashMap();
    public final String a;

    @NonNull
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OTrackConfig f20089c;

    public OTrackContext(String str, @NonNull Context context, @Nullable OTrackConfig oTrackConfig) {
        this.a = str;
        this.b = context;
        this.f20089c = oTrackConfig != null ? c(context, oTrackConfig) : b(context);
    }

    public static synchronized OTrackContext createIfNeed(String str, @NonNull Context context, @Nullable OTrackConfig oTrackConfig) {
        OTrackContext oTrackContext;
        oTrackContext = get(str);
        if (oTrackContext == null) {
            oTrackContext = new OTrackContext(str, context, oTrackConfig);
            d.put(str, oTrackContext);
        }
        return oTrackContext;
    }

    public static /* synthetic */ String d() {
        return "createDefaultConfig PackageManager.NameNotFoundException.";
    }

    @Nullable
    public static synchronized OTrackContext get(String str) {
        return d.get(str);
    }

    public final OTrackConfig b(Context context) {
        PackageInfo packageInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.w("OTrackContext", new Supplier() { // from class: com.oplus.aiunit.vision.t8d
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return OTrackContext.d();
                }
            });
            packageInfo = null;
        }
        return packageInfo == null ? OTrackConfig.DUMMY : new OTrackConfig.Builder().setPackageName(packageInfo.packageName).setVersionName(packageInfo.versionName).setAppName(packageInfo.applicationInfo.loadLabel(packageManager).toString()).build();
    }

    public final OTrackConfig c(Context context, OTrackConfig oTrackConfig) {
        if (TextUtils.isEmpty(oTrackConfig.getPackageName())) {
            oTrackConfig.setPackageName(ApkInfoUtil.getPackageName(context));
        }
        if (TextUtils.isEmpty(oTrackConfig.getVersionName())) {
            oTrackConfig.setVersionName(ApkInfoUtil.getVersionName(context));
        }
        if (TextUtils.isEmpty(oTrackConfig.getAppName())) {
            oTrackConfig.setAppName(ApkInfoUtil.getAppName(context));
        }
        return oTrackConfig;
    }

    public String getAppId() {
        return this.a;
    }

    @NonNull
    public OTrackConfig getConfig() {
        if (OTrackConfig.DUMMY.equals(this.f20089c)) {
            this.f20089c = b(this.b);
        }
        return this.f20089c;
    }

    @NonNull
    public Context getContext() {
        return this.b;
    }
}
