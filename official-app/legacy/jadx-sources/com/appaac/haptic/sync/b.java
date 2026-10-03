package com.appaac.haptic.sync;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.clm;

/* JADX INFO: loaded from: classes12.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new clm();
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1092c;

    public b(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.f1092c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "loop='" + this.b + "',interval='" + this.f1092c + "'," + this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.f1092c);
    }

    public b(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.f1092c = i2;
    }
}
