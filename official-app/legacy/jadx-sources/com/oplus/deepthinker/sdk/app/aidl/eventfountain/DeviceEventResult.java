package com.oplus.deepthinker.sdk.app.aidl.eventfountain;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.g5g;

/* JADX INFO: loaded from: classes5.dex */
public class DeviceEventResult implements Parcelable {
    public static final Parcelable.Creator<DeviceEventResult> CREATOR = new Parcelable.Creator<DeviceEventResult>() { // from class: com.oplus.deepthinker.sdk.app.aidl.eventfountain.DeviceEventResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceEventResult createFromParcel(Parcel parcel) {
            return new DeviceEventResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceEventResult[] newArray(int i) {
            return new DeviceEventResult[i];
        }
    };
    private static final String TAG = "DeviceEventResult";
    private int mEventStateType;
    private int mEventType;
    private Bundle mExtraData;
    private int mPid;
    private String mPkgName;

    public DeviceEventResult(int i, int i2, int i3, String str, Bundle bundle) {
        this.mEventType = i;
        this.mEventStateType = i2;
        this.mPid = i3;
        this.mPkgName = str;
        this.mExtraData = bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getEventStateType() {
        return this.mEventStateType;
    }

    public int getEventType() {
        return this.mEventType;
    }

    public Bundle getExtraData() {
        if (this.mExtraData == null) {
            g5g.a(TAG, "getExtraData: This event is not supported.");
        }
        return this.mExtraData;
    }

    public int getPid() {
        if (this.mPid == -1) {
            g5g.a(TAG, "getPid: This event is not supported.");
        }
        return this.mPid;
    }

    public String getPkgName() {
        if (this.mPkgName == null) {
            g5g.a(TAG, "getPkgName: This event is not supported.");
        }
        return this.mPkgName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceEventResult :");
        sb.append("\teventType is :");
        sb.append(this.mEventType);
        sb.append("\teventStateType is :");
        sb.append(this.mEventStateType);
        sb.append("\tpid is : ");
        sb.append(this.mPid);
        sb.append("\t\tpackageName is : ");
        sb.append(this.mPkgName);
        if (this.mExtraData != null) {
            sb.append("\tExtraData is : ");
            sb.append(this.mExtraData.toString());
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mEventType);
        parcel.writeInt(this.mEventStateType);
        parcel.writeInt(this.mPid);
        parcel.writeString(this.mPkgName);
        parcel.writeBundle(this.mExtraData);
    }

    public DeviceEventResult(Parcel parcel) {
        this.mEventType = parcel.readInt();
        this.mEventStateType = parcel.readInt();
        this.mPid = parcel.readInt();
        this.mPkgName = parcel.readString();
        this.mExtraData = parcel.readBundle(getClass().getClassLoader());
    }
}
