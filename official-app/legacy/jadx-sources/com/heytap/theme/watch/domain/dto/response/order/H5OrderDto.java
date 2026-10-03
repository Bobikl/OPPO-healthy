package com.heytap.theme.watch.domain.dto.response.order;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class H5OrderDto implements Serializable {
    private static final long serialVersionUID = 4194443871471221754L;

    @Tag(5)
    private Long expireTime;

    @Tag(2)
    private String orderId;

    @Tag(3)
    private String partnerCode;

    @Tag(8)
    private String payReqId;

    @Tag(1)
    private String payUrl;

    @Tag(4)
    private String prePayToken;

    @Tag(7)
    private String price;

    @Tag(6)
    private String productName;

    public Long getExpireTime() {
        return this.expireTime;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPartnerCode() {
        return this.partnerCode;
    }

    public String getPayReqId() {
        return this.payReqId;
    }

    public String getPayUrl() {
        return this.payUrl;
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

    public void setExpireTime(Long l2) {
        this.expireTime = l2;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setPartnerCode(String str) {
        this.partnerCode = str;
    }

    public void setPayReqId(String str) {
        this.payReqId = str;
    }

    public void setPayUrl(String str) {
        this.payUrl = str;
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
        return "H5OrderDto{payUrl='" + this.payUrl + "', orderId='" + this.orderId + "', partnerCode='" + this.partnerCode + "', prePayToken='" + this.prePayToken + "', expireTime=" + this.expireTime + ", productName='" + this.productName + "', price='" + this.price + "', payReqId='" + this.payReqId + "'}";
    }
}
