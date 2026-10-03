package com.heytap.health.main.card;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.databaseengine.model.bloodsugar.BloodSugar;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarStat;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.blood.glucose.BloodGlucoseHistoryActivity;
import com.heytap.health.blood.glucose.R$string;
import com.heytap.health.blood.glucose.card.BloodGlucoseAddCard;
import com.heytap.health.blood.glucose.viewmodel.BloodGlucoseCardViewModel;
import com.heytap.health.core.widget.charts.GluCombineChart;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.health.impl.R$color;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.healthbase.ability.DevicesAbilityEnum;
import com.heytap.health.healthbase.ability.utils.DevicesAbilityUtils;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.main.card.BloodSugarCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.r88;
import com.oplus.aiunit.vision.xp0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001>B\u0019\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0006\u0010\r\u001a\u00020\fJ \u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\u0012\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0003J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u001a\u0010 \u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001d018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103¨\u0006?"}, d2 = {"Lcom/heytap/health/main/card/BloodSugarCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "R", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "Landroid/content/Context;", "context", "X", "", "r0", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "L", "Landroid/view/View;", "chartView", "n", ExifInterface.GPS_DIRECTION_TRUE, "u0", "commonView", "v0", "Lcom/heytap/health/core/widget/charts/GluCombineChart;", "chart", "o0", "Lcom/oplus/aiunit/vision/r88;", "last", "newly", "m0", "Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "z", "Lkotlin/Lazy;", "n0", "()Lcom/heytap/health/healthbase/ability/utils/DevicesAbilityUtils;", "devicesAbilityUtils", "Lcom/heytap/health/blood/glucose/viewmodel/BloodGlucoseCardViewModel;", "A", "Lcom/heytap/health/blood/glucose/viewmodel/BloodGlucoseCardViewModel;", "mViewModel", acl.KEY_B, "Lcom/oplus/aiunit/vision/r88;", "gluCardBean", "C", "Z", "needAnimate", "Landroidx/lifecycle/Observer;", "D", "Landroidx/lifecycle/Observer;", "mObservableLastStat", ExifInterface.LONGITUDE_EAST, "mObservableGluCard", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodSugarCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodSugarCard.kt\ncom/heytap/health/main/card/BloodSugarCard\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,330:1\n29#2:331\n1864#3,3:332\n*S KotlinDebug\n*F\n+ 1 BloodSugarCard.kt\ncom/heytap/health/main/card/BloodSugarCard\n*L\n75#1:331\n317#1:332,3\n*E\n"})
public final class BloodSugarCard extends HealthBaseCard {

    @NotNull
    public static final String TAG = "BloodSugarCard";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public BloodGlucoseCardViewModel mViewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public r88 gluCardBean;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean needAnimate;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Observer<r88> mObservableLastStat;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Observer<r88> mObservableGluCard;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy devicesAbilityUtils;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/r88;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b implements Observer<r88> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull r88 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BloodSugarCard bloodSugarCard = BloodSugarCard.this;
            boolean zM0 = bloodSugarCard.m0(bloodSugarCard.gluCardBean, it);
            StringBuilder sb = new StringBuilder();
            sb.append("mObservableCard dataConsistent is ");
            sb.append(zM0);
            if (zM0) {
                return;
            }
            BloodSugarCard.this.gluCardBean = it;
            BloodSugarCard.this.needAnimate = true;
            BloodSugarCard.this.S();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/oplus/aiunit/vision/r88;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c implements Observer<r88> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(@NotNull r88 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getIsNoData()) {
                BloodSugarCard.this.gluCardBean = it;
                BloodSugarCard.this.S();
            } else {
                BloodGlucoseCardViewModel bloodGlucoseCardViewModel = BloodSugarCard.this.mViewModel;
                if (bloodGlucoseCardViewModel != null) {
                    bloodGlucoseCardViewModel.x(it);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodSugarCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.devicesAbilityUtils = LazyKt__LazyJVMKt.lazy(new Function0<DevicesAbilityUtils>() { // from class: com.heytap.health.main.card.BloodSugarCard$devicesAbilityUtils$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DevicesAbilityUtils invoke() {
                return new DevicesAbilityUtils();
            }
        });
        this.mObservableLastStat = new c();
        this.mObservableGluCard = new b();
    }

    public static final String p0(int i, double d) {
        return "";
    }

    public static final String q0(int i, double d) {
        return "";
    }

    public static final void s0(BloodSugarCard this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.X(context);
    }

