package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import com.heytap.store.message.service.MessageConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/heytap/store/base/core/data/OnLineServiceBean;", "", MessageConst.CUST_SOURCE, "", MessageConst.CUST_MEDIUM, "skuId", "product", "Lcom/heytap/store/base/core/data/ProductBean;", "order", "Lcom/heytap/store/base/core/data/OrderBean;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/store/base/core/data/ProductBean;Lcom/heytap/store/base/core/data/OrderBean;)V", "getCust_medium", "()Ljava/lang/String;", "getCust_source", "getOrder", "()Lcom/heytap/store/base/core/data/OrderBean;", "getProduct", "()Lcom/heytap/store/base/core/data/ProductBean;", "getSkuId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OnLineServiceBean {

    @NotNull
    private final String cust_medium;

    @Nullable
    private final String cust_source;

    @Nullable
    private final OrderBean order;

    @Nullable
    private final ProductBean product;

    @Nullable
    private final String skuId;

    public OnLineServiceBean(@Nullable String str, @NotNull String cust_medium, @Nullable String str2, @Nullable ProductBean productBean, @Nullable OrderBean orderBean) {
        Intrinsics.checkNotNullParameter(cust_medium, "cust_medium");
        this.cust_source = str;
        this.cust_medium = cust_medium;
        this.skuId = str2;
        this.product = productBean;
        this.order = orderBean;
    }

    public static /* synthetic */ OnLineServiceBean copy$default(OnLineServiceBean onLineServiceBean, String str, String str2, String str3, ProductBean productBean, OrderBean orderBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onLineServiceBean.cust_source;
        }
        if ((i & 2) != 0) {
            str2 = onLineServiceBean.cust_medium;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = onLineServiceBean.skuId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            productBean = onLineServiceBean.product;
        }
        ProductBean productBean2 = productBean;
        if ((i & 16) != 0) {
            orderBean = onLineServiceBean.order;
        }
        return onLineServiceBean.copy(str, str4, str5, productBean2, orderBean);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCust_source() {
        return this.cust_source;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCust_medium() {
        return this.cust_medium;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ProductBean getProduct() {
        return this.product;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrderBean getOrder() {
        return this.order;
    }

    @NotNull
    public final OnLineServiceBean copy(@Nullable String cust_source, @NotNull String cust_medium, @Nullable String skuId, @Nullable ProductBean product, @Nullable OrderBean order) {
        Intrinsics.checkNotNullParameter(cust_medium, "cust_medium");
        return new OnLineServiceBean(cust_source, cust_medium, skuId, product, order);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnLineServiceBean)) {
            return false;
        }
        OnLineServiceBean onLineServiceBean = (OnLineServiceBean) other;
        return Intrinsics.areEqual(this.cust_source, onLineServiceBean.cust_source) && Intrinsics.areEqual(this.cust_medium, onLineServiceBean.cust_medium) && Intrinsics.areEqual(this.skuId, onLineServiceBean.skuId) && Intrinsics.areEqual(this.product, onLineServiceBean.product) && Intrinsics.areEqual(this.order, onLineServiceBean.order);
    }

    @NotNull
    public final String getCust_medium() {
        return this.cust_medium;
    }

    @Nullable
    public final String getCust_source() {
        return this.cust_source;
    }

    @Nullable
    public final OrderBean getOrder() {
        return this.order;
    }

    @Nullable
    public final ProductBean getProduct() {
        return this.product;
    }

    @Nullable
    public final String getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        String str = this.cust_source;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.cust_medium.hashCode()) * 31;
        String str2 = this.skuId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProductBean productBean = this.product;
        int iHashCode3 = (iHashCode2 + (productBean == null ? 0 : productBean.hashCode())) * 31;
        OrderBean orderBean = this.order;
        return iHashCode3 + (orderBean != null ? orderBean.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OnLineServiceBean(cust_source=" + ((Object) this.cust_source) + ", cust_medium=" + this.cust_medium + ", skuId=" + ((Object) this.skuId) + ", product=" + this.product + ", order=" + this.order + ')';
    }

    public /* synthetic */ OnLineServiceBean(String str, String str2, String str3, ProductBean productBean, OrderBean orderBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : productBean, (i & 16) != 0 ? null : orderBean);
    }
}
