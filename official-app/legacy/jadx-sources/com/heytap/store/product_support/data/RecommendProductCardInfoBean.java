package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import com.heytap.store.business.component.entity.BannerEntity;
import com.oplus.aiunit.vision.l7c;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b¢\u0001\u0010£\u0001R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\"\u0010!\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\"\u0010$\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\"\u0010'\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R\"\u0010*\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0012\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\"\u0010-\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0016R\"\u00100\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016R*\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0012\u001a\u0004\b<\u0010\u0014\"\u0004\b=\u0010\u0016R*\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00106\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R\"\u0010A\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0012\u001a\u0004\bB\u0010\u0014\"\u0004\bC\u0010\u0016R\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0012\u001a\u0004\bL\u0010\u0014\"\u0004\bM\u0010\u0016R\"\u0010N\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010F\u001a\u0004\bN\u0010H\"\u0004\bO\u0010JR$\u0010P\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u0012\u001a\u0004\bQ\u0010\u0014\"\u0004\bR\u0010\u0016R$\u0010S\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010\u0012\u001a\u0004\bT\u0010\u0014\"\u0004\bU\u0010\u0016R$\u0010V\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010\u0012\u001a\u0004\bW\u0010\u0014\"\u0004\bX\u0010\u0016R\"\u0010Y\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010\u0019\u001a\u0004\bZ\u0010\u001b\"\u0004\b[\u0010\u001dR$\u0010\\\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010\u0012\u001a\u0004\b]\u0010\u0014\"\u0004\b^\u0010\u0016R$\u0010_\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010\u0012\u001a\u0004\b`\u0010\u0014\"\u0004\ba\u0010\u0016R$\u0010b\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010\u0012\u001a\u0004\bc\u0010\u0014\"\u0004\bd\u0010\u0016R$\u0010e\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010\u0012\u001a\u0004\bf\u0010\u0014\"\u0004\bg\u0010\u0016R$\u0010h\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010\u0012\u001a\u0004\bi\u0010\u0014\"\u0004\bj\u0010\u0016R\"\u0010k\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010F\u001a\u0004\bk\u0010H\"\u0004\bl\u0010JR\"\u0010m\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010\u0019\u001a\u0004\bn\u0010\u001b\"\u0004\bo\u0010\u001dR$\u0010q\u001a\u0004\u0018\u00010p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010x\u001a\u0004\u0018\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R)\u0010\u007f\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R/\u0010\u0086\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u00106\u001a\u0005\b\u0087\u0001\u00108\"\u0005\b\u0088\u0001\u0010:R&\u0010\u0089\u0001\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010\u0019\u001a\u0005\b\u008a\u0001\u0010\u001b\"\u0005\b\u008b\u0001\u0010\u001dR,\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R&\u0010\u0093\u0001\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010F\u001a\u0005\b\u0093\u0001\u0010H\"\u0005\b\u0094\u0001\u0010JR+\u0010\u0095\u0001\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009d\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u009b\u0001038F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u00108R&\u0010\u009f\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u009b\u0001038F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u00108R\u0016\u0010¡\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010\u001b¨\u0006¤\u0001"}, d2 = {"Lcom/heytap/store/product_support/data/RecommendProductCardInfoBean;", "", "Lcom/oplus/aiunit/vision/l7c;", "", "id", "J", "getId", "()J", "setId", "(J)V", "skuId", "getSkuId", "setSkuId", "spuId", "getSpuId", "setSpuId", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "", "titleMaxLine", "I", "getTitleMaxLine", "()I", "setTitleMaxLine", "(I)V", "picUrl", "getPicUrl", "setPicUrl", "link", "getLink", "setLink", "leftPrice", "getLeftPrice", "setLeftPrice", "rightPrice", "getRightPrice", "setRightPrice", "prefix", "getPrefix", "setPrefix", "suffix", "getSuffix", "setSuffix", "heytapInfo", "getHeytapInfo", "setHeytapInfo", "", "Lcom/heytap/store/product_support/data/ProductCardActivity;", "activityList", "Ljava/util/List;", "getActivityList", "()Ljava/util/List;", "setActivityList", "(Ljava/util/List;)V", "nameLabel", "getNameLabel", "setNameLabel", "namePrefixLabel", "getNamePrefixLabel", "setNamePrefixLabel", "labels", "getLabels", "setLabels", "", "needLogin", "Z", "getNeedLogin", "()Z", "setNeedLogin", "(Z)V", "secondTitle", "getSecondTitle", "setSecondTitle", "isShowSecondTitle", "setShowSecondTitle", "transparent", "getTransparent", "setTransparent", "contentTransparent", "getContentTransparent", "setContentTransparent", "searchId", "getSearchId", "setSearchId", "weight", "getWeight", "setWeight", "sceneId", "getSceneId", "setSceneId", "logId", "getLogId", "setLogId", "expId", "getExpId", "setExpId", "strategyId", "getStrategyId", "setStrategyId", "retrieveId", "getRetrieveId", "setRetrieveId", "isRecommendation", "setRecommendation", "recommendType", "getRecommendType", "setRecommendType", "Lcom/heytap/store/product_support/data/VipDiscountsVo;", "vipDiscounts", "Lcom/heytap/store/product_support/data/VipDiscountsVo;", "getVipDiscounts", "()Lcom/heytap/store/product_support/data/VipDiscountsVo;", "setVipDiscounts", "(Lcom/heytap/store/product_support/data/VipDiscountsVo;)V", "Lcom/heytap/store/product_support/data/InformationFlowThreadVOBean;", "informationFlowThreadVO", "Lcom/heytap/store/product_support/data/InformationFlowThreadVOBean;", "getInformationFlowThreadVO", "()Lcom/heytap/store/product_support/data/InformationFlowThreadVOBean;", "setInformationFlowThreadVO", "(Lcom/heytap/store/product_support/data/InformationFlowThreadVOBean;)V", "Lcom/heytap/store/product_support/data/LiveInfoVoBean;", "liveInfoVO", "Lcom/heytap/store/product_support/data/LiveInfoVoBean;", "getLiveInfoVO", "()Lcom/heytap/store/product_support/data/LiveInfoVoBean;", "setLiveInfoVO", "(Lcom/heytap/store/product_support/data/LiveInfoVoBean;)V", "Lcom/heytap/store/product_support/data/BannerInfoVO;", "bannerInfoVO", "getBannerInfoVO", "setBannerInfoVO", "bannerInfoVOPos", "getBannerInfoVOPos", "setBannerInfoVOPos", "Lcom/heytap/store/business/component/entity/BannerEntity;", "bannerEntity", "Lcom/heytap/store/business/component/entity/BannerEntity;", "getBannerEntity", "()Lcom/heytap/store/business/component/entity/BannerEntity;", "setBannerEntity", "(Lcom/heytap/store/business/component/entity/BannerEntity;)V", "isProductDetail", "setProductDetail", "placeholderLabel", "Lcom/heytap/store/product_support/data/ProductCardActivity;", "getPlaceholderLabel", "()Lcom/heytap/store/product_support/data/ProductCardActivity;", "setPlaceholderLabel", "(Lcom/heytap/store/product_support/data/ProductCardActivity;)V", "Lkotlin/Pair;", "getDiscountLabels", "discountLabels", "getDiscountLabels2", "discountLabels2", "getItemType", "itemType", "<init>", "()V", "product-support_release"}, k = 1, mv = {1, 6, 0})
public final class RecommendProductCardInfoBean implements Cloneable, l7c {

