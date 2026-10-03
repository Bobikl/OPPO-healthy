package com.oplus.accountsdk.open.core.config;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenCoreConfig implements Serializable {
    private String appI;
    private String appK;
    private String brand;
    private String country;
    private boolean isHost;

    public AcOpenCoreConfig(String str, String str2, String str3, String str4, boolean z) {
        this.appI = str;
        this.appK = str2;
        this.country = str3;
        this.brand = str4;
        this.isHost = z;
    }

    public String getAppI() {
        return this.appI;
    }

    public String getAppK() {
        return this.appK;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getCountry() {
        return this.country;
    }

    public boolean isHost() {
        return this.isHost;
    }
}
