package com.heytap.health.bloodoxygen.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$color;
import com.heytap.health.base.R$id;
import com.heytap.health.base.ui.widget.HealthSegmentButtonLayout;
import com.heytap.health.bloodoxygen.R$layout;
import com.heytap.health.bloodoxygen.R$menu;
import com.heytap.health.bloodoxygen.util.BOTrackUtil;
import com.heytap.health.bloodoxygen.viewmodel.BloodOxygenStoreViewModel;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.heytap.health.health_base.R$array;
import com.heytap.health.health_base.R$string;
import com.heytap.health.healthbase.HealthJumpActivity;
import com.heytap.health.healthbase.view.MultiTouchViewPage;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ar0;
import com.oplus.aiunit.vision.g21;
import com.oplus.aiunit.vision.u7k;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Route(path = "/bloodoxygen/BloodOxygenHistoryActivity")
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002*+B\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006.²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/heytap/health/bloodoxygen/ui/BloodOxygenHistoryActivity;", "Lcom/heytap/health/healthbase/HealthJumpActivity;", "Lcom/oplus/aiunit/vision/u7k;", "Lcom/oplus/aiunit/vision/g21;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", LinkInfo.CALL_TYPE_H5, "a4", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "finish", "A7", "initView", "y7", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", LogFieldKey.PROCESS_NAME_KEY, "Lkotlin/Lazy;", "R6", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "lazyGetFamilyConfig", "", "q", "I", "defaultPosition", "", "", "x7", "()[Ljava/lang/String;", "tabTitles", "<init>", "()V", "Companion", "BloodOxygenPagerAdapter", "a", "Lcom/heytap/health/bloodoxygen/viewmodel/BloodOxygenStoreViewModel;", "storeViewModel", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBloodOxygenHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxygenHistoryActivity.kt\ncom/heytap/health/bloodoxygen/ui/BloodOxygenHistoryActivity\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,227:1\n28#2:228\n75#3,13:229\n*S KotlinDebug\n*F\n+ 1 BloodOxygenHistoryActivity.kt\ncom/heytap/health/bloodoxygen/ui/BloodOxygenHistoryActivity\n*L\n81#1:228\n167#1:229,13\n*E\n"})
public final class BloodOxygenHistoryActivity extends HealthJumpActivity implements u7k, g21 {

