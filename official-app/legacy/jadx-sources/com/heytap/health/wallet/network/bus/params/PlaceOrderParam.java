package com.heytap.health.wallet.network.bus.params;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b=\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tBg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0002\u0010\u0011J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\u0083\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0006HÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\u0006\u0010H\u001a\u00020DR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010$R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010$R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010$R\u0014\u0010/\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0019R\u001c\u00101\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010$¨\u0006I"}, d2 = {"Lcom/heytap/health/wallet/network/bus/params/PlaceOrderParam;", "", "appCode", "", j7l.KEY_CPLC, "transType", "", "payChannel", "aid", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "amountInt", "payAmount", "product", "normalCardFee", "promotionCardFee", "normalRechargeFee", "promotionRechargeFee", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIII)V", "getAid", "()Ljava/lang/String;", "setAid", "(Ljava/lang/String;)V", "amount", "getAmount", "getAmountInt", "()I", "getAppCode", "setAppCode", "cardNo", "getCardNo", "setCardNo", "getCplc", "setCplc", "getNormalCardFee", "getNormalRechargeFee", "setNormalRechargeFee", "(I)V", "getPayAmount", "setPayAmount", "getPayChannel", "setPayChannel", "getProduct", "setProduct", "getPromotionCardFee", "setPromotionCardFee", "getPromotionRechargeFee", "setPromotionRechargeFee", "serviceCharge", "getServiceCharge", "shiftOutOrderNo", "getShiftOutOrderNo", "setShiftOutOrderNo", "getTransType", "setTransType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "unAvailable", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PlaceOrderParam {

    @NotNull
    private String aid;

    @NotNull
    private final String amount;
    private final int amountInt;

    @Nullable
    private String appCode;

    @Nullable
    private String cardNo;

    @NotNull
    private String cplc;
    private final int normalCardFee;
    private int normalRechargeFee;
    private int payAmount;

    @NotNull
    private String payChannel;

    @NotNull
    private String product;
    private int promotionCardFee;
    private int promotionRechargeFee;
    private final int serviceCharge;

    @Nullable
    private String shiftOutOrderNo;
    private int transType;

    public PlaceOrderParam(@Nullable String str, @NotNull String cplc, int i, @NotNull String payChannel, int i2, int i3, @NotNull String aid, @NotNull String product, int i4, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(payChannel, "payChannel");
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(product, "product");
        this.appCode = str;
        this.cplc = cplc;
        this.transType = i;
        this.payChannel = payChannel;
        this.amountInt = i2;
        this.payAmount = i3;
        this.aid = aid;
        this.product = product;
        this.normalCardFee = i4;
        this.promotionCardFee = i5;
        this.normalRechargeFee = i6;
        this.promotionRechargeFee = i7;
        RechargeAmount rechargeAmount = new RechargeAmount(i2, i3, i4, i5, i6, i7);
        String strSubstring = this.cplc.substring(20, 36);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = this.cplc.substring(52, 68);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String encryptAmount = rechargeAmount.getEncryptAmount(strSubstring, strSubstring2);
        Intrinsics.checkNotNullExpressionValue(encryptAmount, "RechargeAmount(\n        …, cplc.substring(52, 68))");
        this.amount = encryptAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPromotionCardFee() {
        return this.promotionCardFee;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getNormalRechargeFee() {
        return this.normalRechargeFee;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getPromotionRechargeFee() {
        return this.promotionRechargeFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTransType() {
        return this.transType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPayChannel() {
        return this.payChannel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAmountInt() {
        return this.amountInt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPayAmount() {
        return this.payAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getNormalCardFee() {
        return this.normalCardFee;
    }

    @NotNull
    public final PlaceOrderParam copy(@Nullable String appCode, @NotNull String cplc, int transType, @NotNull String payChannel, int amountInt, int payAmount, @NotNull String aid, @NotNull String product, int normalCardFee, int promotionCardFee, int normalRechargeFee, int promotionRechargeFee) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(payChannel, "payChannel");
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(product, "product");
        return new PlaceOrderParam(appCode, cplc, transType, payChannel, amountInt, payAmount, aid, product, normalCardFee, promotionCardFee, normalRechargeFee, promotionRechargeFee);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceOrderParam)) {
            return false;
        }
        PlaceOrderParam placeOrderParam = (PlaceOrderParam) other;
        return Intrinsics.areEqual(this.appCode, placeOrderParam.appCode) && Intrinsics.areEqual(this.cplc, placeOrderParam.cplc) && this.transType == placeOrderParam.transType && Intrinsics.areEqual(this.payChannel, placeOrderParam.payChannel) && this.amountInt == placeOrderParam.amountInt && this.payAmount == placeOrderParam.payAmount && Intrinsics.areEqual(this.aid, placeOrderParam.aid) && Intrinsics.areEqual(this.product, placeOrderParam.product) && this.normalCardFee == placeOrderParam.normalCardFee && this.promotionCardFee == placeOrderParam.promotionCardFee && this.normalRechargeFee == placeOrderParam.normalRechargeFee && this.promotionRechargeFee == placeOrderParam.promotionRechargeFee;
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    public final int getAmountInt() {
        return this.amountInt;
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    public final int getNormalCardFee() {
        return this.normalCardFee;
    }

    public final int getNormalRechargeFee() {
        return this.normalRechargeFee;
    }

    public final int getPayAmount() {
        return this.payAmount;
    }

    @NotNull
    public final String getPayChannel() {
        return this.payChannel;
    }

    @NotNull
    public final String getProduct() {
        return this.product;
    }

    public final int getPromotionCardFee() {
        return this.promotionCardFee;
    }

    public final int getPromotionRechargeFee() {
        return this.promotionRechargeFee;
    }

    public final int getServiceCharge() {
        return this.serviceCharge;
    }

    @Nullable
    public final String getShiftOutOrderNo() {
        return this.shiftOutOrderNo;
    }

    public final int getTransType() {
        return this.transType;
    }

    public int hashCode() {
        String str = this.appCode;
        return ((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.cplc.hashCode()) * 31) + Integer.hashCode(this.transType)) * 31) + this.payChannel.hashCode()) * 31) + Integer.hashCode(this.amountInt)) * 31) + Integer.hashCode(this.payAmount)) * 31) + this.aid.hashCode()) * 31) + this.product.hashCode()) * 31) + Integer.hashCode(this.normalCardFee)) * 31) + Integer.hashCode(this.promotionCardFee)) * 31) + Integer.hashCode(this.normalRechargeFee)) * 31) + Integer.hashCode(this.promotionRechargeFee);
    }

    public final void setAid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aid = str;
    }

    public final void setAppCode(@Nullable String str) {
        this.appCode = str;
    }

    public final void setCardNo(@Nullable String str) {
        this.cardNo = str;
    }

    public final void setCplc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cplc = str;
    }

    public final void setNormalRechargeFee(int i) {
        this.normalRechargeFee = i;
    }

    public final void setPayAmount(int i) {
        this.payAmount = i;
    }

    public final void setPayChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.payChannel = str;
    }

    public final void setProduct(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.product = str;
    }

    public final void setPromotionCardFee(int i) {
        this.promotionCardFee = i;
    }

    public final void setPromotionRechargeFee(int i) {
        this.promotionRechargeFee = i;
    }

    public final void setShiftOutOrderNo(@Nullable String str) {
        this.shiftOutOrderNo = str;
    }

    public final void setTransType(int i) {
        this.transType = i;
    }

    @NotNull
    public String toString() {
        return "PlaceOrderParam(appCode=" + this.appCode + ", cplc=" + this.cplc + ", transType=" + this.transType + ", payChannel=" + this.payChannel + ", amountInt=" + this.amountInt + ", payAmount=" + this.payAmount + ", aid=" + this.aid + ", product=" + this.product + ", normalCardFee=" + this.normalCardFee + ", promotionCardFee=" + this.promotionCardFee + ", normalRechargeFee=" + this.normalRechargeFee + ", promotionRechargeFee=" + this.promotionRechargeFee + ")";
    }

    public final boolean unAvailable() {
        int i;
        return TextUtils.isEmpty(this.appCode) || TextUtils.isEmpty(this.cplc) || (i = this.transType) < 1 || i > 5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaceOrderParam(@NotNull String appCode, @NotNull String cplc, int i, @NotNull String payChannel, @NotNull String aid) {
        this(appCode, cplc, i, payChannel, 0, 0, aid, "", 0, 0, 0, 0);
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(payChannel, "payChannel");
        Intrinsics.checkNotNullParameter(aid, "aid");
    }
}
