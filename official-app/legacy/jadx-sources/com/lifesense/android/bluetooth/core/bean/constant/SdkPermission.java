package com.lifesense.android.bluetooth.core.bean.constant;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class SdkPermission implements Serializable {
    public static final long serialVersionUID = 1;
    public boolean enablePrintln;
    public String sdkVersion;

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
