package com.heytap.health.device_app_store.install;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class AppStatusInfo implements Cloneable {
    public static final int DEFAULT = 0;
    public static final int DOWNLOADING = 1;
    public static final int DOWNLOAD_COMPLETE = 3;
    public static final int DOWNLOAD_PAUSE = 2;
    public static final int FAILED = -1;
    public static final int INSTALLED = 5;
    public static final int INSTALL_PROGRESS = 4;
    private int currStatus;
    private int from;
    private String pkgName;
    private float progress;
    private int reason;
    private int status;
    private String version;

    public AppStatusInfo(String str, String str2) {
        this(str, str2, 5);
    }

    public int getCurrStatus() {
        return this.currStatus;
    }

    public int getFrom() {
        return this.from;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public float getProgress() {
        return this.progress;
    }

    public int getReason() {
        return this.reason;
    }

    public int getStatus() {
        return this.status;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCurrStatus(int i) {
        this.currStatus = i;
    }

    public void setFrom(int i) {
        this.from = i;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setProgress(float f) {
        this.progress = f;
    }

    public void setReason(int i) {
        this.reason = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "AppStatusInfo{pkgName='" + this.pkgName + "', version='" + this.version + "', status=" + this.status + ", reason=" + this.reason + ", from=" + this.from + ", progress=" + this.progress + ", currStatus=" + this.currStatus + '}';
    }

    public AppStatusInfo(String str, String str2, int i) {
        this.currStatus = -1;
        this.pkgName = str;
        this.version = str2;
        this.status = i;
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AppStatusInfo m4635clone() throws CloneNotSupportedException {
        AppStatusInfo appStatusInfo = new AppStatusInfo(this.pkgName, this.version, this.status);
        appStatusInfo.setCurrStatus(this.currStatus);
        return appStatusInfo;
    }

    public AppStatusInfo(String str, String str2, int i, int i2, int i3) {
        this.currStatus = -1;
        this.pkgName = str;
        this.version = str2;
        this.status = i;
        this.reason = i2;
        this.from = i3;
    }
}
