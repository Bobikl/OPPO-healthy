package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.PolylineOptions;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class htm {
    public static Map<String, itm> a = new ConcurrentHashMap();
    public static String b = "";

    public static void a() {
        try {
            if (gtm.a) {
                Iterator<Map.Entry<String, itm>> it = a.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().a();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(int i, String str, String str2) {
        if (i == 0) {
            Log.i("linklog", str + " " + str2);
            return;
        }
        Log.e("linklog", str + " " + str2);
    }

    public static void c(int i, String str, String str2, String str3, String str4) {
        Map<String, itm> map;
        itm itmVar;
        try {
            String str5 = str3 + str4;
            if (gtm.b) {
                b(i, str2, str5);
            }
            if (!gtm.a || (map = a) == null || (itmVar = map.get(str)) == null) {
                return;
            }
            itmVar.a(i, str2, str5);
        } catch (Throwable unused) {
        }
    }

    public static void d(Context context) {
        if (context == null) {
            return;
        }
        try {
            k();
            l1n.c(xsm.t()).g(context.getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    public static void e(String str, String str2) {
        c(0, "normal", b, str, str2);
    }

    public static void f(String str, String str2, MarkerOptions markerOptions) {
        if (markerOptions == null) {
            n(str, str2);
            return;
        }
        n(str, str2 + " " + markerOptions.getPosition() + " " + markerOptions.getIcons());
    }

    public static void g(String str, String str2, PolygonOptions polygonOptions) {
        if (polygonOptions == null) {
            n(str, str2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        List<LatLng> points = polygonOptions.getPoints();
        if (points != null) {
            sb.append("points size =");
            sb.append(points.size());
        }
        sb.append(";width=");
        sb.append(polygonOptions.getStrokeWidth());
        sb.append(";fillColor=");
        sb.append(polygonOptions.getFillColor());
        sb.append(";strokeColor=");
        sb.append(polygonOptions.getStrokeColor());
        sb.append(";visible=");
        sb.append(polygonOptions.isVisible());
        n(str, str2 + " " + sb.toString());
    }

    public static void h(String str, String str2, PolylineOptions polylineOptions) {
        if (polylineOptions == null) {
            n(str, str2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        List<LatLng> points = polylineOptions.getPoints();
        if (points != null) {
            sb.append("points size =");
            sb.append(points.size());
        }
        sb.append(";width=");
        sb.append(polylineOptions.getWidth());
        sb.append(";color=");
        sb.append(polylineOptions.getColor());
        sb.append(";visible=");
        sb.append(polylineOptions.isVisible());
        n(str, str2 + " " + sb.toString());
    }

    public static void i(String str, String str2, List<MarkerOptions> list) {
        if (list != null) {
            Iterator<MarkerOptions> it = list.iterator();
            while (it.hasNext()) {
                f(str, str2, it.next());
            }
        }
    }

    public static void j(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            boolean zX = com.amap.api.col.p0003sl.e0.x(jSONObject.optString("able", ""), false);
            boolean zX2 = com.amap.api.col.p0003sl.e0.x(jSONObject.optString("mobile", ""), false);
            boolean zX3 = com.amap.api.col.p0003sl.e0.x(jSONObject.optString("debugupload", ""), false);
            boolean zX4 = com.amap.api.col.p0003sl.e0.x(jSONObject.optString("debugwrite", ""), false);
            boolean zX5 = com.amap.api.col.p0003sl.e0.x(jSONObject.optString("forcedUpload", ""), false);
            gtm.a = zX;
            boolean zX6 = com.amap.api.col.p0003sl.e0.x(jSONObject.optString("di", ""), false);
            String strOptString = jSONObject.optString("dis", "");
            if (!zX6 || w0n.A(strOptString)) {
                l1n.c(xsm.t()).k(zX, zX2, zX4, zX3, Arrays.asList(jSONObject.optString("filter", "").split("&")));
                if (zX5) {
                    l1n.c(xsm.t()).j(zX5);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void k() {
        try {
            a.put("overlay", new ktm());
            a.put("normal", new jtm());
        } catch (Throwable unused) {
        }
    }

    public static void l(String str, String str2) {
        c(1, "normal", b, str, str2);
    }

    public static void m(String str, String str2) {
        c(0, "overlay", b, str, str2);
    }

    public static void n(String str, String str2) {
        c(1, "overlay", b, str, str2);
    }
}
