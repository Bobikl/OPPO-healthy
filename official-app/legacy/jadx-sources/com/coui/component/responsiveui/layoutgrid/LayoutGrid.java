package com.coui.component.responsiveui.layoutgrid;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt__ArraysJVMKt;
import p010kotlin.collections.ArraysKt__ArraysKt;
import p010kotlin.collections.ArraysKt___ArraysJvmKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b!\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b*\u0010+J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\"\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/coui/component/responsiveui/layoutgrid/LayoutGrid;", "", "other", "", "equals", "", "hashCode", "", "toString", "component1", "", "", "component2", "()[[I", "component3", "component4", "columnCount", "columnsWidth", "gutter", "margin", "copy", "(I[[II[I)Lcom/coui/component/responsiveui/layoutgrid/LayoutGrid;", "a", "I", "getColumnCount", "()I", "setColumnCount", "(I)V", "b", "[[I", "getColumnsWidth", "setColumnsWidth", "([[I)V", "c", "getGutter", "setGutter", "d", "[I", "getMargin", "()[I", "setMargin", "([I)V", "<init>", "(I[[II[I)V", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutGridSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutGridSystem.kt\ncom/coui/component/responsiveui/layoutgrid/LayoutGrid\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,219:1\n13579#2,2:220\n*S KotlinDebug\n*F\n+ 1 LayoutGridSystem.kt\ncom/coui/component/responsiveui/layoutgrid/LayoutGrid\n*L\n201#1:220,2\n*E\n"})
final /* data */ class LayoutGrid {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int columnCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public int[][] columnsWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int gutter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public int[] margin;

    public LayoutGrid(int i, @NotNull int[][] columnsWidth, int i2, @NotNull int[] margin) {
        Intrinsics.checkNotNullParameter(columnsWidth, "columnsWidth");
        Intrinsics.checkNotNullParameter(margin, "margin");
        this.columnCount = i;
        this.columnsWidth = columnsWidth;
        this.gutter = i2;
        this.margin = margin;
    }

    public static /* synthetic */ LayoutGrid copy$default(LayoutGrid layoutGrid, int i, int[][] iArr, int i2, int[] iArr2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = layoutGrid.columnCount;
        }
        if ((i3 & 2) != 0) {
            iArr = layoutGrid.columnsWidth;
        }
        if ((i3 & 4) != 0) {
            i2 = layoutGrid.gutter;
        }
        if ((i3 & 8) != 0) {
            iArr2 = layoutGrid.margin;
        }
        return layoutGrid.copy(i, iArr, i2, iArr2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getColumnCount() {
        return this.columnCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int[][] getColumnsWidth() {
        return this.columnsWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getGutter() {
        return this.gutter;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int[] getMargin() {
        return this.margin;
    }

    @NotNull
    public final LayoutGrid copy(int columnCount, @NotNull int[][] columnsWidth, int gutter, @NotNull int[] margin) {
        Intrinsics.checkNotNullParameter(columnsWidth, "columnsWidth");
        Intrinsics.checkNotNullParameter(margin, "margin");
        return new LayoutGrid(columnCount, columnsWidth, gutter, margin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(LayoutGrid.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.coui.component.responsiveui.layoutgrid.LayoutGrid");
        LayoutGrid layoutGrid = (LayoutGrid) other;
        return this.columnCount == layoutGrid.columnCount && ArraysKt__ArraysKt.contentDeepEquals(this.columnsWidth, layoutGrid.columnsWidth) && this.gutter == layoutGrid.gutter && Arrays.equals(this.margin, layoutGrid.margin);
    }

    public final int getColumnCount() {
        return this.columnCount;
    }

    @NotNull
    public final int[][] getColumnsWidth() {
        return this.columnsWidth;
    }

    public final int getGutter() {
        return this.gutter;
    }

    @NotNull
    public final int[] getMargin() {
        return this.margin;
    }

    public int hashCode() {
        return (((((this.columnCount * 31) + ArraysKt__ArraysJVMKt.contentDeepHashCode(this.columnsWidth)) * 31) + this.gutter) * 31) + Arrays.hashCode(this.margin);
    }

    public final void setColumnCount(int i) {
        this.columnCount = i;
    }

    public final void setColumnsWidth(@NotNull int[][] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.columnsWidth = iArr;
    }

    public final void setGutter(int i) {
        this.gutter = i;
    }

    public final void setMargin(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.margin = iArr;
    }

    @NotNull
    public String toString() {
        StringBuffer value = new StringBuffer("[LayoutGrid] columnCount = " + this.columnCount + ", ");
        value.append("gutter = " + this.gutter + ", ");
        value.append("margins = " + ArraysKt___ArraysJvmKt.asList(this.margin) + ", ");
        value.append("columnWidth = [");
        for (int[] iArr : this.columnsWidth) {
            value.append(ArraysKt___ArraysJvmKt.asList(iArr).toString());
            value.append(", ");
        }
        Intrinsics.checkNotNullExpressionValue(value, "value");
        value.delete(StringsKt__StringsKt.getLastIndex(value) - 1, StringsKt__StringsKt.getLastIndex(value) + 1);
        value.append("]");
        String string = value.toString();
        Intrinsics.checkNotNullExpressionValue(string, "value.toString()");
        return string;
    }
}
