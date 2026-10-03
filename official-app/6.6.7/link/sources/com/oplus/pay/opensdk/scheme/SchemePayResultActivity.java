package com.oplus.pay.opensdk.scheme;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.oplus.aiunit.vision.gqe;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.rde;
import com.oplus.aiunit.vision.sde;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pay.opensdk.model.PayParameters;
import com.oplusos.sau.common.utils.SauAarConstants;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002¨\u0006\u000e"}, d2 = {"Lcom/oplus/pay/opensdk/scheme/SchemePayResultActivity;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Intent;", TraceConstants.KEY_ACTION, "onNewIntent", "b", "a", "<init>", "()V", "Companion", "paysdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSchemePayResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemePayResultActivity.kt\ncom/oplus/pay/opensdk/scheme/SchemePayResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
public final class SchemePayResultActivity extends Activity {
    public final void a() {
        try {
            finish();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x012f  */
    public final void b(Intent intent) {
        boolean z;
        String str;
        String str2;
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            pce.i("SchemePayResultActivity: data uri is null");
            return;
        }
        String scheme = data.getScheme();
        if (scheme == null) {
            scheme = "";
        }
        String host = data.getHost();
        if (host == null) {
            host = "";
        }
        if (!StringsKt.equals(scheme, "opluspay", true) || !StringsKt.equals(host, "payment.result", true)) {
            pce.i("SchemePayResultActivity: invalid scheme/host: " + scheme + '/' + host);
            return;
        }
        String queryParameter = data.getQueryParameter("errCode");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = data.getQueryParameter("message");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        String queryParameter3 = data.getQueryParameter("partnerOrder");
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        String queryParameter4 = data.getQueryParameter("payOrder");
        String queryParameter5 = data.getQueryParameter("channelId");
        String queryParameter6 = data.getQueryParameter("timestamp");
        String queryParameter7 = data.getQueryParameter(rde.PAY_SDK_PREPAYTOKEN);
        String str3 = queryParameter7 == null ? "" : queryParameter7;
        String queryParameter8 = data.getQueryParameter("packageName");
        if (queryParameter8 == null) {
            queryParameter8 = "";
        }
        String queryParameter9 = data.getQueryParameter("traceId");
        if (queryParameter9 == null) {
            queryParameter9 = "";
        }
        String queryParameter10 = data.getQueryParameter(rde.PAY_SDK_PARTNERID);
        String str4 = queryParameter10 != null ? queryParameter10 : "";
        String queryParameter11 = data.getQueryParameter(rde.KEY_COUNTRY_CODE);
        if (queryParameter11 == null) {
            queryParameter11 = gqe.DEFAULT_LANGUAGE;
        }
        Long longOrNull = queryParameter6 != null ? StringsKt.toLongOrNull(queryParameter6) : null;
        String packageName = getApplicationContext().getPackageName();
        Intent intent2 = new Intent("com.oplus.pay.opensdk.action.PAYMENT_RESULT");
        intent2.setPackage(packageName);
        intent2.putExtra("pay.partnerOrder", queryParameter3);
        intent2.putExtra("pay.code", queryParameter);
        intent2.putExtra("pay.msg", queryParameter2);
        intent2.putExtra("pay.prePayToken", str3);
        if (queryParameter4 != null) {
            intent2.putExtra("pay.payOrder", queryParameter4);
        }
        if (queryParameter5 != null) {
            intent2.putExtra("pay.channelId", queryParameter5);
        }
        if (longOrNull != null) {
            intent2.putExtra("pay.timestamp", longOrNull.longValue());
        }
        if (queryParameter8.length() > 0) {
            intent2.putExtra("pay.packageName", queryParameter8);
        }
        if (queryParameter9.length() > 0) {
            intent2.putExtra("pay.traceId", queryParameter9);
        }
        if (str4.length() > 0) {
            intent2.putExtra("pay.partnerId", str4);
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                if (getPackageManager().resolveActivity(intent2, PackageManager.ResolveInfoFlags.of(0L)) != null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (getPackageManager().resolveActivity(intent2, 0) != null) {
                z = true;
            } else {
                z = false;
            }
        } catch (Throwable unused) {
        }
        PayParameters payParameters = new PayParameters();
        payParameters.prePayToken = str3;
        payParameters.mPartnerOrder = queryParameter3;
        payParameters.mPackageName = queryParameter8;
        payParameters.mPartnerId = str4;
        payParameters.mCountryCode = queryParameter11;
        rde.c(this, payParameters);
        if (z) {
            try {
                intent2.addFlags(SauAarConstants.L);
                startActivity(intent2);
                pce.f("SchemePayResultActivity: started business Activity via action for partnerOrder=" + queryParameter3 + " prePayToken=" + str3);
                str = queryParameter5;
                str2 = queryParameter4;
            } catch (Throwable th) {
                str = queryParameter5;
                str2 = queryParameter4;
                sde.i(queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, str3, String.valueOf(longOrNull), String.valueOf(z), th.getMessage());
                pce.i("SchemePayResultActivity: startActivity error: " + th.getMessage());
            }
        } else {
            str = queryParameter5;
            str2 = queryParameter4;
            sde.i(queryParameter, queryParameter2, queryParameter3, str2, str, str3, String.valueOf(longOrNull), String.valueOf(z), "has no handler");
            pce.i("SchemePayResultActivity: no Activity can handle action com.oplus.pay.opensdk.action.PAYMENT_RESULT in pkg=" + packageName);
        }
        try {
            sde.h(queryParameter, queryParameter2, queryParameter3, str2, str, str3, String.valueOf(longOrNull), String.valueOf(z));
        } catch (Throwable th2) {
            pce.i("SchemePayResultActivity: statistic error: " + th2.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b(getIntent());
        a();
    }

    @Override // android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        PushAutoTrackHelper.onNewIntent(this, intent);
        super.onNewIntent(intent);
        b(intent);
        a();
    }
}