    @Nullable
    private List<ProductCardActivity> activityList;

    @Nullable
    private BannerEntity bannerEntity;

    @Nullable
    private List<BannerInfoVO> bannerInfoVO;

    @Nullable
    private String contentTransparent;

    @Nullable
    private String expId;

    @Nullable
    private InformationFlowThreadVOBean informationFlowThreadVO;
    private boolean isProductDetail;
    private boolean isRecommendation;

    @Nullable
    private LiveInfoVoBean liveInfoVO;

    @Nullable
    private String logId;

    @Nullable
    private List<String> namePrefixLabel;
    private boolean needLogin;

    @Nullable
    private ProductCardActivity placeholderLabel;

    @Nullable
    private String retrieveId;

    @Nullable
    private String sceneId;

    @Nullable
    private String searchId;
    private long skuId;
    private long spuId;

    @Nullable
    private String strategyId;

    @Nullable
    private String transparent;

    @Nullable
    private VipDiscountsVo vipDiscounts;
    private int weight;
    private long id = -1;

    @NotNull
    private String title = "";
    private int titleMaxLine = 2;

    @NotNull
    private String picUrl = "";

    @NotNull
    private String link = "";

    @NotNull
    private String leftPrice = "";

    @NotNull
    private String rightPrice = "";

    @NotNull
    private String prefix = "";

