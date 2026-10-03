package com.heytap.health.healthecg.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class ECGUploadVerifyBean {
    private String clientDataId;
    private ECGVerifyRecord eCGRecord;
    private String openId;
    private int type;
    private ECGUser user;
    private int userNo = 999998;
    private int deviceType = 20;
    private String deviceSn = "5DA1F4DA52";

    public String getClientDataId() {
        return this.clientDataId;
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public String getOpenId() {
        return this.openId;
    }

    public int getType() {
        return this.type;
    }

    public ECGUser getUser() {
        return this.user;
    }

    public int getUserNo() {
        return this.userNo;
    }

    public ECGVerifyRecord geteCGRecord() {
        return this.eCGRecord;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDeviceSn(String str) {
        this.deviceSn = str;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    public void setOpenId(String str) {
        this.openId = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUser(ECGUser eCGUser) {
        this.user = eCGUser;
    }

    public void setUserNo(int i) {
        this.userNo = i;
    }

    public void seteCGRecord(ECGVerifyRecord eCGVerifyRecord) {
        this.eCGRecord = eCGVerifyRecord;
    }
}
