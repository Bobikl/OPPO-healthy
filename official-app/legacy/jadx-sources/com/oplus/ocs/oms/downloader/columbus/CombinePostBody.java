package com.oplus.ocs.oms.downloader.columbus;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class CombinePostBody {
    private List<CombinePostListBody> appInfoROList;
    private String brand;
    private String colorOsVersionCode;
    private String lang;
    private String mobile;
    private int os;
    private String region;

    public List<CombinePostListBody> getAppInfoROList() {
        return this.appInfoROList;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColorOsVersionCode() {
        return this.colorOsVersionCode;
    }

    public String getLang() {
        return this.lang;
    }

    public String getMobile() {
        return this.mobile;
    }

    public int getOs() {
        return this.os;
    }

    public String getRegion() {
        return this.region;
    }

    public void setAppInfoROList(List<CombinePostListBody> list) {
        this.appInfoROList = list;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setColorOsVersionCode(String str) {
        this.colorOsVersionCode = str;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setOs(int i) {
        this.os = i;
    }

    public void setRegion(String str) {
        this.region = str;
    }
}
