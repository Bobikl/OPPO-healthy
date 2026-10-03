package com.heytap.health.daily.ui.card;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.view.recyclercard.a;
import com.heytap.health.core.widget.charts.HealthBarChart;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.daily.R$color;
import com.heytap.health.daily.ui.card.DailyActBaseCard;
import com.heytap.health.daily.viewmodel.DailyActivityDetailViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.ml3;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.uma;
import com.oplus.aiunit.vision.xp0;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/heytap/health/daily/ui/card/DailyActBaseCard;", "Lcom/heytap/health/base/view/recyclercard/a;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "", "content", "", "colorId", "Landroid/text/SpannableString;", "v", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "dataList", "Lcom/heytap/health/daily/viewmodel/DailyActivityDetailViewModel$ChartType;", "type", "w", "Lcom/heytap/health/core/widget/charts/HealthBarChart;", "chart", "t", "r", "o", "Landroid/content/Context;", "mContext", "Lcom/oplus/aiunit/vision/ml3;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/oplus/aiunit/vision/ml3;", "q", "()Lcom/oplus/aiunit/vision/ml3;", "x", "(Lcom/oplus/aiunit/vision/ml3;)V", "mColorProvider", "<init>", "()V", "Companion", "a", "daily_release"}, k = 1, mv = {1, 8, 0})
public abstract class DailyActBaseCard extends a {
    public static final int ANIM_DURATION = 700;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public Context mContext;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public ml3 mColorProvider;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DailyActivityDetailViewModel.ChartType.values().length];
            try {
                iArr[DailyActivityDetailViewModel.ChartType.CALORIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DailyActivityDetailViewModel.ChartType.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DailyActivityDetailViewModel.ChartType.STEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int s(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public static final String u(int i, double d) {
        return String.valueOf((int) ((((d * ((double) 30)) * ((double) 60)) * ((double) 1000)) / ((double) 3600000)));
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable Context context, @Nullable View cardView) {
        super.l(context, cardView);
        this.mContext = context;
        x(new ml3(context));
    }

    @NotNull
    public final ml3 q() {
        ml3 ml3Var = this.mColorProvider;
        if (ml3Var != null) {
            return ml3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mColorProvider");
        return null;
    }

    public final TimeStampedData r(List<? extends TimeStampedData> dataList) {
        TimeStampedData timeStampedData;
        if (dataList.size() == 1) {
            timeStampedData = dataList.get(0);
        } else if (dataList.size() > 1) {
            final DailyActBaseCard$getMax$1 dailyActBaseCard$getMax$1 = new Function2<TimeStampedData, TimeStampedData, Integer>() { // from class: com.heytap.health.daily.ui.card.DailyActBaseCard$getMax$1
                @Override // p010kotlin.jvm.functions.Function2
                @NotNull
                public final Integer invoke(@NotNull TimeStampedData o1, @NotNull TimeStampedData o2) {
                    Intrinsics.checkNotNullParameter(o1, "o1");
                    Intrinsics.checkNotNullParameter(o2, "o2");
                    return Integer.valueOf(Float.compare(o1.getY(), o2.getY()));
                }
            };
            timeStampedData = (TimeStampedData) Collections.max(dataList, new Comparator() { // from class: com.oplus.aiunit.vision.vp4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DailyActBaseCard.s(dailyActBaseCard$getMax$1, obj, obj2);
                }
            });
        } else {
            timeStampedData = null;
        }
        return timeStampedData == null ? new TimeStampedData() : timeStampedData;
    }

    public final void t(@NotNull HealthBarChart chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        chart.setXAxisTimeUnit(TimeUnit.HALF_AN_HOUR);
        chart.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.wp4
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return DailyActBaseCard.u(i, d);
            }
        });
        chart.setBarWidth(0.7222222f);
        chart.setXAxisMinimum(0.0f);
        chart.setXAxisMaximum(48.0f);
        chart.getXAxis().setLabelCount(5);
        chart.setRadius(3.0f);
        chart.setYAxisMinimum(0.0f);
        Context context = this.mContext;
        if (context != null) {
            if (if0.y(context)) {
                chart.getAxisRight().setGridColor(context.getResources().getColor(R$color.health_daily_grid_line_night, null));
            } else {
                chart.getAxisRight().setGridColor(context.getResources().getColor(R$color.health_daily_grid_line, null));
            }
            chart.getAxisRight().setGridDashedLine(new DashPathEffect(new float[]{jjk.a(context, 3.67f), jjk.a(context, 3.67f)}, 0.0f));
            chart.setVibrate(false);
            chart.setGridLinePos(new float[]{jjk.a(context, 22.0f), qmg.f(context) - jjk.a(context, 61.0f)});
        }
    }

    @NotNull
    public final SpannableString v(@Nullable Context context, @NotNull String content, int colorId) {
        Intrinsics.checkNotNullParameter(content, "content");
        SpannableString spannableString = new SpannableString(content);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) content, uma.SEPARATOR, 0, false, 6, (Object) null);
        spannableString.setSpan(new ForegroundColorSpan(colorId), 0, iIndexOf$default, 17);
        spannableString.setSpan(new AbsoluteSizeSpan(qmg.n(context, 26.0f)), 0, iIndexOf$default, 17);
        spannableString.setSpan(new StyleSpan(0), 0, iIndexOf$default, 17);
        return spannableString;
    }

    @NotNull
    public final TimeStampedData w(@NotNull List<? extends TimeStampedData> dataList, @Nullable DailyActivityDetailViewModel.ChartType type) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        TimeStampedData timeStampedDataR = r(dataList);
        TimeStampedData timeStampedData = new TimeStampedData();
        timeStampedData.setY(timeStampedDataR.getY());
        float y = timeStampedData.getY();
        int i = type == null ? -1 : b.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            if (y <= 20000.0f) {
                y = 20000.0f;
            } else if (y % 10000 > 0.0f) {
                y = ((((int) y) / 10000) + 1) * 10000;
            }
            timeStampedData.setY(y);
        } else if (i == 2) {
            if (y <= 10.0f) {
                y = 10.0f;
            } else if (y % 10 > 0.0f) {
                y = ((((int) y) / 10) + 1) * 10;
            }
            timeStampedData.setY(y);
        } else if (i == 3) {
            if (y >= 1000.0f) {
                int i2 = (int) y;
                if (i2 % 1000 > 0) {
                    y = ((i2 / 1000) + 1) * 1000;
                }
            } else {
                y = y > 500.0f ? 1000.0f : 500.0f;
            }
            timeStampedData.setY(y);
        }
        return timeStampedData;
    }

    public final void x(@NotNull ml3 ml3Var) {
        Intrinsics.checkNotNullParameter(ml3Var, "<set-?>");
        this.mColorProvider = ml3Var;
    }
}