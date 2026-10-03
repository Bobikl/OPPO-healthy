package com.heytap.databaseengine.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class Vo2MaxExtra {
    private float aerobicTE;
    private String checksumStr;
    private long createTime;
    private int dataCheck;
    private int recoveryTime;
    private float vo2max;

    public float getAerobicTE() {
        return this.aerobicTE;
    }

    public String getChecksumStr() {
        return this.checksumStr;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getDataCheck() {
        return this.dataCheck;
    }

    public int getRecoveryTime() {
        return this.recoveryTime;
    }

    public float getVo2max() {
        return this.vo2max;
    }

    public void setAerobicTE(float f) {
        this.aerobicTE = f;
    }

    public void setChecksumStr(String str) {
        this.checksumStr = str;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setDataCheck(int i) {
        this.dataCheck = i;
    }

    public void setRecoveryTime(int i) {
        this.recoveryTime = i;
    }

    public void setVo2max(float f) {
        this.vo2max = f;
    }
}
