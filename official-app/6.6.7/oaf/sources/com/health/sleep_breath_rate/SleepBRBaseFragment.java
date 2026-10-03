package com.health.sleep_breath_rate;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.health.sleep_breath_rate.SleepBRBaseFragment;
import com.health.sleep_breath_rate.listener.SleepBRChartTouchListener;
import com.health.sleep_breath_rate.view.CalendarPanelFragment;
import com.health.sleep_breath_rate.view.SleepBRChart;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.track.a;
import com.heytap.health.base.view.CommonScrollTopLineView;
import com.heytap.health.base.view.recyclercard.RecyclerCardController;
import com.heytap.health.base.view.recyclercard.RecyclerCardLayout;
import com.heytap.health.health_base.R;
import com.oplus.aiunit.vision.adh;
import com.oplus.aiunit.vision.dq8;
import com.oplus.aiunit.vision.pdh;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.w4l;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\b'\u0018\u0000 \u008e\u00012\u00020\u0001:\u0002\u008f\u0001B\t¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&J \u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0004J\u0016\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$H&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00102\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u0010)R\u0016\u0010:\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010)R\u0016\u0010<\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010)R\u0016\u0010>\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010)R\"\u0010E\u001a\u00020\u000b8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010\\\u001a\u00020!8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010d\u001a\u0004\u0018\u00010]8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001b\u0010r\u001a\u00020m8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\"\u0010y\u001a\u00020\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010}\u001a\u00020\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bz\u0010t\u001a\u0004\b{\u0010v\"\u0004\b|\u0010xR$\u0010\u0081\u0001\u001a\u00020\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0013\n\u0004\b~\u0010t\u001a\u0004\b\u007f\u0010v\"\u0005\b\u0080\u0001\u0010xR&\u0010\u0085\u0001\u001a\u00020\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010t\u001a\u0005\b\u0083\u0001\u0010v\"\u0005\b\u0084\u0001\u0010xR%\u0010\u0088\u0001\u001a\u00020!8\u0004@\u0004X\u0084\u000e¢\u0006\u0014\n\u0004\bt\u0010W\u001a\u0005\b\u0086\u0001\u0010Y\"\u0005\b\u0087\u0001\u0010[R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u0090\u0001"}, d2 = {"Lcom/health/sleep_breath_rate/SleepBRBaseFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "", "z0", "Z0", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "dialogFragment", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "n0", "", "getLayoutId", "Landroid/view/View;", "view", "initView", "h0", "g0", "initData", "y0", "", "Lcom/oplus/aiunit/vision/dq8;", "p0", "d1", "Ljava/time/LocalDate;", "date", "J0", "", "startTime", "endTime", "", "str", "V0", "Lcom/oplus/aiunit/vision/pdh;", "visibleDataBean", "", "showThreshold", "K0", "", "moveToXvalue", "j0", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "tvDate", "Landroid/widget/ImageView;", "p", "Landroid/widget/ImageView;", "ivDown", "q", "ivLast", "r", "ivNext", "Landroidx/core/widget/NestedScrollView;", "s", "Landroidx/core/widget/NestedScrollView;", "scrollView", "t", "tvRangeTitle", "u", "tvNoData", "v", "tvRangeValue", "w", "tvRangeValueUnit", "x", "Landroid/view/View;", "w0", "()Landroid/view/View;", "X0", "(Landroid/view/View;)V", "loadingView", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardLayout;", "y", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardLayout;", "recyclerCardLayout", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardController;", "z", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardController;", "controller", "Lcom/health/sleep_breath_rate/view/SleepBRChart;", "A", "Lcom/health/sleep_breath_rate/view/SleepBRChart;", "q0", "()Lcom/health/sleep_breath_rate/view/SleepBRChart;", "N0", "(Lcom/health/sleep_breath_rate/view/SleepBRChart;)V", "chart", "B", "Z", "H0", "()Z", "Y0", "(Z)V", "isNotData", "Lcom/oplus/aiunit/vision/adh;", "C", "Lcom/oplus/aiunit/vision/adh;", "v0", "()Lcom/oplus/aiunit/vision/adh;", "W0", "(Lcom/oplus/aiunit/vision/adh;)V", "gluChartDataBean", "Lcom/health/sleep_breath_rate/listener/SleepBRChartTouchListener;", "D", "Lcom/health/sleep_breath_rate/listener/SleepBRChartTouchListener;", "t0", "()Lcom/health/sleep_breath_rate/listener/SleepBRChartTouchListener;", "Q0", "(Lcom/health/sleep_breath_rate/listener/SleepBRChartTouchListener;)V", "chartTouchListener", "Lcom/health/sleep_breath_rate/SleepBRHistoryActivity;", "E", "Lkotlin/Lazy;", "x0", "()Lcom/health/sleep_breath_rate/SleepBRHistoryActivity;", "parentActivity", "F", "J", "s0", "()J", "P0", "(J)V", "chartLowestVisibleTime", "G", "r0", "O0", "chartHighestVisibleTime", "H", "k0", "M0", "borderStartTime", "I", "getBorderEndTime", "L0", "borderEndTime", "u0", "R0", "clickChangeDate", "K", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "calendarDialogFragment", "<init>", "()V", "Companion", "a", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBRBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBRBaseFragment.kt\ncom/health/sleep_breath_rate/SleepBRBaseFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,330:1\n1855#2,2:331\n*S KotlinDebug\n*F\n+ 1 SleepBRBaseFragment.kt\ncom/health/sleep_breath_rate/SleepBRBaseFragment\n*L\n249#1:331,2\n*E\n"})
public abstract class SleepBRBaseFragment extends BaseFragment {
    public SleepBRChart A;

