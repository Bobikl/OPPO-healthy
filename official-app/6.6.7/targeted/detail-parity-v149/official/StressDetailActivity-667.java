package com.heytap.health.hrv.ui.detail;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.health.base.R$color;
import com.heytap.health.base.R$id;
import com.heytap.health.base.track.a;
import com.heytap.health.base.ui.widget.HealthSegmentButtonLayout;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.healthbase.HealthJumpActivity;
import com.heytap.health.healthbase.view.MultiTouchViewPage;
import com.heytap.health.hrv.R$array;
import com.heytap.health.hrv.R$layout;
import com.heytap.health.hrv.R$menu;
import com.heytap.health.hrv.R$string;
import com.heytap.health.hrv.ui.detail.StressDetailActivity;
import com.heytap.health.hrv.viewmodel.StressStatChartVM;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.puk;
import com.oplus.aiunit.vision.vgf;
import com.oplus.aiunit.vision.xmk;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/hrv/StressDetailActivity")
@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t*\u00010\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0002<=B\u0007¢\u0006\u0004\b9\u0010:J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0014J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u001c\u0010\u0018\u001a\u00020\u00042\n\u0010\u0015\u001a\u00060\u0014R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010\u001c\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\u0004\u0018\u00010\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006>"}, d2 = {"Lcom/heytap/health/hrv/ui/detail/StressDetailActivity;", "Lcom/heytap/health/healthbase/HealthJumpActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "a4", LinkInfo.CALL_TYPE_H5, "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onStart", "onStop", "I7", "initView", "H7", "Lcom/heytap/health/hrv/ui/detail/StressDetailActivity$HrvDetailPagerAdapter;", "adapter", "", "position", "D7", "Landroidx/fragment/app/Fragment;", "fragment", "C7", "B7", "", "Ljava/lang/Class;", LogFieldKey.PROCESS_NAME_KEY, "Ljava/util/List;", "fragmentList", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "q", "Lkotlin/Lazy;", "R6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "r", "I", "defaultPosition", "Lcom/heytap/health/hrv/viewmodel/StressStatChartVM;", "s", "E7", "()Lcom/heytap/health/hrv/viewmodel/StressStatChartVM;", "statViewModel", "com/heytap/health/hrv/ui/detail/StressDetailActivity$mBroadcastReceiver$1", "t", "Lcom/heytap/health/hrv/ui/detail/StressDetailActivity$mBroadcastReceiver$1;", "mBroadcastReceiver", "", "", "F7", "()[Ljava/lang/String;", "tabTitles", "<init>", "()V", "Companion", "a", "HrvDetailPagerAdapter", "hrv_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStressDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDetailActivity.kt\ncom/heytap/health/hrv/ui/detail/StressDetailActivity\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,264:1\n28#2:265\n*S KotlinDebug\n*F\n+ 1 StressDetailActivity.kt\ncom/heytap/health/hrv/ui/detail/StressDetailActivity\n*L\n92#1:265\n*E\n"})
public final class StressDetailActivity extends HealthJumpActivity {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int defaultPosition;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final List<Class<? extends Fragment>> fragmentList = CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{StressDetailDataFragment.class, StressStatBaseFragment.class, StressStatBaseFragment.class, StressStatBaseFragment.class});

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyGetFamilyConfig = LazyKt__LazyJVMKt.lazy(new Function0<FamilyMoreDataDetailConfigBean>() { // from class: com.heytap.health.hrv.ui.detail.StressDetailActivity$lazyGetFamilyConfig$2
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

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Lazy statViewModel = LazyKt__LazyJVMKt.lazy(new Function0<StressStatChartVM>() { // from class: com.heytap.health.hrv.ui.detail.StressDetailActivity$statViewModel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final StressStatChartVM invoke() {
            return (StressStatChartVM) new ViewModelProvider(this.this$0).get(StressStatChartVM.class);
        }
    });

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final StressDetailActivity$mBroadcastReceiver$1 mBroadcastReceiver = new BroadcastReceiver() { // from class: com.heytap.health.hrv.ui.detail.StressDetailActivity$mBroadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "com.heytap.health.action_data_refresh") && intent.getIntExtra("refresh_type", -1) == 23) {
                this.a.E7().E();
            }
        }
    };

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0002R\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/hrv/ui/detail/StressDetailActivity$HrvDetailPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "", "getPageTitle", CityBean.POS, "a", "Landroidx/fragment/app/FragmentManager;", "Lkotlin/Lazy;", "b", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "fm", "<init>", "(Lcom/heytap/health/hrv/ui/detail/StressDetailActivity;Landroidx/fragment/app/FragmentManager;)V", "hrv_release"}, k = 1, mv = {1, 8, 0})
    public final class HrvDetailPagerAdapter extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Lazy fragmentManager;
        public final /* synthetic */ StressDetailActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HrvDetailPagerAdapter(@NotNull final StressDetailActivity stressDetailActivity, FragmentManager fm) {
            super(fm, 1);
            Intrinsics.checkNotNullParameter(fm, "fm");
            this.b = stressDetailActivity;
            this.fragmentManager = LazyKt__LazyJVMKt.lazy(new Function0<FragmentManager>() { // from class: com.heytap.health.hrv.ui.detail.StressDetailActivity$HrvDetailPagerAdapter$fragmentManager$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final FragmentManager invoke() {
                    FragmentManager supportFragmentManager = stressDetailActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                    return supportFragmentManager;
                }
            });
        }

        @Nullable
        public final Fragment a(int pos) {
            List<Fragment> fragments = b().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "fragmentManager.fragments");
            if (!fragments.isEmpty() && pos < this.b.F7().length && pos >= 0) {
                return (Fragment) CollectionsKt___CollectionsKt.getOrNull(fragments, pos);
            }
            return null;
        }

        public final FragmentManager b() {
            return (FragmentManager) this.fragmentManager.getValue();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.b.F7().length;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NotNull
        public Fragment getItem(int position) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("HrvDetailPagerAdapter getItem ");
            sb.append(position);
            List list = this.b.fragmentList;
            if (position < 0 || position > CollectionsKt__CollectionsKt.getLastIndex(list)) {
                obj = StressDetailDataFragment.class;
                if (position != 0 && (position == 1 || position == 2 || position == 3)) {
                    obj = StressStatBaseFragment.class;
                }
            } else {
                obj = list.get(position);
            }
            Object objNewInstance = ((Class) obj).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            StressDetailActivity stressDetailActivity = this.b;
            Fragment fragment = (Fragment) objNewInstance;
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARGUMENT_MORE_DATA_DETAIL", stressDetailActivity.p7());
            bundle.putInt("FRAG_POSITION", position);
            stressDetailActivity.t7(bundle, position);
            fragment.setArguments(bundle);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "fragmentList.getOrElse(p…ts = bundle\n            }");
            return fragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public CharSequence getPageTitle(int position) {
            return (CharSequence) ArraysKt___ArraysKt.getOrNull(this.b.F7(), position);
        }
    }

    public static final void G7(StressDetailActivity this$0, HrvDetailPagerAdapter adapter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        this$0.D7(adapter, this$0.defaultPosition);
    }

    public final void B7(Fragment fragment) {
        if (fragment instanceof StressStatBaseFragment) {
            ((StressStatBaseFragment) fragment).e0();
        } else if (fragment instanceof StressDetailDataFragment) {
            ((StressDetailDataFragment) fragment).q0();
        }
    }

    public final void C7(Fragment fragment) {
        if (fragment instanceof StressStatBaseFragment) {
            ((StressStatBaseFragment) fragment).f0();
        } else if (fragment instanceof StressDetailDataFragment) {
            ((StressDetailDataFragment) fragment).r0();
        }
    }

    public final void D7(HrvDetailPagerAdapter adapter, int position) {
        Fragment fragmentA = adapter.a(position);
        Fragment fragmentA2 = adapter.a(position - 1);
        Fragment fragmentA3 = adapter.a(position + 1);
        C7(fragmentA);
        B7(fragmentA2);
        B7(fragmentA3);
    }

    public final StressStatChartVM E7() {
        return (StressStatChartVM) this.statViewModel.getValue();
    }

    public final String[] F7() {
        String[] stringArray = getResources().getStringArray(R$array.health_hrv_data_tab_list);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray…health_hrv_data_tab_list)");
        return stringArray;
    }

    @Override // com.heytap.health.base.base.BaseViewSizeControl
    public boolean H5() {
        return false;
    }

    public final void H7() {
        E7().I(o7());
        E7().E();
        puk.INSTANCE.c();
    }

    public final void I7() {
        try {
            String stringExtra = getIntent().getStringExtra("tab");
            StringBuilder sb = new StringBuilder();
            sb.append("parseIntent tab = ");
            sb.append(stringExtra);
            if (stringExtra != null) {
                this.defaultPosition = Integer.parseInt(stringExtra);
            }
        } catch (Exception e2) {
            m8b.b("StressDetailActivity", "parseIntent exception: " + e2);
        }
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

    @Override // com.heytap.health.healthbase.HealthJumpActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initView() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        cOUIToolbar.setTitle(R$string.health_hrv_title);
        cOUIToolbar.setBackgroundColor(getColor(R$color.lib_base_card_white_bg_2));
        S1(this, cOUIToolbar, true);
        ((HealthSegmentButtonLayout) findViewById(com.heytap.health.hrv.R$id.segment_hrv_history)).setSegmentButtons(F7());
        MultiTouchViewPage multiTouchViewPage = (MultiTouchViewPage) findViewById(com.heytap.health.hrv.R$id.viewpager_hrv_detail);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        final HrvDetailPagerAdapter hrvDetailPagerAdapter = new HrvDetailPagerAdapter(this, supportFragmentManager);
        multiTouchViewPage.setOffscreenPageLimit(3);
        multiTouchViewPage.setAdapter(hrvDetailPagerAdapter);
        multiTouchViewPage.setCurrentItem(this.defaultPosition, false);
        multiTouchViewPage.post(new Runnable() { // from class: com.oplus.aiunit.vision.n1j
            @Override // java.lang.Runnable
            public final void run() {
                StressDetailActivity.G7(this.i, hrvDetailPagerAdapter);
            }
        });
        multiTouchViewPage.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.heytap.health.hrv.ui.detail.StressDetailActivity.initView.2
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                a.k().a(xmk.TAG_MODULE_ID, 2).a(xmk.TAG_POSTION1, Integer.valueOf(position + 1)).b();
                StressDetailActivity.this.D7(hrvDetailPagerAdapter, position);
            }
        });
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.health_hrv_detail_activity);
        getWindow().getDecorView().setBackground(new ColorDrawable(getColor(R$color.lib_base_card_white_bg_2)));
        I7();
        initView();
        H7();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R$menu.health_hrv_menu_description, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == com.heytap.health.hrv.R$id.description) {
            a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 1).b();
            startActivity(new Intent(this, (Class<?>) StressDetailDescriptionActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        vgf.a(this, this.mBroadcastReceiver, new IntentFilter("com.heytap.health.action_data_refresh"), 4);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        vgf.c(this, this.mBroadcastReceiver);
    }
}