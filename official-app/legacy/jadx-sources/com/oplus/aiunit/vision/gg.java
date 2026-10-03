package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class gg implements kl9 {
    public volatile JSONObject a;
    public final Object b = new Object();

    @Override // com.oplus.aiunit.vision.kl9
    public wj a(JSONObject jSONObject, Context context) {
        return new wj(jSONObject, context, lg.e());
    }

    @Override // com.oplus.aiunit.vision.kl9
    public JSONObject c(Context context, String str) {
        JSONObject jSONObjectE = e(context);
        if (jSONObjectE != null && jSONObjectE.has(str)) {
            try {
                return jSONObjectE.getJSONObject(str);
            } catch (Exception e2) {
                AcLogUtil.e("AcOpenSDKFreqProvider", "get config error for key: " + str, e2);
            }
        }
        return new JSONObject();
    }

    @Override // com.oplus.aiunit.vision.kl9
    public r8 d(JSONObject jSONObject, Context context) {
        return new r8(jSONObject, context, lg.e());
    }

    public final JSONObject e(Context context) {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    try {
                        String strH = ec.h(context);
                        if (strH == null || strH.isEmpty()) {
                            this.a = new JSONObject();
                        } else {
                            this.a = new JSONObject(strH);
                            AcLogUtil.i("AcOpenSDKFreqProvider", "parse root config success");
                        }
                    } catch (Exception e2) {
                        AcLogUtil.e("AcOpenSDKFreqProvider", "parse root config error", e2);
                        this.a = new JSONObject();
                    }
                }
            }
        }
        return this.a;
    }
}
