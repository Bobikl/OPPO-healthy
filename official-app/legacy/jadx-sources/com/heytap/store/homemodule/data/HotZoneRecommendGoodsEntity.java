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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J9\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006!"}, d2 = {"Lcom/heytap/store/homemodule/data/HotZoneRecommendGoodsEntity;", "", "picLink", "", "", "xPercent", "", "yPercent", "wPercent", "(Ljava/util/List;FFF)V", "getPicLink", "()Ljava/util/List;", "setPicLink", "(Ljava/util/List;)V", "getWPercent", "()F", "setWPercent", "(F)V", "getXPercent", "setXPercent", "getYPercent", "setYPercent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HotZoneRecommendGoodsEntity {

    @Nullable
    private List<String> picLink;
    private float wPercent;
    private float xPercent;
    private float yPercent;

    public HotZoneRecommendGoodsEntity(@Nullable List<String> list, float f, float f2, float f3) {
        this.picLink = list;
        this.xPercent = f;
        this.yPercent = f2;
        this.wPercent = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotZoneRecommendGoodsEntity copy$default(HotZoneRecommendGoodsEntity hotZoneRecommendGoodsEntity, List list, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hotZoneRecommendGoodsEntity.picLink;
        }
        if ((i & 2) != 0) {
            f = hotZoneRecommendGoodsEntity.xPercent;
        }
        if ((i & 4) != 0) {
            f2 = hotZoneRecommendGoodsEntity.yPercent;
        }
        if ((i & 8) != 0) {
            f3 = hotZoneRecommendGoodsEntity.wPercent;
        }
        return hotZoneRecommendGoodsEntity.copy(list, f, f2, f3);
    }

    @Nullable
    public final List<String> component1() {
        return this.picLink;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getXPercent() {
        return this.xPercent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getYPercent() {
        return this.yPercent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getWPercent() {
        return this.wPercent;
    }

    @NotNull
    public final HotZoneRecommendGoodsEntity copy(@Nullable List<String> picLink, float xPercent, float yPercent, float wPercent) {
        return new HotZoneRecommendGoodsEntity(picLink, xPercent, yPercent, wPercent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotZoneRecommendGoodsEntity)) {
            return false;
        }
        HotZoneRecommendGoodsEntity hotZoneRecommendGoodsEntity = (HotZoneRecommendGoodsEntity) other;
        return Intrinsics.areEqual(this.picLink, hotZoneRecommendGoodsEntity.picLink) && Intrinsics.areEqual((Object) Float.valueOf(this.xPercent), (Object) Float.valueOf(hotZoneRecommendGoodsEntity.xPercent)) && Intrinsics.areEqual((Object) Float.valueOf(this.yPercent), (Object) Float.valueOf(hotZoneRecommendGoodsEntity.yPercent)) && Intrinsics.areEqual((Object) Float.valueOf(this.wPercent), (Object) Float.valueOf(hotZoneRecommendGoodsEntity.wPercent));
    }

    @Nullable
    public final List<String> getPicLink() {
        return this.picLink;
    }

    public final float getWPercent() {
        return this.wPercent;
    }

    public final float getXPercent() {
        return this.xPercent;
    }

    public final float getYPercent() {
        return this.yPercent;
    }

    public int hashCode() {
        List<String> list = this.picLink;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + Float.hashCode(this.xPercent)) * 31) + Float.hashCode(this.yPercent)) * 31) + Float.hashCode(this.wPercent);
    }

    public final void setPicLink(@Nullable List<String> list) {
        this.picLink = list;
    }

    public final void setWPercent(float f) {
        this.wPercent = f;
    }

    public final void setXPercent(float f) {
        this.xPercent = f;
    }

    public final void setYPercent(float f) {
        this.yPercent = f;
    }

    @NotNull
    public String toString() {
        return "HotZoneRecommendGoodsEntity(picLink=" + this.picLink + ", xPercent=" + this.xPercent + ", yPercent=" + this.yPercent + ", wPercent=" + this.wPercent + ')';
    }

    public /* synthetic */ HotZoneRecommendGoodsEntity(List list, float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3);
    }
}
