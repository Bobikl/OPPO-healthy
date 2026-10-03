package com.heytap.store.homemodule.data;

import android.graphics.Point;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/homemodule/data/ItemConfig;", "", "itemSize", "Landroid/graphics/Point;", "showTitle", "", "showReason", "showPrice", "(Landroid/graphics/Point;ZZZ)V", "getItemSize", "()Landroid/graphics/Point;", "getShowPrice", "()Z", "setShowPrice", "(Z)V", "getShowReason", "setShowReason", "getShowTitle", "setShowTitle", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ItemConfig {

    @Nullable
    private final Point itemSize;
    private boolean showPrice;
    private boolean showReason;
    private boolean showTitle;

    public ItemConfig(@Nullable Point point, boolean z, boolean z2, boolean z3) {
        this.itemSize = point;
        this.showTitle = z;
        this.showReason = z2;
        this.showPrice = z3;
    }

    public static /* synthetic */ ItemConfig copy$default(ItemConfig itemConfig, Point point, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            point = itemConfig.itemSize;
        }
        if ((i & 2) != 0) {
            z = itemConfig.showTitle;
        }
        if ((i & 4) != 0) {
            z2 = itemConfig.showReason;
        }
        if ((i & 8) != 0) {
            z3 = itemConfig.showPrice;
        }
        return itemConfig.copy(point, z, z2, z3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Point getItemSize() {
        return this.itemSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowTitle() {
        return this.showTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowReason() {
        return this.showReason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowPrice() {
        return this.showPrice;
    }

    @NotNull
    public final ItemConfig copy(@Nullable Point itemSize, boolean showTitle, boolean showReason, boolean showPrice) {
        return new ItemConfig(itemSize, showTitle, showReason, showPrice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemConfig)) {
            return false;
        }
        ItemConfig itemConfig = (ItemConfig) other;
        return Intrinsics.areEqual(this.itemSize, itemConfig.itemSize) && this.showTitle == itemConfig.showTitle && this.showReason == itemConfig.showReason && this.showPrice == itemConfig.showPrice;
    }

    @Nullable
    public final Point getItemSize() {
        return this.itemSize;
    }

    public final boolean getShowPrice() {
        return this.showPrice;
    }

    public final boolean getShowReason() {
        return this.showReason;
    }

    public final boolean getShowTitle() {
        return this.showTitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        Point point = this.itemSize;
        int iHashCode = (point == null ? 0 : point.hashCode()) * 31;
        boolean z = this.showTitle;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.showReason;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.showPrice;
        return i2 + (z3 ? 1 : z3);
    }

    public final void setShowPrice(boolean z) {
        this.showPrice = z;
    }

    public final void setShowReason(boolean z) {
        this.showReason = z;
    }

    public final void setShowTitle(boolean z) {
        this.showTitle = z;
    }

    @NotNull
    public String toString() {
        return "ItemConfig(itemSize=" + this.itemSize + ", showTitle=" + this.showTitle + ", showReason=" + this.showReason + ", showPrice=" + this.showPrice + ')';
    }

    public /* synthetic */ ItemConfig(Point point, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(point, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }
}
