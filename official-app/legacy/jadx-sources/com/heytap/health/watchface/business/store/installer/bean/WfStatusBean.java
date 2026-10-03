package com.heytap.health.watchface.business.store.installer.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WfStatusBean {
    private boolean isBackgroundProcess;
    private int process;
    private int status;
    private String uniqueId;
    private String version;

    public WfStatusBean(String str, String str2, int i, boolean z) {
        this.uniqueId = str;
        this.version = str2;
        this.status = i;
        this.isBackgroundProcess = z;
    }

    public int getProcess() {
        return this.process;
    }

    public int getStatus() {
        return this.status;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public String getVersion() {
        return this.version;
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

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "WfStatusBean{uniqueId='" + this.uniqueId + "', version='" + this.version + "', status=" + this.status + ", process=" + this.process + ", isBackgroundProcess=" + this.isBackgroundProcess + '}';
    }

    public WfStatusBean(String str, int i) {
        this.uniqueId = str;
        this.status = i;
    }

    public WfStatusBean(String str, String str2, int i) {
        this.uniqueId = str;
        this.version = str2;
        this.status = i;
    }
}
