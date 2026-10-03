package com.heytap.health.sleep.snore;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.track.a;
import com.heytap.health.base.ui.widget.HealthSegmentButtonLayout;
import com.heytap.health.health_base.R$menu;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.R$string;
import com.heytap.health.sleep.description.SleepSnoreDescriptionActivity;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.health.sleep.snore.day.SnoreHistoryDayFragment;
import com.heytap.health.sleep.snore.week.SnoreHistoryWeekFragment;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.bjg;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.xmk;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/sleep/SnoreHistoryActivity")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/sleep/snore/SnoreHistoryActivity;", "Lcom/heytap/health/base/base/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onResume", "initView", "p7", "Landroidx/viewpager2/widget/ViewPager2;", LogFieldKey.MESSAGE_KEY, "Landroidx/viewpager2/widget/ViewPager2;", "viewPage", "Lcom/heytap/health/base/ui/widget/HealthSegmentButtonLayout;", "n", "Lcom/heytap/health/base/ui/widget/HealthSegmentButtonLayout;", "segmentLayout", "<init>", "()V", "Companion", "a", "SnoreHistoryPageAdapter", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnoreHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnoreHistoryActivity.kt\ncom/heytap/health/sleep/snore/SnoreHistoryActivity\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,178:1\n28#2:179\n*S KotlinDebug\n*F\n+ 1 SnoreHistoryActivity.kt\ncom/heytap/health/sleep/snore/SnoreHistoryActivity\n*L\n88#1:179\n*E\n"})
public final class SnoreHistoryActivity extends BaseActivity {

    @NotNull
    public static final String BORDER_END_TIME = "borderEndTime";

    @NotNull
    public static final String BORDER_START_TIME = "borderStartTime";

    @NotNull
    public static final String CUR_DAY_END_TIME = "curDayEndTime";

