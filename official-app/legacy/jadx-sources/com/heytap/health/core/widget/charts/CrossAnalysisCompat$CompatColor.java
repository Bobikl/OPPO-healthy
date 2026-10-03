package com.heytap.health.core.widget.charts;

import com.heytap.databaseengine.apiv2.health.HeytapHealthParams;
import com.heytap.health.lib_chart.R$color;
import p010kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SLEEP' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/heytap/health/core/widget/charts/CrossAnalysisCompat$CompatColor", "", "Lcom/heytap/health/core/widget/charts/CrossAnalysisCompat$CompatColor;", "", "barNormal", "I", "getBarNormal", "()I", "barHighlight", "getBarHighlight", "circleNormal", "getCircleNormal", "circleHighlight", "getCircleHighlight", "limitNormal", "getLimitNormal", "limitHighlight", "getLimitHighlight", "lineColor", "getLineColor", "<init>", "(Ljava/lang/String;IIIIIIII)V", HeytapHealthParams.SLEEP, "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class CrossAnalysisCompat$CompatColor {
    private static final /* synthetic */ CrossAnalysisCompat$CompatColor[] $VALUES;
    public static final CrossAnalysisCompat$CompatColor SLEEP;
    private final int barHighlight;
    private final int barNormal;
    private final int circleHighlight;
    private final int circleNormal;
    private final int limitHighlight;
    private final int limitNormal;
    private final int lineColor;

    private static final /* synthetic */ CrossAnalysisCompat$CompatColor[] $values() {
        return new CrossAnalysisCompat$CompatColor[]{SLEEP};
    }

    static {
        int i = R$color.lib_chart_ecg_axis_middle_line;
        int i2 = R$color.lib_chart_d6d2ff;
        int i3 = R$color.lib_chart_B3B3B3;
        int i4 = R$color.lib_chart_7366FF;
        SLEEP = new CrossAnalysisCompat$CompatColor(HeytapHealthParams.SLEEP, 0, i, i2, i3, i4, i4, i4, R$color.lib_chart_66A75FFF);
        $VALUES = $values();
    }

    private CrossAnalysisCompat$CompatColor(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(str, i);
        this.barNormal = i2;
        this.barHighlight = i3;
        this.circleNormal = i4;
        this.circleHighlight = i5;
        this.limitNormal = i6;
        this.limitHighlight = i7;
        this.lineColor = i8;
    }

    public static CrossAnalysisCompat$CompatColor valueOf(String str) {
        return (CrossAnalysisCompat$CompatColor) Enum.valueOf(CrossAnalysisCompat$CompatColor.class, str);
    }

    public static CrossAnalysisCompat$CompatColor[] values() {
        return (CrossAnalysisCompat$CompatColor[]) $VALUES.clone();
    }

    public final int getBarHighlight() {
        return this.barHighlight;
    }

    public final int getBarNormal() {
        return this.barNormal;
    }

    public final int getCircleHighlight() {
        return this.circleHighlight;
    }

    public final int getCircleNormal() {
        return this.circleNormal;
    }

    public final int getLimitHighlight() {
        return this.limitHighlight;
    }

    public final int getLimitNormal() {
        return this.limitNormal;
    }

    public final int getLineColor() {
        return this.lineColor;
    }
}
