package com.heytap.health.main.card;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.databaseengine.model.stress.Stress;
import com.heytap.databaseengine.model.stress.StressDataStat;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.core.widget.charts.HealthBarChart;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import com.heytap.health.health.impl.R$color;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.health.storemodel.DataModel;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.main.card.StressCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.stress.R$id;
import com.heytap.health.stress.R$layout;
import com.heytap.health.stress.R$string;
import com.heytap.health.stress.ui.StressHistoryActivity;
import com.heytap.health.stress.viewmodel.StressCardViewModel;
import com.heytap.health.stress.viewmodel.StressStoreViewModel;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.jzi;
import com.oplus.aiunit.vision.kzi;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.v1j;
import com.oplus.aiunit.vision.w0j;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 R2\u00020\u0001:\u0001SB\u0019\u0012\u0006\u0010M\u001a\u00020L\u0012\b\u0010O\u001a\u0004\u0018\u00010N¢\u0006\u0004\bP\u0010QJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u001e\u0010!\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\u0002H\u0002J \u0010+\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)H\u0002J\u001a\u0010/\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020,H\u0002R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020,0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0011\u0010K\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006T"}, d2 = {"Lcom/heytap/health/main/card/StressCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroid/view/View;", "chartView", "n", "R", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "Landroid/content/Context;", "context", "L", "X", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "commonView", "", "needAnimate", "v0", "", SpeechConstant.KEY_TTS_TIMESTAMP, "s0", "Lcom/heytap/health/core/widget/charts/HealthBarChart;", "chart", "", "Lcom/heytap/health/core/widget/charts/data/HealthSingleBarEntry;", "dataList", "p0", "", "o0", "m0", "l0", "q0", "startTime", "endTime", "Lcom/heytap/databaseengine/model/stress/StressDataStat;", "stressDataStat", "k0", "Lcom/oplus/aiunit/vision/w0j;", "last", "newly", "j0", "Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "z", "Lkotlin/Lazy;", "n0", "()Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "devicesAbilityUtils", "Lcom/oplus/aiunit/vision/jzi;", "A", "Lcom/oplus/aiunit/vision/jzi;", "mStoreRealize", "Lcom/heytap/health/stress/viewmodel/StressStoreViewModel;", acl.KEY_B, "Lcom/heytap/health/stress/viewmodel/StressStoreViewModel;", "stressStoreViewModel", "Lcom/heytap/health/stress/viewmodel/StressCardViewModel;", "C", "Lcom/heytap/health/stress/viewmodel/StressCardViewModel;", "mViewModel", "D", "Lcom/oplus/aiunit/vision/w0j;", "stressCardBean", "Landroidx/lifecycle/Observer;", ExifInterface.LONGITUDE_EAST, "Landroidx/lifecycle/Observer;", "mStressCardDataObserver", "r0", "()Z", "isEmpty", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStressCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressCard.kt\ncom/heytap/health/main/card/StressCard\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,362:1\n1855#2,2:363\n29#3:365\n*S KotlinDebug\n*F\n+ 1 StressCard.kt\ncom/heytap/health/main/card/StressCard\n*L\n198#1:363,2\n233#1:365\n*E\n"})
public final class StressCard extends HealthBaseCard {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public jzi mStoreRealize;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public StressStoreViewModel stressStoreViewModel;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public StressCardViewModel mViewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public w0j stressCardBean;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Observer<w0j> mStressCardDataObserver;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy devicesAbilityUtils;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/heytap/health/main/card/StressCard$b", "Lcom/oplus/aiunit/vision/jzi;", "Lcom/oplus/aiunit/vision/kzi;", "resultBean", "", "b", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends jzi {
        public b(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override // com.oplus.aiunit.vision.u91
        public void b(@NotNull kzi resultBean) {
            long jA;
            StressDataStat stressDataStat;
            Intrinsics.checkNotNullParameter(resultBean, "resultBean");
            m8b.f("StressCard", "prepareFetchData:" + resultBean);
            if (resultBean.b() == null || !(resultBean.b() instanceof StressDataStat)) {
                jA = Long.MIN_VALUE;
                stressDataStat = null;
            } else {
                Object objB = resultBean.b();
                Intrinsics.checkNotNull(objB, "null cannot be cast to non-null type com.heytap.databaseengine.model.stress.StressDataStat");
                stressDataStat = (StressDataStat) objB;
                jA = o15.a(stressDataStat.getDate());
            }
            StressDataStat stressDataStat2 = stressDataStat;
            if (f(jA) || stressDataStat2 == null) {
                StressCard.this.S();
                return;
            }
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(jA), ZoneId.systemDefault());
            StressCard.this.k0(LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), LocalDateTime.of(localDateTimeOfInstant.toLocalDate(), LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), stressDataStat2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/w0j;", "stressCardBean", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c implements Observer<w0j> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull w0j stressCardBean) {
            Intrinsics.checkNotNullParameter(stressCardBean, "stressCardBean");
            StressCard stressCard = StressCard.this;
            boolean zJ0 = stressCard.j0(stressCard.stressCardBean, stressCardBean);
            StringBuilder sb = new StringBuilder();
            sb.append("mObservableCard dataConsistent is ");
            sb.append(zJ0);
            if (zJ0) {
                return;
            }
            StressCard.this.stressCardBean = stressCardBean;
            StressCard.this.S();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.devicesAbilityUtils = LazyKt__LazyJVMKt.lazy(new Function0<DevicesAbilityUtils>() { // from class: com.heytap.health.main.card.StressCard$devicesAbilityUtils$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DevicesAbilityUtils invoke() {
                return new DevicesAbilityUtils();
            }
        });
        this.mStressCardDataObserver = new c();
    }

    public static final void t0(StressCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.X(context);
    }

    public static final void u0(StressCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.X(context);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void L(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull final Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        super.L(holder, position, context);
        boolean zR0 = r0();
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder isEmpty is ");
        sb.append(zR0);
        if (!zR0) {
            this.t.setDataModel(context.getString(R$string.health_stress));
            v0(x(R$layout.health_stress_common_card), o());
        } else {
            this.t.setIcon(R$drawable.health_icon_stress);
            this.t.f(this.f5984j.getString(R$string.health_stress), this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_stress_no_data_tip), this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_to_understand));
            this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.u0j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StressCard.t0(this.i, context, view);
                }
            });
            this.t.f5988l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.v0j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StressCard.u0(this.i, context, view);
                }
            });
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        m8b.f("StressCard", "refresh start! canRefresh is ");
        q0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void T() {
        super.T();
        jzi jziVar = this.mStoreRealize;
        if (jziVar != null) {
            Intrinsics.checkNotNull(jziVar);
            jziVar.o();
        }
        StressCardViewModel stressCardViewModel = this.mViewModel;
        if (stressCardViewModel != null) {
            Intrinsics.checkNotNull(stressCardViewModel);
            stressCardViewModel.A().removeObserver(this.mStressCardDataObserver);
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void V() {
        super.V();
        q0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@Nullable Context context) {
        if (r0() && !n0().b(DevicesAbilityEnum.STRESS)) {
            god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=pressure"), null, this.t);
            return;
        }
        Intent intent = new Intent(this.k, (Class<?>) StressHistoryActivity.class);
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        companion.n(mActivity, intent, healthCommonCardView);
    }

    public final boolean j0(w0j last, w0j newly) {
        if (last == null) {
            return false;
        }
        List list = CollectionsKt___CollectionsKt.toList(last.c());
        List list2 = CollectionsKt___CollectionsKt.toList(newly.c());
        if (list.isEmpty() || list2.isEmpty() || list.size() != list2.size() || J()) {
            return false;
        }
        Stress stress = (Stress) list.get(list.size() - 1);
        Stress stress2 = (Stress) list2.get(list2.size() - 1);
        if (stress.getDataCreatedTimestamp() == stress2.getDataCreatedTimestamp() && stress.getStressValue() == stress2.getStressValue() && last.getCurStat() != null && newly.getCurStat() != null) {
            StressDataStat curStat = last.getCurStat();
            Intrinsics.checkNotNull(curStat);
            int date = curStat.getDate();
            StressDataStat curStat2 = newly.getCurStat();
            Intrinsics.checkNotNull(curStat2);
            return date == curStat2.getDate();
        }
        return false;
    }

    public final void k0(long startTime, long endTime, StressDataStat stressDataStat) {
        StressCardViewModel stressCardViewModel = this.mViewModel;
        Intrinsics.checkNotNull(stressCardViewModel);
        stressCardViewModel.x(startTime, endTime, stressDataStat);
    }

    public final int l0(float y) {
        if (y <= 29.0f) {
            return ContextCompat.getColor(this.f5984j, R$color.health_color_00BCD4);
        }
        if (y <= 59.0f) {
            return ContextCompat.getColor(this.f5984j, R$color.health_color_00C853);
        }
        return y <= 79.0f ? ContextCompat.getColor(this.f5984j, R$color.health_color_FFB300) : ContextCompat.getColor(this.f5984j, R$color.health_color_FF5722);
    }

    public final List<HealthSingleBarEntry> m0(List<HealthSingleBarEntry> dataList) {
        for (HealthSingleBarEntry healthSingleBarEntry : dataList) {
            healthSingleBarEntry.setColor(l0(healthSingleBarEntry.getY()));
        }
        return dataList;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void n(@NotNull View chartView) {
        Intrinsics.checkNotNullParameter(chartView, "chartView");
        if (chartView instanceof HealthBarChart) {
            m8b.f("AnimateStressCard", "animateY");
            ((HealthBarChart) chartView).animateY(r());
        }
    }

    public final DevicesAbilityUtils n0() {
        return (DevicesAbilityUtils) this.devicesAbilityUtils.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float o0(HealthBarChart chart) {
        if (chart.getYMax() <= 0.0f) {
            return 1.0f;
        }
        return ((IBarDataSet) ((BarData) chart.getData()).getDataSetByIndex(0)).getEntryCount() == 1 ? chart.getYMax() / 0.7f : chart.getYMax();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(HealthBarChart chart, List<HealthSingleBarEntry> dataList) {
        int size = dataList.size();
        StringBuilder sb = new StringBuilder();
        sb.append("initChart size is :");
        sb.append(size);
        chart.setForceRadiusHalfBarWidth(true);
        chart.setBarWidth(0.6363636f);
        chart.setXAxisMinimum(0.0f);
        chart.setXAxisMaximum(23.0f);
        chart.getXAxis().setGranularity(1.0f);
        chart.getXAxis().setLabelCount(24, false);
        chart.getXAxis().setEnabled(false);
        chart.getAxisRight().setEnabled(false);
        chart.getAxisLeft().setEnabled(false);
        chart.setOnTouchListener((ChartTouchListener) null);
        chart.t();
        chart.setEntryList(m0(dataList));
        chart.setDrawAllBarShadow(false);
        chart.setDrawBarShadow(true);
        chart.setYAxisMinimum(0.0f);
        chart.e(true);
        chart.n(0.0f, 0.0f, 0.0f, 0.0f);
        chart.setYAxisMaximum(o0(chart));
        T dataSetByIndex = ((BarData) chart.getData()).getDataSetByIndex(0);
        Intrinsics.checkNotNull(dataSetByIndex, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
        ((BarDataSet) dataSetByIndex).setBarShadowColor(chart.getContext().getColor(R$color.health_card_bar_chart_bg));
    }

    public final void q0() {
        if (this.mStoreRealize == null) {
            this.mStoreRealize = new b(this.k).p(DataModel.LAST);
            if (this.mViewModel == null) {
                FragmentActivity mActivity = this.k;
                Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                StressCardViewModel stressCardViewModel = (StressCardViewModel) new ViewModelProvider(mActivity).get(StressCardViewModel.class);
                this.mViewModel = stressCardViewModel;
                Intrinsics.checkNotNull(stressCardViewModel);
                stressCardViewModel.A().removeObservers(this.k);
            }
            StressCardViewModel stressCardViewModel2 = this.mViewModel;
            Intrinsics.checkNotNull(stressCardViewModel2);
            stressCardViewModel2.A().observe(this.k, this.mStressCardDataObserver);
        }
        if (this.stressStoreViewModel == null) {
            this.stressStoreViewModel = new StressStoreViewModel();
        }
        StressStoreViewModel stressStoreViewModel = this.stressStoreViewModel;
        if (stressStoreViewModel != null) {
            stressStoreViewModel.i(cn.c().getSsoid());
        }
        jzi jziVar = this.mStoreRealize;
        Intrinsics.checkNotNull(jziVar);
        jziVar.g(this.stressStoreViewModel);
    }

    public final boolean r0() {
        List<Stress> listC;
        w0j w0jVar = this.stressCardBean;
        if (w0jVar == null) {
            return true;
        }
        if (w0jVar != null && w0jVar.getIsEmpty()) {
            return true;
        }
        w0j w0jVar2 = this.stressCardBean;
        return w0jVar2 != null && (listC = w0jVar2.c()) != null && listC.isEmpty();
    }

    public final boolean s0(long timeStamp) {
        LocalDateTime localDateTimeAtStartOfDay = LocalDate.now().atStartOfDay();
        Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay, "now().atStartOfDay()");
        return timeStamp >= h15.I(localDateTimeAtStartOfDay);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.STRESS;
    }

    public final void v0(View commonView, boolean needAnimate) {
        String strValueOf;
        String strA;
        StringBuilder sb = new StringBuilder();
        sb.append("refreshViewIfNeed mCommonView is ");
        sb.append(commonView);
        if (commonView == null) {
            return;
        }
        TextView textView = (TextView) commonView.findViewById(R$id.tv_stress_status);
        HealthBarChart mChart = (HealthBarChart) commonView.findViewById(R$id.health_heart_rate_bar_chart);
        this.r = System.currentTimeMillis();
        Intrinsics.checkNotNullExpressionValue(mChart, "mChart");
        w0j w0jVar = this.stressCardBean;
        Intrinsics.checkNotNull(w0jVar);
        p0(mChart, w0jVar.a());
        pr8 pr8Var = pr8.INSTANCE;
        w0j w0jVar2 = this.stressCardBean;
        Intrinsics.checkNotNull(w0jVar2);
        StressDataStat curStat = w0jVar2.getCurStat();
        Intrinsics.checkNotNull(curStat);
        long jG = pr8Var.g(curStat.getDate());
        if (s0(jG)) {
            w0j w0jVar3 = this.stressCardBean;
            Intrinsics.checkNotNull(w0jVar3);
            List<Stress> listC = w0jVar3.c();
            w0j w0jVar4 = this.stressCardBean;
            Intrinsics.checkNotNull(w0jVar4);
            Stress stress = listC.get(w0jVar4.c().size() - 1);
            strValueOf = String.valueOf(stress.getStressValue());
            strA = v1j.a(stress.getStressValue());
            this.t.setDataNotice(lo9.g(stress.getDataCreatedTimestamp(), o15.DATE_FORMAT_HOUR));
        } else {
            w0j w0jVar5 = this.stressCardBean;
            Intrinsics.checkNotNull(w0jVar5);
            StressDataStat curStat2 = w0jVar5.getCurStat();
            Intrinsics.checkNotNull(curStat2);
            String strValueOf2 = String.valueOf(curStat2.getAverageStress());
            w0j w0jVar6 = this.stressCardBean;
            Intrinsics.checkNotNull(w0jVar6);
            StressDataStat curStat3 = w0jVar6.getCurStat();
            Intrinsics.checkNotNull(curStat3);
            String strA2 = v1j.a(curStat3.getAverageStress());
            this.t.e(jG, false);
            strValueOf = strValueOf2;
            strA = strA2;
        }
        this.t.f5989n.setTextSize(22.0f);
        this.t.p.setVisibility(8);
        this.t.setDataContent(strValueOf);
        textView.setText(strA);
        if (needAnimate) {
            n(mChart);
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_NOT_FOLLOWED;
    }
}