package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.client.platform.opensdk.pay.PayResponse;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class qbe {
    public static final int CODE_CANCEL = 1004;
    public static final int CODE_RESULT_UNKNOWN = 1005;
    public static final int CODE_SUCCESS = 1001;
    public int a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15732c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15733e;
    public String f;
    public String g;

    public static qbe a(String str) {
        if (str == null || str.trim().equals("")) {
            return null;
        }
        qbe qbeVar = new qbe();
        try {
            JSONObject jSONObject = new JSONObject(str);
            qbeVar.a = jSONObject.getInt("errCode");
            if (jSONObject.has("order")) {
                qbeVar.f15732c = jSONObject.getString("order");
            }
            if (jSONObject.has(sbe.PAY_SDK_PREPAYTOKEN)) {
                qbeVar.d = jSONObject.getString(sbe.PAY_SDK_PREPAYTOKEN);
            }
            if (jSONObject.has(DeepLinkInterpreter.KEY_DEEP_LINK)) {
                qbeVar.g = jSONObject.getString(DeepLinkInterpreter.KEY_DEEP_LINK);
            }
            if (jSONObject.has("payChannel")) {
                qbeVar.f = jSONObject.getString("payChannel");
            }
            if (jSONObject.has("msg")) {
                qbeVar.b = jSONObject.getString("msg");
            }
            if (TextUtils.isEmpty(qbeVar.b) || qbeVar.b.equals("未知结果")) {
                qbeVar.b = jSONObject.getString("msg");
            }
        } catch (Exception unused) {
            a7b.f(PayResponse.class.getSimpleName(), "parse error. response is " + str);
        }
        return qbeVar;
    }
}
