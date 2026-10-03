package com.heytap.theme.watch.domain.dto.request;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class CommonParam {

    @Tag(1)
    private String token;

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return "CommonParam{token='" + this.token + "'}";
    }
}
