package com.heytap.theme.watch.domain.dto.response.order;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class PayResultDto implements Serializable {
    private static final long serialVersionUID = 7452820780680198498L;

    @Tag(2)
    private String channelOrderId;

    @Tag(7)
    private Long expireTime;

    @Tag(3)
    private Long masterId;

    @Tag(1)
    private String orderId;

    @Tag(4)
    private String partnerCode;

    @Tag(9)
    private Integer payStatus;

    @Tag(6)
    private String prePayToken;

    @Tag(5)
    private String price;

    @Tag(8)
    private String productName;

    public String getChannelOrderId() {
        return this.channelOrderId;
    }

    public Long getExpireTime() {
        return this.expireTime;
    }

    public Long getMasterId() {
        return this.masterId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPartnerCode() {
        return this.partnerCode;
    }

    public Integer getPayStatus() {
        return this.payStatus;
    }

    public String getPrePayToken() {
        return this.prePayToken;
    }

    public String getPrice() {
        return this.price;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setChannelOrderId(String str) {
        this.channelOrderId = str;
    }

    public void setExpireTime(Long l2) {
        this.expireTime = l2;
    }

    public void setMasterId(Long l2) {
        this.masterId = l2;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setPartnerCode(String str) {
        this.partnerCode = str;
    }

    public void setPayStatus(Integer num) {
        this.payStatus = num;
    }

    public void setPrePayToken(String str) {
        this.prePayToken = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProductName(String str) {
        this.productName = str;
    }

    public String toString() {
        return "PayResultDto{orderId='" + this.orderId + "', channelOrderId='" + this.channelOrderId + "', masterId=" + this.masterId + ", partnerCode='" + this.partnerCode + "', price='" + this.price + "', prePayToken='" + this.prePayToken + "', expireTime=" + this.expireTime + ", productName='" + this.productName + "', payStatus=" + this.payStatus + '}';
    }
}
