package com.heytap.health.devicemanager.processor.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.t04;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class VirtualAccountData implements Parcelable, Cloneable {
    public static final Parcelable.Creator<VirtualAccountData> CREATOR = new a();
    private static final String NORMAL_VALUE = "0";
    public static final int STATUS_BIND = 1;
    public static final int STATUS_UNBIND = 0;

    @SerializedName("bindStatus")
    private int bindStatus;

    @SerializedName("birthday")
    private String birthday;

    @SerializedName(ServiceNodeBundleKeys.DEVICE_NAME)
    private String deviceName;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @SerializedName(Fields.HEIGHT_FIELD)
    private String height;
    private boolean isChecked;

    @SerializedName("nickname")
    private String nikcName;

    @SerializedName("sex")
    private String sex;

    @SerializedName("virtualSsoid")
    private String virtualSsoid;

    @SerializedName("weight")
    private String weight;

    public class a implements Parcelable.Creator<VirtualAccountData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VirtualAccountData createFromParcel(Parcel parcel) {
            return new VirtualAccountData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VirtualAccountData[] newArray(int i) {
            return new VirtualAccountData[i];
        }
    }

    public VirtualAccountData(Parcel parcel) {
        this.virtualSsoid = parcel.readString();
        this.deviceName = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.nikcName = parcel.readString();
        this.sex = parcel.readString();
        this.birthday = parcel.readString();
        this.height = parcel.readString();
        this.weight = parcel.readString();
        this.bindStatus = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.virtualSsoid, ((VirtualAccountData) obj).virtualSsoid);
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public String getHeight() {
        return this.height;
    }

    public String getNikcName() {
        return this.nikcName;
    }

    public String getSex() {
        return this.sex;
    }

    public String getVirtualSsoid() {
        return this.virtualSsoid;
    }

    public String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return Objects.hash(this.virtualSsoid);
    }

    public boolean isBindDevice() {
        return this.bindStatus == 1;
    }

    public int isBindStatus() {
        return this.bindStatus;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public boolean isReset() {
        return TextUtils.equals(this.weight, "0") || TextUtils.equals(this.height, "0");
    }

    public void setBindStatus(int i) {
        this.bindStatus = i;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setNikcName(String str) {
        this.nikcName = str;
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public void setVirtualSsoid(String str) {
        this.virtualSsoid = str;
    }

    public void setWeight(String str) {
        this.weight = str;
    }

    public String toString() {
        return "VirtualAccountData{virtualSsoid='" + this.virtualSsoid + "', deviceName='" + this.deviceName + "', deviceUniqueId='" + this.deviceUniqueId + "', nikcName='" + this.nikcName + "', sex='" + this.sex + "', birthday='" + this.birthday + "', height='" + this.height + "', weight='" + this.weight + "', bindStatus=" + this.bindStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.virtualSsoid);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.nikcName);
        parcel.writeString(this.sex);
        parcel.writeString(this.birthday);
        parcel.writeString(this.height);
        parcel.writeString(this.weight);
        parcel.writeInt(this.bindStatus);
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public VirtualAccountData m4638clone() {
        try {
            return (VirtualAccountData) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public VirtualAccountData() {
    }
}
