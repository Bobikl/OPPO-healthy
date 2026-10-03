package com.heytap.webpro.preload.res.entity;

import androidx.annotation.Keep;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class ResourceCache {
    private Map<String, String> mHeaders;
    private String mPath;
    private String mType;
    private String md5;

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPath() {
        return this.mPath;
    }

    public String getType() {
        return this.mType;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPath(String str) {
        this.mPath = str;
    }

    public void setType(String str) {
        this.mType = str;
    }
}
