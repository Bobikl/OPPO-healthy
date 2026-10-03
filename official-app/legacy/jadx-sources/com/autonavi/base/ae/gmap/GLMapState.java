package com.autonavi.base.ae.gmap;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.autonavi.amap.api.mapcore.IGLMapState;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import com.autonavi.base.amap.mapcore.FPoint;

/* JADX INFO: loaded from: classes13.dex */
public class GLMapState implements IGLMapState {
    private int engineID;
    private boolean isNewInstance;
    private long nativeEngineInstance;
    private long nativeStateInstance;

    public GLMapState(int i, long j2) {
        this.nativeStateInstance = 0L;
        this.nativeEngineInstance = 0L;
        this.isNewInstance = false;
        if (j2 != 0) {
            this.engineID = i;
            this.nativeEngineInstance = j2;
            this.nativeStateInstance = nativeNewInstance(i, j2);
            this.isNewInstance = true;
        }
    }

    public static void geo2LonLat(long j2, long j3, DPoint dPoint) {
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(j2, j3, 20);
        dPoint.x = dPointPixelsToLatLong.x;
        dPoint.y = dPointPixelsToLatLong.y;
        dPointPixelsToLatLong.recycle();
    }

    public static void lonlat2Geo(double d, double d2, IPoint iPoint) {
        Point pointLatLongToPixels = VirtualEarthProjection.latLongToPixels(d2, d, 20);
        ((Point) iPoint).x = pointLatLongToPixels.x;
        ((Point) iPoint).y = pointLatLongToPixels.y;
    }

    public static native float nativeCalMapZoomScalefactor(long j2, int i, int i2, float f);

    public static native float nativeCalculateMapZoomer(long j2, int i, int i2, int i3, int i4, int i5);

    public static native float nativeGetCameraDegree(long j2);

    public static native float nativeGetGLUnitWithWin(long j2, int i);

    public static native float nativeGetMapAngle(long j2);

    public static native void nativeGetMapCenter(long j2, Point point);

    public static native double nativeGetMapCenterXDouble(long j2);

    public static native double nativeGetMapCenterYDouble(long j2);

    public static native float nativeGetMapZoomer(long j2);

    public static native void nativeGetPixel20Bound(long j2, Rect rect, int i, int i2);

    public static native void nativeGetProjectionMatrix(long j2, float[] fArr);

    public static native float nativeGetSkyHeight(long j2);

    public static native void nativeGetViewMatrix(long j2, float[] fArr);

    public static native long nativeNewInstance(int i, long j2);

    public static native void nativeP20ToScreenPoint(long j2, int i, int i2, int i3, PointF pointF);

    public static native void nativeRecalculate(long j2);

    public static native void nativeScreenToP20Point(long j2, float f, float f2, Point point);

    public static native void nativeSetCameraDegree(long j2, float f);

    public static native void nativeSetMapAngle(long j2, float f);

    public static native void nativeSetMapCenter(long j2, double d, double d2);

    private static native void nativeSetMapState(int i, long j2, long j3);

    public static native void nativeSetMapZoomer(long j2, float f);

    public static native void nativeStateDestroy(long j2, long j3);

    public float calMapZoomScalefactor(int i, int i2, int i3) {
        return nativeCalMapZoomScalefactor(this.nativeStateInstance, i, i2, i3);
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public float calculateMapZoomer(int i, int i2, int i3, int i4, int i5) {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            return nativeCalculateMapZoomer(j2, i, i2, i3, i4, i5);
        }
        return 3.0f;
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public float getCameraDegree() {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            return nativeGetCameraDegree(j2);
        }
        return 0.0f;
    }

    public float getGLUnitWithWin(int i) {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            return nativeGetGLUnitWithWin(j2, i);
        }
        return 0.0f;
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public float getMapAngle() {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            return nativeGetMapAngle(j2);
        }
        return 0.0f;
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void getMapGeoCenter(IPoint iPoint) {
        nativeGetMapCenter(this.nativeStateInstance, iPoint);
    }

