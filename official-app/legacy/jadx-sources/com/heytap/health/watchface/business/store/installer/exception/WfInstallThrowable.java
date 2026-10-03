package com.heytap.health.watchface.business.store.installer.exception;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public class WfInstallThrowable extends Throwable {
    private WfInstallExceptionType mType;

    public WfInstallThrowable(WfInstallExceptionType wfInstallExceptionType, @Nullable String str) {
        super(str);
        this.mType = wfInstallExceptionType;
    }

    public WfInstallExceptionType getType() {
        return this.mType;
    }

    public void setType(WfInstallExceptionType wfInstallExceptionType) {
        this.mType = wfInstallExceptionType;
    }
}
