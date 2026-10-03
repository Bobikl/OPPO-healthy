package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.amap.api.services.district.DistrictSearchQuery;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/business/component/entity/LocationParamsInfo;", "", "()V", DistrictSearchQuery.KEYWORDS_CITY, "", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "lat", "getLat", "setLat", "lng", "getLng", "setLng", DistrictSearchQuery.KEYWORDS_PROVINCE, "getProvince", "setProvince", "shopId", "getShopId", "setShopId", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LocationParamsInfo {

    @NotNull
    private String shopId = "";

    @NotNull
    private String lng = "";

    @NotNull
    private String lat = "";

    @NotNull
    private String province = "";

    @NotNull
    private String city = "";

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getLat() {
        return this.lat;
    }

    @NotNull
    public final String getLng() {
        return this.lng;
    }

    @NotNull
    public final String getProvince() {
        return this.province;
    }

    @NotNull
    public final String getShopId() {
        return this.shopId;
    }

    public final void setCity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.city = str;
    }

    public final void setLat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lat = str;
    }

    public final void setLng(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lng = str;
    }

    public final void setProvince(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.province = str;
    }

    public final void setShopId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shopId = str;
    }
}
