package com.heytap.webpro.preload.res.entity;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class DownloadParam {
    public int appId;
    public boolean isPatch;
    public String md5;
    public String oldVersion;
    public String patchUrl;
    public String url;
    public String version;

    private DownloadParam() {
    }

    public static DownloadParam from(PreloadOffline.PreloadOfflineData preloadOfflineData) {
        return from(preloadOfflineData, null);
    }

    @NonNull
    public String toString() {
        return "DownloadParam{appId=" + this.appId + ", url='" + this.url + "', patchUrl='" + this.patchUrl + "', md5='" + this.md5 + "', version='" + this.version + "', oldVersion='" + this.oldVersion + "', isPatch=" + this.isPatch + '}';
    }

    public static DownloadParam from(PreloadOffline.PreloadOfflineData preloadOfflineData, String str) {
        return from(preloadOfflineData, str, null);
    }

    public static DownloadParam from(PreloadOffline.PreloadOfflineData preloadOfflineData, String str, String str2) {
        DownloadParam downloadParam = new DownloadParam();
        downloadParam.appId = preloadOfflineData.appId;
        downloadParam.url = preloadOfflineData.url;
        downloadParam.patchUrl = str2;
        downloadParam.md5 = preloadOfflineData.md5;
        downloadParam.version = preloadOfflineData.version;
        downloadParam.oldVersion = str;
        downloadParam.isPatch = !TextUtils.isEmpty(str2);
        return downloadParam;
    }
}
