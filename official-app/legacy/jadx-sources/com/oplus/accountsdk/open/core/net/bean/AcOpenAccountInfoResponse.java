package com.oplus.accountsdk.open.core.net.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenAccountInfoResponse {
    private String accountName;
    private String avatarUrl;
    private String classifyByAge;
    private String country;
    private String maskedEmail;
    private String maskedMobile;
    private boolean nameHasModified;
    private String registerTime;
    private String sex;
    private String ssoid;
    private String status;
    private String userName;

    public String getAccountName() {
        return this.accountName;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getClassifyByAge() {
        return this.classifyByAge;
    }

    public String getCountry() {
        return this.country;
    }

    public String getMaskedEmail() {
        return this.maskedEmail;
    }

    public String getMaskedMobile() {
        return this.maskedMobile;
    }

    public boolean getNameHasModified() {
        return this.nameHasModified;
    }

    public String getRegisterTime() {
        return this.registerTime;
    }

    public String getSex() {
        return this.sex;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public String getStatus() {
        return this.status;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setAccountName(String str) {
        this.accountName = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setClassifyByAge(String str) {
        this.classifyByAge = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setMaskedEmail(String str) {
        this.maskedEmail = str;
    }

    public void setMaskedMobile(String str) {
        this.maskedMobile = str;
    }

    public void setNameHasModified(boolean z) {
        this.nameHasModified = z;
    }

    public void setRegisterTime(String str) {
        this.registerTime = str;
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }
}
