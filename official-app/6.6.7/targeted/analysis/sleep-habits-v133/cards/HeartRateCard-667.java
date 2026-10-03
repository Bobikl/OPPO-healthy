package com.heytap.health.main.wristtemperature;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.model.GradientColor;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.core.widget.charts.HeartRateBarChart;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import com.heytap.health.health.impl.R;
import com.heytap.health.health.storemodel.DataModel;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.heartrate.measure.ui.HeartMeasureGuideActivity;
import com.heytap.health.heartrate.ui.HeartRateHistoryActivity;
import com.heytap.health.heartrate.viewmodel.HeartRateCardViewModel;
import com.heytap.health.homecard.constant.HomeCardDataEnum;
import com.heytap.health.main.wristtemperature.HeartRateCard;
import com.heytap.health.main.wristtemperature.common.HealthBaseCard;
import com.heytap.health.main.wristtemperature.common.HealthCommonCardView;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.g59;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.hrb;
import com.oplus.aiunit.vision.jzi;
import com.oplus.aiunit.vision.kzi;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.u79;
import com.oplus.aiunit.vision.u91;
import com.oplus.aiunit.vision.v39;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
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
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001HB\u0019\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010FJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0014J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0002J\u001c\u0010\"\u001a\u00020!2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001eH\u0002R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0011\u0010@\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006I"}, d2 = {"Lcom/heytap/health/main/card/HeartRateCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", "R", "V", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "", "position", "Landroid/content/Context;", "context", "L", "Landroid/view/View;", "chartView", "n", "X", "T", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "commonView", "q0", "Lcom/heytap/health/core/widget/charts/HeartRateBarChart;", "chart", "p0", "", "o0", "r0", "m0", "Lcom/oplus/aiunit/vision/v39;", "last", "newly", "", "l0", "Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "z", "Lkotlin/Lazy;", "n0", "()Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "devicesAbilityUtils", "A", "Lcom/oplus/aiunit/vision/v39;", "mHeartRateCardBean", "", "B", "J", "mStartTime", "C", "mEndTime", "Lcom/heytap/health/heartrate/viewmodel/HeartRateCardViewModel;", "D", "Lcom/heytap/health/heartrate/viewmodel/HeartRateCardViewModel;", "mViewModel", "Lcom/oplus/aiunit/vision/jzi;", "E", "Lcom/oplus/aiunit/vision/jzi;", "mStoreRealize", "Landroidx/lifecycle/Observer;", "F", "Landroidx/lifecycle/Observer;", "mObserverDetailData", "s0", "()Z", "isEmpty", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHeartRateCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateCard.kt\ncom/heytap/health/main/card/HeartRateCard\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,385:1\n29#2:386\n29#2:387\n29#2:388\n*S KotlinDebug\n*F\n+ 1 HeartRateCard.kt\ncom/heytap/health/main/card/HeartRateCard\n*L\n236#1:386\n243#1:387\n117#1:388\n*E\n"})
public final class HeartRateCard extends HealthBaseCard {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public v39 mHeartRateCardBean;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public long mStartTime;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public long mEndTime;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public HeartRateCardViewModel mViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public jzi mStoreRealize;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Observer<v39> mObserverDetailData;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy devicesAbilityUtils;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/heytap/health/main/card/HeartRateCard$b", "Lcom/oplus/aiunit/vision/jzi;", "Lcom/oplus/aiunit/vision/kzi;", "resultBean", "", "b", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends jzi {
        public b(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        public void b(@NotNull kzi resultBean) {
            Intrinsics.checkNotNullParameter(resultBean, "resultBean");
            m8b.f("HeartRateCard", "prepareFetchData:" + ((u91) this).c + "; this = " + this);
            if (f(((u91) this).c)) {
                HeartRateCard.this.S();
                return;
            }
            LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(((u91) this).c), ZoneId.systemDefault()).toLocalDate();
            HeartRateCard.this.mStartTime = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            HeartRateCard.this.mEndTime = localDate.plusDays(1L).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            HeartRateCard.this.m0();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/v39;", "heartRateCardBean", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c implements Observer<v39> {
        public c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@Nullable v39 v39Var) {
            HeartRateCard heartRateCard = HeartRateCard.this;
            boolean zL0 = heartRateCard.l0(heartRateCard.mHeartRateCardBean, v39Var);
            StringBuilder sb = new StringBuilder();
            sb.append("mObservableCard dataConsistent is ");
            sb.append(zL0);
            if (zL0) {
                return;
            }
            HeartRateCard.this.mHeartRateCardBean = v39Var;
            HeartRateCard.this.S();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartRateCard(@NotNull FragmentActivity fragmentActivity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(fragmentActivity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        this.devicesAbilityUtils = LazyKt.lazy(new Function0<DevicesAbilityUtils>() { // from class: com.heytap.health.main.card.HeartRateCard$devicesAbilityUtils$2
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DevicesAbilityUtils m7invoke() {
                return new DevicesAbilityUtils();
            }
        });
        this.mObserverDetailData = new c();
    }

    public static final void t0(HeartRateCard heartRateCard, Context context, View view) {
        Intrinsics.checkNotNullParameter(heartRateCard, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        heartRateCard.X(context);
    }

    public static final void u0(boolean z, HeartRateCard heartRateCard, View view) {
        Intrinsics.checkNotNullParameter(heartRateCard, "this$0");
        if (!z) {
            god.c().e(heartRateCard.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=heartrate"), (String) null, heartRateCard.t);
            return;
        }
        ActivityTransitionUtil.a aVar = ActivityTransitionUtil.Companion;
        FragmentActivity fragmentActivity = heartRateCard.k;
        Intrinsics.checkNotNullExpressionValue(fragmentActivity, "mActivity");
        Intent intent = new Intent((Context) heartRateCard.k, (Class<?>) HeartMeasureGuideActivity.class);
        HealthCommonCardView healthCommonCardView = heartRateCard.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        aVar.n(fragmentActivity, intent, healthCommonCardView);
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void L(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull final Context context) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        super.L(holder, position, context);
        boolean zS0 = s0();
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder isEmpty is ");
        sb.append(zS0);
        if (zS0) {
            this.t.setIcon(R.drawable.health_icon_heart);
            hrb.a aVar = hrb.Companion;
            Context context2 = this.j;
            Intrinsics.checkNotNullExpressionValue(context2, "mContext");
            final boolean zA = aVar.a(context2);
            String string = zA ? this.j.getString(R.string.health_home_card_hr_measure) : this.j.getString(R.string.health_home_card_to_understand);
            Intrinsics.checkNotNullExpressionValue(string, "if (supportMeasure) {\n  …understand)\n            }");
            this.t.f(context.getString(com.heytap.health.heartrate.R.string.health_heart_rate), this.j.getString(R.string.health_home_card_hr_no_data_tip), string);
            this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.t39
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HeartRateCard.t0(this.i, context, view);
                }
            });
            this.t.l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.u39
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HeartRateCard.u0(zA, this, view);
                }
            });
            return;
        }
        this.t.setDataModel(context.getString(com.heytap.health.heartrate.R.string.health_heart_rate));
        View viewX = x(com.heytap.health.heartrate.R.layout.health_heart_rate_common_card);
        HeartRateBarChart heartRateBarChartFindViewById = viewX.findViewById(com.heytap.health.heartrate.R.id.heart_rate_bar_chart);
        q0(viewX);
        if (o()) {
            Intrinsics.checkNotNullExpressionValue(heartRateBarChartFindViewById, "heartRateBarChart");
            n(heartRateBarChartFindViewById);
        }
        TextView textView = (TextView) viewX.findViewById(com.heytap.health.heartrate.R.id.tv_rest_hr_value);
        v39 v39Var = this.mHeartRateCardBean;
        Intrinsics.checkNotNull(v39Var);
        g59 g59VarB = v39Var.b();
        v39 v39Var2 = this.mHeartRateCardBean;
        Intrinsics.checkNotNull(v39Var2);
        if (lo9.d(v39Var2.e(), System.currentTimeMillis()) || g59VarB == null) {
            v39 v39Var3 = this.mHeartRateCardBean;
            Intrinsics.checkNotNull(v39Var3);
            strValueOf = String.valueOf(v39Var3.d());
        } else if (g59VarB.g() == g59VarB.f()) {
            strValueOf = String.valueOf(g59VarB.g());
        } else {
            strValueOf = g59VarB.g() + "-" + g59VarB.f();
        }
        int iJ = g59VarB != null ? g59VarB.j() : 0;
        if (iJ > 0) {
            textView.setVisibility(0);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string2 = this.j.getString(R.string.health_home_card_hr_rest_value);
            Intrinsics.checkNotNullExpressionValue(string2, "mContext.getString(com.h…_home_card_hr_rest_value)");
            String str = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(iJ)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
        this.t.n.setTextSize(22.0f);
        this.t.p.setTextSize(14.0f);
        this.t.setDataContent(strValueOf);
        this.t.setDataContent2(context.getString(com.heytap.health.health_base.R.string.health_base_heart_rate_state_util));
        HealthCommonCardView healthCommonCardView = this.t;
        v39 v39Var4 = this.mHeartRateCardBean;
        Intrinsics.checkNotNull(v39Var4);
        healthCommonCardView.setDataNoticeToTime(v39Var4.e());
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void R() {
        m8b.f("HeartRateCard", "refresh start! canRefresh is ");
        jzi jziVar = this.mStoreRealize;
        if (jziVar == null) {
            r0();
        } else {
            Intrinsics.checkNotNull(jziVar);
            jziVar.h(u79.class);
        }
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void T() {
        super.T();
        jzi jziVar = this.mStoreRealize;
        HeartRateCardViewModel heartRateCardViewModel = this.mViewModel;
        StringBuilder sb = new StringBuilder();
        sb.append("removeLifecycleObserver mStoreRealize = ");
        sb.append(jziVar);
        sb.append("; mViewModel = ");
        sb.append(heartRateCardViewModel);
        jzi jziVar2 = this.mStoreRealize;
        if (jziVar2 != null) {
            Intrinsics.checkNotNull(jziVar2);
            jziVar2.o();
        }
        HeartRateCardViewModel heartRateCardViewModel2 = this.mViewModel;
        if (heartRateCardViewModel2 != null) {
            Intrinsics.checkNotNull(heartRateCardViewModel2);
            heartRateCardViewModel2.K().removeObserver(this.mObserverDetailData);
        }
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void V() {
        super.V();
        jzi jziVar = this.mStoreRealize;
        if (jziVar == null) {
            r0();
        } else {
            Intrinsics.checkNotNull(jziVar);
            jziVar.h(u79.class);
        }
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void X(@Nullable Context context) {
        if (!s0() || n0().b(DevicesAbilityEnum.HEART_RATE)) {
            ActivityTransitionUtil.a aVar = ActivityTransitionUtil.Companion;
            FragmentActivity fragmentActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(fragmentActivity, "mActivity");
            Intent intent = new Intent((Context) this.k, (Class<?>) HeartRateHistoryActivity.class);
            HealthCommonCardView healthCommonCardView = this.t;
            Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
            aVar.n(fragmentActivity, intent, healthCommonCardView);
            return;
        }
        hrb.a aVar2 = hrb.Companion;
        Context context2 = this.j;
        Intrinsics.checkNotNullExpressionValue(context2, "mContext");
        if (aVar2.a(context2)) {
            god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=heartrate&enablePhoneHeartRateWatch=1"), (String) null, this.t);
        } else {
            god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=heartrate"), (String) null, this.t);
        }
    }

    public final boolean l0(v39 last, v39 newly) {
        if (last == null || newly == null) {
            boolean z = last == null;
            boolean z2 = newly == null;
            StringBuilder sb = new StringBuilder();
            sb.append("checkDataConsistent last is ");
            sb.append(z);
            sb.append(" newly is ");
            sb.append(z2);
            return false;
        }
        if (J()) {
            return false;
        }
        if (last.e() != newly.e()) {
            long jE = last.e();
            long jE2 = newly.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkDataConsistent getTime last time is ");
            sb2.append(jE);
            sb2.append(" newly time is ");
            sb2.append(jE2);
            return false;
        }
        if (last.c().size() != newly.c().size()) {
            int size = last.c().size();
            int size2 = newly.c().size();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("checkDataConsistent size lastsize is ");
            sb3.append(size);
            sb3.append(" newly size is ");
            sb3.append(size2);
            return false;
        }
        if (last.b() != null && newly.b() != null) {
            g59 g59VarB = last.b();
            Intrinsics.checkNotNull(g59VarB);
            int iG = g59VarB.g();
            g59 g59VarB2 = newly.b();
            Intrinsics.checkNotNull(g59VarB2);
            if (iG == g59VarB2.g()) {
                g59 g59VarB3 = last.b();
                Intrinsics.checkNotNull(g59VarB3);
                int iF = g59VarB3.f();
                g59 g59VarB4 = newly.b();
                Intrinsics.checkNotNull(g59VarB4);
                if (iF == g59VarB4.f()) {
                    g59 g59VarB5 = last.b();
                    Intrinsics.checkNotNull(g59VarB5);
                    int iJ = g59VarB5.j();
                    g59 g59VarB6 = newly.b();
                    Intrinsics.checkNotNull(g59VarB6);
                    if (iJ == g59VarB6.j()) {
                        List list = CollectionsKt.toList(last.a());
                        List list2 = CollectionsKt.toList(newly.a());
                        if (list.size() != list2.size()) {
                            int size3 = list.size();
                            int size4 = list2.size();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("checkDataConsistent last candle size is ");
                            sb4.append(size3);
                            sb4.append(" newly candle size is ");
                            sb4.append(size4);
                            return false;
                        }
                        int size5 = list.size();
                        for (int i = 0; i < size5; i++) {
                            HealthCandleEntry healthCandleEntry = (HealthCandleEntry) list2.get(i);
                            HealthCandleEntry healthCandleEntry2 = (HealthCandleEntry) list.get(i);
                            if (healthCandleEntry.getLow() == healthCandleEntry2.getLow()) {
                                if (healthCandleEntry.getHigh() == healthCandleEntry2.getHigh()) {
                                }
                            }
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void m0() {
        if (this.mViewModel == null) {
            FragmentActivity fragmentActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(fragmentActivity, "mActivity");
            HeartRateCardViewModel heartRateCardViewModel = new ViewModelProvider(fragmentActivity).get(HeartRateCardViewModel.class);
            this.mViewModel = heartRateCardViewModel;
            Intrinsics.checkNotNull(heartRateCardViewModel);
            heartRateCardViewModel.K().removeObservers(this.k);
        }
        HeartRateCardViewModel heartRateCardViewModel2 = this.mViewModel;
        Intrinsics.checkNotNull(heartRateCardViewModel2);
        heartRateCardViewModel2.K().observe(this.k, this.mObserverDetailData);
        long j = this.mStartTime;
        long j2 = this.mEndTime - 1;
        StringBuilder sb = new StringBuilder();
        sb.append("fetchHeartRateData mStartTime = ");
        sb.append(j);
        sb.append(" mEndTime = ");
        sb.append(j2);
        HeartRateCardViewModel heartRateCardViewModel3 = this.mViewModel;
        Intrinsics.checkNotNull(heartRateCardViewModel3);
        heartRateCardViewModel3.Z(cn.c().getSsoid());
        HeartRateCardViewModel heartRateCardViewModel4 = this.mViewModel;
        Intrinsics.checkNotNull(heartRateCardViewModel4);
        heartRateCardViewModel4.F(this.mStartTime, this.mEndTime - 1);
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    public void n(@NotNull View chartView) {
        Intrinsics.checkNotNullParameter(chartView, "chartView");
        if (s0() || !(chartView instanceof HeartRateBarChart)) {
            return;
        }
        ((HeartRateBarChart) chartView).animateY(r());
    }

    public final DevicesAbilityUtils n0() {
        return (DevicesAbilityUtils) this.devicesAbilityUtils.getValue();
    }

    public final float o0(HeartRateBarChart chart) {
        if (chart.getData().getYMin() == chart.getData().getYMax()) {
            return chart.getYMax() + 1;
        }
        return chart.getData().getDataSetByIndex(0).getEntryCount() == 1 ? (float) ((((double) chart.getYMax()) - (((double) chart.getYMin()) * 0.3d)) / ((double) 0.7f)) : chart.getYMax();
    }

    public final void p0(HeartRateBarChart chart) {
        chart.getXAxis().setEnabled(false);
        chart.getAxisRight().setEnabled(false);
        chart.getXAxis().setGranularity(1.0f);
        chart.setOnTouchListener((ChartTouchListener) null);
        chart.setBarWidth(0.6363636f);
        chart.setXAxisMinimum(0.0d);
        chart.setXAxisMaximum(24.0d);
        chart.e(true);
        chart.l(1.0f, 1.0f, 1.0f, 1.0f);
        chart.setForceCandleHeightBiggerThanWidth(true);
        chart.setYAxisMinimum((chart.getData().getYMin() > chart.getData().getYMax() ? 1 : (chart.getData().getYMin() == chart.getData().getYMax() ? 0 : -1)) == 0 ? chart.getYMin() - 1 : chart.getYMin());
        chart.setYAxisMaximum(o0(chart));
        Context context = this.j;
        int i = R.color.health_color_heart;
        chart.setBarGradientColor(new GradientColor(ContextCompat.getColor(context, i), ContextCompat.getColor(this.j, i)));
        CandleDataSet dataSetByIndex = chart.getData().getDataSetByIndex(0);
        Intrinsics.checkNotNull(dataSetByIndex, "null cannot be cast to non-null type com.github.mikephil.charting.data.CandleDataSet");
        CandleDataSet candleDataSet = dataSetByIndex;
        candleDataSet.setShowCandleBar(true);
        candleDataSet.setShadowColor(chart.getContext().getColor(R.color.health_card_bar_chart_bg));
    }

    public final void q0(View commonView) {
        if (commonView == null || s0()) {
            return;
        }
        HeartRateBarChart heartRateBarChart = (HeartRateBarChart) commonView.findViewById(com.heytap.health.heartrate.R.id.heart_rate_bar_chart);
        v39 v39Var = this.mHeartRateCardBean;
        Intrinsics.checkNotNull(v39Var);
        heartRateBarChart.setEntryList(v39Var.a());
        Intrinsics.checkNotNullExpressionValue(heartRateBarChart, "heartRateBarChart");
        p0(heartRateBarChart);
    }

    public final void r0() {
        jzi jziVarP = new b(this.k).p(DataModel.LAST);
        this.mStoreRealize = jziVarP;
        Intrinsics.checkNotNull(jziVarP);
        jziVarP.h(u79.class);
    }

    public final boolean s0() {
        v39 v39Var = this.mHeartRateCardBean;
        if (v39Var != null) {
            Intrinsics.checkNotNull(v39Var);
            if (!v39Var.f()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum.DataType t() {
        return HomeCardDataEnum.DataType.HEART_RATE;
    }

    @Override // com.heytap.health.main.wristtemperature.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum.CardUiMode y() {
        return HomeCardDataEnum.CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }
}