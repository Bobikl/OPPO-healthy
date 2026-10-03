package com.heytap.health.main.wristtemperature;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.core.widget.charts.SleepDetailsChart;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.health.impl.R;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.homecard.constant.HomeCardDataEnum;
import com.heytap.health.main.wristtemperature.SleepCard;
import com.heytap.health.main.wristtemperature.common.HealthBaseCard;
import com.heytap.health.main.wristtemperature.common.HealthCommonCardView;
import com.heytap.health.sleep.SleepHistoryActivity;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.day.SleepPhoneMeasureActivity;
import com.heytap.health.sleep.day.viewmodel.SleepDayViewModel2;
import com.oplus.aiunit.vision.c9i;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.gke;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pr8;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001AB\u0019\u0012\u0006\u0010;\u001a\u00020:\u0012\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0003J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u001c\u0010\"\u001a\u00020!2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001eH\u0002R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0018008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e04008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0011\u00109\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006B"}, d2 = {"Lcom/heytap/health/main/card/SleepCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", "V", "R", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "", "position", "Landroid/content/Context;", "context", "L", "X", "n0", "o0", "T", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "Landroid/view/View;", "commonView", "u0", "q0", "", "sleepCardLastDataTime", "l0", "Lcom/heytap/health/core/widget/charts/SleepDetailsChart;", "chart", "p0", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "last", "newly", "", "k0", "Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "z", "Lkotlin/Lazy;", "m0", "()Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "devicesAbilityUtils", "Lcom/heytap/health/sleep/day/viewmodel/SleepDayViewModel2;", "A", "Lcom/heytap/health/sleep/day/viewmodel/SleepDayViewModel2;", "mSleepDayViewModel", "B", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "sleepDayBean", "Landroidx/lifecycle/Observer;", "C", "Landroidx/lifecycle/Observer;", "mObserverLastDataTime", "", "D", "mObserverDetail", "r0", "()Z", "isEmpty", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepCard.kt\ncom/heytap/health/main/card/SleepCard\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,321:1\n29#2:322\n29#2:323\n29#2:324\n*S KotlinDebug\n*F\n+ 1 SleepCard.kt\ncom/heytap/health/main/card/SleepCard\n*L\n154#1:322\n161#1:323\n186#1:324\n*E\n"})
public final class SleepCard extends HealthBaseCard {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public SleepDayViewModel2 mSleepDayViewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public SleepDayBean sleepDayBean;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Observer<Long> mObserverLastDataTime;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Observer<List<SleepDayBean>> mObserverDetail;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy devicesAbilityUtils;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "sleepDetails", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b implements Observer<List<SleepDayBean>> {
        public b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull List<SleepDayBean> list) {
            Intrinsics.checkNotNullParameter(list, "sleepDetails");
            if (!(!list.isEmpty())) {
                SleepCard.this.sleepDayBean = null;
                SleepCard.this.S();
                return;
            }
            SleepCard sleepCard = SleepCard.this;
            boolean zK0 = sleepCard.k0(sleepCard.sleepDayBean, list.get(0));
            StringBuilder sb = new StringBuilder();
            sb.append("mObserverDetail dataConsistent is ");
            sb.append(zK0);
            if (zK0) {
                return;
            }
            if (SleepCard.this.r0()) {
                SleepCard.this.sleepDayBean = list.get(0);
                SleepCard.this.S();
            } else {
                SleepCard.this.sleepDayBean = list.get(0);
                SleepCard.this.W();
                SleepCard.this.S();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "lastDataTime", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c implements Observer<Long> {
        public c() {
        }

        public final void a(long j) {
            m8b.f("SleepCard", "prepareFetchData:" + j + "/hashCode:" + SleepCard.this.hashCode());
            if (j != Long.MIN_VALUE) {
                SleepCard.this.l0(j);
            } else {
                SleepCard.this.sleepDayBean = null;
                SleepCard.this.S();
            }
        }

        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
            a(((Number) obj).longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepCard(@NotNull FragmentActivity fragmentActivity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(fragmentActivity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        this.devicesAbilityUtils = LazyKt.lazy(new Function0<DevicesAbilityUtils>() { // from class: com.heytap.health.main.card.SleepCard$devicesAbilityUtils$2
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DevicesAbilityUtils m11invoke() {
                return new DevicesAbilityUtils();
            }
        });
        this.mObserverLastDataTime = new c();
        this.mObserverDetail = new b();
        int iHashCode = hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append("SleepCard :");
        sb.append(iHashCode);
    }

    public static final void s0(SleepCard sleepCard, View view) {
        Intrinsics.checkNotNullParameter(sleepCard, "this$0");
        sleepCard.n0();
    }

    public static final void t0(SleepCard sleepCard, View view) {
        Intrinsics.checkNotNullParameter(sleepCard, "this$0");
        sleepCard.o0();
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void L(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        super.L(holder, position, context);
        boolean zR0 = r0();
        boolean zC = gke.INSTANCE.c();
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder isEmpty is:");
        sb.append(zR0);
        sb.append(", isSupportedSleep:");
        sb.append(zC);
        if (!zR0) {
            this.t.setDataModel(context.getString(R.string.health_sleep));
            u0(x(R.layout.health_common_sleep_card_new));
            return;
        }
        this.t.setIcon(R.drawable.health_icon_sleep);
        if (zC) {
            this.t.f(context.getString(R.string.health_sleep), this.j.getString(R.string.health_home_card_sleep_measure_tip), this.j.getString(R.string.health_home_card_sleep_measure_tip2));
            this.t.l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.oeh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepCard.s0(this.i, view);
                }
            });
        } else {
            this.t.f(context.getString(R.string.health_sleep), this.j.getString(R.string.health_home_card_sleep_no_data_tip), this.j.getString(R.string.health_home_card_sleep_no_data_tip2));
            this.t.l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.peh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepCard.t0(this.i, view);
                }
            });
        }
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void R() {
        m8b.f("SleepCard", "refresh start! canRefresh is:" + hashCode());
        q0();
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void T() {
        super.T();
        m8b.f("SleepCard", "removeLifecycleObserver :" + hashCode());
        SleepDayViewModel2 sleepDayViewModel2 = this.mSleepDayViewModel;
        if (sleepDayViewModel2 != null) {
            Intrinsics.checkNotNull(sleepDayViewModel2);
            sleepDayViewModel2.E().removeObserver(this.mObserverLastDataTime);
            SleepDayViewModel2 sleepDayViewModel3 = this.mSleepDayViewModel;
            Intrinsics.checkNotNull(sleepDayViewModel3);
            sleepDayViewModel3.I().removeObserver(this.mObserverDetail);
        }
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void V() {
        super.V();
        q0();
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void X(@Nullable Context context) {
        if (this.sleepDayBean == null && !m0().b(DevicesAbilityEnum.SLEEP)) {
            if (gke.INSTANCE.c()) {
                god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=sleep&enablePhoneSleepWatch=1"), (String) null, this.t);
                return;
            } else {
                god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=sleep"), (String) null, this.t);
                return;
            }
        }
        ActivityTransitionUtil.a aVar = ActivityTransitionUtil.Companion;
        FragmentActivity fragmentActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(fragmentActivity, "mActivity");
        Intent intent = new Intent((Context) this.k, (Class<?>) SleepHistoryActivity.class);
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        aVar.n(fragmentActivity, intent, healthCommonCardView);
    }

    public final boolean k0(SleepDayBean last, SleepDayBean newly) {
        if (last != null && newly != null) {
            if (J()) {
                return false;
            }
            return last.getTotalSleepTime() == newly.getTotalSleepTime() && last.getTotalDeepSleepTime() == newly.getTotalDeepSleepTime() && last.getTotalLightlySleepTime() == newly.getTotalLightlySleepTime() && last.getStartSleepTime() == newly.getStartSleepTime() && last.getEndSleepTime() == newly.getEndSleepTime() && last.getScore() == newly.getScore() && last.isCalibration() == newly.isCalibration() && last.getTimestamp() == newly.getTimestamp();
        }
        boolean z = last == null;
        boolean z2 = newly == null;
        StringBuilder sb = new StringBuilder();
        sb.append("checkDataConsistent last is ");
        sb.append(z);
        sb.append(" newly is ");
        sb.append(z2);
        return false;
    }

    public final void l0(long sleepCardLastDataTime) {
        SleepDayViewModel2 sleepDayViewModel2 = this.mSleepDayViewModel;
        Intrinsics.checkNotNull(sleepDayViewModel2);
        pr8 pr8Var = pr8.INSTANCE;
        sleepDayViewModel2.J(pr8Var.o(sleepCardLastDataTime), pr8Var.n(sleepCardLastDataTime));
    }

    public final DevicesAbilityUtils m0() {
        return (DevicesAbilityUtils) this.devicesAbilityUtils.getValue();
    }

    public final void n0() {
        ActivityTransitionUtil.a aVar = ActivityTransitionUtil.Companion;
        FragmentActivity fragmentActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(fragmentActivity, "mActivity");
        Intent intent = new Intent((Context) this.k, (Class<?>) SleepPhoneMeasureActivity.class);
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        aVar.n(fragmentActivity, intent, healthCommonCardView);
    }

    public final void o0() {
        god.c().e(this.k, Uri.parse("healthap://app/path=113?jumpUrl=SleepMusic/index.html#/"), (String) null, this.t);
    }

    public final void p0(SleepDetailsChart chart) {
        chart.setDrawBg(true);
        chart.setBgColor(this.j.getColor(com.heytap.health.health_base.R.color.health_base_black_3alpha));
        chart.getXAxis().setEnabled(false);
        chart.getAxisLeft().setEnabled(false);
        chart.getAxisRight().setEnabled(false);
        chart.setMarker((IMarker) null);
        chart.setHighlightPerDragEnabled(false);
        chart.setOnTouchListener((ChartTouchListener) null);
        chart.setRadius(2.0f);
        chart.e(true);
        chart.n(0.0f, 0.0f, 0.0f, 0.0f);
        if (r0()) {
            chart.P(CollectionsKt.mutableListOf(new SleepUnitData[]{new SleepUnitData(-1L, 1, 0L)}), 10.0f, 1.0f);
            return;
        }
        SleepDayBean sleepDayBean = this.sleepDayBean;
        Intrinsics.checkNotNull(sleepDayBean);
        chart.P(sleepDayBean.getSleepUnitDataList(), 10.0f, 1.0f);
    }

    public final void q0() {
        int iHashCode = hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append("initStoreModel:");
        sb.append(iHashCode);
        if (this.mSleepDayViewModel == null) {
            FragmentActivity fragmentActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(fragmentActivity, "mActivity");
            SleepDayViewModel2 sleepDayViewModel2 = new ViewModelProvider(fragmentActivity).get(SleepDayViewModel2.class);
            this.mSleepDayViewModel = sleepDayViewModel2;
            Intrinsics.checkNotNull(sleepDayViewModel2);
            sleepDayViewModel2.E().removeObservers(this.k);
            SleepDayViewModel2 sleepDayViewModel3 = this.mSleepDayViewModel;
            Intrinsics.checkNotNull(sleepDayViewModel3);
            sleepDayViewModel3.I().removeObservers(this.k);
        }
        SleepDayViewModel2 sleepDayViewModel4 = this.mSleepDayViewModel;
        Intrinsics.checkNotNull(sleepDayViewModel4);
        String ssoid = cn.c().getSsoid();
        Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().getSsoid()");
        sleepDayViewModel4.S(ssoid);
        SleepDayViewModel2 sleepDayViewModel5 = this.mSleepDayViewModel;
        Intrinsics.checkNotNull(sleepDayViewModel5);
        sleepDayViewModel5.E().removeObserver(this.mObserverLastDataTime);
        SleepDayViewModel2 sleepDayViewModel6 = this.mSleepDayViewModel;
        Intrinsics.checkNotNull(sleepDayViewModel6);
        sleepDayViewModel6.I().removeObserver(this.mObserverDetail);
        SleepDayViewModel2 sleepDayViewModel7 = this.mSleepDayViewModel;
        Intrinsics.checkNotNull(sleepDayViewModel7);
        sleepDayViewModel7.E().observe(this.k, this.mObserverLastDataTime);
        SleepDayViewModel2 sleepDayViewModel8 = this.mSleepDayViewModel;
        Intrinsics.checkNotNull(sleepDayViewModel8);
        sleepDayViewModel8.I().observe(this.k, this.mObserverDetail);
        SleepDayViewModel2 sleepDayViewModel9 = this.mSleepDayViewModel;
        Intrinsics.checkNotNull(sleepDayViewModel9);
        sleepDayViewModel9.C();
    }

    public final boolean r0() {
        SleepDayBean sleepDayBean = this.sleepDayBean;
        if (sleepDayBean != null) {
            Intrinsics.checkNotNull(sleepDayBean);
            if (sleepDayBean.hasRealSleepData()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum.DataType t() {
        return HomeCardDataEnum.DataType.SLEEP;
    }

    @SuppressLint({"SetTextI18n"})
    public final void u0(View commonView) {
        if (r0()) {
            m8b.f("SleepCard", "refreshViewIfNeed data is isEmpty");
            S();
            return;
        }
        m8b.f("SleepCard", "refreshViewIfNeed mCommonView is " + (commonView == null));
        if (commonView == null) {
            S();
            return;
        }
        TextView textView = (TextView) commonView.findViewById(R.id.tv_sleep_score);
        SleepDetailsChart sleepDetailsChart = (SleepDetailsChart) commonView.findViewById(R.id.sleep_daily_chart);
        this.r = System.currentTimeMillis();
        SleepDayBean sleepDayBean = this.sleepDayBean;
        Intrinsics.checkNotNull(sleepDayBean);
        int totalSleepTime = (int) sleepDayBean.getTotalSleepTime();
        SleepDayBean sleepDayBean2 = this.sleepDayBean;
        Intrinsics.checkNotNull(sleepDayBean2);
        int score = sleepDayBean2.getScore();
        m8b.f("SleepCard", "sleepTime:" + totalSleepTime + " ,sleepScore:" + score);
        if (score > 0) {
            textView.setVisibility(0);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = this.j.getString(R.string.health_home_card_sleep_score_tip);
            Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.str…ome_card_sleep_score_tip)");
            String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(score)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
        this.t.n.setTextSize(14.0f);
        this.t.p.setVisibility(8);
        c9i c9iVar = c9i.INSTANCE;
        SleepDayBean sleepDayBean3 = this.sleepDayBean;
        Intrinsics.checkNotNull(sleepDayBean3);
        this.t.n.setText(c9iVar.e((int) sleepDayBean3.getTotalSleepTime(), 22.0f, 14.0f));
        HealthCommonCardView healthCommonCardView = this.t;
        SleepDayBean sleepDayBean4 = this.sleepDayBean;
        Intrinsics.checkNotNull(sleepDayBean4);
        healthCommonCardView.e(sleepDayBean4.getCurDayEndTime(), true);
        Intrinsics.checkNotNullExpressionValue(sleepDetailsChart, "mChart");
        p0(sleepDetailsChart);
        sleepDetailsChart.Q();
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum.CardUiMode y() {
        return HomeCardDataEnum.CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }
}