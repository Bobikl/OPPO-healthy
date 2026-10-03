package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* JADX INFO: loaded from: classes12.dex */
public class CloudItemDetail extends CloudItem {
    public static final Parcelable.Creator<CloudItemDetail> CREATOR = new a();

    public static class a implements Parcelable.Creator<CloudItemDetail> {
        public static CloudItemDetail a(Parcel parcel) {
            return new CloudItemDetail(parcel);
        }

        public static CloudItemDetail[] b(int i) {
            return new CloudItemDetail[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CloudItemDetail createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CloudItemDetail[] newArray(int i) {
            return b(i);
        }
    }

    public CloudItemDetail(String str, LatLonPoint latLonPoint, String str2, String str3) {
        super(str, latLonPoint, str2, str3);
    }

    @Override // com.amap.api.services.cloud.CloudItem, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amap.api.services.cloud.CloudItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public CloudItemDetail(Parcel parcel) {
        super(parcel);
    }
}
