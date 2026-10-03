package com.heytap.health.sleep.disturb.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class AppTypeRspItem {
    private String categoryName;
    private String pkgName;
    private int secondCategoryId;

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public int getSecondCategoryId() {
        return this.secondCategoryId;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setSecondCategoryId(int i) {
        this.secondCategoryId = i;
    }

    @NonNull
    public String toString() {
        return "AppTypeRspBodyItem{pkgName='" + this.pkgName + "', categoryName='" + this.categoryName + "', secondCategoryId=" + this.secondCategoryId + '}';
    }
}
