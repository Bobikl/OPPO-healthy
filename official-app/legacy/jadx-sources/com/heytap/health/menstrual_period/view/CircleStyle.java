package com.heytap.health.menstrual_period.view;

import com.heytap.health.menstrual_period.R$color;
import com.heytap.health.menstrual_period.R$drawable;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Period' uses external variables
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
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/menstrual_period/view/CircleStyle;", "", ParserTag.TAG_TEXT_COLOR, "", "circleBgId", "dot", "selectedColor", "(Ljava/lang/String;IIILjava/lang/Integer;I)V", "getCircleBgId", "()I", "getDot", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedColor", "getTextColor", "Period", "PredictPeriod", "PredictPeriodFuture", "Ovulation", "OvulationFuture", "OvulationDay", "OvulationDayFuture", "FollicularPhase", "FollicularPhaseFuture", "LutealPhase", "LutealPhaseFuture", "Future", "NormalDay", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CircleStyle {
    private static final /* synthetic */ CircleStyle[] $VALUES;
    public static final CircleStyle FollicularPhase;
    public static final CircleStyle FollicularPhaseFuture;
    public static final CircleStyle Future;
    public static final CircleStyle LutealPhase;
    public static final CircleStyle LutealPhaseFuture;
    public static final CircleStyle NormalDay;
    public static final CircleStyle Ovulation;
    public static final CircleStyle OvulationDay;
    public static final CircleStyle OvulationDayFuture;
    public static final CircleStyle OvulationFuture;
    public static final CircleStyle Period;
    public static final CircleStyle PredictPeriod;
    public static final CircleStyle PredictPeriodFuture;
    private final int circleBgId;

    @Nullable
    private final Integer dot;
    private final int selectedColor;
    private final int textColor;

    private static final /* synthetic */ CircleStyle[] $values() {
        return new CircleStyle[]{Period, PredictPeriod, PredictPeriodFuture, Ovulation, OvulationFuture, OvulationDay, OvulationDayFuture, FollicularPhase, FollicularPhaseFuture, LutealPhase, LutealPhaseFuture, Future, NormalDay};
    }

    static {
        int i = R$color.menstrual_circle_period_text;
        int i2 = R$drawable.ic_menstrual_period;
        int i3 = R$color.menstrual_ff688e;
        Period = new CircleStyle("Period", 0, i, i2, null, i3);
        int i4 = R$color.menstrual_000000;
        int i5 = R$drawable.ic_predict_menstrual_period_1;
        PredictPeriod = new CircleStyle("PredictPeriod", 1, i4, i5, null, i3);
        int i6 = R$color.menstrual_predict_period_text;
        PredictPeriodFuture = new CircleStyle("PredictPeriodFuture", 2, i6, i5, null, i3);
        int i7 = R$drawable.ic_ovulation_period;
        int i8 = R$color.menstrual_226BF5;
        Ovulation = new CircleStyle("Ovulation", 3, i4, i7, null, i8);
        OvulationFuture = new CircleStyle("OvulationFuture", 4, i6, i7, null, i8);
        OvulationDay = new CircleStyle("OvulationDay", 5, i, R$drawable.ic_ovulation_period_day, null, i8);
        OvulationDayFuture = new CircleStyle("OvulationDayFuture", 6, i6, R$drawable.ic_ovulation_day_future, null, i8);
        int i9 = R$color.menstrual_black;
        int i10 = R$drawable.ic_follicular_phase;
        FollicularPhase = new CircleStyle("FollicularPhase", 7, i9, i10, null, R$color.menstrual_follicular_phase_indicator_border);
        int i11 = R$color.menstrual_42000000;
        FollicularPhaseFuture = new CircleStyle("FollicularPhaseFuture", 8, i11, i10, null, R$color.menstrual_follicular_phase_bg);
        int i12 = R$drawable.ic_luteal_phase;
        LutealPhase = new CircleStyle("LutealPhase", 9, i9, i12, null, R$color.menstrual_luteal_phase_indicator_border);
        LutealPhaseFuture = new CircleStyle("LutealPhaseFuture", 10, i11, i12, null, R$color.menstrual_luteal_phase_bg);
        int i13 = R$drawable.month_future_day_bg;
        int i14 = R$color.menstrual_90_E6000000;
        Future = new CircleStyle("Future", 11, i6, i13, null, i14);
        NormalDay = new CircleStyle("NormalDay", 12, i14, R$drawable.month_normal_day_bg, null, i14);
        $VALUES = $values();
    }

    private CircleStyle(String str, int i, int i2, int i3, Integer num, int i4) {
        super(str, i);
        this.textColor = i2;
        this.circleBgId = i3;
        this.dot = num;
        this.selectedColor = i4;
    }

    public static CircleStyle valueOf(String str) {
        return (CircleStyle) Enum.valueOf(CircleStyle.class, str);
    }

    public static CircleStyle[] values() {
        return (CircleStyle[]) $VALUES.clone();
    }

    public final int getCircleBgId() {
        return this.circleBgId;
    }

    @Nullable
    public final Integer getDot() {
        return this.dot;
    }

    public final int getSelectedColor() {
        return this.selectedColor;
    }

    public final int getTextColor() {
        return this.textColor;
    }
}
