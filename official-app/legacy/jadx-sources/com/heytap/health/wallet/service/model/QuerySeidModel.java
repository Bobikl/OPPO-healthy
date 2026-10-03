package com.heytap.health.wallet.service.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class QuerySeidModel {
    private String cplc;
    private String seId;

    public QuerySeidModel(String str, String str2) {
        this.seId = str;
        this.cplc = str2;
    }

    public String getCplc() {
        return this.cplc;
    }

    public String getSeId() {
        return this.seId;
    }

    public void setCplc(String str) {
        this.cplc = str;
    }

    public void setSeId(String str) {
        this.seId = str;
    }
}
