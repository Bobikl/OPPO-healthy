package com.oplus.pay.opensdk.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.oplus.aiunit.vision.dde;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.rde;
import com.oplus.aiunit.vision.sde;
import com.oplus.pay.opensdk.model.PayParameters;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class PaySdkReceiver extends BroadcastReceiver {
    public PayParameters a;

    public PaySdkReceiver(PayParameters payParameters) {
        this.a = payParameters;
    }

    public final void a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("reason");
        pce.c("reason：" + stringExtra);
        if ("recentapps".equalsIgnoreCase(stringExtra) || "homekey".equalsIgnoreCase(stringExtra)) {
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0027;
            String statusCode = transactionProcessStatusCodes.getStatusCode();
            String value2 = BizResult.WARN.getValue();
            String desc = transactionProcessStatusCodes.getDesc();
            PayParameters payParameters = this.a;
            sde.a(value, statusCode, value2, desc, payParameters.mPartnerOrder, payParameters.prePayToken, stringExtra);
        }
    }

    public final void b(Context context, Intent intent) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        String string = "";
        if (intent.getAction().equalsIgnoreCase(dde.ACTION_NOTIFY_PAY_RESULT)) {
            String string2 = "";
            try {
                String stringExtra = intent.getStringExtra("response");
                try {
                    pce.c("response：" + stringExtra);
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    String string3 = jSONObject.getString(rde.PAY_SDK_ORDER);
                    try {
                        String string4 = jSONObject.has(rde.PAY_SDK_PREPAYTOKEN) ? jSONObject.getString(rde.PAY_SDK_PREPAYTOKEN) : "";
                        try {
                            if (string3.equalsIgnoreCase(this.a.mPartnerOrder) || string4.equalsIgnoreCase(this.a.prePayToken)) {
                                string = jSONObject.has("reportByPaySdk") ? jSONObject.getString("reportByPaySdk") : "";
                                if (!string.equalsIgnoreCase("SDK")) {
                                    string = "APK";
                                }
                                string2 = jSONObject.getString("errCode");
                            }
                            String str5 = string;
                            String str6 = string2;
                            String value = BizNode.START_PAY.getValue();
                            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0028;
                            sde.g(str5, value, transactionProcessStatusCodes.getStatusCode(), BizResult.WARN.getValue(), transactionProcessStatusCodes.getDesc(), string3, string4, str6, stringExtra);
                        } catch (JSONException unused) {
                            str3 = string4;
                            str = string;
                            str4 = stringExtra;
                            str2 = string3;
                            try {
                                pce.b("数据解析异常");
                                String value2 = BizNode.START_PAY.getValue();
                                TransactionProcessStatusCodes transactionProcessStatusCodes2 = TransactionProcessStatusCodes.CODE_00_000_0028;
                                sde.g(str, value2, transactionProcessStatusCodes2.getStatusCode(), BizResult.WARN.getValue(), transactionProcessStatusCodes2.getDesc(), str2, str3, "", str4);
                            } catch (Throwable th) {
                                th = th;
                                String value3 = BizNode.START_PAY.getValue();
                                TransactionProcessStatusCodes transactionProcessStatusCodes3 = TransactionProcessStatusCodes.CODE_00_000_0028;
                                sde.g(str, value3, transactionProcessStatusCodes3.getStatusCode(), BizResult.WARN.getValue(), transactionProcessStatusCodes3.getDesc(), str2, str3, "", str4);
                                context.getApplicationContext().unregisterReceiver(this);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str3 = string4;
                            str = string;
                            str4 = stringExtra;
                            str2 = string3;
                            String value4 = BizNode.START_PAY.getValue();
                            TransactionProcessStatusCodes transactionProcessStatusCodes4 = TransactionProcessStatusCodes.CODE_00_000_0028;
                            sde.g(str, value4, transactionProcessStatusCodes4.getStatusCode(), BizResult.WARN.getValue(), transactionProcessStatusCodes4.getDesc(), str2, str3, "", str4);
                            context.getApplicationContext().unregisterReceiver(this);
                            throw th;
                        }
                    } catch (JSONException unused2) {
                        str = "";
                        str3 = str;
                    } catch (Throwable th3) {
                        th = th3;
                        str = "";
                        str3 = str;
                    }
                } catch (JSONException unused3) {
                    str = "";
                    str2 = str;
                    str3 = str2;
                    str4 = stringExtra;
                } catch (Throwable th4) {
                    th = th4;
                    str = "";
                    str2 = str;
                    str3 = str2;
                    str4 = stringExtra;
                }
            } catch (JSONException unused4) {
                str = "";
                str2 = str;
                str3 = str2;
                str4 = str3;
            } catch (Throwable th5) {
                th = th5;
                str = "";
                str2 = str;
                str3 = str2;
                str4 = str3;
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        pce.c("action：" + intent.getAction());
        a(context, intent);
        b(context, intent);
    }
}
