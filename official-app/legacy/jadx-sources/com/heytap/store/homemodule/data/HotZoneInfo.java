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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\""}, d2 = {"Lcom/heytap/store/homemodule/data/HotZoneInfo;", "", "hotZoneSubscribe", "", "Lcom/heytap/store/homemodule/data/HotZoneSubscribeEntity;", "hotZoneLink", "Lcom/heytap/store/homemodule/data/HotZoneLinkEntity;", "hotZoneGif", "Lcom/heytap/store/homemodule/data/HotZoneGifEntity;", "hotZoneRecommendGoods", "Lcom/heytap/store/homemodule/data/HotZoneRecommendGoodsEntity;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getHotZoneGif", "()Ljava/util/List;", "setHotZoneGif", "(Ljava/util/List;)V", "getHotZoneLink", "setHotZoneLink", "getHotZoneRecommendGoods", "setHotZoneRecommendGoods", "getHotZoneSubscribe", "setHotZoneSubscribe", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HotZoneInfo {

    @Nullable
    private List<HotZoneGifEntity> hotZoneGif;

    @Nullable
    private List<HotZoneLinkEntity> hotZoneLink;

    @Nullable
    private List<HotZoneRecommendGoodsEntity> hotZoneRecommendGoods;

    @Nullable
    private List<HotZoneSubscribeEntity> hotZoneSubscribe;

    public HotZoneInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotZoneInfo copy$default(HotZoneInfo hotZoneInfo, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hotZoneInfo.hotZoneSubscribe;
        }
        if ((i & 2) != 0) {
            list2 = hotZoneInfo.hotZoneLink;
        }
        if ((i & 4) != 0) {
            list3 = hotZoneInfo.hotZoneGif;
        }
        if ((i & 8) != 0) {
            list4 = hotZoneInfo.hotZoneRecommendGoods;
        }
        return hotZoneInfo.copy(list, list2, list3, list4);
    }

    @Nullable
    public final List<HotZoneSubscribeEntity> component1() {
        return this.hotZoneSubscribe;
    }

    @Nullable
    public final List<HotZoneLinkEntity> component2() {
        return this.hotZoneLink;
    }

    @Nullable
    public final List<HotZoneGifEntity> component3() {
        return this.hotZoneGif;
    }

    @Nullable
    public final List<HotZoneRecommendGoodsEntity> component4() {
        return this.hotZoneRecommendGoods;
    }

    @NotNull
    public final HotZoneInfo copy(@Nullable List<HotZoneSubscribeEntity> hotZoneSubscribe, @Nullable List<HotZoneLinkEntity> hotZoneLink, @Nullable List<HotZoneGifEntity> hotZoneGif, @Nullable List<HotZoneRecommendGoodsEntity> hotZoneRecommendGoods) {
        return new HotZoneInfo(hotZoneSubscribe, hotZoneLink, hotZoneGif, hotZoneRecommendGoods);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotZoneInfo)) {
            return false;
        }
        HotZoneInfo hotZoneInfo = (HotZoneInfo) other;
        return Intrinsics.areEqual(this.hotZoneSubscribe, hotZoneInfo.hotZoneSubscribe) && Intrinsics.areEqual(this.hotZoneLink, hotZoneInfo.hotZoneLink) && Intrinsics.areEqual(this.hotZoneGif, hotZoneInfo.hotZoneGif) && Intrinsics.areEqual(this.hotZoneRecommendGoods, hotZoneInfo.hotZoneRecommendGoods);
    }

    @Nullable
    public final List<HotZoneGifEntity> getHotZoneGif() {
        return this.hotZoneGif;
    }

    @Nullable
    public final List<HotZoneLinkEntity> getHotZoneLink() {
        return this.hotZoneLink;
    }

    @Nullable
    public final List<HotZoneRecommendGoodsEntity> getHotZoneRecommendGoods() {
        return this.hotZoneRecommendGoods;
    }

    @Nullable
    public final List<HotZoneSubscribeEntity> getHotZoneSubscribe() {
        return this.hotZoneSubscribe;
    }

    public int hashCode() {
        List<HotZoneSubscribeEntity> list = this.hotZoneSubscribe;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<HotZoneLinkEntity> list2 = this.hotZoneLink;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<HotZoneGifEntity> list3 = this.hotZoneGif;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<HotZoneRecommendGoodsEntity> list4 = this.hotZoneRecommendGoods;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final void setHotZoneGif(@Nullable List<HotZoneGifEntity> list) {
        this.hotZoneGif = list;
    }

    public final void setHotZoneLink(@Nullable List<HotZoneLinkEntity> list) {
        this.hotZoneLink = list;
    }

    public final void setHotZoneRecommendGoods(@Nullable List<HotZoneRecommendGoodsEntity> list) {
        this.hotZoneRecommendGoods = list;
    }

    public final void setHotZoneSubscribe(@Nullable List<HotZoneSubscribeEntity> list) {
        this.hotZoneSubscribe = list;
    }

    @NotNull
    public String toString() {
        return "HotZoneInfo(hotZoneSubscribe=" + this.hotZoneSubscribe + ", hotZoneLink=" + this.hotZoneLink + ", hotZoneGif=" + this.hotZoneGif + ", hotZoneRecommendGoods=" + this.hotZoneRecommendGoods + ')';
    }

    public HotZoneInfo(@Nullable List<HotZoneSubscribeEntity> list, @Nullable List<HotZoneLinkEntity> list2, @Nullable List<HotZoneGifEntity> list3, @Nullable List<HotZoneRecommendGoodsEntity> list4) {
        this.hotZoneSubscribe = list;
        this.hotZoneLink = list2;
        this.hotZoneGif = list3;
        this.hotZoneRecommendGoods = list4;
    }

    public /* synthetic */ HotZoneInfo(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
