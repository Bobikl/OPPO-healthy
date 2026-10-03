package com.heytap.accessory.utils.buffer;

/* JADX INFO: loaded from: classes14.dex */
public class BufferException extends Exception {
    private int mErrorCode;

    public BufferException() {
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public BufferException(int i, String str) {
        super(str);
        this.mErrorCode = i;
    }

    public BufferException(int i, Throwable th) {
        super(th);
    }

    public BufferException(int i, String str, Throwable th) {
        super(str, th);
        this.mErrorCode = i;
    }
}
