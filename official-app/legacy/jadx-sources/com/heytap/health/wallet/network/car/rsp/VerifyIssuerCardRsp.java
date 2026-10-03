package com.heytap.health.wallet.network.car.rsp;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class VerifyIssuerCardRsp {

    @Tag(5)
    private String appId;

    @Tag(2)
    private String cardImg;

    @Tag(1)
    private String cardLogo;

    @Tag(3)
    private String content;

    @Tag(4)
    private Boolean existOtherKey;

    public String getAppId() {
        return this.appId;
    }

    public String getCardImg() {
        return this.cardImg;
    }

    public String getCardLogo() {
        return this.cardLogo;
    }

    public String getContent() {
        return this.content;
    }

    public Boolean getExistOtherKey() {
        return this.existOtherKey;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCardImg(String str) {
        this.cardImg = str;
    }

    public void setCardLogo(String str) {
        this.cardLogo = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setExistOtherKey(Boolean bool) {
        this.existOtherKey = bool;
    }

    public String toString() {
        return "VerifyIssuerCardRsp{cardLogo='" + this.cardLogo + "', cardImg='" + this.cardImg + "', content='" + this.content + "', existOtherKey=" + this.existOtherKey + '}';
    }
}
