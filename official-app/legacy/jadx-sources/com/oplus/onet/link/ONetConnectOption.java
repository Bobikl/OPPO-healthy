package com.oplus.onet.link;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.utils.XmlReader;
import com.oplus.aiunit.vision.d3d;
import com.oplus.aiunit.vision.h0n;
import com.oplus.aiunit.vision.zqm;

/* JADX INFO: loaded from: classes8.dex */
public class ONetConnectOption implements Parcelable {
    public static final int CHANNEL_TYPE_LOGICAL = 0;
    public static final int CHANNEL_TYPE_PHYSICAL = 1;
    public static final int CONNECTION_TYPE_AP = 16;
    public static final int CONNECTION_TYPE_AUTO = 255;
    public static final int CONNECTION_TYPE_BLE = 4;
    public static final int CONNECTION_TYPE_BT = 1;
    public static final int CONNECTION_TYPE_BT_INSECURE = 32;
    public static final int CONNECTION_TYPE_P2P = 2;
    public static final int CONNECTION_TYPE_UNKNOWN = 0;
    public static final String CONNECT_BT_RESUME_ADDRESS = "connect_bt_resume_address";
    public static final String CONNECT_CONNECT_P2P_IS_FORCED = "onet_connect_p2p_is_forced";
    public static final String CONNECT_IS_SENSELESS = "onet_connect_is_senseless";
    public static final Parcelable.Creator<ONetConnectOption> CREATOR = new a();
    public static final String DISCONNECT_IS_ACTIVE = "onet_disconnect_is_active";
    public static final String DISCONNECT_IS_BLACKLIST = "onet_disconnect_is_blacklist";
    public static final int IOT_DATA_CHANNEL = 2;
    public static final int MATTER_DATA_CHANNEL = 4;
    public static final int OAF_DATA_CHANNEL = 1;
    public static final int OCAR_DATA_CHANNEL = 8;
    public static final int PROTOCOL_TYPE_IOT = 8;
    public static final int PROTOCOL_TYPE_OAF = 1;
    public static final int PROTOCOL_TYPE_OCAR = 4;
    public static final int PROTOCOL_TYPE_ONET = 2;
    public static final String TAG = "ConnectOption";
    private int mChannelType;
    private int mConnectionType;
    private Bundle mExtraData;
    private byte mP2pGoPriority;
    private int mProtocolType;
    private boolean mSkipDirectPair;

    public class a implements Parcelable.Creator<ONetConnectOption> {
        @Override // android.os.Parcelable.Creator
        public final ONetConnectOption createFromParcel(Parcel parcel) {
            return new ONetConnectOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ONetConnectOption[] newArray(int i) {
            return new ONetConnectOption[i];
        }
    }

    public ONetConnectOption() {
        this.mProtocolType = 1;
        this.mConnectionType = 2;
        this.mChannelType = 0;
        this.mP2pGoPriority = (byte) 1;
        this.mSkipDirectPair = false;
        this.mExtraData = new Bundle();
    }

    public static int convertToConnectionType(int i) {
        return convertToConnectionType(i, 0);
    }

    public static int convertToTransportType(int i) {
        int i2 = 1;
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            i2 = 4;
            if (i != 4) {
                if (i != 16) {
                    return i != 32 ? 255 : 2;
                }
                return 8;
            }
        }
        return i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getChannelType() {
        return this.mChannelType;
    }

    public int getConnectionType() {
        return this.mConnectionType;
    }

    public Bundle getExtraData() {
        return this.mExtraData;
    }

    public byte getP2pGoPriority() {
        return this.mP2pGoPriority;
    }

    public int getProtocolType() {
        return this.mProtocolType;
    }

    public boolean isSameConnectionType(int i) {
        return isSameConnectionType(i, 0);
    }

    public boolean isSkipDirectPair() {
        return this.mSkipDirectPair;
    }

    public void readFromParcel(Parcel parcel) {
        this.mConnectionType = parcel.readInt();
        this.mChannelType = parcel.readInt();
        this.mP2pGoPriority = parcel.readByte();
        this.mSkipDirectPair = parcel.readByte() != 0;
        if (h0n.b() || h0n.a(1020040) >= 0) {
            this.mExtraData = parcel.readBundle();
        } else {
            d3d.b(TAG, "ExtraData does not need to be serialized");
        }
    }

    public void setChannelType(int i) {
        this.mChannelType = i;
    }

    public void setConnectionType(int i) {
        this.mConnectionType = i;
    }

    public void setExtraData(Bundle bundle) {
        this.mExtraData = bundle;
    }

    public void setP2pGoPriority(byte b) {
        this.mP2pGoPriority = b;
    }

    public void setProtocolType(int i) {
        this.mProtocolType = i;
    }

    public void setSkipDirectPair(boolean z) {
        this.mSkipDirectPair = z;
    }

    public String toString() {
        StringBuilder sbA = zqm.a("ONetConnectOption{mConnectionType=");
        sbA.append(this.mConnectionType);
        sbA.append(", mChannelType=");
        sbA.append(this.mChannelType);
        sbA.append(", mP2pGoPriority=");
        sbA.append((int) this.mP2pGoPriority);
        sbA.append(", mSkipDirectPair=");
        sbA.append(this.mSkipDirectPair);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mConnectionType);
        parcel.writeInt(this.mChannelType);
        parcel.writeByte(this.mP2pGoPriority);
        parcel.writeByte(this.mSkipDirectPair ? (byte) 1 : (byte) 0);
        if (h0n.b() || h0n.a(1020040) >= 0) {
            parcel.writeBundle(this.mExtraData);
        } else {
            d3d.b(TAG, "ExtraData does not need to be serialized");
        }
    }

    public static int convertToConnectionType(int i, int i2) {
        if (i == 1) {
            d3d.b(TAG, "P2P");
            return 2;
        }
        if (i == 2) {
            if (i2 == 2) {
                d3d.b(TAG, "BT_INSECURE");
                return 32;
            }
            d3d.b(TAG, XmlReader.TRANSPORT_BT);
            return 1;
        }
        if (i == 4) {
            d3d.b(TAG, XmlReader.TRANSPORT_BLE);
            return 4;
        }
        if (i != 8) {
            d3d.j(TAG, "Auto type");
            return 255;
        }
        d3d.b(TAG, "AP");
        return 16;
    }

    public boolean isSameConnectionType(int i, int i2) {
        return convertToConnectionType(i, i2) == getConnectionType();
    }

    public ONetConnectOption(int i) {
        this.mProtocolType = 1;
        this.mConnectionType = 2;
        this.mChannelType = 0;
        this.mP2pGoPriority = (byte) 1;
        this.mSkipDirectPair = false;
        this.mExtraData = new Bundle();
        this.mConnectionType = i;
    }

    public ONetConnectOption(Parcel parcel) {
        this.mProtocolType = 1;
        this.mConnectionType = 2;
        this.mChannelType = 0;
        this.mP2pGoPriority = (byte) 1;
        this.mSkipDirectPair = false;
        this.mExtraData = new Bundle();
        readFromParcel(parcel);
    }
}
