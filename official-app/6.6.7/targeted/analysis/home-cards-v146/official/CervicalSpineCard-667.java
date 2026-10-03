package com.heytap.health.main.card;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.ActivityOptionsCompat;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.cervical_vertebra.R$string;
import com.heytap.health.cervical_vertebra.bean.CSData;
import com.heytap.health.cervical_vertebra.bean.CSStatData;
import com.heytap.health.cervical_vertebra.repository.CSRepository;
import com.heytap.health.cervical_vertebra.util.CSExtensionKt;
import com.heytap.health.cervical_vertebra.view.CSBarChart;
import com.heytap.health.core.widget.charts.HealthBarChart;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.health.impl.R$color;
import com.heytap.health.health.impl.R$drawable;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.health.storemodel.DataModel;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.main.card.CervicalSpineCard;
import com.heytap.health.main.card.common.HealthBaseCard;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.ap2;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.f15;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jzi;
import com.oplus.aiunit.vision.kb9;
import com.oplus.aiunit.vision.kzi;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pae;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.zr8;
import java.time.LocalDateTime;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001LB\u0019\u0012\u0006\u0010F\u001a\u00020E\u0012\b\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bI\u0010JJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\"\u0010\u0015\u001a\u00020\r2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0018H\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012H\u0002J\b\u0010\u001d\u001a\u00020\tH\u0002J\b\u0010\u001e\u001a\u00020\rH\u0014J\b\u0010\u001f\u001a\u00020\rH\u0016J\b\u0010 \u001a\u00020\rH\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020#H\u0014J\u0012\u0010%\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\"\u0010*\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010A¨\u0006M"}, d2 = {"Lcom/heytap/health/main/card/CervicalSpineCard;", "Lcom/heytap/health/main/card/common/HealthBaseCard;", "", "text", "Landroid/content/Context;", "context", "", "u0", "str", "", acl.KEY_A0, "Lcom/oplus/aiunit/vision/jzi;", "y0", "", "r0", "Lcom/heytap/health/cervical_vertebra/view/CSBarChart;", "barChart", "x0", "", "Lcom/heytap/health/cervical_vertebra/bean/CSData;", "csData", "C0", "chart", "D0", "Lcom/heytap/health/core/widget/charts/HealthBarChart;", "", "w0", "Lcom/github/mikephil/charting/data/BarEntry;", "s0", "z0", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "R", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "t", "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$CardUiMode;", "y", "X", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "L", "", "z", "Ljava/lang/Long;", "lastFetchDataTime", "Lcom/heytap/health/cervical_vertebra/bean/CSStatData;", "A", "Lcom/heytap/health/cervical_vertebra/bean/CSStatData;", "stat", acl.KEY_B, "Ljava/util/List;", "detail", "Lcom/heytap/health/cervical_vertebra/repository/CSRepository;", "C", "Lkotlin/Lazy;", "v0", "()Lcom/heytap/health/cervical_vertebra/repository/CSRepository;", "repository", "D", "t0", "()Lcom/oplus/aiunit/vision/jzi;", "mStoreRealize", ExifInterface.LONGITUDE_EAST, "J", "mStartTime", UserInfo.SEX_FEMALE, "mEndTime", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "adapter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCervicalSpineCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CervicalSpineCard.kt\ncom/heytap/health/main/card/CervicalSpineCard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,299:1\n1#2:300\n1083#3,2:301\n*S KotlinDebug\n*F\n+ 1 CervicalSpineCard.kt\ncom/heytap/health/main/card/CervicalSpineCard\n*L\n184#1:301,2\n*E\n"})
public final class CervicalSpineCard extends HealthBaseCard {

