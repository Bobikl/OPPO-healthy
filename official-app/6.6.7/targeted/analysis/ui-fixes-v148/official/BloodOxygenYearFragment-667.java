package com.heytap.health.bloodoxygen.ui;

import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import androidx.exifinterface.media.ExifInterface;
import com.github.mikephil.charting.data.Entry;
import com.heytap.databaseengine.model.bloodoxygensaturation.BloodOxygenSaturationDataStat;
import com.heytap.health.bloodoxygen.ui.BloodOxygenYearFragment;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.ar0;
import com.oplus.aiunit.vision.f59;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.xp0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0014J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0016\u0010\u0019\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006H\u0002R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/bloodoxygen/ui/BloodOxygenYearFragment;", "Lcom/heytap/health/bloodoxygen/ui/BloodOxygenHistoryBaseFragment;", "Landroid/view/View;", "view", "", "initView", "", "Lcom/heytap/databaseengine/model/bloodoxygensaturation/BloodOxygenSaturationDataStat;", "dataList", "N1", "Lcom/heytap/health/core/widget/charts/data/ChartScrollState;", "state", "P1", "Ljava/time/LocalDate;", "M0", "Lkotlin/Pair;", "", "K0", "", "time", "j1", "i1", "r2", acl.KEY_B0, "Lcom/oplus/aiunit/vision/f59;", "z2", ExifInterface.LONGITUDE_WEST, "Ljava/util/List;", "rateData", "<init>", "()V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
public final class BloodOxygenYearFragment extends BloodOxygenHistoryBaseFragment {

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public List<? extends f59> rateData;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/bloodoxygen/ui/BloodOxygenYearFragment$a", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
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
            return lo9.g(((f59) data).c(), "yyyMMM");
        }
    }

    public BloodOxygenYearFragment() {
        k2("BloodOxygenHistory-Year");
        this.rateData = new ArrayList();
    }

    public static final String v2(BloodOxygenYearFragment this$0, int i, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(d);
        ar0.a(this$0.getTAG(), "setXAxisValueFormatter visibleIndex=" + i + " value=" + d + " index=" + iRoundToInt);
        if (iRoundToInt < 0 || this$0.rateData.size() <= iRoundToInt) {
            return "";
        }
        long jC = this$0.rateData.get(iRoundToInt).c();
        return i == 0 ? lo9.g(jC, "MMM") : String.valueOf(com.heytap.health.bloodoxygen.util.a.INSTANCE.e(jC).getMonthValue());
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    public int B0() {
        return 2;
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    @NotNull
    public Pair<Integer, Integer> K0() {
        int monthValue = M0().getMonthValue();
        int i = monthValue == 1 ? -12 : -monthValue;
        int i2 = monthValue == 1 ? 12 : 13 - monthValue;
        ar0.a(getTAG(), "getChangeDateOffset startMonth=" + monthValue + "; startOffset=" + i + "; endOffset=" + i2 + "; ");
        return TuplesKt.to(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    @NotNull
    public LocalDate M0() {
        int highestVisibleValueX = ((int) J0().getHighestVisibleValueX()) - 11;
        boolean z = false;
        if (highestVisibleValueX >= 0 && highestVisibleValueX < this.rateData.size()) {
            z = true;
        }
        return com.heytap.health.bloodoxygen.util.a.INSTANCE.e(z ? this.rateData.get(highestVisibleValueX).c() : j1(getChartEndTime()));
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    public void N1(@Nullable List<? extends BloodOxygenSaturationDataStat> dataList) {
        if (dataList == null || dataList.size() <= 0) {
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
        long jC = this.rateData.get(Math.round(((float) J0().getLowestVisibleValueX()) + J0().getBarWidth())).c();
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        LocalDate localDateWith = companion.e(jC).with(TemporalAdjusters.firstDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "BODateUtil.getLocalDate(…usters.firstDayOfMonth())");
        long jG = companion.g(localDateWith);
        LocalDate localDatePlusYears = companion.e(jG).plusYears(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusYears, "BODateUtil.getLocalDate(startTime).plusYears(1)");
        long jG2 = companion.g(localDatePlusYears) - ((long) 1000);
        ar0.c(getTAG(), "chart gesture startTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", jG)) + ",endTime: " + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", jG2)));
        if (getLastStartTime() == jG && getLastEndTime() == jG2) {
            return;
        }
        h2(jG);
        g2(jG2);
        long jMin = Math.min(jG2, companion.b());
        J0().setYAxisLabel(o1(jG, jMin));
        M1(jG, jMin);
        s2(jG, jG2);
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    public long i1(long time) {
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        LocalDate localDatePlusDays = companion.e(time).with(TemporalAdjusters.lastDayOfYear()).plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "date.with(TemporalAdjust…tDayOfYear()).plusDays(1)");
        return companion.g(localDatePlusDays) - ((long) 1000);
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment, com.heytap.health.base.base.BaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.initView(view);
        J0().setRadius(2.0f);
        J0().o();
        j2(new CommonMarkerView(J0().getContext(), new a()));
        CommonMarkerView markerView = getMarkerView();
        Intrinsics.checkNotNull(markerView);
        markerView.setOffsetTop(jjk.a(requireActivity(), 20.0f));
        J0().setBarWidth(0.5473684f);
        J0().setRightOffset(40.5f);
        J0().setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.tn1
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return BloodOxygenYearFragment.v2(this.a, i, d);
            }
        });
        J0().getXAxis().setLabelCount(12);
        J0().getXAxis().setGranularity(1.0f);
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    public long j1(long time) {
        com.heytap.health.bloodoxygen.util.a.Companion companion = com.heytap.health.bloodoxygen.util.a.INSTANCE;
        LocalDate localDateWith = companion.e(time).with(TemporalAdjusters.firstDayOfYear());
        Intrinsics.checkNotNullExpressionValue(localDateWith, "date.with(TemporalAdjusters.firstDayOfYear())");
        return companion.g(localDateWith);
    }

    @Override // com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryBaseFragment
    public void r2() {
        int selectedIndex = J0().getSelectedIndex();
        if (selectedIndex >= 0) {
            boolean z = false;
            if (selectedIndex >= 0 && selectedIndex < this.rateData.size()) {
                z = true;
            }
            if (z) {
                f59 f59Var = this.rateData.get(selectedIndex);
                ar0.c(getTAG(), "updateRangeValueVisible: selectedIndex=" + selectedIndex + " min=" + f59Var.b() + " max=" + f59Var.a());
                if (f59Var.a() == 0 && f59Var.b() == 0) {
                    J0().setSelectedIndex(-1);
                }
            }
        }
        super.r2();
    }

    public final void z2(List<? extends f59> dataList) {
        List<f59> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) dataList);
        if (mutableList.isEmpty()) {
            mutableList.add(new f59(getChartEndTime(), 0, 0));
        } else {
            ar0.c(getTAG(), "year fill data startTime:" + q15.a(getChartStartTime(), "yyyy-MM-dd HH:mm:ss"));
            ar0.c(getTAG(), "year fill data endTime:" + q15.a(getChartEndTime(), "yyyy-MM-dd HH:mm:ss"));
            J0().setMarker(getMarkerView());
        }
        List<f59> listD = n1().D(getChartStartTime(), getChartEndTime(), mutableList);
        Intrinsics.checkNotNullExpressionValue(listD, "viewModel.insertEmptyDat…, chartEndTime, dataList)");
        ArrayList arrayList = new ArrayList();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        int size = listD.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            f59 f59Var = listD.get(i2);
            arrayList.add(new HealthCandleEntry(i2, f59Var.b(), f59Var.a(), f59Var));
            LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(V0()), zoneIdSystemDefault).toLocalDate();
            LocalDate localDate2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(f59Var.c()), zoneIdSystemDefault).toLocalDate();
            if (localDate.getYear() == localDate2.getYear() && localDate.getMonth() == localDate2.getMonth()) {
                i = i2;
            }
        }
        this.rateData = listD;
        J0().setXAxisMinimum(0.0d);
        J0().setEntryList(arrayList);
        J0().setXAxisMaximum(listD.size() - 1);
        J0().setVisibleXRange(11.0f, 11.0f);
        J0().setYAxisLabel(o1(V0(), R0()));
        double barWidth = ((double) i) - ((double) J0().getBarWidth());
        getTAG();
        float barWidth2 = J0().getBarWidth();
        StringBuilder sb = new StringBuilder();
        sb.append("moveX:");
        sb.append(barWidth);
        sb.append(" ,validLastDataIndex:");
        sb.append(i);
        sb.append(" ,barWidth:");
        sb.append(barWidth2);
        J0().H(barWidth);
        J0().setVisibility(0);
        LinearLayout mLoadingLayout = getMLoadingLayout();
        Intrinsics.checkNotNull(mLoadingLayout);
        mLoadingLayout.setVisibility(8);
    }
}