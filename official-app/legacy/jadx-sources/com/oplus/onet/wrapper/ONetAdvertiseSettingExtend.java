package com.oplus.onet.wrapper;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.bean.AdvertiseSetting;
import com.oplus.aiunit.vision.wpg;
import com.oplus.aiunit.vision.zqm;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class ONetAdvertiseSettingExtend extends ONetAdvertiseSetting {
    public static final int ADVERTISE_TYPE_FASTDISCOVERY = 0;
    public static final int ADVERTISE_TYPE_FASTPAIR_MODELID = 1;
    public static final int CONNECT_TYPE_BLE = 4;
    public static final int CONNECT_TYPE_BT = 1;
    public static final int CONNECT_TYPE_MAX = 15;
    public static final int CONNECT_TYPE_MINI = 1;
    public static final int CONNECT_TYPE_NETWORK_CONNECT = 8;
    public static final int CONNECT_TYPE_P2P = 2;
    public static final int CONNECT_TYPE_UNKNOWN = 0;
    public static final Parcelable.Creator<ONetAdvertiseSettingExtend> CREATOR = new a();
    public static final String TAG = "ONetAdvertiseSettingExtend";
    private AdvertiseSetting mAdvertiseSetting;
    private transient int mClientId;
    private transient long mTimeoutTick;

    public class a implements Parcelable.Creator<ONetAdvertiseSettingExtend> {
        @Override // android.os.Parcelable.Creator
        public final ONetAdvertiseSettingExtend createFromParcel(Parcel parcel) {
            return new ONetAdvertiseSettingExtend(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ONetAdvertiseSettingExtend[] newArray(int i) {
            return new ONetAdvertiseSettingExtend[i];
        }
    }

    public ONetAdvertiseSettingExtend(AdvertiseSetting advertiseSetting) {
        this.mAdvertiseSetting = advertiseSetting;
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public byte[] getAdditionData() {
        return this.mAdvertiseSetting.getAdditionData();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public int getAdvertiseMode() {
        return this.mAdvertiseSetting.getAdvertiseMode();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public AdvertiseSetting getAdvertiseSetting() {
        return this.mAdvertiseSetting;
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public int getAdvertiseType() {
        return this.mAdvertiseSetting.getAdvertiseType();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public int getClientId() {
        return this.mClientId;
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public int getConnectType() {
        return this.mAdvertiseSetting.getConnectType();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public long getDurationMillis() {
        return this.mAdvertiseSetting.getDurationMillis();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public Bundle getExtraData() {
        return super.getExtraData();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public byte getGoIntent() {
        return this.mAdvertiseSetting.getGoIntent();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public int getKeyType() {
        return this.mAdvertiseSetting.getKeyType();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public int getMajor() {
        return this.mAdvertiseSetting.getMajor();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public String getModeStr() {
        return super.getModeStr();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public byte[] getModelId() {
        return this.mAdvertiseSetting.getModelId();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public byte[] getNickName() {
        return this.mAdvertiseSetting.getNickName();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public int getPort() {
        return this.mAdvertiseSetting.getPort();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public int getScanType() {
        return super.getScanType();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public long getTimeoutTick() {
        return this.mTimeoutTick;
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public boolean isTimeout() {
        return System.currentTimeMillis() > this.mTimeoutTick;
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public void setClientId(int i) {
        super.setClientId(i);
        this.mClientId = i;
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public void setExtraData(Bundle bundle) {
        super.setExtraData(bundle);
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public void setTimeoutTick(long j2) {
        super.setTimeoutTick(j2);
        this.mTimeoutTick = j2;
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting
    public String toString() {
        StringBuilder sbA = zqm.a("ONetAdvertiseSetting {mAdvertiseSetting= {mAdvertiseType=");
        sbA.append(getAdvertiseType());
        sbA.append(", mAdvertiseMode=");
        sbA.append(getModeStr(this.mAdvertiseSetting));
        sbA.append(", mConnectType=");
        sbA.append(getConnectType());
        sbA.append(", mDurationMillis=");
        sbA.append(getDurationMillis());
        sbA.append(", mKeyType=");
        sbA.append(getKeyType());
        sbA.append(", mGoIntent=");
        sbA.append((int) getGoIntent());
        sbA.append(", mPort=");
        sbA.append(getPort());
        sbA.append(", mMajor=");
        sbA.append(getMajor());
        sbA.append(", mModelId=");
        sbA.append(wpg.e(Arrays.toString(getModelId())));
        sbA.append(", mNickName=");
        sbA.append(Arrays.toString(getNickName()));
        sbA.append(", mAdditionData=");
        sbA.append(Arrays.toString(getAdditionData()));
        sbA.append("}, mTimeoutTick=");
        sbA.append(this.mTimeoutTick);
        sbA.append(", mClientId=");
        sbA.append(this.mClientId);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // com.oplus.onet.wrapper.ONetAdvertiseSetting, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mAdvertiseSetting, i);
    }

    public static String getModeStr(AdvertiseSetting advertiseSetting) {
        int advertiseMode = advertiseSetting.getAdvertiseMode();
        if (advertiseMode == 0) {
            return ONetAdvertiseSetting.MODE_LOW_POWER;
        }
        if (advertiseMode != 1) {
            return advertiseMode != 2 ? ONetAdvertiseSetting.MODE_NOT_SET : ONetAdvertiseSetting.MODE_LOW_LATENCY;
        }
        return ONetAdvertiseSetting.MODE_BALANCED;
    }

    public ONetAdvertiseSettingExtend(Parcel parcel) {
        this.mAdvertiseSetting = (AdvertiseSetting) parcel.readParcelable(AdvertiseSetting.class.getClassLoader());
    }
}
