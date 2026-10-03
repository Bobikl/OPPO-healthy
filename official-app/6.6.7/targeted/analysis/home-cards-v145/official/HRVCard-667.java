package com.heytap.health.main.card;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.hrv.R$id;
import com.heytap.health.hrv.R$layout;
import com.heytap.health.hrv.R$string;
import com.heytap.health.hrv.constant.HrvConstant;
import com.heytap.health.hrv.ui.chart.BaseChart;
import com.heytap.health.hrv.ui.item.DayChartViewKt;
import com.heytap.health.hrv.viewmodel.StressDataChartVM;
import com.heytap.health.main.card.HRVCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.kh9;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.ti9;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001?B\u0019\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u001c\u0010\u0018\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002J.\u0010!\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u001bH\u0002R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u0015048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006@"}, d2 = {"Lcom/heytap/health/main/card/HRVCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "R", "", "n0", "Landroid/content/Context;", "context", "X", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "L", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "s0", "m0", "Lcom/oplus/aiunit/vision/kh9;", "last", "newly", "k0", "Lcom/heytap/health/hrv/ui/chart/BaseChart;", "chart", "", "minTime", "maxTime", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "chartList", "r0", SpeechConstant.KEY_TTS_TIMESTAMP, "o0", "Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "z", "Lkotlin/Lazy;", "l0", "()Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "devicesAbilityUtils", "Lcom/heytap/health/hrv/viewmodel/StressDataChartVM;", "A", "Lcom/heytap/health/hrv/viewmodel/StressDataChartVM;", "mViewModel", acl.KEY_B, "Z", "showChartBaseLine", "C", "Lcom/oplus/aiunit/vision/kh9;", "hrvCardDataBean", "Landroidx/lifecycle/Observer;", "D", "Landroidx/lifecycle/Observer;", "mObservableCard", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHRVCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HRVCard.kt\ncom/heytap/health/main/card/HRVCard\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n29#2:274\n1#3:275\n766#4:276\n857#4,2:277\n*S KotlinDebug\n*F\n+ 1 HRVCard.kt\ncom/heytap/health/main/card/HRVCard\n*L\n81#1:274\n143#1:276\n143#1:277,2\n*E\n"})
public final class HRVCard extends HealthBaseCard {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public StressDataChartVM mViewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean showChartBaseLine;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public kh9 hrvCardDataBean;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Observer<kh9> mObservableCard;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy devicesAbilityUtils;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/kh9;", "hrvCardDataBean", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b implements Observer<kh9> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull kh9 hrvCardDataBean) {
            Intrinsics.checkNotNullParameter(hrvCardDataBean, "hrvCardDataBean");
            HRVCard hRVCard = HRVCard.this;
            boolean zK0 = hRVCard.k0(hRVCard.hrvCardDataBean, hrvCardDataBean);
            m8b.f("HRVCard", "data callBack dataConsistent:" + zK0);
            if (zK0) {
                return;
            }
            HRVCard.this.showChartBaseLine = true;
            HRVCard.this.hrvCardDataBean = hrvCardDataBean;
            HRVCard.this.S();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HRVCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.devicesAbilityUtils = LazyKt__LazyJVMKt.lazy(new Function0<DevicesAbilityUtils>() { // from class: com.heytap.health.main.card.HRVCard$devicesAbilityUtils$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DevicesAbilityUtils invoke() {
                return new DevicesAbilityUtils();
            }
        });
        this.mObservableCard = new b();
    }

    public static final void p0(HRVCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X(context);
    }

    public static final void q0(HRVCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X(context);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void L(@Nullable RecyclerView.ViewHolder holder, int position, @Nullable final Context context) {
        long jA;
        int stressState;
        super.L(holder, position, context);
        boolean zN0 = n0();
        m8b.f("HRVCard", "onCommonBindViewHolder isEmpty:" + zN0);
        if (zN0) {
            this.t.setIcon(R$drawable.health_icon_hrv);
            this.t.f(this.f5984j.getString(R$string.health_hrv_title), this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_hrv_no_data_tip), this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_to_understand));
            this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.kg8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HRVCard.p0(this.i, context, view);
                }
            });
            this.t.f5988l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.lg8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HRVCard.q0(this.i, context, view);
                }
            });
            return;
        }
        kh9 kh9Var = this.hrvCardDataBean;
        Intrinsics.checkNotNull(kh9Var);
        if (kh9Var.getCurStat() == null) {
            m8b.f("HRVCard", "isEmpty state error 1");
            return;
        }
        this.t.setDataModel(this.f5984j.getString(R$string.health_hrv_title));
        this.t.f5989n.setTextSize(22.0f);
        this.t.p.setVisibility(8);
        View commonView = x(R$layout.health_hrv_common_card);
        Intrinsics.checkNotNullExpressionValue(commonView, "commonView");
        BaseChart baseChartI = DayChartViewKt.i(commonView);
        TextView textView = (TextView) commonView.findViewById(R$id.tv_target_value);
        kh9 kh9Var2 = this.hrvCardDataBean;
        Intrinsics.checkNotNull(kh9Var2);
        if (kh9Var2.getCurStat() != null) {
            kh9 kh9Var3 = this.hrvCardDataBean;
            Intrinsics.checkNotNull(kh9Var3);
            PhysicalMentalStat curStat = kh9Var3.getCurStat();
            Intrinsics.checkNotNull(curStat);
            jA = o15.a(curStat.getDate());
        } else {
            jA = 0;
        }
        if (o0(jA)) {
            kh9 kh9Var4 = this.hrvCardDataBean;
            Intrinsics.checkNotNull(kh9Var4);
            List<TimeStampedData> listA = kh9Var4.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (((TimeStampedData) obj).getHeartRateType() != 0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                TimeStampedData timeStampedData = (TimeStampedData) CollectionsKt___CollectionsKt.last((List) arrayList);
                stressState = timeStampedData.getHeartRateType();
                this.t.f5989n.setText(String.valueOf((int) timeStampedData.getY()));
                if (timeStampedData.getHeartRateType() == 0) {
                    this.t.setDataNotice("");
                } else {
                    this.t.setDataNotice(lo9.g(timeStampedData.getTimestamp(), o15.DATE_FORMAT_HOUR));
                }
            } else {
                m8b.f("HRVCard", "isEmpty state error 2");
                stressState = 0;
            }
        } else {
            kh9 kh9Var5 = this.hrvCardDataBean;
            Intrinsics.checkNotNull(kh9Var5);
            PhysicalMentalStat curStat2 = kh9Var5.getCurStat();
            Intrinsics.checkNotNull(curStat2);
            stressState = curStat2.getStressState();
            TextView textView2 = this.t.f5989n;
            kh9 kh9Var6 = this.hrvCardDataBean;
            Intrinsics.checkNotNull(kh9Var6);
            PhysicalMentalStat curStat3 = kh9Var6.getCurStat();
            Intrinsics.checkNotNull(curStat3);
            textView2.setText(String.valueOf(curStat3.getAvgStress()));
            pr8 pr8Var = pr8.INSTANCE;
            this.t.setDataNotice(pr8Var.m(System.currentTimeMillis(), jA) == 1 ? commonView.getContext().getString(com.heytap.health.health.impl.R$string.health_yesterday) : (pr8Var.u(System.currentTimeMillis()) > pr8Var.u(jA) ? 1 : (pr8Var.u(System.currentTimeMillis()) == pr8Var.u(jA) ? 0 : -1)) == 0 ? lo9.g(jA, "MMMd") : lo9.g(jA, "yyyMMMd"));
        }
        textView.setText(ti9.a(stressState));
        this.t.w.setVisibility(0);
        if (stressState == 1) {
            this.t.w.setImageResource(R$drawable.health_icon_hrv_level_over);
        } else if (stressState == 2) {
            this.t.w.setImageResource(R$drawable.health_icon_hrv_level_normal);
        } else if (stressState == 3) {
            this.t.w.setImageResource(R$drawable.health_icon_hrv_level_relax);
        } else if (stressState != 4) {
            this.t.w.setVisibility(8);
        } else {
            this.t.w.setImageResource(R$drawable.health_icon_hrv_level_good);
        }
        kh9 kh9Var7 = this.hrvCardDataBean;
        Intrinsics.checkNotNull(kh9Var7);
        long curMinTime = kh9Var7.getCurMinTime();
        kh9 kh9Var8 = this.hrvCardDataBean;
        Intrinsics.checkNotNull(kh9Var8);
        long curMaxTime = kh9Var8.getCurMaxTime();
        kh9 kh9Var9 = this.hrvCardDataBean;
        Intrinsics.checkNotNull(kh9Var9);
        r0(baseChartI, curMinTime, curMaxTime, kh9Var9.a());
        if (this.showChartBaseLine) {
            baseChartI.setBaseLines(HrvConstant.INSTANCE.a());
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        m8b.f("HRVCard", "refresh");
        if (this.mViewModel == null) {
            m0();
        }
        s0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void V() {
        super.V();
        m8b.f("HRVCard", "requestDataFirstTime");
        m0();
        s0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@Nullable Context context) {
        if (n0() && !l0().b(DevicesAbilityEnum.HRV)) {
            god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=physicalandmentalstate"), null, this.t);
            return;
        }
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        ActivityOptionsCompat activityOptionsCompatA = companion.a(mActivity, healthCommonCardView);
        Postcard postcardWithString = e1.d().b("/hrv/StressDetailActivity").withString(ActivityTransitionUtil.KEY_ACTIVITY_TRANSITION_TARGET_NAME, this.t.getTransitionName());
        postcardWithString.withOptionsCompat(ActivityOptionsCompat.fromBundle(activityOptionsCompatA != null ? activityOptionsCompatA.toBundle() : null));
        postcardWithString.navigation(context);
    }

    public final boolean k0(kh9 last, kh9 newly) {
        if (last == null || newly == null || last.getCurStat() == null || newly.getCurStat() == null || J()) {
            return false;
        }
        PhysicalMentalStat curStat = last.getCurStat();
        Intrinsics.checkNotNull(curStat);
        int avgStress = curStat.getAvgStress();
        PhysicalMentalStat curStat2 = newly.getCurStat();
        Intrinsics.checkNotNull(curStat2);
        if (avgStress != curStat2.getAvgStress()) {
            return false;
        }
        List list = CollectionsKt___CollectionsKt.toList(last.a());
        List list2 = CollectionsKt___CollectionsKt.toList(newly.a());
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                return true;
            }
            if (!(((TimeStampedData) list.get(i)).getY() == ((TimeStampedData) list2.get(i)).getY()) || ((TimeStampedData) list.get(i)).getTimestamp() != ((TimeStampedData) list2.get(i)).getTimestamp()) {
                return false;
            }
            i++;
        }
    }

    public final DevicesAbilityUtils l0() {
        return (DevicesAbilityUtils) this.devicesAbilityUtils.getValue();
    }

    public final void m0() {
        if (this.mViewModel == null) {
            FragmentActivity mActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
            this.mViewModel = (StressDataChartVM) new ViewModelProvider(mActivity).get(StressDataChartVM.class);
        }
        StressDataChartVM stressDataChartVM = this.mViewModel;
        Intrinsics.checkNotNull(stressDataChartVM);
        stressDataChartVM.H().observe(this.k, this.mObservableCard);
        StressDataChartVM stressDataChartVM2 = this.mViewModel;
        Intrinsics.checkNotNull(stressDataChartVM2);
        stressDataChartVM2.w().observe(this.k, new c(new Function1<Long, Unit>() { // from class: com.heytap.health.main.card.HRVCard$initData$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke2(l2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Long lastTime) {
                if ((lastTime != null && lastTime.longValue() == 0) || (lastTime != null && lastTime.longValue() == Long.MIN_VALUE)) {
                    kh9 unused = this.this$0.hrvCardDataBean;
                    this.this$0.S();
                    return;
                }
                pr8 pr8Var = pr8.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(lastTime, "lastTime");
                LocalDate localDateJ = pr8Var.j(lastTime.longValue());
                LocalDateTime localDateTimeAtStartOfDay = localDateJ.atStartOfDay();
                Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay, "lastDate.atStartOfDay()");
                long jI = h15.I(localDateTimeAtStartOfDay);
                LocalDateTime localDateTimeAtStartOfDay2 = localDateJ.plusDays(1L).atStartOfDay();
                Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay2, "lastDate.plusDays(1).atStartOfDay()");
                long jI2 = h15.I(localDateTimeAtStartOfDay2) - 1;
                StressDataChartVM stressDataChartVM3 = this.this$0.mViewModel;
                Intrinsics.checkNotNull(stressDataChartVM3);
                stressDataChartVM3.D(jI, jI2);
            }
        }));
    }

    public final boolean n0() {
        kh9 kh9Var = this.hrvCardDataBean;
        if (kh9Var == null) {
            return true;
        }
        Intrinsics.checkNotNull(kh9Var);
        return kh9Var.getIsEmpty();
    }

    public final boolean o0(long timeStamp) {
        LocalDateTime localDateTimeAtStartOfDay = LocalDate.now().atStartOfDay();
        Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay, "now().atStartOfDay()");
        return timeStamp >= h15.I(localDateTimeAtStartOfDay);
    }

    public final void r0(BaseChart chart, long minTime, long maxTime, List<? extends TimeStampedData> chartList) {
        chart.setChartBackgroundRadius(2.0f);
        chart.setTimeXAxisMinimum(minTime);
        chart.setTimeXAxisMaximum(maxTime);
        chart.d(true);
        chart.p(1.0f, 1.0f, 1.0f, 1.0f);
        chart.setEntryData(chartList);
    }

    public final void s0() {
        StressDataChartVM stressDataChartVM = this.mViewModel;
        Intrinsics.checkNotNull(stressDataChartVM);
        String ssoid = cn.c().getSsoid();
        Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
        stressDataChartVM.K(ssoid);
        StressDataChartVM stressDataChartVM2 = this.mViewModel;
        Intrinsics.checkNotNull(stressDataChartVM2);
        stressDataChartVM2.v();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.HRV;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }
}