    @NotNull
    public static final String STAG = "CervicalSpineCard";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public CSStatData stat;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public List<CSData> detail;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Lazy repository;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Lazy mStoreRealize;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public long mStartTime;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public long mEndTime;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public Long lastFetchDataTime;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/heytap/health/main/card/CervicalSpineCard$b", "Lcom/oplus/aiunit/vision/jzi;", "Lcom/oplus/aiunit/vision/kzi;", "resultBean", "", "b", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends jzi {
        public b(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override // com.oplus.aiunit.vision.u91
        public void b(@NotNull kzi resultBean) {
            Intrinsics.checkNotNullParameter(resultBean, "resultBean");
            f15.Companion companion = f15.INSTANCE;
            LocalDateTime localDateTimeA = companion.A(this.f18736c);
            Long l2 = CervicalSpineCard.this.lastFetchDataTime;
            m8b.f(CervicalSpineCard.STAG, "prepareFetchData:" + localDateTimeA + ", cardLastDataTime:" + (l2 != null ? companion.A(l2.longValue()) : null));
            if (f(this.f18736c)) {
                CervicalSpineCard.this.S();
                return;
            }
            CervicalSpineCard.this.lastFetchDataTime = Long.valueOf(this.f18736c);
            CervicalSpineCard.this.mStartTime = companion.d(this.f18736c);
            CervicalSpineCard.this.mEndTime = companion.c(this.f18736c);
            CervicalSpineCard.this.r0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CervicalSpineCard(@NotNull FragmentActivity activity, @Nullable MultiLayoutAdapter multiLayoutAdapter) {
        super(activity, multiLayoutAdapter);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.repository = LazyKt__LazyJVMKt.lazy(new Function0<CSRepository>() { // from class: com.heytap.health.main.card.CervicalSpineCard$repository$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final CSRepository invoke() {
                return new CSRepository();
            }
        });
        this.mStoreRealize = LazyKt__LazyJVMKt.lazy(new Function0<jzi>() { // from class: com.heytap.health.main.card.CervicalSpineCard$mStoreRealize$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final jzi invoke() {
                return this.this$0.y0();
            }
        });
        this.mStartTime = System.currentTimeMillis();
        this.mEndTime = System.currentTimeMillis();
    }

    public static final void B0(CervicalSpineCard this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t0().h(ap2.class);
    }

