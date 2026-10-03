package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jt\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006*"}, d2 = {"Lcom/heytap/store/base/core/data/OrderBean;", "", "order_status", "", "status_custom", "", "create_time", "goods_count", "order_url", "order_code", "total_fee", "goods", "", "Lcom/heytap/store/base/core/data/ProductBean;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCreate_time", "()Ljava/lang/String;", "getGoods", "()Ljava/util/List;", "getGoods_count", "getOrder_code", "getOrder_status", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrder_url", "getStatus_custom", "getTotal_fee", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/heytap/store/base/core/data/OrderBean;", "equals", "", "other", "hashCode", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OrderBean {

    @Nullable
    private final String create_time;

    @Nullable
    private final List<ProductBean> goods;

    @Nullable
    private final String goods_count;

    @Nullable
    private final String order_code;

    @Nullable
    private final Integer order_status;

    @Nullable
    private final String order_url;

    @Nullable
    private final String status_custom;

    @Nullable
    private final String total_fee;

    public OrderBean() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getOrder_status() {
        return this.order_status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_custom() {
        return this.status_custom;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCreate_time() {
        return this.create_time;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGoods_count() {
        return this.goods_count;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOrder_url() {
        return this.order_url;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrder_code() {
        return this.order_code;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTotal_fee() {
        return this.total_fee;
    }

    @Nullable
    public final List<ProductBean> component8() {
        return this.goods;
    }

    @NotNull
    public final OrderBean copy(@Nullable Integer order_status, @Nullable String status_custom, @Nullable String create_time, @Nullable String goods_count, @Nullable String order_url, @Nullable String order_code, @Nullable String total_fee, @Nullable List<ProductBean> goods) {
        return new OrderBean(order_status, status_custom, create_time, goods_count, order_url, order_code, total_fee, goods);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderBean)) {
            return false;
        }
        OrderBean orderBean = (OrderBean) other;
        return Intrinsics.areEqual(this.order_status, orderBean.order_status) && Intrinsics.areEqual(this.status_custom, orderBean.status_custom) && Intrinsics.areEqual(this.create_time, orderBean.create_time) && Intrinsics.areEqual(this.goods_count, orderBean.goods_count) && Intrinsics.areEqual(this.order_url, orderBean.order_url) && Intrinsics.areEqual(this.order_code, orderBean.order_code) && Intrinsics.areEqual(this.total_fee, orderBean.total_fee) && Intrinsics.areEqual(this.goods, orderBean.goods);
    }

    @Nullable
    public final String getCreate_time() {
        return this.create_time;
    }

    @Nullable
    public final List<ProductBean> getGoods() {
        return this.goods;
    }

    @Nullable
    public final String getGoods_count() {
        return this.goods_count;
    }

    @Nullable
    public final String getOrder_code() {
        return this.order_code;
    }

    @Nullable
    public final Integer getOrder_status() {
        return this.order_status;
    }

    @Nullable
    public final String getOrder_url() {
        return this.order_url;
    }

    @Nullable
    public final String getStatus_custom() {
        return this.status_custom;
    }

    @Nullable
    public final String getTotal_fee() {
        return this.total_fee;
    }

    public int hashCode() {
        Integer num = this.order_status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.status_custom;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.create_time;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.goods_count;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.order_url;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.order_code;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.total_fee;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<ProductBean> list = this.goods;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderBean(order_status=" + this.order_status + ", status_custom=" + ((Object) this.status_custom) + ", create_time=" + ((Object) this.create_time) + ", goods_count=" + ((Object) this.goods_count) + ", order_url=" + ((Object) this.order_url) + ", order_code=" + ((Object) this.order_code) + ", total_fee=" + ((Object) this.total_fee) + ", goods=" + this.goods + ')';
    }

    public OrderBean(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable List<ProductBean> list) {
        this.order_status = num;
        this.status_custom = str;
        this.create_time = str2;
        this.goods_count = str3;
        this.order_url = str4;
        this.order_code = str5;
        this.total_fee = str6;
        this.goods = list;
    }

    public /* synthetic */ OrderBean(Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : list);
    }
}
