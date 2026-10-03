package com.heytap.webpro.preload.res.entity;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class PreloadOffline {
    public List<PreloadOfflineData> apps;
    public long time;

    @Keep
    public static class PreloadOfflineData {
        public static final int STATUS_DELETE = 2;
        public static final int STATUS_INVALID = 1;
        public static final int STATUS_SUCCESS = 0;
        public int appId;
        public String baseVersion;
        public String md5;
        public long size;
        public int status;
        public String url;
        public String version;

        @NonNull
        public String toString() {
            return "PreloadConfigData{appId=" + this.appId + ", version='" + this.version + "', md5='" + this.md5 + "', size=" + this.size + ", url='" + this.url + "', status=" + this.status + '}';
        }
    }

    @NonNull
    public String toString() {
        return "PreloadConfig{apps=" + this.apps + ", time=" + this.time + '}';
    }
}
