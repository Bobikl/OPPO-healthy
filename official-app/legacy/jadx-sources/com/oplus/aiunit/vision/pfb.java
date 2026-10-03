package com.oplus.aiunit.vision;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.LatLng;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes16.dex */
public class pfb {
    public static double a(LatLng latLng, LatLng latLng2) {
        return d(Double.valueOf(latLng.latitude), Double.valueOf(latLng.longitude), Double.valueOf(latLng2.latitude), Double.valueOf(latLng2.longitude));
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    public static double c(LatLng latLng, LatLng latLng2) {
        return AMapUtils.calculateLineDistance(latLng, latLng2);
    }

    public static double d(Double d, Double d2, Double d3, Double d4) {
        Location location = new Location("");
        location.setLatitude(d.doubleValue());
        location.setLongitude(d2.doubleValue());
        Location location2 = new Location("");
        location2.setLatitude(d3.doubleValue());
        location2.setLongitude(d4.doubleValue());
        return location.distanceTo(location2);
    }

    public static void e() {
        boolean zH = m3k.h();
        Context contextA = b78.a();
        MapsInitializer.updatePrivacyShow(contextA, zH, zH);
        MapsInitializer.updatePrivacyAgree(contextA, zH);
        if (zH) {
            try {
                MapsInitializer.initialize(contextA);
                MapsInitializer.loadWorldVectorMap(true);
            } catch (RemoteException e2) {
                a7b.f("MapUtils", "map initialize RemoteException:" + e2.getMessage());
            }
        }
    }

    public static byte[] f(String str) {
        InputStream resourceAsStream = pfb.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int i = resourceAsStream.read();
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    b(byteArrayOutputStream);
                    b(resourceAsStream);
                    return byteArray;
                }
                byteArrayOutputStream.write(i);
            } catch (Exception unused) {
                b(byteArrayOutputStream);
                b(resourceAsStream);
                return null;
            } catch (Throwable th) {
                b(byteArrayOutputStream);
                b(resourceAsStream);
                throw th;
            }
        }
    }

    public static void g(AMap aMap, boolean z) {
        CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
        customMapStyleOptions.setEnable(true);
        String strH = h(z);
        customMapStyleOptions.setStyleData(f(strH + "style.data"));
        customMapStyleOptions.setStyleExtraData(f(strH + "style_extra.data"));
        aMap.setCustomMapStyle(customMapStyleOptions);
    }

    public static String h(boolean z) {
        return z ? "/assets/amap_style_dark/" : "/assets/amap_style/";
    }

    public static String i(boolean z) {
        return h(z) + "style.data";
    }

    public static String j(boolean z) {
        return h(z) + "style_extra.data";
    }
}
