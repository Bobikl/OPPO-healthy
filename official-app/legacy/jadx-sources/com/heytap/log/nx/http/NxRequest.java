package com.heytap.log.nx.http;

import android.text.TextUtils;
import android.util.ArrayMap;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class NxRequest {
    public static final String GET = "GET";
    public static final String POST = "POST";
    private File file;
    private Map<String, String> header;
    private String jsonDatas;
    private String method = "POST";
    private NxFile nxFile;
    private Map<String, String> params;
    private String url;

    public NxRequest addHeader(String str, String str2) {
        if (this.header == null) {
            this.header = new ArrayMap();
        }
        this.header.put(str, str2);
        return this;
    }

    public NxRequest addHeaders(Map<String, String> map) {
        if (this.header == null) {
            this.header = new ArrayMap();
        }
        this.header.putAll(map);
        return this;
    }

    public NxRequest addParams(String str, String str2) {
        if (this.params == null) {
            this.params = new ArrayMap();
        }
        this.params.put(str, str2);
        return this;
    }

    public File getFile() {
        return this.file;
    }

    public Map<String, String> getHeader() {
        return this.header;
    }

    public String getJsonDatas() {
        return this.jsonDatas;
    }

    public String getMethod() {
        if (TextUtils.isEmpty(this.method)) {
            this.method = "POST";
        }
        return this.method;
    }

    public NxFile getNxFile() {
        return this.nxFile;
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    public String getUrl() {
        return this.url;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public NxRequest setJsonDatas(String str) {
        this.jsonDatas = str;
        return this;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public NxRequest setNxFile(NxFile nxFile) {
        this.nxFile = nxFile;
        return this;
    }

    public NxRequest setUrl(String str) {
        this.url = str;
        return this;
    }
}
