package com.heytap.health.home.homecard;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class CardUploadBean {
    private String cardCode;
    private int sort;

    public CardUploadBean(String str, int i) {
        this.cardCode = str;
        this.sort = i;
    }

    public String getCardCode() {
        return this.cardCode;
    }

    public int getSort() {
        return this.sort;
    }

    public void setCardCode(String str) {
        this.cardCode = str;
    }

    public void setSort(int i) {
        this.sort = i;
    }

    public String toString() {
        return "CardUploadBean{cardCode='" + this.cardCode + "', sort=" + this.sort + '}';
    }
}
