package com.heytap.health.wallet.healthcloud.response;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class RfFileListDownloadRsp {
    private String aid;
    private String fileUrl;
    private long version;

    public String getAid() {
        return this.aid;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public long getVersion() {
        return this.version;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toString() {
        return "RfFileListDownloadRsp{aid='" + this.aid + "', fileUrl='" + this.fileUrl + "', version=" + this.version + '}';
    }
}
