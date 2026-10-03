package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\bD\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\t\u0010R\u001a\u00020\u0019HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010Z\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103JÒ\u0001\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001¢\u0006\u0002\u0010\\J\u0013\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010`\u001a\u00020\u0019HÖ\u0001J\t\u0010a\u001a\u00020\u0007HÖ\u0001R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010'\"\u0004\b>\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010'\"\u0004\b@\u0010)R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\bA\u0010 \"\u0004\bB\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010'\"\u0004\bD\u0010)R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010'\"\u0004\bF\u0010)R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006b"}, d2 = {"Lcom/heytap/store/base/core/data/RecommendGoodsDetailVo;", "", "skuId", "", "vipDiscounts", "Lcom/heytap/store/base/core/data/VipDiscountVo;", "url", "", "spuDisplayName", "skuDisplayName", "pricePrefix", "priceInfo", "Lcom/heytap/store/base/core/data/PriceVoDTO;", SensorsBean.PRICE, "", "originalPrice", "marketPrice", "link", "goodsSpuName", "goodsSpuId", "categoryId", "activityList", "", "Lcom/heytap/store/base/core/data/GoodsActivityInfoVo;", "index", "", "(Ljava/lang/Long;Lcom/heytap/store/base/core/data/VipDiscountVo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/store/base/core/data/PriceVoDTO;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;I)V", "getActivityList", "()Ljava/util/List;", "setActivityList", "(Ljava/util/List;)V", "getCategoryId", "()Ljava/lang/Long;", "setCategoryId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getGoodsSpuId", "setGoodsSpuId", "getGoodsSpuName", "()Ljava/lang/String;", "setGoodsSpuName", "(Ljava/lang/String;)V", "getIndex", "()I", "setIndex", "(I)V", "getLink", "setLink", "getMarketPrice", "setMarketPrice", "getOriginalPrice", "()Ljava/lang/Double;", "setOriginalPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPrice", "setPrice", "getPriceInfo", "()Lcom/heytap/store/base/core/data/PriceVoDTO;", "setPriceInfo", "(Lcom/heytap/store/base/core/data/PriceVoDTO;)V", "getPricePrefix", "setPricePrefix", "getSkuDisplayName", "setSkuDisplayName", "getSkuId", "setSkuId", "getSpuDisplayName", "setSpuDisplayName", "getUrl", "setUrl", "getVipDiscounts", "()Lcom/heytap/store/base/core/data/VipDiscountVo;", "setVipDiscounts", "(Lcom/heytap/store/base/core/data/VipDiscountVo;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Lcom/heytap/store/base/core/data/VipDiscountVo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/store/base/core/data/PriceVoDTO;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;I)Lcom/heytap/store/base/core/data/RecommendGoodsDetailVo;", "equals", "", "other", "hashCode", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class RecommendGoodsDetailVo {

    @Nullable
    private List<GoodsActivityInfoVo> activityList;

    @Nullable
    private Long categoryId;

    @Nullable
    private Long goodsSpuId;

    @Nullable
    private String goodsSpuName;
    private int index;

    @Nullable
    private String link;

    @Nullable
    private String marketPrice;

    @Nullable
    private Double originalPrice;

    @Nullable
    private Double price;

    @Nullable
    private PriceVoDTO priceInfo;

    @Nullable
    private String pricePrefix;

    @Nullable
    private String skuDisplayName;

    @Nullable
    private Long skuId;

    @Nullable
    private String spuDisplayName;

    @Nullable
    private String url;

    @Nullable
    private VipDiscountVo vipDiscounts;

    public RecommendGoodsDetailVo(@Nullable Long l2, @Nullable VipDiscountVo vipDiscountVo, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable PriceVoDTO priceVoDTO, @Nullable Double d, @Nullable Double d2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Long l3, @Nullable Long l4, @Nullable List<GoodsActivityInfoVo> list, int i) {
        this.skuId = l2;
        this.vipDiscounts = vipDiscountVo;
        this.url = str;
        this.spuDisplayName = str2;
        this.skuDisplayName = str3;
        this.pricePrefix = str4;
        this.priceInfo = priceVoDTO;
        this.price = d;
        this.originalPrice = d2;
        this.marketPrice = str5;
        this.link = str6;
        this.goodsSpuName = str7;
        this.goodsSpuId = l3;
        this.categoryId = l4;
        this.activityList = list;
        this.index = i;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getSkuId() {
        return this.skuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getGoodsSpuName() {
        return this.goodsSpuName;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getGoodsSpuId() {
        return this.goodsSpuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final List<GoodsActivityInfoVo> component15() {
        return this.activityList;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VipDiscountVo getVipDiscounts() {
        return this.vipDiscounts;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpuDisplayName() {
        return this.spuDisplayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSkuDisplayName() {
        return this.skuDisplayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPricePrefix() {
        return this.pricePrefix;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PriceVoDTO getPriceInfo() {
        return this.priceInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getOriginalPrice() {
        return this.originalPrice;
    }

    @NotNull
    public final RecommendGoodsDetailVo copy(@Nullable Long skuId, @Nullable VipDiscountVo vipDiscounts, @Nullable String url, @Nullable String spuDisplayName, @Nullable String skuDisplayName, @Nullable String pricePrefix, @Nullable PriceVoDTO priceInfo, @Nullable Double price, @Nullable Double originalPrice, @Nullable String marketPrice, @Nullable String link, @Nullable String goodsSpuName, @Nullable Long goodsSpuId, @Nullable Long categoryId, @Nullable List<GoodsActivityInfoVo> activityList, int index) {
        return new RecommendGoodsDetailVo(skuId, vipDiscounts, url, spuDisplayName, skuDisplayName, pricePrefix, priceInfo, price, originalPrice, marketPrice, link, goodsSpuName, goodsSpuId, categoryId, activityList, index);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendGoodsDetailVo)) {
            return false;
        }
        RecommendGoodsDetailVo recommendGoodsDetailVo = (RecommendGoodsDetailVo) other;
        return Intrinsics.areEqual(this.skuId, recommendGoodsDetailVo.skuId) && Intrinsics.areEqual(this.vipDiscounts, recommendGoodsDetailVo.vipDiscounts) && Intrinsics.areEqual(this.url, recommendGoodsDetailVo.url) && Intrinsics.areEqual(this.spuDisplayName, recommendGoodsDetailVo.spuDisplayName) && Intrinsics.areEqual(this.skuDisplayName, recommendGoodsDetailVo.skuDisplayName) && Intrinsics.areEqual(this.pricePrefix, recommendGoodsDetailVo.pricePrefix) && Intrinsics.areEqual(this.priceInfo, recommendGoodsDetailVo.priceInfo) && Intrinsics.areEqual((Object) this.price, (Object) recommendGoodsDetailVo.price) && Intrinsics.areEqual((Object) this.originalPrice, (Object) recommendGoodsDetailVo.originalPrice) && Intrinsics.areEqual(this.marketPrice, recommendGoodsDetailVo.marketPrice) && Intrinsics.areEqual(this.link, recommendGoodsDetailVo.link) && Intrinsics.areEqual(this.goodsSpuName, recommendGoodsDetailVo.goodsSpuName) && Intrinsics.areEqual(this.goodsSpuId, recommendGoodsDetailVo.goodsSpuId) && Intrinsics.areEqual(this.categoryId, recommendGoodsDetailVo.categoryId) && Intrinsics.areEqual(this.activityList, recommendGoodsDetailVo.activityList) && this.index == recommendGoodsDetailVo.index;
    }

    @Nullable
    public final List<GoodsActivityInfoVo> getActivityList() {
        return this.activityList;
    }

    @Nullable
    public final Long getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final Long getGoodsSpuId() {
        return this.goodsSpuId;
    }

    @Nullable
    public final String getGoodsSpuName() {
        return this.goodsSpuName;
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @Nullable
    public final Double getOriginalPrice() {
        return this.originalPrice;
    }

    @Nullable
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    public final PriceVoDTO getPriceInfo() {
        return this.priceInfo;
    }

    @Nullable
    public final String getPricePrefix() {
        return this.pricePrefix;
    }

    @Nullable
    public final String getSkuDisplayName() {
        return this.skuDisplayName;
    }

    @Nullable
    public final Long getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final String getSpuDisplayName() {
        return this.spuDisplayName;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final VipDiscountVo getVipDiscounts() {
        return this.vipDiscounts;
    }

    public int hashCode() {
        Long l2 = this.skuId;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        VipDiscountVo vipDiscountVo = this.vipDiscounts;
        int iHashCode2 = (iHashCode + (vipDiscountVo == null ? 0 : vipDiscountVo.hashCode())) * 31;
        String str = this.url;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.spuDisplayName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.skuDisplayName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pricePrefix;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PriceVoDTO priceVoDTO = this.priceInfo;
        int iHashCode7 = (iHashCode6 + (priceVoDTO == null ? 0 : priceVoDTO.hashCode())) * 31;
        Double d = this.price;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.originalPrice;
        int iHashCode9 = (iHashCode8 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str5 = this.marketPrice;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.link;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.goodsSpuName;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l3 = this.goodsSpuId;
        int iHashCode13 = (iHashCode12 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.categoryId;
        int iHashCode14 = (iHashCode13 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List<GoodsActivityInfoVo> list = this.activityList;
        return ((iHashCode14 + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.index);
    }

    public final void setActivityList(@Nullable List<GoodsActivityInfoVo> list) {
        this.activityList = list;
    }

    public final void setCategoryId(@Nullable Long l2) {
        this.categoryId = l2;
    }

    public final void setGoodsSpuId(@Nullable Long l2) {
        this.goodsSpuId = l2;
    }

    public final void setGoodsSpuName(@Nullable String str) {
        this.goodsSpuName = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setMarketPrice(@Nullable String str) {
        this.marketPrice = str;
    }

    public final void setOriginalPrice(@Nullable Double d) {
        this.originalPrice = d;
    }

    public final void setPrice(@Nullable Double d) {
        this.price = d;
    }

    public final void setPriceInfo(@Nullable PriceVoDTO priceVoDTO) {
        this.priceInfo = priceVoDTO;
    }

    public final void setPricePrefix(@Nullable String str) {
        this.pricePrefix = str;
    }

    public final void setSkuDisplayName(@Nullable String str) {
        this.skuDisplayName = str;
    }

    public final void setSkuId(@Nullable Long l2) {
        this.skuId = l2;
    }

    public final void setSpuDisplayName(@Nullable String str) {
        this.spuDisplayName = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setVipDiscounts(@Nullable VipDiscountVo vipDiscountVo) {
        this.vipDiscounts = vipDiscountVo;
    }

    @NotNull
    public String toString() {
        return "RecommendGoodsDetailVo(skuId=" + this.skuId + ", vipDiscounts=" + this.vipDiscounts + ", url=" + ((Object) this.url) + ", spuDisplayName=" + ((Object) this.spuDisplayName) + ", skuDisplayName=" + ((Object) this.skuDisplayName) + ", pricePrefix=" + ((Object) this.pricePrefix) + ", priceInfo=" + this.priceInfo + ", price=" + this.price + ", originalPrice=" + this.originalPrice + ", marketPrice=" + ((Object) this.marketPrice) + ", link=" + ((Object) this.link) + ", goodsSpuName=" + ((Object) this.goodsSpuName) + ", goodsSpuId=" + this.goodsSpuId + ", categoryId=" + this.categoryId + ", activityList=" + this.activityList + ", index=" + this.index + ')';
    }

    public /* synthetic */ RecommendGoodsDetailVo(Long l2, VipDiscountVo vipDiscountVo, String str, String str2, String str3, String str4, PriceVoDTO priceVoDTO, Double d, Double d2, String str5, String str6, String str7, Long l3, Long l4, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(l2, vipDiscountVo, str, str2, str3, str4, priceVoDTO, d, d2, str5, str6, str7, l3, l4, list, (i2 & 32768) != 0 ? 0 : i);
    }
}
