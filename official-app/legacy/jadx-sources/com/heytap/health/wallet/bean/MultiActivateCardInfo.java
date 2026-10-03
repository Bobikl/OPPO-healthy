package com.heytap.health.wallet.bean;

import io.protostuff.Tag;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class MultiActivateCardInfo implements Serializable {
    private static final long serialVersionUID = 7319835107137569030L;

    @Tag(2)
    private String cardType;

    @Tag(4)
    private Integer defaultValue;

    @Tag(1)
    private List<IotCardInfo> iotCardInfoList;

    @Tag(3)
    private Integer orderByValue;

    public String getCardType() {
        return this.cardType;
    }

    public List<IotCardInfo> getIotCardInfoList() {
        return this.iotCardInfoList;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public String toString() {
        return "MultiActivateCardInfo{iotCardInfoList='" + this.iotCardInfoList + "', cardType='" + this.cardType + "'}";
    }
}
