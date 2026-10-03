package com.heytap.accessory.base.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.heytap.accessory.Config;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class FrameworkServiceDescription implements Comparable<FrameworkServiceDescription>, Parcelable {
    public static final Parcelable.Creator<FrameworkServiceDescription> CREATOR;
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2425c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2426e;
    public String f;
    public int g;
    public String h;
    public List<FrameworkServiceChannelDescription> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2427j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2428l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2429n;
    public int o;
    public int p;
    public int q;

    static {
        Config.getSdkVersionCode();
        CREATOR = new a();
    }

    public FrameworkServiceDescription(String str, String str2, List<FrameworkServiceChannelDescription> list, int i, int i2, String str3, String str4, String str5, int i3, int i4, int i5, int i6, int i7, int i8, String str6, int i9) {
        this.i = new ArrayList();
        this.g = 1;
        this.f2428l = 1;
        if (list == null) {
            this.i = new ArrayList();
        } else {
            this.i = new ArrayList(list);
        }
        a(i);
        this.m = i2;
        this.f2429n = str4;
        this.b = str3;
        this.f2425c = i3;
        this.d = i4;
        this.g = i5;
        this.h = str5;
        this.q = i6;
        this.f2427j = i7;
        this.f2426e = str;
        this.f = str2;
        this.a = str6;
        this.o = i8;
        this.p = i9;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(FrameworkServiceDescription frameworkServiceDescription) {
        if (d().equalsIgnoreCase(frameworkServiceDescription.d())) {
            return m().equals(frameworkServiceDescription.m()) ? o() - frameworkServiceDescription.o() : m().compareTo(frameworkServiceDescription.m());
        }
        return d().compareTo(frameworkServiceDescription.d());
    }

    public void b(int i) {
        this.o = i;
    }

    @NonNull
    public String c() {
        String str = this.f;
        return str == null ? "" : str;
    }

    @NonNull
    public String d() {
        String str = this.f2426e;
        return str == null ? "" : str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FrameworkServiceDescription frameworkServiceDescription = (FrameworkServiceDescription) obj;
        return this.f2425c == frameworkServiceDescription.f2425c && this.d == frameworkServiceDescription.d && this.g == frameworkServiceDescription.g && this.f2427j == frameworkServiceDescription.f2427j && this.k == frameworkServiceDescription.k && this.f2428l == frameworkServiceDescription.f2428l && this.m == frameworkServiceDescription.m && this.o == frameworkServiceDescription.o && this.p == frameworkServiceDescription.p && this.q == frameworkServiceDescription.q && Objects.equals(this.a, frameworkServiceDescription.a) && Objects.equals(this.b, frameworkServiceDescription.b) && Objects.equals(this.f2426e, frameworkServiceDescription.f2426e) && Objects.equals(this.f, frameworkServiceDescription.f) && Objects.equals(this.h, frameworkServiceDescription.h) && Objects.equals(this.i, frameworkServiceDescription.i) && Objects.equals(this.f2429n, frameworkServiceDescription.f2429n);
    }

    public List<FrameworkServiceChannelDescription> f() {
        return this.i == null ? new ArrayList() : new ArrayList(this.i);
    }

    public List<Integer> g() {
        ArrayList arrayList = new ArrayList();
        Iterator<FrameworkServiceChannelDescription> it = this.i.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().a()));
        }
        return arrayList;
    }

    public int h() {
        return this.f2427j;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.f2425c), Integer.valueOf(this.d), this.f2426e, this.f, Integer.valueOf(this.g), this.h, this.i, Integer.valueOf(this.f2427j), Integer.valueOf(this.k), Integer.valueOf(this.f2428l), Integer.valueOf(this.m), this.f2429n, Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q));
    }

    public int i() {
        return this.k;
    }

    public int j() {
        return this.d;
    }

    public int k() {
        return this.f2428l;
    }

    public int l() {
        return this.m;
    }

    public String m() {
        return this.f2429n;
    }

    public String n() {
        return this.h;
    }

    public int o() {
        return this.f2425c;
    }

    public int p() {
        return this.o;
    }

    public int q() {
        return this.q;
    }

    public int r() {
        return this.g;
    }

    public String toString() {
        return "FrameworkServiceDescription{impl=" + this.a + ",agentId=" + this.b + ",role=" + this.f2425c + ",pkgName=" + this.f2426e + ",profileId=" + this.f2429n + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2426e);
        parcel.writeString(this.f);
        parcel.writeList(this.i);
        parcel.writeInt(this.k);
        parcel.writeString(this.b);
        parcel.writeString(this.f2429n);
        parcel.writeString(this.h);
        parcel.writeInt(this.f2425c);
        parcel.writeInt(this.p);
    }

    public String b() {
        return this.a;
    }

    public String a() {
        return this.b;
    }

    public class a implements Parcelable.Creator<FrameworkServiceDescription> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FrameworkServiceDescription createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            String string = parcel.readString();
            String string2 = parcel.readString();
            parcel.readList(arrayList, FrameworkServiceChannelDescription.class.getClassLoader());
            return new FrameworkServiceDescription(string, string2, arrayList, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FrameworkServiceDescription[] newArray(int i) {
            return new FrameworkServiceDescription[i];
        }
    }

    public void a(int i) {
        this.k = i;
    }

    public FrameworkServiceDescription(String str, String str2, List<FrameworkServiceChannelDescription> list, int i, String str3, String str4, String str5, int i2, int i3) {
        this.i = new ArrayList();
        this.d = 0;
        this.g = 1;
        this.f2428l = 1;
        this.f2426e = str;
        this.f = str2;
        a(i);
        if (list == null) {
            this.i = new ArrayList();
        } else {
            this.i = new ArrayList(list);
        }
        this.b = str3;
        this.f2429n = str4;
        this.h = str5;
        this.f2425c = i2;
        this.q = 0;
        this.f2427j = 0;
        this.o = 1;
        this.p = i3;
    }

    public FrameworkServiceDescription(String str, String str2, List<FrameworkServiceChannelDescription> list, int i, String str3, String str4, String str5, int i2, int i3, int i4, int i5, int i6) {
        this.f2428l = 1;
        a(i);
        if (list == null) {
            this.i = new ArrayList();
        } else {
            this.i = new ArrayList(list);
        }
        this.b = str3;
        this.f2429n = str4;
        this.h = str5;
        this.f2425c = i2;
        this.d = i3;
        this.g = i4;
        this.q = 0;
        this.f2427j = i5;
        this.o = 1;
        this.f2426e = str;
        this.f = str2;
        this.p = i6;
    }

    public FrameworkServiceDescription(String str, String str2, String str3, List<FrameworkServiceChannelDescription> list, int i, int i2, String str4, String str5, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str6, int i10) {
        this.i = new ArrayList();
        this.d = 0;
        this.g = 1;
        this.f2428l = 1;
        this.b = str3;
        a(i);
        this.m = i2;
        if (list == null) {
            this.i = new ArrayList();
        } else {
            this.i = new ArrayList(list);
        }
        this.f2429n = str4;
        this.h = str5;
        this.f2425c = i3;
        this.d = i4;
        this.g = i5;
        this.f2428l = i6;
        this.q = i7;
        this.f2427j = i8;
        this.o = i9;
        this.f2426e = str;
        this.f = str2;
        this.a = str6;
        this.p = i10;
    }
}
