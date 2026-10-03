package com.heytap.log.nx.http;

import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class NxResponse {
    public static final int HTTP_OK = 200;
    private int code;
    private File file;
    private Map<String, Object> header;
    private String message;

    public NxResponse(int i) {
        this.code = i;
        this.message = this.message;
        this.header = this.header;
    }

    public int getCode() {
        return this.code;
    }

    public File getFile() {
        return this.file;
    }

    public Map<String, Object> getHeader() {
        return this.header;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setHeader(Map<String, Object> map) {
        this.header = map;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public NxResponse(int i, String str, Map<String, Object> map) {
        this.code = i;
        this.message = str;
        this.header = map;
    }
}
