package com.heytap.health.relax.ui;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$color;
import com.heytap.health.base.R$id;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.ui.widget.HealthSegmentButtonLayout;
import com.heytap.health.health_base.R$array;
import com.heytap.health.relax.R$layout;
import com.heytap.health.relax.R$string;
import com.oplus.aiunit.vision.u7k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/relax/RelaxActivity")
public class RelaxActivity extends BaseActivity implements u7k {
    public String m;

    public static class a extends FragmentStateAdapter {
        public final List<String> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f6317j;

        public a(@NonNull FragmentActivity fragmentActivity, List<String> list, String str) {
            super(fragmentActivity);
            this.i = list;
            this.f6317j = str;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public Fragment createFragment(int i) {
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? new RelaxYearFragment() : new RelaxMonthFragment();
                }
                return new RelaxWeekFragment();
            }
            RelaxDayFragment relaxDayFragment = new RelaxDayFragment();
            if (this.f6317j != null) {
                Bundle bundle = new Bundle();
                bundle.putString("date", this.f6317j);
                relaxDayFragment.setArguments(bundle);
            }
            return relaxDayFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.i.size();
        }
    }

    @Override // com.oplus.aiunit.vision.rz0
    public boolean a4() {
        return true;
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initView() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        cOUIToolbar.setTitle(R$string.health_relax);
        cOUIToolbar.setBackgroundColor(getColor(R$color.lib_base_card_white_bg));
        S1(this, cOUIToolbar, true);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(com.heytap.health.relax.R$id.vp_health_relax_history);
        String[] stringArray = getResources().getStringArray(R$array.health_base_tab_list);
        a aVar = new a(this, new ArrayList(Arrays.asList(stringArray)), this.m);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setAdapter(aVar);
        ((HealthSegmentButtonLayout) findViewById(com.heytap.health.relax.R$id.segment_relax_history)).setSegmentButtons(stringArray);
    }

    public final void o7() {
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.m = getIntent().getStringExtra("date");
        setContentView(R$layout.health_relax_activity);
        getWindow().getDecorView().setBackgroundColor(getColor(R$color.lib_base_card_white_bg));
        initView();
        o7();
    }
}