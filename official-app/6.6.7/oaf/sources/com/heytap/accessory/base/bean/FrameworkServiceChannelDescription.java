package com.heytap.accessory.base.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FrameworkServiceChannelDescription implements Parcelable {
    public static final Parcelable.Creator<FrameworkServiceChannelDescription> CREATOR = new a();
    public final int a;
    public int b;
    public int c;
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
        this.c = i2;
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
        return this.c;
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
        return this.a == frameworkServiceChannelDescription.a && this.b == frameworkServiceChannelDescription.b && this.c == frameworkServiceChannelDescription.c && this.d == frameworkServiceChannelDescription.d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public String toString() {
        return "channelDesc{mChannelId=" + this.a + ", mQosClass=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
