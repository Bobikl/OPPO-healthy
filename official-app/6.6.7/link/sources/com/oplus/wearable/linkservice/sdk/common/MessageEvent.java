package com.oplus.wearable.linkservice.sdk.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class MessageEvent implements Parcelable {
    public static final int CACHE_DEFAULT = 1;
    public static final int CACHE_NOT_USE = 16;
    public static final Parcelable.Creator<MessageEvent> CREATOR = new a();
    public static final int ENCRYPT_DEVICE_DEFAULT = 0;
    public static final int ENCRYPT_NO = 1;
    public static final int ENCRYPT_UNCOMPRESS = 3;
    public static final int ENCRYPT_YES = 2;
    public static final int TRANSPORT_BT = 2;
    public static final int TRANSPORT_WIFI = 1;
    private int mCacheOption;
    private int mCommandId;
    private byte[] mData;
    private int mEncryptOption;
    private int mPriority;
    private int mSeq;
    private int mServiceId;
    private volatile int transport;

    public class a implements Parcelable.Creator<MessageEvent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageEvent createFromParcel(Parcel parcel) {
            return new MessageEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageEvent[] newArray(int i) {
            return new MessageEvent[i];
        }
    }

    public MessageEvent(int i, int i2, byte[] bArr) {
        this.mServiceId = 0;
        this.mCommandId = 0;
        this.mPriority = Priority.PRIORITY_MIDDLE.getPriority();
        this.mEncryptOption = 0;
        this.mCacheOption = 1;
        this.transport = 2;
        this.mSeq = 0;
        this.mServiceId = i;
        this.mCommandId = i2;
        this.mData = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCacheOption() {
        return this.mCacheOption;
    }

    public int getCommandId() {
        return this.mCommandId;
    }

    public byte[] getData() {
        return this.mData;
    }

    public int getEncryptOption() {
        return this.mEncryptOption;
    }

    public Priority getPriority() {
        return Priority.createPriority(this.mPriority);
    }

    public int getSequence() {
        return this.mSeq;
    }

    public int getServiceId() {
        return this.mServiceId;
    }

    public int getTransport() {
        return this.transport;
    }

    public void setCacheOption(int i) {
        this.mCacheOption = i;
    }

    public void setEncryptOption(int i) {
        this.mEncryptOption = i;
    }

    public void setPriority(Priority priority) {
        this.mPriority = priority.getPriority();
    }

    public void setSequence(int i) {
        this.mSeq = i;
    }

    public void setTransport(int i) {
        this.transport = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MessageEvent[sid=");
        sb.append(this.mServiceId);
        sb.append(" cid=");
        sb.append(this.mCommandId);
        sb.append(" seq=");
        sb.append(this.mSeq);
        sb.append(" content=");
        byte[] bArr = this.mData;
        sb.append(bArr == null ? "null" : Integer.valueOf(bArr.length));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mServiceId);
        parcel.writeInt(this.mCommandId);
        parcel.writeByteArray(this.mData);
        parcel.writeInt(this.mPriority);
        parcel.writeInt(this.mEncryptOption);
        parcel.writeInt(this.mSeq);
        parcel.writeInt(this.mCacheOption);
        parcel.writeInt(this.transport);
    }

    public MessageEvent(int i, int i2, int i3, byte[] bArr) {
        this.mServiceId = 0;
        this.mCommandId = 0;
        this.mPriority = Priority.PRIORITY_MIDDLE.getPriority();
        this.mEncryptOption = 0;
        this.mCacheOption = 1;
        this.transport = 2;
        this.mSeq = 0;
        this.mServiceId = i;
        this.mCommandId = i2;
        this.transport = i3;
        this.mData = bArr;
    }

    public MessageEvent(Parcel parcel) {
        this.mServiceId = 0;
        this.mCommandId = 0;
        this.mPriority = Priority.PRIORITY_MIDDLE.getPriority();
        this.mEncryptOption = 0;
        this.mCacheOption = 1;
        this.transport = 2;
        this.mSeq = 0;
        this.mServiceId = parcel.readInt();
        this.mCommandId = parcel.readInt();
        this.mData = parcel.createByteArray();
        this.mPriority = parcel.readInt();
        this.mEncryptOption = parcel.readInt();
        this.mSeq = parcel.readInt();
        this.mCacheOption = parcel.readInt();
        this.transport = parcel.readInt();
    }
}
