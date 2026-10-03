package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.oplus.accountsdk.base.common.util.AcLogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class ye {
    public static volatile ye d;
    public Context a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18988c;

    public ye(Context context) {
        this.a = context.getApplicationContext();
    }

    public static ye b(Context context) {
        if (d == null) {
            synchronized (ye.class) {
                if (d == null) {
                    d = new ye(context);
                }
            }
        }
        return d;
    }

    @WorkerThread
    public synchronized String a() {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        try {
            c();
            this.b = poi.i(this.a, ooi.Type_DUID).a();
            AcLogUtil.i("AcOpenIdHelper", "getDuid finish! duid is null? " + TextUtils.isEmpty(this.b));
        } catch (Exception e2) {
            AcLogUtil.e("AcOpenIdHelper", "getDuid error: " + e2);
        }
        return this.b;
    }

    public final void c() {
        if (this.f18988c) {
            return;
        }
        AcLogUtil.i("AcOpenIdHelper", "initStdId");
        try {
            poi.j(this.a);
            this.f18988c = true;
            AcLogUtil.i("AcOpenIdHelper", "init stdid finish");
        } catch (Exception unused) {
            AcLogUtil.e("AcOpenIdHelper", "init stdid fail!");
        }
    }
}
