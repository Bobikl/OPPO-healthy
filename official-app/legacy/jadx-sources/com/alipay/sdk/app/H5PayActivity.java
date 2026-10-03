package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.alipay.sdk.m.u.a;
import com.alipay.sdk.m.x.c;
import com.alipay.sdk.m.x.d;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.h9m;
import com.oplus.aiunit.vision.l9m;
import com.oplus.aiunit.vision.qam;
import com.oplus.aiunit.vision.qgm;
import com.oplus.aiunit.vision.qrm;
import com.oplus.aiunit.vision.rom;
import com.oplus.aiunit.vision.sgm;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class H5PayActivity extends Activity {
    public c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f582j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f583l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f584n;
    public String o;
    public WeakReference<qam> p;

    public void a() {
        Object obj = PayTask.h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    public final void b() {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable th) {
            qrm.d(th);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        a();
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1010) {
            rom.a((qam) a.i(this.p), i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c cVar = this.i;
        if (cVar == null) {
            finish();
            return;
        }
        if (cVar.l()) {
            cVar.m();
            return;
        }
        if (!cVar.m()) {
            super.onBackPressed();
        }
        qgm.c(qgm.a());
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        b();
        super.onCreate(bundle);
        try {
            qam qamVarA = qam.a.a(getIntent());
            if (qamVarA == null) {
                finish();
                return;
            }
            this.p = new WeakReference<>(qamVarA);
            if (h9m.I().E()) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.f582j = string;
                if (!a.T(string)) {
                    finish();
                    return;
                }
                this.f583l = extras.getString(HttpConst.COOKIE, null);
                this.k = extras.getString("method", null);
                this.m = extras.getString("title", null);
                this.o = extras.getString("version", "v1");
                this.f584n = extras.getBoolean("backisexit", false);
                try {
                    d dVar = new d(this, qamVarA, this.o);
                    setContentView(dVar);
                    dVar.r(this.m, this.k, this.f584n);
                    dVar.k(this.f582j, this.f583l);
                    dVar.p(this.f582j);
                    this.i = dVar;
                } catch (Throwable th) {
                    l9m.d(qamVarA, sgm.f16581l, "GetInstalledAppEx", th);
                    finish();
                }
            } catch (Exception unused) {
                finish();
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.i;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // android.app.Activity
    @SensorsDataInstrumented
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PushAutoTrackHelper.onNewIntent(this, intent);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            try {
                l9m.d((qam) a.i(this.p), sgm.f16581l, sgm.B, th);
            } catch (Throwable unused) {
            }
        }
    }
}
