package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.oplus.aiunit.vision.j3n;
import com.oplus.aiunit.vision.l9m;
import com.oplus.aiunit.vision.qam;
import com.oplus.aiunit.vision.sgm;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AlipayResultActivity extends Activity {
    public static final ConcurrentHashMap<String, a> a = new ConcurrentHashMap<>();

    public interface a {
        void a(int i, String str, String str2);
    }

    public final void a(String str, Bundle bundle) {
        a aVarRemove = a.remove(str);
        if (aVarRemove == null) {
            finish();
            return;
        }
        try {
            aVarRemove.a(bundle.getInt("endCode"), bundle.getString(j3n.b), bundle.getString("result"));
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Throwable th;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            try {
                String stringExtra = intent.getStringExtra("session");
                Bundle bundleExtra = intent.getBundleExtra("result");
                String stringExtra2 = intent.getStringExtra("scene");
                qam qamVarB = qam.a.b(stringExtra);
                if (qamVarB == null) {
                    finish();
                    return;
                }
                l9m.c(qamVarB, sgm.f16581l, "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    a(stringExtra, bundleExtra);
                    return;
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        stringExtra = jSONObject.getString("session");
                        l9m.c(qamVarB, sgm.f16581l, "BSPUriSession", stringExtra);
                        Bundle bundle2 = new Bundle();
                        try {
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                bundle2.putString(next, jSONObject2.getString(next));
                            }
                            bundleExtra = bundle2;
                        } catch (Throwable th2) {
                            th = th2;
                            bundleExtra = bundle2;
                            l9m.d(qamVarB, sgm.f16581l, "BSPResEx", th);
                            l9m.d(qamVarB, sgm.f16581l, sgm.s0, th);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    l9m.g(this, qamVarB, "", qamVarB.d);
                    finish();
                    return;
                }
                try {
                    l9m.c(qamVarB, sgm.f16581l, sgm.V, "" + SystemClock.elapsedRealtime());
                    l9m.c(qamVarB, sgm.f16581l, sgm.W, bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString(j3n.b, "-"));
                    OpenAuthTask.a(stringExtra, 9000, "OK", bundleExtra);
                } finally {
                    l9m.g(this, qamVarB, "", qamVarB.d);
                    finish();
                }
            } catch (Throwable th4) {
                l9m.d(null, sgm.f16581l, "BSPSerError", th4);
                l9m.d(null, sgm.f16581l, sgm.r0, th4);
                finish();
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
