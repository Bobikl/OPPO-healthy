package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import io.protostuff.Exclude;
import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class UserAllDeviceCardDto implements Serializable {
    private static final long serialVersionUID = -1;

    @Tag(11)
    private String abf;

    @Tag(4)
    private String aid;

    @Tag(3)
    private String appCode;

    @Tag(7)
    private String cardImg;

    @Tag(2)
    private String cardName;

    @Tag(5)
    private String cardShiftDesc;

    @Tag(6)
    private String cardShiftDescDetail;

    @Tag(12)
    private Byte cardType;

    @Exclude
    private String deviceName;

    @Tag(1)
    private boolean isAllowedShiftIn;

    @Tag(9)
    private boolean needCollectPhone;

    @Exclude
    private String otherDeviceCplc;

    @Tag(10)
    private String shiftOutOrderNo;

    @Tag(8)
    private String shiftTips;

    public UserAllDeviceCardDto() {
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

    public String getCardShiftDesc() {
        return this.cardShiftDesc;
    }

    public String getCardShiftDescDetail() {
        return this.cardShiftDescDetail;
    }

    public Byte getCardType() {
        return this.cardType;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public boolean getNeedCollectPhone() {
        return this.needCollectPhone;
    }

    public String getOtherDeviceCplc() {
        return this.otherDeviceCplc;
    }

    public String getShiftOutOrderNo() {
        return this.shiftOutOrderNo;
    }

    public String getShiftTips() {
        return this.shiftTips;
    }

    public boolean isAllowedShiftIn() {
        return this.isAllowedShiftIn;
    }

    public void setAbf(String str) {
        this.abf = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAllowedShiftIn(boolean z) {
        this.isAllowedShiftIn = z;
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

    public void setCardShiftDesc(String str) {
        this.cardShiftDesc = str;
    }

    public void setCardShiftDescDetail(String str) {
        this.cardShiftDescDetail = str;
    }

    public void setCardType(Byte b) {
        this.cardType = b;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setNeedCollectPhone(boolean z) {
        this.needCollectPhone = z;
    }

    public void setOtherDeviceCplc(String str) {
        this.otherDeviceCplc = str;
    }

    public void setShiftOutOrderNo(String str) {
        this.shiftOutOrderNo = str;
    }

    public void setShiftTips(String str) {
        this.shiftTips = str;
    }

    public UserAllDeviceCardDto(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2) {
        this.isAllowedShiftIn = z;
        this.cardName = str;
        this.cardShiftDesc = str2;
        this.cardShiftDescDetail = str3;
        this.cardImg = str4;
        this.shiftTips = str5;
        this.needCollectPhone = z2;
    }
}
