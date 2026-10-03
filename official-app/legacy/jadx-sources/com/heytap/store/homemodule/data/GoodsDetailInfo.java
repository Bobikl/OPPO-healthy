package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.product_support.data.GoodsActivityInfoJsonBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0003\b\u0080\u0001\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0002\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\"\u001a\u00020\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010*J\u0011\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010v\u001a\u00020\nHÆ\u0003J\t\u0010w\u001a\u00020\nHÆ\u0003J\t\u0010x\u001a\u00020\nHÆ\u0003J\t\u0010y\u001a\u00020\nHÆ\u0003J\t\u0010z\u001a\u00020\nHÆ\u0003J\t\u0010{\u001a\u00020\nHÆ\u0003J\t\u0010|\u001a\u00020\nHÆ\u0003J\t\u0010}\u001a\u00020\nHÆ\u0003J\t\u0010~\u001a\u00020\bHÆ\u0003J\t\u0010\u007f\u001a\u00020\nHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\nHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0006HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0006HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\bHÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0012\u0010\u0091\u0001\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\nHÆ\u0003J\u008a\u0003\u0010\u0097\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\"\u001a\u00020\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0003\u0010\u0098\u0001J\u0015\u0010\u0099\u0001\u001a\u00020\u00062\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u009b\u0001\u001a\u00020\bHÖ\u0001J\n\u0010\u009c\u0001\u001a\u00020\nHÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00100\"\u0004\b:\u00102R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010>\"\u0004\b?\u0010@R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010>\"\u0004\bA\u0010@R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010>\"\u0004\bB\u0010@R\u001a\u0010\u001e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010>\"\u0004\bC\u0010@R\u001a\u0010\u001a\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u00100\"\u0004\bD\u00102R\u001a\u0010\"\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010>\"\u0004\bE\u0010@R\u001c\u0010#\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00104\"\u0004\bG\u00106R\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00104\"\u0004\bI\u00106R\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00104\"\u0004\bM\u00106R\u001a\u0010\u0013\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00104\"\u0004\bO\u00106R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00104\"\u0004\bQ\u00106R\u001e\u0010 \u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010V\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u00104\"\u0004\bX\u00106R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00104\"\u0004\b\\\u00106R\u001a\u0010\u0017\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u00104\"\u0004\b^\u00106R\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u00104\"\u0004\b`\u00106R\u001c\u0010(\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u00104\"\u0004\bb\u00106R\u001c\u0010'\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u00104\"\u0004\bd\u00106R\u001c\u0010&\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u00104\"\u0004\bf\u00106R\u001a\u0010\u0018\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u00100\"\u0004\bh\u00102R\u001c\u0010%\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u00104\"\u0004\bj\u00106R\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u00104\"\u0004\bl\u00106R\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u00104\"\u0004\bn\u00106R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001c\u0010)\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u00104\"\u0004\bt\u00106¨\u0006\u009d\u0001"}, d2 = {"Lcom/heytap/store/homemodule/data/GoodsDetailInfo;", "", "activityList", "", "Lcom/heytap/store/product_support/data/GoodsActivityInfoJsonBean;", "isNeedDiscountLayout", "", "categoryId", "", "extendList", "", "isNeedExtendLayout", "goodsTopCategoryId", "heytapInfo", "isNeedHeyTapLayout", "marketPrice", "nameLabel", "imageLabel", "nameLabelHeight", "nameLabelWidth", "originPrice", SensorsBean.PRICE, "pricePrefix", "priceSuffix", "skuId", "thirdTitle", "isNotLike", "recommendReason", "vipDiscounts", "Lcom/heytap/store/homemodule/data/VipDiscounts;", "isNeedShowVipLayout", "noStockStr", "noStockType", "transparent", "isRecommendation", "logId", "expId", "strategyId", "sectionId", "sceneId", "retrieveId", "weight", "(Ljava/util/List;ZILjava/util/List;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lcom/heytap/store/homemodule/data/VipDiscounts;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityList", "()Ljava/util/List;", "setActivityList", "(Ljava/util/List;)V", "getCategoryId", "()I", "setCategoryId", "(I)V", "getExpId", "()Ljava/lang/String;", "setExpId", "(Ljava/lang/String;)V", "getExtendList", "setExtendList", "getGoodsTopCategoryId", "setGoodsTopCategoryId", "getHeytapInfo", "setHeytapInfo", "getImageLabel", "()Z", "setNeedDiscountLayout", "(Z)V", "setNeedExtendLayout", "setNeedHeyTapLayout", "setNeedShowVipLayout", "setNotLike", "setRecommendation", "getLogId", "setLogId", "getMarketPrice", "setMarketPrice", "getNameLabel", "setNameLabel", "getNameLabelHeight", "setNameLabelHeight", "getNameLabelWidth", "setNameLabelWidth", "getNoStockStr", "setNoStockStr", "getNoStockType", "()Ljava/lang/Integer;", "setNoStockType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOriginPrice", "setOriginPrice", "getPrice", "setPrice", "getPricePrefix", "setPricePrefix", "getPriceSuffix", "setPriceSuffix", "getRecommendReason", "setRecommendReason", "getRetrieveId", "setRetrieveId", "getSceneId", "setSceneId", "getSectionId", "setSectionId", "getSkuId", "setSkuId", "getStrategyId", "setStrategyId", "getThirdTitle", "setThirdTitle", "getTransparent", "setTransparent", "getVipDiscounts", "()Lcom/heytap/store/homemodule/data/VipDiscounts;", "setVipDiscounts", "(Lcom/heytap/store/homemodule/data/VipDiscounts;)V", "getWeight", "setWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;ZILjava/util/List;ZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lcom/heytap/store/homemodule/data/VipDiscounts;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/store/homemodule/data/GoodsDetailInfo;", "equals", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class GoodsDetailInfo {

    @Nullable
    private List<GoodsActivityInfoJsonBean> activityList;
    private int categoryId;

    @Nullable
    private String expId;

    @Nullable
    private List<String> extendList;
    private int goodsTopCategoryId;

    @NotNull
    private String heytapInfo;

    @NotNull
    private final String imageLabel;
    private boolean isNeedDiscountLayout;
    private boolean isNeedExtendLayout;
    private boolean isNeedHeyTapLayout;
    private boolean isNeedShowVipLayout;
    private int isNotLike;
    private boolean isRecommendation;

    @Nullable
    private String logId;

    @NotNull
    private String marketPrice;

    @NotNull
    private String nameLabel;

    @NotNull
    private String nameLabelHeight;

    @NotNull
    private String nameLabelWidth;

    @Nullable
    private String noStockStr;

    @Nullable
    private Integer noStockType;

    @NotNull
    private String originPrice;

    @NotNull
    private String price;

    @NotNull
    private String pricePrefix;

    @NotNull
    private String priceSuffix;

    @NotNull
    private String recommendReason;

    @Nullable
    private String retrieveId;

    @Nullable
    private String sceneId;

    @Nullable
    private String sectionId;
    private int skuId;

    @Nullable
    private String strategyId;

    @NotNull
    private String thirdTitle;

    @Nullable
    private String transparent;

    @Nullable
    private VipDiscounts vipDiscounts;

    @Nullable
    private String weight;

    public GoodsDetailInfo() {
        this(null, false, 0, null, false, 0, null, false, null, null, null, null, null, null, null, null, null, 0, null, 0, null, null, false, null, null, null, false, null, null, null, null, null, null, null, -1, 3, null);
    }

    @Nullable
    public final List<GoodsActivityInfoJsonBean> component1() {
        return this.activityList;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNameLabel() {
        return this.nameLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getImageLabel() {
        return this.imageLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getNameLabelHeight() {
        return this.nameLabelHeight;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNameLabelWidth() {
        return this.nameLabelWidth;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getOriginPrice() {
        return this.originPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPricePrefix() {
        return this.pricePrefix;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPriceSuffix() {
        return this.priceSuffix;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getSkuId() {
        return this.skuId;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getThirdTitle() {
        return this.thirdTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsNeedDiscountLayout() {
        return this.isNeedDiscountLayout;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getIsNotLike() {
        return this.isNotLike;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRecommendReason() {
        return this.recommendReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final VipDiscounts getVipDiscounts() {
        return this.vipDiscounts;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getIsNeedShowVipLayout() {
        return this.isNeedShowVipLayout;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getNoStockStr() {
        return this.noStockStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getNoStockType() {
        return this.noStockType;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getTransparent() {
        return this.transparent;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getIsRecommendation() {
        return this.isRecommendation;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getLogId() {
        return this.logId;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getExpId() {
        return this.expId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getStrategyId() {
        return this.strategyId;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getSectionId() {
        return this.sectionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getSceneId() {
        return this.sceneId;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getRetrieveId() {
        return this.retrieveId;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    @Nullable
    public final List<String> component4() {
        return this.extendList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsNeedExtendLayout() {
        return this.isNeedExtendLayout;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getGoodsTopCategoryId() {
        return this.goodsTopCategoryId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHeytapInfo() {
        return this.heytapInfo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsNeedHeyTapLayout() {
        return this.isNeedHeyTapLayout;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @NotNull
    public final GoodsDetailInfo copy(@Nullable List<GoodsActivityInfoJsonBean> activityList, boolean isNeedDiscountLayout, int categoryId, @Nullable List<String> extendList, boolean isNeedExtendLayout, int goodsTopCategoryId, @NotNull String heytapInfo, boolean isNeedHeyTapLayout, @NotNull String marketPrice, @NotNull String nameLabel, @NotNull String imageLabel, @NotNull String nameLabelHeight, @NotNull String nameLabelWidth, @NotNull String originPrice, @NotNull String price, @NotNull String pricePrefix, @NotNull String priceSuffix, int skuId, @NotNull String thirdTitle, int isNotLike, @NotNull String recommendReason, @Nullable VipDiscounts vipDiscounts, boolean isNeedShowVipLayout, @Nullable String noStockStr, @Nullable Integer noStockType, @Nullable String transparent, boolean isRecommendation, @Nullable String logId, @Nullable String expId, @Nullable String strategyId, @Nullable String sectionId, @Nullable String sceneId, @Nullable String retrieveId, @Nullable String weight) {
        Intrinsics.checkNotNullParameter(heytapInfo, "heytapInfo");
        Intrinsics.checkNotNullParameter(marketPrice, "marketPrice");
        Intrinsics.checkNotNullParameter(nameLabel, "nameLabel");
        Intrinsics.checkNotNullParameter(imageLabel, "imageLabel");
        Intrinsics.checkNotNullParameter(nameLabelHeight, "nameLabelHeight");
        Intrinsics.checkNotNullParameter(nameLabelWidth, "nameLabelWidth");
        Intrinsics.checkNotNullParameter(originPrice, "originPrice");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(pricePrefix, "pricePrefix");
        Intrinsics.checkNotNullParameter(priceSuffix, "priceSuffix");
        Intrinsics.checkNotNullParameter(thirdTitle, "thirdTitle");
        Intrinsics.checkNotNullParameter(recommendReason, "recommendReason");
        return new GoodsDetailInfo(activityList, isNeedDiscountLayout, categoryId, extendList, isNeedExtendLayout, goodsTopCategoryId, heytapInfo, isNeedHeyTapLayout, marketPrice, nameLabel, imageLabel, nameLabelHeight, nameLabelWidth, originPrice, price, pricePrefix, priceSuffix, skuId, thirdTitle, isNotLike, recommendReason, vipDiscounts, isNeedShowVipLayout, noStockStr, noStockType, transparent, isRecommendation, logId, expId, strategyId, sectionId, sceneId, retrieveId, weight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoodsDetailInfo)) {
            return false;
        }
        GoodsDetailInfo goodsDetailInfo = (GoodsDetailInfo) other;
        return Intrinsics.areEqual(this.activityList, goodsDetailInfo.activityList) && this.isNeedDiscountLayout == goodsDetailInfo.isNeedDiscountLayout && this.categoryId == goodsDetailInfo.categoryId && Intrinsics.areEqual(this.extendList, goodsDetailInfo.extendList) && this.isNeedExtendLayout == goodsDetailInfo.isNeedExtendLayout && this.goodsTopCategoryId == goodsDetailInfo.goodsTopCategoryId && Intrinsics.areEqual(this.heytapInfo, goodsDetailInfo.heytapInfo) && this.isNeedHeyTapLayout == goodsDetailInfo.isNeedHeyTapLayout && Intrinsics.areEqual(this.marketPrice, goodsDetailInfo.marketPrice) && Intrinsics.areEqual(this.nameLabel, goodsDetailInfo.nameLabel) && Intrinsics.areEqual(this.imageLabel, goodsDetailInfo.imageLabel) && Intrinsics.areEqual(this.nameLabelHeight, goodsDetailInfo.nameLabelHeight) && Intrinsics.areEqual(this.nameLabelWidth, goodsDetailInfo.nameLabelWidth) && Intrinsics.areEqual(this.originPrice, goodsDetailInfo.originPrice) && Intrinsics.areEqual(this.price, goodsDetailInfo.price) && Intrinsics.areEqual(this.pricePrefix, goodsDetailInfo.pricePrefix) && Intrinsics.areEqual(this.priceSuffix, goodsDetailInfo.priceSuffix) && this.skuId == goodsDetailInfo.skuId && Intrinsics.areEqual(this.thirdTitle, goodsDetailInfo.thirdTitle) && this.isNotLike == goodsDetailInfo.isNotLike && Intrinsics.areEqual(this.recommendReason, goodsDetailInfo.recommendReason) && Intrinsics.areEqual(this.vipDiscounts, goodsDetailInfo.vipDiscounts) && this.isNeedShowVipLayout == goodsDetailInfo.isNeedShowVipLayout && Intrinsics.areEqual(this.noStockStr, goodsDetailInfo.noStockStr) && Intrinsics.areEqual(this.noStockType, goodsDetailInfo.noStockType) && Intrinsics.areEqual(this.transparent, goodsDetailInfo.transparent) && this.isRecommendation == goodsDetailInfo.isRecommendation && Intrinsics.areEqual(this.logId, goodsDetailInfo.logId) && Intrinsics.areEqual(this.expId, goodsDetailInfo.expId) && Intrinsics.areEqual(this.strategyId, goodsDetailInfo.strategyId) && Intrinsics.areEqual(this.sectionId, goodsDetailInfo.sectionId) && Intrinsics.areEqual(this.sceneId, goodsDetailInfo.sceneId) && Intrinsics.areEqual(this.retrieveId, goodsDetailInfo.retrieveId) && Intrinsics.areEqual(this.weight, goodsDetailInfo.weight);
    }

    @Nullable
    public final List<GoodsActivityInfoJsonBean> getActivityList() {
        return this.activityList;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getExpId() {
        return this.expId;
    }

    @Nullable
    public final List<String> getExtendList() {
        return this.extendList;
    }

    public final int getGoodsTopCategoryId() {
        return this.goodsTopCategoryId;
    }

    @NotNull
    public final String getHeytapInfo() {
        return this.heytapInfo;
    }

    @NotNull
    public final String getImageLabel() {
        return this.imageLabel;
    }

    @Nullable
    public final String getLogId() {
        return this.logId;
    }

    @NotNull
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @NotNull
    public final String getNameLabel() {
        return this.nameLabel;
    }

    @NotNull
    public final String getNameLabelHeight() {
        return this.nameLabelHeight;
    }

    @NotNull
    public final String getNameLabelWidth() {
        return this.nameLabelWidth;
    }

    @Nullable
    public final String getNoStockStr() {
        return this.noStockStr;
    }

    @Nullable
    public final Integer getNoStockType() {
        return this.noStockType;
    }

    @NotNull
    public final String getOriginPrice() {
        return this.originPrice;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final String getPricePrefix() {
        return this.pricePrefix;
    }

    @NotNull
    public final String getPriceSuffix() {
        return this.priceSuffix;
    }

    @NotNull
    public final String getRecommendReason() {
        return this.recommendReason;
    }

    @Nullable
    public final String getRetrieveId() {
        return this.retrieveId;
    }

    @Nullable
    public final String getSceneId() {
        return this.sceneId;
    }

    @Nullable
    public final String getSectionId() {
        return this.sectionId;
    }

    public final int getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final String getStrategyId() {
        return this.strategyId;
    }

    @NotNull
    public final String getThirdTitle() {
        return this.thirdTitle;
    }

    @Nullable
    public final String getTransparent() {
        return this.transparent;
    }

    @Nullable
    public final VipDiscounts getVipDiscounts() {
        return this.vipDiscounts;
    }

    @Nullable
    public final String getWeight() {
        return this.weight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        List<GoodsActivityInfoJsonBean> list = this.activityList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.isNeedDiscountLayout;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iHashCode2 = (((iHashCode + r2) * 31) + Integer.hashCode(this.categoryId)) * 31;
        List<String> list2 = this.extendList;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        boolean z2 = this.isNeedExtendLayout;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int iHashCode4 = (((((iHashCode3 + r3) * 31) + Integer.hashCode(this.goodsTopCategoryId)) * 31) + this.heytapInfo.hashCode()) * 31;
        boolean z3 = this.isNeedHeyTapLayout;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        int iHashCode5 = (((((((((((((((((((((((((((iHashCode4 + r4) * 31) + this.marketPrice.hashCode()) * 31) + this.nameLabel.hashCode()) * 31) + this.imageLabel.hashCode()) * 31) + this.nameLabelHeight.hashCode()) * 31) + this.nameLabelWidth.hashCode()) * 31) + this.originPrice.hashCode()) * 31) + this.price.hashCode()) * 31) + this.pricePrefix.hashCode()) * 31) + this.priceSuffix.hashCode()) * 31) + Integer.hashCode(this.skuId)) * 31) + this.thirdTitle.hashCode()) * 31) + Integer.hashCode(this.isNotLike)) * 31) + this.recommendReason.hashCode()) * 31;
        VipDiscounts vipDiscounts = this.vipDiscounts;
        int iHashCode6 = (iHashCode5 + (vipDiscounts == null ? 0 : vipDiscounts.hashCode())) * 31;
        boolean z4 = this.isNeedShowVipLayout;
        ?? r5 = z4;
        if (z4) {
            r5 = 1;
        }
        int i = (iHashCode6 + r5) * 31;
        String str = this.noStockStr;
        int iHashCode7 = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.noStockType;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.transparent;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z5 = this.isRecommendation;
        int i2 = (iHashCode9 + (z5 ? 1 : z5)) * 31;
        String str3 = this.logId;
        int iHashCode10 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expId;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.strategyId;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sectionId;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sceneId;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.retrieveId;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.weight;
        return iHashCode15 + (str9 != null ? str9.hashCode() : 0);
    }

    public final boolean isNeedDiscountLayout() {
        return this.isNeedDiscountLayout;
    }

    public final boolean isNeedExtendLayout() {
        return this.isNeedExtendLayout;
    }

    public final boolean isNeedHeyTapLayout() {
        return this.isNeedHeyTapLayout;
    }

    public final boolean isNeedShowVipLayout() {
        return this.isNeedShowVipLayout;
    }

    public final int isNotLike() {
        return this.isNotLike;
    }

    public final boolean isRecommendation() {
        return this.isRecommendation;
    }

    public final void setActivityList(@Nullable List<GoodsActivityInfoJsonBean> list) {
        this.activityList = list;
    }

    public final void setCategoryId(int i) {
        this.categoryId = i;
    }

    public final void setExpId(@Nullable String str) {
        this.expId = str;
    }

    public final void setExtendList(@Nullable List<String> list) {
        this.extendList = list;
    }

    public final void setGoodsTopCategoryId(int i) {
        this.goodsTopCategoryId = i;
    }

    public final void setHeytapInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.heytapInfo = str;
    }

    public final void setLogId(@Nullable String str) {
        this.logId = str;
    }

    public final void setMarketPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.marketPrice = str;
    }

    public final void setNameLabel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameLabel = str;
    }

    public final void setNameLabelHeight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameLabelHeight = str;
    }

    public final void setNameLabelWidth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameLabelWidth = str;
    }

    public final void setNeedDiscountLayout(boolean z) {
        this.isNeedDiscountLayout = z;
    }

    public final void setNeedExtendLayout(boolean z) {
        this.isNeedExtendLayout = z;
    }

    public final void setNeedHeyTapLayout(boolean z) {
        this.isNeedHeyTapLayout = z;
    }

    public final void setNeedShowVipLayout(boolean z) {
        this.isNeedShowVipLayout = z;
    }

    public final void setNoStockStr(@Nullable String str) {
        this.noStockStr = str;
    }

    public final void setNoStockType(@Nullable Integer num) {
        this.noStockType = num;
    }

    public final void setNotLike(int i) {
        this.isNotLike = i;
    }

    public final void setOriginPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.originPrice = str;
    }

    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.price = str;
    }

    public final void setPricePrefix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pricePrefix = str;
    }

    public final void setPriceSuffix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.priceSuffix = str;
    }

    public final void setRecommendReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.recommendReason = str;
    }

    public final void setRecommendation(boolean z) {
        this.isRecommendation = z;
    }

    public final void setRetrieveId(@Nullable String str) {
        this.retrieveId = str;
    }

    public final void setSceneId(@Nullable String str) {
        this.sceneId = str;
    }

    public final void setSectionId(@Nullable String str) {
        this.sectionId = str;
    }

    public final void setSkuId(int i) {
        this.skuId = i;
    }

    public final void setStrategyId(@Nullable String str) {
        this.strategyId = str;
    }

    public final void setThirdTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdTitle = str;
    }

    public final void setTransparent(@Nullable String str) {
        this.transparent = str;
    }

    public final void setVipDiscounts(@Nullable VipDiscounts vipDiscounts) {
        this.vipDiscounts = vipDiscounts;
    }

    public final void setWeight(@Nullable String str) {
        this.weight = str;
    }

    @NotNull
    public String toString() {
        return "GoodsDetailInfo(activityList=" + this.activityList + ", isNeedDiscountLayout=" + this.isNeedDiscountLayout + ", categoryId=" + this.categoryId + ", extendList=" + this.extendList + ", isNeedExtendLayout=" + this.isNeedExtendLayout + ", goodsTopCategoryId=" + this.goodsTopCategoryId + ", heytapInfo=" + this.heytapInfo + ", isNeedHeyTapLayout=" + this.isNeedHeyTapLayout + ", marketPrice=" + this.marketPrice + ", nameLabel=" + this.nameLabel + ", imageLabel=" + this.imageLabel + ", nameLabelHeight=" + this.nameLabelHeight + ", nameLabelWidth=" + this.nameLabelWidth + ", originPrice=" + this.originPrice + ", price=" + this.price + ", pricePrefix=" + this.pricePrefix + ", priceSuffix=" + this.priceSuffix + ", skuId=" + this.skuId + ", thirdTitle=" + this.thirdTitle + ", isNotLike=" + this.isNotLike + ", recommendReason=" + this.recommendReason + ", vipDiscounts=" + this.vipDiscounts + ", isNeedShowVipLayout=" + this.isNeedShowVipLayout + ", noStockStr=" + ((Object) this.noStockStr) + ", noStockType=" + this.noStockType + ", transparent=" + ((Object) this.transparent) + ", isRecommendation=" + this.isRecommendation + ", logId=" + ((Object) this.logId) + ", expId=" + ((Object) this.expId) + ", strategyId=" + ((Object) this.strategyId) + ", sectionId=" + ((Object) this.sectionId) + ", sceneId=" + ((Object) this.sceneId) + ", retrieveId=" + ((Object) this.retrieveId) + ", weight=" + ((Object) this.weight) + ')';
    }

    public GoodsDetailInfo(@Nullable List<GoodsActivityInfoJsonBean> list, boolean z, int i, @Nullable List<String> list2, boolean z2, int i2, @NotNull String heytapInfo, boolean z3, @NotNull String marketPrice, @NotNull String nameLabel, @NotNull String imageLabel, @NotNull String nameLabelHeight, @NotNull String nameLabelWidth, @NotNull String originPrice, @NotNull String price, @NotNull String pricePrefix, @NotNull String priceSuffix, int i3, @NotNull String thirdTitle, int i4, @NotNull String recommendReason, @Nullable VipDiscounts vipDiscounts, boolean z4, @Nullable String str, @Nullable Integer num, @Nullable String str2, boolean z5, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        Intrinsics.checkNotNullParameter(heytapInfo, "heytapInfo");
        Intrinsics.checkNotNullParameter(marketPrice, "marketPrice");
        Intrinsics.checkNotNullParameter(nameLabel, "nameLabel");
        Intrinsics.checkNotNullParameter(imageLabel, "imageLabel");
        Intrinsics.checkNotNullParameter(nameLabelHeight, "nameLabelHeight");
        Intrinsics.checkNotNullParameter(nameLabelWidth, "nameLabelWidth");
        Intrinsics.checkNotNullParameter(originPrice, "originPrice");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(pricePrefix, "pricePrefix");
        Intrinsics.checkNotNullParameter(priceSuffix, "priceSuffix");
        Intrinsics.checkNotNullParameter(thirdTitle, "thirdTitle");
        Intrinsics.checkNotNullParameter(recommendReason, "recommendReason");
        this.activityList = list;
        this.isNeedDiscountLayout = z;
        this.categoryId = i;
        this.extendList = list2;
        this.isNeedExtendLayout = z2;
        this.goodsTopCategoryId = i2;
        this.heytapInfo = heytapInfo;
        this.isNeedHeyTapLayout = z3;
        this.marketPrice = marketPrice;
        this.nameLabel = nameLabel;
        this.imageLabel = imageLabel;
        this.nameLabelHeight = nameLabelHeight;
        this.nameLabelWidth = nameLabelWidth;
        this.originPrice = originPrice;
        this.price = price;
        this.pricePrefix = pricePrefix;
        this.priceSuffix = priceSuffix;
        this.skuId = i3;
        this.thirdTitle = thirdTitle;
        this.isNotLike = i4;
        this.recommendReason = recommendReason;
        this.vipDiscounts = vipDiscounts;
        this.isNeedShowVipLayout = z4;
        this.noStockStr = str;
        this.noStockType = num;
        this.transparent = str2;
        this.isRecommendation = z5;
        this.logId = str3;
        this.expId = str4;
        this.strategyId = str5;
        this.sectionId = str6;
        this.sceneId = str7;
        this.retrieveId = str8;
        this.weight = str9;
    }

    public /* synthetic */ GoodsDetailInfo(List list, boolean z, int i, List list2, boolean z2, int i2, String str, boolean z3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, String str11, int i4, String str12, VipDiscounts vipDiscounts, boolean z4, String str13, Integer num, String str14, boolean z5, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : list, (i5 & 2) != 0 ? false : z, (i5 & 4) != 0 ? -1 : i, (i5 & 8) != 0 ? null : list2, (i5 & 16) != 0 ? false : z2, (i5 & 32) != 0 ? -1 : i2, (i5 & 64) != 0 ? "" : str, (i5 & 128) != 0 ? false : z3, (i5 & 256) != 0 ? "" : str2, (i5 & 512) != 0 ? "" : str3, (i5 & 1024) != 0 ? "" : str4, (i5 & 2048) != 0 ? "" : str5, (i5 & 4096) != 0 ? "" : str6, (i5 & 8192) != 0 ? "" : str7, (i5 & 16384) != 0 ? "" : str8, (i5 & 32768) != 0 ? "" : str9, (i5 & 65536) != 0 ? "" : str10, (i5 & 131072) != 0 ? -1 : i3, (i5 & 262144) != 0 ? "" : str11, (i5 & 524288) != 0 ? 0 : i4, (i5 & 1048576) != 0 ? "" : str12, (i5 & 2097152) != 0 ? null : vipDiscounts, (i5 & 4194304) != 0 ? false : z4, (i5 & 8388608) != 0 ? "" : str13, (i5 & 16777216) != 0 ? null : num, (i5 & 33554432) != 0 ? "" : str14, (i5 & 67108864) != 0 ? false : z5, (i5 & 134217728) != 0 ? "" : str15, (i5 & 268435456) != 0 ? "" : str16, (i5 & 536870912) != 0 ? "" : str17, (i5 & 1073741824) != 0 ? "" : str18, (i5 & Integer.MIN_VALUE) != 0 ? "" : str19, (i6 & 1) != 0 ? "" : str20, (i6 & 2) != 0 ? "" : str21);
    }
}
