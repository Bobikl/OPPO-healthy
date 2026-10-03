package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import io.protostuff.Exclude;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class ODeviceCardRspVO {

    @Tag(11)
    private String abf;

    @Tag(7)
    private String appCode;

    @Tag(9)
    private Long balance;

    @Tag(5)
    private String cardStatus;

    @Tag(6)
    private String cardStatusTip;

    @Tag(4)
    private String cardType;

    @Tag(8)
    private String data;

    @Exclude
    private String deviceName;

    @Tag(2)
    private String displayDesc;

    @Tag(1)
    private String displayName;

    @Tag(10)
    private String flowNo;

    @Tag(3)
    private String iconUrl;

    @Tag(12)
    private int needParams;

    @Exclude
    private String otherDeviceCplc;

    @Tag(13)
    private Boolean removable;

    @Tag(14)
    private String removeRemark;

    public String getAbf() {
        return this.abf;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public Long getBalance() {
        return this.balance;
    }

    public String getCardStatus() {
        return this.cardStatus;
    }

    public String getCardStatusTip() {
        return this.cardStatusTip;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getData() {
        return this.data;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDisplayDesc() {
        return this.displayDesc;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getFlowNo() {
        return this.flowNo;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getNeedParams() {
        return this.needParams;
    }

    public String getOtherDeviceCplc() {
        return this.otherDeviceCplc;
    }

    public Boolean getRemovable() {
        return this.removable;
    }

    public String getRemoveRemark() {
        return this.removeRemark;
    }

    public void setAbf(String str) {
        this.abf = str;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setBalance(Long l2) {
        this.balance = l2;
    }

    public void setCardStatus(String str) {
        this.cardStatus = str;
    }

    public void setCardStatusTip(String str) {
        this.cardStatusTip = str;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDisplayDesc(String str) {
        this.displayDesc = str;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setFlowNo(String str) {
        this.flowNo = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setNeedParams(int i) {
        this.needParams = i;
    }

    public void setOtherDeviceCplc(String str) {
        this.otherDeviceCplc = str;
    }

    public void setRemovable(Boolean bool) {
        this.removable = bool;
    }

    public void setRemoveRemark(String str) {
        this.removeRemark = str;
    }
}
