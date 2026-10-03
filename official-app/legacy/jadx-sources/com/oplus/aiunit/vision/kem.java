package com.oplus.aiunit.vision;

import android.graphics.Point;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;

/* JADX INFO: loaded from: classes12.dex */
public final class kem {
    public static AbstractCameraUpdateMessage a() {
        jem jemVar = new jem();
        jemVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        jemVar.amount = 1.0f;
        return jemVar;
    }

    public static AbstractCameraUpdateMessage b(float f) {
        hem hemVar = new hem();
        hemVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        hemVar.zoom = f;
        return hemVar;
    }

    public static AbstractCameraUpdateMessage c(float f, float f2) {
        iem iemVar = new iem();
        iemVar.nowType = AbstractCameraUpdateMessage.Type.scrollBy;
        iemVar.xPixel = f;
        iemVar.yPixel = f2;
        return iemVar;
    }

    public static AbstractCameraUpdateMessage d(float f, Point point) {
        jem jemVar = new jem();
        jemVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        jemVar.amount = f;
        jemVar.focus = point;
        return jemVar;
    }

    public static AbstractCameraUpdateMessage e(Point point) {
        hem hemVar = new hem();
        hemVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        hemVar.geoPoint = new DPoint(point.x, point.y);
        return hemVar;
    }

    public static AbstractCameraUpdateMessage f(CameraPosition cameraPosition) {
        LatLng latLng;
        hem hemVar = new hem();
        hemVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        if (cameraPosition != null && (latLng = cameraPosition.target) != null) {
            DPoint dPointLatLongToPixelsDouble = VirtualEarthProjection.latLongToPixelsDouble(latLng.latitude, latLng.longitude, 20);
            hemVar.geoPoint = new DPoint(dPointLatLongToPixelsDouble.x, dPointLatLongToPixelsDouble.y);
            hemVar.zoom = cameraPosition.zoom;
            hemVar.bearing = cameraPosition.bearing;
            hemVar.tilt = cameraPosition.tilt;
            hemVar.cameraPosition = cameraPosition;
        }
        return hemVar;
    }

    public static AbstractCameraUpdateMessage g(LatLng latLng) {
        return f(CameraPosition.builder().target(latLng).zoom(Float.NaN).bearing(Float.NaN).tilt(Float.NaN).build());
    }

    public static AbstractCameraUpdateMessage h(LatLng latLng, float f) {
        return f(CameraPosition.builder().target(latLng).zoom(f).bearing(Float.NaN).tilt(Float.NaN).build());
    }

    public static AbstractCameraUpdateMessage i(LatLngBounds latLngBounds, int i) {
        gem gemVar = new gem();
        gemVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBounds;
        gemVar.bounds = latLngBounds;
        gemVar.paddingLeft = i;
        gemVar.paddingRight = i;
        gemVar.paddingTop = i;
        gemVar.paddingBottom = i;
        return gemVar;
    }

    public static AbstractCameraUpdateMessage j(LatLngBounds latLngBounds, int i, int i2, int i3) {
        gem gemVar = new gem();
        gemVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBoundsWithSize;
        gemVar.bounds = latLngBounds;
        gemVar.paddingLeft = i3;
        gemVar.paddingRight = i3;
        gemVar.paddingTop = i3;
        gemVar.paddingBottom = i3;
        gemVar.width = i;
        gemVar.height = i2;
        return gemVar;
    }

    public static AbstractCameraUpdateMessage k(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        gem gemVar = new gem();
        gemVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBounds;
        gemVar.bounds = latLngBounds;
        gemVar.paddingLeft = i;
        gemVar.paddingRight = i2;
        gemVar.paddingTop = i3;
        gemVar.paddingBottom = i4;
        return gemVar;
    }

    public static AbstractCameraUpdateMessage l() {
        jem jemVar = new jem();
        jemVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        jemVar.amount = -1.0f;
        return jemVar;
    }

    public static AbstractCameraUpdateMessage m(float f) {
        return d(f, null);
    }

    public static AbstractCameraUpdateMessage n(float f, Point point) {
        hem hemVar = new hem();
        hemVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        hemVar.geoPoint = new DPoint(point.x, point.y);
        hemVar.bearing = f;
        return hemVar;
    }

    public static AbstractCameraUpdateMessage o() {
        return new hem();
    }

    public static AbstractCameraUpdateMessage p(float f) {
        hem hemVar = new hem();
        hemVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        hemVar.tilt = f;
        return hemVar;
    }

    public static AbstractCameraUpdateMessage q(float f) {
        hem hemVar = new hem();
        hemVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        hemVar.bearing = f;
        return hemVar;
    }
}
