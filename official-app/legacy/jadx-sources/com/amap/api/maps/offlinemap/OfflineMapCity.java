package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class OfflineMapCity extends City {
    public static final Parcelable.Creator<OfflineMapCity> CREATOR = new Parcelable.Creator<OfflineMapCity>() { // from class: com.amap.api.maps.offlinemap.OfflineMapCity.1
        private static OfflineMapCity a(Parcel parcel) {
            return new OfflineMapCity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OfflineMapCity createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OfflineMapCity[] newArray(int i) {
            return a(i);
        }

        private static OfflineMapCity[] a(int i) {
            return new OfflineMapCity[i];
        }
    };
    private String a;
    private long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f920c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f921e;

    public OfflineMapCity() {
        this.a = "";
        this.b = 0L;
        this.f920c = 6;
        this.d = "";
        this.f921e = 0;
    }

    @Override // com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getSize() {
        return this.b;
    }

    public int getState() {
        return this.f920c;
    }

    public String getUrl() {
        return this.a;
    }

    public String getVersion() {
        return this.d;
    }

    public int getcompleteCode() {
        return this.f921e;
    }

    public void setCompleteCode(int i) {
        this.f921e = i;
    }

    public void setSize(long j2) {
        this.b = j2;
    }

    public void setState(int i) {
        this.f920c = i;
    }

    public void setUrl(String str) {
        this.a = str;
    }

    public void setVersion(String str) {
        this.d = str;
    }

    @Override // com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.f920c);
        parcel.writeString(this.d);
        parcel.writeInt(this.f921e);
    }

    public OfflineMapCity(Parcel parcel) {
        super(parcel);
        this.a = "";
        this.b = 0L;
        this.f920c = 6;
        this.d = "";
        this.f921e = 0;
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.f920c = parcel.readInt();
        this.d = parcel.readString();
        this.f921e = parcel.readInt();
    }
}
