package com.oplus.onet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.bean.AuthenticateMessage;

/* JADX INFO: loaded from: classes8.dex */
public class ONetAuthenticateMessage implements Parcelable {
    public static final int AUTH_TYPE_NORMAL = 1;
    public static final int AUTH_TYPE_PIN = 2;
    public static final Parcelable.Creator<ONetAuthenticateMessage> CREATOR = new a();
    public static final String TAG = "AuthenticateMessage";
    private byte[] data;
    private int dataType;

    public class a implements Parcelable.Creator<ONetAuthenticateMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ONetAuthenticateMessage createFromParcel(Parcel parcel) {
            return new ONetAuthenticateMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ONetAuthenticateMessage[] newArray(int i) {
            return new ONetAuthenticateMessage[i];
        }
    }

    public ONetAuthenticateMessage(AuthenticateMessage authenticateMessage) {
        this.dataType = authenticateMessage.getType();
        this.data = authenticateMessage.getData();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getDataType() {
        return this.dataType;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public AuthenticateMessage toAFAuthenticateMessage() {
        return new AuthenticateMessage(this.dataType, this.data);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dataType);
        parcel.writeByteArray(this.data);
    }

    public ONetAuthenticateMessage(Parcel parcel) {
        this.dataType = parcel.readInt();
        this.data = parcel.createByteArray();
    }
}
