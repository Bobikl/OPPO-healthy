package com.heytap.store.product_support.api;

import com.heytap.store.product_support.data.LikePriseDataBean;
import com.heytap.store.product_support.data.RecommendVoBean;
import com.heytap.store.product_support.data.protobuf.Products;
import com.oplus.aiunit.vision.dx7;
import com.oplus.aiunit.vision.euf;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.g5f;
import com.oplus.aiunit.vision.ia7;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.m1e;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001Jl\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'Jñ\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b2\u0014\b\u0001\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001dH'J2\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000b2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002H'¨\u0006%À\u0006\u0003"}, d2 = {"Lcom/heytap/store/product_support/api/ProductRecommendApi;", "", "", "skuId", "moduleCode", "moduleName", "clientIp", "ssoid", "sectionId", "currentPage", "pageSize", "Lcom/oplus/aiunit/vision/kbd;", "Lcom/heytap/store/product_support/data/protobuf/Products;", "getNewRecommendProductsData", "position", "isRecommend", "contentSectionId", "infoFlowId", "", "sourceType", "labelSwitch", "triggerType", "goodsNameType", "goodsPicType", "goodsPrefix", "goodsLabelSwitch", "Lcom/heytap/store/product_support/data/RecommendVoBean;", "getRecommendProductsData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/oplus/aiunit/vision/kbd;", "", "map", "Lcom/heytap/store/product_support/data/LikePriseDataBean;", "praiseProduceContent", "feedbackContent", "tid", "Ljava/lang/Object;", "feedBackRecommendLists", "product-support_release"}, k = 1, mv = {1, 6, 0})
public interface ProductRecommendApi {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ kbd getRecommendProductsData$default(ProductRecommendApi productRecommendApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, String str14, Integer num2, Integer num3, String str15, String str16, int i, Object obj) {
        if (obj == null) {
            return productRecommendApi.getRecommendProductsData(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? null : num, str9, str10, str11, str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (32768 & i) != 0 ? null : num2, (65536 & i) != 0 ? null : num3, (131072 & i) != 0 ? null : str15, (i & 262144) != 0 ? null : str16);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecommendProductsData");
    }

    @euf("json")
    @g18("goods-list/web/recommend/andes/feedback")
    @NotNull
    kbd<Object> feedBackRecommendLists(@g5f("feedbackContent") @Nullable String feedbackContent, @g5f("skuId") @Nullable String skuId, @g5f("tid") @Nullable String tid);

    @euf(euf.PROTO)
    @g18("/goods/v1/recommend/andes/product")
    @NotNull
    kbd<Products> getNewRecommendProductsData(@g5f("skuId") @Nullable String skuId, @g5f("moduleCode") @Nullable String moduleCode, @g5f("moduleName") @Nullable String moduleName, @g5f("clientIp") @Nullable String clientIp, @g5f("ssoid") @Nullable String ssoid, @g5f("sectionId") @Nullable String sectionId, @g5f("currentPage") @Nullable String currentPage, @g5f("pageSize") @NotNull String pageSize);

    @euf("json")
    @g18("goods-list/v2/recommend/product")
    @NotNull
    kbd<RecommendVoBean> getRecommendProductsData(@g5f("position") @Nullable String position, @g5f("sectionId") @Nullable String sectionId, @g5f("isRecommend") @Nullable String isRecommend, @g5f("contentSectionId") @Nullable String contentSectionId, @g5f("infoFlowId") @Nullable String infoFlowId, @g5f("currentPage") @Nullable String currentPage, @g5f("pageSize") @Nullable String pageSize, @g5f("skuId") @Nullable String skuId, @g5f("type") @Nullable Integer sourceType, @g5f("moduleCode") @NotNull String moduleCode, @g5f("moduleName") @NotNull String moduleName, @g5f("ssoid") @NotNull String ssoid, @g5f("clientIp") @NotNull String clientIp, @g5f("labelSwitch") @Nullable String labelSwitch, @g5f("triggerType") @Nullable String triggerType, @g5f("goodsNameType") @Nullable Integer goodsNameType, @g5f("goodsPicType") @Nullable Integer goodsPicType, @g5f("goodsPrefix") @Nullable String goodsPrefix, @g5f("goodsLabelSwitch") @Nullable String goodsLabelSwitch);

    @euf("json")
    @m1e("cn/oapi/omp-web/web/content/praise")
    @NotNull
    @dx7
    kbd<LikePriseDataBean> praiseProduceContent(@ia7 @NotNull Map<String, String> map);
}
