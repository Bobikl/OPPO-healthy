package com.heytap.health.wallet.model.db;

import androidx.annotation.Keep;
import io.protostuff.Exclude;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class EntranceCard {

    @Tag(2)
    private String aid;

    @Tag(1)
    private String appCode;

    @Tag(4)
    private String cardImgUrl;

    @Tag(8)
    private String cardLabel;

    @Tag(3)
    private String cardName;

    @Tag(7)
    private String cardThumbUrl;

    @Tag(11)
    private boolean isDefault;

    @Exclude
    private String localImgPath;

    @Exclude
    private String localImgSelPath;

    @Tag(9)
    private String logoUrl;

    @Tag(6)
    private String officalUrl;

    @Tag(10)
    private String status;

    @Tag(5)
    private String unionUrl;

    public EntranceCard() {
    }

    public String getAid() {
        return this.aid;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public String getCardImgUrl() {
        return this.cardImgUrl;
    }

    public String getCardLabel() {
        return this.cardLabel;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardThumbUrl() {
        return this.cardThumbUrl;
    }

    public boolean getIsDefault() {
        return this.isDefault;
    }

    public String getLocalImgPath() {
        return this.localImgPath;
    }

    public String getLocalImgSelPath() {
        return this.localImgSelPath;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public String getOfficalUrl() {
        return this.officalUrl;
    }

    public String getStatus() {
        return this.status;
    }

    public String getUnionUrl() {
        return this.unionUrl;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setCardImgUrl(String str) {
        this.cardImgUrl = str;
    }

    public void setCardLabel(String str) {
        this.cardLabel = str;
    }

    public void setCardName(String str) {
        this.cardName = str;
    }

    public void setCardThumbUrl(String str) {
        this.cardThumbUrl = str;
    }

    public void setIsDefault(boolean z) {
        this.isDefault = z;
    }

    public void setLocalImgPath(String str) {
        this.localImgPath = str;
    }

    public void setLocalImgSelPath(String str) {
        this.localImgSelPath = str;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public void setOfficalUrl(String str) {
        this.officalUrl = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setUnionUrl(String str) {
        this.unionUrl = str;
    }

    public String toString() {
        return "EntranceCard{appCode='" + this.appCode + "', aid='" + this.aid + "', cardName='" + this.cardName + "', cardThumbUrl='" + this.cardThumbUrl + "', cardImgUrl='" + this.cardImgUrl + "', unionUrl='" + this.unionUrl + "', officalUrl='" + this.officalUrl + "', cardLabel='" + this.cardLabel + "', logoUrl='" + this.logoUrl + "', isDefault=" + this.isDefault + ", localImgPath='" + this.localImgPath + "', localImgSelPos='" + this.localImgSelPath + "'}";
    }

    public EntranceCard(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12) {
        this.appCode = str;
        this.aid = str2;
        this.cardName = str3;
        this.cardImgUrl = str4;
        this.unionUrl = str5;
        this.officalUrl = str6;
        this.cardThumbUrl = str7;
        this.cardLabel = str8;
        this.logoUrl = str9;
        this.status = str10;
        this.isDefault = z;
        this.localImgPath = str11;
        this.localImgSelPath = str12;
    }
}
