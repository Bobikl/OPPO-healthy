package com.heytap.accessory.bean;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class GeneralException extends Exception {
    private int mErrorCode;

    public GeneralException() {
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public GeneralException(int i, String str) {
        super(str);
        this.mErrorCode = i;
    }

    public GeneralException(int i, Throwable th) {
        super(th);
    }

    public GeneralException(int i, String str, Throwable th) {
        super(str, th);
        this.mErrorCode = i;
    }
}
