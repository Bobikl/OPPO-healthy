package com.heytap.health.watchface.network.bean;

import androidx.annotation.Keep;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.store.business.rn.service.RnConstant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/watchface/network/bean/CouponPageBean;", "", RnConstant.KEY_PAGE, "", "size", Element.ELEMENT_NAME_TOTAL, "couponDetailDtoList", "", "Lcom/heytap/health/watchface/network/bean/CouponDetailDto;", "(JJJLjava/util/List;)V", "getCouponDetailDtoList", "()Ljava/util/List;", "getPage", "()J", "getSize", "getTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CouponPageBean {

    @NotNull
    private final List<CouponDetailDto> couponDetailDtoList;
    private final long page;
    private final long size;
    private final long total;

    public CouponPageBean(long j2, long j3, long j4, @NotNull List<CouponDetailDto> couponDetailDtoList) {
        Intrinsics.checkNotNullParameter(couponDetailDtoList, "couponDetailDtoList");
        this.page = j2;
        this.size = j3;
        this.total = j4;
        this.couponDetailDtoList = couponDetailDtoList;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTotal() {
        return this.total;
    }

    @NotNull
    public final List<CouponDetailDto> component4() {
        return this.couponDetailDtoList;
    }

    @NotNull
    public final CouponPageBean copy(long page, long size, long total, @NotNull List<CouponDetailDto> couponDetailDtoList) {
        Intrinsics.checkNotNullParameter(couponDetailDtoList, "couponDetailDtoList");
        return new CouponPageBean(page, size, total, couponDetailDtoList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponPageBean)) {
            return false;
        }
        CouponPageBean couponPageBean = (CouponPageBean) other;
        return this.page == couponPageBean.page && this.size == couponPageBean.size && this.total == couponPageBean.total && Intrinsics.areEqual(this.couponDetailDtoList, couponPageBean.couponDetailDtoList);
    }

    @NotNull
    public final List<CouponDetailDto> getCouponDetailDtoList() {
        return this.couponDetailDtoList;
    }

    public final long getPage() {
        return this.page;
    }

    public final long getSize() {
        return this.size;
    }

    public final long getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.page) * 31) + Long.hashCode(this.size)) * 31) + Long.hashCode(this.total)) * 31) + this.couponDetailDtoList.hashCode();
    }

    @NotNull
    public String toString() {
        return "CouponPageBean(page=" + this.page + ", size=" + this.size + ", total=" + this.total + ", couponDetailDtoList=" + this.couponDetailDtoList + ")";
    }
}
