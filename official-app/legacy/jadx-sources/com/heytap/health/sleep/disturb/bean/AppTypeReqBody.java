package com.heytap.health.sleep.disturb.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class AppTypeReqBody {
    private String pkgNames;

    public String getPkgNames() {
        return this.pkgNames;
    }

    public void setPkgNames(String str) {
        this.pkgNames = str;
    }

    @NonNull
    public String toString() {
        return "AppTypeReqItem{pkgNames='" + this.pkgNames + "'}";
    }
}
