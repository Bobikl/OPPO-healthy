package com.heytap.health.operation.courses.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class FilesBean {
    private String actionMd5;
    private String actionName;
    private String fileName;
    private float fileSize;
    private String resourceFileSignature;
    private String sha256;

    public String getActionMd5() {
        return this.actionMd5;
    }

    public String getActionName() {
        return this.actionName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public float getFileSize() {
        return this.fileSize;
    }

    public String getResourceFileSignature() {
        return this.resourceFileSignature;
    }

    public String getSha256() {
        return this.sha256;
    }

    public void setActionMd5(String str) {
        this.actionMd5 = str;
    }

    public void setActionName(String str) {
        this.actionName = str;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileSize(float f) {
        this.fileSize = f;
    }

    public void setResourceFileSignature(String str) {
        this.resourceFileSignature = str;
    }

    public void setSha256(String str) {
        this.sha256 = str;
    }

    public String toString() {
        return "FilesBean{, actionName='" + this.actionName + "', fileName='" + this.fileName + "', fileSize=" + this.fileSize + '}';
    }
}
