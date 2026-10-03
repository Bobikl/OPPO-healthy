package com.heytap.health.hrv.ui.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.hrv.R$id;
import com.heytap.health.hrv.R$layout;
import com.heytap.health.hrv.ui.item.CalendarPanelFragment;
import com.heytap.health.hrv.ui.item.StressDayDataView;
import com.heytap.health.hrv.viewmodel.StressDataAnalyzeVM;
import com.heytap.health.hrv.viewmodel.StressStatChartVM;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.compose.composable.DatePickerKt;
import com.heytap.sporthealth.blib.compose.modifier.AutoClipContentModifierKt;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.gf8;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.ir9;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.zs9;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00103\u001a\u0004\u0018\u00010.8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/heytap/health/hrv/ui/detail/StressDetailDataFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "Lcom/oplus/aiunit/vision/ir9;", "Lcom/oplus/aiunit/vision/zs9;", "", "getLayoutId", "Landroid/view/View;", "view", "", "initView", "initData", "r0", "q0", "v0", "w0", "Lcom/heytap/health/hrv/viewmodel/StressDataAnalyzeVM;", "o", "Lcom/heytap/health/hrv/viewmodel/StressDataAnalyzeVM;", "mViewModel", "Lcom/heytap/health/hrv/viewmodel/StressStatChartVM;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/hrv/viewmodel/StressStatChartVM;", "mStatViewModel", "Landroidx/viewpager/widget/ViewPager;", "q", "Landroidx/viewpager/widget/ViewPager;", "mViewPager", "Landroidx/compose/runtime/MutableState;", "", "r", "Landroidx/compose/runtime/MutableState;", "mDateTitle", "Lkotlin/Pair;", "", "s", "mDateStepPair", "Ljava/time/LocalDate;", "t", "Ljava/time/LocalDate;", "mLocalDate", "u", "Z", "isFirstLoad", "v", "Ljava/lang/String;", "TAG", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "w", "Lkotlin/Lazy;", "R6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "", "x", "t0", "()J", "locationTime", "<init>", "()V", "ChartPagerAdapter", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class StressDetailDataFragment extends BaseFragment implements ir9, zs9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public StressDataAnalyzeVM mViewModel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public StressStatChartVM mStatViewModel;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public ViewPager mViewPager;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final MutableState<String> mDateTitle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final MutableState<Pair<Boolean, Boolean>> mDateStepPair;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public LocalDate mLocalDate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean isFirstLoad;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyGetFamilyConfig;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Lazy locationTime;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0002R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u00040\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/heytap/health/hrv/ui/detail/StressDetailDataFragment$ChartPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "", "getCount", "", "ssoid", "", "b", "position", "Landroidx/fragment/app/Fragment;", "getItem", "Landroid/view/ViewGroup;", "container", "", "instantiateItem", "object", "destroyItem", "obj", "getItemPosition", CityBean.POS, "a", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "fm", "Landroidx/fragment/app/FragmentActivity;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Lcom/heytap/health/hrv/viewmodel/StressStatChartVM;", "c", "Lcom/heytap/health/hrv/viewmodel/StressStatChartVM;", "mStatViewModel", "kotlin.jvm.PlatformType", "d", "Ljava/lang/String;", "mSsoid", MapSchema.FIELD_NAME_ENTRY, "I", "viewPagerId", "Ljava/util/concurrent/ConcurrentHashMap;", "f", "Ljava/util/concurrent/ConcurrentHashMap;", "fragmentCache", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/FragmentActivity;)V", "hrv_release"}, k = 1, mv = {1, 8, 0})
    public static final class ChartPagerAdapter extends FragmentStatePagerAdapter {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final FragmentManager fm;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final FragmentActivity fragmentActivity;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final StressStatChartVM mStatViewModel;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public String mSsoid;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final int viewPagerId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final ConcurrentHashMap<Integer, Fragment> fragmentCache;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChartPagerAdapter(@NotNull FragmentManager fm, @NotNull FragmentActivity fragmentActivity) {
            super(fm);
            Intrinsics.checkNotNullParameter(fm, "fm");
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            this.fm = fm;
            this.fragmentActivity = fragmentActivity;
            this.mStatViewModel = (StressStatChartVM) new ViewModelProvider(fragmentActivity).get(StressStatChartVM.class);
            this.mSsoid = cn.c().getSsoid();
            this.viewPagerId = R$id.hrv_day_chart_viewpager;
            this.fragmentCache = new ConcurrentHashMap<>();
        }

        @Nullable
        public final Fragment a(int pos) {
            if (pos < getCount() && pos >= 0) {
                Fragment fragment = this.fragmentCache.get(Integer.valueOf(pos));
                if (fragment != null && fragment.isAdded()) {
                    return fragment;
                }
                Fragment fragmentFindFragmentByTag = this.fm.findFragmentByTag("android:switcher:" + this.viewPagerId + ":" + pos);
                if (fragmentFindFragmentByTag != null) {
                    this.fragmentCache.put(Integer.valueOf(pos), fragmentFindFragmentByTag);
                    return fragmentFindFragmentByTag;
                }
            }
            return null;
        }

        public final void b(@NotNull String ssoid) {
            Intrinsics.checkNotNullParameter(ssoid, "ssoid");
            this.mSsoid = ssoid;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(object, "object");
            this.fragmentCache.remove(Integer.valueOf(position));
            super.destroyItem(container, position, object);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            List<PhysicalMentalStat> value = this.mStatViewModel.G().getValue();
            List<PhysicalMentalStat> list = value;
            if (list == null || list.isEmpty()) {
                return 1;
            }
            gf8.Companion aVar = gf8.INSTANCE;
            return Math.max(((int) ChronoUnit.DAYS.between(aVar.f(o15.a(((PhysicalMentalStat) CollectionsKt___CollectionsKt.first((List) value)).getDate())), aVar.f(o15.a(((PhysicalMentalStat) CollectionsKt___CollectionsKt.last((List) value)).getDate())))) + 1, 1);
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NotNull
        public Fragment getItem(int position) {
            StringBuilder sb = new StringBuilder();
            sb.append("getItem position = ");
            sb.append(position);
            int count = (position + 1) - getCount();
            StressDataChartFragment.Companion aVar = StressDataChartFragment.INSTANCE;
            LocalDate localDatePlusDays = gf8.INSTANCE.a().plusDays(count);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "HDateUtil.getCurrentDate…plusDays(offset.toLong())");
            String mSsoid = this.mSsoid;
            Intrinsics.checkNotNullExpressionValue(mSsoid, "mSsoid");
            return aVar.a(localDatePlusDays, mSsoid);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return -2;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
        @NotNull
        public Object instantiateItem(@NotNull ViewGroup container, int position) {
            Intrinsics.checkNotNullParameter(container, "container");
            Object objInstantiateItem = super.instantiateItem(container, position);
            Intrinsics.checkNotNull(objInstantiateItem, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            Fragment fragment = (Fragment) objInstantiateItem;
            this.fragmentCache.put(Integer.valueOf(position), fragment);
            return fragment;
        }
    }

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

    public StressDetailDataFragment() {
        Boolean bool = Boolean.TRUE;
        this.mDateStepPair = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(bool, bool), null, 2, null);
        this.mLocalDate = gf8.INSTANCE.a();
        this.isFirstLoad = true;
        this.TAG = "StressDetailFrag";
        this.lazyGetFamilyConfig = LazyKt__LazyJVMKt.lazy(new Function0<FamilyMoreDataDetailConfigBean>() { // from class: com.heytap.health.hrv.ui.detail.StressDetailDataFragment$lazyGetFamilyConfig$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @Nullable
            public final FamilyMoreDataDetailConfigBean invoke() {
                Bundle arguments = this.this$0.getArguments();
                if (arguments != null) {
                    return (FamilyMoreDataDetailConfigBean) BundleCompat.getSerializable(arguments, "ARGUMENT_MORE_DATA_DETAIL", FamilyMoreDataDetailConfigBean.class);
                }
                return null;
            }
        });
        this.locationTime = LazyKt__LazyJVMKt.lazy(new Function0<Long>() { // from class: com.heytap.health.hrv.ui.detail.StressDetailDataFragment$locationTime$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Long invoke() {
                StressDetailDataFragment stressDetailDataFragment = this.this$0;
                return Long.valueOf(stressDetailDataFragment.u0(stressDetailDataFragment.getArguments()));
            }
        });
    }

    @Override // com.oplus.aiunit.vision.ir9
    @Nullable
    public FamilyMoreDataDetailConfigBean R6() {
        return (FamilyMoreDataDetailConfigBean) this.lazyGetFamilyConfig.getValue();
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.health_hrv_day_data_fragment;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initData() {
        StressDataAnalyzeVM stressDataAnalyzeVM = (StressDataAnalyzeVM) new ViewModelProvider(this).get(StressDataAnalyzeVM.class);
        this.mViewModel = stressDataAnalyzeVM;
        if (stressDataAnalyzeVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            stressDataAnalyzeVM = null;
        }
        stressDataAnalyzeVM.S(s0());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        this.mStatViewModel = (StressStatChartVM) new ViewModelProvider(fragmentActivityRequireActivity).get(StressStatChartVM.class);
        v0();
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(@Nullable View view) {
        ((ComposeView) W(R$id.hrv_day_date_title)).setContent(ComposableLambdaKt.composableLambdaInstance(-775407265, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.ui.detail.StressDetailDataFragment$initView$1$1
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-775407265, i, -1, "com.heytap.health.hrv.ui.detail.StressDetailDataFragment.initView.<anonymous>.<anonymous> (StressDetailDataFragment.kt:90)");
                }
                Modifier.Companion companion = Modifier.Companion;
                int i2 = R$color.lib_base_card_white_bg_2;
                Modifier modifierB = AutoClipContentModifierKt.b(BackgroundKt.m163backgroundbw27NRU$default(companion, ColorResources_androidKt.colorResource(i2, composer, 0), null, 2, null));
                final StressDetailDataFragment stressDetailDataFragment = this.this$0;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierB);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer);
                Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1266setimpl(composerM1259constructorimpl, density, companion2.getSetDensity());
                Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                composer.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                MutableState mutableState = stressDetailDataFragment.mDateTitle;
                long jColorResource = ColorResources_androidKt.colorResource(i2, composer, 0);
                DatePickerKt.a(mutableState, new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.detail.StressDetailDataFragment$initView$1$1$1$1
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
                        ViewPager viewPager = stressDetailDataFragment.mViewPager;
                        if (viewPager == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                            viewPager = null;
                        }
                        viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                    }
                }, new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.detail.StressDetailDataFragment$initView$1$1$1$2
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
                        ViewPager viewPager = stressDetailDataFragment.mViewPager;
                        if (viewPager == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                            viewPager = null;
                        }
                        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                    }
                }, stressDetailDataFragment.mDateStepPair, jColorResource, new Function0<Unit>() { // from class: com.heytap.health.hrv.ui.detail.StressDetailDataFragment$initView$1$1$1$3
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
                        stressDetailDataFragment.w0();
                    }
                }, composer, 0, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        FrameLayout frameLayout = (FrameLayout) W(R$id.fl_day_data_content);
        ViewPager viewPager = null;
        View viewInflate = LayoutInflater.from(requireActivity()).inflate(R$layout.health_hrv_stressviewpager, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        this.mViewPager = (ViewPager) viewInflate;
        if (frameLayout != null) {
            StressDayDataView stressDayDataView = new StressDayDataView(this);
            ViewPager viewPager2 = this.mViewPager;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            } else {
                viewPager = viewPager2;
            }
            frameLayout.addView(stressDayDataView.c(viewPager));
        }
    }

    public final void q0() {
        ViewPager viewPager = this.mViewPager;
        ViewPager viewPager2 = null;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager = null;
        }
        PagerAdapter adapter = viewPager.getAdapter();
        ChartPagerAdapter chartPagerAdapter = adapter instanceof ChartPagerAdapter ? (ChartPagerAdapter) adapter : null;
        if (chartPagerAdapter == null) {
            return;
        }
        ViewPager viewPager3 = this.mViewPager;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        } else {
            viewPager2 = viewPager3;
        }
        Fragment fragmentA = chartPagerAdapter.a(viewPager2.getCurrentItem());
        if (fragmentA instanceof StressDataChartFragment) {
            ((StressDataChartFragment) fragmentA).j0();
        }
    }

    public final void r0() {
        ViewPager viewPager = this.mViewPager;
        ViewPager viewPager2 = null;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager = null;
        }
        PagerAdapter adapter = viewPager.getAdapter();
        ChartPagerAdapter chartPagerAdapter = adapter instanceof ChartPagerAdapter ? (ChartPagerAdapter) adapter : null;
        if (chartPagerAdapter == null) {
            return;
        }
        ViewPager viewPager3 = this.mViewPager;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        } else {
            viewPager2 = viewPager3;
        }
        Fragment fragmentA = chartPagerAdapter.a(viewPager2.getCurrentItem());
        if (fragmentA instanceof StressDataChartFragment) {
            ((StressDataChartFragment) fragmentA).k0();
        }
    }

    @NotNull
    public String s0() {
        return ir9.a.a(this);
    }

    public long t0() {
        return ((Number) this.locationTime.getValue()).longValue();
    }

    public long u0(@Nullable Bundle bundle) {
        return zs9.a.a(this, bundle);
    }

    @Override // com.oplus.aiunit.vision.ir9
    public boolean u5() {
        return ir9.a.c(this);
    }

    public final void v0() {
        ViewPager viewPager = this.mViewPager;
        StressStatChartVM stressStatChartVM = null;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager = null;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "this.requireActivity()");
        ChartPagerAdapter chartPagerAdapter = new ChartPagerAdapter(childFragmentManager, fragmentActivityRequireActivity);
        chartPagerAdapter.b(s0());
        viewPager.setAdapter(chartPagerAdapter);
        StressStatChartVM stressStatChartVM2 = this.mStatViewModel;
        if (stressStatChartVM2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatViewModel");
        } else {
            stressStatChartVM = stressStatChartVM2;
        }
        stressStatChartVM.G().observe(this, new a(new Function1<List<? extends PhysicalMentalStat>, Unit>() { // from class: com.heytap.health.hrv.ui.detail.StressDetailDataFragment$initViewPage$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends PhysicalMentalStat> list) {
                invoke2((List<PhysicalMentalStat>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<PhysicalMentalStat> stats) {
                List<PhysicalMentalStat> list = stats;
                if (list == null || list.isEmpty()) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(stats, "stats");
                ArrayList arrayList = new ArrayList();
                for (Object obj : stats) {
                    if (((PhysicalMentalStat) obj).getAvgStress() > 0) {
                        arrayList.add(obj);
                    }
                }
                PhysicalMentalStat physicalMentalStat = (PhysicalMentalStat) CollectionsKt___CollectionsKt.lastOrNull((List) arrayList);
                if (physicalMentalStat != null && this.this$0.isFirstLoad) {
                    StressDetailDataFragment stressDetailDataFragment = this.this$0;
                    stressDetailDataFragment.mLocalDate = stressDetailDataFragment.t0() > 0 ? h15.D(this.this$0.t0()) : h15.D(o15.a(physicalMentalStat.getDate()));
                    this.this$0.isFirstLoad = false;
                }
                MutableState mutableState = this.this$0.mDateTitle;
                String strT = q15.t(this.this$0.mLocalDate);
                Intrinsics.checkNotNullExpressionValue(strT, "toDateWithWeek(mLocalDate)");
                mutableState.setValue(strT);
                this.this$0.mDateStepPair.setValue(new Pair(Boolean.TRUE, Boolean.valueOf(true ^ Intrinsics.areEqual(this.this$0.mLocalDate, LocalDate.now()))));
                ViewPager viewPager2 = this.this$0.mViewPager;
                ViewPager viewPager3 = null;
                if (viewPager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                    viewPager2 = null;
                }
                PagerAdapter adapter = viewPager2.getAdapter();
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.heytap.health.hrv.ui.detail.StressDetailDataFragment.ChartPagerAdapter");
                ((StressDetailDataFragment.ChartPagerAdapter) adapter).notifyDataSetChanged();
                int iBetween = (int) ChronoUnit.DAYS.between(gf8.INSTANCE.f(o15.a(stats.get(0).getDate())), this.this$0.mLocalDate);
                String unused = this.this$0.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("initViewPage dayDiff = ");
                sb.append(iBetween);
                ViewPager viewPager4 = this.this$0.mViewPager;
                if (viewPager4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                    viewPager4 = null;
                }
                final StressDetailDataFragment stressDetailDataFragment2 = this.this$0;
                viewPager4.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.heytap.health.hrv.ui.detail.StressDetailDataFragment$initViewPage$2.1
                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public void onPageScrollStateChanged(int state) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public void onPageSelected(int position) {
                        String unused2 = stressDetailDataFragment2.TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onPageSelected position = ");
                        sb2.append(position);
                        int i = position + 1;
                        ViewPager viewPager5 = stressDetailDataFragment2.mViewPager;
                        StressDataAnalyzeVM stressDataAnalyzeVM = null;
                        if (viewPager5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                            viewPager5 = null;
                        }
                        PagerAdapter adapter2 = viewPager5.getAdapter();
                        Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type com.heytap.health.hrv.ui.detail.StressDetailDataFragment.ChartPagerAdapter");
                        int count = i - ((StressDetailDataFragment.ChartPagerAdapter) adapter2).getCount();
                        StressDetailDataFragment stressDetailDataFragment3 = stressDetailDataFragment2;
                        LocalDate localDatePlusDays = gf8.INSTANCE.a().plusDays(count);
                        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "HDateUtil.getCurrentDate…plusDays(offset.toLong())");
                        stressDetailDataFragment3.mLocalDate = localDatePlusDays;
                        LocalDate localDate = stressDetailDataFragment2.mLocalDate;
                        StressDataAnalyzeVM stressDataAnalyzeVM2 = stressDetailDataFragment2.mViewModel;
                        if (stressDataAnalyzeVM2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        } else {
                            stressDataAnalyzeVM = stressDataAnalyzeVM2;
                        }
                        long jH = h15.H(localDate);
                        LocalDate localDatePlusDays2 = localDate.plusDays(1L);
                        Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "date.plusDays(1)");
                        stressDataAnalyzeVM.I(jH, h15.H(localDatePlusDays2) - 1);
                        MutableState mutableState2 = stressDetailDataFragment2.mDateTitle;
                        String strT2 = q15.t(localDate);
                        Intrinsics.checkNotNullExpressionValue(strT2, "toDateWithWeek(date)");
                        mutableState2.setValue(strT2);
                        stressDetailDataFragment2.mDateStepPair.setValue(new Pair(Boolean.valueOf(position != 0), Boolean.valueOf(count != 0)));
                        stressDetailDataFragment2.r0();
                    }
                });
                ViewPager viewPager5 = this.this$0.mViewPager;
                if (viewPager5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                } else {
                    viewPager3 = viewPager5;
                }
                viewPager3.setCurrentItem(iBetween, false);
            }
        }));
    }

    public final void w0() {
        long jA;
        final COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = new COUIBottomSheetDialogFragment();
        final LocalDate localDate = this.mLocalDate;
        StressStatChartVM stressStatChartVM = this.mStatViewModel;
        if (stressStatChartVM == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatViewModel");
            stressStatChartVM = null;
        }
        List<PhysicalMentalStat> value = stressStatChartVM.G().getValue();
        List<PhysicalMentalStat> list = value;
        if (list == null || list.isEmpty()) {
            gf8.Companion aVar = gf8.INSTANCE;
            jA = aVar.j(aVar.d());
        } else {
            jA = o15.a(value.get(0).getDate());
        }
        cOUIBottomSheetDialogFragment.setMainPanelFragment(new CalendarPanelFragment(localDate, Long.valueOf(jA), new Function1<LocalDate, Unit>() { // from class: com.heytap.health.hrv.ui.detail.StressDetailDataFragment$showCalendar$calendarFragment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate2) {
                invoke2(localDate2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LocalDate selectDate) {
                Intrinsics.checkNotNullParameter(selectDate, "selectDate");
                long jBetween = ChronoUnit.DAYS.between(localDate, selectDate);
                ViewPager viewPager = this.mViewPager;
                ViewPager viewPager2 = null;
                if (viewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                    viewPager = null;
                }
                ViewPager viewPager3 = this.mViewPager;
                if (viewPager3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                } else {
                    viewPager2 = viewPager3;
                }
                viewPager.setCurrentItem(viewPager2.getCurrentItem() + ((int) jBetween), false);
                cOUIBottomSheetDialogFragment.dismiss();
            }
        }));
        cOUIBottomSheetDialogFragment.show(getChildFragmentManager(), getTag());
    }
}