    public final boolean A0(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ('0' <= cCharAt && cCharAt < ':') {
                return true;
            }
        }
        return false;
    }

    public final void C0(List<CSData> csData, CSBarChart barChart) {
        m8b.f(STAG, "refreshBarChart dataSize:" + (csData != null ? Integer.valueOf(csData.size()) : null));
        if (barChart != null) {
            boolean z = false;
            if (csData != null && !csData.isEmpty()) {
                z = true;
            }
            if (!z) {
                barChart.setCSEntryData(s0());
                return;
            }
            barChart.setXAxisTimeUnit(TimeUnit.HOUR);
            barChart.setXStart(barChart.getXAxisTimeUnit().timeStampToUnitDouble(((CSData) CollectionsKt___CollectionsKt.first((List) csData)).getDate()));
            barChart.setChartOriData(csData);
            barChart.setYAxisMaximum(w0(barChart));
            D0(barChart);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0(CSBarChart chart) {
        if (chart.getData() != 0) {
            T dataSetByIndex = ((BarData) chart.getData()).getDataSetByIndex(0);
            Intrinsics.checkNotNull(dataSetByIndex, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
            ((BarDataSet) dataSetByIndex).setBarShadowColor(if0.y(this.f5984j) ? chart.getContext().getColor(R$color.health_1AFFFFFF) : chart.getContext().getColor(R$color.health_0F000000));
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void L(@Nullable RecyclerView.ViewHolder holder, int position, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m8b.f(STAG, "onCommonBindViewHolder, isEmpty:" + z0());
        super.L(holder, position, context);
        this.t.setIcon(R$drawable.health_icon_cervical_spine);
        if (z0()) {
            this.t.f(context.getString(R$string.health_cs_title), context.getString(com.heytap.health.health.impl.R$string.health_home_card_cs_tip_earphone), context.getString(com.heytap.health.health.impl.R$string.health_home_card_to_understand));
            View viewInflate = LayoutInflater.from(context).inflate(R$layout.health_cs_empty_card, (ViewGroup) this.t.getFrameLayout(), false);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
            this.t.addView((ViewGroup) viewInflate);
            return;
        }
        this.t.setDataModel(context.getString(R$string.health_cs_title));
        View viewX = x(R$layout.health_cs_common_card);
        CSBarChart cSBarChart = viewX != null ? (CSBarChart) viewX.findViewById(R$id.cs_bar_chart) : null;
        x0(cSBarChart);
        HealthCommonCardView healthCommonCardView = this.t;
        Long l2 = this.lastFetchDataTime;
        Intrinsics.checkNotNull(l2);
        healthCommonCardView.e(l2.longValue(), true);
        CSStatData cSStatData = this.stat;
        if (cSStatData != null) {
            Intrinsics.checkNotNull(cSStatData);
            this.t.setDataContent(StringsKt__StringsKt.trim(u0(CSExtensionKt.l(cSStatData), context)));
            this.t.f5989n.setTextSize(18.0f);
            this.t.p.setVisibility(8);
        }
        C0(this.detail, cSBarChart);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void R() {
        m8b.f(STAG, "refresh");
        ThreadUtils.doInBackground("CervicalCard", new Runnable() { // from class: com.oplus.aiunit.vision.x53
            @Override // java.lang.Runnable
            public final void run() {
                CervicalSpineCard.B0(this.i);
            }
        });
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void T() {
        super.T();
        t0().o();
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void V() {
        super.V();
        t0().h(ap2.class);
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    public void X(@Nullable Context context) {
        boolean zR = fdg.x("cervical_has_in_detail_table_name").r("cervical_has_in_detail_key", false);
        m8b.f(STAG, "rootViewOnClick:" + zR);
        if (z0() && !zR) {
            god.c().e(this.k, Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=cervicalhealth"), null, this.t);
            return;
        }
        ActivityTransitionUtil.Companion companion = ActivityTransitionUtil.INSTANCE;
        FragmentActivity mActivity = this.k;
        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
        HealthCommonCardView healthCommonCardView = this.t;
        Intrinsics.checkNotNullExpressionValue(healthCommonCardView, "healthCommonCardView");
        ActivityOptionsCompat activityOptionsCompatA = companion.a(mActivity, healthCommonCardView);
        Postcard postcardWithString = e1.d().b("/cs/CervicalSpineActivity").withString(ActivityTransitionUtil.KEY_ACTIVITY_TRANSITION_TARGET_NAME, this.t.getTransitionName());
        postcardWithString.withOptionsCompat(ActivityOptionsCompat.fromBundle(activityOptionsCompatA != null ? activityOptionsCompatA.toBundle() : null));
        postcardWithString.navigation(this.k);
    }

    public final void r0() {
        f15.Companion companion = f15.INSTANCE;
        m8b.f(STAG, "fetchData:" + companion.A(this.mStartTime) + ",endTime:" + companion.A(this.mEndTime));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(zr8.INSTANCE.f()), null, null, new CervicalSpineCard$fetchData$1(this, null), 3, null);
    }

    public final List<BarEntry> s0() {
        return CollectionsKt__CollectionsJVMKt.listOf(new BarEntry(0.0f, new float[]{0.0f, 0.0f, 0.0f}));
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$DataType t() {
        return HomeCardDataEnum$DataType.CERVICAL_SPINE;
    }

    public final jzi t0() {
        return (jzi) this.mStoreRealize.getValue();
    }

    public final CharSequence u0(String text, Context context) {
        if (!A0(text)) {
            return text;
        }
        Spannable spannableA = new pae.a(this.f5984j, text).i(context.getColor(R$color.health_1A1A1A)).j(2).k(qmg.n(this.f5984j, 14.0f)).l(qmg.n(this.f5984j, 26.0f)).h().a();
        Intrinsics.checkNotNullExpressionValue(spannableA, "Builder(mContext, text)\n…build()\n            .text");
        return spannableA;
    }

    public final CSRepository v0() {
        return (CSRepository) this.repository.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float w0(HealthBarChart chart) {
        if (chart.getYMax() <= 0.0f) {
            return 1.0f;
        }
        return ((IBarDataSet) ((BarData) chart.getData()).getDataSetByIndex(0)).getEntryCount() == 1 ? chart.getYMax() / 0.7f : chart.getYMax();
    }

    public final void x0(CSBarChart barChart) {
        if (barChart != null) {
            new kb9().a(barChart);
            barChart.e(true);
            barChart.setTouchEnabled(false);
            barChart.n(1.0f, 1.0f, 1.0f, 1.0f);
            barChart.setCSEntryData(s0());
            D0(barChart);
        }
    }

    @Override // com.heytap.health.main.card.common.HealthBaseCard
    @NotNull
    public HomeCardDataEnum$CardUiMode y() {
        return HomeCardDataEnum$CardUiMode.CARD_HALF_LINE_FOLLOWED;
    }

    public final jzi y0() {
        jzi jziVarP = new b(this.k).p(DataModel.LAST);
        Intrinsics.checkNotNullExpressionValue(jziVarP, "private fun initStoreMod…del(DataModel.LAST)\n    }");
        return jziVarP;
    }

    public final boolean z0() {
        m8b.f(STAG, "isEmpty : " + this.lastFetchDataTime);
        Long l2 = this.lastFetchDataTime;
        return l2 == null || (l2 != null && l2.longValue() == Long.MIN_VALUE);
    }
}