package com.oplus.aiunit.vision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.heytap.health.operations.R$string;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.wearable.support.watchface.common.Constants;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class sae {
    public static final String ACTION_PAY_RESPONSE = "nearme.pay.response";
    public static final String COUNTRY = "CN";
    public static final String CURRENCY = "CNY";
    public static final float EXCHANGE_RATIO = 1.0f;
    public static final float MIN_CHARGE_LIMIT = 0.01f;
    public static final float MIN_PAY_AMOUNT = 0.01f;
    public static final int OFFLINE_PAY_TYPE = 0;
    public static final String PARTNER_ID_WITH_OPPO_PAY = "72724320";
    public static final int PAY_TYPE = 2;
    public static final String SECURITY_PAY_OPLUS_PACKAGENAME = "com.oplus.pay";
    public static final String SECURITY_PAY_PACKAGENAME = "com.nearme.atlas";
    public static final String mSource = "health";
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f16519c;
    public BroadcastReceiver d;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("mPayResponseReceiver: intent: ");
                sb.append(intent.getAction());
                String stringExtra = intent.getStringExtra(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mPayResponseReceiver: response: ");
                sb2.append(stringExtra);
                qbe qbeVarA = qbe.a(stringExtra);
                if (sae.this.f16519c != null && qbeVarA != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("mPayResponseReceiver: mOnPayCallback: ");
                    sb3.append(sae.this.f16519c);
                    sae.this.f16519c.onPayResponse(new c(qbeVarA));
                }
                context.unregisterReceiver(this);
                sae.this.f16519c = null;
            } catch (Exception e2) {
                a7b.b("PayManager", "mPayResponseReceiver e:" + e2.getMessage());
            }
        }
    }

    public interface b {
        void onPayResponse(c cVar);
    }

    public static class c {
        public static final int CANCEL = 1;
        public static final int FAILED = 3;
        public static final int FAILED_NEAR_NOT_SUPPORT = 6;
        public static final int FAILED_PARAM_INVALID = 5;
        public static final int FAILED_TOO_FREQUENTLY = 4;
        public static final int SUCCESS = 0;
        public static final int UNKNOWN = 2;
        public int a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16520c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f16521e;
        public String f;
        public String g;

        public c(qbe qbeVar) {
            this.a = qbeVar.a;
            this.b = qbeVar.f15732c;
            this.f16520c = qbeVar.f;
            this.d = qbeVar.b;
            this.f16521e = qbeVar.d;
            this.f = qbeVar.f15733e;
            this.g = qbeVar.g;
        }

        public String toString() {
            return "PayInfo{errorCode=" + this.a + ", order='" + this.b + "', payChannel='" + this.f16520c + "', msg='" + this.d + "', prePayToken='" + this.f16521e + "', packageName='" + this.f + "', deepLink='" + this.g + "'}";
        }
    }

    public static class d {
        public static sae a = new sae();
    }

    public static sae h() {
        return d.a;
    }

    public static boolean k() {
        return ilj.B();
    }

    public static /* synthetic */ String l(Context context) {
        return !qe0.E() ? "1" : "0";
    }

    public final PreOrderParameters d(String str, String str2) {
        PreOrderParameters preOrderParameters = new PreOrderParameters();
        preOrderParameters.mAppVersion = j();
        preOrderParameters.mChannelId = "";
        preOrderParameters.mCurrencyName = CURRENCY;
        preOrderParameters.mCountryCode = "CN";
        preOrderParameters.mToken = i();
        preOrderParameters.prePayToken = str;
        preOrderParameters.mPartnerId = str2;
        preOrderParameters.mPackageName = b78.a().getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append("buildparameters: parameters = ");
        sb.append(preOrderParameters.toString());
        return preOrderParameters;
    }

    public void e() {
        this.f16519c = null;
        if (this.d != null) {
            try {
                rdf.c(b78.a(), this.d);
            } catch (Exception unused) {
            }
        }
    }

    public HashMap<String, Object> f(String str) {
        HashMap<String, Object> map = new HashMap<>();
        if (!str.isEmpty()) {
            map.put("partnerCode", str);
        }
        if (k()) {
            map.put("token", i());
        }
        map.put("chargePluginType", g());
        map.put("appPackage", b78.a().getPackageName());
        map.put("count", 1);
        map.put("country", "CN");
        map.put(DeepLinkInterpreter.KEY_CURRENCY, CURRENCY);
        return map;
    }

    public String g() {
        return k() ? "2" : "0";
    }

    public final String i() {
        return um.c().getV1Token();
    }

    public String j() {
        try {
            return b78.a().getPackageManager().getPackageInfo(b78.a().getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return Constants.HeyBuildVersion.V1_0;
        }
    }

    public void m(Context context, String str, String str2) {
        boolean z = false;
        if (k()) {
            n();
            yo6.c().b(new wp9() { // from class: com.oplus.aiunit.vision.rae
                @Override // com.oplus.aiunit.vision.wp9
                public final String a(Context context2) {
                    return sae.l(context2);
                }
            });
            pbe.INSTANCE.b(context, d(str, str2), false);
        } else {
            try {
                Class.forName("com.nearme.atlas.offlinepay.application.ui.activities.OppoOfflinePayHostActivity");
                z = true;
            } catch (ClassNotFoundException unused) {
            }
            if (z) {
                return;
            }
            y0k.h(context.getString(R$string.operation_pay_version_not_support));
        }
    }

    public final void n() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_PAY_RESPONSE);
        rdf.a(b78.a(), this.d, intentFilter, 2);
    }

    public void setPayResultListener(b bVar) {
        this.f16519c = bVar;
    }

    public sae() {
        this.a = "PayManager";
        this.b = "";
        this.d = new a();
    }
}
