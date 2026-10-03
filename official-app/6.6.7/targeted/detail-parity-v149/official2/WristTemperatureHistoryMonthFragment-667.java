package com.heytap.health.wrist_temperature.ui;

import android.text.format.DateFormat;
import android.view.View;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.databaseengine.model.wristtemperature.WristTemperatureStat;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.wrist_temperature.R$string;
import com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryMonthFragment;
import com.heytap.health.wrist_temperature.util.ChartType;
import com.heytap.health.wrist_temperature.view.WristHistoryChartTouchListener;
import com.oplus.aiunit.vision.TimeStampedCandleData;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m6m;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.xp0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0014J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0014J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\nH\u0016R\u001e\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryMonthFragment;", "Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryBaseFragment;", "Landroid/view/View;", "view", "", "initView", "", "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "dataList", acl.KEY_C2, "Ljava/time/LocalDate;", "r0", "v1", "Lcom/heytap/health/wrist_temperature/util/ChartType;", "u0", "A2", "", "startTime", "endTime", "V1", "date", "P1", "kotlin.jvm.PlatformType", "S", "Ljava/time/LocalDate;", "currentDate", "<init>", "()V", "Companion", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
public final class WristTemperatureHistoryMonthFragment extends WristTemperatureHistoryBaseFragment {

    @NotNull
    public static final String TAG = "WTMonthFragment";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public LocalDate currentDate = LocalDate.now();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/wrist_temperature/ui/WristTemperatureHistoryMonthFragment$b", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ohb {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String a(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return m6m.INSTANCE.g(entry.getY(), WristTemperatureHistoryMonthFragment.this.getContext()) + WristTemperatureHistoryMonthFragment.this.getString(R$string.health_wrist_temperature_unit);
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String b(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object data = entry.getData();
            if (data instanceof TimeStampedData) {
                Object data2 = entry.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedData");
                String strG = lo9.g(((TimeStampedData) data2).getTimestamp(), "yyyMMMdd");
                Intrinsics.checkNotNullExpressionValue(strG, "{\n                      …                        }");
                return strG;
            }
            if (!(data instanceof TimeStampedCandleData)) {
                return "anything";
            }
            Object data3 = entry.getData();
            Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.TimeStampedCandleData");
            String strG2 = lo9.g(((TimeStampedCandleData) data3).getTimestamp(), "yyyMMMdd");
            Intrinsics.checkNotNullExpressionValue(strG2, "{\n                      …                        }");
            return strG2;
        }
    }

    public static final String H2(WristTemperatureHistoryMonthFragment this$0, int i, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long unit = (long) (d * this$0.M0().getXAxisTimeUnit().getUnit());
        if (i == 0) {
            return lo9.g(unit, "d");
        }
        return lo9.d(unit, System.currentTimeMillis()) ? this$0.getString(com.heytap.health.base.R$string.lib_base_chart_today) : DateFormat.format("d", new Date(unit)).toString();
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void A2() {
        m8b.f(TAG, "mStartTime:" + getMStartTime() + " mEndTime:" + getMEndTime());
        f1().G(O0(), getMStartTime(), getMEndTime());
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void C2(@NotNull List<WristTemperatureStat> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        m8b.f(TAG, "month updateChart list:" + dataList);
        M0().setTimeXAxisMinimum(getMStartTime());
        M0().setTimeXAxisMaximum(getMEndTime());
        M0().setVisibleXRange(31.0f, 31.0f);
        e2(dataList);
        M0().setEntryData(p0(dataList));
        M0().moveViewToX(B2(getChartLowestVisibleTime()));
        V1(getChartLowestVisibleTime(), getChartHighestVisibleTime());
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void P1(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        long jX0 = x0(J1(h15.F(date)));
        long jW0 = w0(J1(h15.F(date)));
        M0().moveViewToX(B2(jX0));
        V1(jX0, jW0);
        R1(jX0, jW0);
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void V1(long startTime, long endTime) {
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), ZoneId.systemDefault()).toLocalDate();
        this.currentDate = K1(startTime).toLocalDate();
        if (localDate.getDayOfMonth() == localDate.with(TemporalAdjusters.firstDayOfMonth()).getDayOfMonth()) {
            P0().setText(lo9.g(startTime, "yyyyMMM"));
        } else if (localDate.getYear() != localDate2.getYear()) {
            String strG = lo9.g(startTime, "yyyyMMMdd");
            Intrinsics.checkNotNullExpressionValue(strG, "localeDateFormat(startTime, \"yyyyMMMdd\")");
            String strG2 = lo9.g(endTime, "yyyyMMMdd");
            Intrinsics.checkNotNullExpressionValue(strG2, "localeDateFormat(endTime, \"yyyyMMMdd\")");
            P0().setText(getResources().getString(R$string.health_wrist_temperature_format_date, strG, strG2));
        } else if (localDate.getMonth() != localDate2.getMonth()) {
            String strG3 = lo9.g(startTime, "MMMd");
            Intrinsics.checkNotNullExpressionValue(strG3, "localeDateFormat(startTime, \"MMMd\")");
            String strG4 = lo9.g(endTime, "MMMd");
            Intrinsics.checkNotNullExpressionValue(strG4, "localeDateFormat(endTime, \"MMMd\")");
            P0().setText(getResources().getString(R$string.health_wrist_temperature_format_date, strG3, strG4));
        } else {
            P0().setText(lo9.g(startTime, "yyyyMMM"));
        }
        if (startTime <= getMStartTime()) {
            Z0().setVisibility(8);
        } else {
            Z0().setVisibility(0);
        }
        if (endTime >= w0(System.currentTimeMillis())) {
            Y0().setVisibility(8);
        } else {
            Y0().setVisibility(0);
        }
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment, com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        super.initView(view);
        V1(LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli(), LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
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
        return ChartType.MONTH;
    }

    @Override // com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment
    public void v1() {
        M0().getXAxis().setLabelCount(5, true);
        M0().setExtraSpace(0.5f);
        M0().setXAxisTimeUnit(TimeUnit.DAY);
        M0().setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.s7m
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return WristTemperatureHistoryMonthFragment.H2(this.a, i, d);
            }
        });
        CommonMarkerView commonMarkerView = new CommonMarkerView(M0().getContext(), new b());
        M0().setMarker(commonMarkerView);
        commonMarkerView.setChartView(M0());
        s2(new WristHistoryChartTouchListener(this, M0(), M0().getViewPortHandler().getMatrixTouch(), 3.0f, 1, 0, 32, null));
        M0().setOnTouchListener((ChartTouchListener) g1());
    }
}