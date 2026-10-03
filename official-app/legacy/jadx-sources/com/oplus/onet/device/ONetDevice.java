package com.oplus.onet.device;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.d3d;
import com.oplus.aiunit.vision.h0n;
import com.oplus.aiunit.vision.nxm;
import com.oplus.aiunit.vision.wpg;
import com.oplus.aiunit.vision.zqm;
import com.oplus.onet.link.ONetPeer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class ONetDevice implements Parcelable {
    private static final String COMPATIBLE_KEY_ACCOUNT_LOGIN_STATE = "key_account_login_state";
    private static final String COMPATIBLE_KEY_ACCOUNT_MATCH_ID = "key_account_match_id";
    private static final String COMPATIBLE_KEY_PROTOCOL_VERSION = "key_protocol_version";
    private static final String COMPATIBLE_KEY_SENSELESS_SWITCH_STATE = "key_senseless_switch_state";
    public static final int CONNECTION_TYPE_BT = 2;
    public static final int CONNECTION_TYPE_WIFI_P2P = 1;
    public static final Parcelable.Creator<ONetDevice> CREATOR = new a();
    public static final int DEVICE_CREATED_BY_ARTIFICIALITY = 1;
    public static final int DEVICE_CREATED_BY_DISCOVERY = 0;
    public static final int DEVICE_STATE_DEFAULT = -1;
    public static final int DEVICE_STATE_DISCOVERED = 1;
    public static final int DEVICE_STATE_LOST = 4;
    public static final int DEVICE_STATE_OFFLINE = 3;
    public static final int DEVICE_STATE_ONLINE = 2;
    public static final int LOGIN_STATE_IN = 1;
    public static final int LOGIN_STATE_OUT = 0;
    public static final int ORIGINAL_PROTOCOL_VERSION = 1;
    public static final int SENSELESS_SWITCH_OFF = 0;
    public static final int SENSELESS_SWITCH_ON = 1;
    public static final String TAG = "ONetDevice";
    public int mAccountLoginState;
    public int mAuthType;
    public int mConnectType;
    public int mCreationType;
    public int mCurrentState;
    public Bundle mCustomizedData;
    public final Object mCustomizedLock;
    public int mDeviceAbility;
    public byte[] mDeviceAccountMatchId;
    public byte[] mDeviceId;
    public String mDeviceName;
    public int mDeviceType;
    public String mModelId;
    public ONetPeer mPeer;
    public int mProtocolVersion;
    public int mResumeConnectType;
    public int mSameAccountFlag;
    public int mScanType;
    public String mTag;
    public String mUuid;
    public int senselessSwitchState;

    public class a implements Parcelable.Creator<ONetDevice> {
        @Override // android.os.Parcelable.Creator
        public final ONetDevice createFromParcel(Parcel parcel) {
            return new ONetDevice(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ONetDevice[] newArray(int i) {
            return new ONetDevice[i];
        }
    }

    public ONetDevice(Parcel parcel) {
        this.mCustomizedData = new Bundle();
        this.mCurrentState = -1;
        this.senselessSwitchState = 1;
        this.mAccountLoginState = 1;
        this.mProtocolVersion = 1;
        this.mCustomizedLock = new Object();
        this.mUuid = parcel.readString();
        this.mTag = parcel.readString();
        this.mDeviceType = parcel.readInt();
        this.mDeviceName = parcel.readString();
        this.mConnectType = parcel.readInt();
        if (h0n.b() || h0n.a(1020040) >= 0) {
            this.mScanType = parcel.readInt();
        }
        this.mCreationType = parcel.readInt();
        this.mDeviceId = parcel.createByteArray();
        this.mDeviceAbility = parcel.readInt();
        this.mAuthType = parcel.readInt();
        this.mCustomizedData = parcel.readBundle();
        this.mCurrentState = parcel.readInt();
        this.mPeer = (ONetPeer) parcel.readParcelable(ONetPeer.class.getClassLoader());
        this.mModelId = parcel.readString();
        if (h0n.b() || h0n.a(13001000) >= 0) {
            this.mSameAccountFlag = parcel.readInt();
            this.mResumeConnectType = parcel.readInt();
        }
        if (this.mCustomizedData != null) {
            if (h0n.b() || h0n.a(140000000) >= 0) {
                this.senselessSwitchState = this.mCustomizedData.getInt(COMPATIBLE_KEY_SENSELESS_SWITCH_STATE, 1);
                this.mAccountLoginState = this.mCustomizedData.getInt(COMPATIBLE_KEY_ACCOUNT_LOGIN_STATE, 1);
                this.mDeviceAccountMatchId = this.mCustomizedData.getByteArray(COMPATIBLE_KEY_ACCOUNT_MATCH_ID);
                this.mProtocolVersion = this.mCustomizedData.getInt(COMPATIBLE_KEY_PROTOCOL_VERSION, 1);
            }
        }
    }

    public static String getPureTag(@NonNull String str) {
        int iIndexOf;
        return (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf("_MODEL_ID")) >= 0) ? str.substring(0, iIndexOf) : str;
    }

    public void copyFrom(ONetDevice oNetDevice) {
        this.mTag = oNetDevice.getTag();
        this.mDeviceType = oNetDevice.getDeviceType();
        this.mDeviceName = oNetDevice.getPeerDeviceName();
        this.mConnectType = oNetDevice.getConnectType();
        this.mScanType = oNetDevice.getScanType();
        this.mCreationType = oNetDevice.getCreationType();
        this.mDeviceId = oNetDevice.getDvd();
        this.mCustomizedData = oNetDevice.getCustomizedData();
        this.mPeer = oNetDevice.getPeer();
        this.mDeviceAbility = oNetDevice.getAbility();
        this.mAuthType = oNetDevice.getAuthType();
        this.mSameAccountFlag = oNetDevice.getSameAccountFlag();
        this.mResumeConnectType = oNetDevice.getResumeConnectType();
        this.mCurrentState = oNetDevice.getCurrentState();
        this.mModelId = oNetDevice.getModelId();
        this.senselessSwitchState = oNetDevice.getSenselessSwitchState();
        this.mAccountLoginState = oNetDevice.getAccountLoginState();
        this.mDeviceAccountMatchId = oNetDevice.getDeviceAccountMatchId();
        this.mProtocolVersion = oNetDevice.getProtocolVersion();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ONetDevice)) {
            return false;
        }
        ONetDevice oNetDevice = (ONetDevice) obj;
        if (getTag().equals(oNetDevice.getTag())) {
            return true;
        }
        return getDvd() != null && Arrays.equals(getDvd(), oNetDevice.getDvd());
    }

    public int getAbility() {
        return this.mDeviceAbility;
    }

    public int getAccountLoginState() {
        return this.mAccountLoginState;
    }

    public int getAuthType() {
        return this.mAuthType;
    }

    public int getConnectState() {
        return this.mCurrentState;
    }

    public int getConnectType() {
        return this.mConnectType;
    }

    public int getCreationType() {
        return this.mCreationType;
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public Bundle getCustomizedData() {
        return this.mCustomizedData;
    }

    public byte[] getDeviceAccountMatchId() {
        return this.mDeviceAccountMatchId;
    }

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public DirectConnectOption getDirectConnectOption() {
        return new DirectConnectOption.a().r(this.mCustomizedData.getString(DirectConnectOption.DIRECT_CONNECT_KEY_MAC_ADDR)).m(this.mCustomizedData.getString(DirectConnectOption.DIRECT_CONNECT_KEY_ADV_FREQ)).u(this.mCustomizedData.getString(DirectConnectOption.DIRECT_CONNECT_KEY_REMOTE_IP)).v(this.mCustomizedData.getString(DirectConnectOption.DIRECT_CONNECT_KEY_SSID)).w(this.mCustomizedData.getString(DirectConnectOption.DIRECT_CONNECT_KEY_TAG)).n(this.mCustomizedData.getString(DirectConnectOption.DIRECT_CONNECT_KEY_DEVICE_ID)).q(this.mCustomizedData.getString(DirectConnectOption.DIRECT_CONNECT_KEY_KSC_ALIAS)).o(this.mCustomizedData.getString(DirectConnectOption.DIRECT_CONNECT_KEY_DEVICE_KSC)).s(this.mCustomizedData.getString(DirectConnectOption.DIRECT_CONNECT_KEY_NAME)).t(this.mCustomizedData.getString(DirectConnectOption.DIRECT_CONNECT_KEY_PASSWORD)).p(this.mCustomizedData.getBoolean(DirectConnectOption.DIRECT_CONNECT_KEY_FLAG_KEEP_ALIVE)).a();
    }

    public byte[] getDvd() {
        return this.mDeviceId;
    }

    public String getDvdStr() {
        return nxm.a(this.mDeviceId);
    }

    public String getModelId() {
        return this.mModelId;
    }

    public ONetPeer getPeer() {
        return this.mPeer;
    }

    public String getPeerDeviceName() {
        return this.mDeviceName;
    }

    public int getProtocolVersion() {
        return this.mProtocolVersion;
    }

    public int getResumeConnectType() {
        return this.mResumeConnectType;
    }

    public int getSameAccountFlag() {
        return this.mSameAccountFlag;
    }

    public int getScanType() {
        return this.mScanType;
    }

    public int getSenselessSwitchState() {
        return this.senselessSwitchState;
    }

    public String getTag() {
        return this.mTag;
    }

    public String getUuid() {
        return this.mUuid;
    }

    public int hashCode() {
        return Arrays.hashCode(this.mDeviceId) + (Objects.hash(this.mTag) * 31);
    }

    public boolean isDiscovered() {
        return this.mCurrentState == 1;
    }

    public boolean isFilteredState(int[] iArr) {
        for (int i : iArr) {
            if (this.mCurrentState == i) {
                return true;
            }
        }
        return false;
    }

    public boolean isOffline() {
        return this.mCurrentState == 3;
    }

    public boolean isOnline() {
        return this.mCurrentState == 2;
    }

    public boolean isSameDeviceWith(ONetDevice oNetDevice) {
        if (oNetDevice != null && this.mTag != null && oNetDevice.getTag() != null) {
            if (this.mTag.equals(oNetDevice.getTag())) {
                return true;
            }
            if (this.mDeviceId != null && oNetDevice.getDvd() != null && Arrays.equals(this.mDeviceId, oNetDevice.getDvd())) {
                return true;
            }
        }
        return false;
    }

    public void readFromParcel(Parcel parcel) {
        this.mUuid = parcel.readString();
        this.mTag = parcel.readString();
        this.mDeviceType = parcel.readInt();
        this.mDeviceName = parcel.readString();
        this.mConnectType = parcel.readInt();
        if (h0n.b() || h0n.a(1020040) >= 0) {
            this.mScanType = parcel.readInt();
        }
        this.mCreationType = parcel.readInt();
        this.mDeviceId = parcel.createByteArray();
        this.mDeviceAbility = parcel.readInt();
        this.mAuthType = parcel.readInt();
        this.mCustomizedData = parcel.readBundle();
        this.mCurrentState = parcel.readInt();
        this.mPeer = (ONetPeer) parcel.readParcelable(ONetPeer.class.getClassLoader());
        this.mModelId = parcel.readString();
        if (h0n.b() || h0n.a(13001000) >= 0) {
            this.mSameAccountFlag = parcel.readInt();
            this.mResumeConnectType = parcel.readInt();
        }
        if (this.mCustomizedData != null) {
            if (h0n.b() || h0n.a(140000000) >= 0) {
                this.senselessSwitchState = this.mCustomizedData.getInt(COMPATIBLE_KEY_SENSELESS_SWITCH_STATE, 1);
                this.mAccountLoginState = this.mCustomizedData.getInt(COMPATIBLE_KEY_ACCOUNT_LOGIN_STATE, 1);
                this.mDeviceAccountMatchId = this.mCustomizedData.getByteArray(COMPATIBLE_KEY_ACCOUNT_MATCH_ID);
                this.mProtocolVersion = this.mCustomizedData.getInt(COMPATIBLE_KEY_PROTOCOL_VERSION, 1);
            }
        }
    }

    public void setAbility(int i) {
        this.mDeviceAbility = i;
    }

    public boolean setAccountLoginState(int i) {
        String str = TAG;
        d3d.b(str, ", setAccountLoginState = " + i);
        if (i == 0 || i == 1) {
            this.mAccountLoginState = i;
            return true;
        }
        d3d.c(str, ", setAccountLoginState illegal");
        return false;
    }

    public void setAuthType(int i) {
        this.mAuthType = i;
    }

    public void setConnectType(int i) {
        this.mConnectType = i;
    }

    public void setCreationType(int i) {
        this.mCreationType = i;
    }

    public void setCurrentState(int i) {
        d3d.b(TAG, "setCurrentState = " + i + ", name=" + this.mDeviceName);
        this.mCurrentState = i;
        if (i == 3) {
            this.mScanType = 0;
        }
    }

    public void setCustomizedData(Bundle bundle) {
        this.mCustomizedData = bundle;
    }

    public void setDeviceAccountMatchId(byte[] bArr) {
        this.mDeviceAccountMatchId = bArr;
    }

    public void setDeviceId(byte[] bArr) {
        this.mDeviceId = bArr;
    }

    public void setDeviceType(int i) {
        this.mDeviceType = i;
    }

    public void setDirectConnectOption(@NonNull DirectConnectOption directConnectOption) {
        d3d.f(TAG, ", option=" + directConnectOption);
        if (!TextUtils.isEmpty(directConnectOption.getMacAddress())) {
            this.mCustomizedData.putString(DirectConnectOption.DIRECT_CONNECT_KEY_MAC_ADDR, directConnectOption.getMacAddress());
        }
        if (!TextUtils.isEmpty(directConnectOption.getAdvFreq())) {
            this.mCustomizedData.putString(DirectConnectOption.DIRECT_CONNECT_KEY_ADV_FREQ, directConnectOption.getAdvFreq());
        }
        if (!TextUtils.isEmpty(directConnectOption.getTag())) {
            this.mCustomizedData.putString(DirectConnectOption.DIRECT_CONNECT_KEY_TAG, directConnectOption.getTag());
        }
        if (!TextUtils.isEmpty(directConnectOption.getSsid())) {
            this.mCustomizedData.putString(DirectConnectOption.DIRECT_CONNECT_KEY_SSID, directConnectOption.getSsid());
        }
        if (!TextUtils.isEmpty(directConnectOption.getRemoteIp())) {
            this.mCustomizedData.putString(DirectConnectOption.DIRECT_CONNECT_KEY_REMOTE_IP, directConnectOption.getRemoteIp());
        }
        if (!TextUtils.isEmpty(directConnectOption.getDvd())) {
            this.mCustomizedData.putString(DirectConnectOption.DIRECT_CONNECT_KEY_DEVICE_ID, directConnectOption.getDvd());
        }
        if (!TextUtils.isEmpty(directConnectOption.getKscAlias())) {
            this.mCustomizedData.putString(DirectConnectOption.DIRECT_CONNECT_KEY_KSC_ALIAS, directConnectOption.getKscAlias());
        }
        if (!TextUtils.isEmpty(directConnectOption.getDeviceKsc())) {
            this.mCustomizedData.putString(DirectConnectOption.DIRECT_CONNECT_KEY_DEVICE_KSC, directConnectOption.getDeviceKsc());
        }
        if (!TextUtils.isEmpty(directConnectOption.getName())) {
            this.mCustomizedData.putString(DirectConnectOption.DIRECT_CONNECT_KEY_NAME, directConnectOption.getName());
        }
        if (!TextUtils.isEmpty(directConnectOption.getPassWord())) {
            this.mCustomizedData.putString(DirectConnectOption.DIRECT_CONNECT_KEY_PASSWORD, directConnectOption.getPassWord());
        }
        this.mCustomizedData.putBoolean(DirectConnectOption.DIRECT_CONNECT_KEY_FLAG_KEEP_ALIVE, directConnectOption.isFlagKeepAlive());
    }

    public void setModelId(String str) {
        this.mModelId = str;
    }

    public void setPeer(ONetPeer oNetPeer) {
        this.mPeer = oNetPeer;
    }

    public void setPeerDeviceName(String str) {
        this.mDeviceName = str;
    }

    public void setProtocolVersion(int i) {
        this.mProtocolVersion = i;
    }

    public void setResumeConnectType(int i) {
        this.mResumeConnectType = i;
    }

    public void setSameAccountFlag(int i) {
        this.mSameAccountFlag = i;
    }

    public void setScanType(int i) {
        this.mScanType = i;
    }

    public boolean setSenselessSwitchState(int i) {
        String str = TAG;
        d3d.b(str, ", setSenselessSwitchState = " + i);
        if (i == 1 || i == 0) {
            this.senselessSwitchState = i;
            return true;
        }
        d3d.c(str, ", setSenselessSwitchState illegal");
        return false;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void setUuid(String str) {
        this.mUuid = str;
    }

    public String toString() {
        StringBuilder sbA = zqm.a("ONetDevice{");
        StringBuilder sbA2 = zqm.a("mUuid=");
        sbA2.append(this.mUuid);
        sbA.append(sbA2.toString());
        StringBuilder sbA3 = zqm.a(", mTag='");
        sbA3.append(wpg.e(this.mTag));
        sbA3.append('\'');
        sbA.append(sbA3.toString());
        StringBuilder sbA4 = zqm.a(", mDeviceType=");
        sbA4.append(this.mDeviceType);
        sbA.append(sbA4.toString());
        StringBuilder sbA5 = zqm.a(", mDeviceName='");
        sbA5.append(this.mDeviceName);
        sbA5.append('\'');
        sbA.append(sbA5.toString());
        StringBuilder sbA6 = zqm.a(", mConnectType=");
        sbA6.append(this.mConnectType);
        sbA.append(sbA6.toString());
        StringBuilder sbA7 = zqm.a(", mScanType=");
        sbA7.append(getScanType());
        sbA.append(sbA7.toString());
        StringBuilder sbA8 = zqm.a(", mCreationType=");
        sbA8.append(this.mCreationType);
        sbA.append(sbA8.toString());
        StringBuilder sbA9 = zqm.a(", mCustomizedData.size=");
        Bundle bundle = this.mCustomizedData;
        sbA9.append(bundle == null ? 0 : bundle.size());
        sbA.append(sbA9.toString());
        StringBuilder sbA10 = zqm.a(", mDvd=");
        sbA10.append(wpg.g(this.mDeviceId));
        sbA.append(sbA10.toString());
        StringBuilder sbA11 = zqm.a(", mModelId=");
        sbA11.append(wpg.e(this.mModelId));
        sbA.append(sbA11.toString());
        StringBuilder sbA12 = zqm.a(", mDeviceAbility=");
        sbA12.append(this.mDeviceAbility);
        sbA.append(sbA12.toString());
        StringBuilder sbA13 = zqm.a(", mAuthType=");
        sbA13.append(this.mAuthType);
        sbA.append(sbA13.toString());
        StringBuilder sbA14 = zqm.a(", mCurrentState=");
        sbA14.append(this.mCurrentState);
        sbA.append(sbA14.toString());
        StringBuilder sbA15 = zqm.a(", mSameAccountFlag=");
        sbA15.append(this.mSameAccountFlag);
        sbA.append(sbA15.toString());
        StringBuilder sbA16 = zqm.a(", mResumeConnectType=");
        sbA16.append(this.mResumeConnectType);
        sbA.append(sbA16.toString());
        StringBuilder sbA17 = zqm.a(", senselessSwitchState=");
        sbA17.append(this.senselessSwitchState);
        sbA.append(sbA17.toString());
        StringBuilder sbA18 = zqm.a(", mDeviceAccountMatchId=");
        sbA18.append(wpg.g(this.mDeviceAccountMatchId));
        sbA.append(sbA18.toString());
        sbA.append("}");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUuid);
        parcel.writeString(this.mTag);
        parcel.writeInt(this.mDeviceType);
        parcel.writeString(this.mDeviceName);
        parcel.writeInt(this.mConnectType);
        if (h0n.b() || h0n.a(1020040) >= 0) {
            parcel.writeInt(this.mScanType);
        }
        parcel.writeInt(this.mCreationType);
        parcel.writeByteArray(this.mDeviceId);
        parcel.writeInt(this.mDeviceAbility);
        parcel.writeInt(this.mAuthType);
        if (h0n.b() || h0n.a(140000000) >= 0) {
            synchronized (this.mCustomizedLock) {
                this.mCustomizedData.putInt(COMPATIBLE_KEY_SENSELESS_SWITCH_STATE, this.senselessSwitchState);
                this.mCustomizedData.putInt(COMPATIBLE_KEY_ACCOUNT_LOGIN_STATE, this.mAccountLoginState);
                this.mCustomizedData.putByteArray(COMPATIBLE_KEY_ACCOUNT_MATCH_ID, this.mDeviceAccountMatchId);
                this.mCustomizedData.putInt(COMPATIBLE_KEY_PROTOCOL_VERSION, this.mProtocolVersion);
            }
        }
        parcel.writeBundle(this.mCustomizedData);
        parcel.writeInt(this.mCurrentState);
        parcel.writeParcelable(this.mPeer, i);
        parcel.writeString(this.mModelId);
        if (h0n.b() || h0n.a(13001000) >= 0) {
            parcel.writeInt(this.mSameAccountFlag);
            parcel.writeInt(this.mResumeConnectType);
        }
    }

    public ONetDevice() {
        this.mCustomizedData = new Bundle();
        this.mCurrentState = -1;
        this.senselessSwitchState = 1;
        this.mAccountLoginState = 1;
        this.mProtocolVersion = 1;
        this.mCustomizedLock = new Object();
    }
}
