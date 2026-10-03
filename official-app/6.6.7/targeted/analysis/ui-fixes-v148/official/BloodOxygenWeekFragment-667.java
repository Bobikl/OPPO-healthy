package com.heytap.health.bloodoxygen.ui;

import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import androidx.exifinterface.media.ExifInterface;
import com.github.mikephil.charting.data.Entry;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturationDataStat;
import com.heytap.health.base.R$string;
import com.heytap.health.bloodoxygen.ui.BloodOxygenWeekFragment;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.ar0;
import com.oplus.aiunit.vision.f59;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.xp0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0014J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u0016\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006H\u0002R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/heytap/health/bloodoxygen/ui/BloodOxygenWeekFragment;", "Lcom/heytap/health/bloodoxygen/ui/BloodOxygenHistoryBaseFragment;", "Landroid/view/View;", "view", "", "initView", "", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturationDataStat;", "dataList", "N1", "Lcom/heytap/health/core/widget/charts/data/ChartScrollState;", "state", "P1", "Lkotlin/Pair;", "", "K0", "Ljava/time/LocalDate;", "M0", "", "time", "j1", "i1", acl.KEY_B0, "Lcom/oplus/aiunit/vision/f59;", "chartDataList", "z2", "", "", ExifInterface.LONGITUDE_WEST, "[Ljava/lang/String;", "formatterStringArray", "<init>", "()V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
public final class BloodOxygenWeekFragment extends BloodOxygenHistoryBaseFragment {

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public final String[] formatterStringArray;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/bloodoxygen/ui/BloodOxygenWeekFragment$a", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ohb {
        @Override // com.oplus.aiunit.vision.ohb
        @Nullable
        public String a(@Nullable Entry entry) {
            if (entry == null || entry.getData() == null) {
                return null;
            }
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.HeartRateData");
            f59 f59Var = (f59) data;
            if (f59Var.b() <= 0 && f59Var.a() <= 0) {
                return "--";
            }
            if (f59Var.b() == f59Var.a()) {
                return f59Var.b() + "%";
            }
            return f59Var.b() + "%-" + f59Var.a() + "%";
        }

