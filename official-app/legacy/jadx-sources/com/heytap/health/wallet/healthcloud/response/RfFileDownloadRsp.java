package com.heytap.health.wallet.healthcloud.response;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class RfFileDownloadRsp {
    private String fileUrl;
    private long version;

    public String getFileUrl() {
        return this.fileUrl;
    }

    public long getVersion() {
        return this.version;
    }

    public void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
