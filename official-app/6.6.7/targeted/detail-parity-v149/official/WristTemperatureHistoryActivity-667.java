package com.heytap.health.wrist_temperature.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$color;
import com.heytap.health.base.R$id;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.ui.widget.HealthSegmentButtonLayout;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.healthbase.HealthJumpActivity;
import com.heytap.health.healthbase.util.HealthFrgType;
import com.heytap.health.healthbase.view.MultiTouchViewPage;
import com.heytap.health.wrist_temperature.R$array;
import com.heytap.health.wrist_temperature.R$layout;
import com.heytap.health.wrist_temperature.R$menu;
import com.heytap.health.wrist_temperature.R$string;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.u7k;
import com.oplus.aiunit.vision.xmk;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/wrist_temperature/WristTemperatureHistoryActivity")
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u000201B\u0007¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\u0004\u0018\u00010\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00062"}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryActivity;", "Lcom/heytap/health/healthbase/HealthJumpActivity;", "Lcom/oplus/aiunit/vision/u7k;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", LinkInfo.CALL_TYPE_H5, "a4", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "A7", "initView", "z7", "Lcom/coui/appcompat/toolbar/COUIToolbar;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/coui/appcompat/toolbar/COUIToolbar;", "mCOUIToolbar", "Lcom/heytap/health/healthbase/view/MultiTouchViewPage;", "q", "Lcom/heytap/health/healthbase/view/MultiTouchViewPage;", "mViewPager", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "r", "Lkotlin/Lazy;", "R6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryWeekFragment;", "s", "Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryWeekFragment;", "wristTemperatureHistoryWeekFragment", "Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryMonthFragment;", "t", "Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryMonthFragment;", "wristTemperatureHistoryMonthFragment", "Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryYearFragment;", "u", "Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryYearFragment;", "wristTemperatureHistoryYearFragment", "<init>", "()V", "Companion", "a", "b", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
public final class WristTemperatureHistoryActivity extends HealthJumpActivity implements u7k {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public COUIToolbar mCOUIToolbar;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public MultiTouchViewPage mViewPager;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyGetFamilyConfig = LazyKt__LazyJVMKt.lazy(new Function0<FamilyMoreDataDetailConfigBean>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryActivity$lazyGetFamilyConfig$2
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
    public WristTemperatureHistoryWeekFragment wristTemperatureHistoryWeekFragment = new WristTemperatureHistoryWeekFragment();

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public WristTemperatureHistoryMonthFragment wristTemperatureHistoryMonthFragment = new WristTemperatureHistoryMonthFragment();

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public WristTemperatureHistoryYearFragment wristTemperatureHistoryYearFragment = new WristTemperatureHistoryYearFragment();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryActivity$b;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "getItem", "getCount", "Lcom/heytap/health/base/base/BaseFragment;", "frg", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "healthFrgType", "a", "", "", "[Ljava/lang/String;", "tabList", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Lcom/heytap/health/wrist_temperature/ui/WristTemperatureHistoryActivity;Landroidx/fragment/app/FragmentManager;[Ljava/lang/String;)V", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public final class b extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String[] tabList;
        public final /* synthetic */ WristTemperatureHistoryActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull WristTemperatureHistoryActivity wristTemperatureHistoryActivity, @NotNull FragmentManager fragmentManager, String[] tabList) {
            super(fragmentManager);
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(tabList, "tabList");
            this.b = wristTemperatureHistoryActivity;
            this.tabList = tabList;
        }

        public final BaseFragment a(BaseFragment frg, HealthFrgType healthFrgType) {
            Bundle arguments = frg.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putSerializable("ARGUMENT_MORE_DATA_DETAIL", this.b.p7());
            this.b.u7(arguments, healthFrgType);
            frg.setArguments(arguments);
            return frg;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.tabList.length;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NotNull
        public Fragment getItem(int position) {
            if (position != 0) {
                return position != 1 ? a(this.b.wristTemperatureHistoryYearFragment, HealthFrgType.YEAR) : a(this.b.wristTemperatureHistoryMonthFragment, HealthFrgType.MONTH);
            }
            return a(this.b.wristTemperatureHistoryWeekFragment, HealthFrgType.WEEK);
        }
    }

