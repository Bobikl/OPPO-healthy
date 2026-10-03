package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class n9 implements kl9 {
    public volatile JSONObject a;
    public final Object b = new Object();

    @Override // com.oplus.aiunit.vision.kl9
    public wj a(JSONObject jSONObject, Context context) {
        return new wj(jSONObject, context, da.e());
    }

    @Override // com.oplus.aiunit.vision.kl9
    public JSONObject c(Context context, String str) {
        JSONObject jSONObjectE = e(context);
        if (jSONObjectE != null && jSONObjectE.has(str)) {
            try {
                return jSONObjectE.getJSONObject(str);
            } catch (Exception e2) {
                AcLogUtil.e("AcIDSDKFreqProvider", "get config error for key: " + str, e2);
            }
        }
        return new JSONObject();
    }

    @Override // com.oplus.aiunit.vision.kl9
    public r8 d(JSONObject jSONObject, Context context) {
        return new r8(jSONObject, context, da.e());
    }

    public final JSONObject e(Context context) {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    try {
                        String strI = a7.i(context);
                        if (strI == null || strI.isEmpty()) {
                            this.a = new JSONObject();
                        } else {
                            this.a = new JSONObject(strI);
                            AcLogUtil.i("AcIDSDKFreqProvider", "parse root config success");
                        }
                    } catch (Exception e2) {
                        AcLogUtil.e("AcIDSDKFreqProvider", "parse root config error", e2);
                        this.a = new JSONObject();
                    }
                }
            }
        }
        return this.a;
    }
}