    public static final void t0(BloodSugarCard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.k, (Class<?>) BloodGlucoseHistoryActivity.class);
        intent.putExtra(BloodGlucoseAddCard.KEY, "0");
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this$0.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        HealthCommonCardView healthCommonCardView = this$0.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        companion.n(mActivity, intent, healthCommonCardView);
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
            this.t.setDataModel(context.getString(R$string.health_blood_glucose));
            v0(x(R$layout.health_common_card_blood_sugar));
        } else {
            this.t.setIcon(R$drawable.health_icon_blood_sugar);
            this.t.f(context.getString(R$string.health_blood_glucose), this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_blood_sugar_no_data_tip), this.f5984j.getString(com.heytap.health.health.impl.R$string.health_home_card_sleep_measure_tip2));
            this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.bt1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodSugarCard.s0(this.i, context, view);
                }
            });
            this.t.f5988l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ct1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodSugarCard.t0(this.i, view);
                }
            });
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        m8b.f(TAG, "refresh start!");
        u0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void T() {
        OLiveData<r88> oLiveDataZ;
        OLiveData<r88> oLiveDataA;
        super.T();
        BloodGlucoseCardViewModel bloodGlucoseCardViewModel = this.mViewModel;
        if (bloodGlucoseCardViewModel != null && (oLiveDataA = bloodGlucoseCardViewModel.A()) != null) {
            oLiveDataA.removeObserver(this.mObservableLastStat);
        }
        BloodGlucoseCardViewModel bloodGlucoseCardViewModel2 = this.mViewModel;
        if (bloodGlucoseCardViewModel2 == null || (oLiveDataZ = bloodGlucoseCardViewModel2.z()) == null) {
            return;
        }
        oLiveDataZ.removeObserver(this.mObservableGluCard);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void V() {
        super.V();
        u0();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@Nullable Context context) {
        if (r0() && !n0().b(DevicesAbilityEnum.BLOOD_SUGAR)) {
            god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=bloodsugar"), null, this.t);
            return;
        }
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        Intent intent = new Intent(this.k, (Class<?>) BloodGlucoseHistoryActivity.class);
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        companion.n(mActivity, intent, healthCommonCardView);
    }

    public final boolean m0(r88 last, r88 newly) {
        if (last == null) {
            return false;
        }
        boolean isNoData = last.getIsNoData();
        BloodSugar lastBloodSugar = last.getLastBloodSugar();
        Double value = lastBloodSugar != null ? lastBloodSugar.getValue() : null;
        BloodSugar lastBloodSugar2 = last.getLastBloodSugar();
        Long lValueOf = lastBloodSugar2 != null ? Long.valueOf(lastBloodSugar2.getDataCreatedTimestamp()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("last:");
        sb.append(isNoData);
        sb.append(", :");
        sb.append(value);
        sb.append(", :");
        sb.append(lValueOf);
        boolean isNoData2 = newly.getIsNoData();
        BloodSugar lastBloodSugar3 = newly.getLastBloodSugar();
        Double value2 = lastBloodSugar3 != null ? lastBloodSugar3.getValue() : null;
        BloodSugar lastBloodSugar4 = newly.getLastBloodSugar();
        Long lValueOf2 = lastBloodSugar4 != null ? Long.valueOf(lastBloodSugar4.getDataCreatedTimestamp()) : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("newly:");
        sb2.append(isNoData2);
        sb2.append(", :");
        sb2.append(value2);
        sb2.append(", :");
        sb2.append(lValueOf2);
        if (J()) {
            return false;
        }
        BloodSugar lastBloodSugar5 = last.getLastBloodSugar();
        BloodSugar lastBloodSugar6 = newly.getLastBloodSugar();
        if (lastBloodSugar5 == null || lastBloodSugar6 == null || !Intrinsics.areEqual(lastBloodSugar5.getValue(), lastBloodSugar6.getValue()) || lastBloodSugar5.getDataCreatedTimestamp() != lastBloodSugar6.getDataCreatedTimestamp() || last.getLastBloodSugarStat() == null || newly.getLastBloodSugarStat() == null || last.getIsNoData() != newly.getIsNoData()) {
            return false;
        }
        BloodSugarStat lastBloodSugarStat = last.getLastBloodSugarStat();
        Intrinsics.checkNotNull(lastBloodSugarStat);
        int date = lastBloodSugarStat.getDate();
        BloodSugarStat lastBloodSugarStat2 = newly.getLastBloodSugarStat();
        Intrinsics.checkNotNull(lastBloodSugarStat2);
        if (date != lastBloodSugarStat2.getDate()) {
            return false;
        }
        BloodSugarStat lastBloodSugarStat3 = last.getLastBloodSugarStat();
        Intrinsics.checkNotNull(lastBloodSugarStat3);
        double highThreshold = lastBloodSugarStat3.getHighThreshold();
        BloodSugarStat lastBloodSugarStat4 = newly.getLastBloodSugarStat();
        Intrinsics.checkNotNull(lastBloodSugarStat4);
        if (!(highThreshold == lastBloodSugarStat4.getHighThreshold())) {
            return false;
        }
        BloodSugarStat lastBloodSugarStat5 = last.getLastBloodSugarStat();
        Intrinsics.checkNotNull(lastBloodSugarStat5);
        double lowThreshold = lastBloodSugarStat5.getLowThreshold();
        BloodSugarStat lastBloodSugarStat6 = newly.getLastBloodSugarStat();
        Intrinsics.checkNotNull(lastBloodSugarStat6);
        if (!(lowThreshold == lastBloodSugarStat6.getLowThreshold())) {
            return false;
        }
        List listFilterNotNull = CollectionsKt___CollectionsKt.filterNotNull(last.e());
        List listFilterNotNull2 = CollectionsKt___CollectionsKt.filterNotNull(newly.e());
        if (listFilterNotNull.size() != listFilterNotNull2.size()) {
            return false;
        }
        int i = 0;
        for (Object obj : listFilterNotNull) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (!(((TimeStampedData) obj).getY() == ((TimeStampedData) listFilterNotNull2.get(i)).getY())) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void n(@NotNull View chartView) {
        Intrinsics.checkNotNullParameter(chartView, "chartView");
        GluCombineChart gluCombineChart = chartView instanceof GluCombineChart ? (GluCombineChart) chartView : null;
        if (gluCombineChart != null) {
            gluCombineChart.animateY(r());
        }
    }

    public final DevicesAbilityUtils n0() {
        return (DevicesAbilityUtils) this.devicesAbilityUtils.getValue();
    }

    public final void o0(GluCombineChart chart) {
        chart.setOnTouchListener((ChartTouchListener) null);
        chart.d(true);
        chart.p(0.0f, 0.0f, 0.0f, 0.0f);
        chart.setExtraOffsets(0.0f, 0.0f, 0.0f, 0.0f);
        chart.setMarker(null);
        chart.getAxisRight().setDrawGridLines(false);
        chart.getXAxis().setDrawGridLines(false);
        chart.setLineStrokeWidth(1.0f);
        chart.getXAxis().setDrawLabels(false);
        chart.getXAxis().setDrawAxisLine(false);
        chart.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.dt1
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return BloodSugarCard.p0(i, d);
            }
        });
        chart.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.et1
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return BloodSugarCard.q0(i, d);
            }
        });
        chart.I(7.8f, 3.9f);
        chart.setYAxisRightValues(new float[]{0.0f, 10.0f});
        chart.getAxisRight().setAxisMinimum(0.0f);
        chart.D(true, false);
        chart.setXAxisTimeUnit(TimeUnit.MINUTE);
        chart.setVisibleXRange(1440.0f, 1440.0f);
        chart.setLineStrokeWidth(1.5f);
        chart.setMaskColor(ContextCompat.getColor(this.f5984j, R$color.health_chart_blood_sugar_normal_bg_color));
    }

    public final boolean r0() {
        r88 r88Var = this.gluCardBean;
        boolean z = false;
        if (r88Var != null && !r88Var.getIsNoData()) {
            z = true;
        }
        return !z;
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.BLOOD_SUGAR;
    }

    public final void u0() {
        if (this.mViewModel == null) {
            FragmentActivity mActivity = this.k;
            Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
            BloodGlucoseCardViewModel bloodGlucoseCardViewModel = (BloodGlucoseCardViewModel) new ViewModelProvider(mActivity).get(BloodGlucoseCardViewModel.class);
            this.mViewModel = bloodGlucoseCardViewModel;
            Intrinsics.checkNotNull(bloodGlucoseCardViewModel);
            bloodGlucoseCardViewModel.A().observe(this.k, this.mObservableLastStat);
            BloodGlucoseCardViewModel bloodGlucoseCardViewModel2 = this.mViewModel;
            Intrinsics.checkNotNull(bloodGlucoseCardViewModel2);
            bloodGlucoseCardViewModel2.z().observe(this.k, this.mObservableGluCard);
        }
        BloodGlucoseCardViewModel bloodGlucoseCardViewModel3 = this.mViewModel;
        if (bloodGlucoseCardViewModel3 != null) {
            String ssoid = cn.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
            bloodGlucoseCardViewModel3.B(ssoid);
        }
        BloodGlucoseCardViewModel bloodGlucoseCardViewModel4 = this.mViewModel;
        if (bloodGlucoseCardViewModel4 != null) {
            bloodGlucoseCardViewModel4.y();
        }
    }

    @SuppressLint({"DefaultLocale"})
    public final void v0(View commonView) {
        float fCoerceAtLeast;
        if (r0()) {
            m8b.f(TAG, "refreshViewIfNeed data is isEmpty");
        }
        if (commonView == null) {
            m8b.f(TAG, "refreshViewIfNeed commonView is null, refreshCardView");
            S();
            return;
        }
        this.r = System.currentTimeMillis();
        GluCombineChart gluCombineChart = (GluCombineChart) commonView.findViewById(R$id.view_history_chart);
        if (gluCombineChart == null) {
            m8b.f(TAG, "refreshViewIfNeed mChart is null, refreshCardView");
            S();
            return;
        }
        r88 r88Var = this.gluCardBean;
        if (r88Var != null) {
            o0(gluCombineChart);
            BloodSugarStat lastBloodSugarStat = r88Var.getLastBloodSugarStat();
            float highThreshold = 7.8f;
            float lowThreshold = 3.9f;
            if (lastBloodSugarStat != null) {
                highThreshold = lastBloodSugarStat.getHighThreshold() > 0.0d ? (float) lastBloodSugarStat.getHighThreshold() : 7.8f;
                lowThreshold = lastBloodSugarStat.getLowThreshold() > 0.0d ? (float) lastBloodSugarStat.getLowThreshold() : 3.9f;
                Double max = lastBloodSugarStat.getMax();
                float fDoubleValue = ((int) (max != null ? max.doubleValue() : 0.0d)) + 2;
                float f = ((int) highThreshold) + 2.0f;
                if (fDoubleValue < f) {
                    fDoubleValue = f;
                }
                fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(fDoubleValue, 10.0f);
            } else {
                fCoerceAtLeast = 0.0f;
            }
            this.t.f5989n.setTextSize(22.0f);
            this.t.p.setTextSize(14.0f);
            BloodSugar lastBloodSugar = r88Var.getLastBloodSugar();
            if (lastBloodSugar != null) {
                Double value = lastBloodSugar.getValue();
                double dDoubleValue = value != null ? value.doubleValue() : 0.0d;
                HealthCommonCardView healthCommonCardView = this.t;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                healthCommonCardView.setDataContent(str);
                this.t.setDataNoticeToTime(lastBloodSugar.getDataCreatedTimestamp());
            }
            this.t.setDataContent2(this.k.getString(R$string.health_blood_glucose_unit));
            gluCombineChart.I(highThreshold, lowThreshold);
            gluCombineChart.getAxisRight().setAxisMinimum(0.0f);
            gluCombineChart.getAxisRight().setAxisMaximum(gluCombineChart.getAxisRight().getGridLineWidth() + fCoerceAtLeast);
            gluCombineChart.setYAxisRightValues(new float[]{0.0f, fCoerceAtLeast});
            gluCombineChart.setTimeXAxisMinimum(r88Var.getChartStartTime());
            gluCombineChart.setTimeXAxisMaximum(r88Var.getChartEndTime());
            gluCombineChart.E(CollectionsKt___CollectionsKt.filterNotNull(r88Var.e()), new ArrayList());
            if (this.needAnimate) {
                n(gluCombineChart);
                this.needAnimate = false;
            }
            this.t.w.setVisibility(8);
            BloodSugar lastBloodSugar2 = r88Var.getLastBloodSugar();
            if (lastBloodSugar2 != null) {
                this.t.w.setVisibility(0);
                switch (lastBloodSugar2.getTrend()) {
                    case 1:
                        this.t.w.setImageResource(R$drawable.health_icon_glu_up);
                        break;
                    case 2:
                        this.t.w.setImageResource(R$drawable.health_icon_glu_right_top);
                        break;
                    case 3:
                        this.t.w.setImageResource(R$drawable.health_icon_glu_right);
                        break;
                    case 4:
                        this.t.w.setImageResource(R$drawable.health_icon_glu_right_down);
                        break;
                    case 5:
                        this.t.w.setImageResource(R$drawable.health_icon_glu_down);
                        break;
                    case 6:
                        this.t.w.setImageResource(R$drawable.health_icon_glu_down2);
                        break;
                    default:
                        this.t.w.setVisibility(8);
                        break;
                }
            }
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }
}