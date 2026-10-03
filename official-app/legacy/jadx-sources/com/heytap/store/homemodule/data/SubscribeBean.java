package com.heytap.store.homemodule.data;

import com.heytap.store.base.core.data.IBean;

/* JADX INFO: loaded from: classes5.dex */
public class SubscribeBean implements IBean {
    public static int CARD_GRAVITY_CNETER = 1;
    public static int CARD_GRAVITY_RIGHT = 2;
    public static int STATE_BOOKED = 1;
    public static int STATE_UNBOOKED;
    public String advanceColor;
    public Long bookNum;
    public String bookedBtnText;
    public String bookedText;
    public String btnColor;
    public String btnText;
    public Integer cardGravity;
    public String firstCategory;
    public Long goodsSpuId;
    public Integer isBooked;
    public String secondCategory;
    public String skipLink;
    public Long skuId;

    public String getAdvanceColor() {
        return this.advanceColor;
    }

    public Long getBookNum() {
        return this.bookNum;
    }

    public String getBookedBtnText() {
        return this.bookedBtnText;
    }

    public String getBookedText() {
        return this.bookedText;
    }

    public String getBtnColor() {
        return this.btnColor;
    }

    public String getBtnText() {
        return this.btnText;
    }

    public Integer getCardGravity() {
        return this.cardGravity;
    }

    public String getFirstCategory() {
        return this.firstCategory;
    }

    public Long getGoodsSpuId() {
        return this.goodsSpuId;
    }

    public Integer getIsBooked() {
        return this.isBooked;
    }

    public String getSecondCategory() {
        return this.secondCategory;
    }

    public String getSkipLink() {
        return this.skipLink;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setAdvanceColor(String str) {
        this.advanceColor = str;
    }

    public void setBookNum(Long l2) {
        this.bookNum = l2;
    }

    public void setBookedBtnText(String str) {
        this.bookedBtnText = str;
    }

    public void setBookedText(String str) {
        this.bookedText = str;
    }

    public void setBtnColor(String str) {
        this.btnColor = str;
    }

    public void setBtnText(String str) {
        this.btnText = str;
    }

    public void setCardGravity(Integer num) {
        this.cardGravity = num;
    }

    public void setFirstCategory(String str) {
        this.firstCategory = str;
    }

    public void setGoodsSpuId(Long l2) {
        this.goodsSpuId = l2;
    }

    public void setIsBooked(Integer num) {
        this.isBooked = num;
    }

    public void setSecondCategory(String str) {
        this.secondCategory = str;
    }

    public void setSkipLink(String str) {
        this.skipLink = str;
    }

    public void setSkuId(Long l2) {
        this.skuId = l2;
    }

    public String toString() {
        return "SubscribeBean{skuId=" + this.skuId + ", cardGravity=" + this.cardGravity + ", btnText='" + this.btnText + "', btnColor='" + this.btnColor + "', bookNum=" + this.bookNum + ", advanceColor='" + this.advanceColor + "', isBooked=" + this.isBooked + ", bookedText='" + this.bookedText + "', bookedBtnText='" + this.bookedBtnText + "', skipLink='" + this.skipLink + "', goodsSpuId=" + this.goodsSpuId + ", firstCategory='" + this.firstCategory + "', secondCategory='" + this.secondCategory + "'}";
    }
}
