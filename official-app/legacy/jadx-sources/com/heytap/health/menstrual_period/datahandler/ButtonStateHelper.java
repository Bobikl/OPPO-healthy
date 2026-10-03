package com.heytap.health.menstrual_period.datahandler;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.menstrual.data.DateType;
import com.heytap.health.menstrual.data.PeriodCloseStatus;
import com.heytap.health.menstrual_period.R$color;
import com.heytap.health.menstrual_period.R$string;
import com.oplus.aiunit.vision.Cycle;
import com.oplus.aiunit.vision.Period;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.o05;
import com.oplus.smartenginehelper.ParserTag;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u000eB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J6\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0002J(\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/menstrual_period/datahandler/ButtonStateHelper;", "", "", "Lcom/oplus/aiunit/vision/ii4;", "cycleList", "Ljava/time/LocalDate;", "date", "Lcom/heytap/health/menstrual_period/datahandler/ButtonStateHelper$ButtonState;", "c", "curCycle", "Lcom/heytap/health/menstrual/data/DateType;", "dateType", "", "b", "a", "Lcom/heytap/health/menstrual_period/datahandler/CycleDataHandler;", "Lcom/heytap/health/menstrual_period/datahandler/CycleDataHandler;", "cycleDataHandler", "<init>", "()V", "Companion", "ButtonState", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nButtonStateHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonStateHelper.kt\ncom/heytap/health/menstrual_period/datahandler/ButtonStateHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n288#2,2:148\n2624#2,3:150\n*S KotlinDebug\n*F\n+ 1 ButtonStateHelper.kt\ncom/heytap/health/menstrual_period/datahandler/ButtonStateHelper\n*L\n102#1:148,2\n115#1:150,3\n*E\n"})
public final class ButtonStateHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CycleDataHandler cycleDataHandler = new CycleDataHandler();
    public static final int $stable = 8;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'HIGHLIGHT_START' uses external variables
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
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/menstrual_period/datahandler/ButtonStateHelper$ButtonState;", "", "btnText", "", "btnColor", ParserTag.TAG_TEXT_COLOR, "(Ljava/lang/String;IIII)V", "getBtnColor", "()I", "getBtnText", "getTextColor", "HIGHLIGHT_START", "UNHIGHLIGHT_START", "HIGHLIGHT_END", "UNHIGHLIGHT_END", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ButtonState {
        private static final /* synthetic */ ButtonState[] $VALUES;
        public static final ButtonState HIGHLIGHT_END;
        public static final ButtonState HIGHLIGHT_START;
        public static final ButtonState UNHIGHLIGHT_END;
        public static final ButtonState UNHIGHLIGHT_START;
        private final int btnColor;
        private final int btnText;
        private final int textColor;

        private static final /* synthetic */ ButtonState[] $values() {
            return new ButtonState[]{HIGHLIGHT_START, UNHIGHLIGHT_START, HIGHLIGHT_END, UNHIGHLIGHT_END};
        }

        static {
            int i = R$string.menstrual_start_record;
            int i2 = R$color.menstrual_ff688e;
            int i3 = R$color.menstrual_edit_btn_bg;
            HIGHLIGHT_START = new ButtonState("HIGHLIGHT_START", 0, i, i2, i3);
            int i4 = R$color.menstrual_8_14000000;
            int i5 = R$color.menstrual_8A_000000;
            UNHIGHLIGHT_START = new ButtonState("UNHIGHLIGHT_START", 1, i, i4, i5);
            int i6 = R$string.menstrual_stop_record;
            HIGHLIGHT_END = new ButtonState("HIGHLIGHT_END", 2, i6, i2, i3);
            UNHIGHLIGHT_END = new ButtonState("UNHIGHLIGHT_END", 3, i6, i4, i5);
            $VALUES = $values();
        }

        private ButtonState(String str, int i, int i2, int i3, int i4) {
            super(str, i);
            this.btnText = i2;
            this.btnColor = i3;
            this.textColor = i4;
        }

        public static ButtonState valueOf(String str) {
            return (ButtonState) Enum.valueOf(ButtonState.class, str);
        }

        public static ButtonState[] values() {
            return (ButtonState[]) $VALUES.clone();
        }

        public final int getBtnColor() {
            return this.btnColor;
        }

        public final int getBtnText() {
            return this.btnText;
        }

        public final int getTextColor() {
            return this.textColor;
        }
    }

    public final boolean a(LocalDate date, Cycle curCycle, List<Cycle> cycleList) {
        Object next;
        boolean z;
        int status;
        Period period;
        Iterator<T> it = curCycle.e().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            period = (Period) next;
        } while (!o05.m(date, o05.D(period.getStartDate()), o05.D(period.getEndDate())));
        Period period2 = (Period) next;
        if (period2 == null) {
            return false;
        }
        PeriodCloseStatus closeStatus = period2.getCloseStatus();
        if (closeStatus != null && ((status = closeStatus.getStatus()) == PeriodCloseStatus.MANUAL_CLOSE.getStatus() || status == PeriodCloseStatus.AUTO_CLOSE.getStatus())) {
            return false;
        }
        if (period2.getCloseStatus() == PeriodCloseStatus.PREDICT && Intrinsics.areEqual(o05.D(period2.getEndDate()), date)) {
            a7b.f("CycleButtonStateHelper", "canShowHighlightEnd predict last day");
            return true;
        }
        List<Period> listE = curCycle.e();
        if (!(listE instanceof Collection) || !listE.isEmpty()) {
            Iterator<T> it2 = listE.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                }
                if (((Period) it2.next()).getCloseStatus() == PeriodCloseStatus.PREDICT) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (!z || period2.getCloseStatus() != PeriodCloseStatus.OPENING || !Intrinsics.areEqual(o05.D(period2.getEndDate()), date)) {
            return false;
        }
        a7b.f("CycleButtonStateHelper", "canShowHighlightEnd period last day");
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    public final boolean b(LocalDate date, Cycle curCycle, List<Cycle> cycleList, List<? extends DateType> dateType) {
        boolean z;
        if (curCycle.e().isEmpty()) {
            a7b.f("CycleButtonStateHelper", "date:" + date + " no period, show highlightStart");
            return true;
        }
        if (curCycle.e().size() == 1 && ((Period) CollectionsKt___CollectionsKt.first((List) curCycle.e())).getCloseStatus() == PeriodCloseStatus.PREDICT) {
            a7b.f("CycleButtonStateHelper", "predict cycle, all highlight");
            return true;
        }
        long endDate = curCycle.getEndDate();
        CycleDataHandler cycleDataHandler = this.cycleDataHandler;
        LocalDate localDateV = o05.v(curCycle.getEndDate(), 1);
        Intrinsics.checkNotNullExpressionValue(localDateV, "curCycle.endDate.plusDays(1)");
        List<DateType> listP = cycleDataHandler.p(localDateV, cycleList);
        DateType dateType2 = DateType.PREDICT_PERIOD;
        if (dateType.contains(dateType2)) {
            z = true;
        } else {
            if (listP.contains(dateType2)) {
                LocalDate localDateR = o05.r(endDate, 2);
                Intrinsics.checkNotNullExpressionValue(localDateR, "cycleEndDate.minusDays(2)");
                if (o05.m(date, localDateR, o05.D(endDate))) {
                    z = true;
                }
            }
            z = false;
        }
        if (!z) {
            return false;
        }
        a7b.f("CycleButtonStateHelper", "date:" + date + " match predict, show highlightStart");
        return true;
    }

    @NotNull
    public final ButtonState c(@Nullable List<Cycle> cycleList, @Nullable LocalDate date) {
        if (date == null) {
            a7b.b("CycleButtonStateHelper", "getBtnState date == null!");
            return ButtonState.UNHIGHLIGHT_START;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getBtnState date:");
        sb.append(date);
        List<DateType> listP = this.cycleDataHandler.p(date, cycleList);
        Cycle cycleR = this.cycleDataHandler.r(cycleList, date);
        if (cycleR == null) {
            return ButtonState.HIGHLIGHT_START;
        }
        a7b.f("CycleButtonStateHelper", "getBtnState " + listP);
        if (listP.contains(DateType.PERIOD)) {
            return a(date, cycleR, cycleList) ? ButtonState.HIGHLIGHT_END : ButtonState.UNHIGHLIGHT_END;
        }
        return b(date, cycleR, cycleList, listP) ? ButtonState.HIGHLIGHT_START : ButtonState.UNHIGHLIGHT_START;
    }
}
