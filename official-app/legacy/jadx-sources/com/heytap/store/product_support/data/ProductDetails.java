package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000eR\u0014\u0010#\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000eR\u0013\u0010$\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012R\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0012R\u0013\u0010,\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0012R\u0019\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0014\u00100\u001a\u000201X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u000201X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0013\u0010:\u001a\u0004\u0018\u00010;¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010>\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0012R\u0014\u0010@\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u000eR\u0013\u0010B\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0012R\u0019\u0010D\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0007R\u0013\u0010G\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0012R\u0014\u0010I\u001a\u00020\u001aX\u0086D¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010L\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0012R\u0013\u0010N\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0012R\u0013\u0010P\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0012R\u0013\u0010R\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\u0012R\u0013\u0010T\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0012R\u0013\u0010V\u001a\u0004\u0018\u00010W¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0015\u0010Z\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010]\u001a\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lcom/heytap/store/product_support/data/ProductDetails;", "", "()V", "activityList", "", "Lcom/heytap/store/product_support/data/GoodsActivityInfoJsonBean;", "getActivityList", "()Ljava/util/List;", "bannerInfoVO", "Lcom/heytap/store/product_support/data/BannerInfoVO;", "getBannerInfoVO", "categoryId", "", "getCategoryId", "()I", "goodsSpuCode", "", "getGoodsSpuCode", "()Ljava/lang/String;", "goodsSpuId", "getGoodsSpuId", "goodsSpuName", "getGoodsSpuName", "heytapInfo", "getHeytapInfo", "id", "", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "informationFlowThreadVO", "Lcom/heytap/store/product_support/data/InformationFlowThread;", "getInformationFlowThreadVO", "()Lcom/heytap/store/product_support/data/InformationFlowThread;", "isLogin", "isNotLike", "link", "getLink", "liveInfoVO", "Lcom/heytap/store/product_support/data/LiveInfo;", "getLiveInfoVO", "()Lcom/heytap/store/product_support/data/LiveInfo;", "marketPrice", "getMarketPrice", "nameLabel", "getNameLabel", "namePrefixLabel", "getNamePrefixLabel", "originalPrice", "", "getOriginalPrice", "()D", "placeholderLabel", "Lcom/heytap/store/product_support/data/PlaceholderLabel;", "getPlaceholderLabel", "()Lcom/heytap/store/product_support/data/PlaceholderLabel;", SensorsBean.PRICE, "getPrice", "priceInfo", "Lcom/heytap/store/product_support/data/PriceInfo;", "getPriceInfo", "()Lcom/heytap/store/product_support/data/PriceInfo;", "pricePrefix", "getPricePrefix", "recommendType", "getRecommendType", "retrieveId", "getRetrieveId", "saleAttrValueList", "Lcom/heytap/store/product_support/data/SaleAttrValue;", "getSaleAttrValueList", "secondTitle", "getSecondTitle", "skuId", "getSkuId", "()J", "spuAlias", "getSpuAlias", "spuName", "getSpuName", "startTime", "getStartTime", "title", "getTitle", "url", "getUrl", "vipDiscounts", "Lcom/heytap/store/product_support/data/VipDiscountsVo;", "getVipDiscounts", "()Lcom/heytap/store/product_support/data/VipDiscountsVo;", "weight", "getWeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ProductDetails {

    @Nullable
    private final List<GoodsActivityInfoJsonBean> activityList;

    @Nullable
    private final List<BannerInfoVO> bannerInfoVO;
    private final int categoryId;

    @Nullable
    private final String goodsSpuCode;
    private final int goodsSpuId;

    @Nullable
    private final String goodsSpuName;

    @Nullable
    private final String heytapInfo;

    @Nullable
    private final Long id;

    @Nullable
    private final InformationFlowThread informationFlowThreadVO;
    private final int isLogin;
    private final int isNotLike;

    @Nullable
    private final String link;

    @Nullable
    private final LiveInfo liveInfoVO;

    @Nullable
    private final String marketPrice;

    @Nullable
    private final String nameLabel;

    @Nullable
    private final List<String> namePrefixLabel;
    private final double originalPrice;

    @Nullable
    private final PlaceholderLabel placeholderLabel;
    private final double price;

    @Nullable
    private final PriceInfo priceInfo;

    @Nullable
    private final String pricePrefix;
    private final int recommendType = 1;

    @Nullable
    private final String retrieveId;

    @Nullable
    private final List<SaleAttrValue> saleAttrValueList;

    @Nullable
    private final String secondTitle;
    private final long skuId;

    @Nullable
    private final String spuAlias;

    @Nullable
    private final String spuName;

    @Nullable
    private final String startTime;

    @Nullable
    private final String title;

    @Nullable
    private final String url;

    @Nullable
    private final VipDiscountsVo vipDiscounts;

    @Nullable
    private final Integer weight;

    @Nullable
    public final List<GoodsActivityInfoJsonBean> getActivityList() {
        return this.activityList;
    }

    @Nullable
    public final List<BannerInfoVO> getBannerInfoVO() {
        return this.bannerInfoVO;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getGoodsSpuCode() {
        return this.goodsSpuCode;
    }

    public final int getGoodsSpuId() {
        return this.goodsSpuId;
    }

    @Nullable
    public final String getGoodsSpuName() {
        return this.goodsSpuName;
    }

    @Nullable
    public final String getHeytapInfo() {
        return this.heytapInfo;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final InformationFlowThread getInformationFlowThreadVO() {
        return this.informationFlowThreadVO;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final LiveInfo getLiveInfoVO() {
        return this.liveInfoVO;
    }

    @Nullable
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @Nullable
    public final String getNameLabel() {
        return this.nameLabel;
    }

    @Nullable
    public final List<String> getNamePrefixLabel() {
        return this.namePrefixLabel;
    }

    public final double getOriginalPrice() {
        return this.originalPrice;
    }

    @Nullable
    public final PlaceholderLabel getPlaceholderLabel() {
        return this.placeholderLabel;
    }

    public final double getPrice() {
        return this.price;
    }

    @Nullable
    public final PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    @Nullable
    public final String getPricePrefix() {
        return this.pricePrefix;
    }

    public final int getRecommendType() {
        return this.recommendType;
    }

    @Nullable
    public final String getRetrieveId() {
        return this.retrieveId;
    }

    @Nullable
    public final List<SaleAttrValue> getSaleAttrValueList() {
        return this.saleAttrValueList;
    }

    @Nullable
    public final String getSecondTitle() {
        return this.secondTitle;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final String getSpuAlias() {
        return this.spuAlias;
    }

    @Nullable
    public final String getSpuName() {
        return this.spuName;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final VipDiscountsVo getVipDiscounts() {
        return this.vipDiscounts;
    }

    @Nullable
    public final Integer getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: isLogin, reason: from getter */
    public final int getIsLogin() {
        return this.isLogin;
    }

    /* JADX INFO: renamed from: isNotLike, reason: from getter */
    public final int getIsNotLike() {
        return this.isNotLike;
    }
}
