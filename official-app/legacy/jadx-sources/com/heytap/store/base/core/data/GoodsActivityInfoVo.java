package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/base/core/data/GoodsActivityInfoVo;", "", "type", "", "activityInfo", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getActivityInfo", "()Ljava/lang/String;", "setActivityInfo", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/heytap/store/base/core/data/GoodsActivityInfoVo;", "equals", "", "other", "hashCode", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class GoodsActivityInfoVo {

    @Nullable
    private String activityInfo;

    @Nullable
    private Integer type;

    public GoodsActivityInfoVo(@Nullable Integer num, @Nullable String str) {
        this.type = num;
        this.activityInfo = str;
    }

    public static /* synthetic */ GoodsActivityInfoVo copy$default(GoodsActivityInfoVo goodsActivityInfoVo, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = goodsActivityInfoVo.type;
        }
        if ((i & 2) != 0) {
            str = goodsActivityInfoVo.activityInfo;
        }
        return goodsActivityInfoVo.copy(num, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivityInfo() {
        return this.activityInfo;
    }

    @NotNull
    public final GoodsActivityInfoVo copy(@Nullable Integer type, @Nullable String activityInfo) {
        return new GoodsActivityInfoVo(type, activityInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoodsActivityInfoVo)) {
            return false;
        }
        GoodsActivityInfoVo goodsActivityInfoVo = (GoodsActivityInfoVo) other;
        return Intrinsics.areEqual(this.type, goodsActivityInfoVo.type) && Intrinsics.areEqual(this.activityInfo, goodsActivityInfoVo.activityInfo);
    }

    @Nullable
    public final String getActivityInfo() {
        return this.activityInfo;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.activityInfo;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setActivityInfo(@Nullable String str) {
        this.activityInfo = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        return "GoodsActivityInfoVo(type=" + this.type + ", activityInfo=" + ((Object) this.activityInfo) + ')';
    }
}
