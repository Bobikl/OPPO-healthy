package com.oplus.navi.oms;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class OmsPluginInfo implements Parcelable {
    public static final Parcelable.Creator<OmsPluginInfo> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19889c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19890e;
    private ApplicationInfo f;

    public class a implements Parcelable.Creator<OmsPluginInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OmsPluginInfo createFromParcel(Parcel parcel) {
            return new OmsPluginInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OmsPluginInfo[] newArray(int i) {
            return new OmsPluginInfo[i];
        }
    }

    public OmsPluginInfo(Parcel parcel) {
        if (parcel != null) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.f19889c = parcel.readString();
            this.d = parcel.readString();
            this.f19890e = parcel.readLong();
            this.f = (ApplicationInfo) parcel.readParcelable(ApplicationInfo.class.getClassLoader());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getActionName() {
        return this.a;
    }

    public String getApkName() {
        return this.b;
    }

    public String getApkPath() {
        return this.f19889c;
    }

    public ApplicationInfo getApplicationInfo() {
        return this.f;
    }

    public long getVersionCode() {
        return this.f19890e;
    }

    public String getVersionName() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.f19889c);
            parcel.writeString(this.d);
            parcel.writeLong(this.f19890e);
            parcel.writeParcelable(this.f, i);
        }
    }

    public OmsPluginInfo(String str, String str2, String str3, String str4, long j2, ApplicationInfo applicationInfo) {
        this.a = str;
        this.b = str2;
        this.f19889c = str3;
        this.d = str4;
        this.f19890e = j2;
        this.f = applicationInfo;
    }
}
