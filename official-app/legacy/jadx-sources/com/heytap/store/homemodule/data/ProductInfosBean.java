package com.heytap.store.homemodule.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.store.base.core.util.NullObjectUtil;
import com.heytap.store.homemodule.data.livehomepb.LiveInfoVT;
import com.heytap.store.homemodule.data.livehomepb.LiveRoomFormVT;
import com.heytap.store.homemodule.data.protobuf.GoodsActivityInfo;
import com.heytap.store.homemodule.data.protobuf.SpuCreditsDetails;
import com.heytap.store.homemodule.data.ranking.CardRankingInfo;
import com.heytap.store.homemodule.data.seckill.Seckill;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ProductInfosBean implements Cloneable {
    private List<GoodsActivityInfo> activityList;
    private String backColor;
    private int cardInfoType;
    private CardRankingInfo cardRankingInfo;
    private Integer cardType;
    private Integer configKeyLattice;
    private String expId;
    private List<String> extendList;
    private String heytapInfos;
    private int homeCubePosition;
    private Long id;
    private String imageLabel;
    private boolean isDelete;
    private boolean isLogin;
    private Integer isNotLike;
    private String jsonUrl;
    private List<ProductLabelsBean> labels;
    private Long latticeIndex;
    private String link;
    private LiveInfoVT liveInfoVT;
    private LiveRoomFormVT liveRoomFormVT;
    private String liveUrl;
    private String logId;
    private List<SpuCreditsDetails> mCreditsDetailsList;
    private NewProductBean mNewProductBean;
    private String marketPrice;
    private String nameLabel;
    private Integer nameLabelHeight;
    private Integer nameLabelWidth;
    private boolean needDiscountLayout;
    private boolean needExtendLayout;
    private boolean needHeyTapLayout;
    private Double originalPrice;
    private String originalPriceStr;
    private Double price;
    private String pricePrefix;
    private String priceStr;
    private String priceSuffix;
    private List<ProductInfosBean> productInfosBean;
    private String retrieveId;
    private String sceneId;
    public String searchId;
    private Seckill secKill;
    private String secondTitle;
    private Integer seq;
    private Long skuId;
    private String strategyId;
    private String thirdTitle;
    private String title;
    public String transparent;
    private Integer type;
    private String url;
    private String video;
    private int weight;

    public ProductInfosBean() {
        this.isLogin = false;
        this.needDiscountLayout = true;
        this.needHeyTapLayout = false;
        this.needExtendLayout = false;
        this.cardInfoType = 0;
    }

    public List<GoodsActivityInfo> getActivityList() {
        return this.activityList;
    }

    public String getActivityListToStringForSensors() {
        if (NullObjectUtil.isNullOrEmpty(this.activityList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (GoodsActivityInfo goodsActivityInfo : this.activityList) {
            if (!TextUtils.isEmpty(goodsActivityInfo.activityInfo)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(goodsActivityInfo.activityInfo);
            }
        }
        return sb.toString();
    }

    public String getBackColor() {
        return this.backColor;
    }

    public int getCardInfoType() {
        return this.cardInfoType;
    }

    public CardRankingInfo getCardRankingInfo() {
        return this.cardRankingInfo;
    }

    public Integer getCardType() {
        return this.cardType;
    }

    public Integer getConfigKeyLattice() {
        return this.configKeyLattice;
    }

    public List<SpuCreditsDetails> getCreditsDetailsList() {
        return this.mCreditsDetailsList;
    }

    public String getExpId() {
        return this.expId;
    }

    public List<String> getExtendList() {
        return this.extendList;
    }

    public String getHeytapInfos() {
        return this.heytapInfos;
    }

    public int getHomeCubePosition() {
        return this.homeCubePosition;
    }

    public Long getId() {
        return this.id;
    }

    public String getImageLabel() {
        return this.imageLabel;
    }

    public boolean getIsLogin() {
        return this.isLogin;
    }

    public Integer getIsNotLike() {
        return this.isNotLike;
    }

    public String getJsonUrl() {
        return this.jsonUrl;
    }

    public List<ProductLabelsBean> getLabels() {
        return this.labels;
    }

    public Long getLatticeIndex() {
        return this.latticeIndex;
    }

    public String getLink() {
        return this.link;
    }

    public LiveInfoVT getLiveInfoVT() {
        return this.liveInfoVT;
    }

    public LiveRoomFormVT getLiveRoomFormVT() {
        return this.liveRoomFormVT;
    }

    public String getLiveUrl() {
        return this.liveUrl;
    }

    public String getLogId() {
        return this.logId;
    }

    public String getMarketPrice() {
        return this.marketPrice;
    }

    public String getNameLabel() {
        return this.nameLabel;
    }

    public int getNameLabelHeight() {
        Integer num = this.nameLabelHeight;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int getNameLabelWidth() {
        Integer num = this.nameLabelWidth;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public NewProductBean getNewProductBean() {
        return this.mNewProductBean;
    }

    public Double getOriginalPrice() {
        return this.originalPrice;
    }

    public String getOriginalPriceStr() {
        return this.originalPriceStr;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getPricePrefix() {
        return this.pricePrefix;
    }

    public String getPriceStr() {
        if (TextUtils.isEmpty(this.priceStr)) {
            this.priceStr = "";
        }
        return this.priceStr;
    }

    public String getPriceSuffix() {
        return this.priceSuffix;
    }

    public List<ProductInfosBean> getProductInfosBean() {
        return this.productInfosBean;
    }

    public String getRetrieveId() {
        return this.retrieveId;
    }

    public String getSceneId() {
        return this.sceneId;
    }

    public Seckill getSecKill() {
        return this.secKill;
    }

    public String getSecondTitle() {
        return this.secondTitle;
    }

    public Integer getSeq() {
        return this.seq;
    }

    public Long getSkuId() {
        Long l2 = this.skuId;
        if (l2 != null) {
            return l2;
        }
        return 0L;
    }

    public String getStrategyId() {
        return this.strategyId;
    }

    public String getThirdTitle() {
        return this.thirdTitle;
    }

    public String getTitle() {
        String str = this.title;
        return str != null ? str : "";
    }

    public Integer getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getVideo() {
        return this.video;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean isDelete() {
        return this.isDelete;
    }

    public boolean isNeedDiscountLayout() {
        return this.needDiscountLayout;
    }

    public boolean isNeedExtendLayout() {
        return this.needExtendLayout;
    }

    public boolean isNeedHeyTapLayout() {
        return this.needHeyTapLayout;
    }

    public void setActivityList(List<GoodsActivityInfo> list) {
        this.activityList = list;
    }

    public void setBackColor(String str) {
        this.backColor = str;
    }

    public void setCardInfoType(int i) {
        this.cardInfoType = i;
    }

    public void setCardRankingInfo(CardRankingInfo cardRankingInfo) {
        this.cardRankingInfo = cardRankingInfo;
    }

    public void setCardType(Integer num) {
        this.cardType = num;
    }

    public void setConfigKeyLattice(Integer num) {
        this.configKeyLattice = num;
    }

    public void setCreditsDetailsList(List<SpuCreditsDetails> list) {
        this.mCreditsDetailsList = list;
    }

    public void setDelete(boolean z) {
        this.isDelete = z;
    }

    public void setExpId(String str) {
        this.expId = str;
    }

    public void setExtendList(List<String> list) {
        this.extendList = list;
    }

    public void setHeytapInfos(String str) {
        this.heytapInfos = str;
    }

    public void setHomeCubePosition(int i) {
        this.homeCubePosition = i;
    }

    public void setId(Long l2) {
        this.id = l2;
    }

    public void setImageLabel(String str) {
        this.imageLabel = str;
    }

    public void setIsLogin(boolean z) {
        this.isLogin = z;
    }

    public void setIsNotLike(Integer num) {
        this.isNotLike = num;
    }

    public void setJsonUrl(String str) {
        this.jsonUrl = str;
    }

    public void setLabels(List<ProductLabelsBean> list) {
        this.labels = list;
    }

    public void setLatticeIndex(Long l2) {
        this.latticeIndex = l2;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setLiveInfoVT(LiveInfoVT liveInfoVT) {
        this.liveInfoVT = liveInfoVT;
    }

    public void setLiveRoomFormVT(LiveRoomFormVT liveRoomFormVT) {
        this.liveRoomFormVT = liveRoomFormVT;
    }

    public void setLiveUrl(String str) {
        this.liveUrl = str;
    }

    public void setLogId(String str) {
        this.logId = str;
    }

    public void setMarketPrice(String str) {
        this.marketPrice = str;
    }

    public void setNameLabel(String str) {
        this.nameLabel = str;
    }

    public void setNameLabelHeight(Integer num) {
        this.nameLabelHeight = num;
    }

    public void setNameLabelWidth(Integer num) {
        this.nameLabelWidth = num;
    }

    public void setNeedDiscountLayout(boolean z) {
        this.needDiscountLayout = z;
    }

    public void setNeedExtendLayout(boolean z) {
        this.needExtendLayout = z;
    }

    public void setNeedHeyTapLayout(boolean z) {
        this.needHeyTapLayout = z;
    }

    public void setNewProductBean(NewProductBean newProductBean) {
        this.mNewProductBean = newProductBean;
    }

    public void setOriginalPrice(Double d) {
        this.originalPrice = d;
    }

    public void setOriginalPriceStr(String str) {
        this.originalPriceStr = str;
    }

    public void setPrice(Double d) {
        this.price = d;
    }

    public void setPricePrefix(String str) {
        this.pricePrefix = str;
    }

    public void setPriceStr(String str) {
        this.priceStr = str;
    }

    public void setPriceSuffix(String str) {
        this.priceSuffix = str;
    }

    public void setProductInfosBean(List<ProductInfosBean> list) {
        this.productInfosBean = list;
    }

    public void setRetrieveId(String str) {
        this.retrieveId = str;
    }

    public void setSceneId(String str) {
        this.sceneId = str;
    }

    public void setSecKill(Seckill seckill) {
        this.secKill = seckill;
    }

    public void setSecondTitle(String str) {
        this.secondTitle = str;
    }

    public void setSeq(Integer num) {
        this.seq = num;
    }

    public void setSkuId(Long l2) {
        this.skuId = l2;
    }

    public void setStrategyId(String str) {
        this.strategyId = str;
    }

    public void setThirdTitle(String str) {
        this.thirdTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVideo(String str) {
        this.video = str;
    }

    public void setWeight(int i) {
        this.weight = i;
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ProductInfosBean m4951clone() {
        ProductInfosBean productInfosBean = new ProductInfosBean(getId(), getTitle(), getSecondTitle(), getThirdTitle(), getPrice(), getOriginalPrice(), getUrl(), getLink(), getSeq(), this.labels, getType(), getLatticeIndex(), getConfigKeyLattice(), this.isLogin, this.marketPrice, null, this.heytapInfos, this.priceStr, this.originalPriceStr, this.pricePrefix, this.priceSuffix, this.needDiscountLayout, this.needHeyTapLayout, this.needExtendLayout, this.jsonUrl, this.weight, this.sceneId, this.logId, this.expId, this.strategyId, this.retrieveId, this.backColor);
        productInfosBean.setSecKill(this.secKill);
        productInfosBean.setLiveUrl(this.liveUrl);
        productInfosBean.setNewProductBean(this.mNewProductBean);
        productInfosBean.setCardInfoType(this.cardInfoType);
        productInfosBean.setLiveInfoVT(this.liveInfoVT);
        productInfosBean.setHomeCubePosition(this.homeCubePosition);
        productInfosBean.setSkuId(this.skuId);
        productInfosBean.setCardRankingInfo(this.cardRankingInfo);
        return productInfosBean;
    }

    public ProductInfosBean(Long l2, String str, String str2, String str3, Double d, Double d2, String str4, String str5, Integer num, List<ProductLabelsBean> list, Integer num2, Long l3, Integer num3, boolean z, String str6, List<ProductInfosBean> list2, String str7, String str8, String str9, String str10, String str11, boolean z2, boolean z3, boolean z4, String str12, int i, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.cardInfoType = 0;
        this.id = l2;
        this.title = str;
        this.secondTitle = str2;
        this.thirdTitle = str3;
        this.price = d;
        this.originalPrice = d2;
        this.url = str4;
        this.link = str5;
        this.seq = num;
        this.labels = list;
        this.type = num2;
        this.latticeIndex = l3;
        this.configKeyLattice = num3;
        this.isLogin = z;
        this.marketPrice = str6;
        this.productInfosBean = list2;
        this.heytapInfos = str7;
        this.priceStr = str8;
        this.originalPriceStr = str9;
        this.pricePrefix = str10;
        this.priceSuffix = str11;
        this.needDiscountLayout = z2;
        this.needHeyTapLayout = z3;
        this.needExtendLayout = z4;
        this.jsonUrl = str12;
        this.weight = i;
        this.sceneId = str13;
        this.logId = str14;
        this.expId = str15;
        this.strategyId = str16;
        this.retrieveId = str17;
        this.backColor = str18;
    }
}