    @Nullable
    public adh C;
    public SleepBRChartTouchListener D;
    public long F;
    public long G;
    public long H;
    public long I;
    public boolean J;

    @Nullable
    public COUIBottomSheetDialogFragment K;
    public TextView o;
    public ImageView p;
    public ImageView q;
    public ImageView r;
    public NestedScrollView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public View x;
    public RecyclerCardLayout y;
    public RecyclerCardController z;
    public static final int $stable = 8;
    public boolean B = true;

    @NotNull
    public final Lazy E = LazyKt.lazy(new Function0<SleepBRHistoryActivity>() { // from class: com.health.sleep_breath_rate.SleepBRBaseFragment$parentActivity$2
        {
            super(0);
        }

        @NotNull
        public final SleepBRHistoryActivity invoke() {
            SleepBRHistoryActivity sleepBRHistoryActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNull(sleepBRHistoryActivityRequireActivity, "null cannot be cast to non-null type com.health.sleep_breath_rate.SleepBRHistoryActivity");
            return sleepBRHistoryActivityRequireActivity;
        }
    });

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/health/sleep_breath_rate/SleepBRBaseFragment$b", "Lcom/github/mikephil/charting/listener/OnChartValueSelectedListener;", "Lcom/github/mikephil/charting/data/Entry;", "e", "Lcom/github/mikephil/charting/highlight/Highlight;", "h", "", "onValueSelected", "onNothingSelected", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements OnChartValueSelectedListener {
        public b() {
        }

        public void onNothingSelected() {
            SleepBRBaseFragment.this.q0().setSelectedIndex(-1);
            SleepBRBaseFragment.this.d1();
        }

