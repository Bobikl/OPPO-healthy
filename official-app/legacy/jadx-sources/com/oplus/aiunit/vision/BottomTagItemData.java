package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.n22, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0016\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/n22;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "index", "Landroidx/compose/ui/graphics/Color;", "J", "()J", "iconColor", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "text", "d", "type", "<init>", "(IJLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BottomTagItemData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long iconColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int type;

    public /* synthetic */ BottomTagItemData(int i, long j2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j2, str, i2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomTagItemData)) {
            return false;
        }
        BottomTagItemData bottomTagItemData = (BottomTagItemData) other;
        return this.index == bottomTagItemData.index && Color.m1619equalsimpl0(this.iconColor, bottomTagItemData.iconColor) && Intrinsics.areEqual(this.text, bottomTagItemData.text) && this.type == bottomTagItemData.type;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.index) * 31) + Color.m1625hashCodeimpl(this.iconColor)) * 31) + this.text.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    @NotNull
    public String toString() {
        return "BottomTagItemData(index=" + this.index + ", iconColor=" + Color.m1626toStringimpl(this.iconColor) + ", text=" + this.text + ", type=" + this.type + ")";
    }

    public BottomTagItemData(int i, long j2, String str, int i2) {
        this.index = i;
        this.iconColor = j2;
        this.text = str;
        this.type = i2;
    }
}
