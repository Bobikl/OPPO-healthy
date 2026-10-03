package com.heytap.accessory.bean;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class AuthenticateMessage {
    public static final int AUTH_TYPE_NORMAL = 1;
    public static final int AUTH_TYPE_PIN = 2;
    private byte[] mData;
    private int mType;

    public AuthenticateMessage(byte[] bArr) {
        this.mData = bArr;
    }

    public byte[] getData() {
        return this.mData;
    }

    public int getType() {
        return this.mType;
    }

    public AuthenticateMessage(int i, byte[] bArr) {
        this.mType = i;
        this.mData = bArr;
    }
}
