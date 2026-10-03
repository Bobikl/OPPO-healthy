package com.heytap.accessory.bean;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class DiscoveryConfigInfo implements Parcelable {
    public static final Parcelable.Creator<DiscoveryConfigInfo> CREATOR = new Parcelable.Creator<DiscoveryConfigInfo>() { // from class: com.heytap.accessory.bean.DiscoveryConfigInfo.1
        @Override // android.os.Parcelable.Creator
        public DiscoveryConfigInfo createFromParcel(Parcel parcel) {
            return new DiscoveryConfigInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DiscoveryConfigInfo[] newArray(int i) {
            return new DiscoveryConfigInfo[i];
        }
    };
    public static final String TAG = "DiscoveryConfigInfo";
    private String mAction;
    private final Bundle mBundle;
    private String mComponent;
    private String mTarget;
    private int mVersionCode;

    private DiscoveryConfigInfo(String str, String str2, String str3, int i) {
        this.mTarget = str;
        this.mAction = str2;
        this.mComponent = str3;
        this.mVersionCode = i;
        this.mBundle = new Bundle();
    }

    public static DiscoveryConfigInfo create(String str, String str2, String str3, int i) {
        return new DiscoveryConfigInfo(str, str2, str3, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.mAction;
    }

    public Bundle getBundle() {
        return this.mBundle;
    }

    public String getComponent() {
        return this.mComponent;
    }

    public String getTarget() {
        return this.mTarget;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public DiscoveryConfigInfo putBundle(Bundle bundle) {
        if (bundle != null) {
            this.mBundle.putAll(bundle);
        }
        return this;
    }

    public String toString() {
        return "ProductAppInfo{target='" + this.mTarget + "', action='" + this.mAction + "', component='" + this.mComponent + "', version=" + this.mVersionCode + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTarget);
        parcel.writeString(this.mAction);
        parcel.writeString(this.mComponent);
        parcel.writeInt(this.mVersionCode);
        parcel.writeBundle(this.mBundle);
    }

    public DiscoveryConfigInfo(Parcel parcel) {
        this.mTarget = parcel.readString();
        this.mAction = parcel.readString();
        this.mComponent = parcel.readString();
        this.mVersionCode = parcel.readInt();
        this.mBundle = parcel.readBundle(Bundle.class.getClassLoader());
    }
}
