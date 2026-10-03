package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u0089\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00103\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0005HÖ\u0001J\t\u00106\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014¨\u00067"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/TopupFeeContainer;", "", "promotion", "", "normalCardFee", "", "promotionCardFee", "normalTopupFee", "", "promotionTopupFee", "recommendFeeIdx", "normalShiftOutFee", "promotionShiftOutFee", "normalShiftInFee", "promotionShiftInFee", "priceTitle", "", "priceContent", "(ZII[I[IIIIIILjava/lang/String;Ljava/lang/String;)V", "getNormalCardFee", "()I", "getNormalShiftInFee", "getNormalShiftOutFee", "getNormalTopupFee", "()[I", "getPriceContent", "()Ljava/lang/String;", "setPriceContent", "(Ljava/lang/String;)V", "getPriceTitle", "setPriceTitle", "getPromotion", "()Z", "getPromotionCardFee", "getPromotionShiftInFee", "getPromotionShiftOutFee", "getPromotionTopupFee", "getRecommendFeeIdx", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TopupFeeContainer {
    private final int normalCardFee;
    private final int normalShiftInFee;
    private final int normalShiftOutFee;

    @Nullable
    private final int[] normalTopupFee;

    @Nullable
    private String priceContent;

    @Nullable
    private String priceTitle;
    private final boolean promotion;
    private final int promotionCardFee;
    private final int promotionShiftInFee;
    private final int promotionShiftOutFee;

    @Nullable
    private final int[] promotionTopupFee;
    private final int recommendFeeIdx;

    public TopupFeeContainer(boolean z, int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3, int i4, int i5, int i6, int i7, @Nullable String str, @Nullable String str2) {
        this.promotion = z;
        this.normalCardFee = i;
        this.promotionCardFee = i2;
        this.normalTopupFee = iArr;
        this.promotionTopupFee = iArr2;
        this.recommendFeeIdx = i3;
        this.normalShiftOutFee = i4;
        this.promotionShiftOutFee = i5;
        this.normalShiftInFee = i6;
        this.promotionShiftInFee = i7;
        this.priceTitle = str;
        this.priceContent = str2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getPromotion() {
        return this.promotion;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPromotionShiftInFee() {
        return this.promotionShiftInFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPriceTitle() {
        return this.priceTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPriceContent() {
        return this.priceContent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNormalCardFee() {
        return this.normalCardFee;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPromotionCardFee() {
        return this.promotionCardFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int[] getNormalTopupFee() {
        return this.normalTopupFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int[] getPromotionTopupFee() {
        return this.promotionTopupFee;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRecommendFeeIdx() {
        return this.recommendFeeIdx;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getNormalShiftOutFee() {
        return this.normalShiftOutFee;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPromotionShiftOutFee() {
        return this.promotionShiftOutFee;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getNormalShiftInFee() {
        return this.normalShiftInFee;
    }

    @NotNull
    public final TopupFeeContainer copy(boolean promotion, int normalCardFee, int promotionCardFee, @Nullable int[] normalTopupFee, @Nullable int[] promotionTopupFee, int recommendFeeIdx, int normalShiftOutFee, int promotionShiftOutFee, int normalShiftInFee, int promotionShiftInFee, @Nullable String priceTitle, @Nullable String priceContent) {
        return new TopupFeeContainer(promotion, normalCardFee, promotionCardFee, normalTopupFee, promotionTopupFee, recommendFeeIdx, normalShiftOutFee, promotionShiftOutFee, normalShiftInFee, promotionShiftInFee, priceTitle, priceContent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupFeeContainer)) {
            return false;
        }
        TopupFeeContainer topupFeeContainer = (TopupFeeContainer) other;
        return this.promotion == topupFeeContainer.promotion && this.normalCardFee == topupFeeContainer.normalCardFee && this.promotionCardFee == topupFeeContainer.promotionCardFee && Intrinsics.areEqual(this.normalTopupFee, topupFeeContainer.normalTopupFee) && Intrinsics.areEqual(this.promotionTopupFee, topupFeeContainer.promotionTopupFee) && this.recommendFeeIdx == topupFeeContainer.recommendFeeIdx && this.normalShiftOutFee == topupFeeContainer.normalShiftOutFee && this.promotionShiftOutFee == topupFeeContainer.promotionShiftOutFee && this.normalShiftInFee == topupFeeContainer.normalShiftInFee && this.promotionShiftInFee == topupFeeContainer.promotionShiftInFee && Intrinsics.areEqual(this.priceTitle, topupFeeContainer.priceTitle) && Intrinsics.areEqual(this.priceContent, topupFeeContainer.priceContent);
    }

    public final int getNormalCardFee() {
        return this.normalCardFee;
    }

    public final int getNormalShiftInFee() {
        return this.normalShiftInFee;
    }

    public final int getNormalShiftOutFee() {
        return this.normalShiftOutFee;
    }

    @Nullable
    public final int[] getNormalTopupFee() {
        return this.normalTopupFee;
    }

    @Nullable
    public final String getPriceContent() {
        return this.priceContent;
    }

    @Nullable
    public final String getPriceTitle() {
        return this.priceTitle;
    }

    public final boolean getPromotion() {
        return this.promotion;
    }

    public final int getPromotionCardFee() {
        return this.promotionCardFee;
    }

    public final int getPromotionShiftInFee() {
        return this.promotionShiftInFee;
    }

    public final int getPromotionShiftOutFee() {
        return this.promotionShiftOutFee;
    }

    @Nullable
    public final int[] getPromotionTopupFee() {
        return this.promotionTopupFee;
    }

    public final int getRecommendFeeIdx() {
        return this.recommendFeeIdx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    public int hashCode() {
        boolean z = this.promotion;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((r0 * 31) + Integer.hashCode(this.normalCardFee)) * 31) + Integer.hashCode(this.promotionCardFee)) * 31;
        int[] iArr = this.normalTopupFee;
        int iHashCode2 = (iHashCode + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.promotionTopupFee;
        int iHashCode3 = (((((((((((iHashCode2 + (iArr2 == null ? 0 : Arrays.hashCode(iArr2))) * 31) + Integer.hashCode(this.recommendFeeIdx)) * 31) + Integer.hashCode(this.normalShiftOutFee)) * 31) + Integer.hashCode(this.promotionShiftOutFee)) * 31) + Integer.hashCode(this.normalShiftInFee)) * 31) + Integer.hashCode(this.promotionShiftInFee)) * 31;
        String str = this.priceTitle;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.priceContent;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setPriceContent(@Nullable String str) {
        this.priceContent = str;
    }

    public final void setPriceTitle(@Nullable String str) {
        this.priceTitle = str;
    }

    @NotNull
    public String toString() {
        return "TopupFeeContainer(promotion=" + this.promotion + ", normalCardFee=" + this.normalCardFee + ", promotionCardFee=" + this.promotionCardFee + ", normalTopupFee=" + Arrays.toString(this.normalTopupFee) + ", promotionTopupFee=" + Arrays.toString(this.promotionTopupFee) + ", recommendFeeIdx=" + this.recommendFeeIdx + ", normalShiftOutFee=" + this.normalShiftOutFee + ", promotionShiftOutFee=" + this.promotionShiftOutFee + ", normalShiftInFee=" + this.normalShiftInFee + ", promotionShiftInFee=" + this.promotionShiftInFee + ", priceTitle=" + this.priceTitle + ", priceContent=" + this.priceContent + ")";
    }
}
