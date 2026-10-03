package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.oplus.aiunit.vision.l9m;
import com.oplus.aiunit.vision.qam;
import com.oplus.aiunit.vision.qgm;
import com.oplus.aiunit.vision.sgm;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class APayEntranceActivity extends Activity {
    public static final String d = "ap_order_info";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f579e = "ap_target_packagename";
    public static final String f = "ap_session";
    public static final String g = "ap_local_info";
    public static final ConcurrentHashMap<String, a> h = new ConcurrentHashMap<>();
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f580j;
    public qam k;

    public interface a {
        void a(String str);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.f580j;
        l9m.c(this.k, sgm.f16581l, "BSAFinish", str + "|" + TextUtils.isEmpty(this.i));
        if (TextUtils.isEmpty(this.i)) {
            this.i = qgm.a();
            qam qamVar = this.k;
            if (qamVar != null) {
                qamVar.l(true);
            }
        }
        if (str != null) {
            a aVarRemove = h.remove(str);
            if (aVarRemove != null) {
                aVarRemove.a(this.i);
            } else {
                l9m.h(this.k, "wr", "refNull", "session=" + str);
            }
        }
        try {
            super.finish();
        } catch (Throwable th) {
            l9m.d(this.k, "wr", "APStartFinish", th);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        l9m.c(this.k, sgm.f16581l, "BSAOnAR", this.f580j + "|" + i + "," + i2);
        if (i == 1000) {
            if (intent != null) {
                try {
                    this.i = intent.getStringExtra("result");
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString(d);
            String string2 = extras.getString(f579e);
            this.f580j = extras.getString(f);
            String string3 = extras.getString(g, "{}");
            if (!TextUtils.isEmpty(this.f580j)) {
                qam qamVarB = qam.a.b(this.f580j);
                this.k = qamVarB;
                l9m.c(qamVarB, sgm.f16581l, "BSAEntryCreate", this.f580j + "|" + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th) {
                l9m.d(this.k, "wr", "APStartEx", th);
                finish();
            }
            if (this.k != null) {
                Context applicationContext = getApplicationContext();
                qam qamVar = this.k;
                l9m.a(applicationContext, qamVar, string, qamVar.d);
                this.k.g(true);
            }
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    @SensorsDataInstrumented
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PushAutoTrackHelper.onNewIntent(this, intent);
    }
}
