package com.oplusos.sau.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class AppUpdateInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private static final int n = 2;
    private static final int o = 4;
    private static final int p = 8;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public String k;
    public String l;
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
        this.e = -1;
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
        return "pkg=" + this.k + ",newVersion=" + this.a + ",verName=" + this.l + ",currentSize=" + this.h + ",totalSize=" + this.i + ",downloadSpeed=" + this.j + ",downloadState=" + this.e + ",stateFlag=" + this.f + ",isAutoDownload=" + this.b + ",isAutoInstall=" + this.c + ",canUseOld=" + this.d + ",description=" + this.m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.k);
        parcel.writeInt(this.a);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeLong(this.h);
        parcel.writeLong(this.i);
        parcel.writeLong(this.j);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }

    public AppUpdateInfo(AppUpdateInfo appUpdateInfo) {
        this.e = -1;
        this.k = appUpdateInfo.k;
        this.a = appUpdateInfo.a;
        this.l = appUpdateInfo.l;
        this.m = appUpdateInfo.m;
        this.h = appUpdateInfo.h;
        this.i = appUpdateInfo.i;
        this.j = appUpdateInfo.j;
        this.b = appUpdateInfo.b;
        this.c = appUpdateInfo.c;
        this.d = appUpdateInfo.d;
        this.e = appUpdateInfo.e;
        this.f = appUpdateInfo.f;
        this.g = appUpdateInfo.g;
    }

    public AppUpdateInfo(Parcel parcel) {
        this.e = -1;
        this.k = parcel.readString();
        this.a = parcel.readInt();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.h = parcel.readLong();
        this.i = parcel.readLong();
        this.j = parcel.readLong();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }
}
