package com.platform.usercenter.account.mba.entity;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes9.dex */
public class RecoveryPkgInfo {
    public String appName;
    public Bitmap bitmap;
    public String pkg;
    public int resultCode;
    public boolean success;

    public RecoveryPkgInfo(int i, String str, String str2, Bitmap bitmap) {
        this.resultCode = i;
        this.pkg = str;
        this.appName = str2;
        this.bitmap = bitmap;
    }

    public String getAppName() {
        return this.appName;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public String getPkg() {
        return this.pkg;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setPkg(String str) {
        this.pkg = str;
    }

    public RecoveryPkgInfo(int i, String str, String str2, Bitmap bitmap, boolean z) {
        this.resultCode = i;
        this.pkg = str;
        this.appName = str2;
        this.bitmap = bitmap;
        this.success = z;
    }
}
