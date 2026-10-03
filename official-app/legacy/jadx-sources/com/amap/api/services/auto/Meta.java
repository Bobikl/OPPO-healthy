package com.amap.api.services.auto;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class Meta implements Parcelable {
    public static final Parcelable.Creator<Meta> CREATOR = new a();
    public String listBizType;

    public static class a implements Parcelable.Creator<Meta> {
        public static Meta a(Parcel parcel) {
            return new Meta(parcel);
        }

        public static Meta[] b(int i) {
            return new Meta[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Meta createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Meta[] newArray(int i) {
            return b(i);
        }
    }

    public Meta() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.listBizType);
    }

    public Meta(Parcel parcel) {
        this.listBizType = parcel.readString();
    }
}
