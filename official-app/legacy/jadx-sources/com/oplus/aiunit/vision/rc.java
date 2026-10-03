package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.config.AcOpenCoreConfig;
import com.platform.usercenter.account.ams.ipc.AcBasicInfoBean;
import com.platform.usercenter.account.ams.ipc.AcResultHelper;

/* JADX INFO: loaded from: classes6.dex */
public class rc implements ll9 {
    public static volatile String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f16165c;
    public static final Object d = new Object();
    public final String a = "AcOpenBaseIpcExecutor";

    public static void d(final Context context) {
        if (context == null) {
            return;
        }
        Object obj = d;
        synchronized (obj) {
            if (TextUtils.isEmpty(b)) {
                if (f16165c) {
                    return;
                }
                f16165c = true;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    zj.a().g(new Runnable() { // from class: com.oplus.aiunit.vision.qc
                        @Override // java.lang.Runnable
                        public final void run() {
                            rc.g(context);
                        }
                    });
                    return;
                }
                try {
                    if (!TextUtils.isEmpty(b)) {
                        synchronized (obj) {
                            f16165c = false;
                        }
                        return;
                    }
                    String strA = mg.a(context);
                    if (!TextUtils.isEmpty(strA)) {
                        b = strA;
                    }
                    synchronized (obj) {
                        f16165c = false;
                    }
                } catch (Throwable th) {
                    synchronized (d) {
                        f16165c = false;
                        throw th;
                    }
                }
            }
        }
    }

    public static void e(Bundle bundle) {
        if (bundle == null || TextUtils.isEmpty(b)) {
            return;
        }
        bundle.putString(AcResultHelper.KEY_SDK_CONFIG, b);
    }

    public static /* synthetic */ void g(Context context) {
        try {
            if (!TextUtils.isEmpty(b)) {
                synchronized (d) {
                    f16165c = false;
                }
            } else {
                String strA = mg.a(context.getApplicationContext());
                if (!TextUtils.isEmpty(strA)) {
                    b = strA;
                }
                synchronized (d) {
                    f16165c = false;
                }
            }
        } catch (Throwable th) {
            synchronized (d) {
                f16165c = false;
                throw th;
            }
        }
    }

    public static void h(ResultReceiver resultReceiver, int i, String str) {
        Bundle failResult = AcResultHelper.getFailResult(str);
        e(failResult);
        AcResultHelper.sendResult(resultReceiver, i, failResult);
    }

    public static void i(ResultReceiver resultReceiver, Bundle bundle) {
        e(bundle);
        AcResultHelper.sendSuccessResult(resultReceiver, bundle);
    }

    @Override // com.oplus.aiunit.vision.ll9
    public void a(Context context, AcBasicInfoBean acBasicInfoBean, @Nullable String str, @Nullable String str2, ResultReceiver resultReceiver) {
        c(context, acBasicInfoBean);
    }

    public void c(Context context, AcBasicInfoBean acBasicInfoBean) {
        if (uc.c().a() == null) {
            AcLogUtil.i("AcOpenBaseIpcExecutor", "checkConfig is isEmpty", true);
            String strF = qj.c(context).f("country", "");
            String strF2 = qj.c(context).f("brand", "");
            boolean zA = qj.c(context).a(gd.STR_ISHOST);
            if (TextUtils.isEmpty(strF) || TextUtils.isEmpty(strF2)) {
                AcLogUtil.i("AcOpenBaseIpcExecutor", "checkConfig country =" + strF + ", brand =" + strF2, true);
                return;
            }
            uc.c().d(new AcOpenCoreConfig("", "", strF, strF2, zA));
        }
        if (acBasicInfoBean != null) {
            uc.c().e(acBasicInfoBean);
        }
    }

    public boolean f() {
        return true;
    }
}
