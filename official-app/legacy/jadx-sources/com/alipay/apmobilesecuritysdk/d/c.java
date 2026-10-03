package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.vam;
import com.oplus.aiunit.vision.yhm;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class c {
    public static Map<String, String> a(Context context) {
        yhm yhmVarA = yhm.a(APSecuritySdk.getInstance(context));
        HashMap map = new HashMap();
        f fVarA = com.alipay.apmobilesecuritysdk.e.e.a(context);
        String strC = yhmVarA.c(context);
        String strJ = yhmVarA.j(context);
        if (fVarA != null) {
            if (vam.c(strC)) {
                strC = fVarA.b();
            }
            if (vam.c(strJ)) {
                strJ = fVarA.e();
            }
        }
        f fVar = new f("", strC, "", "", strJ);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", fVar.a());
                jSONObject.put(SpeechConstant.KEY_IMSI, fVar.b());
                jSONObject.put("mac", fVar.c());
                jSONObject.put("bluetoothmac", fVar.d());
                jSONObject.put("gsi", fVar.e());
                String string = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key", string);
                com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key", string);
            } catch (Exception e2) {
                com.alipay.apmobilesecuritysdk.c.a.a(e2);
            }
        }
        map.put("AD1", "");
        map.put("AD2", strC);
        map.put("AD3", yhm.r(context));
        map.put("AD5", yhm.v(context));
        map.put("AD6", yhm.x(context));
        map.put("AD7", yhm.z(context));
        map.put("AD9", yhmVarA.h(context));
        map.put("AD10", strJ);
        map.put("AD11", yhm.i());
        map.put("AD12", yhmVarA.b());
        map.put("AD13", yhm.k());
        map.put("AD14", yhm.o());
        map.put("AD15", yhm.q());
        map.put("AD16", yhm.s());
        map.put("AD17", "");
        map.put("AD19", yhm.B(context));
        map.put("AD20", yhm.u());
        map.put("AD22", "");
        map.put("AD24", vam.k(yhm.t(context)));
        map.put("AD26", yhmVarA.f(context));
        map.put("AD27", yhm.E());
        map.put("AD28", yhm.I());
        map.put("AD29", yhm.K());
        map.put("AD30", yhm.G());
        map.put("AD31", yhm.J());
        map.put("AD32", yhm.A());
        map.put("AD33", yhm.C());
        map.put("AD34", yhm.D(context));
        map.put("AD35", yhm.F(context));
        map.put("AD36", yhmVarA.l(context));
        map.put("AD37", yhm.y());
        map.put("AD38", yhm.w());
        map.put("AD39", yhm.n(context));
        map.put("AD40", yhm.p(context));
        map.put("AD41", yhm.e());
        map.put("AD42", yhm.g());
        return map;
    }
}
