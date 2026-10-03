package com.oplus.onet.link;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class ONetThirdApp implements Parcelable {
    public static final Parcelable.Creator<ONetThirdApp> CREATOR = new a();
    private int mAppID;
    private String mThirdAppName;

    public class a implements Parcelable.Creator<ONetThirdApp> {
        @Override // android.os.Parcelable.Creator
        public final ONetThirdApp createFromParcel(Parcel parcel) {
            return new ONetThirdApp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ONetThirdApp[] newArray(int i) {
            return new ONetThirdApp[i];
        }
    }

    public ONetThirdApp() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mThirdAppName);
        parcel.writeInt(this.mAppID);
    }

    public ONetThirdApp(Parcel parcel) {
        this.mThirdAppName = parcel.readString();
        this.mAppID = parcel.readInt();
    }
}
