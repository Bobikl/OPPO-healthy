package com.oplus.wearable.linkservice.sdk.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.veb;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class Module implements Parcelable {
    public static final Parcelable.Creator<Module> CREATOR = new a();
    private int connectionType;
    private Bundle mExtra;
    private String macAddress;
    private String nodeId;
    private int state;

    public class a implements Parcelable.Creator<Module> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Module createFromParcel(Parcel parcel) {
            return new Module(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Module[] newArray(int i) {
            return new Module[i];
        }
    }

    public Module() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getConnectionType() {
        return this.connectionType;
    }

    public Bundle getExtra() {
        return this.mExtra;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public int getState() {
        return this.state;
    }

    public boolean isConnected() {
        return this.state == 2;
    }

    public boolean isOlink() {
        int i = this.connectionType;
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    public void setConnectionType(int i) {
        this.connectionType = i;
    }

    public void setExtra(Bundle bundle) {
        this.mExtra = bundle;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }

    public void setState(int i) {
        this.state = i;
    }

    public String toString() {
        return "Module{macAddress='" + veb.a(this.macAddress) + "', nodeId='" + veb.a(this.nodeId) + "', connectionType=" + this.connectionType + ", state=" + this.state + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.macAddress);
        parcel.writeString(this.nodeId);
        parcel.writeInt(this.connectionType);
        parcel.writeInt(this.state);
        parcel.writeBundle(this.mExtra);
    }

    public Module(Parcel parcel) {
        this.macAddress = parcel.readString();
        this.nodeId = parcel.readString();
        this.connectionType = parcel.readInt();
        this.state = parcel.readInt();
        this.mExtra = parcel.readBundle(getClass().getClassLoader());
    }
}
