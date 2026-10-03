package com.oplusos.sau.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class DataresUpdateInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public String a;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataresUpdateInfo createFromParcel(Parcel parcel) {
            return new DataresUpdateInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataresUpdateInfo[] newArray(int i) {
            return new DataresUpdateInfo[i];
        }
    }

    public DataresUpdateInfo() {
        this.g = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "busCode=" + this.a + ", currentVersion=" + this.b + ", newVersion=" + this.c + ", currentSize=" + this.d + ", downloadSpeed=" + this.f + ", downloadStatus=" + this.g + ", flag=" + this.h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }

    public DataresUpdateInfo(DataresUpdateInfo dataresUpdateInfo) {
        this.g = -1;
        this.a = dataresUpdateInfo.a;
        this.b = dataresUpdateInfo.b;
        this.c = dataresUpdateInfo.c;
        this.e = dataresUpdateInfo.e;
        this.d = dataresUpdateInfo.d;
        this.f = dataresUpdateInfo.f;
        this.g = dataresUpdateInfo.g;
        this.h = dataresUpdateInfo.h;
    }

    public DataresUpdateInfo(Parcel parcel) {
        this.g = -1;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
    }
}
