package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bC\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0016J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\bHÆ\u0003JÂ\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u00032\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\nHÖ\u0001J\t\u0010O\u001a\u00020\bHÖ\u0001R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b\u0002\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001aR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u0010\u001e¨\u0006P"}, d2 = {"Lcom/heytap/store/base/core/data/ReleaseStayVo;", "", "isPopUps", "", "productDetailss", "", "Lcom/heytap/store/base/core/data/RecommendGoodsDetailVo;", "popUpLink", "", "frameType", "", "customPicture", "activityList", "Lcom/heytap/store/base/core/data/ActivityInfo;", "mainTitle", Feedback.WIDGET_SUBTITLE, "toggle", "returnDesc", "remainDesc", "transparent", "spuId", "pleaseStayName", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityList", "()Ljava/util/List;", "setActivityList", "(Ljava/util/List;)V", "getCustomPicture", "()Ljava/lang/String;", "setCustomPicture", "(Ljava/lang/String;)V", "getFrameType", "()Ljava/lang/Integer;", "setFrameType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setPopUps", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMainTitle", "setMainTitle", "getPleaseStayName", "setPleaseStayName", "getPopUpLink", "setPopUpLink", "getProductDetailss", "setProductDetailss", "getRemainDesc", "setRemainDesc", "getReturnDesc", "setReturnDesc", "getSpuId", "setSpuId", "getSubTitle", "setSubTitle", "getToggle", "setToggle", "getTransparent", "setTransparent", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/store/base/core/data/ReleaseStayVo;", "equals", "other", "hashCode", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ReleaseStayVo {

    @Nullable
    private List<ActivityInfo> activityList;

    @Nullable
    private String customPicture;

    @Nullable
    private Integer frameType;

    @Nullable
    private Boolean isPopUps;

    @Nullable
    private String mainTitle;

    @Nullable
    private String pleaseStayName;

    @Nullable
    private String popUpLink;

    @Nullable
    private List<RecommendGoodsDetailVo> productDetailss;

    @Nullable
    private String remainDesc;

    @Nullable
    private String returnDesc;

    @Nullable
    private String spuId;

    @Nullable
    private String subTitle;

    @Nullable
    private String toggle;

    @Nullable
    private String transparent;

    public ReleaseStayVo(@Nullable Boolean bool, @Nullable List<RecommendGoodsDetailVo> list, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable List<ActivityInfo> list2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.isPopUps = bool;
        this.productDetailss = list;
        this.popUpLink = str;
        this.frameType = num;
        this.customPicture = str2;
        this.activityList = list2;
        this.mainTitle = str3;
        this.subTitle = str4;
        this.toggle = str5;
        this.returnDesc = str6;
        this.remainDesc = str7;
        this.transparent = str8;
        this.spuId = str9;
        this.pleaseStayName = str10;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsPopUps() {
        return this.isPopUps;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReturnDesc() {
        return this.returnDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRemainDesc() {
        return this.remainDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTransparent() {
        return this.transparent;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSpuId() {
        return this.spuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPleaseStayName() {
        return this.pleaseStayName;
    }

    @Nullable
    public final List<RecommendGoodsDetailVo> component2() {
        return this.productDetailss;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPopUpLink() {
        return this.popUpLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getFrameType() {
        return this.frameType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCustomPicture() {
        return this.customPicture;
    }

    @Nullable
    public final List<ActivityInfo> component6() {
        return this.activityList;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMainTitle() {
        return this.mainTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getToggle() {
        return this.toggle;
    }

    @NotNull
    public final ReleaseStayVo copy(@Nullable Boolean isPopUps, @Nullable List<RecommendGoodsDetailVo> productDetailss, @Nullable String popUpLink, @Nullable Integer frameType, @Nullable String customPicture, @Nullable List<ActivityInfo> activityList, @Nullable String mainTitle, @Nullable String subTitle, @Nullable String toggle, @Nullable String returnDesc, @Nullable String remainDesc, @Nullable String transparent, @Nullable String spuId, @Nullable String pleaseStayName) {
        return new ReleaseStayVo(isPopUps, productDetailss, popUpLink, frameType, customPicture, activityList, mainTitle, subTitle, toggle, returnDesc, remainDesc, transparent, spuId, pleaseStayName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReleaseStayVo)) {
            return false;
        }
        ReleaseStayVo releaseStayVo = (ReleaseStayVo) other;
        return Intrinsics.areEqual(this.isPopUps, releaseStayVo.isPopUps) && Intrinsics.areEqual(this.productDetailss, releaseStayVo.productDetailss) && Intrinsics.areEqual(this.popUpLink, releaseStayVo.popUpLink) && Intrinsics.areEqual(this.frameType, releaseStayVo.frameType) && Intrinsics.areEqual(this.customPicture, releaseStayVo.customPicture) && Intrinsics.areEqual(this.activityList, releaseStayVo.activityList) && Intrinsics.areEqual(this.mainTitle, releaseStayVo.mainTitle) && Intrinsics.areEqual(this.subTitle, releaseStayVo.subTitle) && Intrinsics.areEqual(this.toggle, releaseStayVo.toggle) && Intrinsics.areEqual(this.returnDesc, releaseStayVo.returnDesc) && Intrinsics.areEqual(this.remainDesc, releaseStayVo.remainDesc) && Intrinsics.areEqual(this.transparent, releaseStayVo.transparent) && Intrinsics.areEqual(this.spuId, releaseStayVo.spuId) && Intrinsics.areEqual(this.pleaseStayName, releaseStayVo.pleaseStayName);
    }

    @Nullable
    public final List<ActivityInfo> getActivityList() {
        return this.activityList;
    }

    @Nullable
    public final String getCustomPicture() {
        return this.customPicture;
    }

    @Nullable
    public final Integer getFrameType() {
        return this.frameType;
    }

    @Nullable
    public final String getMainTitle() {
        return this.mainTitle;
    }

    @Nullable
    public final String getPleaseStayName() {
        return this.pleaseStayName;
    }

    @Nullable
    public final String getPopUpLink() {
        return this.popUpLink;
    }

    @Nullable
    public final List<RecommendGoodsDetailVo> getProductDetailss() {
        return this.productDetailss;
    }

    @Nullable
    public final String getRemainDesc() {
        return this.remainDesc;
    }

    @Nullable
    public final String getReturnDesc() {
        return this.returnDesc;
    }

    @Nullable
    public final String getSpuId() {
        return this.spuId;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getToggle() {
        return this.toggle;
    }

    @Nullable
    public final String getTransparent() {
        return this.transparent;
    }

    public int hashCode() {
        Boolean bool = this.isPopUps;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<RecommendGoodsDetailVo> list = this.productDetailss;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.popUpLink;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.frameType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.customPicture;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ActivityInfo> list2 = this.activityList;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.mainTitle;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subTitle;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.toggle;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.returnDesc;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.remainDesc;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.transparent;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.spuId;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pleaseStayName;
        return iHashCode13 + (str10 != null ? str10.hashCode() : 0);
    }

    @Nullable
    public final Boolean isPopUps() {
        return this.isPopUps;
    }

    public final void setActivityList(@Nullable List<ActivityInfo> list) {
        this.activityList = list;
    }

    public final void setCustomPicture(@Nullable String str) {
        this.customPicture = str;
    }

    public final void setFrameType(@Nullable Integer num) {
        this.frameType = num;
    }

    public final void setMainTitle(@Nullable String str) {
        this.mainTitle = str;
    }

    public final void setPleaseStayName(@Nullable String str) {
        this.pleaseStayName = str;
    }

    public final void setPopUpLink(@Nullable String str) {
        this.popUpLink = str;
    }

    public final void setPopUps(@Nullable Boolean bool) {
        this.isPopUps = bool;
    }

    public final void setProductDetailss(@Nullable List<RecommendGoodsDetailVo> list) {
        this.productDetailss = list;
    }

    public final void setRemainDesc(@Nullable String str) {
        this.remainDesc = str;
    }

    public final void setReturnDesc(@Nullable String str) {
        this.returnDesc = str;
    }

    public final void setSpuId(@Nullable String str) {
        this.spuId = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setToggle(@Nullable String str) {
        this.toggle = str;
    }

    public final void setTransparent(@Nullable String str) {
        this.transparent = str;
    }

    @NotNull
    public String toString() {
        return "ReleaseStayVo(isPopUps=" + this.isPopUps + ", productDetailss=" + this.productDetailss + ", popUpLink=" + ((Object) this.popUpLink) + ", frameType=" + this.frameType + ", customPicture=" + ((Object) this.customPicture) + ", activityList=" + this.activityList + ", mainTitle=" + ((Object) this.mainTitle) + ", subTitle=" + ((Object) this.subTitle) + ", toggle=" + ((Object) this.toggle) + ", returnDesc=" + ((Object) this.returnDesc) + ", remainDesc=" + ((Object) this.remainDesc) + ", transparent=" + ((Object) this.transparent) + ", spuId=" + ((Object) this.spuId) + ", pleaseStayName=" + ((Object) this.pleaseStayName) + ')';
    }
}
