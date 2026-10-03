package com.heytap.store.platform.videoplayer.bean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/platform/videoplayer/bean/ProductDetailDataBean;", "", "type", "", "data", "(ILjava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "getType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "baseplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ProductDetailDataBean {

    @Nullable
    private final Object data;
    private final int type;

    public ProductDetailDataBean(int i, @Nullable Object obj) {
        this.type = i;
        this.data = obj;
    }

    public static /* synthetic */ ProductDetailDataBean copy$default(ProductDetailDataBean productDetailDataBean, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = productDetailDataBean.type;
        }
        if ((i2 & 2) != 0) {
            obj = productDetailDataBean.data;
        }
        return productDetailDataBean.copy(i, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final ProductDetailDataBean copy(int type, @Nullable Object data) {
        return new ProductDetailDataBean(type, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDetailDataBean)) {
            return false;
        }
        ProductDetailDataBean productDetailDataBean = (ProductDetailDataBean) other;
        return this.type == productDetailDataBean.type && Intrinsics.areEqual(this.data, productDetailDataBean.data);
    }

    @Nullable
    public final Object getData() {
        return this.data;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        Object obj = this.data;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProductDetailDataBean(type=" + this.type + ", data=" + this.data + ')';
    }
}
