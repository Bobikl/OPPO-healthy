package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\bN\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010H\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÐ\u0002\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010]J\u0013\u0010^\u001a\u00020\u00122\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010`\u001a\u00020aHÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010-R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010$\u001a\u0004\b2\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010$\u001a\u0004\b4\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010$\u001a\u0004\b6\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010$\u001a\u0004\b:\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010!R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010!\"\u0004\b@\u0010-¨\u0006c"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/CardDetail;", "", "aid", "", "cardName", "appCode", "cardLabel", "cardUrl", "unionUrl", "logoUrl", "cardNoteUrl", "userAgreementUrl", "status", "orderNo", "message", "cardDesc", "serviceTel", "allowDeleted", "", "showRedPoint", "cardImg", "shiftFailEnum", "maintaining", "userShiftUrl", "displayMsg", "serviceTelephone", "refundServiceFee", "thirdExtraInfo", "needUpgradeCard", "cardTag", "discountInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAid", "()Ljava/lang/String;", "getAllowDeleted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAppCode", "getCardDesc", "getCardImg", "getCardLabel", "getCardName", "getCardNoteUrl", "getCardTag", "setCardTag", "(Ljava/lang/String;)V", "getCardUrl", "getDiscountInfo", "getDisplayMsg", "getLogoUrl", "getMaintaining", "getMessage", "getNeedUpgradeCard", "getOrderNo", "getRefundServiceFee", "getServiceTel", "getServiceTelephone", "getShiftFailEnum", "getShowRedPoint", "getStatus", "getThirdExtraInfo", "getUnionUrl", "getUserAgreementUrl", "getUserShiftUrl", "setUserShiftUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/health/wallet/network/bus/rsp/CardDetail;", "equals", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardDetail {

    @NotNull
    private final String aid;

    @Nullable
    private final Boolean allowDeleted;

    @Nullable
    private final String appCode;

    @Nullable
    private final String cardDesc;

    @Nullable
    private final String cardImg;

    @Nullable
    private final String cardLabel;

    @Nullable
    private final String cardName;

    @Nullable
    private final String cardNoteUrl;

    @Nullable
    private String cardTag;

    @Nullable
    private final String cardUrl;

    @Nullable
    private final String discountInfo;

    @Nullable
    private final String displayMsg;

    @Nullable
    private final String logoUrl;

    @Nullable
    private final Boolean maintaining;

    @Nullable
    private final String message;

    @Nullable
    private final Boolean needUpgradeCard;

    @Nullable
    private final String orderNo;

    @Nullable
    private final Boolean refundServiceFee;

    @Nullable
    private final String serviceTel;

    @Nullable
    private final String serviceTelephone;

    @Nullable
    private final String shiftFailEnum;

    @Nullable
    private final Boolean showRedPoint;

    @Nullable
    private final String status;

    @Nullable
    private final String thirdExtraInfo;

    @Nullable
    private final String unionUrl;

    @Nullable
    private final String userAgreementUrl;

    @Nullable
    private String userShiftUrl;

    public CardDetail(@NotNull String aid, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str14, @Nullable String str15, @Nullable Boolean bool3, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable Boolean bool4, @Nullable String str19, @Nullable Boolean bool5, @Nullable String str20, @Nullable String str21) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        this.aid = aid;
        this.cardName = str;
        this.appCode = str2;
        this.cardLabel = str3;
        this.cardUrl = str4;
        this.unionUrl = str5;
        this.logoUrl = str6;
        this.cardNoteUrl = str7;
        this.userAgreementUrl = str8;
        this.status = str9;
        this.orderNo = str10;
        this.message = str11;
        this.cardDesc = str12;
        this.serviceTel = str13;
        this.allowDeleted = bool;
        this.showRedPoint = bool2;
        this.cardImg = str14;
        this.shiftFailEnum = str15;
        this.maintaining = bool3;
        this.userShiftUrl = str16;
        this.displayMsg = str17;
        this.serviceTelephone = str18;
        this.refundServiceFee = bool4;
        this.thirdExtraInfo = str19;
        this.needUpgradeCard = bool5;
        this.cardTag = str20;
        this.discountInfo = str21;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCardDesc() {
        return this.cardDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getServiceTel() {
        return this.serviceTel;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getAllowDeleted() {
        return this.allowDeleted;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getShowRedPoint() {
        return this.showRedPoint;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCardImg() {
        return this.cardImg;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getShiftFailEnum() {
        return this.shiftFailEnum;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getMaintaining() {
        return this.maintaining;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getUserShiftUrl() {
        return this.userShiftUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getDisplayMsg() {
        return this.displayMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getServiceTelephone() {
        return this.serviceTelephone;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getRefundServiceFee() {
        return this.refundServiceFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getThirdExtraInfo() {
        return this.thirdExtraInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getNeedUpgradeCard() {
        return this.needUpgradeCard;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getCardTag() {
        return this.cardTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getDiscountInfo() {
        return this.discountInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardLabel() {
        return this.cardLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCardUrl() {
        return this.cardUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUnionUrl() {
        return this.unionUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCardNoteUrl() {
        return this.cardNoteUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUserAgreementUrl() {
        return this.userAgreementUrl;
    }

    @NotNull
    public final CardDetail copy(@NotNull String aid, @Nullable String cardName, @Nullable String appCode, @Nullable String cardLabel, @Nullable String cardUrl, @Nullable String unionUrl, @Nullable String logoUrl, @Nullable String cardNoteUrl, @Nullable String userAgreementUrl, @Nullable String status, @Nullable String orderNo, @Nullable String message, @Nullable String cardDesc, @Nullable String serviceTel, @Nullable Boolean allowDeleted, @Nullable Boolean showRedPoint, @Nullable String cardImg, @Nullable String shiftFailEnum, @Nullable Boolean maintaining, @Nullable String userShiftUrl, @Nullable String displayMsg, @Nullable String serviceTelephone, @Nullable Boolean refundServiceFee, @Nullable String thirdExtraInfo, @Nullable Boolean needUpgradeCard, @Nullable String cardTag, @Nullable String discountInfo) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        return new CardDetail(aid, cardName, appCode, cardLabel, cardUrl, unionUrl, logoUrl, cardNoteUrl, userAgreementUrl, status, orderNo, message, cardDesc, serviceTel, allowDeleted, showRedPoint, cardImg, shiftFailEnum, maintaining, userShiftUrl, displayMsg, serviceTelephone, refundServiceFee, thirdExtraInfo, needUpgradeCard, cardTag, discountInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDetail)) {
            return false;
        }
        CardDetail cardDetail = (CardDetail) other;
        return Intrinsics.areEqual(this.aid, cardDetail.aid) && Intrinsics.areEqual(this.cardName, cardDetail.cardName) && Intrinsics.areEqual(this.appCode, cardDetail.appCode) && Intrinsics.areEqual(this.cardLabel, cardDetail.cardLabel) && Intrinsics.areEqual(this.cardUrl, cardDetail.cardUrl) && Intrinsics.areEqual(this.unionUrl, cardDetail.unionUrl) && Intrinsics.areEqual(this.logoUrl, cardDetail.logoUrl) && Intrinsics.areEqual(this.cardNoteUrl, cardDetail.cardNoteUrl) && Intrinsics.areEqual(this.userAgreementUrl, cardDetail.userAgreementUrl) && Intrinsics.areEqual(this.status, cardDetail.status) && Intrinsics.areEqual(this.orderNo, cardDetail.orderNo) && Intrinsics.areEqual(this.message, cardDetail.message) && Intrinsics.areEqual(this.cardDesc, cardDetail.cardDesc) && Intrinsics.areEqual(this.serviceTel, cardDetail.serviceTel) && Intrinsics.areEqual(this.allowDeleted, cardDetail.allowDeleted) && Intrinsics.areEqual(this.showRedPoint, cardDetail.showRedPoint) && Intrinsics.areEqual(this.cardImg, cardDetail.cardImg) && Intrinsics.areEqual(this.shiftFailEnum, cardDetail.shiftFailEnum) && Intrinsics.areEqual(this.maintaining, cardDetail.maintaining) && Intrinsics.areEqual(this.userShiftUrl, cardDetail.userShiftUrl) && Intrinsics.areEqual(this.displayMsg, cardDetail.displayMsg) && Intrinsics.areEqual(this.serviceTelephone, cardDetail.serviceTelephone) && Intrinsics.areEqual(this.refundServiceFee, cardDetail.refundServiceFee) && Intrinsics.areEqual(this.thirdExtraInfo, cardDetail.thirdExtraInfo) && Intrinsics.areEqual(this.needUpgradeCard, cardDetail.needUpgradeCard) && Intrinsics.areEqual(this.cardTag, cardDetail.cardTag) && Intrinsics.areEqual(this.discountInfo, cardDetail.discountInfo);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final Boolean getAllowDeleted() {
        return this.allowDeleted;
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCardDesc() {
        return this.cardDesc;
    }

    @Nullable
    public final String getCardImg() {
        return this.cardImg;
    }

    @Nullable
    public final String getCardLabel() {
        return this.cardLabel;
    }

    @Nullable
    public final String getCardName() {
        return this.cardName;
    }

    @Nullable
    public final String getCardNoteUrl() {
        return this.cardNoteUrl;
    }

    @Nullable
    public final String getCardTag() {
        return this.cardTag;
    }

    @Nullable
    public final String getCardUrl() {
        return this.cardUrl;
    }

    @Nullable
    public final String getDiscountInfo() {
        return this.discountInfo;
    }

    @Nullable
    public final String getDisplayMsg() {
        return this.displayMsg;
    }

    @Nullable
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @Nullable
    public final Boolean getMaintaining() {
        return this.maintaining;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Boolean getNeedUpgradeCard() {
        return this.needUpgradeCard;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final Boolean getRefundServiceFee() {
        return this.refundServiceFee;
    }

    @Nullable
    public final String getServiceTel() {
        return this.serviceTel;
    }

    @Nullable
    public final String getServiceTelephone() {
        return this.serviceTelephone;
    }

    @Nullable
    public final String getShiftFailEnum() {
        return this.shiftFailEnum;
    }

    @Nullable
    public final Boolean getShowRedPoint() {
        return this.showRedPoint;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getThirdExtraInfo() {
        return this.thirdExtraInfo;
    }

    @Nullable
    public final String getUnionUrl() {
        return this.unionUrl;
    }

    @Nullable
    public final String getUserAgreementUrl() {
        return this.userAgreementUrl;
    }

    @Nullable
    public final String getUserShiftUrl() {
        return this.userShiftUrl;
    }

    public int hashCode() {
        int iHashCode = this.aid.hashCode() * 31;
        String str = this.cardName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardLabel;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.unionUrl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.logoUrl;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardNoteUrl;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.userAgreementUrl;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.status;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.orderNo;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.message;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.cardDesc;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.serviceTel;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.allowDeleted;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showRedPoint;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str14 = this.cardImg;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.shiftFailEnum;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool3 = this.maintaining;
        int iHashCode19 = (iHashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str16 = this.userShiftUrl;
        int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.displayMsg;
        int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.serviceTelephone;
        int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool4 = this.refundServiceFee;
        int iHashCode23 = (iHashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str19 = this.thirdExtraInfo;
        int iHashCode24 = (iHashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Boolean bool5 = this.needUpgradeCard;
        int iHashCode25 = (iHashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str20 = this.cardTag;
        int iHashCode26 = (iHashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.discountInfo;
        return iHashCode26 + (str21 != null ? str21.hashCode() : 0);
    }

    public final void setCardTag(@Nullable String str) {
        this.cardTag = str;
    }

    public final void setUserShiftUrl(@Nullable String str) {
        this.userShiftUrl = str;
    }

    @NotNull
    public String toString() {
        return "CardDetail(aid=" + this.aid + ", cardName=" + this.cardName + ", appCode=" + this.appCode + ", cardLabel=" + this.cardLabel + ", cardUrl=" + this.cardUrl + ", unionUrl=" + this.unionUrl + ", logoUrl=" + this.logoUrl + ", cardNoteUrl=" + this.cardNoteUrl + ", userAgreementUrl=" + this.userAgreementUrl + ", status=" + this.status + ", orderNo=" + this.orderNo + ", message=" + this.message + ", cardDesc=" + this.cardDesc + ", serviceTel=" + this.serviceTel + ", allowDeleted=" + this.allowDeleted + ", showRedPoint=" + this.showRedPoint + ", cardImg=" + this.cardImg + ", shiftFailEnum=" + this.shiftFailEnum + ", maintaining=" + this.maintaining + ", userShiftUrl=" + this.userShiftUrl + ", displayMsg=" + this.displayMsg + ", serviceTelephone=" + this.serviceTelephone + ", refundServiceFee=" + this.refundServiceFee + ", thirdExtraInfo=" + this.thirdExtraInfo + ", needUpgradeCard=" + this.needUpgradeCard + ", cardTag=" + this.cardTag + ", discountInfo=" + this.discountInfo + ")";
    }

    public /* synthetic */ CardDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, Boolean bool2, String str15, String str16, Boolean bool3, String str17, String str18, String str19, Boolean bool4, String str20, Boolean bool5, String str21, String str22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, bool, bool2, str15, str16, bool3, str17, str18, str19, bool4, str20, (i & 16777216) != 0 ? Boolean.FALSE : bool5, str21, str22);
    }
}
