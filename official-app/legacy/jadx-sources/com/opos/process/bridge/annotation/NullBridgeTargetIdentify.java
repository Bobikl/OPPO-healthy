package com.opos.process.bridge.annotation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class NullBridgeTargetIdentify implements IBridgeTargetIdentify {
    public static final Parcelable.Creator<NullBridgeTargetIdentify> CREATOR = new Parcelable.Creator<NullBridgeTargetIdentify>() { // from class: com.opos.process.bridge.annotation.NullBridgeTargetIdentify.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NullBridgeTargetIdentify createFromParcel(Parcel parcel) {
            return new NullBridgeTargetIdentify(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
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
