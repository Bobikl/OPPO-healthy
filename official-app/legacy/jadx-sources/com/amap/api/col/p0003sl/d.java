package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.ekm;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends g<String, List<OfflineMapProvince>> {
    public Context d;

    public d(Context context, String str) {
        super(context, str);
    }

    @Override // com.amap.api.col.p0003sl.g
    public final String b() {
        return "015";
    }

    @Override // com.amap.api.col.p0003sl.g
    public final JSONObject c(e0.c cVar) {
        JSONObject jSONObject;
        if (cVar == null || (jSONObject = cVar.f) == null) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("015");
        if (!jSONObjectOptJSONObject.has("result")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("result", new JSONObject().put("offlinemap_with_province_vfour", jSONObjectOptJSONObject));
                return jSONObject2;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObjectOptJSONObject;
    }

    @Override // com.amap.api.col.p0003sl.g
    public final Map<String, String> e() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("mapver", this.a);
        return hashtable;
    }

    public final void h(Context context) {
        this.d = context;
    }

    @Override // com.amap.api.col.p0003sl.g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final List<OfflineMapProvince> a(JSONObject jSONObject) throws AMapException {
        try {
            if (this.d != null) {
                ekm.p(jSONObject.toString(), this.d);
            }
        } catch (Throwable th) {
            c2n.r(th, "OfflineUpdateCityHandlerAbstract", "loadData jsonInit");
            th.printStackTrace();
        }
        try {
            Context context = this.d;
            if (context != null) {
                return ekm.g(jSONObject, context);
            }
            return null;
        } catch (JSONException e2) {
            c2n.r(e2, "OfflineUpdateCityHandlerAbstract", "loadData parseJson");
            e2.printStackTrace();
            return null;
        }
    }
}
