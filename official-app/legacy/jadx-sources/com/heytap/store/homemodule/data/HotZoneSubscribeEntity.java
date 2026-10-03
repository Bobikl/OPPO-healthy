package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.store.base.widget.state.data.StateConstantsKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bU\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007¢\u0006\u0002\u0010\u001eJ\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0010HÆ\u0003J\t\u0010W\u001a\u00020\u0010HÆ\u0003J\t\u0010X\u001a\u00020\u0010HÆ\u0003J\t\u0010Y\u001a\u00020\u0010HÆ\u0003J\u0011\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\t\u0010[\u001a\u00020\u0007HÆ\u0003J\t\u0010\\\u001a\u00020\u0019HÆ\u0003J\t\u0010]\u001a\u00020\u0007HÆ\u0003J\t\u0010^\u001a\u00020\u0019HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0007HÆ\u0003J\t\u0010a\u001a\u00020\u0007HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0007HÆ\u0003J\t\u0010d\u001a\u00020\u0007HÆ\u0003J\t\u0010e\u001a\u00020\u0007HÆ\u0003J\t\u0010f\u001a\u00020\u0007HÆ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003J\t\u0010h\u001a\u00020\rHÆ\u0003Jã\u0001\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u0007HÆ\u0001J\u0013\u0010j\u001a\u00020\u00192\b\u0010k\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010l\u001a\u00020\u0003HÖ\u0001J\t\u0010m\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0013\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010.\"\u0004\b5\u00100R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010$\"\u0004\b7\u0010&R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010.\"\u0004\b;\u00100R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u001b\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010A\"\u0004\bE\u0010CR\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010$\"\u0004\bG\u0010&R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010$\"\u0004\bI\u0010&R\u001a\u0010\u001c\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010&R\u001a\u0010\u001d\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010$\"\u0004\bM\u0010&R\u001a\u0010\u0012\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00102\"\u0004\bO\u00104R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00102\"\u0004\bQ\u00104R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u00102\"\u0004\bS\u00104¨\u0006n"}, d2 = {"Lcom/heytap/store/homemodule/data/HotZoneSubscribeEntity;", "", "skuId", "", "goodsSpuId", "showBookNum", StateConstantsKt.STATE_ACTION_BTN_CLICK, "", "firstCategory", "secondCategory", "buttonColor", "buttonWordColor", "bookNum", "", "isBooked", "xPercent", "", "yPercent", "wPercent", "hPercent", "skuInfoList", "", "Lcom/heytap/store/homemodule/data/HomeReserveSkuEntity;", "subscribeSuccessfulRemindText", "subscribeSuccessfulJump", "", "subscribeSuccessfulJumpLink", "subscribeSuccessfulButtonEnabled", "subscribedButtonText", "subscribedJumpLink", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIFFFFLjava/util/List;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getBookNum", "()J", "setBookNum", "(J)V", "getButtonColor", "()Ljava/lang/String;", "setButtonColor", "(Ljava/lang/String;)V", "getButtonText", "setButtonText", "getButtonWordColor", "setButtonWordColor", "getFirstCategory", "setFirstCategory", "getGoodsSpuId", "()I", "setGoodsSpuId", "(I)V", "getHPercent", "()F", "setHPercent", "(F)V", "setBooked", "getSecondCategory", "setSecondCategory", "getShowBookNum", "setShowBookNum", "getSkuId", "setSkuId", "getSkuInfoList", "()Ljava/util/List;", "setSkuInfoList", "(Ljava/util/List;)V", "getSubscribeSuccessfulButtonEnabled", "()Z", "setSubscribeSuccessfulButtonEnabled", "(Z)V", "getSubscribeSuccessfulJump", "setSubscribeSuccessfulJump", "getSubscribeSuccessfulJumpLink", "setSubscribeSuccessfulJumpLink", "getSubscribeSuccessfulRemindText", "setSubscribeSuccessfulRemindText", "getSubscribedButtonText", "setSubscribedButtonText", "getSubscribedJumpLink", "setSubscribedJumpLink", "getWPercent", "setWPercent", "getXPercent", "setXPercent", "getYPercent", "setYPercent", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HotZoneSubscribeEntity {
    private long bookNum;

    @NotNull
    private String buttonColor;

    @NotNull
    private String buttonText;

    @NotNull
    private String buttonWordColor;

    @NotNull
    private String firstCategory;
    private int goodsSpuId;
    private float hPercent;
    private int isBooked;

    @NotNull
    private String secondCategory;
    private int showBookNum;
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
    private float wPercent;
    private float xPercent;
    private float yPercent;

    public HotZoneSubscribeEntity() {
        this(0, 0, 0, null, null, null, null, null, 0L, 0, 0.0f, 0.0f, 0.0f, 0.0f, null, null, false, null, false, null, null, 2097151, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSkuId() {
        return this.skuId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getIsBooked() {
        return this.isBooked;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getXPercent() {
        return this.xPercent;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getYPercent() {
        return this.yPercent;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getWPercent() {
        return this.wPercent;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getHPercent() {
        return this.hPercent;
    }

    @Nullable
    public final List<HomeReserveSkuEntity> component15() {
        return this.skuInfoList;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSubscribeSuccessfulRemindText() {
        return this.subscribeSuccessfulRemindText;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getSubscribeSuccessfulJump() {
        return this.subscribeSuccessfulJump;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSubscribeSuccessfulJumpLink() {
        return this.subscribeSuccessfulJumpLink;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getSubscribeSuccessfulButtonEnabled() {
        return this.subscribeSuccessfulButtonEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGoodsSpuId() {
        return this.goodsSpuId;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSubscribedButtonText() {
        return this.subscribedButtonText;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSubscribedJumpLink() {
        return this.subscribedJumpLink;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getShowBookNum() {
        return this.showBookNum;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFirstCategory() {
        return this.firstCategory;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSecondCategory() {
        return this.secondCategory;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getButtonColor() {
        return this.buttonColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getButtonWordColor() {
        return this.buttonWordColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getBookNum() {
        return this.bookNum;
    }

    @NotNull
    public final HotZoneSubscribeEntity copy(int skuId, int goodsSpuId, int showBookNum, @NotNull String buttonText, @NotNull String firstCategory, @NotNull String secondCategory, @NotNull String buttonColor, @NotNull String buttonWordColor, long bookNum, int isBooked, float xPercent, float yPercent, float wPercent, float hPercent, @Nullable List<HomeReserveSkuEntity> skuInfoList, @NotNull String subscribeSuccessfulRemindText, boolean subscribeSuccessfulJump, @NotNull String subscribeSuccessfulJumpLink, boolean subscribeSuccessfulButtonEnabled, @NotNull String subscribedButtonText, @NotNull String subscribedJumpLink) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(firstCategory, "firstCategory");
        Intrinsics.checkNotNullParameter(secondCategory, "secondCategory");
        Intrinsics.checkNotNullParameter(buttonColor, "buttonColor");
        Intrinsics.checkNotNullParameter(buttonWordColor, "buttonWordColor");
        Intrinsics.checkNotNullParameter(subscribeSuccessfulRemindText, "subscribeSuccessfulRemindText");
        Intrinsics.checkNotNullParameter(subscribeSuccessfulJumpLink, "subscribeSuccessfulJumpLink");
        Intrinsics.checkNotNullParameter(subscribedButtonText, "subscribedButtonText");
        Intrinsics.checkNotNullParameter(subscribedJumpLink, "subscribedJumpLink");
        return new HotZoneSubscribeEntity(skuId, goodsSpuId, showBookNum, buttonText, firstCategory, secondCategory, buttonColor, buttonWordColor, bookNum, isBooked, xPercent, yPercent, wPercent, hPercent, skuInfoList, subscribeSuccessfulRemindText, subscribeSuccessfulJump, subscribeSuccessfulJumpLink, subscribeSuccessfulButtonEnabled, subscribedButtonText, subscribedJumpLink);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotZoneSubscribeEntity)) {
            return false;
        }
        HotZoneSubscribeEntity hotZoneSubscribeEntity = (HotZoneSubscribeEntity) other;
        return this.skuId == hotZoneSubscribeEntity.skuId && this.goodsSpuId == hotZoneSubscribeEntity.goodsSpuId && this.showBookNum == hotZoneSubscribeEntity.showBookNum && Intrinsics.areEqual(this.buttonText, hotZoneSubscribeEntity.buttonText) && Intrinsics.areEqual(this.firstCategory, hotZoneSubscribeEntity.firstCategory) && Intrinsics.areEqual(this.secondCategory, hotZoneSubscribeEntity.secondCategory) && Intrinsics.areEqual(this.buttonColor, hotZoneSubscribeEntity.buttonColor) && Intrinsics.areEqual(this.buttonWordColor, hotZoneSubscribeEntity.buttonWordColor) && this.bookNum == hotZoneSubscribeEntity.bookNum && this.isBooked == hotZoneSubscribeEntity.isBooked && Intrinsics.areEqual((Object) Float.valueOf(this.xPercent), (Object) Float.valueOf(hotZoneSubscribeEntity.xPercent)) && Intrinsics.areEqual((Object) Float.valueOf(this.yPercent), (Object) Float.valueOf(hotZoneSubscribeEntity.yPercent)) && Intrinsics.areEqual((Object) Float.valueOf(this.wPercent), (Object) Float.valueOf(hotZoneSubscribeEntity.wPercent)) && Intrinsics.areEqual((Object) Float.valueOf(this.hPercent), (Object) Float.valueOf(hotZoneSubscribeEntity.hPercent)) && Intrinsics.areEqual(this.skuInfoList, hotZoneSubscribeEntity.skuInfoList) && Intrinsics.areEqual(this.subscribeSuccessfulRemindText, hotZoneSubscribeEntity.subscribeSuccessfulRemindText) && this.subscribeSuccessfulJump == hotZoneSubscribeEntity.subscribeSuccessfulJump && Intrinsics.areEqual(this.subscribeSuccessfulJumpLink, hotZoneSubscribeEntity.subscribeSuccessfulJumpLink) && this.subscribeSuccessfulButtonEnabled == hotZoneSubscribeEntity.subscribeSuccessfulButtonEnabled && Intrinsics.areEqual(this.subscribedButtonText, hotZoneSubscribeEntity.subscribedButtonText) && Intrinsics.areEqual(this.subscribedJumpLink, hotZoneSubscribeEntity.subscribedJumpLink);
    }

    public final long getBookNum() {
        return this.bookNum;
    }

    @NotNull
    public final String getButtonColor() {
        return this.buttonColor;
    }

    @NotNull
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final String getButtonWordColor() {
        return this.buttonWordColor;
    }

    @NotNull
    public final String getFirstCategory() {
        return this.firstCategory;
    }

    public final int getGoodsSpuId() {
        return this.goodsSpuId;
    }

    public final float getHPercent() {
        return this.hPercent;
    }

    @NotNull
    public final String getSecondCategory() {
        return this.secondCategory;
    }

    public final int getShowBookNum() {
        return this.showBookNum;
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

    public final float getWPercent() {
        return this.wPercent;
    }

    public final float getXPercent() {
        return this.xPercent;
    }

    public final float getYPercent() {
        return this.yPercent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r1v32, types: [int] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((Integer.hashCode(this.skuId) * 31) + Integer.hashCode(this.goodsSpuId)) * 31) + Integer.hashCode(this.showBookNum)) * 31) + this.buttonText.hashCode()) * 31) + this.firstCategory.hashCode()) * 31) + this.secondCategory.hashCode()) * 31) + this.buttonColor.hashCode()) * 31) + this.buttonWordColor.hashCode()) * 31) + Long.hashCode(this.bookNum)) * 31) + Integer.hashCode(this.isBooked)) * 31) + Float.hashCode(this.xPercent)) * 31) + Float.hashCode(this.yPercent)) * 31) + Float.hashCode(this.wPercent)) * 31) + Float.hashCode(this.hPercent)) * 31;
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

    public final int isBooked() {
        return this.isBooked;
    }

    public final void setBookNum(long j2) {
        this.bookNum = j2;
    }

    public final void setBooked(int i) {
        this.isBooked = i;
    }

    public final void setButtonColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.buttonColor = str;
    }

    public final void setButtonText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.buttonText = str;
    }

    public final void setButtonWordColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.buttonWordColor = str;
    }

    public final void setFirstCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstCategory = str;
    }

    public final void setGoodsSpuId(int i) {
        this.goodsSpuId = i;
    }

    public final void setHPercent(float f) {
        this.hPercent = f;
    }

    public final void setSecondCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secondCategory = str;
    }

    public final void setShowBookNum(int i) {
        this.showBookNum = i;
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

    public final void setWPercent(float f) {
        this.wPercent = f;
    }

    public final void setXPercent(float f) {
        this.xPercent = f;
    }

    public final void setYPercent(float f) {
        this.yPercent = f;
    }

    @NotNull
    public String toString() {
        return "HotZoneSubscribeEntity(skuId=" + this.skuId + ", goodsSpuId=" + this.goodsSpuId + ", showBookNum=" + this.showBookNum + ", buttonText=" + this.buttonText + ", firstCategory=" + this.firstCategory + ", secondCategory=" + this.secondCategory + ", buttonColor=" + this.buttonColor + ", buttonWordColor=" + this.buttonWordColor + ", bookNum=" + this.bookNum + ", isBooked=" + this.isBooked + ", xPercent=" + this.xPercent + ", yPercent=" + this.yPercent + ", wPercent=" + this.wPercent + ", hPercent=" + this.hPercent + ", skuInfoList=" + this.skuInfoList + ", subscribeSuccessfulRemindText=" + this.subscribeSuccessfulRemindText + ", subscribeSuccessfulJump=" + this.subscribeSuccessfulJump + ", subscribeSuccessfulJumpLink=" + this.subscribeSuccessfulJumpLink + ", subscribeSuccessfulButtonEnabled=" + this.subscribeSuccessfulButtonEnabled + ", subscribedButtonText=" + this.subscribedButtonText + ", subscribedJumpLink=" + this.subscribedJumpLink + ')';
    }

    public HotZoneSubscribeEntity(int i, int i2, int i3, @NotNull String buttonText, @NotNull String firstCategory, @NotNull String secondCategory, @NotNull String buttonColor, @NotNull String buttonWordColor, long j2, int i4, float f, float f2, float f3, float f4, @Nullable List<HomeReserveSkuEntity> list, @NotNull String subscribeSuccessfulRemindText, boolean z, @NotNull String subscribeSuccessfulJumpLink, boolean z2, @NotNull String subscribedButtonText, @NotNull String subscribedJumpLink) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(firstCategory, "firstCategory");
        Intrinsics.checkNotNullParameter(secondCategory, "secondCategory");
        Intrinsics.checkNotNullParameter(buttonColor, "buttonColor");
        Intrinsics.checkNotNullParameter(buttonWordColor, "buttonWordColor");
        Intrinsics.checkNotNullParameter(subscribeSuccessfulRemindText, "subscribeSuccessfulRemindText");
        Intrinsics.checkNotNullParameter(subscribeSuccessfulJumpLink, "subscribeSuccessfulJumpLink");
        Intrinsics.checkNotNullParameter(subscribedButtonText, "subscribedButtonText");
        Intrinsics.checkNotNullParameter(subscribedJumpLink, "subscribedJumpLink");
        this.skuId = i;
        this.goodsSpuId = i2;
        this.showBookNum = i3;
        this.buttonText = buttonText;
        this.firstCategory = firstCategory;
        this.secondCategory = secondCategory;
        this.buttonColor = buttonColor;
        this.buttonWordColor = buttonWordColor;
        this.bookNum = j2;
        this.isBooked = i4;
        this.xPercent = f;
        this.yPercent = f2;
        this.wPercent = f3;
        this.hPercent = f4;
        this.skuInfoList = list;
        this.subscribeSuccessfulRemindText = subscribeSuccessfulRemindText;
        this.subscribeSuccessfulJump = z;
        this.subscribeSuccessfulJumpLink = subscribeSuccessfulJumpLink;
        this.subscribeSuccessfulButtonEnabled = z2;
        this.subscribedButtonText = subscribedButtonText;
        this.subscribedJumpLink = subscribedJumpLink;
    }

    public /* synthetic */ HotZoneSubscribeEntity(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, long j2, int i4, float f, float f2, float f3, float f4, List list, String str6, boolean z, String str7, boolean z2, String str8, String str9, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? -1 : i3, (i5 & 8) != 0 ? "" : str, (i5 & 16) != 0 ? "" : str2, (i5 & 32) != 0 ? "" : str3, (i5 & 64) != 0 ? "" : str4, (i5 & 128) != 0 ? "" : str5, (i5 & 256) != 0 ? 0L : j2, (i5 & 512) != 0 ? 0 : i4, (i5 & 1024) != 0 ? 0.0f : f, (i5 & 2048) != 0 ? 0.0f : f2, (i5 & 4096) != 0 ? 0.0f : f3, (i5 & 8192) != 0 ? 0.0f : f4, (i5 & 16384) != 0 ? null : list, (i5 & 32768) != 0 ? "" : str6, (i5 & 65536) != 0 ? false : z, (i5 & 131072) != 0 ? "" : str7, (i5 & 262144) != 0 ? false : z2, (i5 & 524288) != 0 ? "" : str8, (i5 & 1048576) != 0 ? "" : str9);
    }
}
