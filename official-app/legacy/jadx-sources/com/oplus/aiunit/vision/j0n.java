package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import com.amap.api.maps.model.LatLng;
import com.amap.api.trace.TraceLocation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class j0n extends e0n<List<TraceLocation>, List<LatLng>> implements Runnable {
    public String A;
    public List<TraceLocation> w;
    public Handler x;
    public int y;
    public int z;

    public j0n(Context context, Handler handler, List<TraceLocation> list, String str, int i, int i2) {
        super(context, list);
        this.w = list;
        this.x = handler;
        this.z = i;
        this.y = i2;
        this.A = str;
    }

    public static List<LatLng> p(String str) throws com.amap.api.col.p0003sl.ic {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("data") && (jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("points")) != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    arrayList.add(new LatLng(Double.parseDouble(jSONObjectOptJSONObject.optString("y")), Double.parseDouble(jSONObjectOptJSONObject.optString("x"))));
                }
                return arrayList;
            }
            return arrayList;
        } catch (JSONException e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.oplus.aiunit.vision.b0n
    public final /* synthetic */ Object e(String str) throws com.amap.api.col.p0003sl.ic {
        return p(str);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return xsm.y(getURL());
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String str = "key=" + n0n.j(this.t);
        String strA = o0n.a();
        return "http://restsdk.amap.com/v4/grasproad/driving?" + str + "&ts=".concat(String.valueOf(strA)) + "&scode=".concat(String.valueOf(o0n.c(this.t, strA, str)));
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.e0n
    public final String o() {
        JSONArray jSONArray = new JSONArray();
        long j2 = 0;
        for (int i = 0; i < this.w.size(); i++) {
            TraceLocation traceLocation = this.w.get(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("x", traceLocation.getLongitude());
                jSONObject.put("y", traceLocation.getLatitude());
                jSONObject.put("ag", (int) traceLocation.getBearing());
                long time = traceLocation.getTime();
                if (i == 0) {
                    if (time == 0) {
                        time = (System.currentTimeMillis() - 10000) / 1000;
                    }
                    jSONObject.put("tm", time / 1000);
                } else if (time != 0) {
                    long j3 = time - j2;
                    if (j3 < 1000) {
                        jSONObject.put("tm", 1);
                    } else {
                        jSONObject.put("tm", j3 / 1000);
                    }
                } else {
                    jSONObject.put("tm", 1);
                }
                j2 = time;
                jSONObject.put("sp", (int) traceLocation.getSpeed());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            jSONArray.put(jSONObject);
        }
        this.u = getURL() + "&" + jSONArray.toString();
        return jSONArray.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        new ArrayList();
        try {
            try {
                l0n.b().e(this.A, this.y, m());
                l0n.b().a(this.A).b(this.x);
            } catch (com.amap.api.col.p0003sl.ic e2) {
                l0n.b();
                l0n.c(this.x, this.z, e2.a());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
