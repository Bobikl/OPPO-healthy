package com.heytap.store.message.service.data.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/heytap/store/message/service/data/entity/ProductBean;", "", "card_title", "", "card_desc", "card_note", "card_url", "card_picture", "name", "pictureUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCard_desc", "()Ljava/lang/String;", "getCard_note", "getCard_picture", "getCard_title", "getCard_url", "getName", "getPictureUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "message-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ProductBean {

    @Nullable
    private final String card_desc;

    @Nullable
    private final String card_note;

    @Nullable
    private final String card_picture;

    @NotNull
    private final String card_title;

    @NotNull
    private final String card_url;

    @Nullable
    private final String name;

    @Nullable
    private final String pictureUrl;

    public ProductBean(@NotNull String card_title, @Nullable String str, @Nullable String str2, @NotNull String card_url, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(card_title, "card_title");
        Intrinsics.checkNotNullParameter(card_url, "card_url");
        this.card_title = card_title;
        this.card_desc = str;
        this.card_note = str2;
        this.card_url = card_url;
        this.card_picture = str3;
        this.name = str4;
        this.pictureUrl = str5;
    }

    public static /* synthetic */ ProductBean copy$default(ProductBean productBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productBean.card_title;
        }
        if ((i & 2) != 0) {
            str2 = productBean.card_desc;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = productBean.card_note;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = productBean.card_url;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = productBean.card_picture;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = productBean.name;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = productBean.pictureUrl;
        }
        return productBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCard_title() {
        return this.card_title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCard_desc() {
        return this.card_desc;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCard_note() {
        return this.card_note;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCard_url() {
        return this.card_url;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCard_picture() {
        return this.card_picture;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    @NotNull
    public final ProductBean copy(@NotNull String card_title, @Nullable String card_desc, @Nullable String card_note, @NotNull String card_url, @Nullable String card_picture, @Nullable String name, @Nullable String pictureUrl) {
        Intrinsics.checkNotNullParameter(card_title, "card_title");
        Intrinsics.checkNotNullParameter(card_url, "card_url");
        return new ProductBean(card_title, card_desc, card_note, card_url, card_picture, name, pictureUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductBean)) {
            return false;
        }
        ProductBean productBean = (ProductBean) other;
        return Intrinsics.areEqual(this.card_title, productBean.card_title) && Intrinsics.areEqual(this.card_desc, productBean.card_desc) && Intrinsics.areEqual(this.card_note, productBean.card_note) && Intrinsics.areEqual(this.card_url, productBean.card_url) && Intrinsics.areEqual(this.card_picture, productBean.card_picture) && Intrinsics.areEqual(this.name, productBean.name) && Intrinsics.areEqual(this.pictureUrl, productBean.pictureUrl);
    }

    @Nullable
    public final String getCard_desc() {
        return this.card_desc;
    }

    @Nullable
    public final String getCard_note() {
        return this.card_note;
    }

    @Nullable
    public final String getCard_picture() {
        return this.card_picture;
    }

    @NotNull
    public final String getCard_title() {
        return this.card_title;
    }

    @NotNull
    public final String getCard_url() {
        return this.card_url;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    public int hashCode() {
        int iHashCode = this.card_title.hashCode() * 31;
        String str = this.card_desc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.card_note;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.card_url.hashCode()) * 31;
        String str3 = this.card_picture;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pictureUrl;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductBean(card_title=" + this.card_title + ", card_desc=" + ((Object) this.card_desc) + ", card_note=" + ((Object) this.card_note) + ", card_url=" + this.card_url + ", card_picture=" + ((Object) this.card_picture) + ", name=" + ((Object) this.name) + ", pictureUrl=" + ((Object) this.pictureUrl) + ')';
    }

    public /* synthetic */ ProductBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
