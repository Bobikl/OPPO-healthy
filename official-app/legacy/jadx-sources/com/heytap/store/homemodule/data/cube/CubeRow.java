package com.heytap.store.homemodule.data.cube;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u0019\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/homemodule/data/cube/CubeRow;", "", "items", "Ljava/util/ArrayList;", "Lcom/heytap/store/homemodule/data/cube/CubeItem;", "Lkotlin/collections/ArrayList;", "originalTotalWidth", "", "(Ljava/util/ArrayList;F)V", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getOriginalTotalWidth", "()F", "setOriginalTotalWidth", "(F)V", "addItem", "", "cubeItem", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class CubeRow {

    @NotNull
    private ArrayList<CubeItem> items;
    private float originalTotalWidth;

    public CubeRow(@NotNull ArrayList<CubeItem> items, float f) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.originalTotalWidth = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CubeRow copy$default(CubeRow cubeRow, ArrayList arrayList, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = cubeRow.items;
        }
        if ((i & 2) != 0) {
            f = cubeRow.originalTotalWidth;
        }
        return cubeRow.copy(arrayList, f);
    }

    public final void addItem(@NotNull CubeItem cubeItem) {
        Intrinsics.checkNotNullParameter(cubeItem, "cubeItem");
        if (this.items.size() > 0) {
            float originHeight = this.items.get(0).getOriginHeight();
            cubeItem.setOriginWidth((cubeItem.getOriginWidth() / cubeItem.getOriginHeight()) * originHeight);
            cubeItem.setOriginHeight(originHeight);
        }
        this.originalTotalWidth += cubeItem.getOriginWidth();
        this.items.add(cubeItem);
    }

    @NotNull
    public final ArrayList<CubeItem> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getOriginalTotalWidth() {
        return this.originalTotalWidth;
    }

    @NotNull
    public final CubeRow copy(@NotNull ArrayList<CubeItem> items, float originalTotalWidth) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new CubeRow(items, originalTotalWidth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CubeRow)) {
            return false;
        }
        CubeRow cubeRow = (CubeRow) other;
        return Intrinsics.areEqual(this.items, cubeRow.items) && Intrinsics.areEqual((Object) Float.valueOf(this.originalTotalWidth), (Object) Float.valueOf(cubeRow.originalTotalWidth));
    }

    @NotNull
    public final ArrayList<CubeItem> getItems() {
        return this.items;
    }

    public final float getOriginalTotalWidth() {
        return this.originalTotalWidth;
    }

    public int hashCode() {
        return (this.items.hashCode() * 31) + Float.hashCode(this.originalTotalWidth);
    }

    public final void setItems(@NotNull ArrayList<CubeItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.items = arrayList;
    }

    public final void setOriginalTotalWidth(float f) {
        this.originalTotalWidth = f;
    }

    @NotNull
    public String toString() {
        return "CubeRow(items=" + this.items + ", originalTotalWidth=" + this.originalTotalWidth + ')';
    }

    public /* synthetic */ CubeRow(ArrayList arrayList, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i & 2) != 0 ? 0.0f : f);
    }
}
