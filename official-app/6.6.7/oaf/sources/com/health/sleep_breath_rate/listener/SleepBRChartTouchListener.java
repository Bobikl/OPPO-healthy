package com.health.sleep_breath_rate.listener;

import android.graphics.Matrix;
import androidx.lifecycle.LifecycleOwner;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.health.core.widget.charts.GluCombineChart;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import com.heytap.health.core.widget.charts.listener.HealthBarChartTouchListener;
import com.heytap.health.healthbase.util.HealthFrgType;
import com.oplus.aiunit.vision.d3k;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SleepBRChartTouchListener extends HealthBarChartTouchListener {
    public final String S;
    public final HealthFrgType T;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HealthFrgType.values().length];
            a = iArr;
            try {
                iArr[HealthFrgType.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HealthFrgType.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HealthFrgType.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SleepBRChartTouchListener(LifecycleOwner lifecycleOwner, BarLineChartBase<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> barLineChartBase, Matrix matrix, float f, HealthFrgType healthFrgType) {
        super(lifecycleOwner, barLineChartBase, matrix, f);
        this.S = "SleepHRChartTouchListener";
        this.T = healthFrgType;
        ((HealthBarChartTouchListener) this).N = true;
        m(250L);
    }

    public float d() {
        float fTimeStampToUnitDouble;
        float extraXAxisSpace;
        BarLineChartBase barLineChartBase = ((ChartTouchListener) this).mChart;
        if (!(barLineChartBase instanceof GluCombineChart)) {
            return 0.0f;
        }
        GluCombineChart gluCombineChart = (GluCombineChart) barLineChartBase;
        if (this.T == HealthFrgType.YEAR) {
            fTimeStampToUnitDouble = Math.round((float) ((gluCombineChart.getLowestVisibleValueX() + ((double) gluCombineChart.getBarWidth())) + ((double) gluCombineChart.getExtraXAxisSpace()))) - (gluCombineChart.getBarWidth() / 2.0f);
            extraXAxisSpace = gluCombineChart.getExtraXAxisSpace();
        } else {
            fTimeStampToUnitDouble = (float) ((gluCombineChart.getXAxisTimeUnit().timeStampToUnitDouble(q(LocalDateTime.ofInstant(Instant.ofEpochMilli((long) ((((((double) barLineChartBase.getLowestVisibleX()) + gluCombineChart.getXAxisOffset()) + ((double) gluCombineChart.getBarWidth())) + ((double) gluCombineChart.getExtraXAxisSpace())) * gluCombineChart.getXAxisTimeUnit().getUnit())), ZoneId.systemDefault()).toLocalDate(), false)) - ((double) (gluCombineChart.getBarWidth() / 2.0f))) - gluCombineChart.getXAxisOffset());
            extraXAxisSpace = gluCombineChart.getExtraXAxisSpace();
        }
        return fTimeStampToUnitDouble - extraXAxisSpace;
    }

    public float g() {
        float fTimeStampToUnitDouble;
        float extraXAxisSpace;
        BarLineChartBase barLineChartBase = ((ChartTouchListener) this).mChart;
        if (!(barLineChartBase instanceof GluCombineChart)) {
            return 0.0f;
        }
        GluCombineChart gluCombineChart = (GluCombineChart) barLineChartBase;
        if (this.T == HealthFrgType.YEAR) {
            int iRound = Math.round((float) (gluCombineChart.getLowestVisibleValueX() + ((double) gluCombineChart.getBarWidth())));
            for (CandleDataSet candleDataSet : gluCombineChart.getData().getCandleData().getDataSets()) {
                if (candleDataSet instanceof CandleDataSet) {
                    CandleDataSet candleDataSet2 = candleDataSet;
                    if (candleDataSet2.getEntryForIndex(iRound) instanceof HealthCandleEntry) {
                        iRound += r(((d3k) candleDataSet2.getEntryForIndex(iRound).getData()).d());
                    }
                }
            }
            fTimeStampToUnitDouble = iRound - (gluCombineChart.getBarWidth() / 2.0f);
            extraXAxisSpace = gluCombineChart.getExtraXAxisSpace();
        } else {
            fTimeStampToUnitDouble = (float) ((gluCombineChart.getXAxisTimeUnit().timeStampToUnitDouble(q(LocalDateTime.ofInstant(Instant.ofEpochMilli((long) ((((((double) barLineChartBase.getLowestVisibleX()) + gluCombineChart.getXAxisOffset()) + ((double) gluCombineChart.getBarWidth())) + ((double) gluCombineChart.getExtraXAxisSpace())) * gluCombineChart.getXAxisTimeUnit().getUnit())), ZoneId.systemDefault()).toLocalDate(), true)) - ((double) (gluCombineChart.getBarWidth() / 2.0f))) - gluCombineChart.getXAxisOffset());
            extraXAxisSpace = gluCombineChart.getExtraXAxisSpace();
        }
        return fTimeStampToUnitDouble - extraXAxisSpace;
    }

    public final long q(LocalDate localDate, boolean z) {
        if (z) {
            int i = a.a[this.T.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (((HealthBarChartTouchListener) this).L == 1) {
                            localDate = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() == localDate.with(TemporalAdjusters.firstDayOfYear()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() ? localDate.minusYears(1L).with(TemporalAdjusters.firstDayOfYear()) : localDate.with(TemporalAdjusters.firstDayOfYear());
                        } else {
                            localDate = localDate.plusYears(1L).with(TemporalAdjusters.firstDayOfYear());
                        }
                    }
                } else if (((HealthBarChartTouchListener) this).L == 1) {
                    localDate = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() == localDate.with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() ? localDate.minusMonths(1L).with(TemporalAdjusters.firstDayOfMonth()) : localDate.with(TemporalAdjusters.firstDayOfMonth());
                } else {
                    localDate = localDate.plusMonths(1L).with(TemporalAdjusters.firstDayOfMonth());
                }
            } else if (((HealthBarChartTouchListener) this).L == 1) {
                localDate = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() == localDate.with((TemporalAdjuster) DayOfWeek.MONDAY).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() ? localDate.minusDays(7L).with((TemporalAdjuster) DayOfWeek.MONDAY) : localDate.with((TemporalAdjuster) DayOfWeek.MONDAY);
            } else {
                localDate = localDate.plusDays(7L).with((TemporalAdjuster) DayOfWeek.MONDAY);
            }
        }
        return localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public final int r(long j) {
        LocalDate localDateWith;
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault()).toLocalDate();
        if (((HealthBarChartTouchListener) this).L == 1) {
            int year = localDate.getYear();
            int monthValue = localDate.getMonthValue();
            LocalDate localDate2 = localDate.with(TemporalAdjusters.firstDayOfYear()).atStartOfDay().toLocalDate();
            localDateWith = (year == localDate2.getYear() && monthValue == localDate2.getMonthValue()) ? localDate.minusYears(1L).with(TemporalAdjusters.firstDayOfYear()) : localDate.with(TemporalAdjusters.firstDayOfYear());
        } else {
            localDateWith = localDate.plusYears(1L).with(TemporalAdjusters.firstDayOfYear());
        }
        return s(localDate.atStartOfDay(), localDateWith.atStartOfDay());
    }

    public final int s(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        int monthValue = localDateTime.getMonthValue();
        return ((localDateTime2.getYear() - localDateTime.getYear()) * 12) + (localDateTime2.getMonthValue() - monthValue);
    }

    public float t(boolean z) {
        if (z) {
            ((HealthBarChartTouchListener) this).L = 0;
        } else {
            ((HealthBarChartTouchListener) this).L = 1;
        }
        return l(((HealthBarChartTouchListener) this).Q);
    }
}
