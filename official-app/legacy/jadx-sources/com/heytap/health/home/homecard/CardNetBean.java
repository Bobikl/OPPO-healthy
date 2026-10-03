package com.heytap.health.home.homecard;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class CardNetBean {
    private String cardCode;
    private String cardName;
    private String cardTitle;
    private int cardType;
    private int newCard;
    private RecommendData recommendData;
    private int sort;

    public CardNetBean(String str, int i, String str2, String str3, int i2) {
        this.cardCode = str;
        this.cardType = i;
        this.cardName = str2;
        this.cardTitle = str3;
        this.sort = i2;
    }

    public String getCardCode() {
        return this.cardCode;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardTitle() {
        return this.cardTitle;
    }

    public int getCardType() {
        return this.cardType;
    }

    public int getNewCard() {
        return this.newCard;
    }

    public RecommendData getRecommendCard() {
        return this.recommendData;
    }

    public int getSort() {
        return this.sort;
    }

    public boolean isNewCard() {
        return this.newCard == 1;
    }

    public void setCardCode(String str) {
        this.cardCode = str;
    }

    public void setCardName(String str) {
        this.cardName = str;
    }

    public void setCardTitle(String str) {
        this.cardTitle = str;
    }

    public void setCardType(int i) {
        this.cardType = i;
    }

    public void setNewCard(int i) {
        this.newCard = i;
    }

    public void setRecommendCard(RecommendData recommendData) {
        this.recommendData = recommendData;
    }

    public void setSort(int i) {
        this.sort = i;
    }

    public String toString() {
        return "CardNetBean{cardCode='" + this.cardCode + "', cardType=" + this.cardType + ", cardName='" + this.cardName + "', cardTitle='" + this.cardTitle + "', sort=" + this.sort + ", newCard=" + this.newCard + ", recommendData=" + this.recommendData + '}';
    }
}
