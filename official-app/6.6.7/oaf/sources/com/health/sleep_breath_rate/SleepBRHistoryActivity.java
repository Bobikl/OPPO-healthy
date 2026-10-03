package com.health.sleep_breath_rate;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.health.sleep_breath_rate.day.SleepBRDayFragment;
import com.health.sleep_breath_rate.month.SleepBRMonthFragment;
import com.health.sleep_breath_rate.week.SleepBRWeekFragment;
import com.health.sleep_breath_rate.year.SleepBRYearFragment;
import com.heytap.health.base.R;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.oplus.aiunit.vision.e1;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 /2\u00020\u0001:\u000201B\u0007¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010,\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00062"}, d2 = {"Lcom/health/sleep_breath_rate/SleepBRHistoryActivity;", "Lcom/heytap/health/base/base/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "H5", "", "t7", "Lkotlin/Function0;", "block", "s7", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "initView", "v7", "Lcom/health/sleep_breath_rate/SleepBRHistoryActivity$PagerAdapter;", "adapter", "", "position", "r7", "Landroidx/fragment/app/Fragment;", "fragment", "q7", "p7", "Landroidx/viewpager2/widget/ViewPager2;", "m", "Landroidx/viewpager2/widget/ViewPager2;", "mViewPager2", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "n", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "u7", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "setFamilyDetailConfig", "(Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "familyDetailConfig", "u5", "()Z", "isFromFamily", "<init>", "()V", "Companion", "a", "PagerAdapter", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class SleepBRHistoryActivity extends BaseActivity {

    @NotNull
    public static final String CURRENT_DAY_TIME = "currentDayTime";

    @NotNull
    public static final String SLEEP_END_TIME = "sleepEndTime";

    @NotNull
    public static final String SLEEP_START_TIME = "sleepStartTime";
    public ViewPager2 m;

    @Nullable
    public FamilyMoreDataDetailConfigBean n;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0002R\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/health/sleep_breath_rate/SleepBRHistoryActivity$PagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "position", "Landroidx/fragment/app/Fragment;", "createFragment", "getItemCount", "pos", "d", "", "", "i", "[Ljava/lang/String;", "tabList", "Landroidx/fragment/app/FragmentManager;", "j", "Lkotlin/Lazy;", "e", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "<init>", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;)V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
    public static final class PagerAdapter extends FragmentStateAdapter {

        @NotNull
        public final String[] i;

        @NotNull
        public final Lazy j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PagerAdapter(@NotNull final FragmentActivity fragmentActivity, @NotNull String[] strArr) {
            super(fragmentActivity);
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            Intrinsics.checkNotNullParameter(strArr, "tabList");
            this.i = strArr;
            this.j = LazyKt.lazy(new Function0<FragmentManager>() { // from class: com.health.sleep_breath_rate.SleepBRHistoryActivity$PagerAdapter$fragmentManager$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @NotNull
                public final FragmentManager invoke() {
                    FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "fragmentActivity.supportFragmentManager");
                    return supportFragmentManager;
                }
            });
        }

        @NotNull
        public Fragment createFragment(int position) {
            if (position == 0) {
                return new SleepBRDayFragment();
            }
            if (position != 1) {
                return position != 2 ? new SleepBRYearFragment() : new SleepBRMonthFragment();
            }
            return new SleepBRWeekFragment();
        }

        @Nullable
        public final Fragment d(int pos) {
            List fragments = e().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "fragmentManager.fragments");
            if (fragments.size() > 0 && pos < this.i.length && pos >= 0) {
                return (Fragment) fragments.get(pos);
            }
            return null;
        }

        public final FragmentManager e() {
            return (FragmentManager) this.j.getValue();
        }

        public int getItemCount() {
            return this.i.length;
        }
    }

    /* JADX INFO: renamed from: com.health.sleep_breath_rate.SleepBRHistoryActivity$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/health/sleep_breath_rate/SleepBRHistoryActivity$a;", "", "Landroid/content/Context;", "context", "", SleepBRHistoryActivity.SLEEP_START_TIME, SleepBRHistoryActivity.SLEEP_END_TIME, "", "a", "", "CURRENT_DAY_TIME", "Ljava/lang/String;", "SLEEP_END_TIME", "SLEEP_START_TIME", "TAG", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context, long sleepStartTime, long sleepEndTime) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) SleepBRHistoryActivity.class);
            intent.putExtra(SleepBRHistoryActivity.SLEEP_START_TIME, sleepStartTime);
            intent.putExtra(SleepBRHistoryActivity.SLEEP_END_TIME, sleepEndTime);
            context.startActivity(intent);
        }
    }

    public boolean H5() {
        return false;
    }

    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super/*com.heytap.health.base.base.BaseViewSizeControl*/.handleContentView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initView() {
        COUIToolbar cOUIToolbarFindViewById = findViewById(R.id.lib_base_toolbar);
        cOUIToolbarFindViewById.setTitle(getString(R$string.health_sleep_br_title));
        cOUIToolbarFindViewById.setBackgroundColor(getColor(R.color.lib_base_card_white_bg));
        S1(this, cOUIToolbarFindViewById, true);
        String[] stringArray = getResources().getStringArray(com.heytap.health.health_base.R.array.health_base_tab_list);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray…ray.health_base_tab_list)");
        findViewById(R$id.segment_sleep_br_history).setSegmentButtons(stringArray);
        ViewPager2 viewPager2FindViewById = findViewById(R$id.viewpager2);
        Intrinsics.checkNotNullExpressionValue(viewPager2FindViewById, "findViewById(R.id.viewpager2)");
        this.m = viewPager2FindViewById;
        final PagerAdapter pagerAdapter = new PagerAdapter(this, stringArray);
        ViewPager2 viewPager2 = this.m;
        ViewPager2 viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager2");
            viewPager2 = null;
        }
        viewPager2.setOffscreenPageLimit(3);
        ViewPager2 viewPager4 = this.m;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager2");
            viewPager4 = null;
        }
        viewPager4.setAdapter(pagerAdapter);
        ViewPager2 viewPager5 = this.m;
        if (viewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager2");
        } else {
            viewPager3 = viewPager5;
        }
        viewPager3.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.health.sleep_breath_rate.SleepBRHistoryActivity.initView.1
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                SleepBRHistoryActivity.this.r7(pagerAdapter, position);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle savedInstanceState) {
        k6(this, getColor(R.color.lib_base_card_white_bg));
        super.onCreate(savedInstanceState);
        setContentView(R$layout.health_sleep_br_history);
        getWindow().getDecorView().setBackground(new ColorDrawable(getColor(R.color.lib_base_common_background_color)));
        initView();
        v7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(@Nullable Menu menu) {
        getMenuInflater().inflate(R$menu.health_sleep_br_menu_description, menu);
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    @SensorsDataInstrumented
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == R$id.menu_description) {
            e1.d().b("/sleep/SleepBreathRateDescriptionActivity").navigation();
        }
        boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
        SensorsDataAutoTrackHelper.trackMenuItem(this, item);
        return zOnOptionsItemSelected;
    }

    public final void p7(Fragment fragment) {
        if (fragment instanceof SleepBRBaseFragment) {
            ((SleepBRBaseFragment) fragment).g0();
        } else if (fragment instanceof SleepBRDayFragment) {
            ((SleepBRDayFragment) fragment).n0();
        }
    }

    public final void q7(Fragment fragment) {
        if (fragment instanceof SleepBRBaseFragment) {
            ((SleepBRBaseFragment) fragment).h0();
        } else if (fragment instanceof SleepBRDayFragment) {
            ((SleepBRDayFragment) fragment).p0();
        }
    }

    public final void r7(PagerAdapter adapter, int position) {
        Fragment fragmentD = adapter.d(position);
        Fragment fragmentD2 = adapter.d(position - 1);
        Fragment fragmentD3 = adapter.d(position + 1);
        q7(fragmentD);
        p7(fragmentD2);
        p7(fragmentD3);
    }

    public final void s7(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (u5()) {
            return;
        }
        block.invoke();
    }

    public final long t7() {
        FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean = this.n;
        if (familyMoreDataDetailConfigBean != null) {
            return familyMoreDataDetailConfigBean.getDayTime();
        }
        return 0L;
    }

    public final boolean u5() {
        return this.n != null;
    }

    @Nullable
    /* JADX INFO: renamed from: u7, reason: from getter */
    public final FamilyMoreDataDetailConfigBean getN() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v7() {
        Intent intent = getIntent();
        this.n = (FamilyMoreDataDetailConfigBean) (intent != null ? intent.getSerializableExtra("ARGUMENT_MORE_DATA_DETAIL") : null);
    }
}
