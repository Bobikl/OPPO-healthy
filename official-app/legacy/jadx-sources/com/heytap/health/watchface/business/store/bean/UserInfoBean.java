package com.heytap.health.watchface.business.store.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class UserInfoBean {
    private String avater;
    private String name;
    private String token;

    public UserInfoBean() {
    }

    public String getAvater() {
        return this.avater;
    }

    public String getName() {
        return this.name;
    }

    public String getToken() {
        return this.token;
    }

    public void setAvater(String str) {
        this.avater = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public UserInfoBean(String str, String str2, String str3) {
        this.name = str;
        this.token = str2;
        this.avater = str3;
    }
}
