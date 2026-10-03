package com.heytap.upgrade.exception;

/* JADX INFO: loaded from: classes19.dex */
public class UpgradeException extends Exception {
    private int errorCode;

    public UpgradeException(int i) {
        this.errorCode = i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public UpgradeException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public UpgradeException(int i, Throwable th) {
        super(th);
        this.errorCode = i;
    }
}
