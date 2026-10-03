package com.heytap.health.operation.medalv2.pojo;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes17.dex */
public class MedalBean implements Parcelable {
    public static final Parcelable.Creator<MedalBean> CREATOR = new a();

    public class a implements Parcelable.Creator<MedalBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MedalBean createFromParcel(Parcel parcel) {
            return new MedalBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MedalBean[] newArray(int i) {
            return new MedalBean[i];
        }
    }

    public MedalBean(Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