    @NotNull
    private String suffix = "";

    @NotNull
    private String heytapInfo = "";

    @NotNull
    private String nameLabel = "";

    @NotNull
    private String labels = "";

    @NotNull
    private String secondTitle = "";
    private boolean isShowSecondTitle = true;
    private int recommendType = 1;
    private int bannerInfoVOPos = -1;

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @Nullable
    public final List<ProductCardActivity> getActivityList() {
        return this.activityList;
    }

    @Nullable
    public final BannerEntity getBannerEntity() {
        return this.bannerEntity;
    }

    @Nullable
    public final List<BannerInfoVO> getBannerInfoVO() {
        return this.bannerInfoVO;
    }

    public final int getBannerInfoVOPos() {
        return this.bannerInfoVOPos;
    }

    @Nullable
    public final String getContentTransparent() {
        return this.contentTransparent;
    }

    @NotNull
    public final List<Pair<Integer, String>> getDiscountLabels() {
        ArrayList arrayList = new ArrayList();
        List<ProductCardActivity> activityList = getActivityList();
        if (activityList == null) {
            activityList = CollectionsKt__CollectionsKt.emptyList();
        }
        for (ProductCardActivity productCardActivity : activityList) {
            arrayList.add(new Pair(Integer.valueOf(productCardActivity.getType()), productCardActivity.getActivityInfo()));
        }
        if (getHeytapInfo().length() > 0) {
            arrayList.add(new Pair(6, getHeytapInfo()));
        }
        return arrayList;
    }

    @NotNull
    public final List<Pair<Integer, String>> getDiscountLabels2() {
        ArrayList arrayList = new ArrayList();
        List<ProductCardActivity> activityList = getActivityList();
        if (activityList == null) {
            activityList = CollectionsKt__CollectionsKt.emptyList();
        }
        for (ProductCardActivity productCardActivity : activityList) {
            if (ArraysKt___ArraysKt.contains(new int[]{1, 2, 3, 4, 5}, productCardActivity.getType())) {
                arrayList.add(new Pair(Integer.valueOf(productCardActivity.getType()), productCardActivity.getActivityInfo()));
            }
        }
        return arrayList;
    }

    @Nullable
    public final String getExpId() {
        return this.expId;
    }

    @NotNull
    public final String getHeytapInfo() {
        return this.heytapInfo;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final InformationFlowThreadVOBean getInformationFlowThreadVO() {
        return this.informationFlowThreadVO;
    }

    @Override // com.oplus.aiunit.vision.l7c
    public int getItemType() {
        int i = this.recommendType;
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 1 : 4;
        }
        return 3;
    }

    @NotNull
    public final String getLabels() {
        return this.labels;
    }

