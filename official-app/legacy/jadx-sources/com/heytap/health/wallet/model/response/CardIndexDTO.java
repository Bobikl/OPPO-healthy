package com.heytap.health.wallet.model.response;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class CardIndexDTO {

    @Tag(11)
    private String abf;

    @Tag(3)
    private String aid;

    @Tag(2)
    private String appCode;

    @Tag(4)
    private String cardImg;

    @Tag(10)
    private String cardLabel;

    @Tag(1)
    private String cardName;

    @Tag(13)
    private String cardTag;

    @Tag(8)
    private String commendText;

    @Tag(12)
    private String data;

    @Tag(14)
    private String discountLink;

    @Tag(7)
    private String frameColor;

    @Tag(6)
    private String orderNo;

    @Tag(5)
    private String status;

    @Tag(9)
    private String textColor;

    public String getAbf() {
        return this.abf;
    }

    public String getAid() {
        return this.aid;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public String getCardImg() {
        return this.cardImg;
    }

    public String getCardLabel() {
        return this.cardLabel;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardTag() {
        return this.cardTag;
    }

    public String getCommendText() {
        return this.commendText;
    }

    public String getData() {
        return this.data;
    }

    public String getDiscountLink() {
        return this.discountLink;
    }

    public String getFrameColor() {
        return this.frameColor;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public void setAbf(String str) {
        this.abf = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setCardImg(String str) {
        this.cardImg = str;
    }

    public void setCardLabel(String str) {
        this.cardLabel = str;
    }

    public void setCardName(String str) {
        this.cardName = str;
    }

    public void setCardTag(String str) {
        this.cardTag = str;
    }

    public void setCommendText(String str) {
        this.commendText = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDiscountLink(String str) {
        this.discountLink = str;
    }

    public void setFrameColor(String str) {
        this.frameColor = str;
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }
}
