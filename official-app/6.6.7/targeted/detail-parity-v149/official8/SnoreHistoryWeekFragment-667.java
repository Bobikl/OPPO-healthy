package com.heytap.health.sleep.snore.week;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.base.view.CommonScrollTopLineView;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.health.sleep.snore.week.SnoreHistoryWeekFragment;
import com.heytap.health.sleep.snore.week.viewmodel.SnoreRangeControlModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.g4i;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.q2i;
import com.oplus.aiunit.vision.v4i;
import com.oplus.aiunit.vision.xmk;
import com.xiaomi.mipush.sdk.Constants;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J \u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010 \u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010-\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\u0019R\u0016\u00109\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\u0019R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/heytap/health/sleep/snore/week/SnoreHistoryWeekFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "", "getLayoutId", "Landroid/view/View;", "view", "", "initView", "initData", "g0", "Lcom/oplus/aiunit/vision/q2i;", "snoreRangeControlBean", "k0", "", "startTime", "endTime", "n0", "", "str", "p0", "Landroidx/fragment/app/FragmentActivity;", "o", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", LogFieldKey.PROCESS_NAME_KEY, "J", SnoreHistoryActivity.BORDER_START_TIME, "q", SnoreHistoryActivity.BORDER_END_TIME, "r", SnoreHistoryActivity.CUR_DAY_START_TIME, "s", SnoreHistoryActivity.CUR_DAY_END_TIME, "Landroid/widget/TextView;", "t", "Landroid/widget/TextView;", "tvDate", "Landroid/widget/ImageView;", "u", "Landroid/widget/ImageView;", "ivLast", "v", "ivNext", "w", "Landroid/view/View;", "mLoadingLayout", "Landroid/view/ViewGroup;", "x", "Landroid/view/ViewGroup;", "parentViewGroup", "Lcom/heytap/health/sleep/snore/week/viewmodel/SnoreRangeControlModel;", "y", "Lcom/heytap/health/sleep/snore/week/viewmodel/SnoreRangeControlModel;", "snoreRangeControlModel", "z", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, "A", BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "Lcom/oplus/aiunit/vision/v4i;", acl.KEY_B, "Lcom/oplus/aiunit/vision/v4i;", "factory", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SnoreHistoryWeekFragment extends BaseFragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public long chartHighestVisibleTime;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public v4i factory;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public FragmentActivity fragmentActivity;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public long borderStartTime;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public long borderEndTime;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public long curDayStartTime;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public long curDayEndTime;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public TextView tvDate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public ImageView ivLast;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public ImageView ivNext;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public View mLoadingLayout;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public ViewGroup parentViewGroup;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public SnoreRangeControlModel snoreRangeControlModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public long chartLowestVisibleTime;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public a(Function1 function) {
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

    public static final void h0(SnoreHistoryWeekFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 1).b();
        v4i v4iVar = this$0.factory;
        Intrinsics.checkNotNull(v4iVar);
        g4i snoreRiskWeekView = v4iVar.getSnoreRiskWeekView();
        Intrinsics.checkNotNull(snoreRiskWeekView);
        snoreRiskWeekView.R();
    }

    public static final void j0(SnoreHistoryWeekFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 2).b();
        v4i v4iVar = this$0.factory;
        Intrinsics.checkNotNull(v4iVar);
        g4i snoreRiskWeekView = v4iVar.getSnoreRiskWeekView();
        Intrinsics.checkNotNull(snoreRiskWeekView);
        snoreRiskWeekView.E();
    }

    public final void g0() {
        ((CommonScrollTopLineView) W(R$id.top_line_consumption_history)).m(getContext(), (NestedScrollView) W(R$id.scrollView));
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_sleep_frg_snore_history_week;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        FragmentActivity fragmentActivity = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity);
        SnoreRangeControlModel snoreRangeControlModel = (SnoreRangeControlModel) new ViewModelProvider(fragmentActivity).get(SnoreRangeControlModel.class);
        this.snoreRangeControlModel = snoreRangeControlModel;
        Intrinsics.checkNotNull(snoreRangeControlModel);
        OLiveData<q2i> oLiveDataU = snoreRangeControlModel.u();
        FragmentActivity fragmentActivity2 = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity2);
        oLiveDataU.observe(fragmentActivity2, new a(new Function1<q2i, Unit>() { // from class: com.heytap.health.sleep.snore.week.SnoreHistoryWeekFragment.initData.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(q2i q2iVar) {
                invoke2(q2iVar);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull q2i snoreRangeControlBean) {
                Intrinsics.checkNotNullParameter(snoreRangeControlBean, "snoreRangeControlBean");
                SnoreHistoryWeekFragment.this.k0(snoreRangeControlBean);
            }
        }));
        SnoreRangeControlModel snoreRangeControlModel2 = this.snoreRangeControlModel;
        Intrinsics.checkNotNull(snoreRangeControlModel2);
        OLiveData<Boolean> oLiveDataV = snoreRangeControlModel2.v();
        FragmentActivity fragmentActivity3 = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity3);
        oLiveDataV.observe(fragmentActivity3, new a(new Function1<Boolean, Unit>() { // from class: com.heytap.health.sleep.snore.week.SnoreHistoryWeekFragment.initData.2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean it) {
                View view = SnoreHistoryWeekFragment.this.mLoadingLayout;
                Intrinsics.checkNotNull(view);
                Intrinsics.checkNotNullExpressionValue(it, "it");
                view.setVisibility(it.booleanValue() ? 0 : 8);
            }
        }));
        v4i v4iVar = this.factory;
        Intrinsics.checkNotNull(v4iVar);
        g4i snoreRiskWeekView = v4iVar.getSnoreRiskWeekView();
        Intrinsics.checkNotNull(snoreRiskWeekView);
        snoreRiskWeekView.Q();
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.fragmentActivity = requireActivity();
        this.tvDate = (TextView) view.findViewById(R$id.tvDate);
        this.ivLast = (ImageView) view.findViewById(R$id.ivLast);
        this.ivNext = (ImageView) view.findViewById(R$id.ivNext);
        this.mLoadingLayout = view.findViewById(R$id.rank_loading_layout);
        this.parentViewGroup = (ViewGroup) view.findViewById(R$id.parentViewGroup);
        ImageView imageView = this.ivLast;
        Intrinsics.checkNotNull(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.j1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SnoreHistoryWeekFragment.h0(this.i, view2);
            }
        });
        ImageView imageView2 = this.ivNext;
        Intrinsics.checkNotNull(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.k1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SnoreHistoryWeekFragment.j0(this.i, view2);
            }
        });
        g0();
        FragmentActivity fragmentActivity = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity);
        this.borderStartTime = fragmentActivity.getIntent().getLongExtra(SnoreHistoryActivity.BORDER_START_TIME, 0L);
        FragmentActivity fragmentActivity2 = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity2);
        this.borderEndTime = fragmentActivity2.getIntent().getLongExtra(SnoreHistoryActivity.BORDER_END_TIME, 0L);
        FragmentActivity fragmentActivity3 = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity3);
        this.curDayStartTime = fragmentActivity3.getIntent().getLongExtra(SnoreHistoryActivity.CUR_DAY_START_TIME, 0L);
        FragmentActivity fragmentActivity4 = this.fragmentActivity;
        Intrinsics.checkNotNull(fragmentActivity4);
        this.curDayEndTime = fragmentActivity4.getIntent().getLongExtra(SnoreHistoryActivity.CUR_DAY_END_TIME, 0L);
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.borderEndTime), zoneIdSystemDefault).minusDays(7L).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        if (this.borderStartTime > epochMilli) {
            this.borderStartTime = epochMilli;
        }
        pr8 pr8Var = pr8.INSTANCE;
        this.borderStartTime = pr8Var.n(this.borderStartTime);
        long epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.borderEndTime), ZoneId.systemDefault()).toLocalDate().minusDays(6L).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long jC = pr8Var.c(this.curDayEndTime);
        this.chartLowestVisibleTime = jC;
        if (jC > epochMilli2) {
            this.chartLowestVisibleTime = epochMilli2;
        }
        this.chartHighestVisibleTime = LocalDateTime.of(LocalDateTime.ofInstant(Instant.ofEpochMilli(this.chartLowestVisibleTime), zoneIdSystemDefault).toLocalDate().plusDays(6L), LocalTime.MAX).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        ViewGroup viewGroup = this.parentViewGroup;
        Intrinsics.checkNotNull(viewGroup);
        this.factory = new v4i(this, viewGroup, this.borderStartTime, this.borderEndTime, this.chartLowestVisibleTime, this.chartHighestVisibleTime);
    }

    public final void k0(q2i snoreRangeControlBean) {
        n0(snoreRangeControlBean.getStartTime(), snoreRangeControlBean.getEndTime());
    }

    public final void n0(long startTime, long endTime) {
        if (LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), ZoneId.systemDefault()).toLocalDate().getYear() == LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).toLocalDate().getYear()) {
            p0(startTime, endTime, lo9.g(startTime, "MMMd") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + lo9.g(endTime, "MMMd"));
            return;
        }
        p0(startTime, endTime, lo9.g(startTime, "yyyMMMd") + Constants.ACCEPT_TIME_SEPARATOR_SERVER + lo9.g(endTime, "yyyMMMd"));
    }

    public final void p0(long startTime, long endTime, String str) {
        ImageView imageView = this.ivLast;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(startTime <= this.borderStartTime ? 8 : 0);
        ImageView imageView2 = this.ivNext;
        Intrinsics.checkNotNull(imageView2);
        imageView2.setVisibility(endTime < this.borderEndTime ? 0 : 8);
        TextView textView = this.tvDate;
        Intrinsics.checkNotNull(textView);
        textView.setText(str);
    }
}