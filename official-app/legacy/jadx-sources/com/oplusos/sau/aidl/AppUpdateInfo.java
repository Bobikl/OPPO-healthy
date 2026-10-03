package com.oplusos.sau.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
public class AppUpdateInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f20163n = 2;
    private static final int o = 4;
    private static final int p = 8;
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20164c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20165e;
    public int f;
    public int g;
    public long h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f20166j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f20167l;
    public String m;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppUpdateInfo createFromParcel(Parcel parcel) {
            return new AppUpdateInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppUpdateInfo[] newArray(int i) {
            return new AppUpdateInfo[i];
        }
    }

    public AppUpdateInfo() {
        this.f20165e = -1;
    }

    public boolean a() {
        return (this.f & 2) != 0;
    }

    public boolean b() {
        return (this.f & 8) != 0;
    }

    public boolean c() {
        return (this.f & 4) != 0;
    }

    public void d() {
        this.f |= 8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e() {
        this.f |= 2;
    }

    public void f() {
        this.f |= 4;
    }

    public String toString() {
        return "pkg=" + this.k + ",newVersion=" + this.a + ",verName=" + this.f20167l + ",currentSize=" + this.h + ",totalSize=" + this.i + ",downloadSpeed=" + this.f20166j + ",downloadState=" + this.f20165e + ",stateFlag=" + this.f + ",isAutoDownload=" + this.b + ",isAutoInstall=" + this.f20164c + ",canUseOld=" + this.d + ",description=" + this.m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.k);
        parcel.writeInt(this.a);
        parcel.writeString(this.f20167l);
        parcel.writeString(this.m);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
        parcel.writeLong(this.f20166j);
        parcel.writeInt(this.b);
        parcel.writeInt(this.f20164c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f20165e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }

    public AppUpdateInfo(AppUpdateInfo appUpdateInfo) {
        this.f20165e = -1;
        this.k = appUpdateInfo.k;
        this.a = appUpdateInfo.a;
        this.f20167l = appUpdateInfo.f20167l;
        this.m = appUpdateInfo.m;
        this.h = appUpdateInfo.h;
        this.i = appUpdateInfo.i;
        this.f20166j = appUpdateInfo.f20166j;
        this.b = appUpdateInfo.b;
        this.f20164c = appUpdateInfo.f20164c;
        this.d = appUpdateInfo.d;
        this.f20165e = appUpdateInfo.f20165e;
        this.f = appUpdateInfo.f;
        this.g = appUpdateInfo.g;
    }

    public AppUpdateInfo(Parcel parcel) {
        this.f20165e = -1;
        this.k = parcel.readString();
        this.a = parcel.readInt();
        this.f20167l = parcel.readString();
        this.m = parcel.readString();
        this.h = parcel.readLong();
        this.i = parcel.readLong();
        this.f20166j = parcel.readLong();
        this.b = parcel.readInt();
        this.f20164c = parcel.readInt();
        this.d = parcel.readInt();
        this.f20165e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }
}
