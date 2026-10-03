package com.oplus.onet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.bean.ConnectMessage;

/* JADX INFO: loaded from: classes8.dex */
public class ONetConnectMessage implements Parcelable {
    public static final Parcelable.Creator<ONetConnectMessage> CREATOR = new a();
    public static final String TAG = "ConnectMessage";
    private byte[] data;

    public class a implements Parcelable.Creator<ONetConnectMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ONetConnectMessage createFromParcel(Parcel parcel) {
            return new ONetConnectMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ONetConnectMessage[] newArray(int i) {
            return new ONetConnectMessage[i];
        }
    }

    public ONetConnectMessage(ConnectMessage connectMessage) {
        this.data = connectMessage.getData();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public ConnectMessage toAFConnectMessage() {
        return new ConnectMessage(this.data);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.data);
    }

    public ONetConnectMessage(Parcel parcel) {
        this.data = parcel.createByteArray();
    }
}