    public double getMapGeoCenterX() {
        return nativeGetMapCenterXDouble(this.nativeStateInstance);
    }

    public double getMapGeoCenterY() {
        return nativeGetMapCenterXDouble(this.nativeStateInstance);
    }

    public float getMapLenWithWin(int i) {
        return getGLUnitWithWin(i);
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public float getMapZoomer() {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            return nativeGetMapZoomer(j2);
        }
        return 0.0f;
    }

    public long getNativeInstance() {
        return this.nativeStateInstance;
    }

    public void getPixel20Bound(Rect rect, int i, int i2) {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            nativeGetPixel20Bound(j2, rect, i, i2);
        }
    }

    public void getProjectionMatrix(float[] fArr) {
        if (fArr == null || fArr.length != 16) {
            return;
        }
        nativeGetProjectionMatrix(this.nativeStateInstance, fArr);
    }

    public float getSkyHeight() {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            return nativeGetSkyHeight(j2);
        }
        return 0.0f;
    }

    public void getViewMatrix(float[] fArr) {
        if (fArr == null || fArr.length != 16) {
            return;
        }
        nativeGetViewMatrix(this.nativeStateInstance, fArr);
    }

    public void p20ToScreenPoint(int i, int i2, FPoint fPoint) {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            nativeP20ToScreenPoint(j2, i, i2, 0, fPoint);
        }
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void recalculate() {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            nativeRecalculate(j2);
        }
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void recycle() {
        long j2 = this.nativeStateInstance;
        if (j2 != 0 && this.isNewInstance) {
            nativeStateDestroy(j2, this.nativeEngineInstance);
        }
        this.nativeStateInstance = 0L;
    }

    public void reset() {
        if (this.nativeStateInstance != 0) {
            recycle();
        }
        long j2 = this.nativeEngineInstance;
        if (j2 != 0) {
            this.nativeStateInstance = nativeNewInstance(this.engineID, j2);
        }
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void screenToP20Point(int i, int i2, Point point) {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            nativeScreenToP20Point(j2, i, i2, point);
        }
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void setCameraDegree(float f) {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            nativeSetCameraDegree(j2, f);
        }
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void setMapAngle(float f) {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            nativeSetMapAngle(j2, f);
        }
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void setMapGeoCenter(double d, double d2) {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            nativeSetMapCenter(j2, d, d2);
        }
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public void setMapZoomer(float f) {
        long j2 = this.nativeStateInstance;
        if (j2 != 0) {
            nativeSetMapZoomer(j2, f);
        }
    }

    public void setNativeMapengineState(int i, long j2) {
        if (j2 != 0) {
            long j3 = this.nativeStateInstance;
            if (j3 == 0) {
                return;
            }
            this.nativeEngineInstance = j2;
            nativeSetMapState(i, j2, j3);
        }
    }

    public String toString() {
        return "instance: " + this.nativeStateInstance + " center: " + getMapGeoCenter().x + " , " + getMapGeoCenter().y + " bearing:" + getCameraDegree() + "  tilt:" + getMapAngle() + "  zoom:" + getMapZoomer() + "  ";
    }

    @Override // com.autonavi.amap.api.mapcore.IGLMapState
    public DPoint getMapGeoCenter() {
        DPoint dPoint = new DPoint();
        dPoint.x = nativeGetMapCenterXDouble(this.nativeStateInstance);
        dPoint.y = nativeGetMapCenterYDouble(this.nativeStateInstance);
        return dPoint;
    }

    public GLMapState(int i, long j2, long j3) {
        this.nativeStateInstance = 0L;
        this.nativeEngineInstance = 0L;
        this.isNewInstance = false;
        if (j2 != 0) {
            this.engineID = i;
            this.nativeEngineInstance = j2;
            this.nativeStateInstance = j3;
            this.isNewInstance = true;
        }
    }
}
