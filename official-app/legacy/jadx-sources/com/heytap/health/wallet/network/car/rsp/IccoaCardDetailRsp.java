package com.heytap.health.wallet.network.car.rsp;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class IccoaCardDetailRsp {
    public static int IS_ACTIVATED = 1;
    public static String KEY_TYPE_OWNER = "OWNER";
    public static String KEY_TYPE_SHARED = "SHARED";
    public static int SUPPORT_ALL = 3;
    public static int SUPPORT_BLE = 1;
    public static int SUPPORT_NFC = 2;
    public static int UNACTIVATED;

    @Tag(6)
    private Integer activated;

    @Tag(1)
    private String aid;

    @Tag(16)
    private String appId;

    @Tag(15)
    private Boolean carControlSupport;

    @Tag(2)
    private String cardId;

    @Tag(7)
    private String cardUrl;

    @Tag(11)
    private String faqTitle;

    @Tag(12)
    private String faqUrl;

    @Tag(3)
    private String keyId;

    @Tag(4)
    private String keyName;

    @Tag(22)
    private String keyPrivilegeDes;

    @Tag(21)
    private String keyPrivilegeValue;

    @Tag(10)
    private String keyType;

    @Tag(23)
    private String pkg;

    @Tag(8)
    private String serviceTel;

    @Tag(19)
    private String shareKeyShowTip;

    @Tag(18)
    private Integer shareKeyStatus;

    @Tag(20)
    private String shareKeyValidityPeriodTip;

    @Tag(17)
    private String shareUrl;

    @Tag(5)
    private String status;

    @Tag(9)
    private String vehicleModel;

    @Tag(13)
    private String vehicleOemId;

    @Tag(14)
    private Integer vehicleSupportType;

    public Integer getActivated() {
        return this.activated;
    }

    public String getAid() {
        return this.aid;
    }

    public String getAppId() {
        return this.appId;
    }

    public Boolean getCarControlSupport() {
        return this.carControlSupport;
    }

    public String getCardId() {
        return this.cardId;
    }

    public String getCardUrl() {
        return this.cardUrl;
    }

    public String getFaqTitle() {
        return this.faqTitle;
    }

    public String getFaqUrl() {
        return this.faqUrl;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public String getKeyPrivilegeDes() {
        return this.keyPrivilegeDes;
    }

    public String getKeyPrivilegeValue() {
        return this.keyPrivilegeValue;
    }

    public String getKeyType() {
        return this.keyType;
    }

    public String getPkg() {
        return this.pkg;
    }

    public String getServiceTel() {
        return this.serviceTel;
    }

    public String getShareKeyShowTip() {
        return this.shareKeyShowTip;
    }

    public Integer getShareKeyStatus() {
        return this.shareKeyStatus;
    }

    public String getShareKeyValidityPeriodTip() {
        return this.shareKeyValidityPeriodTip;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getStatus() {
        return this.status;
    }

    public String getVehicleModel() {
        return this.vehicleModel;
    }

    public String getVehicleOemId() {
        return this.vehicleOemId;
    }

    public Integer getVehicleSupportType() {
        return this.vehicleSupportType;
    }

    public void setActivated(Integer num) {
        this.activated = num;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCarControlSupport(Boolean bool) {
        this.carControlSupport = bool;
    }

    public void setCardId(String str) {
        this.cardId = str;
    }

    public void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public void setFaqTitle(String str) {
        this.faqTitle = str;
    }

    public void setFaqUrl(String str) {
        this.faqUrl = str;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setKeyName(String str) {
        this.keyName = str;
    }

    public void setKeyPrivilegeDes(String str) {
        this.keyPrivilegeDes = str;
    }

    public void setKeyPrivilegeValue(String str) {
        this.keyPrivilegeValue = str;
    }

    public void setKeyType(String str) {
        this.keyType = str;
    }

    public void setPkg(String str) {
        this.pkg = str;
    }

    public void setServiceTel(String str) {
        this.serviceTel = str;
    }

    public void setShareKeyShowTip(String str) {
        this.shareKeyShowTip = str;
    }

    public void setShareKeyStatus(Integer num) {
        this.shareKeyStatus = num;
    }

    public void setShareKeyValidityPeriodTip(String str) {
        this.shareKeyValidityPeriodTip = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setVehicleModel(String str) {
        this.vehicleModel = str;
    }

    public void setVehicleOemId(String str) {
        this.vehicleOemId = str;
    }

    public void setVehicleSupportType(Integer num) {
        this.vehicleSupportType = num;
    }

    public String toString() {
        return "IccoaCardDetailRsp{aid='" + this.aid + "', cardId='" + this.cardId + "', keyId='" + this.keyId + "', keyName='" + this.keyName + "', status='" + this.status + "', activated=" + this.activated + ", cardUrl='" + this.cardUrl + "', serviceTel='" + this.serviceTel + "', vehicleModel='" + this.vehicleModel + "', keyType='" + this.keyType + "', faqTitle='" + this.faqTitle + "', faqUrl='" + this.faqUrl + "', vehicleOemId='" + this.vehicleOemId + "', vehicleSupportType=" + this.vehicleSupportType + ", carControlSupport=" + this.carControlSupport + '}';
    }
}
