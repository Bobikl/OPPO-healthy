package com.autonavi.aps.amapapi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.autonavi.aps.amapapi.a.1
        private static a a(Parcel parcel) {
            a aVar = new a();
            aVar.c(parcel.readString());
            aVar.d(parcel.readString());
            aVar.e(parcel.readString());
            aVar.f(parcel.readString());
            aVar.b(parcel.readString());
            aVar.c(parcel.readLong());
            aVar.d(parcel.readLong());
            aVar.a(parcel.readLong());
            aVar.b(parcel.readLong());
            aVar.a(parcel.readString());
            return aVar;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a[] newArray(int i) {
            return a(i);
        }

        private static a[] a(int i) {
            return new a[i];
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f1094e;
    private String f;
    private long a = 0;
    private long b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f1093c = 0;
    private long d = 0;
    private String g = "first";
    private String h = "";
    private String i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f1095j = null;

    public final long a() {
        long j2 = this.d;
        long j3 = this.f1093c;
        if (j2 - j3 <= 0) {
            return 0L;
        }
        return j2 - j3;
    }

    public final String b() {
        return this.i;
    }

    public final void c(long j2) {
        this.a = j2;
    }

    public final void d(long j2) {
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f;
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.h;
    }

    public final long h() {
        long j2 = this.b;
        long j3 = this.a;
        if (j2 <= j3) {
            return 0L;
        }
        return j2 - j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.f1094e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.f1095j);
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.f1093c);
            parcel.writeLong(this.d);
            parcel.writeString(this.i);
        } catch (Throwable unused) {
        }
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void b(long j2) {
        this.d = j2;
    }

    public final String c() {
        return this.f1095j;
    }

    public final String d() {
        return this.f1094e;
    }

    public final void e(String str) {
        this.g = str;
    }

    public final void f(String str) {
        this.h = str;
    }

    public final void a(long j2) {
        this.f1093c = j2;
    }

    public final void b(String str) {
        this.f1095j = str;
    }

    public final void c(String str) {
        this.f1094e = str;
    }

    public final void d(String str) {
        this.f = str;
    }
}