    @NotNull
    public final String getLeftPrice() {
        return this.leftPrice;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final LiveInfoVoBean getLiveInfoVO() {
        return this.liveInfoVO;
    }

    @Nullable
    public final String getLogId() {
        return this.logId;
    }

    @NotNull
    public final String getNameLabel() {
        return this.nameLabel;
    }

    @Nullable
    public final List<String> getNamePrefixLabel() {
        return this.namePrefixLabel;
    }

    public final boolean getNeedLogin() {
        return this.needLogin;
    }

    @NotNull
    public final String getPicUrl() {
        return this.picUrl;
    }

    @Nullable
    public final ProductCardActivity getPlaceholderLabel() {
        return this.placeholderLabel;
    }

    @NotNull
    public final String getPrefix() {
        return this.prefix;
    }

    public final int getRecommendType() {
        return this.recommendType;
    }

    @Nullable
    public final String getRetrieveId() {
        return this.retrieveId;
    }

    @NotNull
    public final String getRightPrice() {
        return this.rightPrice;
    }

    @Nullable
    public final String getSceneId() {
        return this.sceneId;
    }

    @Nullable
    public final String getSearchId() {
        return this.searchId;
    }

    @NotNull
    public final String getSecondTitle() {
        return this.secondTitle;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public final long getSpuId() {
        return this.spuId;
    }

    @Nullable
    public final String getStrategyId() {
        return this.strategyId;
    }

    @NotNull
    public final String getSuffix() {
        return this.suffix;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getTitleMaxLine() {
        return this.titleMaxLine;
    }

    @Nullable
    public final String getTransparent() {
        return this.transparent;
    }

    @Nullable
    public final VipDiscountsVo getVipDiscounts() {
        return this.vipDiscounts;
    }

    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: isProductDetail, reason: from getter */
    public final boolean getIsProductDetail() {
        return this.isProductDetail;
    }

    /* JADX INFO: renamed from: isRecommendation, reason: from getter */
    public final boolean getIsRecommendation() {
        return this.isRecommendation;
    }

    /* JADX INFO: renamed from: isShowSecondTitle, reason: from getter */
    public final boolean getIsShowSecondTitle() {
        return this.isShowSecondTitle;
    }

    public final void setActivityList(@Nullable List<ProductCardActivity> list) {
        this.activityList = list;
    }

    public final void setBannerEntity(@Nullable BannerEntity bannerEntity) {
        this.bannerEntity = bannerEntity;
    }

    public final void setBannerInfoVO(@Nullable List<BannerInfoVO> list) {
        this.bannerInfoVO = list;
    }

    public final void setBannerInfoVOPos(int i) {
        this.bannerInfoVOPos = i;
    }

    public final void setContentTransparent(@Nullable String str) {
        this.contentTransparent = str;
    }

    public final void setExpId(@Nullable String str) {
        this.expId = str;
    }

    public final void setHeytapInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.heytapInfo = str;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setInformationFlowThreadVO(@Nullable InformationFlowThreadVOBean informationFlowThreadVOBean) {
        this.informationFlowThreadVO = informationFlowThreadVOBean;
    }

    public final void setLabels(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.labels = str;
    }

    public final void setLeftPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.leftPrice = str;
    }

    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.link = str;
    }

    public final void setLiveInfoVO(@Nullable LiveInfoVoBean liveInfoVoBean) {
        this.liveInfoVO = liveInfoVoBean;
    }

    public final void setLogId(@Nullable String str) {
        this.logId = str;
    }

    public final void setNameLabel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameLabel = str;
    }

    public final void setNamePrefixLabel(@Nullable List<String> list) {
        this.namePrefixLabel = list;
    }

    public final void setNeedLogin(boolean z) {
        this.needLogin = z;
    }

    public final void setPicUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picUrl = str;
    }

    public final void setPlaceholderLabel(@Nullable ProductCardActivity productCardActivity) {
        this.placeholderLabel = productCardActivity;
    }

    public final void setPrefix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.prefix = str;
    }

    public final void setProductDetail(boolean z) {
        this.isProductDetail = z;
    }

    public final void setRecommendType(int i) {
        this.recommendType = i;
    }

    public final void setRecommendation(boolean z) {
        this.isRecommendation = z;
    }

    public final void setRetrieveId(@Nullable String str) {
        this.retrieveId = str;
    }

    public final void setRightPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rightPrice = str;
    }

    public final void setSceneId(@Nullable String str) {
        this.sceneId = str;
    }

    public final void setSearchId(@Nullable String str) {
        this.searchId = str;
    }

    public final void setSecondTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secondTitle = str;
    }

    public final void setShowSecondTitle(boolean z) {
        this.isShowSecondTitle = z;
    }

    public final void setSkuId(long j2) {
        this.skuId = j2;
    }

    public final void setSpuId(long j2) {
        this.spuId = j2;
    }

    public final void setStrategyId(@Nullable String str) {
        this.strategyId = str;
    }

    public final void setSuffix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.suffix = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setTitleMaxLine(int i) {
        this.titleMaxLine = i;
    }

    public final void setTransparent(@Nullable String str) {
        this.transparent = str;
    }

    public final void setVipDiscounts(@Nullable VipDiscountsVo vipDiscountsVo) {
        this.vipDiscounts = vipDiscountsVo;
    }

    public final void setWeight(int i) {
        this.weight = i;
    }
}
