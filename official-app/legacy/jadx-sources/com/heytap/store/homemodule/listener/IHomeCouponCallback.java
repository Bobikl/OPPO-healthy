package com.heytap.store.homemodule.listener;

import com.heytap.store.homemodule.data.coupon.HomeCouponData;
import com.heytap.store.homemodule.data.coupon.HomeGetCouponResult;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/listener/IHomeCouponCallback;", "", "getCouponListId", "", "onResponseCouponList", "", "data", "", "Lcom/heytap/store/homemodule/data/coupon/HomeCouponData;", "onResponseGetCoupon", "result", "Lcom/heytap/store/homemodule/data/coupon/HomeGetCouponResult;", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IHomeCouponCallback {
    @NotNull
    String getCouponListId();

    void onResponseCouponList(@Nullable List<HomeCouponData> data);

    void onResponseGetCoupon(@Nullable HomeGetCouponResult result);
}
