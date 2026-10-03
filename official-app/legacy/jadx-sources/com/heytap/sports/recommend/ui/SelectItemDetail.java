package com.heytap.sports.recommend.ui;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/heytap/sports/recommend/ui/SelectItemDetail;", "", "index", "", "content", "", "selected", "", "orderIndex", "(ILjava/lang/String;ZI)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getIndex", "()I", "getOrderIndex", "setOrderIndex", "(I)V", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SelectItemDetail {
    public static final int $stable = 8;

    @NotNull
    private String content;
    private final int index;
    private int orderIndex;
    private boolean selected;

    public SelectItemDetail() {
        this(0, null, false, 0, 15, null);
    }

    public static /* synthetic */ SelectItemDetail copy$default(SelectItemDetail selectItemDetail, int i, String str, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = selectItemDetail.index;
        }
        if ((i3 & 2) != 0) {
            str = selectItemDetail.content;
        }
        if ((i3 & 4) != 0) {
            z = selectItemDetail.selected;
        }
        if ((i3 & 8) != 0) {
            i2 = selectItemDetail.orderIndex;
        }
        return selectItemDetail.copy(i, str, z, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOrderIndex() {
        return this.orderIndex;
    }

    @NotNull
    public final SelectItemDetail copy(int index, @NotNull String content, boolean selected, int orderIndex) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new SelectItemDetail(index, content, selected, orderIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectItemDetail)) {
            return false;
        }
        SelectItemDetail selectItemDetail = (SelectItemDetail) other;
        return this.index == selectItemDetail.index && Intrinsics.areEqual(this.content, selectItemDetail.content) && this.selected == selectItemDetail.selected && this.orderIndex == selectItemDetail.orderIndex;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getOrderIndex() {
        return this.orderIndex;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.index) * 31) + this.content.hashCode()) * 31;
        boolean z = this.selected;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + Integer.hashCode(this.orderIndex);
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setOrderIndex(int i) {
        this.orderIndex = i;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    @NotNull
    public String toString() {
        return "SelectItemDetail(index=" + this.index + ", content=" + this.content + ", selected=" + this.selected + ", orderIndex=" + this.orderIndex + ")";
    }

    public SelectItemDetail(int i, @NotNull String content, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.index = i;
        this.content = content;
        this.selected = z;
        this.orderIndex = i2;
    }

    public /* synthetic */ SelectItemDetail(int i, String str, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? 0 : i2);
    }
}
