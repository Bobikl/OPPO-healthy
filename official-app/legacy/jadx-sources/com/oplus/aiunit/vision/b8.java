package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.text.TextUtils;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.service.account.trace.AcIdTraceManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class b8 {
    public final ArrayList<la> a;
    public Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9636c;

    public static class a {
        public static final b8 a = new b8(null);
    }

    public /* synthetic */ b8(a8 a8Var) {
        this();
    }

    public static b8 b() {
        return a.a;
    }

    public final void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            AcLogUtil.e("BinderProvider", "cacheFbeTraceEvent appI is empty");
            return;
        }
        try {
            AcIdTraceManager.getInstance(context).cacheFbeTrace(AcBaseTraceHelper.createTraceId("fbe_mode"), str, fj.a(context != null ? context.getPackageName() : ""));
        } catch (Throwable th) {
            AcLogUtil.e("BinderProvider", "cacheFbeTraceEvent error", th);
        }
    }

    public String c(Context context) {
        if (d(context)) {
            return this.f9636c;
        }
        return null;
    }

    public boolean d(Context context) {
        return e(context, "");
    }

    public boolean e(Context context, String str) {
        boolean z;
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (m8.e(context)) {
            z = pi.g(context) != null;
            AcLogUtil.i("BinderProvider", "isProviderExist in FBE mode, result: " + z + " (not cached)");
            a(context, str);
            return z;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ProviderInfo providerInfoG = pi.g(context);
        z = providerInfoG != null;
        this.f9636c = z ? providerInfoG.packageName : null;
        AcLogUtil.i("BinderProvider", "isProviderExist: " + z + ", cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", pkg: " + this.f9636c);
        this.b = Boolean.valueOf(z);
        return z;
    }

    public b8() {
        this.a = new ArrayList<>();
    }
}
