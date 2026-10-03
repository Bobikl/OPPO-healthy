package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/homemodule/data/GoodsActivity;", "", "activityInfo", "", "type", "", "(Ljava/lang/String;I)V", "getActivityInfo", "()Ljava/lang/String;", "setActivityInfo", "(Ljava/lang/String;)V", "getType", "()I", "setType", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class GoodsActivity {
    public static final int ACTIVITY_TYPE_ANT_CREDIT_PAY = 1;
    public static final int ACTIVITY_TYPE_COUPON = 3;
    public static final int ACTIVITY_TYPE_DISCOUNT = 4;
    public static final int ACTIVITY_TYPE_GIF = 2;
    public static final int ACTIVITY_TYPE_INTEGRAL_TO_CASH = 5;

    @NotNull
    private String activityInfo;
    private int type;

    /* JADX WARN: Multi-variable type inference failed */
    public GoodsActivity() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GoodsActivity copy$default(GoodsActivity goodsActivity, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = goodsActivity.activityInfo;
        }
        if ((i2 & 2) != 0) {
            i = goodsActivity.type;
        }
        return goodsActivity.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityInfo() {
        return this.activityInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final GoodsActivity copy(@NotNull String activityInfo, int type) {
        Intrinsics.checkNotNullParameter(activityInfo, "activityInfo");
        return new GoodsActivity(activityInfo, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoodsActivity)) {
            return false;
        }
        GoodsActivity goodsActivity = (GoodsActivity) other;
        return Intrinsics.areEqual(this.activityInfo, goodsActivity.activityInfo) && this.type == goodsActivity.type;
    }

    @NotNull
    public final String getActivityInfo() {
        return this.activityInfo;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.activityInfo.hashCode() * 31) + Integer.hashCode(this.type);
    }

    public final void setActivityInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.activityInfo = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "GoodsActivity(activityInfo=" + this.activityInfo + ", type=" + this.type + ')';
    }

    public GoodsActivity(@NotNull String activityInfo, int i) {
        Intrinsics.checkNotNullParameter(activityInfo, "activityInfo");
        this.activityInfo = activityInfo;
        this.type = i;
    }

    public /* synthetic */ GoodsActivity(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i);
    }
}
