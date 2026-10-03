package com.oplus.onet.wrapper;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.bean.AdvertiseSetting;
import com.oplus.aiunit.vision.d3d;
import com.oplus.aiunit.vision.h0n;
import com.oplus.aiunit.vision.wpg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class ONetAdvertiseSetting implements Parcelable {
    public static final int ADVERTISE_MODE_BALANCED = 1;
    public static final int ADVERTISE_MODE_LOW_LATENCY = 2;
    public static final int ADVERTISE_MODE_LOW_POWER = 0;
    public static final int ADVERTISE_TYPE_FASTDISCOVERY = 0;
    public static final int ADVERTISE_TYPE_FASTPAIR_ACCOUNT = 2;
    public static final int ADVERTISE_TYPE_FASTPAIR_DEVICEID = 4;
    public static final int ADVERTISE_TYPE_FASTPAIR_MODELID = 1;
    public static final int ADVERTISE_TYPE_SENSELESS = 20;
    public static final Parcelable.Creator<ONetAdvertiseSetting> CREATOR = new a();
    public static final int FAST_PAIR_RECONNECTION_MODE_DIALOG_ALL = 0;
    public static final int FAST_PAIR_RECONNECTION_MODE_DIALOG_CUSTOM = 4;
    public static final int FAST_PAIR_RECONNECTION_MODE_DIALOG_RECENT = 1;
    public static final int FAST_PAIR_RECONNECTION_MODE_SILENT_ALL = 2;
    public static final int FAST_PAIR_RECONNECTION_MODE_SILENT_CUSTOM = 5;
    public static final int FAST_PAIR_RECONNECTION_MODE_SILENT_RECENT = 3;
    public static final byte GO_INTENT_MAX = 15;
    public static final byte GO_INTENT_MIN = 0;
    public static final byte GO_INTENT_NOT_SET = -1;
    public static final byte GO_INTENT_PHONE_DEFAULT = 8;
    public static final int LIMITED_ADVETISING_MAX_MILLIS = 10800000;
    private static final int LIMITED_MODELID_LENGTH = 3;
    private static final int LIMITED_NICKNAME_LENGTH = 9;
    public static final String MODE_BALANCED = "BALANCED";
    public static final String MODE_LOW_LATENCY = "LOW_LATENCY";
    public static final String MODE_LOW_POWER = "LOW_POWER";
    public static final String MODE_NOT_SET = "NOT-SET";
    public static final int SECURE_KEY_TYPE_PRESET = 1;
    public static final int SECURE_KEY_TYPE_UKEY2_INVISIBLE = 2;
    public static final String TAG = "ONetAdvertiseSetting";
    private byte[] mAdditionData;
    private int mAdvertiseMode;
    private int mAdvertiseType;
    private transient int mClientId;
    private int mConnectType;
    private long mDurationMillis;
    private Bundle mExtraData;
    private byte mGoIntent;
    private boolean mIsAdvCancelled;
    private int mKeyType;
    private int mLimitedDuration;
    private int mMajor;
    private byte[] mModelId;
    private byte[] mNickName;
    private int mOldVersionConnectType;
    private int mPort;
    private ArrayList<byte[]> mReconnectDeviceIdList;
    private int mReconnectionMode;
    private int mScanType;
    private transient long mTimeoutTick;

    public class a implements Parcelable.Creator<ONetAdvertiseSetting> {
        @Override // android.os.Parcelable.Creator
        public final ONetAdvertiseSetting createFromParcel(Parcel parcel) {
            return new ONetAdvertiseSetting(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ONetAdvertiseSetting[] newArray(int i) {
            return new ONetAdvertiseSetting[i];
        }
    }

    public /* synthetic */ ONetAdvertiseSetting(int i, int i2, int i3, long j2, int i4, byte[] bArr, byte[] bArr2, byte[] bArr3, byte b, int i5, int i6, int i7, int i8, boolean z, int i9, ArrayList arrayList, a aVar) {
        this(i, i2, i3, j2, i4, bArr, bArr2, bArr3, b, i5, i6, i7, i8, z, i9, arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getAdditionData() {
        return this.mAdditionData;
    }

    public int getAdvertiseMode() {
        return this.mAdvertiseMode;
    }

    public AdvertiseSetting getAdvertiseSetting() {
        AdvertiseSetting.Builder builder = new AdvertiseSetting.Builder();
        builder.setAdvertiseType(getAdvertiseType()).setConnectType(getConnectType()).setKeyType(getKeyType()).setModelId(getModelId()).setNickName(getNickName()).setAdditionData(getAdditionData()).setGoIntent(getGoIntent()).setPort(getPort()).setMajor(getMajor()).setAdvertiseMode(getAdvertiseMode());
        boolean z = h0n.a(1010342) >= 0 && h0n.a(1020000) < 0;
        boolean z2 = h0n.a(1010341) >= 0 && h0n.a(1020000) < 0;
        if (h0n.b() || h0n.a(1020058) >= 0 || z) {
            long durationMillis = getDurationMillis();
            int durationMillis2 = this.mLimitedDuration;
            if (durationMillis <= durationMillis2) {
                durationMillis2 = (int) getDurationMillis();
            }
            builder.setDurationMillis(durationMillis2);
        } else {
            builder.setDurationMillis((int) getDurationMillis());
        }
        if (h0n.b()) {
            builder.setScanType(getScanType()).setReconnectionMode(getReconnectionMode()).setIsCancelAdv(isAdvCancelled());
            if (getOldVersionConnectType() != 0) {
                builder.setOldVersionConnectType(getOldVersionConnectType());
            }
            if (getReconnectDeviceIdList() != null && getReconnectDeviceIdList().size() != 0) {
                builder.setReconnectionMode(getReconnectionMode(), getReconnectDeviceIdList());
            }
            d3d.i(TAG, "The service side does not need to do version judgment.");
        } else if (h0n.a(1020040) >= 0) {
            String str = TAG;
            d3d.i(str, "Version range [1.2.040, 1.2.054] added parameter mScanType.");
            builder.setScanType(getScanType());
            if (h0n.a(1020054) > 0) {
                builder.setReconnectionMode(getReconnectionMode()).setIsCancelAdv(isAdvCancelled());
                d3d.i(str, "Version range [1.2.055, 1.2.999] added parameters mReconnectionMode and mIsAdvCancelled.");
                if (h0n.a(13001000) >= 0) {
                    if (getOldVersionConnectType() != 0) {
                        builder.setOldVersionConnectType(getOldVersionConnectType());
                        d3d.i(str, "Version range [13.1.000, 13.1.999] added parameter mOldVersionConnectType .");
                    }
                    if (getReconnectDeviceIdList() != null && getReconnectDeviceIdList().size() != 0) {
                        builder.setReconnectionMode(getReconnectionMode(), getReconnectDeviceIdList());
                        d3d.i(str, "Version range [13.1.000, 13.1.999] added parameter mReconnectDeviceIdList.");
                    }
                }
            } else {
                d3d.i(str, "There are no special differences in versions, no additional builder.set is required");
            }
        } else if (z2) {
            builder.setReconnectionMode(getReconnectionMode()).setIsCancelAdv(isAdvCancelled());
            d3d.i(TAG, "Version range [1.1.341, 1.1.999] added parameters mReconnectionMode and mIsAdvCancelled.");
        } else {
            d3d.i(TAG, "There are no special differences in versions, no additional builder.set is required");
        }
        return builder.build();
    }

    public int getAdvertiseType() {
        return this.mAdvertiseType;
    }

    public int getClientId() {
        return this.mClientId;
    }

    public int getConnectType() {
        return this.mConnectType;
    }

    public long getDurationMillis() {
        return this.mDurationMillis;
    }

    public Bundle getExtraData() {
        return this.mExtraData;
    }

    public byte getGoIntent() {
        return this.mGoIntent;
    }

    public int getKeyType() {
        return this.mKeyType;
    }

    public int getMajor() {
        return this.mMajor;
    }

    public String getModeStr() {
        int advertiseMode = getAdvertiseMode();
        if (advertiseMode == 0) {
            return MODE_LOW_POWER;
        }
        if (advertiseMode != 1) {
            return advertiseMode != 2 ? MODE_NOT_SET : MODE_LOW_LATENCY;
        }
        return MODE_BALANCED;
    }

    public byte[] getModelId() {
        return this.mModelId;
    }

    public byte[] getNickName() {
        return this.mNickName;
    }

    public int getOldVersionConnectType() {
        return this.mOldVersionConnectType;
    }

    public int getPort() {
        return this.mPort;
    }

    public ArrayList<byte[]> getReconnectDeviceIdList() {
        return this.mReconnectDeviceIdList;
    }

    public int getReconnectionMode() {
        return this.mReconnectionMode;
    }

    public int getScanType() {
        return this.mScanType;
    }

    public long getTimeoutTick() {
        return this.mTimeoutTick;
    }

    public boolean isAdvCancelled() {
        return this.mIsAdvCancelled;
    }

    public boolean isTimeout() {
        return System.currentTimeMillis() > this.mTimeoutTick;
    }

    public void setClientId(int i) {
        this.mClientId = i;
    }

    public void setExtraData(Bundle bundle) {
        this.mExtraData = bundle;
    }

    public void setLimitedDuration(int i) {
        if (i >= 0) {
            this.mLimitedDuration = i;
        }
    }

    public void setOldVersionConnectType(int i) {
        this.mOldVersionConnectType = i;
    }

    public void setTimeoutTick(long j2) {
        this.mTimeoutTick = j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ONetAdvertiseSetting { mAdvertiseSetting= {");
        sb.append("mAdvertiseType=");
        sb.append(this.mAdvertiseType);
        sb.append(", mAdvertiseMode=");
        sb.append(getModeStr());
        sb.append(", mConnectType=");
        sb.append(this.mConnectType);
        sb.append(", mScanType=");
        sb.append(this.mScanType);
        sb.append(", mDurationMillis=");
        sb.append(this.mDurationMillis);
        sb.append(", mKeyType=");
        sb.append(this.mKeyType);
        sb.append(", mGoIntent=");
        sb.append((int) this.mGoIntent);
        sb.append(", mPort=");
        sb.append(this.mPort);
        sb.append(", mMajor=");
        sb.append(this.mMajor);
        sb.append(", mModelId=");
        sb.append(wpg.e(Arrays.toString(getModelId())));
        sb.append(", mNickName=");
        sb.append(Arrays.toString(this.mNickName));
        sb.append(", mAdditionData=");
        sb.append(Arrays.toString(this.mAdditionData));
        sb.append(", mReconnectionMode=");
        sb.append(this.mReconnectionMode);
        sb.append(", mIsAdvCancelled=");
        sb.append(this.mIsAdvCancelled);
        sb.append(", mReconnectDeviceIdList= [");
        if (getReconnectDeviceIdList() != null && getReconnectDeviceIdList().size() > 0) {
            Iterator<byte[]> it = getReconnectDeviceIdList().iterator();
            while (it.hasNext()) {
                sb.append(wpg.g(it.next()));
            }
        }
        sb.append("]}, mTimeoutTick=");
        sb.append(this.mTimeoutTick);
        sb.append(", mClientId=");
        sb.append(this.mClientId);
        sb.append(", mOldVersionConnectType=");
        sb.append(this.mOldVersionConnectType);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mAdvertiseType);
        parcel.writeInt(this.mConnectType);
        boolean z = false;
        boolean z2 = h0n.b() || h0n.a(1020040) >= 0;
        String str = TAG;
        d3d.b(str, "writeToParcel:is1211AndGt12040=" + z2);
        if (z2) {
            parcel.writeInt(this.mScanType);
        }
        parcel.writeLong(this.mDurationMillis);
        parcel.writeInt(this.mKeyType);
        parcel.writeByteArray(this.mModelId);
        parcel.writeByteArray(this.mNickName);
        parcel.writeByteArray(this.mAdditionData);
        parcel.writeByte(this.mGoIntent);
        parcel.writeInt(this.mPort);
        parcel.writeInt(this.mMajor);
        parcel.writeInt(this.mAdvertiseMode);
        if (z2) {
            parcel.writeBundle(this.mExtraData);
        }
        boolean z3 = h0n.b() || h0n.a(1020054) > 0;
        if (h0n.a(1010341) >= 0 && h0n.a(1020000) < 0) {
            z = true;
        }
        d3d.b(str, "writeToParcel:is1211AndGt12054=" + z3 + ", is121AndGt11341=" + z);
        if (z3 || z) {
            parcel.writeInt(this.mReconnectionMode);
            parcel.writeBoolean(this.mIsAdvCancelled);
        } else {
            d3d.b(str, "writeToParcel:mReconnectionMode and mIsAdvCancelled do not need to be serialized");
        }
        if (h0n.b() || h0n.a(13001000) >= 0) {
            parcel.writeInt(this.mOldVersionConnectType);
            parcel.writeList(this.mReconnectDeviceIdList);
        }
    }

    public ONetAdvertiseSetting() {
        this.mExtraData = new Bundle();
        this.mLimitedDuration = 0;
        this.mReconnectDeviceIdList = new ArrayList<>();
    }

    private ONetAdvertiseSetting(int i, int i2, int i3, long j2, int i4, byte[] bArr, byte[] bArr2, byte[] bArr3, byte b, int i5, int i6, int i7, int i8, boolean z, int i9, ArrayList<byte[]> arrayList) {
        this.mExtraData = new Bundle();
        this.mLimitedDuration = 0;
        new ArrayList();
        this.mAdvertiseType = i;
        this.mConnectType = i2;
        this.mDurationMillis = j2;
        this.mScanType = i3;
        this.mKeyType = i4;
        this.mModelId = bArr;
        this.mNickName = bArr2;
        this.mAdditionData = bArr3;
        this.mGoIntent = b;
        this.mPort = i5;
        this.mMajor = i6;
        this.mAdvertiseMode = i7;
        this.mReconnectionMode = i8;
        this.mIsAdvCancelled = z;
        this.mOldVersionConnectType = i9;
        this.mReconnectDeviceIdList = arrayList;
    }

    public ONetAdvertiseSetting(Parcel parcel) {
        this.mExtraData = new Bundle();
        boolean z = false;
        this.mLimitedDuration = 0;
        this.mReconnectDeviceIdList = new ArrayList<>();
        this.mAdvertiseType = parcel.readInt();
        this.mConnectType = parcel.readInt();
        boolean z2 = h0n.b() || h0n.a(1020040) >= 0;
        String str = TAG;
        d3d.b(str, "ONetAdvertiseSetting:is1211AndGt12040=" + z2);
        if (z2) {
            this.mScanType = parcel.readInt();
        }
        this.mDurationMillis = parcel.readLong();
        this.mKeyType = parcel.readInt();
        this.mModelId = parcel.createByteArray();
        this.mNickName = parcel.createByteArray();
        this.mAdditionData = parcel.createByteArray();
        this.mGoIntent = parcel.readByte();
        this.mPort = parcel.readInt();
        this.mMajor = parcel.readInt();
        this.mAdvertiseMode = parcel.readInt();
        if (z2) {
            this.mExtraData = parcel.readBundle();
        }
        boolean z3 = h0n.b() || h0n.a(1020054) > 0;
        if (h0n.a(1010341) >= 0 && h0n.a(1020000) < 0) {
            z = true;
        }
        d3d.b(str, "ONetAdvertiseSetting:is1211AndGt12054=" + z3 + ", is121AndGt11341=" + z);
        if (!z3 && !z) {
            d3d.b(str, "ONetAdvertiseSetting:mReconnectionMode and mIsAdvCancelled do not need to be serialized");
        } else {
            this.mReconnectionMode = parcel.readInt();
            this.mIsAdvCancelled = parcel.readBoolean();
        }
        if (h0n.b() || h0n.a(13001000) >= 0) {
            this.mOldVersionConnectType = parcel.readInt();
            ArrayList<byte[]> arrayList = new ArrayList<>();
            this.mReconnectDeviceIdList = arrayList;
            parcel.readList(arrayList, byte[].class.getClassLoader());
        }
    }
}
