package com.amap.api.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.autonavi.aps.amapapi.utils.c;
import com.oplus.aiunit.vision.mq8;

/* JADX INFO: loaded from: classes12.dex */
public class AMapLocationClientOption implements Parcelable, Cloneable {
    private static int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f883e = 1;
    private static int f = 2;
    private static int g = 4;
    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private float I;
    private AMapLocationPurpose J;
    boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f884c;
    private long h;
    private long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f885j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f886l;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f887n;
    private AMapLocationMode o;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private long x;
    private long y;
    private GeoLanguage z;
    private static AMapLocationProtocol p = AMapLocationProtocol.HTTP;
    static String a = "";
    public static final Parcelable.Creator<AMapLocationClientOption> CREATOR = new Parcelable.Creator<AMapLocationClientOption>() { // from class: com.amap.api.location.AMapLocationClientOption.1
        private static AMapLocationClientOption a(Parcel parcel) {
            return new AMapLocationClientOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AMapLocationClientOption createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AMapLocationClientOption[] newArray(int i) {
            return a(i);
        }

        private static AMapLocationClientOption[] a(int i) {
            return new AMapLocationClientOption[i];
        }
    };
    public static boolean OPEN_ALWAYS_SCAN_WIFI = true;
    public static long SCAN_WIFI_INTERVAL = 30000;

    /* JADX INFO: renamed from: com.amap.api.location.AMapLocationClientOption$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AMapLocationPurpose.values().length];
            a = iArr;
            try {
                iArr[AMapLocationPurpose.SignIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AMapLocationPurpose.Transport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AMapLocationPurpose.Sport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum AMapLocationMode {
        Battery_Saving,
        Device_Sensors,
        Hight_Accuracy
    }

    public enum AMapLocationProtocol {
        HTTP(0),
        HTTPS(1);

        private int a;

        AMapLocationProtocol(int i) {
            this.a = i;
        }

        public final int getValue() {
            return this.a;
        }
    }

    public enum AMapLocationPurpose {
        SignIn,
        Transport,
        Sport
    }

    public enum GeoLanguage {
        DEFAULT,
        ZH,
        EN
    }

    public AMapLocationClientOption() {
        this.h = 2000L;
        this.i = c.i;
        this.f885j = false;
        this.k = true;
        this.f886l = false;
        this.m = true;
        this.f887n = true;
        this.o = AMapLocationMode.Hight_Accuracy;
        this.q = false;
        this.r = false;
        this.s = true;
        this.t = true;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = 30000L;
        this.y = 30000L;
        this.z = GeoLanguage.DEFAULT;
        this.A = false;
        this.B = 1500;
        this.C = mq8.SIX_HOURS_MILLIS;
        this.D = false;
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = 0.0f;
        this.J = null;
        this.b = false;
        this.f884c = null;
    }

    private AMapLocationClientOption a(AMapLocationClientOption aMapLocationClientOption) {
        this.h = aMapLocationClientOption.h;
        this.f885j = aMapLocationClientOption.f885j;
        this.o = aMapLocationClientOption.o;
        this.k = aMapLocationClientOption.k;
        this.q = aMapLocationClientOption.q;
        this.r = aMapLocationClientOption.r;
        this.D = aMapLocationClientOption.D;
        this.f886l = aMapLocationClientOption.f886l;
        this.m = aMapLocationClientOption.m;
        this.i = aMapLocationClientOption.i;
        this.s = aMapLocationClientOption.s;
        this.t = aMapLocationClientOption.t;
        this.u = aMapLocationClientOption.u;
        this.v = aMapLocationClientOption.isSensorEnable();
        this.w = aMapLocationClientOption.isWifiScan();
        this.x = aMapLocationClientOption.x;
        setLocationProtocol(aMapLocationClientOption.getLocationProtocol());
        this.z = aMapLocationClientOption.z;
        setDownloadCoordinateConvertLibrary(isDownloadCoordinateConvertLibrary());
        this.I = aMapLocationClientOption.I;
        this.J = aMapLocationClientOption.J;
        setOpenAlwaysScanWifi(isOpenAlwaysScanWifi());
        setScanWifiInterval(aMapLocationClientOption.getScanWifiInterval());
        this.y = aMapLocationClientOption.y;
        this.C = aMapLocationClientOption.getCacheTimeOut();
        this.A = aMapLocationClientOption.getCacheCallBack();
        this.B = aMapLocationClientOption.getCacheCallBackTime();
        this.E = aMapLocationClientOption.isSelfStartServiceEnable();
        this.F = aMapLocationClientOption.isNoLocReqCgiEnable();
        this.G = aMapLocationClientOption.isSysNetworkLocEnable();
        this.H = aMapLocationClientOption.isLBSLocationEnable();
        return this;
    }

    public static String getAPIKEY() {
        return a;
    }

    public static boolean isDownloadCoordinateConvertLibrary() {
        return false;
    }

    public static boolean isOpenAlwaysScanWifi() {
        return OPEN_ALWAYS_SCAN_WIFI;
    }

    public static void setDownloadCoordinateConvertLibrary(boolean z) {
    }

    public static void setLocationProtocol(AMapLocationProtocol aMapLocationProtocol) {
        p = aMapLocationProtocol;
    }

    public static void setOpenAlwaysScanWifi(boolean z) {
        OPEN_ALWAYS_SCAN_WIFI = z;
    }

    public static void setScanWifiInterval(long j2) {
        SCAN_WIFI_INTERVAL = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean getCacheCallBack() {
        return this.A;
    }

    public int getCacheCallBackTime() {
        return this.B;
    }

    public int getCacheTimeOut() {
        return this.C;
    }

    public float getDeviceModeDistanceFilter() {
        return this.I;
    }

    public GeoLanguage getGeoLanguage() {
        return this.z;
    }

    public long getGpsFirstTimeout() {
        return this.y;
    }

    public long getHttpTimeOut() {
        return this.i;
    }

    public long getInterval() {
        return this.h;
    }

    public long getLastLocationLifeCycle() {
        return this.x;
    }

    public AMapLocationMode getLocationMode() {
        return this.o;
    }

    public AMapLocationProtocol getLocationProtocol() {
        return p;
    }

    public AMapLocationPurpose getLocationPurpose() {
        return this.J;
    }

    public long getScanWifiInterval() {
        return SCAN_WIFI_INTERVAL;
    }

    public boolean isBeidouFirst() {
        return this.D;
    }

    public boolean isGpsFirst() {
        return this.r;
    }

    public boolean isKillProcess() {
        return this.q;
    }

    public boolean isLBSLocationEnable() {
        return this.H;
    }

    public boolean isLocationCacheEnable() {
        return this.t;
    }

    public boolean isMockEnable() {
        return this.k;
    }

    public boolean isNeedAddress() {
        return this.f886l;
    }

    public boolean isNoLocReqCgiEnable() {
        return this.F;
    }

    public boolean isOffset() {
        return this.s;
    }

    public boolean isOnceLocation() {
        return this.f885j;
    }

    public boolean isOnceLocationLatest() {
        return this.u;
    }

    public boolean isSelfStartServiceEnable() {
        return this.E;
    }

    public boolean isSensorEnable() {
        return this.v;
    }

    public boolean isSysNetworkLocEnable() {
        return this.G;
    }

    public boolean isWifiActiveScan() {
        return this.m;
    }

    public boolean isWifiScan() {
        return this.w;
    }

    public AMapLocationClientOption setBeidouFirst(boolean z) {
        this.D = z;
        return this;
    }

    public void setCacheCallBack(boolean z) {
        this.A = z;
    }

    public void setCacheCallBackTime(int i) {
        this.B = i;
    }

    public void setCacheTimeOut(int i) {
        this.C = i;
    }

    public AMapLocationClientOption setDeviceModeDistanceFilter(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.I = f2;
        return this;
    }

    public AMapLocationClientOption setGeoLanguage(GeoLanguage geoLanguage) {
        this.z = geoLanguage;
        return this;
    }

    public AMapLocationClientOption setGpsFirst(boolean z) {
        this.r = z;
        return this;
    }

    public AMapLocationClientOption setGpsFirstTimeout(long j2) {
        if (j2 < 5000) {
            j2 = 5000;
        }
        if (j2 > 30000) {
            j2 = 30000;
        }
        this.y = j2;
        return this;
    }

    public AMapLocationClientOption setHttpTimeOut(long j2) {
        this.i = j2;
        return this;
    }

    public AMapLocationClientOption setInterval(long j2) {
        if (j2 <= 800) {
            j2 = 800;
        }
        this.h = j2;
        return this;
    }

    public AMapLocationClientOption setKillProcess(boolean z) {
        this.q = z;
        return this;
    }

    public void setLBSLocationEnable(boolean z) {
        this.H = z;
    }

    public AMapLocationClientOption setLastLocationLifeCycle(long j2) {
        this.x = j2;
        return this;
    }

    public AMapLocationClientOption setLocationCacheEnable(boolean z) {
        this.t = z;
        return this;
    }

    public AMapLocationClientOption setLocationMode(AMapLocationMode aMapLocationMode) {
        this.o = aMapLocationMode;
        return this;
    }

    public AMapLocationClientOption setLocationPurpose(AMapLocationPurpose aMapLocationPurpose) {
        this.J = aMapLocationPurpose;
        if (aMapLocationPurpose != null) {
            int i = AnonymousClass2.a[aMapLocationPurpose.ordinal()];
            if (i == 1) {
                this.o = AMapLocationMode.Hight_Accuracy;
                this.f885j = true;
                this.u = true;
                this.r = false;
                this.D = false;
                this.k = false;
                this.w = true;
                this.E = true;
                this.F = true;
                this.G = true;
                int i2 = d;
                int i3 = f883e;
                if ((i2 & i3) == 0) {
                    this.b = true;
                    d = i2 | i3;
                    this.f884c = "signin";
                }
            } else if (i == 2) {
                int i4 = d;
                int i5 = f;
                if ((i4 & i5) == 0) {
                    this.b = true;
                    d = i4 | i5;
                    this.f884c = NotificationCompat.CATEGORY_TRANSPORT;
                }
                this.o = AMapLocationMode.Hight_Accuracy;
                this.f885j = false;
                this.u = false;
                this.r = true;
                this.D = false;
                this.E = true;
                this.F = true;
                this.G = true;
                this.k = false;
                this.w = true;
            } else if (i == 3) {
                int i6 = d;
                int i7 = g;
                if ((i6 & i7) == 0) {
                    this.b = true;
                    d = i6 | i7;
                    this.f884c = "sport";
                }
                this.o = AMapLocationMode.Hight_Accuracy;
                this.f885j = false;
                this.u = false;
                this.r = true;
                this.D = false;
                this.E = true;
                this.F = true;
                this.G = true;
                this.k = false;
                this.w = true;
            }
        }
        return this;
    }

    public AMapLocationClientOption setMockEnable(boolean z) {
        this.k = z;
        return this;
    }

    public AMapLocationClientOption setNeedAddress(boolean z) {
        this.f886l = z;
        return this;
    }

    public void setNoLocReqCgiEnable(boolean z) {
        this.F = z;
    }

    public AMapLocationClientOption setOffset(boolean z) {
        this.s = z;
        return this;
    }

    public AMapLocationClientOption setOnceLocation(boolean z) {
        this.f885j = z;
        return this;
    }

    public AMapLocationClientOption setOnceLocationLatest(boolean z) {
        this.u = z;
        return this;
    }

    public void setSelfStartServiceEnable(boolean z) {
        this.E = z;
    }

    public AMapLocationClientOption setSensorEnable(boolean z) {
        this.v = z;
        return this;
    }

    public void setSysNetworkLocEnable(boolean z) {
        this.G = z;
    }

    public AMapLocationClientOption setWifiActiveScan(boolean z) {
        this.m = z;
        this.f887n = z;
        return this;
    }

    public AMapLocationClientOption setWifiScan(boolean z) {
        this.w = z;
        if (z) {
            this.m = this.f887n;
        } else {
            this.m = false;
        }
        return this;
    }

    public String toString() {
        return "interval:" + String.valueOf(this.h) + "#isOnceLocation:" + String.valueOf(this.f885j) + "#locationMode:" + String.valueOf(this.o) + "#locationProtocol:" + String.valueOf(p) + "#isMockEnable:" + String.valueOf(this.k) + "#isKillProcess:" + String.valueOf(this.q) + "#isGpsFirst:" + String.valueOf(this.r) + "#isBeidouFirst:" + String.valueOf(this.D) + "#isSelfStartServiceEnable:" + String.valueOf(this.E) + "#noLocReqCgiEnable:" + String.valueOf(this.F) + "#sysNetworkLocEnable:" + String.valueOf(this.G) + "#isNeedAddress:" + String.valueOf(this.f886l) + "#isWifiActiveScan:" + String.valueOf(this.m) + "#wifiScan:" + String.valueOf(this.w) + "#httpTimeOut:" + String.valueOf(this.i) + "#isLocationCacheEnable:" + String.valueOf(this.t) + "#isOnceLocationLatest:" + String.valueOf(this.u) + "#sensorEnable:" + String.valueOf(this.v) + "#geoLanguage:" + String.valueOf(this.z) + "#locationPurpose:" + String.valueOf(this.J) + "#callback:" + String.valueOf(this.A) + "#time:" + String.valueOf(this.B) + "#";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
        parcel.writeByte(this.f885j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f886l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f887n ? (byte) 1 : (byte) 0);
        AMapLocationMode aMapLocationMode = this.o;
        parcel.writeInt(aMapLocationMode == null ? -1 : aMapLocationMode.ordinal());
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.x);
        parcel.writeInt(p == null ? -1 : getLocationProtocol().ordinal());
        GeoLanguage geoLanguage = this.z;
        parcel.writeInt(geoLanguage == null ? -1 : geoLanguage.ordinal());
        parcel.writeFloat(this.I);
        AMapLocationPurpose aMapLocationPurpose = this.J;
        parcel.writeInt(aMapLocationPurpose != null ? aMapLocationPurpose.ordinal() : -1);
        parcel.writeInt(OPEN_ALWAYS_SCAN_WIFI ? 1 : 0);
        parcel.writeLong(this.y);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AMapLocationClientOption m4469clone() {
        try {
            super.clone();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return new AMapLocationClientOption().a(this);
    }

    public AMapLocationClientOption(Parcel parcel) {
        this.h = 2000L;
        this.i = c.i;
        this.f885j = false;
        this.k = true;
        this.f886l = false;
        this.m = true;
        this.f887n = true;
        AMapLocationMode aMapLocationMode = AMapLocationMode.Hight_Accuracy;
        this.o = aMapLocationMode;
        this.q = false;
        this.r = false;
        this.s = true;
        this.t = true;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = 30000L;
        this.y = 30000L;
        GeoLanguage geoLanguage = GeoLanguage.DEFAULT;
        this.z = geoLanguage;
        this.A = false;
        this.B = 1500;
        this.C = mq8.SIX_HOURS_MILLIS;
        this.D = false;
        this.E = true;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = 0.0f;
        this.J = null;
        this.b = false;
        this.f884c = null;
        this.h = parcel.readLong();
        this.i = parcel.readLong();
        this.f885j = parcel.readByte() != 0;
        this.k = parcel.readByte() != 0;
        this.f886l = parcel.readByte() != 0;
        this.m = parcel.readByte() != 0;
        this.f887n = parcel.readByte() != 0;
        int i = parcel.readInt();
        this.o = i != -1 ? AMapLocationMode.values()[i] : aMapLocationMode;
        this.q = parcel.readByte() != 0;
        this.r = parcel.readByte() != 0;
        this.D = parcel.readByte() != 0;
        this.E = parcel.readByte() != 0;
        this.F = parcel.readByte() != 0;
        this.G = parcel.readByte() != 0;
        this.s = parcel.readByte() != 0;
        this.t = parcel.readByte() != 0;
        this.u = parcel.readByte() != 0;
        this.v = parcel.readByte() != 0;
        this.w = parcel.readByte() != 0;
        this.x = parcel.readLong();
        int i2 = parcel.readInt();
        p = i2 == -1 ? AMapLocationProtocol.HTTP : AMapLocationProtocol.values()[i2];
        int i3 = parcel.readInt();
        this.z = i3 != -1 ? GeoLanguage.values()[i3] : geoLanguage;
        this.I = parcel.readFloat();
        int i4 = parcel.readInt();
        this.J = i4 != -1 ? AMapLocationPurpose.values()[i4] : null;
        OPEN_ALWAYS_SCAN_WIFI = parcel.readByte() != 0;
        this.y = parcel.readLong();
    }
}
