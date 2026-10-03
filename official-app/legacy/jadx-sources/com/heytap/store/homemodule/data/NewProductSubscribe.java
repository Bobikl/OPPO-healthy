package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bR\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0018HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0018HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003Jí\u0001\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u0003HÆ\u0001J\u0013\u0010f\u001a\u00020\u00182\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010h\u001a\u00020\u0005HÖ\u0001J\t\u0010i\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010#\"\u0004\b4\u0010%R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010#\"\u0004\b5\u0010%R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010#\"\u0004\b6\u0010%R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010#\"\u0004\b<\u0010%R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010\u001a\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010B\"\u0004\bF\u0010DR\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010!R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001f\"\u0004\bJ\u0010!R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001f\"\u0004\bL\u0010!R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u001f\"\u0004\bN\u0010!¨\u0006j"}, d2 = {"Lcom/heytap/store/homemodule/data/NewProductSubscribe;", "", "advanceColor", "", "bookNum", "", "bookedBtnText", "bookedText", "btnColor", "btnText", "cardGravity", "firstCategory", "goodsSpuId", "isBooked", "isSkip", "secondCategory", "skipLink", "skuId", "isAdvance", "skuInfoList", "", "Lcom/heytap/store/homemodule/data/HomeReserveSkuEntity;", "subscribeSuccessfulRemindText", "subscribeSuccessfulJump", "", "subscribeSuccessfulJumpLink", "subscribeSuccessfulButtonEnabled", "subscribedButtonText", "subscribedJumpLink", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAdvanceColor", "()Ljava/lang/String;", "setAdvanceColor", "(Ljava/lang/String;)V", "getBookNum", "()I", "setBookNum", "(I)V", "getBookedBtnText", "setBookedBtnText", "getBookedText", "setBookedText", "getBtnColor", "setBtnColor", "getBtnText", "setBtnText", "getCardGravity", "setCardGravity", "getFirstCategory", "setFirstCategory", "getGoodsSpuId", "setGoodsSpuId", "setAdvance", "setBooked", "setSkip", "getSecondCategory", "setSecondCategory", "getSkipLink", "setSkipLink", "getSkuId", "setSkuId", "getSkuInfoList", "()Ljava/util/List;", "setSkuInfoList", "(Ljava/util/List;)V", "getSubscribeSuccessfulButtonEnabled", "()Z", "setSubscribeSuccessfulButtonEnabled", "(Z)V", "getSubscribeSuccessfulJump", "setSubscribeSuccessfulJump", "getSubscribeSuccessfulJumpLink", "setSubscribeSuccessfulJumpLink", "getSubscribeSuccessfulRemindText", "setSubscribeSuccessfulRemindText", "getSubscribedButtonText", "setSubscribedButtonText", "getSubscribedJumpLink", "setSubscribedJumpLink", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class NewProductSubscribe {

    @NotNull
    private String advanceColor;
    private int bookNum;

    @NotNull
    private String bookedBtnText;

    @NotNull
    private String bookedText;

    @NotNull
    private String btnColor;

    @NotNull
    private String btnText;
    private int cardGravity;

    @NotNull
    private String firstCategory;
    private int goodsSpuId;
    private int isAdvance;
    private int isBooked;
    private int isSkip;

    @NotNull
    private String secondCategory;

    @NotNull
    private String skipLink;
    private int skuId;

    @Nullable
    private List<HomeReserveSkuEntity> skuInfoList;
    private boolean subscribeSuccessfulButtonEnabled;
    private boolean subscribeSuccessfulJump;

    @NotNull
    private String subscribeSuccessfulJumpLink;

    @NotNull
    private String subscribeSuccessfulRemindText;

    @NotNull
    private String subscribedButtonText;

    @NotNull
    private String subscribedJumpLink;

    public NewProductSubscribe() {
        this(null, 0, null, null, null, null, 0, null, 0, 0, 0, null, null, 0, 0, null, null, false, null, false, null, null, 4194303, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdvanceColor() {
        return this.advanceColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getIsBooked() {
        return this.isBooked;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getIsSkip() {
        return this.isSkip;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSecondCategory() {
        return this.secondCategory;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSkipLink() {
        return this.skipLink;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSkuId() {
        return this.skuId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getIsAdvance() {
        return this.isAdvance;
    }

    @Nullable
    public final List<HomeReserveSkuEntity> component16() {
        return this.skuInfoList;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSubscribeSuccessfulRemindText() {
        return this.subscribeSuccessfulRemindText;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getSubscribeSuccessfulJump() {
        return this.subscribeSuccessfulJump;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSubscribeSuccessfulJumpLink() {
        return this.subscribeSuccessfulJumpLink;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBookNum() {
        return this.bookNum;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getSubscribeSuccessfulButtonEnabled() {
        return this.subscribeSuccessfulButtonEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSubscribedButtonText() {
        return this.subscribedButtonText;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSubscribedJumpLink() {
        return this.subscribedJumpLink;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBookedBtnText() {
        return this.bookedBtnText;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBookedText() {
        return this.bookedText;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBtnColor() {
        return this.btnColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBtnText() {
        return this.btnText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCardGravity() {
        return this.cardGravity;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFirstCategory() {
        return this.firstCategory;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getGoodsSpuId() {
        return this.goodsSpuId;
    }

    @NotNull
    public final NewProductSubscribe copy(@NotNull String advanceColor, int bookNum, @NotNull String bookedBtnText, @NotNull String bookedText, @NotNull String btnColor, @NotNull String btnText, int cardGravity, @NotNull String firstCategory, int goodsSpuId, int isBooked, int isSkip, @NotNull String secondCategory, @NotNull String skipLink, int skuId, int isAdvance, @Nullable List<HomeReserveSkuEntity> skuInfoList, @NotNull String subscribeSuccessfulRemindText, boolean subscribeSuccessfulJump, @NotNull String subscribeSuccessfulJumpLink, boolean subscribeSuccessfulButtonEnabled, @NotNull String subscribedButtonText, @NotNull String subscribedJumpLink) {
        Intrinsics.checkNotNullParameter(advanceColor, "advanceColor");
        Intrinsics.checkNotNullParameter(bookedBtnText, "bookedBtnText");
        Intrinsics.checkNotNullParameter(bookedText, "bookedText");
        Intrinsics.checkNotNullParameter(btnColor, "btnColor");
        Intrinsics.checkNotNullParameter(btnText, "btnText");
        Intrinsics.checkNotNullParameter(firstCategory, "firstCategory");
        Intrinsics.checkNotNullParameter(secondCategory, "secondCategory");
        Intrinsics.checkNotNullParameter(skipLink, "skipLink");
        Intrinsics.checkNotNullParameter(subscribeSuccessfulRemindText, "subscribeSuccessfulRemindText");
        Intrinsics.checkNotNullParameter(subscribeSuccessfulJumpLink, "subscribeSuccessfulJumpLink");
        Intrinsics.checkNotNullParameter(subscribedButtonText, "subscribedButtonText");
        Intrinsics.checkNotNullParameter(subscribedJumpLink, "subscribedJumpLink");
        return new NewProductSubscribe(advanceColor, bookNum, bookedBtnText, bookedText, btnColor, btnText, cardGravity, firstCategory, goodsSpuId, isBooked, isSkip, secondCategory, skipLink, skuId, isAdvance, skuInfoList, subscribeSuccessfulRemindText, subscribeSuccessfulJump, subscribeSuccessfulJumpLink, subscribeSuccessfulButtonEnabled, subscribedButtonText, subscribedJumpLink);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewProductSubscribe)) {
            return false;
        }
        NewProductSubscribe newProductSubscribe = (NewProductSubscribe) other;
        return Intrinsics.areEqual(this.advanceColor, newProductSubscribe.advanceColor) && this.bookNum == newProductSubscribe.bookNum && Intrinsics.areEqual(this.bookedBtnText, newProductSubscribe.bookedBtnText) && Intrinsics.areEqual(this.bookedText, newProductSubscribe.bookedText) && Intrinsics.areEqual(this.btnColor, newProductSubscribe.btnColor) && Intrinsics.areEqual(this.btnText, newProductSubscribe.btnText) && this.cardGravity == newProductSubscribe.cardGravity && Intrinsics.areEqual(this.firstCategory, newProductSubscribe.firstCategory) && this.goodsSpuId == newProductSubscribe.goodsSpuId && this.isBooked == newProductSubscribe.isBooked && this.isSkip == newProductSubscribe.isSkip && Intrinsics.areEqual(this.secondCategory, newProductSubscribe.secondCategory) && Intrinsics.areEqual(this.skipLink, newProductSubscribe.skipLink) && this.skuId == newProductSubscribe.skuId && this.isAdvance == newProductSubscribe.isAdvance && Intrinsics.areEqual(this.skuInfoList, newProductSubscribe.skuInfoList) && Intrinsics.areEqual(this.subscribeSuccessfulRemindText, newProductSubscribe.subscribeSuccessfulRemindText) && this.subscribeSuccessfulJump == newProductSubscribe.subscribeSuccessfulJump && Intrinsics.areEqual(this.subscribeSuccessfulJumpLink, newProductSubscribe.subscribeSuccessfulJumpLink) && this.subscribeSuccessfulButtonEnabled == newProductSubscribe.subscribeSuccessfulButtonEnabled && Intrinsics.areEqual(this.subscribedButtonText, newProductSubscribe.subscribedButtonText) && Intrinsics.areEqual(this.subscribedJumpLink, newProductSubscribe.subscribedJumpLink);
    }

    @NotNull
    public final String getAdvanceColor() {
        return this.advanceColor;
    }

    public final int getBookNum() {
        return this.bookNum;
    }

    @NotNull
    public final String getBookedBtnText() {
        return this.bookedBtnText;
    }

    @NotNull
    public final String getBookedText() {
        return this.bookedText;
    }

    @NotNull
    public final String getBtnColor() {
        return this.btnColor;
    }

    @NotNull
    public final String getBtnText() {
        return this.btnText;
    }

    public final int getCardGravity() {
        return this.cardGravity;
    }

    @NotNull
    public final String getFirstCategory() {
        return this.firstCategory;
    }

    public final int getGoodsSpuId() {
        return this.goodsSpuId;
    }

    @NotNull
    public final String getSecondCategory() {
        return this.secondCategory;
    }

    @NotNull
    public final String getSkipLink() {
        return this.skipLink;
    }

    public final int getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final List<HomeReserveSkuEntity> getSkuInfoList() {
        return this.skuInfoList;
    }

    public final boolean getSubscribeSuccessfulButtonEnabled() {
        return this.subscribeSuccessfulButtonEnabled;
    }

    public final boolean getSubscribeSuccessfulJump() {
        return this.subscribeSuccessfulJump;
    }

    @NotNull
    public final String getSubscribeSuccessfulJumpLink() {
        return this.subscribeSuccessfulJumpLink;
    }

    @NotNull
    public final String getSubscribeSuccessfulRemindText() {
        return this.subscribeSuccessfulRemindText;
    }

    @NotNull
    public final String getSubscribedButtonText() {
        return this.subscribedButtonText;
    }

    @NotNull
    public final String getSubscribedJumpLink() {
        return this.subscribedJumpLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((this.advanceColor.hashCode() * 31) + Integer.hashCode(this.bookNum)) * 31) + this.bookedBtnText.hashCode()) * 31) + this.bookedText.hashCode()) * 31) + this.btnColor.hashCode()) * 31) + this.btnText.hashCode()) * 31) + Integer.hashCode(this.cardGravity)) * 31) + this.firstCategory.hashCode()) * 31) + Integer.hashCode(this.goodsSpuId)) * 31) + Integer.hashCode(this.isBooked)) * 31) + Integer.hashCode(this.isSkip)) * 31) + this.secondCategory.hashCode()) * 31) + this.skipLink.hashCode()) * 31) + Integer.hashCode(this.skuId)) * 31) + Integer.hashCode(this.isAdvance)) * 31;
        List<HomeReserveSkuEntity> list = this.skuInfoList;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.subscribeSuccessfulRemindText.hashCode()) * 31;
        boolean z = this.subscribeSuccessfulJump;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode3 = (((iHashCode2 + r1) * 31) + this.subscribeSuccessfulJumpLink.hashCode()) * 31;
        boolean z2 = this.subscribeSuccessfulButtonEnabled;
        return ((((iHashCode3 + (z2 ? 1 : z2)) * 31) + this.subscribedButtonText.hashCode()) * 31) + this.subscribedJumpLink.hashCode();
    }

    public final int isAdvance() {
        return this.isAdvance;
    }

    public final int isBooked() {
        return this.isBooked;
    }

    public final int isSkip() {
        return this.isSkip;
    }

    public final void setAdvance(int i) {
        this.isAdvance = i;
    }

    public final void setAdvanceColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.advanceColor = str;
    }

    public final void setBookNum(int i) {
        this.bookNum = i;
    }

    public final void setBooked(int i) {
        this.isBooked = i;
    }

    public final void setBookedBtnText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bookedBtnText = str;
    }

    public final void setBookedText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bookedText = str;
    }

    public final void setBtnColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.btnColor = str;
    }

    public final void setBtnText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.btnText = str;
    }

    public final void setCardGravity(int i) {
        this.cardGravity = i;
    }

    public final void setFirstCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstCategory = str;
    }

    public final void setGoodsSpuId(int i) {
        this.goodsSpuId = i;
    }

    public final void setSecondCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secondCategory = str;
    }

    public final void setSkip(int i) {
        this.isSkip = i;
    }

    public final void setSkipLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.skipLink = str;
    }

    public final void setSkuId(int i) {
        this.skuId = i;
    }

    public final void setSkuInfoList(@Nullable List<HomeReserveSkuEntity> list) {
        this.skuInfoList = list;
    }

    public final void setSubscribeSuccessfulButtonEnabled(boolean z) {
        this.subscribeSuccessfulButtonEnabled = z;
    }

    public final void setSubscribeSuccessfulJump(boolean z) {
        this.subscribeSuccessfulJump = z;
    }

    public final void setSubscribeSuccessfulJumpLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscribeSuccessfulJumpLink = str;
    }

    public final void setSubscribeSuccessfulRemindText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscribeSuccessfulRemindText = str;
    }

    public final void setSubscribedButtonText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscribedButtonText = str;
    }

    public final void setSubscribedJumpLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscribedJumpLink = str;
    }

    @NotNull
    public String toString() {
        return "NewProductSubscribe(advanceColor=" + this.advanceColor + ", bookNum=" + this.bookNum + ", bookedBtnText=" + this.bookedBtnText + ", bookedText=" + this.bookedText + ", btnColor=" + this.btnColor + ", btnText=" + this.btnText + ", cardGravity=" + this.cardGravity + ", firstCategory=" + this.firstCategory + ", goodsSpuId=" + this.goodsSpuId + ", isBooked=" + this.isBooked + ", isSkip=" + this.isSkip + ", secondCategory=" + this.secondCategory + ", skipLink=" + this.skipLink + ", skuId=" + this.skuId + ", isAdvance=" + this.isAdvance + ", skuInfoList=" + this.skuInfoList + ", subscribeSuccessfulRemindText=" + this.subscribeSuccessfulRemindText + ", subscribeSuccessfulJump=" + this.subscribeSuccessfulJump + ", subscribeSuccessfulJumpLink=" + this.subscribeSuccessfulJumpLink + ", subscribeSuccessfulButtonEnabled=" + this.subscribeSuccessfulButtonEnabled + ", subscribedButtonText=" + this.subscribedButtonText + ", subscribedJumpLink=" + this.subscribedJumpLink + ')';
    }

    public NewProductSubscribe(@NotNull String advanceColor, int i, @NotNull String bookedBtnText, @NotNull String bookedText, @NotNull String btnColor, @NotNull String btnText, int i2, @NotNull String firstCategory, int i3, int i4, int i5, @NotNull String secondCategory, @NotNull String skipLink, int i6, int i7, @Nullable List<HomeReserveSkuEntity> list, @NotNull String subscribeSuccessfulRemindText, boolean z, @NotNull String subscribeSuccessfulJumpLink, boolean z2, @NotNull String subscribedButtonText, @NotNull String subscribedJumpLink) {
        Intrinsics.checkNotNullParameter(advanceColor, "advanceColor");
        Intrinsics.checkNotNullParameter(bookedBtnText, "bookedBtnText");
        Intrinsics.checkNotNullParameter(bookedText, "bookedText");
        Intrinsics.checkNotNullParameter(btnColor, "btnColor");
        Intrinsics.checkNotNullParameter(btnText, "btnText");
        Intrinsics.checkNotNullParameter(firstCategory, "firstCategory");
        Intrinsics.checkNotNullParameter(secondCategory, "secondCategory");
        Intrinsics.checkNotNullParameter(skipLink, "skipLink");
        Intrinsics.checkNotNullParameter(subscribeSuccessfulRemindText, "subscribeSuccessfulRemindText");
        Intrinsics.checkNotNullParameter(subscribeSuccessfulJumpLink, "subscribeSuccessfulJumpLink");
        Intrinsics.checkNotNullParameter(subscribedButtonText, "subscribedButtonText");
        Intrinsics.checkNotNullParameter(subscribedJumpLink, "subscribedJumpLink");
        this.advanceColor = advanceColor;
        this.bookNum = i;
        this.bookedBtnText = bookedBtnText;
        this.bookedText = bookedText;
        this.btnColor = btnColor;
        this.btnText = btnText;
        this.cardGravity = i2;
        this.firstCategory = firstCategory;
        this.goodsSpuId = i3;
        this.isBooked = i4;
        this.isSkip = i5;
        this.secondCategory = secondCategory;
        this.skipLink = skipLink;
        this.skuId = i6;
        this.isAdvance = i7;
        this.skuInfoList = list;
        this.subscribeSuccessfulRemindText = subscribeSuccessfulRemindText;
        this.subscribeSuccessfulJump = z;
        this.subscribeSuccessfulJumpLink = subscribeSuccessfulJumpLink;
        this.subscribeSuccessfulButtonEnabled = z2;
        this.subscribedButtonText = subscribedButtonText;
        this.subscribedJumpLink = subscribedJumpLink;
    }

    public /* synthetic */ NewProductSubscribe(String str, int i, String str2, String str3, String str4, String str5, int i2, String str6, int i3, int i4, int i5, String str7, String str8, int i6, int i7, List list, String str9, boolean z, String str10, boolean z2, String str11, String str12, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 0 : i, (i8 & 4) != 0 ? "" : str2, (i8 & 8) != 0 ? "" : str3, (i8 & 16) != 0 ? "" : str4, (i8 & 32) != 0 ? "" : str5, (i8 & 64) != 0 ? -1 : i2, (i8 & 128) != 0 ? "" : str6, (i8 & 256) != 0 ? -1 : i3, (i8 & 512) != 0 ? -1 : i4, (i8 & 1024) != 0 ? -1 : i5, (i8 & 2048) != 0 ? "" : str7, (i8 & 4096) != 0 ? "" : str8, (i8 & 8192) != 0 ? -1 : i6, (i8 & 16384) != 0 ? 0 : i7, (i8 & 32768) != 0 ? null : list, (i8 & 65536) != 0 ? "" : str9, (i8 & 131072) != 0 ? false : z, (i8 & 262144) != 0 ? "" : str10, (i8 & 524288) != 0 ? false : z2, (i8 & 1048576) != 0 ? "" : str11, (i8 & 2097152) != 0 ? "" : str12);
    }
}
