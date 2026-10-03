package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.mjm;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends g<String, mjm> {
    public b(Context context, String str) {
        super(context, str);
    }

    public static mjm h(JSONObject jSONObject) throws AMapException {
        mjm mjmVar = new mjm();
        try {
            String strOptString = jSONObject.optString(a8i.UPDATE, "");
            if (strOptString.equals("0")) {
                mjmVar.b(false);
            } else if (strOptString.equals("1")) {
                mjmVar.b(true);
            }
            mjmVar.a(jSONObject.optString("version", ""));
        } catch (Throwable th) {
            c2n.r(th, "OfflineInitHandlerAbstract", "loadData parseJson");
        }
        return mjmVar;
    }

    @Override // com.amap.api.col.p0003sl.g
    public final /* synthetic */ mjm a(JSONObject jSONObject) throws AMapException {
        return h(jSONObject);
    }

    @Override // com.amap.api.col.p0003sl.g
    public final String b() {
        return "016";
    }

    @Override // com.amap.api.col.p0003sl.g
    public final JSONObject c(e0.c cVar) {
        JSONObject jSONObject;
        if (cVar == null || (jSONObject = cVar.f) == null) {
            return null;
        }
        return jSONObject.optJSONObject("016");
    }

    @Override // com.amap.api.col.p0003sl.g
    public final Map<String, String> e() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("mapver", this.a);
        return hashtable;
    }
}
