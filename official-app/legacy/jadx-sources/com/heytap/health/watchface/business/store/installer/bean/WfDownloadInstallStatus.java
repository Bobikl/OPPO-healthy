package com.heytap.health.watchface.business.store.installer.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WfDownloadInstallStatus {
    private boolean isBackgroundProcess;
    private int process;
    private int status;

    public int getProcess() {
        return this.process;
    }

    public int getStatus() {
        return this.status;
    }

    public boolean isBackgroundProcess() {
        return this.isBackgroundProcess;
    }

    public void setBackgroundProcess(boolean z) {
        this.isBackgroundProcess = z;
    }

    public void setProcess(int i) {
        this.process = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String toString() {
        return "WfDownloadInstallStatus{status=" + this.status + ", process=" + this.process + ", isBackgroundProcess=" + this.isBackgroundProcess + '}';
    }
}
