package com.lifesense.plugin.ble.data.other;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class SdkPermission implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean enablePrintln;
    private String sdkVersion;

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public boolean isEnablePrintln() {
        return this.enablePrintln;
    }

    public void setEnablePrintln(boolean z) {
        this.enablePrintln = z;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public String toString() {
        return "SdkPermission [enablePrintln=" + this.enablePrintln + ", sdkVersion=" + this.sdkVersion + "]";
    }
}
