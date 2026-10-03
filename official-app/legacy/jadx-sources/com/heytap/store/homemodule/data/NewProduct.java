package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\bHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/heytap/store/homemodule/data/NewProduct;", "", "backgroudUrl", "", "mediaList", "", "Lcom/heytap/store/homemodule/data/MediaInfo;", "mediaType", "", "subscribe", "Lcom/heytap/store/homemodule/data/NewProductSubscribe;", "(Ljava/lang/String;Ljava/util/List;ILcom/heytap/store/homemodule/data/NewProductSubscribe;)V", "getBackgroudUrl", "()Ljava/lang/String;", "setBackgroudUrl", "(Ljava/lang/String;)V", "getMediaList", "()Ljava/util/List;", "setMediaList", "(Ljava/util/List;)V", "getMediaType", "()I", "setMediaType", "(I)V", "getSubscribe", "()Lcom/heytap/store/homemodule/data/NewProductSubscribe;", "setSubscribe", "(Lcom/heytap/store/homemodule/data/NewProductSubscribe;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class NewProduct {

    @NotNull
    private String backgroudUrl;

    @Nullable
    private List<MediaInfo> mediaList;
    private int mediaType;

    @Nullable
    private NewProductSubscribe subscribe;

    public NewProduct() {
        this(null, null, 0, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewProduct copy$default(NewProduct newProduct, String str, List list, int i, NewProductSubscribe newProductSubscribe, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = newProduct.backgroudUrl;
        }
        if ((i2 & 2) != 0) {
            list = newProduct.mediaList;
        }
        if ((i2 & 4) != 0) {
            i = newProduct.mediaType;
        }
        if ((i2 & 8) != 0) {
            newProductSubscribe = newProduct.subscribe;
        }
        return newProduct.copy(str, list, i, newProductSubscribe);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroudUrl() {
        return this.backgroudUrl;
    }

    @Nullable
    public final List<MediaInfo> component2() {
        return this.mediaList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMediaType() {
        return this.mediaType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NewProductSubscribe getSubscribe() {
        return this.subscribe;
    }

    @NotNull
    public final NewProduct copy(@NotNull String backgroudUrl, @Nullable List<MediaInfo> mediaList, int mediaType, @Nullable NewProductSubscribe subscribe) {
        Intrinsics.checkNotNullParameter(backgroudUrl, "backgroudUrl");
        return new NewProduct(backgroudUrl, mediaList, mediaType, subscribe);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewProduct)) {
            return false;
        }
        NewProduct newProduct = (NewProduct) other;
        return Intrinsics.areEqual(this.backgroudUrl, newProduct.backgroudUrl) && Intrinsics.areEqual(this.mediaList, newProduct.mediaList) && this.mediaType == newProduct.mediaType && Intrinsics.areEqual(this.subscribe, newProduct.subscribe);
    }

    @NotNull
    public final String getBackgroudUrl() {
        return this.backgroudUrl;
    }

    @Nullable
    public final List<MediaInfo> getMediaList() {
        return this.mediaList;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    @Nullable
    public final NewProductSubscribe getSubscribe() {
        return this.subscribe;
    }

    public int hashCode() {
        int iHashCode = this.backgroudUrl.hashCode() * 31;
        List<MediaInfo> list = this.mediaList;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.mediaType)) * 31;
        NewProductSubscribe newProductSubscribe = this.subscribe;
        return iHashCode2 + (newProductSubscribe != null ? newProductSubscribe.hashCode() : 0);
    }

    public final void setBackgroudUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroudUrl = str;
    }

    public final void setMediaList(@Nullable List<MediaInfo> list) {
        this.mediaList = list;
    }

    public final void setMediaType(int i) {
        this.mediaType = i;
    }

    public final void setSubscribe(@Nullable NewProductSubscribe newProductSubscribe) {
        this.subscribe = newProductSubscribe;
    }

    @NotNull
    public String toString() {
        return "NewProduct(backgroudUrl=" + this.backgroudUrl + ", mediaList=" + this.mediaList + ", mediaType=" + this.mediaType + ", subscribe=" + this.subscribe + ')';
    }

    public NewProduct(@NotNull String backgroudUrl, @Nullable List<MediaInfo> list, int i, @Nullable NewProductSubscribe newProductSubscribe) {
        Intrinsics.checkNotNullParameter(backgroudUrl, "backgroudUrl");
        this.backgroudUrl = backgroudUrl;
        this.mediaList = list;
        this.mediaType = i;
        this.subscribe = newProductSubscribe;
    }

    public /* synthetic */ NewProduct(String str, List list, int i, NewProductSubscribe newProductSubscribe, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? null : newProductSubscribe);
    }
}
