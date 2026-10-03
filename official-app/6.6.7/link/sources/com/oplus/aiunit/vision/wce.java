package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.client.platform.opensdk.pay.Utils;
import com.oplus.pay.opensdk.PaySdkCoreV3;
import com.oplus.pay.opensdk.chain.e;
import com.oplus.pay.opensdk.model.PayParameters;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.statistic.network.AesHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wce {
    public static String a(String str) {
        String str2 = "";
        try {
            String string = new JSONObject(b(str)).getString(dde.TRACE_TRACEID);
            try {
                return !vde.b(string) ? "" : string;
            } catch (JSONException unused) {
                str2 = string;
                pce.c("getMerchantTraceId() fail");
                return str2;
            }
        } catch (JSONException unused2) {
        }
    }

    public static String b(String str) {
        try {
            return new JSONObject(str).getJSONObject(dde.TRACE_TRACECONTEXT).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void c(Context context, PreOrderParameters preOrderParameters, Class<?> cls) {
        String strF = new tp9().f(context);
        preOrderParameters.mPayId = strF;
        if (cls == e.class) {
            PaySdkCoreV3.INSTANCE.q(strF);
        }
        if (cls == da3.class) {
            ede.INSTANCE.a(preOrderParameters.mPayId);
        }
        if (TextUtils.isEmpty(preOrderParameters.mPackageName)) {
            preOrderParameters.mPackageName = context.getApplicationContext().getPackageName();
        }
        if (TextUtils.isEmpty(preOrderParameters.mSource)) {
            preOrderParameters.mSource = vde.d(context);
        }
        if (TextUtils.isEmpty(preOrderParameters.mAppVersion)) {
            preOrderParameters.mAppVersion = Utils.getVersionCode(context, context.getPackageName()) + "";
        }
        if (preOrderParameters instanceof PayParameters) {
            PayParameters payParameters = (PayParameters) preOrderParameters;
            payParameters.paySdkVersion = "3.3.1";
            payParameters.mPayPackageName = vde.f(context);
        }
    }

    public static void d(String str, PreOrderParameters preOrderParameters) {
        JSONObject jSONObject;
        String strE;
        String strE2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String strOptString;
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        try {
            if (TextUtils.isEmpty(preOrderParameters.expandInfo)) {
                strE = "";
                strE2 = strE;
                jSONObject2 = jSONObject6;
                jSONObject3 = jSONObject5;
                jSONObject = jSONObject4;
                strOptString = strE2;
            } else {
                jSONObject = new JSONObject(preOrderParameters.expandInfo);
                try {
                    jSONObject3 = new JSONObject(jSONObject.optString(dde.TRACE_TRACECONTEXT));
                    jSONObject2 = new JSONObject(jSONObject3.optString(dde.TRACE_TRADE_SOURCE));
                    strOptString = jSONObject3.optString(dde.TRACE_TRACEID);
                    strE = jSONObject2.optString("source");
                    strE2 = jSONObject2.optString(dde.TRACE_SUB_SOURCE);
                    pce.b("start:tradeTraceId:" + strOptString + "--source:" + strE + "--subSource:" + strE2);
                } catch (JSONException unused) {
                    jSONObject4 = jSONObject;
                    pce.c("updateTraceId() fail");
                    jSONObject = jSONObject4;
                }
            }
            if (!TextUtils.isEmpty(strE)) {
                if (strE.length() > 64) {
                    strE = strE.substring(0, 64);
                }
                if (!vde.b(strE)) {
                    strE = AesHelper.e(strE.getBytes());
                }
            }
            if (!TextUtils.isEmpty(strE2)) {
                if (strE2.length() > 127) {
                    strE2 = strE2.substring(0, 127);
                }
                if (!vde.b(strE2)) {
                    strE2 = AesHelper.e(strE2.getBytes());
                }
            }
            if (TextUtils.isEmpty(strOptString) || !vde.b(strOptString)) {
                strOptString = str;
            }
            pce.b("end:tradeTraceId:" + strOptString + "--source:" + strE + "--subSource:" + strE2);
            jSONObject2.putOpt("source", strE);
            jSONObject2.putOpt(dde.TRACE_SUB_SOURCE, strE2);
            jSONObject3.putOpt(dde.TRACE_TRACEID, strOptString);
            jSONObject3.putOpt(dde.TRACE_TRADE_SOURCE, jSONObject2);
            jSONObject.putOpt(dde.TRACE_TRACECONTEXT, jSONObject3);
        } catch (JSONException unused2) {
        }
        preOrderParameters.expandInfo = jSONObject.toString();
    }
}
