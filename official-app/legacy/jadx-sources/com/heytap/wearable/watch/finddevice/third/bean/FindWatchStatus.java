package com.heytap.wearable.watch.finddevice.third.bean;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FindWatchStatus {

    @Nullable
    private transient String errorCode;
    private transient boolean isSuccess;

    @Keep
    private int switchStatus;

    @Nullable
    public String getErrorCode() {
        return this.errorCode;
    }

    public int getSwitchStatus() {
        return this.switchStatus;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setErrorCode(@Nullable String str) {
        this.errorCode = str;
    }

    public void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public void setSwitchStatus(int i) {
        this.switchStatus = i;
    }

    public String toString() {
        return "FindWatchStatus{switchStatus=" + this.switchStatus + "isSuccess=" + this.isSuccess + "errorCode=" + this.errorCode + '}';
    }
}
