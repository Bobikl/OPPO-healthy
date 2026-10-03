package com.heytap.store.product_support.data;

import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\bE\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bù\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011HÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011HÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\nHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\nHÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\u008a\u0002\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020\n2\b\u0010V\u001a\u0004\u0018\u00010WHÖ\u0003J\t\u0010X\u001a\u00020\bHÖ\u0001J\t\u0010Y\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b&\u0010$R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b(\u0010$R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010*R\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010*\"\u0004\b+\u0010,R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u00103R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b8\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u001a\u0010\u001a\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010<¨\u0006Z"}, d2 = {"Lcom/heytap/store/product_support/data/RecommendTabEntity;", "Ljava/io/Serializable;", "title", "", "secondTitle", "linkCode", "showArea", "cardType", "", "showInterested", "", "skuId", "sourceType", "requestModuleName", "requestModuleCode", "identityDistinct", "labelSwitch", "", "isProductDetail", "contentSectionId", "infoFlowId", "goodsNameType", "goodsPicType", "goodsPrefix", "goodsLabelSwitch", "isShowGoodsSlogan", "titleShowStyleNumber", "sceneReveal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;ZILjava/lang/String;)V", "getCardType", "()I", "getContentSectionId", "()Ljava/lang/String;", "getGoodsLabelSwitch", "()Ljava/util/List;", "getGoodsNameType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGoodsPicType", "getGoodsPrefix", "getIdentityDistinct", "getInfoFlowId", "()Z", "setShowGoodsSlogan", "(Z)V", "getLabelSwitch", "getLinkCode", "getRequestModuleCode", "getRequestModuleName", "getSceneReveal", "setSceneReveal", "(Ljava/lang/String;)V", "getSecondTitle", "getShowArea", "getShowInterested", "getSkuId", "getSourceType", "getTitle", "getTitleShowStyleNumber", "setTitleShowStyleNumber", "(I)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;ZILjava/lang/String;)Lcom/heytap/store/product_support/data/RecommendTabEntity;", "equals", "other", "", "hashCode", "toString", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class RecommendTabEntity implements Serializable {
    private final int cardType;

    @NotNull
    private final String contentSectionId;

    @Nullable
    private final List<Integer> goodsLabelSwitch;

    @Nullable
    private final Integer goodsNameType;

    @Nullable
    private final Integer goodsPicType;

    @Nullable
    private final List<Integer> goodsPrefix;

    @Nullable
    private final Integer identityDistinct;

    @NotNull
    private final String infoFlowId;
    private final boolean isProductDetail;
    private boolean isShowGoodsSlogan;

    @Nullable
    private final List<Integer> labelSwitch;

    @NotNull
    private final String linkCode;

    @NotNull
    private final String requestModuleCode;

    @NotNull
    private final String requestModuleName;

    @NotNull
    private String sceneReveal;

    @NotNull
    private final String secondTitle;

    @NotNull
    private final String showArea;
    private final boolean showInterested;

    @NotNull
    private final String skuId;

    @Nullable
    private final Integer sourceType;

    @NotNull
    private final String title;
    private int titleShowStyleNumber;

    public RecommendTabEntity(@NotNull String title, @NotNull String secondTitle, @NotNull String linkCode, @NotNull String showArea, int i, boolean z, @NotNull String skuId, @Nullable Integer num, @NotNull String requestModuleName, @NotNull String requestModuleCode, @Nullable Integer num2, @Nullable List<Integer> list, boolean z2, @NotNull String contentSectionId, @NotNull String infoFlowId, @Nullable Integer num3, @Nullable Integer num4, @Nullable List<Integer> list2, @Nullable List<Integer> list3, boolean z3, int i2, @NotNull String sceneReveal) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondTitle, "secondTitle");
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        Intrinsics.checkNotNullParameter(showArea, "showArea");
        Intrinsics.checkNotNullParameter(skuId, "skuId");
        Intrinsics.checkNotNullParameter(requestModuleName, "requestModuleName");
        Intrinsics.checkNotNullParameter(requestModuleCode, "requestModuleCode");
        Intrinsics.checkNotNullParameter(contentSectionId, "contentSectionId");
        Intrinsics.checkNotNullParameter(infoFlowId, "infoFlowId");
        Intrinsics.checkNotNullParameter(sceneReveal, "sceneReveal");
        this.title = title;
        this.secondTitle = secondTitle;
        this.linkCode = linkCode;
        this.showArea = showArea;
        this.cardType = i;
        this.showInterested = z;
        this.skuId = skuId;
        this.sourceType = num;
        this.requestModuleName = requestModuleName;
        this.requestModuleCode = requestModuleCode;
        this.identityDistinct = num2;
        this.labelSwitch = list;
        this.isProductDetail = z2;
        this.contentSectionId = contentSectionId;
        this.infoFlowId = infoFlowId;
        this.goodsNameType = num3;
        this.goodsPicType = num4;
        this.goodsPrefix = list2;
        this.goodsLabelSwitch = list3;
        this.isShowGoodsSlogan = z3;
        this.titleShowStyleNumber = i2;
        this.sceneReveal = sceneReveal;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRequestModuleCode() {
        return this.requestModuleCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getIdentityDistinct() {
        return this.identityDistinct;
    }

    @Nullable
    public final List<Integer> component12() {
        return this.labelSwitch;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsProductDetail() {
        return this.isProductDetail;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getContentSectionId() {
        return this.contentSectionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getInfoFlowId() {
        return this.infoFlowId;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getGoodsNameType() {
        return this.goodsNameType;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getGoodsPicType() {
        return this.goodsPicType;
    }

    @Nullable
    public final List<Integer> component18() {
        return this.goodsPrefix;
    }

    @Nullable
    public final List<Integer> component19() {
        return this.goodsLabelSwitch;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecondTitle() {
        return this.secondTitle;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsShowGoodsSlogan() {
        return this.isShowGoodsSlogan;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getTitleShowStyleNumber() {
        return this.titleShowStyleNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getSceneReveal() {
        return this.sceneReveal;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLinkCode() {
        return this.linkCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShowArea() {
        return this.showArea;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShowInterested() {
        return this.showInterested;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getSourceType() {
        return this.sourceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRequestModuleName() {
        return this.requestModuleName;
    }

    @NotNull
    public final RecommendTabEntity copy(@NotNull String title, @NotNull String secondTitle, @NotNull String linkCode, @NotNull String showArea, int cardType, boolean showInterested, @NotNull String skuId, @Nullable Integer sourceType, @NotNull String requestModuleName, @NotNull String requestModuleCode, @Nullable Integer identityDistinct, @Nullable List<Integer> labelSwitch, boolean isProductDetail, @NotNull String contentSectionId, @NotNull String infoFlowId, @Nullable Integer goodsNameType, @Nullable Integer goodsPicType, @Nullable List<Integer> goodsPrefix, @Nullable List<Integer> goodsLabelSwitch, boolean isShowGoodsSlogan, int titleShowStyleNumber, @NotNull String sceneReveal) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondTitle, "secondTitle");
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        Intrinsics.checkNotNullParameter(showArea, "showArea");
        Intrinsics.checkNotNullParameter(skuId, "skuId");
        Intrinsics.checkNotNullParameter(requestModuleName, "requestModuleName");
        Intrinsics.checkNotNullParameter(requestModuleCode, "requestModuleCode");
        Intrinsics.checkNotNullParameter(contentSectionId, "contentSectionId");
        Intrinsics.checkNotNullParameter(infoFlowId, "infoFlowId");
        Intrinsics.checkNotNullParameter(sceneReveal, "sceneReveal");
        return new RecommendTabEntity(title, secondTitle, linkCode, showArea, cardType, showInterested, skuId, sourceType, requestModuleName, requestModuleCode, identityDistinct, labelSwitch, isProductDetail, contentSectionId, infoFlowId, goodsNameType, goodsPicType, goodsPrefix, goodsLabelSwitch, isShowGoodsSlogan, titleShowStyleNumber, sceneReveal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendTabEntity)) {
            return false;
        }
        RecommendTabEntity recommendTabEntity = (RecommendTabEntity) other;
        return Intrinsics.areEqual(this.title, recommendTabEntity.title) && Intrinsics.areEqual(this.secondTitle, recommendTabEntity.secondTitle) && Intrinsics.areEqual(this.linkCode, recommendTabEntity.linkCode) && Intrinsics.areEqual(this.showArea, recommendTabEntity.showArea) && this.cardType == recommendTabEntity.cardType && this.showInterested == recommendTabEntity.showInterested && Intrinsics.areEqual(this.skuId, recommendTabEntity.skuId) && Intrinsics.areEqual(this.sourceType, recommendTabEntity.sourceType) && Intrinsics.areEqual(this.requestModuleName, recommendTabEntity.requestModuleName) && Intrinsics.areEqual(this.requestModuleCode, recommendTabEntity.requestModuleCode) && Intrinsics.areEqual(this.identityDistinct, recommendTabEntity.identityDistinct) && Intrinsics.areEqual(this.labelSwitch, recommendTabEntity.labelSwitch) && this.isProductDetail == recommendTabEntity.isProductDetail && Intrinsics.areEqual(this.contentSectionId, recommendTabEntity.contentSectionId) && Intrinsics.areEqual(this.infoFlowId, recommendTabEntity.infoFlowId) && Intrinsics.areEqual(this.goodsNameType, recommendTabEntity.goodsNameType) && Intrinsics.areEqual(this.goodsPicType, recommendTabEntity.goodsPicType) && Intrinsics.areEqual(this.goodsPrefix, recommendTabEntity.goodsPrefix) && Intrinsics.areEqual(this.goodsLabelSwitch, recommendTabEntity.goodsLabelSwitch) && this.isShowGoodsSlogan == recommendTabEntity.isShowGoodsSlogan && this.titleShowStyleNumber == recommendTabEntity.titleShowStyleNumber && Intrinsics.areEqual(this.sceneReveal, recommendTabEntity.sceneReveal);
    }

    public final int getCardType() {
        return this.cardType;
    }

    @NotNull
    public final String getContentSectionId() {
        return this.contentSectionId;
    }

    @Nullable
    public final List<Integer> getGoodsLabelSwitch() {
        return this.goodsLabelSwitch;
    }

    @Nullable
    public final Integer getGoodsNameType() {
        return this.goodsNameType;
    }

    @Nullable
    public final Integer getGoodsPicType() {
        return this.goodsPicType;
    }

    @Nullable
    public final List<Integer> getGoodsPrefix() {
        return this.goodsPrefix;
    }

    @Nullable
    public final Integer getIdentityDistinct() {
        return this.identityDistinct;
    }

    @NotNull
    public final String getInfoFlowId() {
        return this.infoFlowId;
    }

    @Nullable
    public final List<Integer> getLabelSwitch() {
        return this.labelSwitch;
    }

    @NotNull
    public final String getLinkCode() {
        return this.linkCode;
    }

    @NotNull
    public final String getRequestModuleCode() {
        return this.requestModuleCode;
    }

    @NotNull
    public final String getRequestModuleName() {
        return this.requestModuleName;
    }

    @NotNull
    public final String getSceneReveal() {
        return this.sceneReveal;
    }

    @NotNull
    public final String getSecondTitle() {
        return this.secondTitle;
    }

    @NotNull
    public final String getShowArea() {
        return this.showArea;
    }

    public final boolean getShowInterested() {
        return this.showInterested;
    }

    @NotNull
    public final String getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final Integer getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getTitleShowStyleNumber() {
        return this.titleShowStyleNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26, types: [int] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((this.title.hashCode() * 31) + this.secondTitle.hashCode()) * 31) + this.linkCode.hashCode()) * 31) + this.showArea.hashCode()) * 31) + Integer.hashCode(this.cardType)) * 31;
        boolean z = this.showInterested;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + this.skuId.hashCode()) * 31;
        Integer num = this.sourceType;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.requestModuleName.hashCode()) * 31) + this.requestModuleCode.hashCode()) * 31;
        Integer num2 = this.identityDistinct;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list = this.labelSwitch;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z2 = this.isProductDetail;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode6 = (((((iHashCode5 + r2) * 31) + this.contentSectionId.hashCode()) * 31) + this.infoFlowId.hashCode()) * 31;
        Integer num3 = this.goodsNameType;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.goodsPicType;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<Integer> list2 = this.goodsPrefix;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.goodsLabelSwitch;
        int iHashCode10 = (iHashCode9 + (list3 != null ? list3.hashCode() : 0)) * 31;
        boolean z3 = this.isShowGoodsSlogan;
        return ((((iHashCode10 + (z3 ? 1 : z3)) * 31) + Integer.hashCode(this.titleShowStyleNumber)) * 31) + this.sceneReveal.hashCode();
    }

    public final boolean isProductDetail() {
        return this.isProductDetail;
    }

    public final boolean isShowGoodsSlogan() {
        return this.isShowGoodsSlogan;
    }

    public final void setSceneReveal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sceneReveal = str;
    }

    public final void setShowGoodsSlogan(boolean z) {
        this.isShowGoodsSlogan = z;
    }

    public final void setTitleShowStyleNumber(int i) {
        this.titleShowStyleNumber = i;
    }

    @NotNull
    public String toString() {
        return "RecommendTabEntity(title=" + this.title + ", secondTitle=" + this.secondTitle + ", linkCode=" + this.linkCode + ", showArea=" + this.showArea + ", cardType=" + this.cardType + ", showInterested=" + this.showInterested + ", skuId=" + this.skuId + ", sourceType=" + this.sourceType + ", requestModuleName=" + this.requestModuleName + ", requestModuleCode=" + this.requestModuleCode + ", identityDistinct=" + this.identityDistinct + ", labelSwitch=" + this.labelSwitch + ", isProductDetail=" + this.isProductDetail + ", contentSectionId=" + this.contentSectionId + ", infoFlowId=" + this.infoFlowId + ", goodsNameType=" + this.goodsNameType + ", goodsPicType=" + this.goodsPicType + ", goodsPrefix=" + this.goodsPrefix + ", goodsLabelSwitch=" + this.goodsLabelSwitch + ", isShowGoodsSlogan=" + this.isShowGoodsSlogan + ", titleShowStyleNumber=" + this.titleShowStyleNumber + ", sceneReveal=" + this.sceneReveal + ')';
    }

    public /* synthetic */ RecommendTabEntity(String str, String str2, String str3, String str4, int i, boolean z, String str5, Integer num, String str6, String str7, Integer num2, List list, boolean z2, String str8, String str9, Integer num3, Integer num4, List list2, List list3, boolean z3, int i2, String str10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i3 & 16) != 0 ? 1 : i, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? "" : str6, (i3 & 512) != 0 ? "" : str7, (i3 & 1024) != 0 ? null : num2, (i3 & 2048) != 0 ? null : list, (i3 & 4096) != 0 ? false : z2, (i3 & 8192) != 0 ? "" : str8, (i3 & 16384) != 0 ? "" : str9, (32768 & i3) != 0 ? null : num3, (65536 & i3) != 0 ? null : num4, (131072 & i3) != 0 ? null : list2, (262144 & i3) != 0 ? null : list3, (524288 & i3) != 0 ? true : z3, (1048576 & i3) != 0 ? 2 : i2, (i3 & 2097152) != 0 ? "" : str10);
    }
}
