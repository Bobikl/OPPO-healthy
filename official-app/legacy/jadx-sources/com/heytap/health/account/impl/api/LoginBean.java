package com.heytap.health.account.impl.api;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class LoginBean {
    private int accountType;
    private String ssoid;

    public int getAccountType() {
        return this.accountType;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public void setAccountType(int i) {
        this.accountType = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }
}
