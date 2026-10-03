package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class vym {
    public static AMapLocation E = null;
    public static long F = 0;
    public static Object G = new Object();
    public static long H = 0;
    public static boolean I = false;
    public static boolean J = false;
    public static volatile AMapLocation y;
    public Handler a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LocationManager f18040c;
    public AMapLocationClientOption d;
    public com.autonavi.aps.amapapi.filters.a i;
    public GnssStatus.Callback t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18041e = 0;
    public long f = 0;
    public boolean g = false;
    public int h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18042j = 240;
    public int k = 80;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AMapLocation f18043l = null;
    public long m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18044n = 0.0f;
    public Object o = new Object();
    public Object p = new Object();
    public int q = 0;
    public GpsStatus r = null;
    public GpsStatus.Listener s = null;
    public AMapLocationClientOption.GeoLanguage u = AMapLocationClientOption.GeoLanguage.DEFAULT;
    public boolean v = true;
    public long w = 0;
    public int x = 0;
    public LocationListener z = null;
    public String A = null;
    public boolean B = false;
    public int C = 0;
    public boolean D = false;

    public class a extends GnssStatus.Callback {
        public a() {
        }

        @Override // android.location.GnssStatus.Callback
        public final void onFirstFix(int i) {
            vym.K();
        }

        @Override // android.location.GnssStatus.Callback
        public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            vym.this.e(gnssStatus);
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStarted() {
            vym.I();
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStopped() {
            vym.this.J();
        }
    }

    public static class b implements LocationListener {
        public vym a;

        public b(vym vymVar) {
            this.a = vymVar;
        }

        public final void a() {
            this.a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                new StringBuilder("tid=").append(Thread.currentThread().getId());
                com.autonavi.aps.amapapi.utils.e.a();
                vym vymVar = this.a;
                if (vymVar != null) {
                    vymVar.f(location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                vym vymVar = this.a;
                if (vymVar != null) {
                    vymVar.p(str);
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
                vym vymVar = this.a;
                if (vymVar != null) {
                    vymVar.c(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public vym(Context context, Handler handler) {
        this.i = null;
        this.b = context;
        this.a = handler;
        try {
            this.f18040c = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "GpsLocation", "<init>");
        }
        this.i = new com.autonavi.aps.amapapi.filters.a();
    }

    public static void G(AMapLocation aMapLocation) {
        if (com.autonavi.aps.amapapi.utils.k.a(aMapLocation) && com.autonavi.aps.amapapi.utils.b.s()) {
            long time = aMapLocation.getTime();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jA = com.autonavi.aps.amapapi.utils.d.a(time, jCurrentTimeMillis, com.autonavi.aps.amapapi.utils.b.t());
            if (jA != time) {
                aMapLocation.setTime(jA);
                com.autonavi.aps.amapapi.utils.i.a(time, jCurrentTimeMillis);
            }
        }
    }

    public static void I() {
        com.autonavi.aps.amapapi.utils.e.a();
    }

    public static void K() {
        com.autonavi.aps.amapapi.utils.e.a();
    }

    public static boolean M() {
        try {
            return ((Boolean) com.autonavi.aps.amapapi.utils.g.a(w0n.t("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), w0n.t("UaXNOYXZpU3RhcnRlZA=="), (Object[]) null, (Class<?>[]) null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean q(LocationManager locationManager) {
        try {
            if (I) {
                return J;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders == null || allProviders.size() <= 0) {
                J = false;
            } else {
                J = allProviders.contains(f58.GPS);
            }
            I = true;
            return J;
        } catch (Throwable th) {
            new StringBuilder("GpsLocation | hasProvider error: ").append(th.getMessage());
            com.autonavi.aps.amapapi.utils.e.a();
            return J;
        }
    }

    public final void A(AMapLocation aMapLocation) {
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

    public final void B(AMapLocation aMapLocation) {
        try {
            int i = this.q;
            if (i >= 4) {
                aMapLocation.setGpsAccuracyStatus(1);
            } else if (i == 0) {
                aMapLocation.setGpsAccuracyStatus(-1);
            } else {
                aMapLocation.setGpsAccuracyStatus(0);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean C() {
        AMapLocationClientOption aMapLocationClientOption = this.d;
        return (aMapLocationClientOption == null || aMapLocationClientOption.isOnceLocation() || com.autonavi.aps.amapapi.utils.k.b() - this.f <= 300000) ? false : true;
    }

    public final AMapLocation D(AMapLocation aMapLocation) {
        if (!com.autonavi.aps.amapapi.utils.k.a(aMapLocation) || this.h < 3) {
            return aMapLocation;
        }
        if (aMapLocation.getAccuracy() < 0.0f || aMapLocation.getAccuracy() == Float.MAX_VALUE) {
            aMapLocation.setAccuracy(0.0f);
        }
        if (aMapLocation.getSpeed() < 0.0f || aMapLocation.getSpeed() == Float.MAX_VALUE) {
            aMapLocation.setSpeed(0.0f);
        }
        return this.i.a(aMapLocation);
    }

    public final void H() {
        if (this.f18040c == null) {
            return;
        }
        try {
            L();
            this.v = true;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = this.b.getMainLooper();
            }
            Looper looper = looperMyLooper;
            this.f18041e = com.autonavi.aps.amapapi.utils.k.b();
            if (!q(this.f18040c)) {
                com.autonavi.aps.amapapi.utils.e.a();
                d(8, 14, "no gps provider#1402", 0L);
                return;
            }
            try {
                if (com.autonavi.aps.amapapi.utils.k.a() - H >= 259200000) {
                    if (com.autonavi.aps.amapapi.utils.k.c(this.b, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                        this.f18040c.sendExtraCommand(f58.GPS, "force_xtra_injection", null);
                        H = com.autonavi.aps.amapapi.utils.k.a();
                        SharedPreferences.Editor editorA = com.autonavi.aps.amapapi.utils.j.a(this.b, "pref");
                        com.autonavi.aps.amapapi.utils.j.a(editorA, "lagt", H);
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
            if (this.z == null) {
                this.z = new b(this);
            }
            if (!this.d.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) || this.d.getDeviceModeDistanceFilter() <= 0.0f) {
                this.f18040c.requestLocationUpdates(f58.GPS, 900L, 0.0f, this.z, looper);
            } else {
                this.f18040c.requestLocationUpdates(f58.GPS, this.d.getInterval(), this.d.getDeviceModeDistanceFilter(), this.z, looper);
            }
            a aVar = new a();
            this.t = aVar;
            this.f18040c.registerGnssStatusCallback(aVar);
            d(8, 14, "no enough satellites#1401", this.d.getHttpTimeOut());
        } catch (SecurityException e2) {
            com.autonavi.aps.amapapi.utils.e.a();
            this.v = false;
            com.autonavi.aps.amapapi.utils.i.a((String) null, 2121);
            d(2, 12, e2.getMessage() + "#1201", 0L);
        } catch (Throwable th2) {
            new StringBuilder("GpsLocation | requestLocationUpdates error: ").append(th2.getMessage());
            com.autonavi.aps.amapapi.utils.e.a();
            com.autonavi.aps.amapapi.utils.c.a(th2, "GpsLocation", "requestLocationUpdates part2");
        }
    }

    public final void J() {
        com.autonavi.aps.amapapi.utils.e.a();
        this.q = 0;
    }

    public final void L() {
        if (com.autonavi.aps.amapapi.utils.k.b() - F > 5000 || !com.autonavi.aps.amapapi.utils.k.a(E)) {
            return;
        }
        if (this.d.isMockEnable() || !E.isMock()) {
            synchronized (this.o) {
                i(E, y);
            }
            this.f = com.autonavi.aps.amapapi.utils.k.b();
            w(E);
        }
    }

    public final AMapLocation N() {
        float f;
        float f2;
        try {
            if (com.autonavi.aps.amapapi.utils.k.a(this.f18043l) && com.autonavi.aps.amapapi.utils.b.k() && M()) {
                JSONObject jSONObject = new JSONObject((String) com.autonavi.aps.amapapi.utils.g.a(w0n.t("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), w0n.t("UZ2V0TmF2aUxvY2F0aW9u"), (Object[]) null, (Class<?>[]) null));
                long jOptLong = jSONObject.optLong(ClickApiEntity.TIME);
                if (!this.D) {
                    this.D = true;
                    com.autonavi.aps.amapapi.utils.i.a("useNaviLoc", "use NaviLoc");
                }
                if (com.autonavi.aps.amapapi.utils.k.a() - jOptLong <= 5500) {
                    double dOptDouble = jSONObject.optDouble("lat", 0.0d);
                    double dOptDouble2 = jSONObject.optDouble("lng", 0.0d);
                    float f3 = 0.0f;
                    try {
                        f = Float.parseFloat(jSONObject.optString("accuracy", "0"));
                    } catch (NumberFormatException unused) {
                        f = 0.0f;
                    }
                    double dOptDouble3 = jSONObject.optDouble("altitude", 0.0d);
                    try {
                        f2 = Float.parseFloat(jSONObject.optString("bearing", "0"));
                    } catch (NumberFormatException unused2) {
                        f2 = 0.0f;
                    }
                    try {
                        f3 = (Float.parseFloat(jSONObject.optString("speed", "0")) * 10.0f) / 36.0f;
                    } catch (NumberFormatException unused3) {
                    }
                    AMapLocation aMapLocation = new AMapLocation("lbs");
                    aMapLocation.setLocationType(9);
                    aMapLocation.setLatitude(dOptDouble);
                    aMapLocation.setLongitude(dOptDouble2);
                    aMapLocation.setAccuracy(f);
                    aMapLocation.setAltitude(dOptDouble3);
                    aMapLocation.setBearing(f2);
                    aMapLocation.setSpeed(f3);
                    aMapLocation.setTime(jOptLong);
                    aMapLocation.setCoordType("GCJ02");
                    if (com.autonavi.aps.amapapi.utils.k.a(aMapLocation, this.f18043l) <= 300.0f) {
                        synchronized (this.p) {
                            this.f18043l.setLongitude(dOptDouble2);
                            this.f18043l.setLatitude(dOptDouble);
                            this.f18043l.setAccuracy(f);
                            this.f18043l.setBearing(f2);
                            this.f18043l.setSpeed(f3);
                            this.f18043l.setTime(jOptLong);
                            this.f18043l.setCoordType("GCJ02");
                        }
                        return aMapLocation;
                    }
                }
            }
        } catch (Throwable unused4) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    public final AMapLocation a(AMapLocation aMapLocation, String str) {
        long j2;
        if (this.f18043l == null) {
            return aMapLocation;
        }
        if ((!this.d.isMockEnable() && this.f18043l.isMock()) || !com.autonavi.aps.amapapi.utils.k.a(this.f18043l)) {
            return aMapLocation;
        }
        AMapLocation aMapLocationN = N();
        if (aMapLocationN != null && com.autonavi.aps.amapapi.utils.k.a(aMapLocationN)) {
            aMapLocationN.setTrustedLevel(2);
            return aMapLocationN;
        }
        float speed = this.f18043l.getSpeed();
        if (speed == 0.0f) {
            long j3 = this.m;
            if (j3 > 0 && j3 < 8) {
                float f = this.f18044n;
                if (f > 0.0f) {
                    speed = f / j3;
                }
            }
        }
        if (aMapLocation == null || !com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
            j2 = 30000;
        } else if (aMapLocation.getAccuracy() < 200.0f) {
            int i = this.C + 1;
            this.C = i;
            if (this.A == null && i >= 2) {
                this.B = true;
            }
            j2 = speed > 5.0f ? 10000L : 15000L;
        } else {
            if (!TextUtils.isEmpty(this.A)) {
                this.B = false;
                this.C = 0;
            }
            if (speed > 5.0f) {
                j2 = 20000;
            } else {
                j2 = 30000;
            }
        }
        long jB = com.autonavi.aps.amapapi.utils.k.b() - this.f;
        if (jB > 30000) {
            return aMapLocation;
        }
        if (jB < j2) {
            if (this.A == null && this.C >= 2) {
                this.A = str;
            }
            AMapLocation aMapLocationM4468clone = this.f18043l.m4468clone();
            aMapLocationM4468clone.setTrustedLevel(2);
            return aMapLocationM4468clone;
        }
        if (this.B && u(str)) {
            AMapLocation aMapLocationM4468clone2 = this.f18043l.m4468clone();
            aMapLocationM4468clone2.setTrustedLevel(3);
            return aMapLocationM4468clone2;
        }
        this.A = null;
        this.C = 0;
        synchronized (this.p) {
            this.f18043l = null;
        }
        this.m = 0L;
        this.f18044n = 0.0f;
        return aMapLocation;
    }

    public final void b() {
        LocationManager locationManager = this.f18040c;
        if (locationManager == null) {
            return;
        }
        try {
            LocationListener locationListener = this.z;
            if (locationListener != null) {
                locationManager.removeUpdates(locationListener);
                ((b) this.z).a();
                this.z = null;
            }
        } catch (Throwable unused) {
        }
        try {
            GpsStatus.Listener listener = this.s;
            if (listener != null) {
                this.f18040c.removeGpsStatusListener(listener);
            }
        } catch (Throwable unused2) {
        }
        try {
            GnssStatus.Callback callback = this.t;
            if (callback != null) {
                this.f18040c.unregisterGnssStatusCallback(callback);
            }
        } catch (Throwable unused3) {
        }
        try {
            Handler handler = this.a;
            if (handler != null) {
                handler.removeMessages(8);
            }
        } catch (Throwable unused4) {
        }
        this.q = 0;
        this.f18041e = 0L;
        this.w = 0L;
        this.f = 0L;
        this.h = 0;
        this.x = 0;
        this.i.a();
        this.f18043l = null;
        this.m = 0L;
        this.f18044n = 0.0f;
        this.A = null;
        this.D = false;
    }

    public final void c(int i) {
        if (i == 0) {
            try {
                this.f = 0L;
                this.q = 0;
            } catch (Throwable unused) {
            }
        }
    }

    public final void d(int i, int i2, String str, long j2) {
        try {
            if (this.a == null || this.d.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
                return;
            }
            Message messageObtain = Message.obtain();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setProvider(f58.GPS);
            aMapLocation.setErrorCode(i2);
            aMapLocation.setLocationDetail(str);
            aMapLocation.setLocationType(1);
            messageObtain.obj = aMapLocation;
            messageObtain.what = i;
            this.a.sendMessageDelayed(messageObtain, j2);
        } catch (Throwable unused) {
        }
    }

    public final void e(GnssStatus gnssStatus) {
        int i = 0;
        if (gnssStatus != null) {
            try {
                int satelliteCount = gnssStatus.getSatelliteCount();
                int i2 = 0;
                while (i < satelliteCount) {
                    try {
                        if (gnssStatus.usedInFix(i)) {
                            i2++;
                        }
                        i++;
                    } catch (Throwable th) {
                        th = th;
                        i = i2;
                        com.autonavi.aps.amapapi.utils.c.a(th, "GpsLocation_Gnss", "GPS_EVENT_SATELLITE_STATUS");
                        this.q = i;
                    }
                }
                i = i2;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        this.q = i;
    }

    public final void f(Location location) {
        Handler handler = this.a;
        if (handler != null) {
            handler.removeMessages(8);
        }
        if (location == null) {
            return;
        }
        try {
            AMapLocation aMapLocation = new AMapLocation(location);
            if (com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
                aMapLocation.setProvider(f58.GPS);
                aMapLocation.setLocationType(1);
                if (!this.g && com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
                    com.autonavi.aps.amapapi.utils.i.a(this.b, com.autonavi.aps.amapapi.utils.k.b() - this.f18041e, com.autonavi.aps.amapapi.utils.c.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                    this.g = true;
                }
                if (com.autonavi.aps.amapapi.utils.k.a(location, this.q)) {
                    aMapLocation.setMock(true);
                    aMapLocation.setTrustedLevel(4);
                    if (!this.d.isMockEnable()) {
                        int i = this.x;
                        if (i <= 3) {
                            this.x = i + 1;
                            return;
                        }
                        com.autonavi.aps.amapapi.utils.i.a((String) null, 2152);
                        aMapLocation.setErrorCode(15);
                        aMapLocation.setLocationDetail("GpsLocation has been mocked!#1501");
                        aMapLocation.setLatitude(0.0d);
                        aMapLocation.setLongitude(0.0d);
                        aMapLocation.setAltitude(0.0d);
                        aMapLocation.setSpeed(0.0f);
                        aMapLocation.setAccuracy(0.0f);
                        aMapLocation.setBearing(0.0f);
                        aMapLocation.setExtras(null);
                        w(aMapLocation);
                        return;
                    }
                } else {
                    this.x = 0;
                }
                aMapLocation.setSatellites(this.q);
                A(aMapLocation);
                B(aMapLocation);
                G(aMapLocation);
                AMapLocation aMapLocationD = D(aMapLocation);
                h(aMapLocationD);
                r(aMapLocationD);
                synchronized (this.o) {
                    i(aMapLocationD, y);
                }
                try {
                    if (com.autonavi.aps.amapapi.utils.k.a(aMapLocationD)) {
                        if (this.f18043l != null) {
                            this.m = location.getTime() - this.f18043l.getTime();
                            this.f18044n = com.autonavi.aps.amapapi.utils.k.a(this.f18043l, aMapLocationD);
                        }
                        synchronized (this.p) {
                            this.f18043l = aMapLocationD.m4468clone();
                        }
                        this.A = null;
                        this.B = false;
                        this.C = 0;
                    }
                } catch (Throwable th) {
                    com.autonavi.aps.amapapi.utils.c.a(th, "GpsLocation", "onLocationChangedLast");
                }
                w(aMapLocationD);
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, "GpsLocation", "onLocationChanged");
        }
    }

    public final void g(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                this.f18042j = bundle.getInt("I_MAX_GEO_DIS");
                this.k = bundle.getInt("I_MIN_GEO_DIS");
                AMapLocation aMapLocation = (AMapLocation) bundle.getParcelable("loc");
                if (TextUtils.isEmpty(aMapLocation.getAdCode())) {
                    return;
                }
                synchronized (this.o) {
                    try {
                        y = aMapLocation;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                com.autonavi.aps.amapapi.utils.c.a(th2, "GpsLocation", "setLastGeoLocation");
            }
        }
    }

    public final void h(AMapLocation aMapLocation) {
        if (com.autonavi.aps.amapapi.utils.k.a(aMapLocation)) {
            this.f = com.autonavi.aps.amapapi.utils.k.b();
            synchronized (G) {
                F = com.autonavi.aps.amapapi.utils.k.b();
                E = aMapLocation.m4468clone();
            }
            this.h++;
        }
    }

    public final void i(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 == null || !this.d.isNeedAddress() || com.autonavi.aps.amapapi.utils.k.a(aMapLocation, aMapLocation2) >= this.f18042j) {
            return;
        }
        com.autonavi.aps.amapapi.utils.c.a(aMapLocation, aMapLocation2);
    }

    public final void j(AMapLocationClientOption aMapLocationClientOption) {
        this.d = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.d = new AMapLocationClientOption();
        }
        try {
            H = com.autonavi.aps.amapapi.utils.j.a(this.b, "pref", "lagt", H);
        } catch (Throwable unused) {
        }
        H();
    }

    public final void p(String str) {
        try {
            if (f58.GPS.equalsIgnoreCase(str)) {
                this.f = 0L;
                this.q = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public final void r(AMapLocation aMapLocation) {
        if (com.autonavi.aps.amapapi.utils.k.a(aMapLocation) && this.a != null) {
            long jB = com.autonavi.aps.amapapi.utils.k.b();
            if (this.d.getInterval() <= 8000 || jB - this.w > this.d.getInterval() - 8000) {
                Bundle bundle = new Bundle();
                bundle.putDouble("lat", aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                bundle.putFloat("radius", aMapLocation.getAccuracy());
                bundle.putLong(ClickApiEntity.TIME, aMapLocation.getTime());
                Message messageObtain = Message.obtain();
                messageObtain.setData(bundle);
                messageObtain.what = 5;
                synchronized (this.o) {
                    if (y == null || com.autonavi.aps.amapapi.utils.k.a(aMapLocation, y) > this.k) {
                        this.a.sendMessage(messageObtain);
                    }
                }
            }
        }
    }

    public final void s(AMapLocationClientOption aMapLocationClientOption) {
        Handler handler;
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        this.d = aMapLocationClientOption;
        if (aMapLocationClientOption.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors && (handler = this.a) != null) {
            handler.removeMessages(8);
        }
        if (this.u != this.d.getGeoLanguage()) {
            synchronized (this.o) {
                y = null;
            }
        }
        this.u = this.d.getGeoLanguage();
    }

    public final boolean t() {
        return com.autonavi.aps.amapapi.utils.k.b() - this.f <= 2800;
    }

    public final boolean u(String str) {
        try {
            ArrayList<String> arrayListB = com.autonavi.aps.amapapi.utils.k.b(str);
            ArrayList<String> arrayListB2 = com.autonavi.aps.amapapi.utils.k.b(this.A);
            if (arrayListB.size() < 8 || arrayListB2.size() < 8) {
                return false;
            }
            return com.autonavi.aps.amapapi.utils.k.a(this.A, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void v() {
        this.x = 0;
    }

    public final void w(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() != 15 || AMapLocationClientOption.AMapLocationMode.Device_Sensors.equals(this.d.getLocationMode())) {
            if (this.d.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.d.getDeviceModeDistanceFilter() > 0.0f) {
                y(aMapLocation);
            } else if (com.autonavi.aps.amapapi.utils.k.b() - this.w >= this.d.getInterval() - 200) {
                this.w = com.autonavi.aps.amapapi.utils.k.b();
                y(aMapLocation);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public final int x() {
        LocationManager locationManager = this.f18040c;
        if (locationManager == null || !q(locationManager)) {
            return 1;
        }
        int i = Settings.Secure.getInt(this.b.getContentResolver(), "location_mode", 0);
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        return !this.v ? 4 : 0;
    }

    public final void y(AMapLocation aMapLocation) {
        if (this.a != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = aMapLocation;
            messageObtain.what = 2;
            this.a.sendMessage(messageObtain);
        }
    }

    public final int z() {
        return this.q;
    }
}
