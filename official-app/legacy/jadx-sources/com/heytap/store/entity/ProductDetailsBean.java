package com.heytap.store.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003Jj\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014¨\u00065"}, d2 = {"Lcom/heytap/store/entity/ProductDetailsBean;", "", "detailsType", "", "type", "", "url", "link", "timeleg", "jsonUrl", "previewImage", "realPosition", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;I)V", "getDetailsType", "()I", "setDetailsType", "(I)V", "getJsonUrl", "()Ljava/lang/String;", "setJsonUrl", "(Ljava/lang/String;)V", "getLink", "setLink", "getPreviewImage", "setPreviewImage", "getRealPosition", "setRealPosition", "reportType", "getReportType", "getTimeleg", "()Ljava/lang/Integer;", "setTimeleg", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getType", "setType", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;I)Lcom/heytap/store/entity/ProductDetailsBean;", "equals", "", "other", "hashCode", "toString", "datapersistence_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ProductDetailsBean {
    private int detailsType;

    @Nullable
    private String jsonUrl;

    @Nullable
    private String link;

    @Nullable
    private String previewImage;
    private int realPosition;

    @Nullable
    private Integer timeleg;

    @Nullable
    private String type;

    @Nullable
    private String url;

    public ProductDetailsBean() {
        this(0, null, null, null, null, null, null, 0, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDetailsType() {
        return this.detailsType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTimeleg() {
        return this.timeleg;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJsonUrl() {
        return this.jsonUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPreviewImage() {
        return this.previewImage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getRealPosition() {
        return this.realPosition;
    }

    @NotNull
    public final ProductDetailsBean copy(int detailsType, @Nullable String type, @Nullable String url, @Nullable String link, @Nullable Integer timeleg, @Nullable String jsonUrl, @Nullable String previewImage, int realPosition) {
        return new ProductDetailsBean(detailsType, type, url, link, timeleg, jsonUrl, previewImage, realPosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDetailsBean)) {
            return false;
        }
        ProductDetailsBean productDetailsBean = (ProductDetailsBean) other;
        return this.detailsType == productDetailsBean.detailsType && Intrinsics.areEqual(this.type, productDetailsBean.type) && Intrinsics.areEqual(this.url, productDetailsBean.url) && Intrinsics.areEqual(this.link, productDetailsBean.link) && Intrinsics.areEqual(this.timeleg, productDetailsBean.timeleg) && Intrinsics.areEqual(this.jsonUrl, productDetailsBean.jsonUrl) && Intrinsics.areEqual(this.previewImage, productDetailsBean.previewImage) && this.realPosition == productDetailsBean.realPosition;
    }

    public final int getDetailsType() {
        return this.detailsType;
    }

    @Nullable
    public final String getJsonUrl() {
        return this.jsonUrl;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getPreviewImage() {
        return this.previewImage;
    }

    public final int getRealPosition() {
        return this.realPosition;
    }

    @NotNull
    public final String getReportType() {
        return this.detailsType == 0 ? "图文" : "参数";
    }

    @Nullable
    public final Integer getTimeleg() {
        return this.timeleg;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.detailsType) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.timeleg;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.jsonUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.previewImage;
        return ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.realPosition);
    }

    public final void setDetailsType(int i) {
        this.detailsType = i;
    }

    public final void setJsonUrl(@Nullable String str) {
        this.jsonUrl = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setPreviewImage(@Nullable String str) {
        this.previewImage = str;
    }

    public final void setRealPosition(int i) {
        this.realPosition = i;
    }

    public final void setTimeleg(@Nullable Integer num) {
        this.timeleg = num;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "ProductDetailsBean(detailsType=" + this.detailsType + ", type=" + this.type + ", url=" + this.url + ", link=" + this.link + ", timeleg=" + this.timeleg + ", jsonUrl=" + this.jsonUrl + ", previewImage=" + this.previewImage + ", realPosition=" + this.realPosition + ')';
    }

    public ProductDetailsBean(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, int i2) {
        this.detailsType = i;
        this.type = str;
        this.url = str2;
        this.link = str3;
        this.timeleg = num;
        this.jsonUrl = str4;
        this.previewImage = str5;
        this.realPosition = i2;
    }

    public /* synthetic */ ProductDetailsBean(int i, String str, String str2, String str3, Integer num, String str4, String str5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? 0 : num, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? 0 : i2);
    }
}
