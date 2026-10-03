package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class CloudImage implements Parcelable {
    public static final Parcelable.Creator<CloudImage> CREATOR = new a();
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f945c;

    public static class a implements Parcelable.Creator<CloudImage> {
        public static CloudImage a(Parcel parcel) {
            return new CloudImage(parcel);
        }

        public static CloudImage[] b(int i) {
            return new CloudImage[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CloudImage createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CloudImage[] newArray(int i) {
            return b(i);
        }
    }

    public CloudImage(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.f945c = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.a;
    }

    public String getPreurl() {
        return this.b;
    }

    public String getUrl() {
        return this.f945c;
    }

    public void setId(String str) {
        this.a = str;
    }

    public void setPreurl(String str) {
        this.b = str;
    }

    public void setUrl(String str) {
        this.f945c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f945c);
    }

    public CloudImage(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f945c = parcel.readString();
    }
}
