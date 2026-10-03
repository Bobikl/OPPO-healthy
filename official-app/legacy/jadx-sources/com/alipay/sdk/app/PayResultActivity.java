package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.oplus.aiunit.vision.l9m;
import com.oplus.aiunit.vision.qam;
import com.oplus.aiunit.vision.qgm;
import com.oplus.aiunit.vision.qrm;
import com.oplus.aiunit.vision.sgm;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class PayResultActivity extends Activity {
    public static final String b = "{\"isLogin\":\"false\"}";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap<String, Object> f586c = new HashMap<>();
    public static final String d = "hk.alipay.wallet";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f587e = "phonecashier.pay.hash";
    public static final String f = "orderSuffix";
    public static final String g = "externalPkgName";
    public static final String h = "phonecashier.pay.result";
    public static final String i = "phonecashier.pay.resultOrderHash";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qam f588j = null;

    public static class a implements Runnable {
        public final /* synthetic */ Activity i;

        public a(Activity activity) {
            this.i = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.i.finish();
        }
    }

    public static final class b {
        public static volatile String a;
        public static volatile String b;
    }

    public static void a(Activity activity, int i2) {
        new Handler().postDelayed(new a(activity), i2);
    }

    public static void b(Activity activity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent();
        try {
            intent.setPackage("hk.alipay.wallet");
            intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
        } catch (UnsupportedEncodingException e2) {
            qrm.d(e2);
        }
        if (activity != null) {
            try {
                activity.startActivity(intent);
            } catch (Throwable unused) {
                activity.finish();
            }
        }
    }

    public static void c(String str) {
        b.b = qgm.a();
        e(f586c, str);
    }

    public static void d(String str, String str2) {
        b.b = str;
        e(f586c, str2);
    }

    public static boolean e(HashMap<String, Object> map, String str) {
        Object obj;
        if (map == null || str == null || (obj = map.get(str)) == null) {
            return false;
        }
        synchronized (obj) {
            obj.notifyAll();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra(f))) {
                b.a = intent.getStringExtra(f587e);
                String stringExtra = intent.getStringExtra(f);
                String stringExtra2 = intent.getStringExtra(g);
                qam qamVarA = qam.a.a(intent);
                this.f588j = qamVarA;
                if (qamVarA == null) {
                    finish();
                }
                b(this, b.a, stringExtra, stringExtra2);
                a(this, 300);
                return;
            }
            if (this.f588j == null) {
                finish();
            }
            String stringExtra3 = intent.getStringExtra(h);
            int intExtra = intent.getIntExtra(i, 0);
            if (intExtra != 0 && TextUtils.equals(b.a, String.valueOf(intExtra))) {
                if (TextUtils.isEmpty(stringExtra3)) {
                    c(b.a);
                } else {
                    d(stringExtra3, b.a);
                }
                b.a = "";
                a(this, 300);
                return;
            }
            l9m.h(this.f588j, sgm.f16581l, sgm.l0, "Expected " + b.a + ", got " + intExtra);
            c(b.a);
            a(this, 300);
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
