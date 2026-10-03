package com.heytap.health.settings.watch.schoolmode.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class DefaultAppInfo implements Parcelable {
    public static final Parcelable.Creator<DefaultAppInfo> CREATOR = new a();

    @SerializedName("appName")
    private String appName;

    @SerializedName("defaultSwitchStatus")
    private int defaultSwitchStatus;

    @SerializedName("display")
    private int display;

    @SerializedName("iconUrl")
    private String iconUrl;

    @SerializedName("packageName")
    private String packageName;

    @SerializedName("powerConsumption")
    private int powerConsumption;

    public class a implements Parcelable.Creator<DefaultAppInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DefaultAppInfo createFromParcel(Parcel parcel) {
            return new DefaultAppInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DefaultAppInfo[] newArray(int i) {
            return new DefaultAppInfo[i];
        }
    }

    public DefaultAppInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppName() {
        return this.appName;
    }

    public int getDefaultSwitchStatus() {
        return this.defaultSwitchStatus;
    }

    public int getDisplay() {
        return this.display;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getPowerConsumption() {
        return this.powerConsumption;
    }

    public void setDefaultSwitchStatus(int i) {
        this.defaultSwitchStatus = i;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setPowerConsumption(int i) {
        this.powerConsumption = i;
    }

    public String toString() {
        return "AppInfoBody{appName='" + this.appName + "', packageName='" + this.packageName + "', iconUrl='" + this.iconUrl + "', powerConsumption=" + this.powerConsumption + ", defaultSwitchStatus=" + this.defaultSwitchStatus + ", display=" + this.display + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appName);
        parcel.writeString(this.packageName);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.powerConsumption);
        parcel.writeInt(this.defaultSwitchStatus);
        parcel.writeInt(this.display);
    }

    public DefaultAppInfo(Parcel parcel) {
        this.appName = parcel.readString();
        this.packageName = parcel.readString();
        this.iconUrl = parcel.readString();
        this.powerConsumption = parcel.readInt();
        this.defaultSwitchStatus = parcel.readInt();
        this.display = parcel.readInt();
    }
}
