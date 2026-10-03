package com.oplus.onet.obcommon;

import android.net.wifi.WifiConfiguration;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.oplus.aiunit.vision.mxm;
import com.oplus.aiunit.vision.yqm;
import java.util.BitSet;

/* JADX INFO: loaded from: classes8.dex */
public class WifiConfig implements Parcelable {
    public static final Parcelable.Creator<WifiConfig> CREATOR = new a();
    private static final String TAG = "WifiConfig";
    private BitSet mAllowedKeyManagement;
    private String mAllowedKeyManagementStr;
    private String mPreSharedKey;
    private String mSsid;
    private int mVersion;

    public class a implements Parcelable.Creator<WifiConfig> {
        @Override // android.os.Parcelable.Creator
        public final WifiConfig createFromParcel(Parcel parcel) {
            return new WifiConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WifiConfig[] newArray(int i) {
            return new WifiConfig[i];
        }
    }

    public WifiConfig() {
        this.mVersion = 10000;
        this.mAllowedKeyManagement = new BitSet();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void forSelf(yqm<String, String> yqmVar) {
        if (!TextUtils.isEmpty(this.mSsid)) {
            ((mxm.a) yqmVar).a("ssid", this.mSsid);
        }
        if (!TextUtils.isEmpty(this.mPreSharedKey)) {
            ((mxm.a) yqmVar).a("preSharedKey", this.mPreSharedKey);
        }
        if (TextUtils.isEmpty(this.mAllowedKeyManagementStr)) {
            return;
        }
        ((mxm.a) yqmVar).a("allowedKeyManagenent", this.mAllowedKeyManagementStr);
    }

    public BitSet getAllowedKeyManagement() {
        return this.mAllowedKeyManagement;
    }

    public String getAllowedKeyManagementStr() {
        return this.mAllowedKeyManagementStr;
    }

    public String getPreSharedKey() {
        return this.mPreSharedKey;
    }

    public String getSsid() {
        return this.mSsid;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public WifiConfig setAllowedKeyManagement(String str) {
        try {
            int i = Integer.parseInt(str);
            BitSet bitSet = this.mAllowedKeyManagement;
            int length = WifiConfiguration.KeyMgmt.strings.length;
            for (int i2 = 0; i != 0 && i2 < length; i2++) {
                if (i % 2 == 1) {
                    bitSet.set(i2);
                }
                i /= 2;
            }
        } catch (Exception e2) {
            Log.e(TAG, e2.getLocalizedMessage());
        }
        return this;
    }

    public WifiConfig setAllowedKeyManagementStr(String str) {
        this.mAllowedKeyManagementStr = str;
        return this;
    }

    public WifiConfig setPreSharedKey(String str) {
        this.mPreSharedKey = str;
        return this;
    }

    public WifiConfig setSsid(String str) {
        this.mSsid = str;
        return this;
    }

    public void setValue(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if ("ssid".equals(str)) {
            this.mSsid = str2;
        }
        if ("preSharedKey".equals(str)) {
            this.mPreSharedKey = str2;
        }
        if ("allowedKeyManagenent".equals(str)) {
            if (z) {
                setAllowedKeyManagementStr(str2);
            } else {
                setAllowedKeyManagement(str2);
            }
        }
    }

    public WifiConfig setVersion(int i) {
        this.mVersion = i;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.mVersion >= 10000) {
            parcel.writeString(this.mSsid);
            parcel.writeString(this.mPreSharedKey);
            parcel.writeString(this.mAllowedKeyManagementStr);
            parcel.writeInt(this.mVersion);
        }
    }

    public WifiConfig(Parcel parcel) {
        this.mVersion = 10000;
        this.mAllowedKeyManagement = new BitSet();
        if (this.mVersion >= 10000) {
            this.mSsid = parcel.readString();
            this.mPreSharedKey = parcel.readString();
            this.mAllowedKeyManagementStr = parcel.readString();
            this.mVersion = parcel.readInt();
        }
    }
}
