package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b=\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001c\u00102\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001c\u00105\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001e\u00108\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010\u000eR\u001c\u0010;\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR\u001c\u0010>\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR\u001c\u0010A\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR\u001c\u0010D\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0006\"\u0004\bF\u0010\b¨\u0006G"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/CardDetail;", "", "()V", "aid", "", "getAid", "()Ljava/lang/String;", "setAid", "(Ljava/lang/String;)V", "allowDeleted", "", "getAllowDeleted", "()Ljava/lang/Boolean;", "setAllowDeleted", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "appCode", "getAppCode", "setAppCode", "cardDesc", "getCardDesc", "setCardDesc", "cardLabel", "getCardLabel", "setCardLabel", "cardName", "getCardName", "setCardName", "cardNoteUrl", "getCardNoteUrl", "setCardNoteUrl", "cardUrl", "getCardUrl", "setCardUrl", "guideUrl", "getGuideUrl", "setGuideUrl", "isSupportShare", "()Z", "setSupportShare", "(Z)V", "logoUrl", "getLogoUrl", "setLogoUrl", "message", "getMessage", "setMessage", "orderNo", "getOrderNo", "setOrderNo", "serviceTel", "getServiceTel", "setServiceTel", "shareTips", "getShareTips", "setShareTips", "showRedPoint", "getShowRedPoint", "setShowRedPoint", "status", "getStatus", "setStatus", "unionUrl", "getUnionUrl", "setUnionUrl", "userAgreementUrl", "getUserAgreementUrl", "setUserAgreementUrl", "userTipsUrl", "getUserTipsUrl", "setUserTipsUrl", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardDetail {

    @Nullable
    private String aid;

    @Nullable
    private Boolean allowDeleted;

    @Nullable
    private String appCode;

    @Nullable
    private String cardDesc;

    @Nullable
    private String cardLabel;

    @Nullable
    private String cardName;

    @Nullable
    private String cardNoteUrl;

    @Nullable
    private String cardUrl;

    @Nullable
    private String guideUrl;
    private boolean isSupportShare;

    @Nullable
    private String logoUrl;

    @Nullable
    private String message;

    @Nullable
    private String orderNo;

    @Nullable
    private String serviceTel;

    @Nullable
    private String shareTips;

    @Nullable
    private Boolean showRedPoint;

    @Nullable
    private String status;

    @Nullable
    private String unionUrl;

    @Nullable
    private String userAgreementUrl;

    @Nullable
    private String userTipsUrl;

    @Nullable
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
    public final String getCardUrl() {
        return this.cardUrl;
    }

    @Nullable
    public final String getGuideUrl() {
        return this.guideUrl;
    }

    @Nullable
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getServiceTel() {
        return this.serviceTel;
    }

    @Nullable
    public final String getShareTips() {
        return this.shareTips;
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
    public final String getUnionUrl() {
        return this.unionUrl;
    }

    @Nullable
    public final String getUserAgreementUrl() {
        return this.userAgreementUrl;
    }

    @Nullable
    public final String getUserTipsUrl() {
        return this.userTipsUrl;
    }

    /* JADX INFO: renamed from: isSupportShare, reason: from getter */
    public final boolean getIsSupportShare() {
        return this.isSupportShare;
    }

    public final void setAid(@Nullable String str) {
        this.aid = str;
    }

    public final void setAllowDeleted(@Nullable Boolean bool) {
        this.allowDeleted = bool;
    }

    public final void setAppCode(@Nullable String str) {
        this.appCode = str;
    }

    public final void setCardDesc(@Nullable String str) {
        this.cardDesc = str;
    }

    public final void setCardLabel(@Nullable String str) {
        this.cardLabel = str;
    }

    public final void setCardName(@Nullable String str) {
        this.cardName = str;
    }

    public final void setCardNoteUrl(@Nullable String str) {
        this.cardNoteUrl = str;
    }

    public final void setCardUrl(@Nullable String str) {
        this.cardUrl = str;
    }

    public final void setGuideUrl(@Nullable String str) {
        this.guideUrl = str;
    }

    public final void setLogoUrl(@Nullable String str) {
        this.logoUrl = str;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setServiceTel(@Nullable String str) {
        this.serviceTel = str;
    }

    public final void setShareTips(@Nullable String str) {
        this.shareTips = str;
    }

    public final void setShowRedPoint(@Nullable Boolean bool) {
        this.showRedPoint = bool;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setSupportShare(boolean z) {
        this.isSupportShare = z;
    }

    public final void setUnionUrl(@Nullable String str) {
        this.unionUrl = str;
    }

    public final void setUserAgreementUrl(@Nullable String str) {
        this.userAgreementUrl = str;
    }

    public final void setUserTipsUrl(@Nullable String str) {
        this.userTipsUrl = str;
    }
}
