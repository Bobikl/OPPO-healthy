package com.heytap.store.product_support.data;

import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u001cJ\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fHÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jÿ\u0001\u0010d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010e\u001a\u00020f2\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010h\u001a\u00020iHÖ\u0001J\t\u0010j\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010 R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010 R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001e\"\u0004\bL\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u001e\"\u0004\bN\u0010 ¨\u0006k"}, d2 = {"Lcom/heytap/store/product_support/data/OrderParamsData;", "", "quantity", "", "skuId", "id", "quickBuy", "secKillId", "crowdFundingId", "crowdFundingType", "addBuyPackages", "services", "", "Lcom/heytap/store/product_support/data/OrderParamsInsurance;", "suits", OrderParamsDataKt.ORDER_PARAMS_KEY_PIN_GOU_ID, OrderParamsDataKt.ORDER_PARAMS_KEY_GIFTS, "Lcom/heytap/store/product_support/data/OrderParamsGifts;", "preOrdainType", OrderParamsDataKt.ORDER_PARAMS_KEY_MODEL_SOURCE_SORT, "quickBuyPageUrl", "integralId", "channel", DeepLinkInterpreter.KEY_ACTIVITY_ID, OrderParamsDataKt.ORDER_PARAMS_KEY_REFERID, "laserPersonal", "Lcom/heytap/store/product_support/data/LaserPersonal;", "extendInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/store/product_support/data/LaserPersonal;Ljava/lang/Object;)V", "getActivityId", "()Ljava/lang/String;", "setActivityId", "(Ljava/lang/String;)V", "getAddBuyPackages", "setAddBuyPackages", "getChannel", "setChannel", "getCrowdFundingId", "setCrowdFundingId", "getCrowdFundingType", "setCrowdFundingType", "getExtendInfo", "()Ljava/lang/Object;", "setExtendInfo", "(Ljava/lang/Object;)V", "getGifts", "()Ljava/util/List;", "setGifts", "(Ljava/util/List;)V", "getId", "setId", "getIntegralId", "setIntegralId", "getLaserPersonal", "()Lcom/heytap/store/product_support/data/LaserPersonal;", "setLaserPersonal", "(Lcom/heytap/store/product_support/data/LaserPersonal;)V", "getPingouId", "setPingouId", "getPreOrdainType", "setPreOrdainType", "getQuantity", "setQuantity", "getQuickBuy", "setQuickBuy", "getQuickBuyPageUrl", "setQuickBuyPageUrl", "getReferId", "setReferId", "getSecKillId", "setSecKillId", "getServices", "setServices", "getSkuId", "setSkuId", "getSourceSort", "setSourceSort", "getSuits", "setSuits", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OrderParamsData {

    @NotNull
    private String activityId;

    @Nullable
    private String addBuyPackages;

    @NotNull
    private String channel;

    @Nullable
    private String crowdFundingId;

    @Nullable
    private String crowdFundingType;

    @Nullable
    private Object extendInfo;

    @Nullable
    private List<OrderParamsGifts> gifts;

    @Nullable
    private String id;

    @NotNull
    private String integralId;

    @Nullable
    private LaserPersonal laserPersonal;

    @Nullable
    private String pingouId;

    @NotNull
    private String preOrdainType;

    @NotNull
    private String quantity;

    @Nullable
    private String quickBuy;

    @NotNull
    private String quickBuyPageUrl;

    @NotNull
    private String referId;

    @Nullable
    private String secKillId;

    @Nullable
    private List<OrderParamsInsurance> services;

    @NotNull
    private String skuId;

    @NotNull
    private String sourceSort;

    @Nullable
    private String suits;

    public OrderParamsData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuantity() {
        return this.quantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSuits() {
        return this.suits;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPingouId() {
        return this.pingouId;
    }

    @Nullable
    public final List<OrderParamsGifts> component12() {
        return this.gifts;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPreOrdainType() {
        return this.preOrdainType;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSourceSort() {
        return this.sourceSort;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getQuickBuyPageUrl() {
        return this.quickBuyPageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getIntegralId() {
        return this.integralId;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getReferId() {
        return this.referId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final LaserPersonal getLaserPersonal() {
        return this.laserPersonal;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Object getExtendInfo() {
        return this.extendInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQuickBuy() {
        return this.quickBuy;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSecKillId() {
        return this.secKillId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCrowdFundingId() {
        return this.crowdFundingId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCrowdFundingType() {
        return this.crowdFundingType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAddBuyPackages() {
        return this.addBuyPackages;
    }

    @Nullable
    public final List<OrderParamsInsurance> component9() {
        return this.services;
    }

    @NotNull
    public final OrderParamsData copy(@NotNull String quantity, @NotNull String skuId, @Nullable String id, @Nullable String quickBuy, @Nullable String secKillId, @Nullable String crowdFundingId, @Nullable String crowdFundingType, @Nullable String addBuyPackages, @Nullable List<OrderParamsInsurance> services, @Nullable String suits, @Nullable String pingouId, @Nullable List<OrderParamsGifts> gifts, @NotNull String preOrdainType, @NotNull String sourceSort, @NotNull String quickBuyPageUrl, @NotNull String integralId, @NotNull String channel, @NotNull String activityId, @NotNull String referId, @Nullable LaserPersonal laserPersonal, @Nullable Object extendInfo) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(skuId, "skuId");
        Intrinsics.checkNotNullParameter(preOrdainType, "preOrdainType");
        Intrinsics.checkNotNullParameter(sourceSort, "sourceSort");
        Intrinsics.checkNotNullParameter(quickBuyPageUrl, "quickBuyPageUrl");
        Intrinsics.checkNotNullParameter(integralId, "integralId");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(activityId, "activityId");
        Intrinsics.checkNotNullParameter(referId, "referId");
        return new OrderParamsData(quantity, skuId, id, quickBuy, secKillId, crowdFundingId, crowdFundingType, addBuyPackages, services, suits, pingouId, gifts, preOrdainType, sourceSort, quickBuyPageUrl, integralId, channel, activityId, referId, laserPersonal, extendInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderParamsData)) {
            return false;
        }
        OrderParamsData orderParamsData = (OrderParamsData) other;
        return Intrinsics.areEqual(this.quantity, orderParamsData.quantity) && Intrinsics.areEqual(this.skuId, orderParamsData.skuId) && Intrinsics.areEqual(this.id, orderParamsData.id) && Intrinsics.areEqual(this.quickBuy, orderParamsData.quickBuy) && Intrinsics.areEqual(this.secKillId, orderParamsData.secKillId) && Intrinsics.areEqual(this.crowdFundingId, orderParamsData.crowdFundingId) && Intrinsics.areEqual(this.crowdFundingType, orderParamsData.crowdFundingType) && Intrinsics.areEqual(this.addBuyPackages, orderParamsData.addBuyPackages) && Intrinsics.areEqual(this.services, orderParamsData.services) && Intrinsics.areEqual(this.suits, orderParamsData.suits) && Intrinsics.areEqual(this.pingouId, orderParamsData.pingouId) && Intrinsics.areEqual(this.gifts, orderParamsData.gifts) && Intrinsics.areEqual(this.preOrdainType, orderParamsData.preOrdainType) && Intrinsics.areEqual(this.sourceSort, orderParamsData.sourceSort) && Intrinsics.areEqual(this.quickBuyPageUrl, orderParamsData.quickBuyPageUrl) && Intrinsics.areEqual(this.integralId, orderParamsData.integralId) && Intrinsics.areEqual(this.channel, orderParamsData.channel) && Intrinsics.areEqual(this.activityId, orderParamsData.activityId) && Intrinsics.areEqual(this.referId, orderParamsData.referId) && Intrinsics.areEqual(this.laserPersonal, orderParamsData.laserPersonal) && Intrinsics.areEqual(this.extendInfo, orderParamsData.extendInfo);
    }

    @NotNull
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final String getAddBuyPackages() {
        return this.addBuyPackages;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getCrowdFundingId() {
        return this.crowdFundingId;
    }

    @Nullable
    public final String getCrowdFundingType() {
        return this.crowdFundingType;
    }

    @Nullable
    public final Object getExtendInfo() {
        return this.extendInfo;
    }

    @Nullable
    public final List<OrderParamsGifts> getGifts() {
        return this.gifts;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getIntegralId() {
        return this.integralId;
    }

    @Nullable
    public final LaserPersonal getLaserPersonal() {
        return this.laserPersonal;
    }

    @Nullable
    public final String getPingouId() {
        return this.pingouId;
    }

    @NotNull
    public final String getPreOrdainType() {
        return this.preOrdainType;
    }

    @NotNull
    public final String getQuantity() {
        return this.quantity;
    }

    @Nullable
    public final String getQuickBuy() {
        return this.quickBuy;
    }

    @NotNull
    public final String getQuickBuyPageUrl() {
        return this.quickBuyPageUrl;
    }

    @NotNull
    public final String getReferId() {
        return this.referId;
    }

    @Nullable
    public final String getSecKillId() {
        return this.secKillId;
    }

    @Nullable
    public final List<OrderParamsInsurance> getServices() {
        return this.services;
    }

    @NotNull
    public final String getSkuId() {
        return this.skuId;
    }

    @NotNull
    public final String getSourceSort() {
        return this.sourceSort;
    }

    @Nullable
    public final String getSuits() {
        return this.suits;
    }

    public int hashCode() {
        int iHashCode = ((this.quantity.hashCode() * 31) + this.skuId.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.quickBuy;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secKillId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.crowdFundingId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.crowdFundingType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addBuyPackages;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<OrderParamsInsurance> list = this.services;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.suits;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pingouId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<OrderParamsGifts> list2 = this.gifts;
        int iHashCode11 = (((((((((((((((iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.preOrdainType.hashCode()) * 31) + this.sourceSort.hashCode()) * 31) + this.quickBuyPageUrl.hashCode()) * 31) + this.integralId.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.activityId.hashCode()) * 31) + this.referId.hashCode()) * 31;
        LaserPersonal laserPersonal = this.laserPersonal;
        int iHashCode12 = (iHashCode11 + (laserPersonal == null ? 0 : laserPersonal.hashCode())) * 31;
        Object obj = this.extendInfo;
        return iHashCode12 + (obj != null ? obj.hashCode() : 0);
    }

    public final void setActivityId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.activityId = str;
    }

    public final void setAddBuyPackages(@Nullable String str) {
        this.addBuyPackages = str;
    }

    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channel = str;
    }

    public final void setCrowdFundingId(@Nullable String str) {
        this.crowdFundingId = str;
    }

    public final void setCrowdFundingType(@Nullable String str) {
        this.crowdFundingType = str;
    }

    public final void setExtendInfo(@Nullable Object obj) {
        this.extendInfo = obj;
    }

    public final void setGifts(@Nullable List<OrderParamsGifts> list) {
        this.gifts = list;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setIntegralId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.integralId = str;
    }

    public final void setLaserPersonal(@Nullable LaserPersonal laserPersonal) {
        this.laserPersonal = laserPersonal;
    }

    public final void setPingouId(@Nullable String str) {
        this.pingouId = str;
    }

    public final void setPreOrdainType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.preOrdainType = str;
    }

    public final void setQuantity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.quantity = str;
    }

    public final void setQuickBuy(@Nullable String str) {
        this.quickBuy = str;
    }

    public final void setQuickBuyPageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.quickBuyPageUrl = str;
    }

    public final void setReferId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.referId = str;
    }

    public final void setSecKillId(@Nullable String str) {
        this.secKillId = str;
    }

    public final void setServices(@Nullable List<OrderParamsInsurance> list) {
        this.services = list;
    }

    public final void setSkuId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.skuId = str;
    }

    public final void setSourceSort(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sourceSort = str;
    }

    public final void setSuits(@Nullable String str) {
        this.suits = str;
    }

    @NotNull
    public String toString() {
        return "OrderParamsData(quantity=" + this.quantity + ", skuId=" + this.skuId + ", id=" + ((Object) this.id) + ", quickBuy=" + ((Object) this.quickBuy) + ", secKillId=" + ((Object) this.secKillId) + ", crowdFundingId=" + ((Object) this.crowdFundingId) + ", crowdFundingType=" + ((Object) this.crowdFundingType) + ", addBuyPackages=" + ((Object) this.addBuyPackages) + ", services=" + this.services + ", suits=" + ((Object) this.suits) + ", pingouId=" + ((Object) this.pingouId) + ", gifts=" + this.gifts + ", preOrdainType=" + this.preOrdainType + ", sourceSort=" + this.sourceSort + ", quickBuyPageUrl=" + this.quickBuyPageUrl + ", integralId=" + this.integralId + ", channel=" + this.channel + ", activityId=" + this.activityId + ", referId=" + this.referId + ", laserPersonal=" + this.laserPersonal + ", extendInfo=" + this.extendInfo + ')';
    }

    public OrderParamsData(@NotNull String quantity, @NotNull String skuId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable List<OrderParamsInsurance> list, @Nullable String str7, @Nullable String str8, @Nullable List<OrderParamsGifts> list2, @NotNull String preOrdainType, @NotNull String sourceSort, @NotNull String quickBuyPageUrl, @NotNull String integralId, @NotNull String channel, @NotNull String activityId, @NotNull String referId, @Nullable LaserPersonal laserPersonal, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(skuId, "skuId");
        Intrinsics.checkNotNullParameter(preOrdainType, "preOrdainType");
        Intrinsics.checkNotNullParameter(sourceSort, "sourceSort");
        Intrinsics.checkNotNullParameter(quickBuyPageUrl, "quickBuyPageUrl");
        Intrinsics.checkNotNullParameter(integralId, "integralId");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(activityId, "activityId");
        Intrinsics.checkNotNullParameter(referId, "referId");
        this.quantity = quantity;
        this.skuId = skuId;
        this.id = str;
        this.quickBuy = str2;
        this.secKillId = str3;
        this.crowdFundingId = str4;
        this.crowdFundingType = str5;
        this.addBuyPackages = str6;
        this.services = list;
        this.suits = str7;
        this.pingouId = str8;
        this.gifts = list2;
        this.preOrdainType = preOrdainType;
        this.sourceSort = sourceSort;
        this.quickBuyPageUrl = quickBuyPageUrl;
        this.integralId = integralId;
        this.channel = channel;
        this.activityId = activityId;
        this.referId = referId;
        this.laserPersonal = laserPersonal;
        this.extendInfo = obj;
    }

    public /* synthetic */ OrderParamsData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, List list2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, LaserPersonal laserPersonal, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : list2, (i & 4096) == 0 ? str11 : "1", (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? "" : str17, (i & 524288) != 0 ? null : laserPersonal, (i & 1048576) != 0 ? null : obj);
    }
}
