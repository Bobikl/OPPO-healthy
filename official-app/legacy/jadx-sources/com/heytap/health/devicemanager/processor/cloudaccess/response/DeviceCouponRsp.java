package com.heytap.health.devicemanager.processor.cloudaccess.response;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/devicemanager/processor/cloudaccess/response/DeviceCouponRsp;", "", "count", "", "deeplink", "", "showInterval", "tips", "(ILjava/lang/String;ILjava/lang/String;)V", "getCount", "()I", "getDeeplink", "()Ljava/lang/String;", "getShowInterval", "getTips", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DeviceCouponRsp {
    private final int count;

    @NotNull
    private final String deeplink;
    private final int showInterval;

    @NotNull
    private final String tips;

    public DeviceCouponRsp(int i, @NotNull String deeplink, int i2, @NotNull String tips) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.count = i;
        this.deeplink = deeplink;
        this.showInterval = i2;
        this.tips = tips;
    }

    public static /* synthetic */ DeviceCouponRsp copy$default(DeviceCouponRsp deviceCouponRsp, int i, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = deviceCouponRsp.count;
        }
        if ((i3 & 2) != 0) {
            str = deviceCouponRsp.deeplink;
        }
        if ((i3 & 4) != 0) {
            i2 = deviceCouponRsp.showInterval;
        }
        if ((i3 & 8) != 0) {
            str2 = deviceCouponRsp.tips;
        }
        return deviceCouponRsp.copy(i, str, i2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getShowInterval() {
        return this.showInterval;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    public final DeviceCouponRsp copy(int count, @NotNull String deeplink, int showInterval, @NotNull String tips) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(tips, "tips");
        return new DeviceCouponRsp(count, deeplink, showInterval, tips);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceCouponRsp)) {
            return false;
        }
        DeviceCouponRsp deviceCouponRsp = (DeviceCouponRsp) other;
        return this.count == deviceCouponRsp.count && Intrinsics.areEqual(this.deeplink, deviceCouponRsp.deeplink) && this.showInterval == deviceCouponRsp.showInterval && Intrinsics.areEqual(this.tips, deviceCouponRsp.tips);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final int getShowInterval() {
        return this.showInterval;
    }

    @NotNull
    public final String getTips() {
        return this.tips;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.count) * 31) + this.deeplink.hashCode()) * 31) + Integer.hashCode(this.showInterval)) * 31) + this.tips.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceCouponRsp(count=" + this.count + ", deeplink=" + this.deeplink + ", showInterval=" + this.showInterval + ", tips=" + this.tips + ")";
    }
}
