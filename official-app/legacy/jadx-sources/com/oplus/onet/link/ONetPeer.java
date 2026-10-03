package com.oplus.onet.link;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.wpg;
import com.oplus.aiunit.vision.zqm;

/* JADX INFO: loaded from: classes8.dex */
public class ONetPeer implements Parcelable {
    public static final int CONNECTION_TYPE_AP = 16;
    public static final int CONNECTION_TYPE_AUTO = 255;
    public static final int CONNECTION_TYPE_BLE = 4;
    public static final int CONNECTION_TYPE_BT = 1;
    public static final int CONNECTION_TYPE_DEBUG = 1000;
    public static final int CONNECTION_TYPE_P2P = 2;
    public static final int CONNECTION_TYPE_PAIRED = 1002;
    public static final int CONNECTION_TYPE_PAIRING = 1001;
    public static final Parcelable.Creator<ONetPeer> CREATOR = new a();
    public static final int LINK_MODE_OAF = 1;
    public static final int LINK_MODE_ONET = 2;
    public static final int LINK_STATE_CONNECTED = 2;
    public static final int LINK_STATE_CONNECTING = 1;
    public static final int LINK_STATE_DISCONNECTED = 4;
    public static final int LINK_STATE_DISCONNECTING = 3;
    public static final String TAG = "ONetPeer";
    private String mApIpAddress;
    private String mBleMacAddress;
    private String mBtMacAddress;
    private int mConnectionType;
    private String mDeviceName;
    private int mLinkState;
    private int mLinkType;
    private String mLocalIpAddress;
    private String mP2pIpAddress;
    private String mP2pMacAddress;
    private String mSsid;

    public class a implements Parcelable.Creator<ONetPeer> {
        @Override // android.os.Parcelable.Creator
        public final ONetPeer createFromParcel(Parcel parcel) {
            return new ONetPeer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ONetPeer[] newArray(int i) {
            return new ONetPeer[i];
        }
    }

    public ONetPeer() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getApIpAddress() {
        return this.mApIpAddress;
    }

    public String getBleMacAddress() {
        return this.mBleMacAddress;
    }

    public String getBtMacAddress() {
        return this.mBtMacAddress;
    }

    public String getDeviceName() {
        return this.mDeviceName;
    }

    public int getLinkState() {
        return this.mLinkState;
    }

    public int getLinkType() {
        return this.mLinkType;
    }

    public String getLocalIpAddress() {
        return this.mLocalIpAddress;
    }

    public String getP2pIpAddress() {
        return this.mP2pIpAddress;
    }

    public String getP2pMacAddress() {
        return this.mP2pMacAddress;
    }

    public String getSsid() {
        return this.mSsid;
    }

    public int getTransportType() {
        return this.mConnectionType;
    }

    public void readFromParcel(Parcel parcel) {
        this.mLocalIpAddress = parcel.readString();
        this.mP2pIpAddress = parcel.readString();
        this.mApIpAddress = parcel.readString();
        this.mP2pMacAddress = parcel.readString();
        this.mDeviceName = parcel.readString();
        this.mBleMacAddress = parcel.readString();
        this.mBtMacAddress = parcel.readString();
        this.mConnectionType = parcel.readInt();
        this.mSsid = parcel.readString();
        this.mLinkState = parcel.readInt();
        this.mLinkType = parcel.readInt();
    }

    public void setApIpAddress(String str) {
        this.mApIpAddress = str;
    }

    public void setBleMacAddress(String str) {
        this.mBleMacAddress = str;
    }

    public void setBtMacAddress(String str) {
        this.mBtMacAddress = str;
    }

    public void setDeviceName(String str) {
        this.mDeviceName = str;
    }

    public void setLinkState(int i) {
        this.mLinkState = i;
    }

    public void setLinkType(int i) {
        this.mLinkType = i;
    }

    public void setLocalIpAddress(String str) {
        this.mLocalIpAddress = str;
    }

    public void setP2pIpAddress(String str) {
        this.mP2pIpAddress = str;
    }

    public void setP2pMacAddress(String str) {
        this.mP2pMacAddress = str;
    }

    public void setSsid(String str) {
        this.mSsid = str;
    }

    public void setTransportType(int i) {
        this.mConnectionType = i;
    }

    public String toString() {
        StringBuilder sbA = zqm.a("ONetPeer{mLocalIpAddress='");
        sbA.append(wpg.e(this.mLocalIpAddress));
        sbA.append('\'');
        sbA.append(", mP2pIpAddress='");
        sbA.append(wpg.e(this.mP2pIpAddress));
        sbA.append('\'');
        sbA.append(", mApIpAddress='");
        sbA.append(wpg.e(this.mApIpAddress));
        sbA.append('\'');
        sbA.append(", mP2pMcAddress='");
        sbA.append(wpg.e(this.mP2pMacAddress));
        sbA.append('\'');
        sbA.append(", mRemotePeerName='");
        sbA.append(this.mDeviceName);
        sbA.append('\'');
        sbA.append(", mBleMcAddress='");
        sbA.append(wpg.e(this.mBleMacAddress));
        sbA.append('\'');
        sbA.append(", mBtMcAddress='");
        sbA.append(wpg.e(this.mBtMacAddress));
        sbA.append('\'');
        sbA.append(", mConnectionType=");
        sbA.append(this.mConnectionType);
        sbA.append(", mSsd='");
        sbA.append(this.mSsid);
        sbA.append('\'');
        sbA.append(", mLinkState=");
        sbA.append(this.mLinkState);
        sbA.append(", mLinkType=");
        sbA.append(this.mLinkType);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mLocalIpAddress);
        parcel.writeString(this.mP2pIpAddress);
        parcel.writeString(this.mApIpAddress);
        parcel.writeString(this.mP2pMacAddress);
        parcel.writeString(this.mDeviceName);
        parcel.writeString(this.mBleMacAddress);
        parcel.writeString(this.mBtMacAddress);
        parcel.writeInt(this.mConnectionType);
        parcel.writeString(this.mSsid);
        parcel.writeInt(this.mLinkState);
        parcel.writeInt(this.mLinkType);
    }

    public ONetPeer(Parcel parcel) {
        this.mLocalIpAddress = parcel.readString();
        this.mP2pIpAddress = parcel.readString();
        this.mApIpAddress = parcel.readString();
        this.mP2pMacAddress = parcel.readString();
        this.mDeviceName = parcel.readString();
        this.mBleMacAddress = parcel.readString();
        this.mBtMacAddress = parcel.readString();
        this.mConnectionType = parcel.readInt();
        this.mSsid = parcel.readString();
        this.mLinkState = parcel.readInt();
        this.mLinkType = parcel.readInt();
    }
}
