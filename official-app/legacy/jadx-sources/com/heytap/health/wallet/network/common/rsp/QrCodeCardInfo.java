package com.heytap.health.wallet.network.common.rsp;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.q1h;
import io.protostuff.Exclude;
import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class QrCodeCardInfo implements Serializable, q1h.b {
    private static final long serialVersionUID = -2683485365313487584L;

    @Tag(7)
    private String abf;

    @Tag(6)
    private String aid;

    @Tag(2)
    private String appCode;

    @Tag(3)
    private String cardImg;

    @Tag(1)
    private String cardName;

    @Tag(4)
    private String cardStatus;

    @Tag(8)
    private Byte cardType;

    @Exclude
    private String deviceName;

    @Exclude
    private String failReason;

    @Exclude
    private String orderNo;

    @Exclude
    private String otherDeviceCplc;

    @Tag(9)
    private String parentAppCode;

    @Tag(5)
    private String shiftOutOrderNo;

    @Exclude
    private int type;

    public QrCodeCardInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.cardName = str;
        this.appCode = str2;
        this.cardImg = str3;
        this.cardStatus = str4;
        this.shiftOutOrderNo = str5;
        this.aid = str6;
        this.orderNo = str7;
        this.abf = str8;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public String getCardName() {
        return this.cardName;
    }

    public String getCardStatus() {
        return this.cardStatus;
    }

    public Byte getCardType() {
        return this.cardType;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getFailReason() {
        return this.failReason;
    }

    @Override // com.oplus.aiunit.vision.q1h.b
    public String getImageUrl() {
        return this.cardImg;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public String getOtherDeviceCplc() {
        return this.otherDeviceCplc;
    }

    public String getParentAppCode() {
        return this.parentAppCode;
    }

    public String getShiftOutOrderNo() {
        return this.shiftOutOrderNo;
    }

    public int getType() {
        return this.type;
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

    public void setCardName(String str) {
        this.cardName = str;
    }

    public void setCardStatus(String str) {
        this.cardStatus = str;
    }

    public void setCardType(Byte b) {
        this.cardType = b;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setFailReason(String str) {
        this.failReason = str;
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }

    public void setOtherDeviceCplc(String str) {
        this.otherDeviceCplc = str;
    }

    public void setParentAppCode(String str) {
        this.parentAppCode = str;
    }

    public void setShiftOutOrderNo(String str) {
        this.shiftOutOrderNo = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public QrCodeCardInfo() {
    }
}