    @NotNull
    public static final List<Class<? extends Fragment>> r = CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{BloodOxygenDayFragment.class, BloodOxygenWeekFragment.class, BloodOxygenMonthFragment.class, BloodOxygenYearFragment.class});

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy lazyGetFamilyConfig = LazyKt__LazyJVMKt.lazy(new Function0<FamilyMoreDataDetailConfigBean>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryActivity$lazyGetFamilyConfig$2
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

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int defaultPosition;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/heytap/health/bloodoxygen/ui/BloodOxygenHistoryActivity$BloodOxygenPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Lcom/heytap/health/bloodoxygen/ui/BloodOxygenHistoryActivity;Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getPageTitle", "", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class BloodOxygenPagerAdapter extends FragmentStatePagerAdapter {
        public final /* synthetic */ BloodOxygenHistoryActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BloodOxygenPagerAdapter(@NotNull BloodOxygenHistoryActivity bloodOxygenHistoryActivity, FragmentManager fm) {
            super(fm, 1);
            Intrinsics.checkNotNullParameter(fm, "fm");
            this.a = bloodOxygenHistoryActivity;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.a.x7().length;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NotNull
        public Fragment getItem(int position) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            List list = BloodOxygenHistoryActivity.r;
            Object objNewInstance = ((Class) ((position < 0 || position > CollectionsKt__CollectionsKt.getLastIndex(list)) ? BloodOxygenDayFragment.class : list.get(position))).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            BloodOxygenHistoryActivity bloodOxygenHistoryActivity = this.a;
            Fragment fragment = (Fragment) objNewInstance;
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARGUMENT_MORE_DATA_DETAIL", bloodOxygenHistoryActivity.p7());
            bloodOxygenHistoryActivity.t7(bundle, position);
            fragment.setArguments(bundle);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "fragmentList.getOrElse(p…ts = bundle\n            }");
            return fragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public CharSequence getPageTitle(int position) {
            return (CharSequence) ArraysKt___ArraysKt.getOrNull(this.a.x7(), position);
        }
    }

    public static final BloodOxygenStoreViewModel z7(Lazy<BloodOxygenStoreViewModel> lazy) {
        return lazy.getValue();
    }

    public final void A7() {
        try {
            String stringExtra = getIntent().getStringExtra("tab");
            ar0.a("BloodOxygenHistoryActivity", "parseIntent tab = " + stringExtra);
            if (stringExtra != null) {
                this.defaultPosition = Integer.parseInt(stringExtra);
            }
            ar0.a("BloodOxygenHistoryActivity", "parseIntent familyDetailConfig = " + p7());
        } catch (Exception e2) {
            ar0.b("BloodOxygenHistoryActivity", "parseIntent exception: " + e2);
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

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        try {
            return super.dispatchTouchEvent(ev);
        } catch (Exception e2) {
            ar0.b("BloodOxygenHistoryActivity", "dispatchTouchEvent:" + e2.getMessage());
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
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        cOUIToolbar.setTitle(R$string.health_base_spo2);
        cOUIToolbar.setBackgroundColor(getColor(R$color.lib_base_card_white_bg));
        S1(this, cOUIToolbar, true);
        ((HealthSegmentButtonLayout) findViewById(com.heytap.health.bloodoxygen.R$id.segment_blood_oxygen_history)).setSegmentButtons(x7());
        MultiTouchViewPage multiTouchViewPage = (MultiTouchViewPage) findViewById(com.heytap.health.bloodoxygen.R$id.viewpager_blood_oxygen_history);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        multiTouchViewPage.setAdapter(new BloodOxygenPagerAdapter(this, supportFragmentManager));
        multiTouchViewPage.setCurrentItem(this.defaultPosition, false);
        multiTouchViewPage.setOffscreenPageLimit(3);
        multiTouchViewPage.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryActivity.initView.1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(final int position) {
                ar0.a("BloodOxygenHistoryActivity", "onPageSelected() position=" + position);
                List<Fragment> fragments = BloodOxygenHistoryActivity.this.getSupportFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "supportFragmentManager.fragments");
                for (Fragment fragment : fragments) {
                    boolean zAreEqual = Intrinsics.areEqual(fragment.getClass(), CollectionsKt___CollectionsKt.getOrNull(BloodOxygenHistoryActivity.r, position));
                    if (fragment instanceof BloodOxygenDayFragment) {
                        ((BloodOxygenDayFragment) fragment).u1(zAreEqual);
                    } else if (fragment instanceof BloodOxygenHistoryBaseFragment) {
                        ((BloodOxygenHistoryBaseFragment) fragment).V1(zAreEqual);
                    }
                }
                BloodOxygenHistoryActivity.this.v7(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryActivity$initView$1$onPageSelected$2
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
                        BOTrackUtil.INSTANCE.a().e(position + 1);
                    }
                });
            }
        });
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.health_blood_oxygen_activity_history);
        getWindow().getDecorView().setBackground(new ColorDrawable(getColor(R$color.lib_base_card_white_bg)));
        A7();
        initView();
        if (q7() <= 0) {
            y7();
            BOTrackUtil.INSTANCE.a().m();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R$menu.health_blood_oxygen_menu_description, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == com.heytap.health.health_base.R$id.description) {
            v7(new Function0<Unit>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryActivity.onOptionsItemSelected.1
                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BOTrackUtil.INSTANCE.a().i();
                }
            });
            startActivity(new Intent(this, (Class<?>) BloodOxygenDescriptionActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @NotNull
    public final String[] x7() {
        String[] stringArray = getResources().getStringArray(R$array.health_base_tab_list);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray…ray.health_base_tab_list)");
        return stringArray;
    }

    public final void y7() {
        final Function0 function0 = null;
        z7(new ViewModelLazy(Reflection.getOrCreateKotlinClass(BloodOxygenStoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryActivity$initViewModel$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryActivity$initViewModel$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.heytap.health.bloodoxygen.ui.BloodOxygenHistoryActivity$initViewModel$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        })).v();
    }
}