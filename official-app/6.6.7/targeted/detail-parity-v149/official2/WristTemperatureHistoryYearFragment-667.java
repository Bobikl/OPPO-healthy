package com.heytap.health.wrist_temperature.ui;

import android.view.View;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.databaseengine.model.wristtemperature.WristTemperatureStat;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.wrist_temperature.R$string;
import com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryYearFragment;
import com.heytap.health.wrist_temperature.util.ChartType;
import com.heytap.health.wrist_temperature.view.WristHistoryChartTouchListener;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m6m;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.xp0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0014J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0014J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0010J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\nH\u0016R\u001e\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryYearFragment;", "Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryBaseFragment;", "Landroid/view/View;", "view", "", "initView", "", "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "dataList", acl.KEY_C2, "Ljava/time/LocalDate;", "r0", "v1", "Lcom/heytap/health/wrist_temperature/util/ChartType;", "u0", "A2", "", "startTime", "endTime", "V1", "time", "", "J2", "date", "P1", "kotlin.jvm.PlatformType", "S", "Ljava/time/LocalDate;", "currentDate", "<init>", "()V", "Companion", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
public final class WristTemperatureHistoryYearFragment extends WristTemperatureHistoryBaseFragment {

    @NotNull
    public static final String TAG = "WTYearFragment";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public LocalDate currentDate = K1(B0(System.currentTimeMillis())).toLocalDate();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/wrist_temperature/ui/WristTemperatureHistoryYearFragment$b", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ohb {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String a(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return m6m.INSTANCE.g(entry.getY(), WristTemperatureHistoryYearFragment.this.getContext()) + WristTemperatureHistoryYearFragment.this.getString(R$string.health_wrist_temperature_unit);
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String b(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (!(entry.getData() instanceof WristTemperatureStat)) {
                return "anything";
            }
            pr8 pr8Var = pr8.INSTANCE;
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.databaseengine.model.wristtemperature.WristTemperatureStat");
            String strG = lo9.g(pr8Var.g(((WristTemperatureStat) data).getDate()), "yyyMMM");
            Intrinsics.checkNotNullExpressionValue(strG, "{\n                      …                        }");
            return strG;
        }
    }

    public static final String H2(WristTemperatureHistoryYearFragment this$0, int i, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i2 = (int) d;
        if (i2 < 0 || this$0.N0().size() <= i2) {
            return "";
        }
        long jG = pr8.INSTANCE.g(this$0.N0().get(i2).getDate());
        return i == 0 ? lo9.g(jG, "MMM") : String.valueOf(LocalDateTime.ofInstant(Instant.ofEpochMilli(jG), ZoneId.systemDefault()).toLocalDate().getMonthValue());
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void A2() {
        m8b.f(TAG, "mStartTime:" + getMStartTime() + " mEndTime:" + getMEndTime());
        f1().H(O0(), getMStartTime(), getMEndTime());
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void C2(@NotNull List<WristTemperatureStat> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        m8b.f(TAG, "year updateChart list:" + dataList);
        M0().setTimeXAxisMinimum(0L);
        M0().setXAxisMaximum((double) (dataList.size() + (-1)));
        M0().setVisibleXRange(12.0f, 12.0f);
        e2(dataList);
        M0().setEntryDataYeat(dataList);
        M0().moveViewToX(J2(getChartLowestVisibleTime()));
        V1(getChartLowestVisibleTime(), getChartHighestVisibleTime());
    }

    public final float J2(long time) {
        List<WristTemperatureStat> listN0 = N0();
        if (listN0 == null || listN0.isEmpty()) {
            return 0.0f;
        }
        int size = N0().size();
        for (int i = 0; i < size; i++) {
            if (time <= pr8.INSTANCE.g(N0().get(i).getDate())) {
                return i - M0().getExtraXAxisSpace();
            }
        }
        return 0.0f;
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void P1(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        long jB0 = B0(J1(h15.F(date)));
        long jA0 = A0(J1(h15.F(date)));
        M0().moveViewToX(J2(jB0));
        V1(jB0, jA0);
        R1(jB0, jA0);
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void V1(long startTime, long endTime) {
        this.currentDate = K1(x0(startTime)).toLocalDate();
        if (q15.r(startTime) == q15.r(endTime)) {
            P0().setText(lo9.g(startTime, "yyyy"));
        } else {
            P0().setText(getResources().getString(R$string.health_wrist_temperature_format_date, lo9.g(startTime, "yyyyMMM"), lo9.g(endTime, "yyyyMMM")));
        }
        if (startTime <= getMStartTime()) {
            Z0().setVisibility(8);
        } else {
            Z0().setVisibility(0);
        }
        if (endTime >= getMEndTime()) {
            Y0().setVisibility(8);
        } else {
            Y0().setVisibility(0);
        }
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment, com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        super.initView(view);
        V1(LocalDate.now().with(TemporalAdjusters.firstDayOfYear()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli(), LocalDate.now().with(TemporalAdjusters.lastDayOfYear()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    @NotNull
    public LocalDate r0() {
        LocalDate currentDate = this.currentDate;
        Intrinsics.checkNotNullExpressionValue(currentDate, "currentDate");
        return currentDate;
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    @NotNull
    public ChartType u0() {
        return ChartType.YEAR;
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void v1() {
        M0().getXAxis().setLabelCount(12);
        M0().setExtraSpace(0.5f);
        M0().setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.y7m
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return WristTemperatureHistoryYearFragment.H2(this.a, i, d);
            }
        });
        CommonMarkerView commonMarkerView = new CommonMarkerView(M0().getContext(), new b());
        M0().setMarker(commonMarkerView);
        commonMarkerView.setChartView(M0());
        s2(new WristHistoryChartTouchListener(this, M0(), M0().getViewPortHandler().getMatrixTouch(), 3.0f, 2, 0, 32, null));
        M0().setOnTouchListener((ChartTouchListener) g1());
    }
}