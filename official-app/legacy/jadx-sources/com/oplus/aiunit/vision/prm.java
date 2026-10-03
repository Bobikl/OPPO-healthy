package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class prm extends usm {
    @Override // com.oplus.aiunit.vision.usm
    public ygm b(qam qamVar, Context context, String str) throws Throwable {
        qrm.h(ham.A, "mdap post");
        byte[] bArrA = vgm.a(str.getBytes(Charset.forName("UTF-8")));
        HashMap map = new HashMap();
        map.put("utdId", chm.e().d());
        map.put("logHeader", "RAW");
        map.put("bizCode", qrm.b);
        map.put(Fields.PRODUCT_ID, "alipaysdk_android");
        map.put(ar9.CONTENT_ENCODING, "Gzip");
        map.put("productVersion", ham.f12086j);
        mam.b bVarA = mam.a(context, new mam.a(ham.f12085e, map, bArrA));
        qrm.h(ham.A, "mdap got " + bVarA);
        if (bVarA == null) {
            throw new RuntimeException("Response is null");
        }
        boolean zL = usm.l(bVarA);
        try {
            byte[] bArrB = bVarA.f14006c;
            if (zL) {
                bArrB = vgm.b(bArrB);
            }
            return new ygm("", new String(bArrB, Charset.forName("UTF-8")));
        } catch (Exception e2) {
            qrm.d(e2);
            return null;
        }
    }

    @Override // com.oplus.aiunit.vision.usm
    public String g(qam qamVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.oplus.aiunit.vision.usm
    public Map<String, String> i(boolean z, String str) {
        return new HashMap();
    }

    @Override // com.oplus.aiunit.vision.usm
    public JSONObject j() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.usm
    public boolean o() {
        return false;
    }
}
