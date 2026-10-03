package com.heytap.accessory.authcode;

import com.heytap.accessory.CommonStatusCodes;

/* JADX INFO: loaded from: classes14.dex */
public class AuthFailureException extends Exception {
    private int mErrorCode;

    public AuthFailureException(int i) {
        this.mErrorCode = i;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMessage() {
        return CommonStatusCodes.getStatusCodeString(this.mErrorCode);
    }
}
