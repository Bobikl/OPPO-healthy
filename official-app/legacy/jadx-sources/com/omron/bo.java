package com.omron;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class bo implements Parcelable {
    public static final Parcelable.Creator<bo> CREATOR = new a();

    @NonNull
    private String a;

    @Nullable
    private List<by> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private ds f8845c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f8846e;

    @Nullable
    private String f;

    public class a implements Parcelable.Creator<bo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bo createFromParcel(Parcel parcel) {
            return new bo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bo[] newArray(int i) {
            return new bo[i];
        }
    }

    public bo(Parcel parcel) {
        this.b = new ArrayList();
        this.a = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        parcel.readList(arrayList, by.class.getClassLoader());
        int i = parcel.readInt();
        this.f8845c = i == -1 ? null : ds.values()[i];
        this.d = parcel.readInt();
        this.f8846e = parcel.readString();
        this.f = parcel.readString();
    }

    @NonNull
    public String a() {
        return this.a;
    }

    @Nullable
    public String b() {
        List<by> list = this.b;
        if (list == null) {
            return null;
        }
        for (by byVar : list) {
            if (byVar instanceof ck) {
                return ((ck) byVar).d();
            }
        }
        return null;
    }

    @Nullable
    public String c() {
        return this.f;
    }

    @Nullable
    public String d() {
        return this.f8846e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiscoveredDevice{mAddress='" + this.a + "', mAdvertisementData=" + this.b + ", mDeviceCategory=" + this.f8845c + ", mRssi=" + this.d + ", mModelName='" + this.f8846e + "', mLocalName='" + this.f + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeList(this.b);
        ds dsVar = this.f8845c;
        parcel.writeInt(dsVar == null ? -1 : dsVar.ordinal());
        parcel.writeInt(this.d);
        parcel.writeString(this.f8846e);
        parcel.writeString(this.f);
    }

    public bo(@NonNull String str) {
        this.b = new ArrayList();
        this.a = str;
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(@Nullable String str) {
        this.f = str;
    }

    public void c(@Nullable String str) {
        this.f8846e = str;
    }

    public void a(@Nullable ds dsVar) {
        this.f8845c = dsVar;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(@Nullable List<by> list) {
        this.b = list;
    }
}