    @NotNull
    public static final String CUR_DAY_START_TIME = "curDayStartTime";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public ViewPager2 viewPage;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public HealthSegmentButtonLayout segmentLayout;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/sleep/snore/SnoreHistoryActivity$SnoreHistoryPageAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "position", "Landroidx/fragment/app/Fragment;", "createFragment", "", "", "i", "Ljava/util/List;", "getList", "()Ljava/util/List;", "list", "Lcom/heytap/health/base/base/BaseActivity;", "fragmentActivity", "<init>", "(Lcom/heytap/health/base/base/BaseActivity;Ljava/util/List;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class SnoreHistoryPageAdapter extends FragmentStateAdapter {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final List<String> list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SnoreHistoryPageAdapter(@NotNull BaseActivity fragmentActivity, @NotNull List<String> list) {
            super(fragmentActivity);
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public Fragment createFragment(int position) {
            return position == 0 ? new SnoreHistoryDayFragment() : new SnoreHistoryWeekFragment();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.list.size();
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.sleep.snore.SnoreHistoryActivity$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J6\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u001e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/sleep/snore/SnoreHistoryActivity$a;", "", "Landroid/content/Context;", "context", "", SnoreHistoryActivity.BORDER_START_TIME, SnoreHistoryActivity.BORDER_END_TIME, SnoreHistoryActivity.CUR_DAY_START_TIME, SnoreHistoryActivity.CUR_DAY_END_TIME, "", "b", "", "currentItem", "c", "a", "", "BORDER_END_TIME", "Ljava/lang/String;", "BORDER_START_TIME", "CURRENT_ITEM", "CUR_DAY_END_TIME", "CUR_DAY_START_TIME", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context, long curDayStartTime, long curDayEndTime) {
            Intrinsics.checkNotNullParameter(context, "context");
            long jN = pr8.INSTANCE.n(System.currentTimeMillis());
            Intent intent = new Intent(context, (Class<?>) SnoreHistoryActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(SnoreHistoryActivity.BORDER_START_TIME, 1546257600000L);
            intent.putExtra(SnoreHistoryActivity.BORDER_END_TIME, jN);
            intent.putExtra(SnoreHistoryActivity.CUR_DAY_START_TIME, curDayStartTime);
            intent.putExtra(SnoreHistoryActivity.CUR_DAY_END_TIME, curDayEndTime);
            intent.putExtra("currentItem", 1);
            context.startActivity(intent);
        }

        public final void b(@NotNull Context context, long borderStartTime, long borderEndTime, long curDayStartTime, long curDayEndTime) {
            Intrinsics.checkNotNullParameter(context, "context");
            c(context, borderStartTime, borderEndTime, curDayStartTime, curDayEndTime, 0);
        }

        public final void c(@NotNull Context context, long borderStartTime, long borderEndTime, long curDayStartTime, long curDayEndTime, int currentItem) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) SnoreHistoryActivity.class);
            intent.putExtra(SnoreHistoryActivity.BORDER_START_TIME, borderStartTime);
            intent.putExtra(SnoreHistoryActivity.BORDER_END_TIME, borderEndTime);
            intent.putExtra(SnoreHistoryActivity.CUR_DAY_START_TIME, curDayStartTime);
            intent.putExtra(SnoreHistoryActivity.CUR_DAY_END_TIME, curDayEndTime);
            intent.putExtra("currentItem", currentItem);
            context.startActivity(intent);
        }
    }

    public static final void q7(SnoreHistoryActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewPager2 viewPager2 = this$0.viewPage;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            viewPager2 = null;
        }
        viewPager2.setCurrentItem(i, false);
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initView() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        cOUIToolbar.setTitle(getString(R$string.health_sleep_snore_risk));
        cOUIToolbar.setBackgroundColor(getColor(R$color.lib_base_card_white_bg_3));
        S1(this, cOUIToolbar, true);
        View viewFindViewById = findViewById(R$id.segment_act_snore_history);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.segment_act_snore_history)");
        this.segmentLayout = (HealthSegmentButtonLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.viewPager);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.viewPager)");
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById2;
        this.viewPage = viewPager2;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            viewPager2 = null;
        }
        viewPager2.setOffscreenPageLimit(2);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.health_sleep_act_snore_history);
        View decorView = getWindow().getDecorView();
        int i = R$color.lib_base_common_background_color;
        decorView.setBackground(new ColorDrawable(getColor(i)));
        getWindow().getDecorView().setForceDarkAllowed(false);
        k6(this, getColor(R$color.lib_base_card_white_bg_3));
        getWindow().setNavigationBarColor(getColor(i));
        initView();
        p7();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R$menu.health_base_menu_icon_description, menu);
        menu.findItem(R$id.description).setVisible(true);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == R$id.description) {
            a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 1).b();
            startActivity(new Intent(this, (Class<?>) SleepSnoreDescriptionActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a.x().a(xmk.TAG_MODULE_ID, 2).b();
        bjg bjgVar = bjg.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        ViewPager2 viewPager2 = this.viewPage;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            viewPager2 = null;
        }
        bjgVar.b(intent, viewPager2);
    }

    public final void p7() {
        String[] strArr = {getString(com.heytap.health.health_base.R$string.health_base_tab_day), getString(com.heytap.health.health_base.R$string.health_base_tab_week)};
        HealthSegmentButtonLayout healthSegmentButtonLayout = this.segmentLayout;
        ViewPager2 viewPager2 = null;
        if (healthSegmentButtonLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("segmentLayout");
            healthSegmentButtonLayout = null;
        }
        healthSegmentButtonLayout.setSegmentButtons(strArr);
        ViewPager2 viewPager3 = this.viewPage;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
            viewPager3 = null;
        }
        viewPager3.setAdapter(new SnoreHistoryPageAdapter(this, ArraysKt___ArraysKt.toList(strArr)));
        final int intExtra = getIntent().getIntExtra("currentItem", 0);
        if (intExtra > 0) {
            ViewPager2 viewPager4 = this.viewPage;
            if (viewPager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPage");
                viewPager4 = null;
            }
            viewPager4.post(new Runnable() { // from class: com.oplus.aiunit.vision.g1i
                @Override // java.lang.Runnable
                public final void run() {
                    SnoreHistoryActivity.q7(this.i, intExtra);
                }
            });
        }
        ViewPager2 viewPager5 = this.viewPage;
        if (viewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPage");
        } else {
            viewPager2 = viewPager5;
        }
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.heytap.health.sleep.snore.SnoreHistoryActivity$initData$2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if (position == 0) {
                    a.k().a(xmk.TAG_MODULE_ID, 2).a(xmk.TAG_POSTION1, 1).b();
                } else {
                    a.k().a(xmk.TAG_MODULE_ID, 2).a(xmk.TAG_POSTION1, 2).b();
                }
            }
        });
    }
}