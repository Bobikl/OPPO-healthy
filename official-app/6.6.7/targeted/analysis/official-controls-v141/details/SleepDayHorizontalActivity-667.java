package com.heytap.health.sleep.day;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.i18n.WeekStrUtils;
import com.heytap.health.core.widget.charts.SleepCombinedChart;
import com.heytap.health.core.widget.charts.components.markerview.CommonMarkerView;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.core.widget.charts.data.SleepDailyEntry;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.health_base.R$color;
import com.heytap.health.sleep.R$drawable;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$string;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.databinding.HealthSleepActDayHorizontalBinding;
import com.heytap.health.sleep.day.SleepDayHorizontalActivity;
import com.heytap.health.sleep.day.viewmodel.SleepDayViewModel2;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.ich;
import com.oplus.aiunit.vision.k7h;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.ohb;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.vd8;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.xp0;
import com.oplus.smartenginehelper.ParserTag;
import com.xiaomi.mipush.sdk.Constants;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bW\u0010XJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0006\u0010\u000b\u001a\u00020\u0005J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0018\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0002R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010$R$\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00103\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010$R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010L\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00109R\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00109R\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006Y"}, d2 = {"Lcom/heytap/health/sleep/day/SleepDayHorizontalActivity;", "Lcom/heytap/health/base/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "s2", "z0", "F3", "F7", "Landroid/view/View;", "v", ParserTag.TAG_ONCLICK, "D7", "initView", "A7", "H7", "Landroid/view/MotionEvent;", "motionEvent", "E7", "C7", "", "type", "Landroid/widget/TextView;", "view", "y7", "checked", "G7", "z7", "", LogFieldKey.MESSAGE_KEY, "Ljava/lang/String;", "TAG", "n", "I", "SPO2_TYPE", "o", "HEART_RATE_TYPE", "", LogFieldKey.PROCESS_NAME_KEY, "Ljava/util/Map;", "sleepDrawModelMap", "", "q", "J", SnoreHistoryActivity.CUR_DAY_START_TIME, "r", SnoreHistoryActivity.CUR_DAY_END_TIME, "s", "lineDrawModel", "Lcom/oplus/aiunit/vision/ich;", "t", "Lcom/oplus/aiunit/vision/ich;", "sleepAssembleBean", "u", "Z", "isIWatch", "Lcom/heytap/health/sleep/day/viewmodel/SleepDayViewModel2;", "Lcom/heytap/health/sleep/day/viewmodel/SleepDayViewModel2;", "viewModel", "Lcom/coui/appcompat/toolbar/COUIToolbar;", "w", "Lcom/coui/appcompat/toolbar/COUIToolbar;", "toolbar", "Landroid/widget/LinearLayout;", "x", "Landroid/widget/LinearLayout;", "mLoadingLayout", "y", "Landroid/widget/TextView;", "tvSleepTitle", "z", "tvSleepTime", "A", "noHeartRateData", acl.KEY_B, "noSpo2Data", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "C", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "familyDetailConfig", "Lcom/heytap/health/sleep/databinding/HealthSleepActDayHorizontalBinding;", "D", "Lcom/heytap/health/sleep/databinding/HealthSleepActDayHorizontalBinding;", "binding", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepDayHorizontalActivity extends BaseActivity implements View.OnClickListener {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public FamilyMoreDataDetailConfigBean familyDetailConfig;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public HealthSleepActDayHorizontalBinding binding;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Map<Integer, Integer> sleepDrawModelMap;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public long curDayStartTime;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public long curDayEndTime;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int lineDrawModel;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public ich sleepAssembleBean;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean isIWatch;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public SleepDayViewModel2 viewModel;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public COUIToolbar toolbar;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public LinearLayout mLoadingLayout;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public TextView tvSleepTitle;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public TextView tvSleepTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "SleepDayHorizontal";

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final int SPO2_TYPE = 6;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int HEART_RATE_TYPE = 7;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean noHeartRateData = true;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean noSpo2Data = true;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/heytap/health/sleep/day/SleepDayHorizontalActivity$a", "Lcom/oplus/aiunit/vision/k7h;", "Lcom/heytap/health/core/widget/charts/data/ChartScrollState;", "state", "", "a", "Landroid/view/MotionEvent;", "motionEvent", "onChartSingleTapped", "onChartLongPressed", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends k7h {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.k7h
        public void a(@NotNull ChartScrollState state) {
            Intrinsics.checkNotNullParameter(state, "state");
        }

        @Override // com.oplus.aiunit.vision.k7h, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            super.onChartLongPressed(motionEvent);
            SleepDayHorizontalActivity.this.E7(motionEvent);
        }

        @Override // com.oplus.aiunit.vision.k7h, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartSingleTapped(@NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            super.onChartSingleTapped(motionEvent);
            SleepDayHorizontalActivity.this.E7(motionEvent);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/sleep/day/SleepDayHorizontalActivity$b", "Lcom/github/mikephil/charting/listener/OnChartValueSelectedListener;", "Lcom/github/mikephil/charting/data/Entry;", MapSchema.FIELD_NAME_ENTRY, "Lcom/github/mikephil/charting/highlight/Highlight;", c7n.g, "", "onValueSelected", "onNothingSelected", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements OnChartValueSelectedListener {
        public b() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            String unused = SleepDayHorizontalActivity.this.TAG;
            SleepDayHorizontalActivity.this.H7();
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(@Nullable Entry e2, @Nullable Highlight h) {
            String unused = SleepDayHorizontalActivity.this.TAG;
            SleepDayHorizontalActivity.this.H7();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/sleep/day/SleepDayHorizontalActivity$c", "Lcom/oplus/aiunit/vision/ohb;", "Lcom/github/mikephil/charting/data/Entry;", "entry", "", "b", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends ohb {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String a(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (!(entry.getData() instanceof SleepUnitData)) {
                return "";
            }
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.SleepUnitData");
            SleepUnitData sleepUnitData = (SleepUnitData) data;
            StringBuilder sb = new StringBuilder();
            int type = sleepUnitData.getType();
            if (type == 1) {
                sb.append(SleepDayHorizontalActivity.this.getBaseContext().getString(R$string.health_sleep_deep));
            } else if (type == 2) {
                sb.append(SleepDayHorizontalActivity.this.getBaseContext().getString(R$string.health_sleep_light));
            } else if (type == 3) {
                sb.append(SleepDayHorizontalActivity.this.getBaseContext().getString(R$string.health_sleep_rem_full_name));
            } else if (type == 4) {
                sb.append(SleepDayHorizontalActivity.this.getBaseContext().getString(R$string.health_sleep_awake));
            }
            sb.append(s15.b(sleepUnitData.getDuration() / 60000));
            if (SleepDayHorizontalActivity.this.lineDrawModel == 1 && sleepUnitData.getHeartRateLowY() > 0.0f && sleepUnitData.getHeartRateHeightY() > 0.0f) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = SleepDayHorizontalActivity.this.getString(R$string.health_sleep_heart_rate_format);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.health_sleep_heart_rate_format)");
                String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf((int) sleepUnitData.getHeartRateLowY()), String.valueOf((int) sleepUnitData.getHeartRateHeightY())}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                sb.append(str);
            } else if (SleepDayHorizontalActivity.this.lineDrawModel == 2 && sleepUnitData.getSpo2LowY() > 0.0f && sleepUnitData.getSpo2HeightY() > 0.0f) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = SleepDayHorizontalActivity.this.getString(R$string.health_sleep_spo2_format);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.health_sleep_spo2_format)");
                String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf((int) sleepUnitData.getSpo2LowY()), String.valueOf((int) sleepUnitData.getSpo2HeightY())}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                sb.append(str2);
            }
            String string3 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "contentLabel.toString()");
            return string3;
        }

        @Override // com.oplus.aiunit.vision.ohb
        @NotNull
        public String b(@NotNull Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (!(entry.getData() instanceof SleepUnitData)) {
                return "";
            }
            Object data = entry.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.SleepUnitData");
            SleepUnitData sleepUnitData = (SleepUnitData) data;
            if (!sleepUnitData.isStageSleepEnd()) {
                pr8 pr8Var = pr8.INSTANCE;
                return pr8Var.y(sleepUnitData.getTimestamp(), o15.DATE_FORMAT_HOUR) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + pr8Var.y(sleepUnitData.getTimestamp() + sleepUnitData.getDuration(), o15.DATE_FORMAT_HOUR);
            }
            long timestamp = sleepUnitData.getTimestamp() + sleepUnitData.getDuration();
            if (!SleepDayHorizontalActivity.this.isIWatch) {
                timestamp -= (long) 60000;
            }
            pr8 pr8Var2 = pr8.INSTANCE;
            return pr8Var2.y(sleepUnitData.getTimestamp(), o15.DATE_FORMAT_HOUR) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + pr8Var2.y(timestamp, o15.DATE_FORMAT_HOUR);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    public static final String B7(SleepDayHorizontalActivity this$0, int i, double d2) {
        SleepDayBean sleepDayData;
        SleepDayBean sleepDayData2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0) {
            pr8 pr8Var = pr8.INSTANCE;
            ich ichVar = this$0.sleepAssembleBean;
            return pr8Var.y((ichVar == null || (sleepDayData2 = ichVar.getSleepDayData()) == null) ? this$0.curDayStartTime : sleepDayData2.getStartSleepTime(), o15.DATE_FORMAT_HOUR);
        }
        long j2 = this$0.curDayEndTime;
        ich ichVar2 = this$0.sleepAssembleBean;
        long endSleepTime = (ichVar2 == null || (sleepDayData = ichVar2.getSleepDayData()) == null) ? 0L : sleepDayData.getEndSleepTime();
        if (endSleepTime > 0) {
            j2 = !this$0.isIWatch ? endSleepTime - 60000 : endSleepTime;
        }
        return pr8.INSTANCE.y(j2, o15.DATE_FORMAT_HOUR);
    }

    public final void A7() {
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding = this.binding;
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding2 = null;
        if (healthSleepActDayHorizontalBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding = null;
        }
        healthSleepActDayHorizontalBinding.s.setOnChartGestureListener(new a());
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding3 = this.binding;
        if (healthSleepActDayHorizontalBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding3 = null;
        }
        healthSleepActDayHorizontalBinding3.s.setOnChartValueSelectedListener(new b());
        CommonMarkerView commonMarkerView = new CommonMarkerView(this, new c());
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding4 = this.binding;
        if (healthSleepActDayHorizontalBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding4 = null;
        }
        commonMarkerView.setChartView(healthSleepActDayHorizontalBinding4.s);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding5 = this.binding;
        if (healthSleepActDayHorizontalBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding5 = null;
        }
        healthSleepActDayHorizontalBinding5.s.setMarker(commonMarkerView);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding6 = this.binding;
        if (healthSleepActDayHorizontalBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding6 = null;
        }
        healthSleepActDayHorizontalBinding6.s.setHighlightPerDragEnabled(false);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding7 = this.binding;
        if (healthSleepActDayHorizontalBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            healthSleepActDayHorizontalBinding2 = healthSleepActDayHorizontalBinding7;
        }
        healthSleepActDayHorizontalBinding2.s.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.rih
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d2) {
                return SleepDayHorizontalActivity.B7(this.a, i, d2);
            }
        });
    }

    public final void C7() {
        String ssoid;
        this.curDayStartTime = getIntent().getLongExtra("startTime", 0L);
        long longExtra = getIntent().getLongExtra("endTime", 0L);
        this.curDayEndTime = longExtra;
        if (this.curDayStartTime <= 0 || longExtra <= 0) {
            m8b.b(this.TAG, "parameter error!");
            finish();
            return;
        }
        if (LocalDateTime.ofInstant(Instant.ofEpochMilli(longExtra), ZoneId.systemDefault()).getYear() == LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).getYear()) {
            TextView textView = this.tvSleepTime;
            if (textView != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%s, %s", Arrays.copyOf(new Object[]{pr8.INSTANCE.y(this.curDayEndTime, "MMMdd"), WeekStrUtils.c(this.curDayEndTime)}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
            }
        } else {
            TextView textView2 = this.tvSleepTime;
            if (textView2 != null) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format("%s, %s", Arrays.copyOf(new Object[]{pr8.INSTANCE.y(this.curDayEndTime, "yyyMMMd"), WeekStrUtils.c(this.curDayEndTime)}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                textView2.setText(str2);
            }
        }
        LinearLayout linearLayout = this.mLoadingLayout;
        Intrinsics.checkNotNull(linearLayout);
        linearLayout.setVisibility(0);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding = this.binding;
        if (healthSleepActDayHorizontalBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding = null;
        }
        healthSleepActDayHorizontalBinding.s.setVisibility(4);
        this.viewModel = (SleepDayViewModel2) new ViewModelProvider(this).get(SleepDayViewModel2.class);
        FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean = this.familyDetailConfig;
        if (familyMoreDataDetailConfigBean != null && (ssoid = familyMoreDataDetailConfigBean.getSsoid()) != null) {
            SleepDayViewModel2 sleepDayViewModel2 = this.viewModel;
            Intrinsics.checkNotNull(sleepDayViewModel2);
            sleepDayViewModel2.S(ssoid);
        }
        SleepDayViewModel2 sleepDayViewModel3 = this.viewModel;
        Intrinsics.checkNotNull(sleepDayViewModel3);
        sleepDayViewModel3.F().observe(this, new d(new Function1<ich, Unit>() { // from class: com.heytap.health.sleep.day.SleepDayHorizontalActivity$initData$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ich ichVar) {
                invoke2(ichVar);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ich ichVar) {
                LinearLayout linearLayout2 = this.this$0.mLoadingLayout;
                Intrinsics.checkNotNull(linearLayout2);
                linearLayout2.setVisibility(8);
                HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding2 = this.this$0.binding;
                if (healthSleepActDayHorizontalBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    healthSleepActDayHorizontalBinding2 = null;
                }
                boolean z = false;
                healthSleepActDayHorizontalBinding2.s.setVisibility(0);
                this.this$0.sleepAssembleBean = ichVar;
                SleepDayHorizontalActivity sleepDayHorizontalActivity = this.this$0;
                SleepDayBean sleepDayData = ichVar.getSleepDayData();
                if (sleepDayData != null && sleepDayData.isIWatch()) {
                    z = true;
                }
                sleepDayHorizontalActivity.isIWatch = z;
                this.this$0.F7();
            }
        }));
        SleepDayViewModel2 sleepDayViewModel4 = this.viewModel;
        Intrinsics.checkNotNull(sleepDayViewModel4);
        sleepDayViewModel4.K(this.curDayStartTime, this.curDayEndTime);
    }

    public final void D7() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        String strD = fdg.x("health_common_sp_name").D("display_vertical_screen");
        if (strD == null || strD.length() == 0) {
            return;
        }
        DisplayMetrics displayMetrics2 = (DisplayMetrics) vd8.a(strD, DisplayMetrics.class);
        if (displayMetrics2 == null) {
            m8b.f(this.TAG, "spDisplayMetrics is null");
            return;
        }
        displayMetrics.density = displayMetrics2.density;
        displayMetrics.densityDpi = displayMetrics2.densityDpi;
        displayMetrics.scaledDensity = displayMetrics2.scaledDensity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E7(MotionEvent motionEvent) {
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding = this.binding;
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding2 = null;
        if (healthSleepActDayHorizontalBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding = null;
        }
        if (healthSleepActDayHorizontalBinding.s.getData() != 0) {
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding3 = this.binding;
            if (healthSleepActDayHorizontalBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                healthSleepActDayHorizontalBinding3 = null;
            }
            Highlight highlightByTouchPoint = healthSleepActDayHorizontalBinding3.s.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
            if (highlightByTouchPoint == null) {
                return;
            }
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding4 = this.binding;
            if (healthSleepActDayHorizontalBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                healthSleepActDayHorizontalBinding4 = null;
            }
            Entry entryForHighlight = ((CombinedData) healthSleepActDayHorizontalBinding4.s.getData()).getEntryForHighlight(highlightByTouchPoint);
            if (entryForHighlight == null) {
                return;
            }
            if (entryForHighlight instanceof SleepDailyEntry) {
                SleepDailyEntry sleepDailyEntry = (SleepDailyEntry) entryForHighlight;
                if (sleepDailyEntry.getData() != null) {
                    Object data = sleepDailyEntry.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.data.SleepUnitData");
                    SleepUnitData sleepUnitData = (SleepUnitData) data;
                    Map<Integer, Integer> map = this.sleepDrawModelMap;
                    if (map != null) {
                        Intrinsics.checkNotNull(map);
                        if (map.containsKey(Integer.valueOf(sleepUnitData.getType()))) {
                            Map<Integer, Integer> map2 = this.sleepDrawModelMap;
                            Intrinsics.checkNotNull(map2);
                            Integer num = map2.get(Integer.valueOf(sleepUnitData.getType()));
                            if (num != null && num.intValue() != 1) {
                                HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding5 = this.binding;
                                if (healthSleepActDayHorizontalBinding5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                } else {
                                    healthSleepActDayHorizontalBinding2 = healthSleepActDayHorizontalBinding5;
                                }
                                healthSleepActDayHorizontalBinding2.s.setHighlightPerTapEnabled(false);
                                return;
                            }
                        }
                    }
                }
            }
        }
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding6 = this.binding;
        if (healthSleepActDayHorizontalBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            healthSleepActDayHorizontalBinding2 = healthSleepActDayHorizontalBinding6;
        }
        healthSleepActDayHorizontalBinding2.s.setHighlightPerTapEnabled(true);
    }

    @Override // com.oplus.aiunit.vision.oz0
    public boolean F3() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    public final void F7() {
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding;
        ArrayList<TimeStampedData> arrayListE;
        ArrayList<TimeStampedData> arrayListA;
        ich ichVar = this.sleepAssembleBean;
        Intrinsics.checkNotNull(ichVar);
        boolean z = false;
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding2 = null;
        if (ichVar.getSleepDayData() != null) {
            ich ichVar2 = this.sleepAssembleBean;
            Intrinsics.checkNotNull(ichVar2);
            SleepDayBean sleepDayData = ichVar2.getSleepDayData();
            Intrinsics.checkNotNull(sleepDayData);
            if (sleepDayData.getTotalREMSleepTime() > 0) {
                HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding3 = this.binding;
                if (healthSleepActDayHorizontalBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    healthSleepActDayHorizontalBinding3 = null;
                }
                healthSleepActDayHorizontalBinding3.q.setVisibility(0);
            } else {
                healthSleepActDayHorizontalBinding = this.binding;
                if (healthSleepActDayHorizontalBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    healthSleepActDayHorizontalBinding = null;
                }
                healthSleepActDayHorizontalBinding.q.setVisibility(8);
            }
        } else {
            healthSleepActDayHorizontalBinding = this.binding;
            if (healthSleepActDayHorizontalBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                healthSleepActDayHorizontalBinding = null;
            }
            healthSleepActDayHorizontalBinding.q.setVisibility(8);
        }
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding4 = this.binding;
        if (healthSleepActDayHorizontalBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding4 = null;
        }
        SleepCombinedChart sleepCombinedChart = healthSleepActDayHorizontalBinding4.s;
        ich ichVar3 = this.sleepAssembleBean;
        ArrayList<SleepUnitData> arrayListB = ichVar3 != null ? ichVar3.b() : null;
        ich ichVar4 = this.sleepAssembleBean;
        ArrayList<TimeStampedData> arrayListA2 = ichVar4 != null ? ichVar4.a() : null;
        ich ichVar5 = this.sleepAssembleBean;
        sleepCombinedChart.C(arrayListB, arrayListA2, ichVar5 != null ? ichVar5.e() : null);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding5 = this.binding;
        if (healthSleepActDayHorizontalBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding5 = null;
        }
        healthSleepActDayHorizontalBinding5.s.w();
        ich ichVar6 = this.sleepAssembleBean;
        Intrinsics.checkNotNull(ichVar6);
        if (ichVar6.getSleepDayData() != null) {
            ich ichVar7 = this.sleepAssembleBean;
            Intrinsics.checkNotNull(ichVar7);
            SleepDayBean sleepDayData2 = ichVar7.getSleepDayData();
            Intrinsics.checkNotNull(sleepDayData2);
            String strC = s15.c(sleepDayData2.getTotalSleepTime(), true);
            TextView textView = this.tvSleepTitle;
            if (textView != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = getString(R$string.health_sleep_total_suggest_time);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.healt…sleep_total_suggest_time)");
                String str = String.format(string, Arrays.copyOf(new Object[]{strC}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
            }
        }
        ich ichVar8 = this.sleepAssembleBean;
        this.noHeartRateData = (ichVar8 == null || (arrayListA = ichVar8.a()) == null || !arrayListA.isEmpty()) ? false : true;
        ich ichVar9 = this.sleepAssembleBean;
        if (ichVar9 != null && (arrayListE = ichVar9.e()) != null && arrayListE.isEmpty()) {
            z = true;
        }
        this.noSpo2Data = z;
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding6 = this.binding;
        if (healthSleepActDayHorizontalBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding6 = null;
        }
        healthSleepActDayHorizontalBinding6.f6703l.setTextColor(this.noHeartRateData ? getColor(R$color.health_base_black_20alpha) : getColor(R$color.health_base_black_85alpha));
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding7 = this.binding;
        if (healthSleepActDayHorizontalBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            healthSleepActDayHorizontalBinding2 = healthSleepActDayHorizontalBinding7;
        }
        healthSleepActDayHorizontalBinding2.t.setTextColor(this.noSpo2Data ? getColor(R$color.health_base_black_20alpha) : getColor(R$color.health_base_black_85alpha));
    }

    public final void G7(int type, boolean checked) {
        if (type == 1) {
            com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 1).a("element", Integer.valueOf(!checked ? 1 : 0)).b();
            return;
        }
        if (type == 2) {
            com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 2).a("element", Integer.valueOf(!checked ? 1 : 0)).b();
            return;
        }
        if (type == 3) {
            com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 3).a("element", Integer.valueOf(!checked ? 1 : 0)).b();
            return;
        }
        if (type == 4) {
            com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 4).a("element", Integer.valueOf(!checked ? 1 : 0)).b();
        } else if (type == this.HEART_RATE_TYPE) {
            com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 5).a("element", Integer.valueOf(!checked ? 1 : 0)).b();
        } else if (type == this.SPO2_TYPE) {
            com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 6).a("element", Integer.valueOf(!checked ? 1 : 0)).b();
        }
    }

    public final void H7() {
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding = this.binding;
        if (healthSleepActDayHorizontalBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding = null;
        }
        boolean zValuesToHighlight = healthSleepActDayHorizontalBinding.s.valuesToHighlight();
        TextView textView = this.tvSleepTitle;
        if (textView != null) {
            Intrinsics.checkNotNull(textView);
            float alpha = textView.getAlpha();
            float f = zValuesToHighlight ? 0.0f : 1.0f;
            if (alpha == f) {
                return;
            }
            TextView textView2 = this.tvSleepTitle;
            Intrinsics.checkNotNull(textView2);
            textView2.setAlpha(f);
            TextView textView3 = this.tvSleepTime;
            if (textView3 == null) {
                return;
            }
            textView3.setAlpha(f);
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initView() {
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding = this.binding;
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding2 = null;
        if (healthSleepActDayHorizontalBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding = null;
        }
        COUIToolbar cOUIToolbar = healthSleepActDayHorizontalBinding.m;
        this.toolbar = cOUIToolbar;
        Intrinsics.checkNotNull(cOUIToolbar);
        cOUIToolbar.setTitle(getString(R$string.health_sleep));
        COUIToolbar cOUIToolbar2 = this.toolbar;
        Intrinsics.checkNotNull(cOUIToolbar2);
        S1(this, cOUIToolbar2, true);
        this.mLoadingLayout = (LinearLayout) findViewById(R$id.rank_loading_layout);
        this.tvSleepTitle = (TextView) findViewById(R$id.tv_sleep_title);
        this.tvSleepTime = (TextView) findViewById(R$id.tv_sleep_time);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding3 = this.binding;
        if (healthSleepActDayHorizontalBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding3 = null;
        }
        this.sleepDrawModelMap = healthSleepActDayHorizontalBinding3.s.getSleepDrawModelMap();
        A7();
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding4 = this.binding;
        if (healthSleepActDayHorizontalBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding4 = null;
        }
        healthSleepActDayHorizontalBinding4.f6702j.setOnClickListener(this);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding5 = this.binding;
        if (healthSleepActDayHorizontalBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding5 = null;
        }
        healthSleepActDayHorizontalBinding5.f6704n.setOnClickListener(this);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding6 = this.binding;
        if (healthSleepActDayHorizontalBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding6 = null;
        }
        healthSleepActDayHorizontalBinding6.q.setOnClickListener(this);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding7 = this.binding;
        if (healthSleepActDayHorizontalBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding7 = null;
        }
        healthSleepActDayHorizontalBinding7.w.setOnClickListener(this);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding8 = this.binding;
        if (healthSleepActDayHorizontalBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding8 = null;
        }
        healthSleepActDayHorizontalBinding8.f6703l.setOnClickListener(this);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding9 = this.binding;
        if (healthSleepActDayHorizontalBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            healthSleepActDayHorizontalBinding2 = healthSleepActDayHorizontalBinding9;
        }
        healthSleepActDayHorizontalBinding2.t.setOnClickListener(this);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding = null;
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding2 = null;
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding3 = null;
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding4 = null;
        Integer numValueOf = v != null ? Integer.valueOf(v.getId()) : null;
        int i = R$id.deepSleep;
        if (numValueOf != null && numValueOf.intValue() == i) {
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding5 = this.binding;
            if (healthSleepActDayHorizontalBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                healthSleepActDayHorizontalBinding = healthSleepActDayHorizontalBinding5;
            }
            TextView textView = healthSleepActDayHorizontalBinding.f6702j;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.deepSleep");
            y7(1, textView);
            return;
        }
        int i2 = R$id.lightSleep;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding6 = this.binding;
            if (healthSleepActDayHorizontalBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                healthSleepActDayHorizontalBinding2 = healthSleepActDayHorizontalBinding6;
            }
            TextView textView2 = healthSleepActDayHorizontalBinding2.f6704n;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.lightSleep");
            y7(2, textView2);
            return;
        }
        int i3 = R$id.remSleep;
        if (numValueOf != null && numValueOf.intValue() == i3) {
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding7 = this.binding;
            if (healthSleepActDayHorizontalBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                healthSleepActDayHorizontalBinding3 = healthSleepActDayHorizontalBinding7;
            }
            TextView textView3 = healthSleepActDayHorizontalBinding3.q;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.remSleep");
            y7(3, textView3);
            return;
        }
        int i4 = R$id.wakeSleep;
        if (numValueOf != null && numValueOf.intValue() == i4) {
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding8 = this.binding;
            if (healthSleepActDayHorizontalBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                healthSleepActDayHorizontalBinding4 = healthSleepActDayHorizontalBinding8;
            }
            TextView textView4 = healthSleepActDayHorizontalBinding4.w;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.wakeSleep");
            y7(4, textView4);
            return;
        }
        int i5 = R$id.heartRate;
        if (numValueOf != null && numValueOf.intValue() == i5) {
            if (this.noHeartRateData) {
                return;
            }
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding9 = this.binding;
            if (healthSleepActDayHorizontalBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                healthSleepActDayHorizontalBinding9 = null;
            }
            healthSleepActDayHorizontalBinding9.s.highlightValue((Highlight) null, true);
            if (this.lineDrawModel == 1) {
                this.lineDrawModel = 0;
                G7(this.HEART_RATE_TYPE, false);
            } else {
                this.lineDrawModel = 1;
                G7(this.HEART_RATE_TYPE, true);
            }
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding10 = this.binding;
            if (healthSleepActDayHorizontalBinding10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                healthSleepActDayHorizontalBinding10 = null;
            }
            healthSleepActDayHorizontalBinding10.s.setLineDrawModel(this.lineDrawModel);
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding11 = this.binding;
            if (healthSleepActDayHorizontalBinding11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                healthSleepActDayHorizontalBinding11 = null;
            }
            SleepCombinedChart sleepCombinedChart = healthSleepActDayHorizontalBinding11.s;
            ich ichVar = this.sleepAssembleBean;
            ArrayList<SleepUnitData> arrayListB = ichVar != null ? ichVar.b() : null;
            ich ichVar2 = this.sleepAssembleBean;
            ArrayList<TimeStampedData> arrayListA = ichVar2 != null ? ichVar2.a() : null;
            ich ichVar3 = this.sleepAssembleBean;
            sleepCombinedChart.C(arrayListB, arrayListA, ichVar3 != null ? ichVar3.e() : null);
            z7();
            return;
        }
        int i6 = R$id.spo2;
        if (numValueOf == null || numValueOf.intValue() != i6 || this.noSpo2Data) {
            return;
        }
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding12 = this.binding;
        if (healthSleepActDayHorizontalBinding12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding12 = null;
        }
        healthSleepActDayHorizontalBinding12.s.highlightValue((Highlight) null, true);
        if (this.lineDrawModel == 2) {
            this.lineDrawModel = 0;
            G7(this.SPO2_TYPE, false);
        } else {
            this.lineDrawModel = 2;
            G7(this.SPO2_TYPE, true);
        }
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding13 = this.binding;
        if (healthSleepActDayHorizontalBinding13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding13 = null;
        }
        healthSleepActDayHorizontalBinding13.s.setLineDrawModel(this.lineDrawModel);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding14 = this.binding;
        if (healthSleepActDayHorizontalBinding14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding14 = null;
        }
        SleepCombinedChart sleepCombinedChart2 = healthSleepActDayHorizontalBinding14.s;
        ich ichVar4 = this.sleepAssembleBean;
        ArrayList<SleepUnitData> arrayListB2 = ichVar4 != null ? ichVar4.b() : null;
        ich ichVar5 = this.sleepAssembleBean;
        ArrayList<TimeStampedData> arrayListA2 = ichVar5 != null ? ichVar5.a() : null;
        ich ichVar6 = this.sleepAssembleBean;
        sleepCombinedChart2.C(arrayListB2, arrayListA2, ichVar6 != null ? ichVar6.e() : null);
        z7();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setNavigationBarColor(0);
        super.onCreate(savedInstanceState);
        D7();
        this.familyDetailConfig = (FamilyMoreDataDetailConfigBean) getIntent().getSerializableExtra("ARGUMENT_MORE_DATA_DETAIL");
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBindingC = HealthSleepActDayHorizontalBinding.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(healthSleepActDayHorizontalBindingC, "inflate(layoutInflater)");
        this.binding = healthSleepActDayHorizontalBindingC;
        if (healthSleepActDayHorizontalBindingC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBindingC = null;
        }
        setContentView(healthSleepActDayHorizontalBindingC.getRoot());
        initView();
        C7();
    }

    @Override // com.oplus.aiunit.vision.mz0
    public boolean s2() {
        return false;
    }

    public final void y7(int type, TextView view) {
        Map<Integer, Integer> map = this.sleepDrawModelMap;
        Intrinsics.checkNotNull(map);
        if (map.containsKey(Integer.valueOf(type))) {
            Map<Integer, Integer> map2 = this.sleepDrawModelMap;
            Intrinsics.checkNotNull(map2);
            Integer num = map2.get(Integer.valueOf(type));
            if (num == null || num.intValue() == 1) {
                view.setBackgroundResource(R$drawable.health_sleep_bg_round_un_select);
                view.setTextColor(getColor(R$color.health_base_black_85alpha));
                Integer numValueOf = Integer.valueOf(type);
                Map<Integer, Integer> map3 = this.sleepDrawModelMap;
                Intrinsics.checkNotNull(map3);
                map3.put(numValueOf, 0);
                G7(type, false);
            } else {
                view.setBackgroundResource(R$drawable.health_sleep_bg_round_select);
                view.setTextColor(getColor(R$color.health_base_white));
                Integer numValueOf2 = Integer.valueOf(type);
                Map<Integer, Integer> map4 = this.sleepDrawModelMap;
                Intrinsics.checkNotNull(map4);
                map4.put(numValueOf2, 1);
                G7(type, true);
            }
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding = this.binding;
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding2 = null;
            if (healthSleepActDayHorizontalBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                healthSleepActDayHorizontalBinding = null;
            }
            healthSleepActDayHorizontalBinding.s.highlightValue((Highlight) null, true);
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding3 = this.binding;
            if (healthSleepActDayHorizontalBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                healthSleepActDayHorizontalBinding2 = healthSleepActDayHorizontalBinding3;
            }
            healthSleepActDayHorizontalBinding2.s.invalidate();
        }
    }

    @Override // com.oplus.aiunit.vision.mz0
    public boolean z0() {
        return true;
    }

    public final void z7() {
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding = this.binding;
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding2 = null;
        if (healthSleepActDayHorizontalBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding = null;
        }
        TextView textView = healthSleepActDayHorizontalBinding.f6703l;
        int i = R$drawable.health_sleep_bg_round_un_select;
        textView.setBackgroundResource(i);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding3 = this.binding;
        if (healthSleepActDayHorizontalBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding3 = null;
        }
        healthSleepActDayHorizontalBinding3.f6703l.setTextColor(this.noHeartRateData ? getColor(R$color.health_base_black_20alpha) : getColor(R$color.health_base_black_85alpha));
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding4 = this.binding;
        if (healthSleepActDayHorizontalBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding4 = null;
        }
        healthSleepActDayHorizontalBinding4.t.setBackgroundResource(i);
        HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding5 = this.binding;
        if (healthSleepActDayHorizontalBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            healthSleepActDayHorizontalBinding5 = null;
        }
        healthSleepActDayHorizontalBinding5.t.setTextColor(this.noSpo2Data ? getColor(R$color.health_base_black_20alpha) : getColor(R$color.health_base_black_85alpha));
        int i2 = this.lineDrawModel;
        if (i2 == 1) {
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding6 = this.binding;
            if (healthSleepActDayHorizontalBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                healthSleepActDayHorizontalBinding6 = null;
            }
            healthSleepActDayHorizontalBinding6.f6703l.setBackgroundResource(R$drawable.health_sleep_bg_round_select);
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding7 = this.binding;
            if (healthSleepActDayHorizontalBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                healthSleepActDayHorizontalBinding2 = healthSleepActDayHorizontalBinding7;
            }
            healthSleepActDayHorizontalBinding2.f6703l.setTextColor(getColor(R$color.health_base_white));
            return;
        }
        if (i2 == 2) {
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding8 = this.binding;
            if (healthSleepActDayHorizontalBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                healthSleepActDayHorizontalBinding8 = null;
            }
            healthSleepActDayHorizontalBinding8.t.setBackgroundResource(R$drawable.health_sleep_bg_round_select);
            HealthSleepActDayHorizontalBinding healthSleepActDayHorizontalBinding9 = this.binding;
            if (healthSleepActDayHorizontalBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                healthSleepActDayHorizontalBinding2 = healthSleepActDayHorizontalBinding9;
            }
            healthSleepActDayHorizontalBinding2.t.setTextColor(getColor(R$color.health_base_white));
        }
    }
}