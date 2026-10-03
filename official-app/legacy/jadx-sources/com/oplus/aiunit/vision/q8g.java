package com.oplus.aiunit.vision;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.health.devicemanager.devicetype.constants.Constants;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class q8g {
    public static final String TAG = "openSDK_LOG";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f15674c = false;
    public static q8g instance;
    public a4k a;
    public mcm b = new mcm(new kim(a(), gmm.m, gmm.g, gmm.h, gmm.f11819c, gmm.i, 10, gmm.f11820e, gmm.f11823n));

    public static File a() {
        String str = gmm.d;
        try {
            tpm.c cVarB = tpm.b.b();
            return cVarB != null && (cVarB.g() > gmm.f ? 1 : (cVarB.g() == gmm.f ? 0 : -1)) > 0 ? new File(Environment.getExternalStorageDirectory(), str) : new File(uum.e(), str);
        } catch (Throwable th) {
            g(TAG, "getLogFilePath:", th);
            return null;
        }
    }

    public static final void d(String str, String str2) {
        h().c(2, str, str2, null);
    }

    public static final void e(String str, String str2, Throwable th) {
        h().c(2, str, str2, th);
    }

    public static final void f(String str, String str2) {
        h().c(16, str, str2, null);
    }

    public static final void g(String str, String str2, Throwable th) {
        h().c(16, str, str2, th);
    }

    public static q8g h() {
        if (instance == null) {
            synchronized (q8g.class) {
                if (instance == null) {
                    instance = new q8g();
                    f15674c = true;
                }
            }
        }
        return instance;
    }

    public static final void i(String str, String str2) {
        h().c(4, str, str2, null);
    }

    public static final void j(String str, String str2) {
        h().c(1, str, str2, null);
    }

    public static final void k(String str, String str2) {
        h().c(8, str, str2, null);
    }

    public final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return tpm.b(str) ? Constants.TREADMILL_MODEL_EX : str;
    }

    public void c(int i, String str, String str2, Throwable th) {
        if (f15674c) {
            String strD = uum.d();
            if (!TextUtils.isEmpty(strD)) {
                String str3 = strD + " SDK_VERSION:" + s04.SDK_VERSION;
                if (this.b == null) {
                    return;
                }
                gsm.a.b(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                this.b.b(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                f15674c = false;
            }
        }
        gsm.a.b(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
        if (tpm.a.a(gmm.b, i)) {
            mcm mcmVar = this.b;
            if (mcmVar == null) {
                return;
            } else {
                mcmVar.b(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
            }
        }
        a4k a4kVar = this.a;
        if (a4kVar != null) {
            try {
                a4kVar.b(i, Thread.currentThread(), System.currentTimeMillis(), str, b(str2), th);
            } catch (Exception e2) {
                Log.e(str, "Exception", e2);
            }
        }
    }
}
