package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.qge, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\r\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR \u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR \u0010\u0012\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0011\u0010\fR \u0010\u0014\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u000e\u0010\fR \u0010\u0015\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0013\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/qge;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroidx/compose/ui/graphics/Color;", "a", "J", "()J", "cardBg", "b", "c", "primaryText", MapSchema.FIELD_NAME_ENTRY, "secondaryText", "d", "divider", "recordNumberColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PersonalCenterColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long cardBg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long primaryText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long secondaryText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long divider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long recordNumberColor;

    public /* synthetic */ PersonalCenterColors(long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCardBg() {
        return this.cardBg;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDivider() {
        return this.divider;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPrimaryText() {
        return this.primaryText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getRecordNumberColor() {
        return this.recordNumberColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getSecondaryText() {
        return this.secondaryText;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalCenterColors)) {
            return false;
        }
        PersonalCenterColors personalCenterColors = (PersonalCenterColors) other;
        return Color.m1619equalsimpl0(this.cardBg, personalCenterColors.cardBg) && Color.m1619equalsimpl0(this.primaryText, personalCenterColors.primaryText) && Color.m1619equalsimpl0(this.secondaryText, personalCenterColors.secondaryText) && Color.m1619equalsimpl0(this.divider, personalCenterColors.divider) && Color.m1619equalsimpl0(this.recordNumberColor, personalCenterColors.recordNumberColor);
    }

    public int hashCode() {
        return (((((((Color.m1625hashCodeimpl(this.cardBg) * 31) + Color.m1625hashCodeimpl(this.primaryText)) * 31) + Color.m1625hashCodeimpl(this.secondaryText)) * 31) + Color.m1625hashCodeimpl(this.divider)) * 31) + Color.m1625hashCodeimpl(this.recordNumberColor);
    }

    @NotNull
    public String toString() {
        return "PersonalCenterColors(cardBg=" + Color.m1626toStringimpl(this.cardBg) + ", primaryText=" + Color.m1626toStringimpl(this.primaryText) + ", secondaryText=" + Color.m1626toStringimpl(this.secondaryText) + ", divider=" + Color.m1626toStringimpl(this.divider) + ", recordNumberColor=" + Color.m1626toStringimpl(this.recordNumberColor) + ")";
    }

    public PersonalCenterColors(long j2, long j3, long j4, long j5, long j6) {
        this.cardBg = j2;
        this.primaryText = j3;
        this.secondaryText = j4;
        this.divider = j5;
        this.recordNumberColor = j6;
    }
}
