package com.heytap.nearx.tangramconfig.business;

import java.io.File;

/* JADX INFO: loaded from: classes17.dex */
public class ConfigResult {
    private int code;
    private File file;

    public ConfigResult(File file, int i) {
        this.file = file;
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    public File getFile() {
        return this.file;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String toString() {
        return "ConfigResult{file=" + this.file + ", code=" + this.code + '}';
    }
}
