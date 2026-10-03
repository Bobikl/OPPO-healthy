package com.oplus.wearable.linkservice.sdk.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.wil;

/* JADX INFO: loaded from: classes5.dex */
public class ModuleInfo implements Parcelable, Cloneable {
    public static final Parcelable.Creator<ModuleInfo> CREATOR = new a();
    private static final String TAG = "ModuleInfo";
    private int connectionType;
    private String key;
    private Bundle mExtra;
    private String macAddress;
    private int moduleType;
    private String nodeId;
    private int state;

    public class a implements Parcelable.Creator<ModuleInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ModuleInfo createFromParcel(Parcel parcel) {
            return new ModuleInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ModuleInfo[] newArray(int i) {
            return new ModuleInfo[i];
        }
    }

    public ModuleInfo() {
        updateKey();
    }

    private void updateKey() {
        this.key = this.macAddress + "_" + this.connectionType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleInfo)) {
            return super.equals(obj);
        }
        ModuleInfo moduleInfo = (ModuleInfo) obj;
        return TextUtils.equals(this.macAddress, moduleInfo.getMacAddress()) && this.connectionType == moduleInfo.getConnectionType();
    }

    public int getConnectionType() {
        return this.connectionType;
    }

    public Bundle getExtra() {
        return this.mExtra;
    }

    public String getKey() {
        return this.key;
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

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isMainModule() {
        return this.moduleType == 0;
    }

    public void setConnectionType(int i) {
        this.connectionType = i;
        updateKey();
    }

    public void setExtra(Bundle bundle) {
        this.mExtra = bundle;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
        updateKey();
    }

    public void setMainModule(boolean z) {
        this.moduleType = !z ? 1 : 0;
    }

    public void setNodeId(String str) {
        this.nodeId = str;
    }

    public void setState(int i) {
        this.state = i;
    }

    public Module toModule() {
        Module module = new Module();
        module.setNodeId(getNodeId());
        module.setMacAddress(getMacAddress());
        module.setState(getState());
        module.setConnectionType(getConnectionType());
        module.setExtra(getExtra());
        return module;
    }

    public String toString() {
        return "ModuleInfo{macAddress='" + gdb.a(this.macAddress) + "', nodeId='" + gdb.a(this.nodeId) + "', connectionType=" + this.connectionType + ", state=" + this.state + ", moduleType=" + this.moduleType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.macAddress);
        parcel.writeString(this.nodeId);
        parcel.writeInt(this.connectionType);
        parcel.writeInt(this.state);
        parcel.writeInt(this.moduleType);
        parcel.writeBundle(this.mExtra);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ModuleInfo m5219clone() {
        try {
            return (ModuleInfo) super.clone();
        } catch (CloneNotSupportedException e2) {
            wil.b(TAG, "CloneNotSupportedException: " + e2.getMessage());
            return null;
        }
    }

    public ModuleInfo(Parcel parcel) {
        this.macAddress = parcel.readString();
        this.nodeId = parcel.readString();
        this.connectionType = parcel.readInt();
        this.state = parcel.readInt();
        this.moduleType = parcel.readInt();
        updateKey();
        this.mExtra = parcel.readBundle(getClass().getClassLoader());
    }
}
