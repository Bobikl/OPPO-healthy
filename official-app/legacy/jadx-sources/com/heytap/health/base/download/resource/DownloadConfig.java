package com.heytap.health.base.download.resource;

import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public class DownloadConfig implements Serializable {
    private String downloadTip;
    private Class<? extends DownloadProgressActivity> reflectProcessActivityClazz;
    private transient boolean showProgressActivity;
    private String uniqueKey;

    public DownloadConfig(boolean z, String str, String str2) {
        this(z, str, str2, null);
    }

    public String getDownloadTip() {
        return this.downloadTip;
    }

    public Class<? extends DownloadProgressActivity> getReflectProcessActivityClazz() {
        return this.reflectProcessActivityClazz;
    }

    public String getUniqueKey() {
        return this.uniqueKey;
    }

    public boolean isShowProgressActivity() {
        return this.showProgressActivity;
    }

    public void setReflectProcessActivityClazz(Class<? extends DownloadProgressActivity> cls) {
        this.reflectProcessActivityClazz = cls;
    }

    public DownloadConfig(boolean z, String str, String str2, Class<? extends DownloadProgressActivity> cls) {
        this.showProgressActivity = z;
        this.uniqueKey = str;
        this.downloadTip = str2;
        this.reflectProcessActivityClazz = cls;
    }
}