    public final void A7() {
        FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBeanP7 = p7();
        if (familyMoreDataDetailConfigBeanP7 != null) {
            m8b.f("WTActivity", "is folk ssoid is " + familyMoreDataDetailConfigBeanP7.getSsoid());
        }
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

    @Override // com.heytap.health.healthbase.HealthJumpActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initView() {
        View viewFindViewById = findViewById(R$id.lib_base_toolbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(com.heytap.…se.R.id.lib_base_toolbar)");
        COUIToolbar cOUIToolbar = (COUIToolbar) viewFindViewById;
        this.mCOUIToolbar = cOUIToolbar;
        MultiTouchViewPage multiTouchViewPage = null;
        if (cOUIToolbar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCOUIToolbar");
            cOUIToolbar = null;
        }
        cOUIToolbar.setTitle(getString(R$string.health_wrist_temperature));
        COUIToolbar cOUIToolbar2 = this.mCOUIToolbar;
        if (cOUIToolbar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCOUIToolbar");
            cOUIToolbar2 = null;
        }
        cOUIToolbar2.setBackgroundColor(getColor(R$color.lib_base_card_white_bg));
        COUIToolbar cOUIToolbar3 = this.mCOUIToolbar;
        if (cOUIToolbar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCOUIToolbar");
            cOUIToolbar3 = null;
        }
        S1(this, cOUIToolbar3, true);
        String[] stringArray = getResources().getStringArray(R$array.health_wrist_tab_list);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray…ay.health_wrist_tab_list)");
        ((HealthSegmentButtonLayout) findViewById(com.heytap.health.wrist_temperature.R$id.segment_wrist_temperature_history)).setSegmentButtons(stringArray);
        View viewFindViewById2 = findViewById(com.heytap.health.wrist_temperature.R$id.vp_health_wrist_temperature_history);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.vp_hea…rist_temperature_history)");
        this.mViewPager = (MultiTouchViewPage) viewFindViewById2;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        b bVar = new b(this, supportFragmentManager, stringArray);
        MultiTouchViewPage multiTouchViewPage2 = this.mViewPager;
        if (multiTouchViewPage2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            multiTouchViewPage2 = null;
        }
        multiTouchViewPage2.setOffscreenPageLimit(3);
        MultiTouchViewPage multiTouchViewPage3 = this.mViewPager;
        if (multiTouchViewPage3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            multiTouchViewPage3 = null;
        }
        multiTouchViewPage3.setAdapter(bVar);
        MultiTouchViewPage multiTouchViewPage4 = this.mViewPager;
        if (multiTouchViewPage4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        } else {
            multiTouchViewPage = multiTouchViewPage4;
        }
        multiTouchViewPage.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryActivity.initView.1

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @Nullable
            public Fragment lastFragment;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(final int position) {
                Fragment fragment = WristTemperatureHistoryActivity.this.getSupportFragmentManager().getFragments().get(position);
                if (this.lastFragment == null) {
                    this.lastFragment = WristTemperatureHistoryActivity.this.getSupportFragmentManager().getFragments().get(0);
                }
                Fragment fragment2 = this.lastFragment;
                if (fragment2 != null) {
                    if (fragment2 instanceof WristTemperatureHistoryBaseFragment) {
                        Intrinsics.checkNotNull(fragment2, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment");
                        ((WristTemperatureHistoryBaseFragment) fragment2).W1();
                    } else if (fragment2 instanceof WristTemperatureHistoryDayFragment) {
                        Intrinsics.checkNotNull(fragment2, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryDayFragment");
                        ((WristTemperatureHistoryDayFragment) fragment2).e1();
                    }
                }
                this.lastFragment = fragment;
                if (fragment instanceof WristTemperatureHistoryBaseFragment) {
                    Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryBaseFragment");
                    ((WristTemperatureHistoryBaseFragment) fragment).n0();
                } else if (fragment instanceof WristTemperatureHistoryDayFragment) {
                    Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryDayFragment");
                    ((WristTemperatureHistoryDayFragment) fragment).G0();
                }
                WristTemperatureHistoryActivity.this.v7(new Function0<Unit>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryActivity$initView$1$onPageSelected$1
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
                        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 2).a(xmk.TAG_POSTION1, Integer.valueOf(position + 1)).b();
                        com.heytap.health.base.track.a.x().a(xmk.TAG_MODULE_ID, 2).a(xmk.TAG_POSTION1, Integer.valueOf(position + 1)).b();
                    }
                });
            }
        });
        z7();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.health_wrist_temperature_activity_history);
        getWindow().getDecorView().setBackgroundColor(getColor(R$color.lib_base_card_white_bg));
        A7();
        initView();
        v7(new Function0<Unit>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryActivity.onCreate.1
            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.heytap.health.base.track.a.x().a(xmk.TAG_MODULE_ID, -1).b();
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R$menu.health_wrist_temperature_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == com.heytap.health.wrist_temperature.R$id.wrist_desc) {
            startActivity(new Intent(this, (Class<?>) WristTemperatureDescriptionActivity.class));
            v7(new Function0<Unit>() { // from class: com.heytap.health.wrist_temperature.ui.WristTemperatureHistoryActivity.onOptionsItemSelected.1
                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 1).b();
                }
            });
        }
        return super.onOptionsItemSelected(item);
    }

    public final void z7() {
        try {
            String stringExtra = getIntent().getStringExtra("tab");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            MultiTouchViewPage multiTouchViewPage = this.mViewPager;
            if (multiTouchViewPage == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                multiTouchViewPage = null;
            }
            Intrinsics.checkNotNull(stringExtra);
            multiTouchViewPage.setCurrentItem(Integer.parseInt(stringExtra));
        } catch (Exception e2) {
            m8b.m("WTActivity", "intentTab e = " + e2.getMessage());
        }
    }
}