package com.heytap.health.wallet.bean;

import io.protostuff.Tag;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class IotCardInfo implements Serializable {
    private static final long serialVersionUID = 2923034193612794822L;

    @Tag(2)
    private String aid;

    @Tag(4)
    private String appCode;

    @Tag(10)
    private String cardId;

    @Tag(3)
    private String cardImg;

    @Tag(1)
    private String cardName;

    @Tag(11)
    private String cardNumberType;

    @Tag(7)
    private String cardStatus;

    @Tag(9)
    private Map<String, Object> data;

    @Tag(8)
    private String isSuperCard;

    @Tag(5)
    private String isSupport;

    @Tag(6)
    private String tips;

    public String getAid() {
        return this.aid;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public String getCardId() {
        return this.cardId;
    }

    public String getCardImg() {
        return this.cardImg;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardNumberType() {
        return this.cardNumberType;
    }

    public String getCardStatus() {
        return this.cardStatus;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public String getIsSuperCard() {
        return this.isSuperCard;
    }

    public String getIsSupport() {
        return this.isSupport;
    }

    public String getTips() {
        return this.tips;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setCardId(String str) {
        this.cardId = str;
    }

    public void setCardImg(String str) {
        this.cardImg = str;
    }

    public void setCardName(String str) {
        this.cardName = str;
    }

    public void setCardNumberType(String str) {
        this.cardNumberType = str;
    }

    public void setCardStatus(String str) {
        this.cardStatus = str;
    }

    public void setData(Map<String, Object> map) {
        this.data = map;
    }

    public void setIsSuperCard(String str) {
        this.isSuperCard = str;
    }

    public void setIsSupport(String str) {
        this.isSupport = str;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public String toString() {
        return "IotCardInfo{cardName='" + this.cardName + "', aid='" + this.aid + "', cardImg='" + this.cardImg + "', appCode='" + this.appCode + "', isSupport='" + this.isSupport + "', tips='" + this.tips + "', isSuperCard=" + this.isSuperCard + '}';
    }
}
