package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.oplus.aiunit.vision.iym;
import com.oplus.aiunit.vision.lxm;
import com.oplus.aiunit.vision.n0n;
import com.oplus.aiunit.vision.pxm;
import com.oplus.aiunit.vision.qvg;
import com.oplus.aiunit.vision.qxm;
import com.oplus.aiunit.vision.ukf;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 extends lxm<ukf, RegeocodeAddress> {
    public a0(Context context, ukf ukfVar) {
        super(context, ukfVar);
    }

    public static RegeocodeAddress u(String str) throws AMapException {
        RegeocodeAddress regeocodeAddress = new RegeocodeAddress();
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("regeocode");
            if (jSONObjectOptJSONObject == null) {
                return regeocodeAddress;
            }
            regeocodeAddress.setFormatAddress(iym.b(jSONObjectOptJSONObject, "formatted_address"));
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("addressComponent");
            if (jSONObjectOptJSONObject2 != null) {
                iym.g(jSONObjectOptJSONObject2, regeocodeAddress);
            }
            regeocodeAddress.setPois(iym.k(jSONObjectOptJSONObject));
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("roads");
            if (jSONArrayOptJSONArray != null) {
                iym.i(jSONArrayOptJSONArray, regeocodeAddress);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("roadinters");
            if (jSONArrayOptJSONArray2 != null) {
                iym.f(jSONArrayOptJSONArray2, regeocodeAddress);
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("aois");
            if (jSONArrayOptJSONArray3 != null) {
                iym.l(jSONArrayOptJSONArray3, regeocodeAddress);
            }
        } catch (JSONException e2) {
            qxm.g(e2, "ReverseGeocodingHandler", "paseJSON");
        }
        return regeocodeAddress;
    }

    public static z v() {
        y yVarC = x.b().c("regeo");
        if (yVarC == null) {
            return null;
        }
        return (z) yVarC;
    }

    @Override // com.amap.api.col.p0003sl.t
    public final /* synthetic */ Object e(String str) throws AMapException {
        return u(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return pxm.b() + "/geocode/regeo?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.t
    public final x.b n() {
        z zVarV = v();
        double dL = zVarV != null ? zVarV.l() : 0.0d;
        x.b bVar = new x.b();
        bVar.a = getURL() + t(false) + "language=" + qvg.b().c();
        T t = this.s;
        if (t != 0 && ((ukf) t).e() != null) {
            bVar.b = new z.a(((ukf) this.s).e().getLatitude(), ((ukf) this.s).e().getLongitude(), dL);
        }
        return bVar;
    }

    @Override // com.oplus.aiunit.vision.lxm
    public final String q() {
        return t(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String t(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("output=json&location=");
        if (z) {
            sb.append(qxm.a(((ukf) this.s).e().getLongitude()));
            sb.append(",");
            sb.append(qxm.a(((ukf) this.s).e().getLatitude()));
        }
        if (!TextUtils.isEmpty(((ukf) this.s).d())) {
            sb.append("&poitype=");
            sb.append(((ukf) this.s).d());
        }
        if (!TextUtils.isEmpty(((ukf) this.s).c())) {
            sb.append("&mode=");
            sb.append(((ukf) this.s).c());
        }
        if (TextUtils.isEmpty(((ukf) this.s).a())) {
            sb.append("&extensions=base");
        } else {
            sb.append("&extensions=");
            sb.append(((ukf) this.s).a());
        }
        sb.append("&radius=");
        sb.append((int) ((ukf) this.s).f());
        sb.append("&coordsys=");
        sb.append(((ukf) this.s).b());
        sb.append("&key=");
        sb.append(n0n.j(this.v));
        return sb.toString();
    }
}
