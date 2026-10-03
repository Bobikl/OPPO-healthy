package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.TextUnit;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.e2e, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BZ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0001¢\u0006\u0004\b)\u0010*Jz\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR \u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R \u0010\t\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b!\u0010 R \u0010\n\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR \u0010\f\u001a\u00020\u00058\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b$\u0010 R \u0010\r\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b%\u0010(\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006+"}, d2 = {"Lcom/oplus/aiunit/vision/e2e;", "", "", "barNum", "barText", "Landroidx/compose/ui/unit/TextUnit;", "barTextSize", "Landroidx/compose/ui/graphics/Color;", "barTextColor", "barColor", "barBackground", "value", "valueTextSize", "valueTextColor", "", ParserTag.TAG_PERCENT, "a", "(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/String;JJF)Lcom/oplus/aiunit/vision/e2e;", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "b", "f", "c", "J", b2n.g, "()J", "d", b2n.f, "j", LogFieldKey.LEVEL_KEY, "i", MapSchema.FIELD_NAME_KEY, UserInfo.SEX_FEMALE, "()F", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/String;JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PaceKmBarData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String barNum;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String barText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long barTextSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long barTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long barColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final long barBackground;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final long valueTextSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public final long valueTextColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public final float percent;

    public /* synthetic */ PaceKmBarData(String str, String str2, long j2, long j3, long j4, long j5, String str3, long j6, long j7, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, j3, j4, j5, str3, j6, j7, f);
    }

    @NotNull
    public final PaceKmBarData a(@NotNull String barNum, @NotNull String barText, long barTextSize, long barTextColor, long barColor, long barBackground, @NotNull String value, long valueTextSize, long valueTextColor, float percent) {
        Intrinsics.checkNotNullParameter(barNum, "barNum");
        Intrinsics.checkNotNullParameter(barText, "barText");
        Intrinsics.checkNotNullParameter(value, "value");
        return new PaceKmBarData(barNum, barText, barTextSize, barTextColor, barColor, barBackground, value, valueTextSize, valueTextColor, percent, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getBarBackground() {
        return this.barBackground;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getBarColor() {
        return this.barColor;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBarNum() {
        return this.barNum;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaceKmBarData)) {
            return false;
        }
        PaceKmBarData paceKmBarData = (PaceKmBarData) other;
        return Intrinsics.areEqual(this.barNum, paceKmBarData.barNum) && Intrinsics.areEqual(this.barText, paceKmBarData.barText) && TextUnit.m4282equalsimpl0(this.barTextSize, paceKmBarData.barTextSize) && Color.m1619equalsimpl0(this.barTextColor, paceKmBarData.barTextColor) && Color.m1619equalsimpl0(this.barColor, paceKmBarData.barColor) && Color.m1619equalsimpl0(this.barBackground, paceKmBarData.barBackground) && Intrinsics.areEqual(this.value, paceKmBarData.value) && TextUnit.m4282equalsimpl0(this.valueTextSize, paceKmBarData.valueTextSize) && Color.m1619equalsimpl0(this.valueTextColor, paceKmBarData.valueTextColor) && Float.compare(this.percent, paceKmBarData.percent) == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBarText() {
        return this.barText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getBarTextColor() {
        return this.barTextColor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getBarTextSize() {
        return this.barTextSize;
    }

    public int hashCode() {
        return (((((((((((((((((this.barNum.hashCode() * 31) + this.barText.hashCode()) * 31) + TextUnit.m4286hashCodeimpl(this.barTextSize)) * 31) + Color.m1625hashCodeimpl(this.barTextColor)) * 31) + Color.m1625hashCodeimpl(this.barColor)) * 31) + Color.m1625hashCodeimpl(this.barBackground)) * 31) + this.value.hashCode()) * 31) + TextUnit.m4286hashCodeimpl(this.valueTextSize)) * 31) + Color.m1625hashCodeimpl(this.valueTextColor)) * 31) + Float.hashCode(this.percent);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getPercent() {
        return this.percent;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getValueTextColor() {
        return this.valueTextColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getValueTextSize() {
        return this.valueTextSize;
    }

    @NotNull
    public String toString() {
        return "PaceKmBarData(barNum=" + this.barNum + ", barText=" + this.barText + ", barTextSize=" + TextUnit.m4292toStringimpl(this.barTextSize) + ", barTextColor=" + Color.m1626toStringimpl(this.barTextColor) + ", barColor=" + Color.m1626toStringimpl(this.barColor) + ", barBackground=" + Color.m1626toStringimpl(this.barBackground) + ", value=" + this.value + ", valueTextSize=" + TextUnit.m4292toStringimpl(this.valueTextSize) + ", valueTextColor=" + Color.m1626toStringimpl(this.valueTextColor) + ", percent=" + this.percent + ")";
    }

    public PaceKmBarData(String str, String str2, long j2, long j3, long j4, long j5, String str3, long j6, long j7, float f) {
        this.barNum = str;
        this.barText = str2;
        this.barTextSize = j2;
        this.barTextColor = j3;
        this.barColor = j4;
        this.barBackground = j5;
        this.value = str3;
        this.valueTextSize = j6;
        this.valueTextColor = j7;
        this.percent = f;
    }
}
