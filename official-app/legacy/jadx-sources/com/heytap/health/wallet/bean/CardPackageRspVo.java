package com.heytap.health.wallet.bean;

import com.heytap.health.wallet.model.response.PayCardInfo;
import io.protostuff.Tag;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class CardPackageRspVo implements Serializable {
    private static final long serialVersionUID = -5428155796242290716L;

    @Tag(4)
    private String bizId;

    @Tag(5)
    private String cardType;

    @Tag(3)
    private String iconUrl;

    @Tag(1)
    private String name;

    @Tag(7)
    List<PayCardInfo> payCardInfos;

    @Tag(2)
    private String subName;

    @Tag(6)
    private String subNameColor;

    public boolean equals(Object obj) {
        if (toString().equals(obj.toString())) {
            return true;
        }
        return super.equals(obj);
    }

    public String getBizId() {
        return this.bizId;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getName() {
        return this.name;
    }

    public List<PayCardInfo> getPayCardInfos() {
        return this.payCardInfos;
    }

    public String getSubName() {
        return this.subName;
    }

    public String getSubNameColor() {
        return this.subNameColor;
    }

    public void setBizId(String str) {
        this.bizId = str;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPayCardInfos(List<PayCardInfo> list) {
        this.payCardInfos = list;
    }

    public void setSubName(String str) {
        this.subName = str;
    }

    public void setSubNameColor(String str) {
        this.subNameColor = str;
    }

    public String toString() {
        return "CardPackageRspVo{name='" + this.name + "', subName='" + this.subName + "', iconUrl='" + this.iconUrl + "', bizId='" + this.bizId + "', cardType='" + this.cardType + "', subNameColor='" + this.subNameColor + "', payCardInfos=" + this.payCardInfos + '}';
    }
}
