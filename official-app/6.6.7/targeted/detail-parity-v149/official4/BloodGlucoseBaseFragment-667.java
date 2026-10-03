package com.heytap.health.blood.glucose;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.exifinterface.media.ExifInterface;
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
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.track.a;
import com.heytap.health.base.view.CommonScrollTopLineView;
import com.heytap.health.base.view.recyclercard.RecyclerCardController;
import com.heytap.health.base.view.recyclercard.RecyclerCardLayout;
import com.heytap.health.blood.glucose.BloodGlucoseBaseFragment;
import com.heytap.health.blood.glucose.listener.BloodGlucoseChartTouchListener;
import com.heytap.health.blood.glucose.view.CalendarPanelFragment;
import com.heytap.health.core.widget.charts.GluCombineChart;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.dq8;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.s88;
import com.oplus.aiunit.vision.t88;
import com.oplus.aiunit.vision.w4l;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.zs9;
import com.xiaomi.mipush.sdk.Constants;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b&\b&\u0018\u0000 \u0091\u00012\u00020\u00012\u00020\u0002:\u0002\u0092\u0001B\t¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0014J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0003J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H&J \u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0004J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0007J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#H&R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00101\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010,R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u0010(R\u0016\u00109\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u0010(R\u0016\u0010;\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010(R\u0016\u0010=\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010(R\"\u0010D\u001a\u00020\f8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010d\u001a\u0004\u0018\u00010]8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001b\u0010r\u001a\u00020m8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001b\u0010v\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bs\u0010o\u001a\u0004\bt\u0010uR\"\u0010|\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010u\"\u0004\bz\u0010{R#\u0010\u0080\u0001\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b}\u0010x\u001a\u0004\b~\u0010u\"\u0004\b\u007f\u0010{R&\u0010\u0084\u0001\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010x\u001a\u0005\b\u0082\u0001\u0010u\"\u0005\b\u0083\u0001\u0010{R%\u0010\u0087\u0001\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0014\n\u0004\bx\u0010x\u001a\u0005\b\u0085\u0001\u0010u\"\u0005\b\u0086\u0001\u0010{R&\u0010\u008b\u0001\u001a\u00020U8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010W\u001a\u0005\b\u0089\u0001\u0010Y\"\u0005\b\u008a\u0001\u0010[R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0093\u0001"}, d2 = {"Lcom/heytap/health/blood/glucose/BloodGlucoseBaseFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "Lcom/oplus/aiunit/vision/zs9;", "", acl.KEY_B0, "e1", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "dialogFragment", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "n0", "", "getLayoutId", "Landroid/view/View;", "view", "initView", "h0", "g0", "initData", acl.KEY_A0, "", "Lcom/oplus/aiunit/vision/dq8;", "p0", "f1", "Ljava/time/LocalDate;", "date", "L0", "", "startTime", "endTime", "", "str", "X0", "Lcom/oplus/aiunit/vision/s88;", "gluCardDataBean", "M0", "", "moveToXvalue", "j0", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "tvDate", "Landroid/widget/ImageView;", LogFieldKey.PROCESS_NAME_KEY, "Landroid/widget/ImageView;", "ivDown", "q", "ivLast", "r", "ivNext", "Landroidx/core/widget/NestedScrollView;", "s", "Landroidx/core/widget/NestedScrollView;", "scrollView", "t", "tvRangeTitle", "u", "tvNoData", "v", "tvRangeValue", "w", "tvRangeValueUnit", "x", "Landroid/view/View;", "w0", "()Landroid/view/View;", "Z0", "(Landroid/view/View;)V", "loadingView", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardLayout;", "y", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardLayout;", "recyclerCardLayout", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardController;", "z", "Lcom/heytap/health/base/view/recyclercard/RecyclerCardController;", "controller", "Lcom/heytap/health/core/widget/charts/GluCombineChart;", "A", "Lcom/heytap/health/core/widget/charts/GluCombineChart;", "q0", "()Lcom/heytap/health/core/widget/charts/GluCombineChart;", "P0", "(Lcom/heytap/health/core/widget/charts/GluCombineChart;)V", "chart", "", acl.KEY_B, "Z", "K0", "()Z", "d1", "(Z)V", "isNotData", "Lcom/oplus/aiunit/vision/t88;", "C", "Lcom/oplus/aiunit/vision/t88;", "v0", "()Lcom/oplus/aiunit/vision/t88;", "Y0", "(Lcom/oplus/aiunit/vision/t88;)V", "gluChartDataBean", "Lcom/heytap/health/blood/glucose/listener/BloodGlucoseChartTouchListener;", "D", "Lcom/heytap/health/blood/glucose/listener/BloodGlucoseChartTouchListener;", "t0", "()Lcom/heytap/health/blood/glucose/listener/BloodGlucoseChartTouchListener;", "V0", "(Lcom/heytap/health/blood/glucose/listener/BloodGlucoseChartTouchListener;)V", "chartTouchListener", "Lcom/heytap/health/blood/glucose/BloodGlucoseHistoryActivity;", ExifInterface.LONGITUDE_EAST, "Lkotlin/Lazy;", "z0", "()Lcom/heytap/health/blood/glucose/BloodGlucoseHistoryActivity;", "parentActivity", UserInfo.SEX_FEMALE, "x0", "()J", "locationTime", "G", "J", "s0", "R0", "(J)V", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, "H", "r0", "Q0", BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "I", "k0", "O0", SnoreHistoryActivity.BORDER_START_TIME, "getBorderEndTime", "N0", SnoreHistoryActivity.BORDER_END_TIME, "K", "u0", "W0", "clickChangeDate", "L", "Lcom/coui/appcompat/panel/COUIBottomSheetDialogFragment;", "calendarDialogFragment", "<init>", "()V", "Companion", "a", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodGlucoseBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseBaseFragment.kt\ncom/heytap/health/blood/glucose/BloodGlucoseBaseFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n1855#2,2:357\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseBaseFragment.kt\ncom/heytap/health/blood/glucose/BloodGlucoseBaseFragment\n*L\n275#1:357,2\n*E\n"})
public abstract class BloodGlucoseBaseFragment extends BaseFragment implements zs9 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public GluCombineChart chart;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public t88 gluChartDataBean;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public BloodGlucoseChartTouchListener chartTouchListener;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public long chartLowestVisibleTime;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public long chartHighestVisibleTime;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public long borderStartTime;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public long borderEndTime;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public boolean clickChangeDate;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public COUIBottomSheetDialogFragment calendarDialogFragment;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public TextView tvDate;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public ImageView ivDown;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public ImageView ivLast;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public ImageView ivNext;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public NestedScrollView scrollView;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public TextView tvRangeTitle;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public TextView tvNoData;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public TextView tvRangeValue;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public TextView tvRangeValueUnit;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public View loadingView;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public RecyclerCardLayout recyclerCardLayout;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public RecyclerCardController controller;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean isNotData = true;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Lazy parentActivity = LazyKt__LazyJVMKt.lazy(new Function0<BloodGlucoseHistoryActivity>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseBaseFragment$parentActivity$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final BloodGlucoseHistoryActivity invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.heytap.health.blood.glucose.BloodGlucoseHistoryActivity");
            return (BloodGlucoseHistoryActivity) fragmentActivityRequireActivity;
        }
    });

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Lazy locationTime = LazyKt__LazyJVMKt.lazy(new Function0<Long>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseBaseFragment$locationTime$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            BloodGlucoseBaseFragment bloodGlucoseBaseFragment = this.this$0;
            return Long.valueOf(bloodGlucoseBaseFragment.y0(bloodGlucoseBaseFragment.getArguments()));
        }
    });

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/blood/glucose/BloodGlucoseBaseFragment$b", "Lcom/github/mikephil/charting/listener/OnChartValueSelectedListener;", "Lcom/github/mikephil/charting/data/Entry;", MapSchema.FIELD_NAME_ENTRY, "Lcom/github/mikephil/charting/highlight/Highlight;", c7n.g, "", "onValueSelected", "onNothingSelected", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements OnChartValueSelectedListener {
        public b() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            BloodGlucoseBaseFragment.this.q0().setSelectedIndex(-1);
            BloodGlucoseBaseFragment.this.f1();
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(@Nullable Entry e2, @Nullable Highlight h) {
            int iRoundToInt = MathKt__MathJVMKt.roundToInt(e2 != null ? e2.getX() : -1.0f);
            StringBuilder sb = new StringBuilder();
            sb.append("onValueSelected index=");
            sb.append(iRoundToInt);
            BloodGlucoseBaseFragment.this.q0().setSelectedIndex(iRoundToInt);
            BloodGlucoseBaseFragment.this.f1();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function) {
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

    public static final void F0(BloodGlucoseBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        float fT = this$0.t0().t(false);
        if (fT > 0.0f) {
            this$0.q0().c(Float.valueOf(fT), Float.valueOf(this$0.q0().getVisibleXRange() + fT));
        } else {
            this$0.q0().b();
        }
        this$0.clickChangeDate = true;
        final String strJ0 = this$0.j0(fT);
        StringBuilder sb = new StringBuilder();
        sb.append("targetDate:");
        sb.append(strJ0);
        this$0.z0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseBaseFragment$initView$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 1).a("element", strJ0).b();
            }
        });
    }

    public static final void G0(BloodGlucoseBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        float fT = this$0.t0().t(true);
        if (fT > 0.0f) {
            this$0.q0().c(Float.valueOf(fT), Float.valueOf(this$0.q0().getVisibleXRange() + fT));
        } else {
            this$0.q0().b();
        }
        this$0.clickChangeDate = true;
        final String strJ0 = this$0.j0(fT);
        StringBuilder sb = new StringBuilder();
        sb.append("targetDate:");
        sb.append(strJ0);
        this$0.z0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseBaseFragment$initView$5$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 2).a("element", strJ0).b();
            }
        });
    }

    public static final void H0(BloodGlucoseBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e1();
    }

    public static final void J0(BloodGlucoseBaseFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e1();
    }

    public abstract void A0();

    public final void B0() {
        CommonScrollTopLineView commonScrollTopLineView = (CommonScrollTopLineView) W(R$id.top_line_consumption_history);
        Context context = getContext();
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollView");
            nestedScrollView = null;
        }
        commonScrollTopLineView.m(context, nestedScrollView);
    }

    /* JADX INFO: renamed from: K0, reason: from getter */
    public final boolean getIsNotData() {
        return this.isNotData;
    }

    public abstract void L0(@NotNull LocalDate date);

    @SuppressLint({"SetTextI18n"})
    public final void M0(@NotNull s88 gluCardDataBean) {
        Intrinsics.checkNotNullParameter(gluCardDataBean, "gluCardDataBean");
        q0().setYAxisRightValues(new float[]{0.0f, RangesKt___RangesKt.coerceAtLeast(10.0f, ((int) gluCardDataBean.getMaxValue()) + 2)});
        TextView textView = null;
        if (gluCardDataBean.getIsNoData()) {
            TextView textView2 = this.tvNoData;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvNoData");
                textView2 = null;
            }
            textView2.setVisibility(0);
            TextView textView3 = this.tvRangeValue;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvRangeValue");
                textView3 = null;
            }
            textView3.setVisibility(8);
            TextView textView4 = this.tvRangeValueUnit;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvRangeValueUnit");
            } else {
                textView = textView4;
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView5 = this.tvRangeValue;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeValue");
            textView5 = null;
        }
        textView5.setText(gluCardDataBean.getMinValue() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + gluCardDataBean.getMaxValue());
        TextView textView6 = this.tvNoData;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvNoData");
            textView6 = null;
        }
        textView6.setVisibility(8);
        TextView textView7 = this.tvRangeValue;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeValue");
            textView7 = null;
        }
        textView7.setVisibility(0);
        TextView textView8 = this.tvRangeValueUnit;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeValueUnit");
        } else {
            textView = textView8;
        }
        textView.setVisibility(0);
    }

    public final void N0(long j2) {
        this.borderEndTime = j2;
    }

    public final void O0(long j2) {
        this.borderStartTime = j2;
    }

    public final void P0(@NotNull GluCombineChart gluCombineChart) {
        Intrinsics.checkNotNullParameter(gluCombineChart, "<set-?>");
        this.chart = gluCombineChart;
    }

    public final void Q0(long j2) {
        this.chartHighestVisibleTime = j2;
    }

    public final void R0(long j2) {
        this.chartLowestVisibleTime = j2;
    }

    public final void V0(@NotNull BloodGlucoseChartTouchListener bloodGlucoseChartTouchListener) {
        Intrinsics.checkNotNullParameter(bloodGlucoseChartTouchListener, "<set-?>");
        this.chartTouchListener = bloodGlucoseChartTouchListener;
    }

    public final void W0(boolean z) {
        this.clickChangeDate = z;
    }

    public final void X0(long startTime, long endTime, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        ImageView imageView = this.ivLast;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLast");
            imageView = null;
        }
        imageView.setVisibility(startTime <= this.borderStartTime ? 8 : 0);
        ImageView imageView2 = this.ivNext;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNext");
            imageView2 = null;
        }
        pr8 pr8Var = pr8.INSTANCE;
        imageView2.setVisibility(pr8Var.e(endTime) < pr8Var.e(this.borderEndTime) ? 0 : 8);
        TextView textView2 = this.tvDate;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDate");
        } else {
            textView = textView2;
        }
        textView.setText(str);
    }

    public final void Y0(@Nullable t88 t88Var) {
        this.gluChartDataBean = t88Var;
    }

    public final void Z0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.loadingView = view;
    }

    public final void d1(boolean z) {
        this.isNotData = z;
    }

    public final void e1() {
        FragmentActivity activity;
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        if (this.gluChartDataBean == null || (activity = getActivity()) == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(fragments, "fragments");
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            if (((Fragment) it.next()) instanceof BloodGlucoseBaseFragment) {
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = this.calendarDialogFragment;
                if (cOUIBottomSheetDialogFragment != null) {
                    cOUIBottomSheetDialogFragment.dismiss();
                }
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = new COUIBottomSheetDialogFragment();
                this.calendarDialogFragment = cOUIBottomSheetDialogFragment2;
                cOUIBottomSheetDialogFragment2.setMainPanelFragment(n0(cOUIBottomSheetDialogFragment2));
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment3 = this.calendarDialogFragment;
                    if (cOUIBottomSheetDialogFragment3 != null) {
                        cOUIBottomSheetDialogFragment3.show(activity2.getSupportFragmentManager(), "calendar Panel fragment");
                    }
                    z0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseBaseFragment$showCalendarFrag$1$1$1$1
                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            a.x().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, -1).b();
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x006e  */
    public void f1() {
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
        TextView textView = this.tvRangeTitle;
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
        TextView textView3 = this.tvRangeTitle;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeTitle");
            textView3 = null;
        }
        textView3.setAlpha(f2);
        TextView textView4 = this.tvRangeValue;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeValue");
            textView4 = null;
        }
        textView4.setAlpha(f2);
        TextView textView5 = this.tvRangeValueUnit;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRangeValueUnit");
            textView5 = null;
        }
        textView5.setAlpha(f2);
        TextView textView6 = this.tvNoData;
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
        if (((activity == null || (lifecycle = activity.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.RESUMED && this.chart != null) {
            q0().t();
        }
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_blood_glucose_frg_history;
    }

    public final void h0() {
        Lifecycle lifecycle;
        FragmentActivity activity = getActivity();
        if (((activity == null || (lifecycle = activity.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.RESUMED && this.chart != null) {
            q0().u();
        }
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(com.heytap.health.health_base.R$id.tv_date);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(com.he…health_base.R.id.tv_date)");
        this.tvDate = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(com.heytap.health.health_base.R$id.iv_down);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(com.he…health_base.R.id.iv_down)");
        this.ivDown = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(com.heytap.health.health_base.R$id.iv_last);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(com.he…health_base.R.id.iv_last)");
        this.ivLast = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(com.heytap.health.health_base.R$id.iv_next);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(com.he…health_base.R.id.iv_next)");
        this.ivNext = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R$id.scrollView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.scrollView)");
        this.scrollView = (NestedScrollView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R$id.tv_range_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.tv_range_title)");
        this.tvRangeTitle = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R$id.tv_no_data);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.tv_no_data)");
        this.tvNoData = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R$id.tv_range_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(R.id.tv_range_value)");
        this.tvRangeValue = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R$id.tv_range_value_unit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "view.findViewById(R.id.tv_range_value_unit)");
        this.tvRangeValueUnit = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R$id.rank_loading_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "view.findViewById(R.id.rank_loading_layout)");
        Z0(viewFindViewById10);
        int i = R$id.recyclerCardLayout;
        View viewFindViewById11 = view.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "view.findViewById(R.id.recyclerCardLayout)");
        this.recyclerCardLayout = (RecyclerCardLayout) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R$id.view_history_chart);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "view.findViewById(R.id.view_history_chart)");
        P0((GluCombineChart) viewFindViewById12);
        w4l.d(this, view.findViewById(R$id.lib_base_view_top_1));
        w4l.d(this, view.findViewById(R$id.lib_base_content_container));
        w4l.d(this, view.findViewById(i));
        GluCombineChart gluCombineChartQ0 = q0();
        gluCombineChartQ0.setHighlightPerTapEnabled(true);
        gluCombineChartQ0.setHighlightPerDragEnabled(false);
        gluCombineChartQ0.setSectionDraw(false);
        gluCombineChartQ0.B();
        gluCombineChartQ0.setYAxisRightValues(new float[]{2.0f, 16.0f});
        ImageView imageView = null;
        gluCombineChartQ0.setBarChartCompleteGradientColor(null);
        gluCombineChartQ0.setBarColor(ContextCompat.getColor(gluCombineChartQ0.getContext(), com.heytap.health.lib_chart.R$color.lib_chart_glu_normal));
        q0().setOnChartValueSelectedListener(new b());
        B0();
        A0();
        Context contextRequireContext = requireContext();
        RecyclerCardLayout recyclerCardLayout = this.recyclerCardLayout;
        if (recyclerCardLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerCardLayout");
            recyclerCardLayout = null;
        }
        RecyclerCardController recyclerCardController = new RecyclerCardController(contextRequireContext, recyclerCardLayout);
        this.controller = recyclerCardController;
        recyclerCardController.i(p0());
        RecyclerCardLayout recyclerCardLayout2 = this.recyclerCardLayout;
        if (recyclerCardLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerCardLayout");
            recyclerCardLayout2 = null;
        }
        recyclerCardLayout2.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.heytap.health.blood.glucose.BloodGlucoseBaseFragment.initView.3
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@NotNull Rect outRect, @NotNull View view2, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getItemOffsets(outRect, view2, parent, state);
                outRect.top = (int) jjk.a(e88.a(), 12.0f);
            }
        });
        ImageView imageView2 = this.ivLast;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLast");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.mj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodGlucoseBaseFragment.F0(this.i, view2);
            }
        });
        ImageView imageView3 = this.ivNext;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivNext");
            imageView3 = null;
        }
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.nj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodGlucoseBaseFragment.G0(this.i, view2);
            }
        });
        TextView textView = this.tvDate;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvDate");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.oj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodGlucoseBaseFragment.H0(this.i, view2);
            }
        });
        ImageView imageView4 = this.ivDown;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivDown");
        } else {
            imageView = imageView4;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.pj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BloodGlucoseBaseFragment.J0(this.i, view2);
            }
        });
        getViewLifecycleOwnerLiveData().observe(requireActivity(), new c(new Function1<LifecycleOwner, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseBaseFragment.initView.8
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner) {
                invoke2(lifecycleOwner);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LifecycleOwner lifecycleOwner) {
                final Lifecycle lifecycle;
                if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
                    return;
                }
                final BloodGlucoseBaseFragment bloodGlucoseBaseFragment = BloodGlucoseBaseFragment.this;
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.heytap.health.blood.glucose.BloodGlucoseBaseFragment$initView$8$1$1

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

                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        Intrinsics.checkNotNullParameter(event, "event");
                        int i2 = a.$EnumSwitchMapping$0[event.ordinal()];
                        if (i2 == 1) {
                            bloodGlucoseBaseFragment.g0();
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
    public final long getBorderStartTime() {
        return this.borderStartTime;
    }

    public final COUIPanelFragment n0(final COUIBottomSheetDialogFragment dialogFragment) {
        return new CalendarPanelFragment(LocalDateTime.ofInstant(Instant.ofEpochMilli(this.chartLowestVisibleTime), pr8.INSTANCE.d()).toLocalDate(), Long.valueOf(this.borderStartTime), new Function2<LocalDate, Boolean, Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseBaseFragment$getCalendarFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate, Boolean bool) {
                invoke(localDate, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull final LocalDate date, final boolean z) {
                Intrinsics.checkNotNullParameter(date, "date");
                this.this$0.L0(date);
                COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = dialogFragment;
                if (cOUIBottomSheetDialogFragment != null) {
                    cOUIBottomSheetDialogFragment.dismiss();
                }
                this.this$0.z0().v7(new Function0<Unit>() { // from class: com.heytap.health.blood.glucose.BloodGlucoseBaseFragment$getCalendarFragment$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (z) {
                            a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 1).b();
                            return;
                        }
                        pr8 pr8Var = pr8.INSTANCE;
                        a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 2).a("element", pr8Var.y(pr8Var.p(date), "yyy-MM-dd")).b();
                    }
                });
            }
        });
    }

    @NotNull
    public abstract List<dq8> p0();

    @NotNull
    public final GluCombineChart q0() {
        GluCombineChart gluCombineChart = this.chart;
        if (gluCombineChart != null) {
            return gluCombineChart;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chart");
        return null;
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final long getChartHighestVisibleTime() {
        return this.chartHighestVisibleTime;
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    public final long getChartLowestVisibleTime() {
        return this.chartLowestVisibleTime;
    }

    @NotNull
    public final BloodGlucoseChartTouchListener t0() {
        BloodGlucoseChartTouchListener bloodGlucoseChartTouchListener = this.chartTouchListener;
        if (bloodGlucoseChartTouchListener != null) {
            return bloodGlucoseChartTouchListener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chartTouchListener");
        return null;
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final boolean getClickChangeDate() {
        return this.clickChangeDate;
    }

    @Nullable
    /* JADX INFO: renamed from: v0, reason: from getter */
    public final t88 getGluChartDataBean() {
        return this.gluChartDataBean;
    }

    @NotNull
    public final View w0() {
        View view = this.loadingView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        return null;
    }

    public long x0() {
        return ((Number) this.locationTime.getValue()).longValue();
    }

    public long y0(@Nullable Bundle bundle) {
        return zs9.a.a(this, bundle);
    }

    @NotNull
    public final BloodGlucoseHistoryActivity z0() {
        return (BloodGlucoseHistoryActivity) this.parentActivity.getValue();
    }
}