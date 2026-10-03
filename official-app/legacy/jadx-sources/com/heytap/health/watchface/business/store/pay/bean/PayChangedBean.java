package com.heytap.health.watchface.business.store.pay.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class PayChangedBean {
    private int payStatus;
    private String wfUnique;

    public PayChangedBean(String str, int i) {
        this.wfUnique = str;
        this.payStatus = i;
    }

    public int getPayStatus() {
        return this.payStatus;
    }

    public String getWfUnique() {
        return this.wfUnique;
    }

    public void setPayStatus(int i) {
        this.payStatus = i;
    }

    public void setWfUnique(String str) {
        this.wfUnique = str;
    }

    public String toString() {
        return "PayChangedBean{wfUnique='" + this.wfUnique + "', payStatus=" + this.payStatus + '}';
    }

    public PayChangedBean(String str) {
        this.wfUnique = str;
    }
}
