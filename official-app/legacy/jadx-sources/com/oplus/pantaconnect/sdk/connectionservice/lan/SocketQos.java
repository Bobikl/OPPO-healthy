package com.oplus.pantaconnect.sdk.connectionservice.lan;

import android.os.Parcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class SocketQos {
    private int mBandWidth;
    private int mDelay;
    private int mPacketLossRate;
    private String mPeerIp;
    private int mRemoteRssi;
    private int mRssi;
    private SocketState mSocketState;

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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SocketQos socketQos = (SocketQos) obj;
        return this.mSocketState == socketQos.mSocketState && Objects.equals(this.mPeerIp, socketQos.mPeerIp) && Integer.valueOf(this.mRssi).equals(Integer.valueOf(socketQos.mRssi));
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
        this.mSocketState = socketState;
    }

    public String toString() {
        return "SocketQos{mBandWidth=" + this.mBandWidth + ", mDelay=" + this.mDelay + ", mPacketLossRate=" + this.mPacketLossRate + ", mSocketState=" + this.mSocketState.getString() + ", mRssi=" + this.mRssi + ", mRemoteRssi=" + this.mRemoteRssi + '}';
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
