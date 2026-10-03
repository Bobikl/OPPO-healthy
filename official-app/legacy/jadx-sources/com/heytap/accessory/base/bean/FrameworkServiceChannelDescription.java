package com.heytap.accessory.base.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class FrameworkServiceChannelDescription implements Parcelable {
    public static final Parcelable.Creator<FrameworkServiceChannelDescription> CREATOR = new a();
    public final int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2424c;
    public int d;

    public class a implements Parcelable.Creator<FrameworkServiceChannelDescription> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FrameworkServiceChannelDescription[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FrameworkServiceChannelDescription createFromParcel(Parcel parcel) {
            return new FrameworkServiceChannelDescription(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public FrameworkServiceChannelDescription(int i, int i2, int i3, int i4) {
        this.a = i;
        this.f2424c = i2;
        this.d = i3;
        this.b = i4;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.f2424c;
    }

    public int d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FrameworkServiceChannelDescription frameworkServiceChannelDescription = (FrameworkServiceChannelDescription) obj;
        return this.a == frameworkServiceChannelDescription.a && this.b == frameworkServiceChannelDescription.b && this.f2424c == frameworkServiceChannelDescription.f2424c && this.d == frameworkServiceChannelDescription.d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.f2424c), Integer.valueOf(this.d));
    }

    public String toString() {
        return "channelDesc{mChannelId=" + this.a + ", mQosClass=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.f2424c);
        parcel.writeInt(this.d);
    }
}
