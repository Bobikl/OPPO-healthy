package com.oplus.onet.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.wpg;
import com.oplus.aiunit.vision.zqm;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes8.dex */
public class GenericDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<GenericDeviceInfo> CREATOR = new a();
    private byte[] mAlias;
    private int mConnectionType;
    private byte[] mDeviceId;
    private int mDeviceRole;
    private int mDeviceSubType;
    private int mDeviceType;
    private byte[] mExtraData;
    private String mName;
    private byte[] mNickName;
    private int mPairState;
    private int mScanType;
    private int mSignalStrength;
    private String mTag;

    public class a implements Parcelable.Creator<GenericDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        public final GenericDeviceInfo createFromParcel(Parcel parcel) {
            return new GenericDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GenericDeviceInfo[] newArray(int i) {
            return new GenericDeviceInfo[i];
        }
    }

    public GenericDeviceInfo(ONetDevice oNetDevice) {
        this.mScanType = oNetDevice.getScanType();
        String tag = oNetDevice.getTag();
        this.mTag = tag;
        if (tag == null || tag.isEmpty()) {
            this.mTag = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss:SSS"));
        }
        byte[] dvd = oNetDevice.getDvd();
        this.mDeviceId = dvd;
        if (dvd == null || dvd.length <= 0) {
            this.mDeviceId = this.mTag.getBytes(StandardCharsets.UTF_8);
        }
        String peerDeviceName = oNetDevice.getPeerDeviceName();
        this.mName = peerDeviceName;
        if (peerDeviceName == null || peerDeviceName.isEmpty()) {
            this.mName = getArtificialName(this.mTag);
        }
    }

    public static String getArtificialName(String str) {
        StringBuilder sbA = zqm.a("name_");
        sbA.append(wpg.e(str));
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getAlias() {
        return this.mAlias;
    }

    public int getConnectionType() {
        return this.mConnectionType;
    }

    public int getDeviceRole() {
        return this.mDeviceRole;
    }

    public int getDeviceSubType() {
        return this.mDeviceSubType;
    }

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public byte[] getDvd() {
        return this.mDeviceId;
    }

    public byte[] getExtraData() {
        return this.mExtraData;
    }

    public String getName() {
        return this.mName;
    }

    public byte[] getNickName() {
        return this.mNickName;
    }

    public int getPairState() {
        return this.mPairState;
    }

    public int getScanType() {
        return this.mScanType;
    }

    public int getSignalStrength() {
        return this.mSignalStrength;
    }

    public String getTag() {
        return this.mTag;
    }

    public void readFromParcel(Parcel parcel) {
        this.mTag = parcel.readString();
        this.mName = parcel.readString();
        this.mNickName = parcel.createByteArray();
        this.mPairState = parcel.readInt();
        this.mDeviceRole = parcel.readInt();
        this.mConnectionType = parcel.readInt();
        this.mScanType = parcel.readInt();
        this.mDeviceType = parcel.readInt();
        this.mDeviceSubType = parcel.readInt();
        this.mSignalStrength = parcel.readInt();
        this.mDeviceId = parcel.createByteArray();
        this.mExtraData = parcel.createByteArray();
        this.mAlias = parcel.createByteArray();
    }

    public void setAlias(byte[] bArr) {
        this.mAlias = bArr;
    }

    public void setConnectionType(int i) {
        this.mConnectionType = i;
    }

    public void setDeviceId(byte[] bArr) {
        this.mDeviceId = bArr;
    }

    public void setDeviceRole(int i) {
        this.mDeviceRole = i;
    }

    public void setDeviceSubType(int i) {
        this.mDeviceSubType = i;
    }

    public void setDeviceType(int i) {
        this.mDeviceType = i;
    }

    public void setExtraData(byte[] bArr) {
        this.mExtraData = bArr;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setNickName(byte[] bArr) {
        this.mNickName = bArr;
    }

    public void setPairState(int i) {
        this.mPairState = i;
    }

    public void setScanType(int i) {
        this.mScanType = i;
    }

    public void setSignalStrength(int i) {
        this.mSignalStrength = i;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTag);
        parcel.writeString(this.mName);
        parcel.writeByteArray(this.mNickName);
        parcel.writeInt(this.mPairState);
        parcel.writeInt(this.mDeviceRole);
        parcel.writeInt(this.mConnectionType);
        parcel.writeInt(this.mScanType);
        parcel.writeInt(this.mDeviceType);
        parcel.writeInt(this.mDeviceSubType);
        parcel.writeInt(this.mSignalStrength);
        parcel.writeByteArray(this.mDeviceId);
        parcel.writeByteArray(this.mExtraData);
        parcel.writeByteArray(this.mAlias);
    }

    public GenericDeviceInfo(Parcel parcel) {
        this.mTag = parcel.readString();
        this.mName = parcel.readString();
        this.mNickName = parcel.createByteArray();
        this.mPairState = parcel.readInt();
        this.mDeviceRole = parcel.readInt();
        this.mConnectionType = parcel.readInt();
        this.mScanType = parcel.readInt();
        this.mDeviceType = parcel.readInt();
        this.mDeviceSubType = parcel.readInt();
        this.mSignalStrength = parcel.readInt();
        this.mDeviceId = parcel.createByteArray();
        this.mExtraData = parcel.createByteArray();
        this.mAlias = parcel.createByteArray();
    }
}
