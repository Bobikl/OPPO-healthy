package com.heytap.health.heartrate.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.health.base.R$color;
import com.heytap.health.base.R$id;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.base.track.a;
import com.heytap.health.base.ui.widget.HealthSegmentButtonLayout;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.health_base.R$array;
import com.heytap.health.healthbase.HealthJumpActivity;
import com.heytap.health.healthbase.util.HealthFrgType;
import com.heytap.health.heartrate.R$layout;
import com.heytap.health.heartrate.R$menu;
import com.heytap.health.heartrate.R$string;
import com.heytap.health.heartrate.ui.HeartRateHistoryActivity;
import com.heytap.health.heartrate.viewmodel.HeartRateActivityViewModel;
import com.heytap.health.heartrate.viewmodel.HeartRateChartStyleViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.g21;
import com.oplus.aiunit.vision.gg8;
import com.oplus.aiunit.vision.kjk;
import com.oplus.aiunit.vision.kn2;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.u7k;
import com.oplus.aiunit.vision.xmk;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/heartrate/HeartRateHistoryActivity")
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00029:B\u0007¢\u0006\u0004\b6\u00107J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0014J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\u001c\u0010\u001d\u001a\u00020\u00062\n\u0010\u001a\u001a\u00060\u0019R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0002J\b\u0010\u001f\u001a\u00020\u0006H\u0002J\b\u0010 \u001a\u00020\u0006H\u0002R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00105\u001a\u0004\u0018\u0001008VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u0006;"}, d2 = {"Lcom/heytap/health/heartrate/ui/HeartRateHistoryActivity;", "Lcom/heytap/health/healthbase/HealthJumpActivity;", "Lcom/oplus/aiunit/vision/u7k;", "Lcom/oplus/aiunit/vision/g21;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", LinkInfo.CALL_TYPE_H5, "a4", "onResume", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "onPrepareOptionsMenu", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "finish", "C7", "initView", "Lcom/heytap/health/heartrate/ui/HeartRateHistoryActivity$HeartRatePagerAdapter;", "adapter", "", "position", "z7", "D7", "E7", "A7", "Lcom/coui/appcompat/toolbar/COUIToolbar;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/coui/appcompat/toolbar/COUIToolbar;", "mCOUIToolbar", "Landroidx/viewpager2/widget/ViewPager2;", "q", "Landroidx/viewpager2/widget/ViewPager2;", "mViewPager2", "Lcom/heytap/health/heartrate/viewmodel/HeartRateChartStyleViewModel;", "r", "Lcom/heytap/health/heartrate/viewmodel/HeartRateChartStyleViewModel;", "mChartStyleViewModel", "s", "I", "defaultPosition", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "t", "Lkotlin/Lazy;", "R6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "<init>", "()V", "Companion", "a", "HeartRatePagerAdapter", "heartrate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHeartRateHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateHistoryActivity.kt\ncom/heytap/health/heartrate/ui/HeartRateHistoryActivity\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,346:1\n28#2:347\n*S KotlinDebug\n*F\n+ 1 HeartRateHistoryActivity.kt\ncom/heytap/health/heartrate/ui/HeartRateHistoryActivity\n*L\n97#1:347\n*E\n"})
public final class HeartRateHistoryActivity extends HealthJumpActivity implements u7k, g21 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public COUIToolbar mCOUIToolbar;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public ViewPager2 mViewPager2;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public HeartRateChartStyleViewModel mChartStyleViewModel;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int defaultPosition;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyGetFamilyConfig = LazyKt__LazyJVMKt.lazy(new Function0<FamilyMoreDataDetailConfigBean>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryActivity$lazyGetFamilyConfig$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        public final FamilyMoreDataDetailConfigBean invoke() {
            Intent intent = this.this$0.getIntent();
            return (FamilyMoreDataDetailConfigBean) (intent != null ? intent.getSerializableExtra("ARGUMENT_MORE_DATA_DETAIL") : null);
        }
    });

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/heartrate/ui/HeartRateHistoryActivity$HeartRatePagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "createFragment", "getItemCount", CityBean.POS, "d", "Lcom/heytap/health/base/base/BaseFragment;", "frg", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "healthFrgType", "f", "", "", "i", "[Ljava/lang/String;", "tabList", "Landroidx/fragment/app/FragmentManager;", "j", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "<init>", "(Lcom/heytap/health/heartrate/ui/HeartRateHistoryActivity;Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public final class HeartRatePagerAdapter extends FragmentStateAdapter {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final String[] tabList;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Lazy fragmentManager;
        public final /* synthetic */ HeartRateHistoryActivity k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeartRatePagerAdapter(@NotNull HeartRateHistoryActivity heartRateHistoryActivity, @NotNull final FragmentActivity fragmentActivity, String[] tabList) {
            super(fragmentActivity);
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            Intrinsics.checkNotNullParameter(tabList, "tabList");
            this.k = heartRateHistoryActivity;
            this.tabList = tabList;
            this.fragmentManager = LazyKt__LazyJVMKt.lazy(new Function0<FragmentManager>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryActivity$HeartRatePagerAdapter$fragmentManager$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final FragmentManager invoke() {
                    FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "fragmentActivity.supportFragmentManager");
                    return supportFragmentManager;
                }
            });
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public Fragment createFragment(int position) {
            StringBuilder sb = new StringBuilder();
            sb.append("createFragment position is ");
            sb.append(position);
            if (position == 0) {
                return f(new HeartRateHistoryDayFragment(), HealthFrgType.DAY);
            }
            if (position != 1) {
                return position != 2 ? f(new HeartRateHistoryYearFragment(), HealthFrgType.YEAR) : f(new HeartRateHistoryMonthFragment(), HealthFrgType.MONTH);
            }
            return f(new HeartRateHistoryWeekFragment(), HealthFrgType.WEEK);
        }

        @Nullable
        public final Fragment d(int pos) {
            List<Fragment> fragments = e().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "fragmentManager.fragments");
            if (!fragments.isEmpty() && pos < this.tabList.length && pos >= 0) {
                return fragments.get(pos);
            }
            return null;
        }

        public final FragmentManager e() {
            return (FragmentManager) this.fragmentManager.getValue();
        }

        public final BaseFragment f(BaseFragment frg, HealthFrgType healthFrgType) {
            Bundle arguments = frg.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putSerializable("ARGUMENT_MORE_DATA_DETAIL", this.k.p7());
            this.k.u7(arguments, healthFrgType);
            frg.setArguments(arguments);
            return frg;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.tabList.length;
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.heartrate.ui.HeartRateHistoryActivity$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/heytap/health/heartrate/ui/HeartRateHistoryActivity$a;", "", "Landroid/content/Context;", "context", "", "date", "", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull Context context, @NotNull String date) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(date, "date");
            Intent intent = new Intent(context, (Class<?>) HeartRateHistoryActivity.class);
            intent.putExtra("date", date);
            context.startActivity(intent);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public b(Function1 function) {
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

    @JvmStatic
    public static final void B7(@NotNull Context context, @NotNull String str) {
        INSTANCE.a(context, str);
    }

    public static final void F7(HeartRateHistoryActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isFinishing() || this$0.isDestroyed()) {
            return;
        }
        kn2 kn2Var = new kn2(this$0);
        kn2Var.T(this$0.getString(R$string.health_heart_rate_change_guide_tip));
        kn2Var.U(true);
        View childAt = this$0.mCOUIToolbar;
        if (childAt == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCOUIToolbar");
            childAt = null;
        }
        COUIToolbar cOUIToolbar = this$0.mCOUIToolbar;
        if (cOUIToolbar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCOUIToolbar");
            cOUIToolbar = null;
        }
        int childCount = cOUIToolbar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            COUIToolbar cOUIToolbar2 = this$0.mCOUIToolbar;
            if (cOUIToolbar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCOUIToolbar");
                cOUIToolbar2 = null;
            }
            if (cOUIToolbar2.getChildAt(i) instanceof ActionMenuView) {
                COUIToolbar cOUIToolbar3 = this$0.mCOUIToolbar;
                if (cOUIToolbar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCOUIToolbar");
                    cOUIToolbar3 = null;
                }
                childAt = cOUIToolbar3.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "mCOUIToolbar.getChildAt(i)");
            }
        }
        kn2Var.c0(childAt, 4, true, kjk.d(this$0, 10.0f), 0);
        fdg.x("health_common_sp_name").W("heart_rate_guide_bubble", true);
    }

    public final void A7() {
        v7(new Function0<Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryActivity$initViewModel$1
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
                ((HeartRateActivityViewModel) new ViewModelProvider(this.this$0).get(HeartRateActivityViewModel.class)).y(this.this$0);
            }
        });
        HeartRateChartStyleViewModel heartRateChartStyleViewModel = (HeartRateChartStyleViewModel) new ViewModelProvider(this).get(HeartRateChartStyleViewModel.class);
        heartRateChartStyleViewModel.x().observe(this, new b(new Function1<Boolean, Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryActivity$initViewModel$2$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                this.this$0.invalidateOptionsMenu();
            }
        }));
        this.mChartStyleViewModel = heartRateChartStyleViewModel;
    }

    public final void C7() {
        try {
            String stringExtra = getIntent().getStringExtra("tab");
            if (stringExtra != null) {
                this.defaultPosition = Integer.parseInt(stringExtra);
            }
        } catch (Exception e2) {
            gg8.b("HRHistoryAct", e2.toString());
        }
    }

    public final void D7() {
        String strE = GsonUtil.e(getResources().getDisplayMetrics());
        m8b.f("HRHistoryAct", "density str:" + strE);
        fdg.x("health_common_sp_name").U("display_vertical_screen", strE);
    }

    public final void E7() {
        if (fdg.x("health_common_sp_name").r("heart_rate_guide_bubble", false)) {
            return;
        }
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.y59
            @Override // java.lang.Runnable
            public final void run() {
                HeartRateHistoryActivity.F7(this.i);
            }
        }, 1000L);
    }

    @Override // com.heytap.health.base.base.BaseViewSizeControl
    public boolean H5() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.ir9
    @Nullable
    public FamilyMoreDataDetailConfigBean R6() {
        return (FamilyMoreDataDetailConfigBean) this.lazyGetFamilyConfig.getValue();
    }

    @Override // com.oplus.aiunit.vision.rz0
    public boolean a4() {
        return true;
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        try {
            return super.dispatchTouchEvent(ev);
        } catch (Exception e2) {
            gg8.b("HRHistoryAct", "dispatchTouchEvent:" + e2);
            return false;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        x4(this);
        super.finish();
    }

    @Override // com.heytap.health.healthbase.HealthJumpActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initView() {
        View viewFindViewById = findViewById(R$id.lib_base_toolbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(com.heytap.…se.R.id.lib_base_toolbar)");
        COUIToolbar cOUIToolbar = (COUIToolbar) viewFindViewById;
        this.mCOUIToolbar = cOUIToolbar;
        ViewPager2 viewPager2 = null;
        if (cOUIToolbar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCOUIToolbar");
            cOUIToolbar = null;
        }
        cOUIToolbar.setTitle(getString(R$string.health_heart_rate));
        COUIToolbar cOUIToolbar2 = this.mCOUIToolbar;
        if (cOUIToolbar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCOUIToolbar");
            cOUIToolbar2 = null;
        }
        cOUIToolbar2.setBackgroundColor(getColor(R$color.lib_base_card_white_bg_3));
        COUIToolbar cOUIToolbar3 = this.mCOUIToolbar;
        if (cOUIToolbar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCOUIToolbar");
            cOUIToolbar3 = null;
        }
        S1(this, cOUIToolbar3, true);
        String[] stringArray = getResources().getStringArray(R$array.health_base_tab_list);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray…ray.health_base_tab_list)");
        ((HealthSegmentButtonLayout) findViewById(com.heytap.health.heartrate.R$id.segment_heart_rate_history)).setSegmentButtons(stringArray);
        View viewFindViewById2 = findViewById(com.heytap.health.heartrate.R$id.viewpager_heart_rate_history);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.viewpager_heart_rate_history)");
        this.mViewPager2 = (ViewPager2) viewFindViewById2;
        final HeartRatePagerAdapter heartRatePagerAdapter = new HeartRatePagerAdapter(this, this, stringArray);
        ViewPager2 viewPager3 = this.mViewPager2;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager2");
            viewPager3 = null;
        }
        viewPager3.setOffscreenPageLimit(3);
        ViewPager2 viewPager4 = this.mViewPager2;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager2");
            viewPager4 = null;
        }
        viewPager4.setAdapter(heartRatePagerAdapter);
        ViewPager2 viewPager5 = this.mViewPager2;
        if (viewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager2");
            viewPager5 = null;
        }
        viewPager5.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryActivity.initView.1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(final int position) {
                super.onPageSelected(position);
                StringBuilder sb = new StringBuilder();
                sb.append("onPageSelected position is ");
                sb.append(position);
                HeartRateHistoryActivity.this.z7(heartRatePagerAdapter, position);
                HeartRateHistoryActivity.this.invalidateOptionsMenu();
                HeartRateHistoryActivity.this.v7(new Function0<Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryActivity$initView$1$onPageSelected$1
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
                        a.k().a(xmk.TAG_MODULE_ID, 2).a(xmk.TAG_POSTION1, Integer.valueOf(position + 1)).b();
                        a.x().a(xmk.TAG_MODULE_ID, 2).a(xmk.TAG_POSTION1, Integer.valueOf(position + 1)).b();
                    }
                });
            }
        });
        ViewPager2 viewPager6 = this.mViewPager2;
        if (viewPager6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager2");
        } else {
            viewPager2 = viewPager6;
        }
        viewPager2.setCurrentItem(this.defaultPosition);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.health_heart_rate_activity_history);
        View decorView = getWindow().getDecorView();
        int i = R$color.lib_base_common_background_color;
        decorView.setBackground(new ColorDrawable(getColor(i)));
        getWindow().getDecorView().setForceDarkAllowed(false);
        k6(this, getColor(R$color.lib_base_card_white_bg_3));
        getWindow().setNavigationBarColor(getColor(i));
        C7();
        initView();
        A7();
        D7();
        v7(new Function0<Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryActivity.onCreate.1
            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.x().a(xmk.TAG_MODULE_ID, -1).b();
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R$menu.health_heart_rate_history_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == com.heytap.health.heartrate.R$id.about) {
            startActivity(new Intent(this, (Class<?>) HeartRateDescriptionActivity.class));
            v7(new Function0<Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryActivity.onOptionsItemSelected.1
                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 2).b();
                }
            });
            return true;
        }
        if (item.getItemId() != com.heytap.health.heartrate.R$id.style) {
            return super.onOptionsItemSelected(item);
        }
        v7(new Function0<Unit>() { // from class: com.heytap.health.heartrate.ui.HeartRateHistoryActivity.onOptionsItemSelected.2
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
                HeartRateChartStyleViewModel heartRateChartStyleViewModel = HeartRateHistoryActivity.this.mChartStyleViewModel;
                boolean z = false;
                if (heartRateChartStyleViewModel != null && heartRateChartStyleViewModel.w()) {
                    z = true;
                }
                if (z) {
                    a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 1).a(xmk.TAG_POSTION2, 1).b();
                } else {
                    a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 1).a(xmk.TAG_POSTION2, 2).b();
                }
            }
        });
        HeartRateChartStyleViewModel heartRateChartStyleViewModel = this.mChartStyleViewModel;
        if (heartRateChartStyleViewModel != null) {
            heartRateChartStyleViewModel.v();
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(@Nullable Menu menu) {
        MenuItem menuItemFindItem;
        if (menu != null && (menuItemFindItem = menu.findItem(com.heytap.health.heartrate.R$id.style)) != null) {
            HeartRateChartStyleViewModel heartRateChartStyleViewModel = this.mChartStyleViewModel;
            menuItemFindItem.setTitle(heartRateChartStyleViewModel != null && heartRateChartStyleViewModel.w() ? getString(R$string.health_heart_rate_change_candle_chart) : getString(R$string.health_heart_rate_change_line_chart));
            ViewPager2 viewPager2 = this.mViewPager2;
            if (viewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager2");
                viewPager2 = null;
            }
            menuItemFindItem.setVisible(viewPager2.getCurrentItem() == 0);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        E7();
    }

    public final void z7(HeartRatePagerAdapter adapter, int position) {
        Fragment fragmentD = adapter.d(position);
        Fragment fragmentD2 = adapter.d(position - 1);
        Fragment fragmentD3 = adapter.d(position + 1);
        if (fragmentD instanceof HeartRateHistoryBaseFragment) {
            ((HeartRateHistoryBaseFragment) fragmentD).m1();
        }
        if (fragmentD2 instanceof HeartRateHistoryBaseFragment) {
            ((HeartRateHistoryBaseFragment) fragmentD2).g1();
        }
        if (fragmentD3 instanceof HeartRateHistoryBaseFragment) {
            ((HeartRateHistoryBaseFragment) fragmentD3).g1();
        }
    }
}