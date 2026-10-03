package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class i2n {
    public static long A = 0;
    public static Object B = new Object();
    public static long C = 0;
    public static boolean D = false;
    public static boolean E = false;
    public static volatile AMapLocation y;
    public static AMapLocation z;
    public Handler a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LocationManager f12366c;
    public AMapLocationClientOption d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.autonavi.aps.amapapi.filters.a f12369l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12367e = null;
    public int f = 0;
    public boolean g = false;
    public long h = 0;
    public long i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12368j = false;
    public int k = 0;
    public int m = 240;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12370n = 80;
    public AMapLocation o = null;
    public long p = 0;
    public float q = 0.0f;
    public Object r = new Object();
    public Object s = new Object();
    public AMapLocationClientOption.GeoLanguage t = AMapLocationClientOption.GeoLanguage.DEFAULT;
    public boolean u = true;
    public long v = 0;
    public int w = 0;
    public LocationListener x = null;

    public static class a implements LocationListener {
        public i2n a;

        public a(i2n i2nVar) {
            this.a = i2nVar;
        }

        public final void a() {
            this.a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                new StringBuilder("tid=").append(Thread.currentThread().getId());
                com.autonavi.aps.amapapi.utils.e.a();
                i2n i2nVar = this.a;
                if (i2nVar != null) {
                    i2nVar.e(location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                i2n i2nVar = this.a;
                if (i2nVar != null) {
                    i2nVar.m(str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
            try {
                i2n i2nVar = this.a;
                if (i2nVar != null) {
                    i2nVar.c(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public i2n(Context context, Handler handler) {
        this.f12369l = null;
        this.b = context;
        this.a = handler;
        try {
            this.f12366c = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "NetworkLocation", "<init>");
        }
        this.f12369l = new com.autonavi.aps.amapapi.filters.a();
    }

    public static boolean n(LocationManager locationManager) {
        try {
            if (D) {
                return E;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders == null || allProviders.size() <= 0) {
                E = false;
            } else {
                E = allProviders.contains("network");
            }
            D = true;
            return E;
        } catch (Throwable th) {
            new StringBuilder("NetworkLocation | hasProvider error: ").append(th.getMessage());
            com.autonavi.aps.amapapi.utils.e.a();
            return E;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    public final AMapLocation a(AMapLocation aMapLocation, String str) {
        long j2;
        if (this.o == null) {
            return aMapLocation;
        }
        if ((!this.d.isMockEnable() && this.o.isMock()) || !com.autonavi.aps.amapapi.utils.k.a(this.o)) {
            return aMapLocation;
        }
        float speed = this.o.getSpeed();
        if (speed == 0.0f) {
            long j3 = this.p;
            if (j3 > 0 && j3 < 8) {
                float f = this.q;
                if (f > 0.0f) {
                    speed = f / j3;
                }
            }
        }
        if (aMapLocation == null || !com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
            j2 = 30000;
        } else if (aMapLocation.getAccuracy() < 200.0f) {
            int i = this.f + 1;
            this.f = i;
            if (this.f12367e == null && i >= 2) {
                this.g = true;
            }
            j2 = speed > 5.0f ? 10000L : 15000L;
        } else {
            if (!TextUtils.isEmpty(this.f12367e)) {
                this.g = false;
                this.f = 0;
            }
            if (speed > 5.0f) {
                j2 = 20000;
            } else {
                j2 = 30000;
            }
        }
        long jB = com.autonavi.aps.amapapi.utils.k.b() - this.i;
        if (jB > 30000) {
            return aMapLocation;
        }
        if (jB < j2) {
            if (this.f12367e == null && this.f >= 2) {
                this.f12367e = str;
            }
            AMapLocation aMapLocationM4468clone = this.o.m4468clone();
            aMapLocationM4468clone.setTrustedLevel(2);
            return aMapLocationM4468clone;
        }
        if (this.g && q(str)) {
            AMapLocation aMapLocationM4468clone2 = this.o.m4468clone();
            aMapLocationM4468clone2.setTrustedLevel(3);
            return aMapLocationM4468clone2;
        }
        this.f12367e = null;
        this.f = 0;
        synchronized (this.s) {
            this.o = null;
        }
        this.p = 0L;
        this.q = 0.0f;
        return aMapLocation;
    }

    public final void b() {
        LocationManager locationManager = this.f12366c;
        if (locationManager == null) {
            return;
        }
        try {
            LocationListener locationListener = this.x;
            if (locationListener != null) {
                locationManager.removeUpdates(locationListener);
                ((a) this.x).a();
                this.x = null;
            }
        } catch (Throwable unused) {
        }
        try {
            Handler handler = this.a;
            if (handler != null) {
                handler.removeMessages(17);
            }
        } catch (Throwable unused2) {
        }
        this.h = 0L;
        this.v = 0L;
        this.i = 0L;
        this.k = 0;
        this.w = 0;
        this.f12369l.a();
        this.o = null;
        this.p = 0L;
        this.q = 0.0f;
        this.f12367e = null;
    }

    public final void c(int i) {
        if (i == 0) {
            try {
                this.i = 0L;
            } catch (Throwable unused) {
            }
        }
    }

    public final void d(int i, int i2, String str, long j2) {
        try {
            if (this.a == null || this.d.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Battery_Saving) {
                return;
            }
            Message messageObtain = Message.obtain();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setProvider("network");
            aMapLocation.setErrorCode(i2);
            aMapLocation.setLocationDetail(str);
            aMapLocation.setLocationType(12);
            messageObtain.obj = aMapLocation;
            messageObtain.what = i;
            this.a.sendMessageDelayed(messageObtain, j2);
        } catch (Throwable unused) {
        }
    }

    public final void e(Location location) {
        Handler handler = this.a;
        if (handler != null) {
            handler.removeMessages(17);
        }
        if (location == null) {
            return;
        }
        try {
            AMapLocation aMapLocation = new AMapLocation(location);
            if (com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
                aMapLocation.setProvider("network");
                aMapLocation.setLocationType(12);
                if (!this.f12368j && com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
                    com.autonavi.aps.amapapi.utils.i.a(this.b, com.autonavi.aps.amapapi.utils.k.b() - this.h, com.autonavi.aps.amapapi.utils.c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                    this.f12368j = true;
                }
                w(aMapLocation);
                AMapLocation aMapLocationX = x(aMapLocation);
                g(aMapLocationX);
                o(aMapLocationX);
                synchronized (this.r) {
                    h(aMapLocationX, y);
                }
                try {
                    if (com.autonavi.aps.amapapi.utils.k.a(aMapLocationX)) {
                        if (this.o != null) {
                            this.p = location.getTime() - this.o.getTime();
                            this.q = com.autonavi.aps.amapapi.utils.k.a(this.o, aMapLocationX);
                        }
                        synchronized (this.s) {
                            this.o = aMapLocationX.m4468clone();
                        }
                        this.f12367e = null;
                        this.g = false;
                        this.f = 0;
                    }
                } catch (Throwable th) {
                    com.autonavi.aps.amapapi.utils.c.a(th, "NetworkLocation", "onLocationChangedLast");
                }
                r(aMapLocationX);
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "NetworkLocation", "onLocationChanged");
        }
    }

    public final void f(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                this.m = bundle.getInt("I_MAX_GEO_DIS");
                this.f12370n = bundle.getInt("I_MIN_GEO_DIS");
                AMapLocation aMapLocation = (AMapLocation) bundle.getParcelable("loc");
                if (TextUtils.isEmpty(aMapLocation.getAdCode())) {
                    return;
                }
                synchronized (this.r) {
                    try {
                        y = aMapLocation;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                com.autonavi.aps.amapapi.utils.c.a(th2, "NetworkLocation", "setLastGeoLocation");
            }
        }
    }

    public final void g(AMapLocation aMapLocation) {
        if (com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
            this.i = com.autonavi.aps.amapapi.utils.k.b();
            synchronized (B) {
                A = com.autonavi.aps.amapapi.utils.k.b();
                z = aMapLocation.m4468clone();
            }
            this.k++;
        }
    }

    public final void h(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 == null || !this.d.isNeedAddress() || com.autonavi.aps.amapapi.utils.k.a(aMapLocation, aMapLocation2) >= this.m) {
            return;
        }
        com.autonavi.aps.amapapi.utils.c.a(aMapLocation, aMapLocation2);
    }

    public final void i(AMapLocationClientOption aMapLocationClientOption) {
        this.d = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.d = new AMapLocationClientOption();
        }
        try {
            C = com.autonavi.aps.amapapi.utils.j.a(this.b, "pref", "lagt", C);
        } catch (Throwable unused) {
        }
        t();
    }

    public final void m(String str) {
        try {
            if ("network".equalsIgnoreCase(str)) {
                this.i = 0L;
            }
        } catch (Throwable unused) {
        }
    }

    public final void o(AMapLocation aMapLocation) {
        if (com.autonavi.aps.amapapi.utils.k.a(aMapLocation) && this.a != null) {
            long jB = com.autonavi.aps.amapapi.utils.k.b();
            if (this.d.getInterval() <= 8000 || jB - this.v > this.d.getInterval() - 8000) {
                Bundle bundle = new Bundle();
                bundle.putDouble("lat", aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                bundle.putFloat("radius", aMapLocation.getAccuracy());
                bundle.putLong(ClickApiEntity.TIME, aMapLocation.getTime());
                Message messageObtain = Message.obtain();
                messageObtain.setData(bundle);
                messageObtain.what = 14;
                synchronized (this.r) {
                    if (y == null || com.autonavi.aps.amapapi.utils.k.a(aMapLocation, y) > this.f12370n) {
                        this.a.sendMessage(messageObtain);
                    }
                }
            }
        }
    }

    public final boolean p() {
        AMapLocationClientOption aMapLocationClientOption = this.d;
        return (aMapLocationClientOption == null || aMapLocationClientOption.isOnceLocation() || com.autonavi.aps.amapapi.utils.k.b() - this.i <= 300000) ? false : true;
    }

    public final boolean q(String str) {
        try {
            ArrayList<String> arrayListB = com.autonavi.aps.amapapi.utils.k.b(str);
            ArrayList<String> arrayListB2 = com.autonavi.aps.amapapi.utils.k.b(this.f12367e);
            if (arrayListB.size() < 8 || arrayListB2.size() < 8) {
                return false;
            }
            return com.autonavi.aps.amapapi.utils.k.a(this.f12367e, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void r(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() != 15 || AMapLocationClientOption.AMapLocationMode.Battery_Saving.equals(this.d.getLocationMode())) {
            if (this.d.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Battery_Saving) && this.d.getDeviceModeDistanceFilter() > 0.0f) {
                u(aMapLocation);
            } else if (com.autonavi.aps.amapapi.utils.k.b() - this.v >= this.d.getInterval() - 200) {
                this.v = com.autonavi.aps.amapapi.utils.k.b();
                u(aMapLocation);
            }
        }
    }

    public final boolean s() {
        return com.autonavi.aps.amapapi.utils.k.b() - this.i <= 2800;
    }

    public final void t() {
        if (this.f12366c == null) {
            return;
        }
        try {
            v();
            this.u = true;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = this.b.getMainLooper();
            }
            Looper looper = looperMyLooper;
            this.h = com.autonavi.aps.amapapi.utils.k.b();
            if (!n(this.f12366c)) {
                com.autonavi.aps.amapapi.utils.e.a();
                d(17, 13, "no network provider#1402", 0L);
                return;
            }
            try {
                if (com.autonavi.aps.amapapi.utils.k.a() - C >= 259200000) {
                    if (com.autonavi.aps.amapapi.utils.k.c(this.b, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                        this.f12366c.sendExtraCommand(f58.GPS, "force_xtra_injection", null);
                        C = com.autonavi.aps.amapapi.utils.k.a();
                        SharedPreferences.Editor editorA = com.autonavi.aps.amapapi.utils.j.a(this.b, "pref");
                        com.autonavi.aps.amapapi.utils.j.a(editorA, "lagt", C);
                        com.autonavi.aps.amapapi.utils.j.a(editorA);
                        com.autonavi.aps.amapapi.utils.e.a();
                    } else {
                        com.autonavi.aps.amapapi.utils.c.a(new Exception("n_alec"), "OPENSDK_GL", "rlu_n_alec");
                    }
                }
            } catch (Throwable th) {
                new StringBuilder("GpsLocation | sendExtraCommand error: ").append(th.getMessage());
                com.autonavi.aps.amapapi.utils.e.a();
            }
            if (this.x == null) {
                this.x = new a(this);
            }
            if (!this.d.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Battery_Saving) || this.d.getDeviceModeDistanceFilter() <= 0.0f) {
                this.f12366c.requestLocationUpdates("network", 900L, 0.0f, this.x, looper);
            } else {
                this.f12366c.requestLocationUpdates("network", this.d.getInterval(), this.d.getDeviceModeDistanceFilter(), this.x, looper);
            }
            d(17, 13, "no enough satellites#1401", this.d.getHttpTimeOut());
        } catch (SecurityException e2) {
            com.autonavi.aps.amapapi.utils.e.a();
            this.u = false;
            com.autonavi.aps.amapapi.utils.i.a((String) null, 2121);
            d(15, 12, e2.getMessage() + "#1201", 0L);
        } catch (Throwable th2) {
            new StringBuilder("NetworkLocation | requestLocationUpdates error: ").append(th2.getMessage());
            com.autonavi.aps.amapapi.utils.e.a();
            com.autonavi.aps.amapapi.utils.c.a(th2, "NetworkLocation", "requestLocationUpdates part2");
        }
    }

    public final void u(AMapLocation aMapLocation) {
        if (this.a != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = aMapLocation;
            messageObtain.what = 15;
            this.a.sendMessage(messageObtain);
        }
    }

    public final void v() {
        if (com.autonavi.aps.amapapi.utils.k.b() - A > 5000 || !com.autonavi.aps.amapapi.utils.k.a(z)) {
            return;
        }
        if (this.d.isMockEnable() || !z.isMock()) {
            synchronized (this.r) {
                h(z, vym.y);
            }
            this.i = com.autonavi.aps.amapapi.utils.k.b();
            r(z);
        }
    }

    public final void w(AMapLocation aMapLocation) {
        try {
            if (!com.autonavi.aps.amapapi.utils.c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) || !this.d.isOffset()) {
                aMapLocation.setOffset(false);
                aMapLocation.setCoordType("WGS84");
                return;
            }
            DPoint dPointA = com.autonavi.aps.amapapi.utils.f.a(this.b, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
            aMapLocation.setLatitude(dPointA.getLatitude());
            aMapLocation.setLongitude(dPointA.getLongitude());
            aMapLocation.setOffset(this.d.isOffset());
            aMapLocation.setCoordType("GCJ02");
        } catch (Throwable unused) {
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType("WGS84");
        }
    }

    public final AMapLocation x(AMapLocation aMapLocation) {
        if (!com.autonavi.aps.amapapi.utils.k.a(aMapLocation) || this.k < 3) {
            return aMapLocation;
        }
        if (aMapLocation.getAccuracy() < 0.0f || aMapLocation.getAccuracy() == Float.MAX_VALUE) {
            aMapLocation.setAccuracy(0.0f);
        }
        if (aMapLocation.getSpeed() < 0.0f || aMapLocation.getSpeed() == Float.MAX_VALUE) {
            aMapLocation.setSpeed(0.0f);
        }
        return this.f12369l.a(aMapLocation);
    }
}
