package com.heytap.log.nx.http;

import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class NxFile {
    private String fileName;
    private String path;

    public String getAbosulteName() {
        return getPath() + File.separator + this.fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getPath() {
        return this.path;
    }

    public NxFile setFileName(String str) {
        this.fileName = str;
        return this;
    }

    public NxFile setPath(String str) {
        this.path = str;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return this;
    }
}
