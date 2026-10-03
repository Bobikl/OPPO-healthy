package com.glyphix.mas.common;

import android.content.Context;
import android.location.LocationManager;
import com.coloros.sceneservice.dataprovider.bean.SceneStatusInfo;
import com.oplus.aiunit.vision.f58;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class a {
    public static Context a;
    private static GlyphixLocationProvider b;

    private static String a(GlyphixLocationProvider.GxLocation gxLocation) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", gxLocation.getCode());
            jSONObject.put("msg", gxLocation.getMsg());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("longitude", gxLocation.getLongitude());
            jSONObject2.put("latitude", gxLocation.getLatitude());
            jSONObject2.put("coordType", gxLocation.getCoordType());
            jSONObject.put("data", jSONObject2.toString());
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "{\"code\": 1100, \"msg\": \"unknown  error\", \"data\": \"{\"longitude\": 0, \"latitude\": 0, \"coordType\": \"unknown\"}\"}";
        }
    }

    private static String b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        if (b == null) {
            jSONObject2.put("code", GlyphixLocationProvider.LocationCode.PROVIDER_DISABLE);
            jSONObject2.put("msg", "Not set location provider");
            return jSONObject2.toString();
        }
        if (!a()) {
            return a(new GlyphixLocationProvider.GxLocation(GlyphixLocationProvider.LocationCode.PROVIDER_DISABLE, "location provider disable"));
        }
        Integer numValueOf = Integer.valueOf(SceneStatusInfo.SceneConstant.TRIP_ARRIVE_END_STATION_IN_TIME);
        String string = jSONObject.has("appId") ? jSONObject.getString("appId") : "";
        String string2 = jSONObject.has("mode") ? jSONObject.getString("mode") : "";
        if (jSONObject.has("timeout")) {
            numValueOf = Integer.valueOf(jSONObject.getInt("timeout"));
        }
        return a(b.getLocation(string, string2, numValueOf));
    }

    private static String c(JSONObject jSONObject) {
        if (b == null) {
            return a(new GlyphixLocationProvider.GxLocation(GlyphixLocationProvider.LocationCode.PROVIDER_DISABLE, "Not set location provider"));
        }
        if (!a()) {
            return a(new GlyphixLocationProvider.GxLocation(GlyphixLocationProvider.LocationCode.PROVIDER_DISABLE, "location provider disable"));
        }
        String string = jSONObject.has("appId") ? jSONObject.getString("appId") : "";
        String string2 = jSONObject.has("mode") ? jSONObject.getString("mode") : "";
        com.glyphix.mas.utils.b.c().c("start request location");
        GlyphixLocationProvider.LocationCode locationCodeRegisterListen = b.registerListen(string, string2);
        return a(new GlyphixLocationProvider.GxLocation(locationCodeRegisterListen, locationCodeRegisterListen.getMsg()));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    public static String a(JSONObject jSONObject) {
        try {
            byte b2 = 0;
            com.glyphix.mas.utils.b.c().c("location params", jSONObject.toString());
            String string = jSONObject.getString("type");
            int iHashCode = string.hashCode();
            if (iHashCode != 514841930) {
                if (iHashCode != 583281361) {
                    if (iHashCode != 1095692943 || !string.equals("request")) {
                        b2 = -1;
                    }
                } else if (string.equals("unsubscribe")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (string.equals("subscribe")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                return b(jSONObject);
            }
            if (b2 != 1) {
                return b2 != 2 ? "{\"code\": 1101, \"msg\": \"unknown request type\"}" : b();
            }
            return c(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "{\"code\": 1100, \"msg\": \"" + e2.toString() + "\", \"data\": {\"longitude\": 0, \"latitude\": 0, \"coordType\": \"unknown\"}}";
        }
    }

    private static String b() {
        if (b == null) {
            GlyphixLocationProvider.GxLocation gxLocation = new GlyphixLocationProvider.GxLocation(GlyphixLocationProvider.LocationCode.PROVIDER_DISABLE, "Not set location provider");
            b.sendLocationToDevice(0.0d, 0.0d, "", GlyphixLocationProvider.LocationCode.UNKNOWN_ERROR);
            return a(gxLocation);
        }
        com.glyphix.mas.utils.b.c().c("stop request location");
        GlyphixLocationProvider.LocationCode locationCodeUnregisterListen = b.unregisterListen();
        return a(new GlyphixLocationProvider.GxLocation(locationCodeUnregisterListen, locationCodeUnregisterListen.getMsg()));
    }

    public static void c() {
        GlyphixLocationProvider glyphixLocationProvider = b;
        if (glyphixLocationProvider != null) {
            glyphixLocationProvider.unregisterListen();
        }
    }

    public static boolean a() {
        LocationManager locationManager = (LocationManager) a.getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        return locationManager.isProviderEnabled(f58.GPS) || locationManager.isProviderEnabled("network");
    }

    public static void a(GlyphixLocationProvider glyphixLocationProvider) {
        b = glyphixLocationProvider;
    }
}
