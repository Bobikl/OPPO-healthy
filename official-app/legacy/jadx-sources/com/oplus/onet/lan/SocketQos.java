package com.oplus.onet.lan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.d3d;
import com.oplus.aiunit.vision.wpg;
import com.oplus.aiunit.vision.zqm;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class SocketQos implements Parcelable {
    public static final Parcelable.Creator<SocketQos> CREATOR = new a();
    private static final String TAG = "SocketQos";

    @SerializedName("bandWidth")
    private int mBandWidth;

    @SerializedName(ClickApiEntity.DELAY)
    private int mDelay;

    @SerializedName("packetLossRate")
    private int mPacketLossRate;

    @SerializedName("ip")
    private String mPeerIp;

    @SerializedName("remoteRssi")
    private int mRemoteRssi;

    @SerializedName(ServiceNodeBundleKeys.RSSI)
    private int mRssi;

    @SerializedName("socketState")
    private SocketState mSocketState;

    public class a implements Parcelable.Creator<SocketQos> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SocketQos createFromParcel(Parcel parcel) {
            return new SocketQos(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SocketQos[] newArray(int i) {
            return new SocketQos[i];
        }
    }

    public SocketQos(int i, int i2, int i3, SocketState socketState, String str, int i4) {
        this.mBandWidth = 16384;
        this.mDelay = 1000;
        this.mPacketLossRate = 100;
        this.mRssi = -70;
        SocketState socketState2 = SocketState.SOCKET_INVALID;
        this.mRemoteRssi = -70;
        this.mBandWidth = i;
        this.mDelay = i2;
        this.mPacketLossRate = i3;
        this.mSocketState = socketState;
        this.mPeerIp = str;
        this.mRssi = i4;
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
        SocketQos socketQos = (SocketQos) obj;
        return this.mSocketState == socketQos.mSocketState && Objects.equals(this.mPeerIp, socketQos.mPeerIp) && Objects.equals(Integer.valueOf(this.mRssi), Integer.valueOf(socketQos.mRssi));
    }

    public int getBandWidth() {
        return this.mBandWidth;
    }

    public int getDelay() {
        return this.mDelay;
    }

    public int getPacketLossRate() {
        return this.mPacketLossRate;
    }

    public String getPeerIp() {
        return this.mPeerIp;
    }

    public int getRemoteRssi() {
        return this.mRemoteRssi;
    }

    public int getRssi() {
        return this.mRssi;
    }

    public SocketState getSocketState() {
        return this.mSocketState;
    }

    public int hashCode() {
        return Objects.hash(this.mSocketState, this.mPeerIp, Integer.valueOf(this.mRssi));
    }

    public void readFromParcel(Parcel parcel) {
        this.mBandWidth = parcel.readInt();
        this.mDelay = parcel.readInt();
        this.mPacketLossRate = parcel.readInt();
        this.mRssi = parcel.readInt();
        this.mRemoteRssi = parcel.readInt();
        this.mPeerIp = parcel.readString();
        this.mSocketState = SocketState.values()[parcel.readInt()];
    }

    public void setBandWidth(int i) {
        this.mBandWidth = i;
    }

    public void setDelay(int i) {
        this.mDelay = i;
    }

    public void setPacketLossRate(int i) {
        this.mPacketLossRate = i;
    }

    public void setPeerIp(String str) {
        this.mPeerIp = str;
    }

    public void setRemoteRssi(int i) {
        this.mRemoteRssi = i;
    }

    public void setRssi(int i) {
        this.mRssi = i;
    }

    public void setSocketState(SocketState socketState) {
        StringBuilder sbA = zqm.a("setSocketState, original state=");
        sbA.append(this.mSocketState.getString());
        sbA.append(", new state=");
        sbA.append(socketState.getString());
        d3d.b(TAG, sbA.toString());
        this.mSocketState = socketState;
    }

    public String toString() {
        StringBuilder sbA = zqm.a("SocketQos{mBandWidth=");
        sbA.append(this.mBandWidth);
        sbA.append(", mDelay=");
        sbA.append(this.mDelay);
        sbA.append(", mPacketLossRate=");
        sbA.append(this.mPacketLossRate);
        sbA.append(", mSocketState=");
        sbA.append(this.mSocketState.getString());
        sbA.append(", mRssi=");
        sbA.append(this.mRssi);
        sbA.append(", mRemoteRssi=");
        sbA.append(this.mRemoteRssi);
        sbA.append(", mAddr='");
        sbA.append(wpg.e(this.mPeerIp));
        sbA.append('\'');
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mBandWidth);
        parcel.writeInt(this.mDelay);
        parcel.writeInt(this.mPacketLossRate);
        parcel.writeInt(this.mRssi);
        parcel.writeInt(this.mRemoteRssi);
        parcel.writeString(this.mPeerIp);
        parcel.writeInt(this.mSocketState.ordinal());
    }

    public SocketQos(int i, int i2, int i3, SocketState socketState, String str) {
        this.mBandWidth = 16384;
        this.mDelay = 1000;
        this.mPacketLossRate = 100;
        this.mRssi = -70;
        SocketState socketState2 = SocketState.SOCKET_INVALID;
        this.mRemoteRssi = -70;
        this.mBandWidth = i;
        this.mDelay = i2;
        this.mPacketLossRate = i3;
        this.mSocketState = socketState;
        this.mPeerIp = str;
    }

    public SocketQos(int i, int i2, int i3, SocketState socketState) {
        this.mBandWidth = 16384;
        this.mDelay = 1000;
        this.mPacketLossRate = 100;
        this.mRssi = -70;
        SocketState socketState2 = SocketState.SOCKET_INVALID;
        this.mPeerIp = "";
        this.mRemoteRssi = -70;
        this.mBandWidth = i;
        this.mDelay = i2;
        this.mPacketLossRate = i3;
        this.mSocketState = socketState;
    }

    public SocketQos(SocketQos socketQos) {
        this.mBandWidth = 16384;
        this.mDelay = 1000;
        this.mPacketLossRate = 100;
        this.mRssi = -70;
        this.mSocketState = SocketState.SOCKET_INVALID;
        this.mPeerIp = "";
        this.mRemoteRssi = -70;
        this.mBandWidth = socketQos.getBandWidth();
        this.mDelay = socketQos.getDelay();
        this.mPacketLossRate = socketQos.getPacketLossRate();
        this.mSocketState = socketQos.getSocketState();
        this.mPeerIp = socketQos.getPeerIp();
        this.mRssi = socketQos.getRssi();
        this.mRemoteRssi = socketQos.getRemoteRssi();
    }

    public SocketQos(Parcel parcel) {
        this.mBandWidth = 16384;
        this.mDelay = 1000;
        this.mPacketLossRate = 100;
        this.mRssi = -70;
        this.mSocketState = SocketState.SOCKET_INVALID;
        this.mPeerIp = "";
        this.mRemoteRssi = -70;
        this.mBandWidth = parcel.readInt();
        this.mDelay = parcel.readInt();
        this.mPacketLossRate = parcel.readInt();
        this.mRssi = parcel.readInt();
        this.mRemoteRssi = parcel.readInt();
        this.mPeerIp = parcel.readString();
        this.mSocketState = SocketState.values()[parcel.readInt()];
    }

    public SocketQos() {
        this.mBandWidth = 16384;
        this.mDelay = 1000;
        this.mPacketLossRate = 100;
        this.mRssi = -70;
        this.mSocketState = SocketState.SOCKET_INVALID;
        this.mPeerIp = "";
        this.mRemoteRssi = -70;
    }
}
