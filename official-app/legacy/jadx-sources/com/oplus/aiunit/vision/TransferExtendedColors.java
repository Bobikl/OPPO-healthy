package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.q9k, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR \u0010\u0011\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR \u0010\u0013\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0012\u0010\rR \u0010\u0015\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0014\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/q9k;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/ui/graphics/Color;", "a", "J", "c", "()J", "secondaryText", "b", "buttonBlue", "blueHalftone", "d", "tagBg", MapSchema.FIELD_NAME_ENTRY, "tagText", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TransferExtendedColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long secondaryText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long buttonBlue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long blueHalftone;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long tagBg;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long tagText;

    public /* synthetic */ TransferExtendedColors(long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBlueHalftone() {
        return this.blueHalftone;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getButtonBlue() {
        return this.buttonBlue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getSecondaryText() {
        return this.secondaryText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTagBg() {
        return this.tagBg;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getTagText() {
        return this.tagText;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferExtendedColors)) {
            return false;
        }
        TransferExtendedColors transferExtendedColors = (TransferExtendedColors) other;
        return Color.m1619equalsimpl0(this.secondaryText, transferExtendedColors.secondaryText) && Color.m1619equalsimpl0(this.buttonBlue, transferExtendedColors.buttonBlue) && Color.m1619equalsimpl0(this.blueHalftone, transferExtendedColors.blueHalftone) && Color.m1619equalsimpl0(this.tagBg, transferExtendedColors.tagBg) && Color.m1619equalsimpl0(this.tagText, transferExtendedColors.tagText);
    }

    public int hashCode() {
        return (((((((Color.m1625hashCodeimpl(this.secondaryText) * 31) + Color.m1625hashCodeimpl(this.buttonBlue)) * 31) + Color.m1625hashCodeimpl(this.blueHalftone)) * 31) + Color.m1625hashCodeimpl(this.tagBg)) * 31) + Color.m1625hashCodeimpl(this.tagText);
    }

    @NotNull
    public String toString() {
        return "TransferExtendedColors(secondaryText=" + Color.m1626toStringimpl(this.secondaryText) + ", buttonBlue=" + Color.m1626toStringimpl(this.buttonBlue) + ", blueHalftone=" + Color.m1626toStringimpl(this.blueHalftone) + ", tagBg=" + Color.m1626toStringimpl(this.tagBg) + ", tagText=" + Color.m1626toStringimpl(this.tagText) + ")";
    }

    public TransferExtendedColors(long j2, long j3, long j4, long j5, long j6) {
        this.secondaryText = j2;
        this.buttonBlue = j3;
        this.blueHalftone = j4;
        this.tagBg = j5;
        this.tagText = j6;
    }
}
