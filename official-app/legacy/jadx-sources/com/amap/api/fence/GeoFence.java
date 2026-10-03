package com.amap.api.fence;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.DPoint;
import com.autonavi.aps.amapapi.utils.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class GeoFence implements Parcelable {
    public static final int ADDGEOFENCE_SUCCESS = 0;
    public static final String BUNDLE_KEY_CUSTOMID = "customId";
    public static final String BUNDLE_KEY_FENCE = "fence";
    public static final String BUNDLE_KEY_FENCEID = "fenceid";
    public static final String BUNDLE_KEY_FENCESTATUS = "event";
    public static final String BUNDLE_KEY_LOCERRORCODE = "location_errorcode";
    public static final Parcelable.Creator<GeoFence> CREATOR = new Parcelable.Creator<GeoFence>() { // from class: com.amap.api.fence.GeoFence.1
        private static GeoFence a(Parcel parcel) {
            return new GeoFence(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GeoFence createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GeoFence[] newArray(int i) {
            return a(i);
        }

        private static GeoFence[] a(int i) {
            return new GeoFence[i];
        }
    };
    public static final int ERROR_CODE_EXISTS = 17;
    public static final int ERROR_CODE_FAILURE_AUTH = 7;
    public static final int ERROR_CODE_FAILURE_CONNECTION = 4;
    public static final int ERROR_CODE_FAILURE_PARSER = 5;
    public static final int ERROR_CODE_INVALID_PARAMETER = 1;
    public static final int ERROR_CODE_UNKNOWN = 8;
    public static final int ERROR_NO_VALIDFENCE = 16;
    public static final int STATUS_IN = 1;
    public static final int STATUS_LOCFAIL = 4;
    public static final int STATUS_OUT = 2;
    public static final int STATUS_STAYED = 3;
    public static final int STATUS_UNKNOWN = 0;
    public static final int TYPE_AMAPPOI = 2;
    public static final int TYPE_DISTRICT = 3;
    public static final int TYPE_POLYGON = 1;
    public static final int TYPE_ROUND = 0;
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f870c;
    private PendingIntent d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f871e;
    private PoiItem f;
    private List<DistrictItem> g;
    private List<List<DPoint>> h;
    private float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f872j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f873l;
    private float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private DPoint f874n;
    private int o;
    private long p;
    private boolean q;
    private AMapLocation r;

    public GeoFence() {
        this.d = null;
        this.f871e = 0;
        this.f = null;
        this.g = null;
        this.i = 0.0f;
        this.f872j = -1L;
        this.k = 1;
        this.f873l = 0.0f;
        this.m = 0.0f;
        this.f874n = null;
        this.o = 0;
        this.p = -1L;
        this.q = true;
        this.r = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GeoFence)) {
            return false;
        }
        GeoFence geoFence = (GeoFence) obj;
        if (TextUtils.isEmpty(this.b)) {
            if (!TextUtils.isEmpty(geoFence.b)) {
                return false;
            }
        } else if (!this.b.equals(geoFence.b)) {
            return false;
        }
        DPoint dPoint = this.f874n;
        if (dPoint == null) {
            if (geoFence.f874n != null) {
                return false;
            }
        } else if (!dPoint.equals(geoFence.f874n)) {
            return false;
        }
        if (this.i != geoFence.i) {
            return false;
        }
        List<List<DPoint>> list = this.h;
        if (list == null) {
            return geoFence.h == null;
        }
        return list.equals(geoFence.h);
    }

    public int getActivatesAction() {
        return this.k;
    }

    public DPoint getCenter() {
        return this.f874n;
    }

    public AMapLocation getCurrentLocation() {
        return this.r;
    }

    public String getCustomId() {
        return this.b;
    }

    public List<DistrictItem> getDistrictItemList() {
        return this.g;
    }

    public long getEnterTime() {
        return this.p;
    }

    public long getExpiration() {
        return this.f872j;
    }

    public String getFenceId() {
        return this.a;
    }

    public float getMaxDis2Center() {
        return this.m;
    }

    public float getMinDis2Center() {
        return this.f873l;
    }

    public PendingIntent getPendingIntent() {
        return this.d;
    }

    public String getPendingIntentAction() {
        return this.f870c;
    }

    public PoiItem getPoiItem() {
        return this.f;
    }

    public List<List<DPoint>> getPointList() {
        return this.h;
    }

    public float getRadius() {
        return this.i;
    }

    public int getStatus() {
        return this.o;
    }

    public int getType() {
        return this.f871e;
    }

    public int hashCode() {
        return this.b.hashCode() + this.h.hashCode() + this.f874n.hashCode() + ((int) (this.i * 100.0f));
    }

    public boolean isAble() {
        return this.q;
    }

    public void setAble(boolean z) {
        this.q = z;
    }

    public void setActivatesAction(int i) {
        this.k = i;
    }

    public void setCenter(DPoint dPoint) {
        this.f874n = dPoint;
    }

    public void setCurrentLocation(AMapLocation aMapLocation) {
        this.r = aMapLocation.m4468clone();
    }

    public void setCustomId(String str) {
        this.b = str;
    }

    public void setDistrictItemList(List<DistrictItem> list) {
        this.g = list;
    }

    public void setEnterTime(long j2) {
        this.p = j2;
    }

    public void setExpiration(long j2) {
        if (j2 < 0) {
            this.f872j = -1L;
        } else {
            this.f872j = j2 + k.b();
        }
    }

    public void setFenceId(String str) {
        this.a = str;
    }

    public void setMaxDis2Center(float f) {
        this.m = f;
    }

    public void setMinDis2Center(float f) {
        this.f873l = f;
    }

    public void setPendingIntent(PendingIntent pendingIntent) {
        this.d = pendingIntent;
    }

    public void setPendingIntentAction(String str) {
        this.f870c = str;
    }

    public void setPoiItem(PoiItem poiItem) {
        this.f = poiItem;
    }

    public void setPointList(List<List<DPoint>> list) {
        this.h = list;
    }

    public void setRadius(float f) {
        this.i = f;
    }

    public void setStatus(int i) {
        this.o = i;
    }

    public void setType(int i) {
        this.f871e = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f870c);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.f871e);
        parcel.writeParcelable(this.f, i);
        parcel.writeTypedList(this.g);
        parcel.writeFloat(this.i);
        parcel.writeLong(this.f872j);
        parcel.writeInt(this.k);
        parcel.writeFloat(this.f873l);
        parcel.writeFloat(this.m);
        parcel.writeParcelable(this.f874n, i);
        parcel.writeInt(this.o);
        parcel.writeLong(this.p);
        List<List<DPoint>> list = this.h;
        if (list != null && !list.isEmpty()) {
            parcel.writeInt(this.h.size());
            Iterator<List<DPoint>> it = this.h.iterator();
            while (it.hasNext()) {
                parcel.writeTypedList(it.next());
            }
        }
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.r, i);
    }

    public GeoFence(Parcel parcel) {
        this.d = null;
        this.f871e = 0;
        this.f = null;
        this.g = null;
        this.i = 0.0f;
        this.f872j = -1L;
        this.k = 1;
        this.f873l = 0.0f;
        this.m = 0.0f;
        this.f874n = null;
        this.o = 0;
        this.p = -1L;
        this.q = true;
        this.r = null;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f870c = parcel.readString();
        this.d = (PendingIntent) parcel.readParcelable(PendingIntent.class.getClassLoader());
        this.f871e = parcel.readInt();
        this.f = (PoiItem) parcel.readParcelable(PoiItem.class.getClassLoader());
        this.g = parcel.createTypedArrayList(DistrictItem.CREATOR);
        this.i = parcel.readFloat();
        this.f872j = parcel.readLong();
        this.k = parcel.readInt();
        this.f873l = parcel.readFloat();
        this.m = parcel.readFloat();
        this.f874n = (DPoint) parcel.readParcelable(DPoint.class.getClassLoader());
        this.o = parcel.readInt();
        this.p = parcel.readLong();
        int i = parcel.readInt();
        if (i != 0) {
            this.h = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                this.h.add(parcel.createTypedArrayList(DPoint.CREATOR));
            }
        }
        this.q = parcel.readByte() != 0;
        this.r = (AMapLocation) parcel.readParcelable(AMapLocation.class.getClassLoader());
    }
}
