package com.amap.api.maps;

import android.graphics.Point;
import android.util.Log;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import com.oplus.aiunit.vision.kem;

/* JADX INFO: loaded from: classes12.dex */
public final class CameraUpdateFactory {
    private static final String CLASSNAME = "CameraUpdateFactory";

    public static CameraUpdate changeBearing(float f) {
        return new CameraUpdate(kem.q(f % 360.0f));
    }

    public static CameraUpdate changeBearingGeoCenter(float f, IPoint iPoint) {
        if (iPoint != null) {
            return new CameraUpdate(kem.n(f % 360.0f, new Point(((Point) iPoint).x, ((Point) iPoint).y)));
        }
        Log.w(CLASSNAME, "geoPoint is null");
        return new CameraUpdate(kem.o());
    }

    public static CameraUpdate changeLatLng(LatLng latLng) {
        if (latLng != null) {
            return new CameraUpdate(kem.e(VirtualEarthProjection.latLongToPixels(latLng.latitude, latLng.longitude, 20)));
        }
        Log.w(CLASSNAME, "target is null");
        return new CameraUpdate(kem.o());
    }

    public static CameraUpdate changeTilt(float f) {
        return new CameraUpdate(kem.p(f));
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        if (cameraPosition != null) {
            return new CameraUpdate(kem.f(cameraPosition));
        }
        Log.w(CLASSNAME, "cameraPosition is null");
        return new CameraUpdate(kem.o());
    }

    public static CameraUpdate newLatLng(LatLng latLng) {
        if (latLng != null) {
            return new CameraUpdate(kem.g(latLng));
        }
        Log.w(CLASSNAME, "latLng is null");
        return new CameraUpdate(kem.o());
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i) {
        if (latLngBounds != null) {
            return new CameraUpdate(kem.i(latLngBounds, i));
        }
        Log.w(CLASSNAME, "bounds is null");
        return new CameraUpdate(kem.o());
    }

    public static CameraUpdate newLatLngBoundsRect(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        if (latLngBounds != null) {
            return new CameraUpdate(kem.k(latLngBounds, i, i2, i3, i4));
        }
        Log.w(CLASSNAME, "bounds is null");
        return new CameraUpdate(kem.o());
    }

    public static CameraUpdate newLatLngZoom(LatLng latLng, float f) {
        if (latLng != null) {
            return new CameraUpdate(kem.h(latLng, f));
        }
        Log.w(CLASSNAME, "target is null");
        return new CameraUpdate(kem.o());
    }

    public static CameraUpdate scrollBy(float f, float f2) {
        return new CameraUpdate(kem.c(f, f2));
    }

    public static CameraUpdate zoomBy(float f) {
        return new CameraUpdate(kem.m(f));
    }

    public static CameraUpdate zoomIn() {
        return new CameraUpdate(kem.a());
    }

    public static CameraUpdate zoomOut() {
        return new CameraUpdate(kem.l());
    }

    public static CameraUpdate zoomTo(float f) {
        return new CameraUpdate(kem.b(f));
    }

    public static CameraUpdate zoomBy(float f, Point point) {
        return new CameraUpdate(kem.d(f, point));
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i, int i2, int i3) {
        if (latLngBounds == null) {
            Log.w(CLASSNAME, "bounds is null");
            return new CameraUpdate(kem.o());
        }
        return new CameraUpdate(kem.j(latLngBounds, i, i2, i3));
    }
}