        @Override // com.oplus.aiunit.vision.ohb
        @Nullable
        public String b(@Nullable Entry entry) {
            if (entry == null || entry.getData() == null) {
                return null;
            }
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.HeartRateData");
            return lo9.g(((f59) data).c(), "yyyMMMd");
        }
    }

    public BloodOxygenWeekFragment() {
        k2("BloodOxygenHistory-Week");
        this.formatterStringArray = new String[8];
    }

    public static final String v2(BloodOxygenWeekFragment this$0, int i, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i > 10) {
            return null;
        }
        long unit = (long) (d * this$0.J0().getXAxisTimeUnit().getUnit());
        boolean zD = lo9.d(unit, System.currentTimeMillis());
        int value = zD ? 0 : com.heytap.health.bloodoxygen.util.a.INSTANCE.e(unit).getDayOfWeek().getValue();
        String str = this$0.formatterStringArray[value];
        if (str != null) {
            return str;
        }
        String string = zD ? this$0.getString(R$string.lib_base_chart_today) : lo9.c(this$0.J0().getContext(), unit);
        this$0.formatterStringArray[value] = string;
        return string;
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    public int B0() {
        return 0;
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    @NotNull
    public Pair<Integer, Integer> K0() {
        int value = M0().getDayOfWeek().getValue();
        int i = value == 1 ? -7 : -(value - 1);
        int i2 = value == 1 ? 7 : 8 - value;
        ar0.a(getTAG(), "getChangeDateOffset startDayOfWeek=" + value + ";startOffset=" + i + "; endOffset=" + i2 + "; ");
        return TuplesKt.to(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    @NotNull
    public LocalDate M0() {
        return com.heytap.health.bloodoxygen.util.a.INSTANCE.e(J0().getLowestVisibleTime());
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    public void N1(@Nullable List<? extends BloodOxygenSaturationDataStat> dataList) {
        if (dataList == null || !(!dataList.isEmpty())) {
            z2(CollectionsKt__CollectionsJVMKt.listOf(new f59(getChartEndTime() - ((long) 1000), 0, 0)));
            e2(true);
            return;
        }
        e2(false);
        ArrayList arrayList = new ArrayList(dataList.size());
        for (BloodOxygenSaturationDataStat bloodOxygenSaturationDataStat : dataList) {
            arrayList.add(new f59(o15.a(bloodOxygenSaturationDataStat.getDate()), bloodOxygenSaturationDataStat.getMinBloodOxygenSaturation(), bloodOxygenSaturationDataStat.getMaxBloodOxygenSaturation()));
        }
        z2(arrayList);
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    public void P1(@Nullable ChartScrollState state) {
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        long jG = companion.g(companion.e(J0().getLowestVisibleTime()));
        LocalDate localDatePlusDays = companion.e(jG).plusDays(7L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "BODateUtil.getLocalDate(…bleStartTime).plusDays(7)");
        long jG2 = companion.g(localDatePlusDays) - 1000;
        ar0.c(getTAG(), "chart gesture startTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", jG)) + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", jG2)));
        if (getLastStartTime() == jG && getLastEndTime() == jG2) {
            return;
        }
        h2(jG);
        g2(jG2);
        J0().setYAxisLabel(o1(jG, jG2));
        M1(jG, jG2);
        s2(jG, jG2);
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    public long i1(long time) {
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        LocalDate localDateE = companion.e(time);
        LocalDate localDatePlusDays = localDateE.plusDays(7 - ((long) localDateE.getDayOfWeek().getValue())).plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "date.plusDays(7L - weekOfDay).plusDays(1)");
        return companion.g(localDatePlusDays) - ((long) 1000);
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment, com.heytap.health.base.base.BaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.initView(view);
        J0().setXAxisTimeUnit(TimeUnit.DAY);
        J0().setRadius(2.0f);
        J0().o();
        j2(new CommonMarkerView(J0().getContext(), new a()));
        CommonMarkerView markerView = getMarkerView();
        Intrinsics.checkNotNull(markerView);
        markerView.setOffsetTop(jjk.a(requireActivity(), 20.0f));
        J0().setBarWidth(0.49122804f);
        J0().setRightOffset(44.0f);
        J0().setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.sn1
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return BloodOxygenWeekFragment.v2(this.a, i, d);
            }
        });
        J0().setXAxisLabelCount(7);
        J0().getXAxis().setGranularity(1.0f);
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    public long j1(long time) {
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        LocalDate localDateMinusDays = companion.e(time).minusDays(((long) companion.f(time).getDayOfWeek().getValue()) - 1);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "BODateUtil.getLocalDate(…).minusDays(weekOfDay-1L)");
        return companion.g(localDateMinusDays);
    }

    public final void z2(List<? extends f59> chartDataList) {
        ar0.c(getTAG(), "week fill data startTime:" + q15.a(getChartStartTime(), "yyyy-MM-dd HH:mm:ss"));
        ar0.c(getTAG(), "week fill data endTime:" + q15.a(getChartEndTime(), "yyyy-MM-dd HH:mm:ss"));
        J0().setXAxisMinimum(J0().getXAxisTimeUnit().timeStampToUnitDouble(getChartStartTime()));
        J0().setXAxisMaximum(J0().getXAxisTimeUnit().timeStampToUnitDouble(getChartEndTime()));
        J0().setMarker(getMarkerView());
        J0().setVisibleXRange(6.0f, 6.0f);
        J0().setHeartRateData(chartDataList);
        J0().H(J0().getXAxisTimeUnit().timeStampToUnitDouble(V0()) - ((double) J0().getBarWidth()));
        J0().setYAxisLabel(o1(V0(), R0()));
        J0().setVisibility(0);
        LinearLayout mLoadingLayout = getMLoadingLayout();
        Intrinsics.checkNotNull(mLoadingLayout);
        mLoadingLayout.setVisibility(8);
    }
}