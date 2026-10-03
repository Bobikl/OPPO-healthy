package com.opos.process.bridge.annotation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class NullBridgeTargetIdentify implements IBridgeTargetIdentify {
    public static final Parcelable.Creator<NullBridgeTargetIdentify> CREATOR = new Parcelable.Creator<NullBridgeTargetIdentify>() { // from class: com.opos.process.bridge.annotation.NullBridgeTargetIdentify.1
        @Override // android.os.Parcelable.Creator
        public NullBridgeTargetIdentify createFromParcel(Parcel parcel) {
            return new NullBridgeTargetIdentify(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public NullBridgeTargetIdentify[] newArray(int i) {
            return new NullBridgeTargetIdentify[i];
        }
    };

    public NullBridgeTargetIdentify(Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
