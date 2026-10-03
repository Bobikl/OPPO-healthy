package com.heytap.health.wallet.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.heytap.health.wallet.model.response.CardIndexDTO;
import com.oplus.aiunit.vision.d04;
import com.oplus.aiunit.vision.e1j;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class NfcCardDetail implements Comparable<NfcCardDetail>, Parcelable {
    public static final Parcelable.Creator<NfcCardDetail> CREATOR = new a();
    private String ThirdExtraInfo;
    String abf;
    String aid;
    String appCode;
    int balance;
    String cardImg;
    String cardImgUrl;
    String cardLabel;
    String cardName;
    String cardNo;
    String cardNoteUrl;
    private String cardTag;
    String cardThumbUrl;
    String commendText;
    private String discountLink;
    String extraData;
    String frameColor;
    boolean isDefault;
    String logoUrl;
    String message;
    String noticeMsg;
    String officalUrl;
    String orderNo;
    String scopeUrl;
    String status;
    String textColor;
    String trafficTag;
    String unionUrl;
    String userAgreementUrl;

    public class a implements Parcelable.Creator<NfcCardDetail> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NfcCardDetail createFromParcel(Parcel parcel) {
            return new NfcCardDetail(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NfcCardDetail[] newArray(int i) {
            return new NfcCardDetail[i];
        }
    }

    public NfcCardDetail(CardIndexDTO cardIndexDTO) {
        this.cardName = cardIndexDTO.getCardName();
        this.appCode = cardIndexDTO.getAppCode();
        this.aid = cardIndexDTO.getAid();
        this.cardLabel = cardIndexDTO.getCardLabel();
        this.cardImg = cardIndexDTO.getCardImg();
        this.status = cardIndexDTO.getStatus();
        this.orderNo = cardIndexDTO.getOrderNo();
        this.frameColor = cardIndexDTO.getFrameColor();
        this.commendText = cardIndexDTO.getCommendText();
        this.textColor = cardIndexDTO.getTextColor();
        this.abf = cardIndexDTO.getAbf();
        this.cardTag = cardIndexDTO.getCardTag();
        this.discountLink = cardIndexDTO.getDiscountLink();
    }

    public static NfcCardDetail fromJSON(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (NfcCardDetail) new Gson().fromJson(str, NfcCardDetail.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof NfcCardDetail)) {
            return false;
        }
        NfcCardDetail nfcCardDetail = (NfcCardDetail) obj;
        String str2 = this.aid;
        return str2 != null && str2.equals(nfcCardDetail.getAid()) && this.balance == nfcCardDetail.balance && this.isDefault == nfcCardDetail.isDefault && (str = this.status) != null && str.equals(nfcCardDetail.getStatus());
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

    public int getBalance() {
        return this.balance;
    }

    public String getCardImg() {
        return this.cardImg;
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

    public String getCardNo() {
        return this.cardNo;
    }

    public String getCardNoteUrl() {
        return this.cardNoteUrl;
    }

    public String getCardTag() {
        return this.cardTag;
    }

    public String getCardThumbUrl() {
        return this.cardThumbUrl;
    }

    public String getCommendText() {
        return this.commendText;
    }

    public String getDiscountLink() {
        return this.discountLink;
    }

    public String getExtraData() {
        return this.extraData;
    }

    public String getFrameColor() {
        return this.frameColor;
    }

    public boolean getIsDefault() {
        return this.isDefault;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public String getMessage() {
        return this.message;
    }

    public String getNoticeMsg() {
        return this.noticeMsg;
    }

    public String getOfficalUrl() {
        return this.officalUrl;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public String getScopeUrl() {
        return this.scopeUrl;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public String getThirdExtraInfo() {
        return this.ThirdExtraInfo;
    }

    public String getTrafficTag() {
        return this.trafficTag;
    }

    public String getUnionUrl() {
        return this.unionUrl;
    }

    public String getUserAgreementUrl() {
        return this.userAgreementUrl;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public void resetDetail() {
        setStatus(d04.CARD_STATUS_ALLOW_OPEN);
        setBalance(0);
        setCardNo(null);
        setOrderNo(null);
        setDefault(false);
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

    public void setBalance(int i) {
        this.balance = i;
    }

    public void setCardImg(String str) {
        this.cardImg = str;
    }

    public NfcCardDetail setCardImgUrl(String str) {
        this.cardImgUrl = str;
        return this;
    }

    public void setCardLabel(String str) {
        this.cardLabel = str;
    }

    public void setCardName(String str) {
        this.cardName = str;
    }

    public void setCardNo(String str) {
        this.cardNo = str;
    }

    public void setCardNoteUrl(String str) {
        this.cardNoteUrl = str;
    }

    public void setCardTag(String str) {
        this.cardTag = str;
    }

    public NfcCardDetail setCardThumbUrl(String str) {
        this.cardThumbUrl = str;
        return this;
    }

    public void setCommendText(String str) {
        this.commendText = str;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }

    public void setDiscountLink(String str) {
        this.discountLink = str;
    }

    public void setExtraData(String str) {
        this.extraData = str;
    }

    public void setFrameColor(String str) {
        this.frameColor = str;
    }

    public void setIsDefault(boolean z) {
        this.isDefault = z;
    }

    public NfcCardDetail setLogoUrl(String str) {
        this.logoUrl = str;
        return this;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setNoticeMsg(String str) {
        this.noticeMsg = str;
    }

    public NfcCardDetail setOfficalUrl(String str) {
        this.officalUrl = str;
        return this;
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }

    public void setScopeUrl(String str) {
        this.scopeUrl = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    public void setThirdExtraInfo(String str) {
        this.ThirdExtraInfo = str;
    }

    public void setTrafficTag(String str) {
        this.trafficTag = str;
    }

    public NfcCardDetail setUnionUrl(String str) {
        this.unionUrl = str;
        return this;
    }

    public void setUserAgreementUrl(String str) {
        this.userAgreementUrl = str;
    }

    public String toString() {
        return "aid=" + this.aid + " name=" + this.cardName + " appCode=" + this.appCode + " balance=" + this.balance + " default=" + this.isDefault + " cardNo=" + this.cardNo + "  cardTag = " + this.cardTag + "  discountLink = " + this.discountLink + " ThirdExtraInfo = " + this.ThirdExtraInfo + " status = " + this.status;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardName);
        parcel.writeString(this.appCode);
        parcel.writeString(this.aid);
        parcel.writeString(this.cardLabel);
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.cardImgUrl);
        parcel.writeString(this.unionUrl);
        parcel.writeString(this.cardThumbUrl);
        parcel.writeString(this.officalUrl);
        parcel.writeString(this.cardNoteUrl);
        parcel.writeString(this.userAgreementUrl);
        parcel.writeString(this.status);
        parcel.writeString(this.orderNo);
        parcel.writeString(this.message);
        parcel.writeByte(this.isDefault ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.balance);
        parcel.writeString(this.cardNo);
        parcel.writeString(this.cardImg);
        parcel.writeString(this.frameColor);
        parcel.writeString(this.commendText);
        parcel.writeString(this.textColor);
        parcel.writeString(this.noticeMsg);
        parcel.writeString(this.trafficTag);
        parcel.writeString(this.abf);
        parcel.writeString(this.scopeUrl);
        parcel.writeString(this.extraData);
        parcel.writeString(this.cardTag);
        parcel.writeString(this.discountLink);
        parcel.writeString(this.ThirdExtraInfo);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull NfcCardDetail nfcCardDetail) {
        return e1j.s(this.appCode) - e1j.s(nfcCardDetail.appCode);
    }

    public NfcCardDetail(Parcel parcel) {
        this.cardName = parcel.readString();
        this.appCode = parcel.readString();
        this.aid = parcel.readString();
        this.cardLabel = parcel.readString();
        this.logoUrl = parcel.readString();
        this.cardImgUrl = parcel.readString();
        this.unionUrl = parcel.readString();
        this.cardThumbUrl = parcel.readString();
        this.officalUrl = parcel.readString();
        this.cardNoteUrl = parcel.readString();
        this.userAgreementUrl = parcel.readString();
        this.status = parcel.readString();
        this.orderNo = parcel.readString();
        this.message = parcel.readString();
        this.isDefault = parcel.readByte() != 0;
        this.balance = parcel.readInt();
        this.cardNo = parcel.readString();
        this.cardImg = parcel.readString();
        this.frameColor = parcel.readString();
        this.commendText = parcel.readString();
        this.textColor = parcel.readString();
        this.noticeMsg = parcel.readString();
        this.trafficTag = parcel.readString();
        this.abf = parcel.readString();
        this.scopeUrl = parcel.readString();
        this.extraData = parcel.readString();
        this.cardTag = parcel.readString();
        this.discountLink = parcel.readString();
        this.ThirdExtraInfo = parcel.readString();
    }

    public NfcCardDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, int i, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        this.cardName = str;
        this.appCode = str2;
        this.aid = str3;
        this.cardLabel = str4;
        this.logoUrl = str5;
        this.cardImgUrl = str6;
        this.unionUrl = str7;
        this.cardThumbUrl = str8;
        this.officalUrl = str9;
        this.cardNoteUrl = str10;
        this.userAgreementUrl = str11;
        this.status = str12;
        this.orderNo = str13;
        this.message = str14;
        this.isDefault = z;
        this.balance = i;
        this.cardNo = str15;
        this.cardImg = str16;
        this.frameColor = str17;
        this.commendText = str18;
        this.textColor = str19;
        this.abf = str20;
        this.cardTag = str21;
        this.discountLink = str22;
    }

    public NfcCardDetail() {
    }
}