        public void onValueSelected(@Nullable Entry e, @Nullable Highlight h) {
            int iRoundToInt = MathKt.roundToInt(e != null ? e.getX() : -1.0f);
            StringBuilder sb = new StringBuilder();
            sb.append("onValueSelected index=");
            sb.append(iRoundToInt);
            SleepBRBaseFragment.this.q0().setSelectedIndex(iRoundToInt);
            SleepBRBaseFragment.this.d1();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "function");
            this.i = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    @SensorsDataInstrumented
    public static final void A0(SleepBRBaseFragment sleepBRBaseFragment, View view) {
        Intrinsics.checkNotNullParameter(sleepBRBaseFragment, "this$0");
        float fT = sleepBRBaseFragment.t0().t(false);
        if (fT > 0.0f) {
            sleepBRBaseFragment.q0().c(Float.valueOf(fT), Float.valueOf(sleepBRBaseFragment.q0().getVisibleXRange() + fT));
        } else {
            sleepBRBaseFragment.q0().b();
        }
        sleepBRBaseFragment.J = true;
        String strJ0 = sleepBRBaseFragment.j0(fT);
        StringBuilder sb = new StringBuilder();
        sb.append("targetDate:");
        sb.append(strJ0);
        sleepBRBaseFragment.x0().s7(new Function0<Unit>() { // from class: com.health.sleep_breath_rate.SleepBRBaseFragment$initView$3$1
            public final void invoke() {
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Unit.INSTANCE;
            }
        });
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @SensorsDataInstrumented
    public static final void B0(SleepBRBaseFragment sleepBRBaseFragment, View view) {
        Intrinsics.checkNotNullParameter(sleepBRBaseFragment, "this$0");
        float fT = sleepBRBaseFragment.t0().t(true);
        if (fT > 0.0f) {
            sleepBRBaseFragment.q0().c(Float.valueOf(fT), Float.valueOf(sleepBRBaseFragment.q0().getVisibleXRange() + fT));
        } else {
            sleepBRBaseFragment.q0().b();
        }
        sleepBRBaseFragment.J = true;
        String strJ0 = sleepBRBaseFragment.j0(fT);
        StringBuilder sb = new StringBuilder();
        sb.append("targetDate:");
        sb.append(strJ0);
        sleepBRBaseFragment.x0().s7(new Function0<Unit>() { // from class: com.health.sleep_breath_rate.SleepBRBaseFragment$initView$4$1
            public final void invoke() {
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Unit.INSTANCE;
            }
        });
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @SensorsDataInstrumented
    public static final void F0(SleepBRBaseFragment sleepBRBaseFragment, View view) {
        Intrinsics.checkNotNullParameter(sleepBRBaseFragment, "this$0");
        sleepBRBaseFragment.Z0();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @SensorsDataInstrumented
    public static final void G0(SleepBRBaseFragment sleepBRBaseFragment, View view) {
        Intrinsics.checkNotNullParameter(sleepBRBaseFragment, "this$0");
        sleepBRBaseFragment.Z0();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public final boolean getB() {
        return this.B;
    }

    public abstract void J0(@NotNull LocalDate date);

    public final void K0(@NotNull pdh visibleDataBean, boolean showThreshold) {
        Intrinsics.checkNotNullParameter(visibleDataBean, "visibleDataBean");
        if (showThreshold) {
            q0().I(visibleDataBean.getD(), visibleDataBean.getE());
        }
        q0().J(visibleDataBean.getB(), visibleDataBean.getC());
        TextView textView = null;
        if (visibleDataBean.getA()) {
            TextView textView2 = this.u;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvNoData");
                textView2 = null;
            }
            textView2.setVisibility(0);
            TextView textView3 = this.v;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvRangeValue");
                textView3 = null;
            }
            textView3.setVisibility(8);
            TextView textView4 = this.w;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvRangeValueUnit");
            } else {
                textView = textView4;
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView5 = this.v;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeValue");
            textView5 = null;
        }
        textView5.setText(visibleDataBean.getB() + "-" + visibleDataBean.getC());
        TextView textView6 = this.u;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvNoData");
            textView6 = null;
        }
        textView6.setVisibility(8);
        TextView textView7 = this.v;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeValue");
            textView7 = null;
        }
        textView7.setVisibility(0);
        TextView textView8 = this.w;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeValueUnit");
        } else {
            textView = textView8;
        }
        textView.setVisibility(0);
    }

    public final void L0(long j) {
        this.I = j;
    }

    public final void M0(long j) {
        this.H = j;
    }

    public final void N0(@NotNull SleepBRChart sleepBRChart) {
        Intrinsics.checkNotNullParameter(sleepBRChart, "<set-?>");
        this.A = sleepBRChart;
    }

    public final void O0(long j) {
        this.G = j;
    }

    public final void P0(long j) {
        this.F = j;
    }

    public final void Q0(@NotNull SleepBRChartTouchListener sleepBRChartTouchListener) {
        Intrinsics.checkNotNullParameter(sleepBRChartTouchListener, "<set-?>");
        this.D = sleepBRChartTouchListener;
    }

    public final void R0(boolean z) {
        this.J = z;
    }

    public final void V0(long startTime, long endTime, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        ImageView imageView = this.q;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLast");
            imageView = null;
        }
        imageView.setVisibility(startTime <= this.H ? 8 : 0);
        ImageView imageView2 = this.r;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNext");
            imageView2 = null;
        }
        pr8 pr8Var = pr8.INSTANCE;
        imageView2.setVisibility(pr8Var.e(endTime) < pr8Var.e(this.I) ? 0 : 8);
        TextView textView2 = this.o;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDate");
        } else {
            textView = textView2;
        }
        textView.setText(str);
    }

    public final void W0(@Nullable adh adhVar) {
        this.C = adhVar;
    }

    public final void X0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.x = view;
    }

    public final void Y0(boolean z) {
        this.B = z;
    }

    public final void Z0() {
        FragmentActivity activity;
        FragmentManager supportFragmentManager;
        List fragments;
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment;
        if (this.C == null || (activity = getActivity()) == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(fragments, "fragments");
        Iterator it = fragments.iterator();
        while (it.hasNext()) {
            if (((Fragment) it.next()) instanceof SleepBRBaseFragment) {
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = this.K;
                if (cOUIBottomSheetDialogFragment2 != null) {
                    cOUIBottomSheetDialogFragment2.dismiss();
                }
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment3 = new COUIBottomSheetDialogFragment();
                this.K = cOUIBottomSheetDialogFragment3;
                cOUIBottomSheetDialogFragment3.setMainPanelFragment(n0(cOUIBottomSheetDialogFragment3));
                FragmentActivity activity2 = getActivity();
                if (activity2 != null && (cOUIBottomSheetDialogFragment = this.K) != null) {
                    cOUIBottomSheetDialogFragment.show(activity2.getSupportFragmentManager(), "calendar Panel fragment");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x006d  */
    public void d1() {
        boolean z;
        float fCeil = (float) Math.ceil(q0().getLowestVisibleX());
        float fFloor = (float) Math.floor(q0().getHighestVisibleX());
        double xStart = q0().getXStart();
        int selectedIndex = q0().getSelectedIndex();
        int selectedIndex2 = q0().getSelectedIndex();
        StringBuilder sb = new StringBuilder();
        sb.append("updateRangeValueVisible() xStart=");
        sb.append(xStart);
        sb.append(" low=");
        sb.append(fCeil);
        sb.append("; high=");
        sb.append(fFloor);
        sb.append("; selectedIndex=");
        sb.append(selectedIndex2);
        sb.append(" ");
        if (selectedIndex >= 0) {
            float f = selectedIndex;
            if (f < fCeil || f > fFloor) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        TextView textView = this.t;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeTitle");
            textView = null;
        }
        float alpha = textView.getAlpha();
        float f2 = z ? 0.0f : 1.0f;
        if (alpha == f2) {
            return;
        }
        TextView textView3 = this.t;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeTitle");
            textView3 = null;
        }
        textView3.setAlpha(f2);
        TextView textView4 = this.v;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeValue");
            textView4 = null;
        }
        textView4.setAlpha(f2);
        TextView textView5 = this.w;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeValueUnit");
            textView5 = null;
        }
        textView5.setAlpha(f2);
        TextView textView6 = this.u;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvNoData");
        } else {
            textView2 = textView6;
        }
        textView2.setAlpha(f2);
    }

    public final void g0() {
        Lifecycle lifecycle;
        FragmentActivity activity = getActivity();
        if (((activity == null || (lifecycle = activity.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.RESUMED && this.A != null) {
            q0().t();
        }
    }

    public int getLayoutId() {
        return R$layout.health_sleep_br_frg_history;
    }

    public final void h0() {
        Lifecycle lifecycle;
        FragmentActivity activity = getActivity();
        if (((activity == null || (lifecycle = activity.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.RESUMED && this.A != null) {
            q0().u();
        }
    }

    public void initData() {
    }

    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.tv_date);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(com.he…health_base.R.id.tv_date)");
        this.o = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.iv_down);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(com.he…health_base.R.id.iv_down)");
        this.p = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.iv_last);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(com.he…health_base.R.id.iv_last)");
        this.q = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.iv_next);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(com.he…health_base.R.id.iv_next)");
        this.r = (ImageView) viewFindViewById4;
        NestedScrollView nestedScrollViewFindViewById = view.findViewById(R$id.scrollView);
        Intrinsics.checkNotNullExpressionValue(nestedScrollViewFindViewById, "view.findViewById(R.id.scrollView)");
        this.s = nestedScrollViewFindViewById;
        View viewFindViewById5 = view.findViewById(R$id.tv_range_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.tv_range_title)");
        this.t = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.tv_no_data);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.tv_no_data)");
        this.u = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R$id.tv_range_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.tv_range_value)");
        this.v = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R$id.tv_range_value_unit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(R.id.tv_range_value_unit)");
        this.w = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R$id.rank_loading_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "view.findViewById(R.id.rank_loading_layout)");
        X0(viewFindViewById9);
        int i = R$id.recyclerCardLayout;
        RecyclerCardLayout recyclerCardLayoutFindViewById = view.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(recyclerCardLayoutFindViewById, "view.findViewById(R.id.recyclerCardLayout)");
        this.y = recyclerCardLayoutFindViewById;
        Object objFindViewById = view.findViewById(R$id.view_history_chart);
        Intrinsics.checkNotNullExpressionValue(objFindViewById, "view.findViewById(R.id.view_history_chart)");
        N0((SleepBRChart) objFindViewById);
        w4l.d(this, view.findViewById(R$id.lib_base_view_top_1));
        w4l.d(this, view.findViewById(R$id.lib_base_content_container));
        w4l.d(this, view.findViewById(i));
        SleepBRChart sleepBRChartQ0 = q0();
        sleepBRChartQ0.setHighlightPerTapEnabled(true);
        sleepBRChartQ0.setHighlightPerDragEnabled(false);
        sleepBRChartQ0.setSectionDraw(false);
        sleepBRChartQ0.K();
        q0().setOnChartValueSelectedListener(new b());
        z0();
        y0();
        Context contextRequireContext = requireContext();
        RecyclerView recyclerView = this.y;
        ImageView imageView = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerCardLayout");
            recyclerView = null;
        }
        RecyclerCardController recyclerCardController = new RecyclerCardController(contextRequireContext, recyclerView);
        this.z = recyclerCardController;
        recyclerCardController.i(p0());
        ImageView imageView2 = this.q;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLast");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.tch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepBRBaseFragment.A0(this.i, view2);
            }
        });
        ImageView imageView3 = this.r;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNext");
            imageView3 = null;
        }
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.uch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepBRBaseFragment.B0(this.i, view2);
            }
        });
        TextView textView = this.o;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDate");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.vch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepBRBaseFragment.F0(this.i, view2);
            }
        });
        ImageView imageView4 = this.p;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivDown");
        } else {
            imageView = imageView4;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.wch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepBRBaseFragment.G0(this.i, view2);
            }
        });
        getViewLifecycleOwnerLiveData().observe(requireActivity(), new c(new Function1<LifecycleOwner, Unit>() { // from class: com.health.sleep_breath_rate.SleepBRBaseFragment.initView.7
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LifecycleOwner) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(LifecycleOwner lifecycleOwner) {
                final Lifecycle lifecycle;
                if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
                    return;
                }
                final SleepBRBaseFragment sleepBRBaseFragment = SleepBRBaseFragment.this;
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.health.sleep_breath_rate.SleepBRBaseFragment$initView$7$1$1

                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class a {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[Lifecycle.Event.values().length];
                            try {
                                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        Intrinsics.checkNotNullParameter(event, "event");
                        int i2 = a.$EnumSwitchMapping$0[event.ordinal()];
                        if (i2 == 1) {
                            sleepBRBaseFragment.g0();
                        } else {
                            if (i2 != 2) {
                                return;
                            }
                            lifecycle.removeObserver(this);
                        }
                    }
                });
            }
        }));
    }

    @NotNull
    public abstract String j0(float moveToXvalue);

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final long getH() {
        return this.H;
    }

    public final COUIPanelFragment n0(final COUIBottomSheetDialogFragment dialogFragment) {
        return new CalendarPanelFragment(LocalDateTime.ofInstant(Instant.ofEpochMilli(this.F), pr8.INSTANCE.d()).toLocalDate(), Long.valueOf(this.H), new Function2<LocalDate, Boolean, Unit>() { // from class: com.health.sleep_breath_rate.SleepBRBaseFragment$getCalendarFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LocalDate) obj, ((Boolean) obj2).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final LocalDate localDate, final boolean z) {
                Intrinsics.checkNotNullParameter(localDate, "date");
                this.this$0.J0(localDate);
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = dialogFragment;
                if (cOUIBottomSheetDialogFragment != null) {
                    cOUIBottomSheetDialogFragment.dismiss();
                }
                this.this$0.x0().s7(new Function0<Unit>() { // from class: com.health.sleep_breath_rate.SleepBRBaseFragment$getCalendarFragment$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }

                    public final void invoke() {
                        if (z) {
                            a.k().a("moduleid", 3).a("position1", 3).a("position2", 1).b();
                            return;
                        }
                        pr8 pr8Var = pr8.INSTANCE;
                        a.k().a("moduleid", 3).a("position1", 3).a("position2", 2).a("element", pr8Var.y(pr8Var.p(localDate), "yyy-MM-dd")).b();
                    }
                });
            }
        });
    }

    @NotNull
    public abstract List<dq8> p0();

    @NotNull
    public final SleepBRChart q0() {
        SleepBRChart sleepBRChart = this.A;
        if (sleepBRChart != null) {
            return sleepBRChart;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chart");
        return null;
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final long getG() {
        return this.G;
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    public final long getF() {
        return this.F;
    }

    @NotNull
    public final SleepBRChartTouchListener t0() {
        SleepBRChartTouchListener sleepBRChartTouchListener = this.D;
        if (sleepBRChartTouchListener != null) {
            return sleepBRChartTouchListener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chartTouchListener");
        return null;
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final boolean getJ() {
        return this.J;
    }

    @Nullable
    /* JADX INFO: renamed from: v0, reason: from getter */
    public final adh getC() {
        return this.C;
    }

    @NotNull
    public final View w0() {
        View view = this.x;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        return null;
    }

    @NotNull
    public final SleepBRHistoryActivity x0() {
        return (SleepBRHistoryActivity) this.E.getValue();
    }

    public abstract void y0();

    public final void z0() {
        CommonScrollTopLineView commonScrollTopLineViewW = W(R$id.top_line_consumption_history);
        Context context = getContext();
        NestedScrollView nestedScrollView = this.s;
        if (nestedScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollView");
            nestedScrollView = null;
        }
        commonScrollTopLineViewW.m(context, nestedScrollView);
    }
}
