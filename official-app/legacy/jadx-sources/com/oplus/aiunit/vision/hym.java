package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.help.Tip;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class hym extends lxm<k9a, ArrayList<Tip>> {
    public hym(Context context, k9a k9aVar) {
        super(context, k9aVar);
    }

    public static ArrayList<Tip> t(String str) throws AMapException {
        try {
            return iym.q(new JSONObject(str));
        } catch (JSONException e2) {
            qxm.g(e2, "InputtipsHandler", "paseJSON");
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.t
    public final /* synthetic */ Object e(String str) throws AMapException {
        return t(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return pxm.b() + "/assistant/inputtips?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.lxm
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json");
        String strB = lxm.b(((k9a) this.s).c());
        if (!TextUtils.isEmpty(strB)) {
            stringBuffer.append("&keywords=");
            stringBuffer.append(strB);
        }
        String strA = ((k9a) this.s).a();
        if (!iym.p(strA)) {
            String strB2 = lxm.b(strA);
            stringBuffer.append("&city=");
            stringBuffer.append(strB2);
        }
        String strE = ((k9a) this.s).e();
        if (!iym.p(strE)) {
            String strB3 = lxm.b(strE);
            stringBuffer.append("&type=");
            stringBuffer.append(strB3);
        }
        if (((k9a) this.s).b()) {
            stringBuffer.append("&citylimit=true");
        } else {
            stringBuffer.append("&citylimit=false");
        }
        LatLonPoint latLonPointD = ((k9a) this.s).d();
        if (latLonPointD != null) {
            stringBuffer.append("&location=");
            stringBuffer.append(latLonPointD.getLongitude());
            stringBuffer.append(",");
            stringBuffer.append(latLonPointD.getLatitude());
        }
        stringBuffer.append("&key=");
        stringBuffer.append(n0n.j(this.v));
        return stringBuffer.toString();
    }
}
