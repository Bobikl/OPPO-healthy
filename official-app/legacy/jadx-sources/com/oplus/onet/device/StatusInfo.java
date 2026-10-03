package com.oplus.onet.device;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class StatusInfo implements Parcelable {
    public static final Parcelable.Creator<StatusInfo> CREATOR = new a();

    public class a implements Parcelable.Creator<StatusInfo> {
        @Override // android.os.Parcelable.Creator
        public final StatusInfo createFromParcel(Parcel parcel) {
            return new StatusInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StatusInfo[] newArray(int i) {
            return new StatusInfo[i];
        }
    }

    public StatusInfo(Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
