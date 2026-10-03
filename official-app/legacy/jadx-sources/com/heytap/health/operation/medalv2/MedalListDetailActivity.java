package com.heytap.health.operation.medalv2;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.indicator.COUIPageIndicator;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$anim;
import com.heytap.health.base.R$id;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.track.NxTrackHelper;
import com.heytap.health.operation.R$drawable;
import com.heytap.health.operation.R$layout;
import com.heytap.health.operation.R$menu;
import com.heytap.health.operation.medal.MedalUploadSaveManager;
import com.heytap.health.operation.medalv2.adapter.MedalListDetailPageAdapter;
import com.heytap.health.operations.bean.MedalListBean;
import com.oplus.aiunit.vision.a78;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cz0;
import com.oplus.aiunit.vision.drb;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.s11;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/operation/MedalListDetailActivity")
public class MedalListDetailActivity extends BaseActivity implements NxTrackHelper.d, s11 {
    public static COUIPageIndicator s;
    public COUIToolbar m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewPager f5213n;
    public OnPageChangeCallback o;
    public boolean p;
    public final drb q = new drb();
    public List<MedalListBean> r;

    @Override // com.heytap.health.base.base.BaseViewSizeControl
    public boolean F5() {
        return false;
    }

    @Override // android.app.Activity
    public void finish() {
        v4(this);
        super.finish();
        overridePendingTransition(R$anim.lib_base_top_to_bottom_in, R$anim.lib_base_top_to_bottom_out);
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final int l7(MedalListBean medalListBean, List<MedalListBean> list) {
        if (lza.a(list)) {
            return 0;
        }
        String code = medalListBean.getCode();
        if (TextUtils.isEmpty(code)) {
            return 0;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return 0;
    }

    @Override // com.oplus.aiunit.vision.az0
    public boolean m1() {
        return true;
    }

    public final boolean m7(MedalListBean medalListBean, MedalListBean medalListBean2) {
        return medalListBean.getCode().equals(medalListBean2.getCode());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x009b  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:25:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:43:0x0183  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        MedalListBean medalListBean;
        String stringExtra;
        List<MedalListBean> list;
        int iL7;
        overridePendingTransition(R$anim.lib_base_bottom_to_top_in, R$anim.lib_base_bottom_to_top_out);
        super.onCreate(bundle);
        MedalListBean medalListBean2 = null;
        getWindow().setBackgroundDrawable(null);
        setContentView(R$layout.operation_activity_medal_list_detail);
        this.m = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        this.f5213n = (ViewPager) findViewById(com.heytap.health.operation.R$id.viewpager_medal_list_detail);
        s = (COUIPageIndicator) findViewById(com.heytap.health.operation.R$id.indicator_medal_list_detail);
        String stringExtra2 = "";
        this.m.setTitle("");
        f7(this.m, true);
        try {
            medalListBean = (MedalListBean) getIntent().getSerializableExtra("medal_type_code");
            try {
                this.p = getIntent().getBooleanExtra("medal_flag_pop", false);
                stringExtra = getIntent().getStringExtra("typeCode");
                try {
                    stringExtra2 = getIntent().getStringExtra("code");
                    cz0.launch_type.set(getIntent().getIntExtra("visitFrom", Integer.MIN_VALUE));
                } catch (Exception e2) {
                    e = e2;
                    String str2 = stringExtra2;
                    stringExtra2 = stringExtra;
                    medalListBean2 = medalListBean;
                    str = str2;
                    a7b.b("MedalListDetailActivity", e.getMessage());
                    String str3 = str;
                    medalListBean = medalListBean2;
                    stringExtra = stringExtra2;
                    stringExtra2 = str3;
                }
            } catch (Exception e3) {
                e = e3;
                medalListBean2 = medalListBean;
                str = "";
                a7b.b("MedalListDetailActivity", e.getMessage());
                String str4 = str;
                medalListBean = medalListBean2;
                stringExtra = stringExtra2;
                stringExtra2 = str4;
                if (medalListBean == null) {
                    a7b.f("MedalListDetailActivity", "medalListBean is null");
                    if (TextUtils.isEmpty(stringExtra)) {
                        a7b.f("MedalListDetailActivity", "medal typeCode is empty or null");
                        return;
                    } else {
                        medalListBean = new MedalListBean();
                        medalListBean.setTypeCode(stringExtra);
                        medalListBean.setCode(stringExtra2);
                    }
                }
                if (this.p) {
                    ArrayList arrayList = new ArrayList(1);
                    this.r = arrayList;
                    arrayList.add(medalListBean);
                    iL7 = 0;
                } else {
                    list = MedalUploadSaveManager.r().u().get(medalListBean.getTypeCode());
                    if (list == null) {
                        a7b.m("MedalListDetailActivity", "get same type medal is null");
                        this.r = new ArrayList();
                    } else {
                        this.r = new ArrayList(list.size());
                        for (MedalListBean medalListBean3 : list) {
                            if (medalListBean3.isOnline()) {
                                this.r.add(medalListBean3);
                            } else if (m7(medalListBean3, medalListBean)) {
                                this.r.add(medalListBean);
                            }
                        }
                    }
                    iL7 = l7(medalListBean, this.r);
                }
                a7b.f("MedalListDetailActivity", "medal list position:" + iL7);
                if (!lza.a(this.r)) {
                    s.setDotsCount(this.r.size());
                }
                s.setCurrentPosition(iL7);
                MedalListDetailPageAdapter medalListDetailPageAdapter = new MedalListDetailPageAdapter(getSupportFragmentManager());
                medalListDetailPageAdapter.a(this.r, this.p);
                this.f5213n.setAdapter(medalListDetailPageAdapter);
                OnPageChangeCallback onPageChangeCallback = new OnPageChangeCallback(s);
                this.o = onPageChangeCallback;
                this.f5213n.addOnPageChangeListener(onPageChangeCallback);
                this.f5213n.setCurrentItem(iL7, false);
                if (qe0.y(this)) {
                    a78.f(this, "https://health.heytapdownload.com/medal/medal_background_dark.png", R$drawable.operation_medal_list_detail_bg, (ImageView) findViewById(com.heytap.health.operation.R$id.img_medal_detail_bg));
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
        if (medalListBean == null) {
            a7b.f("MedalListDetailActivity", "medalListBean is null");
            if (TextUtils.isEmpty(stringExtra)) {
                a7b.f("MedalListDetailActivity", "medal typeCode is empty or null");
                return;
            } else {
                medalListBean = new MedalListBean();
                medalListBean.setTypeCode(stringExtra);
                medalListBean.setCode(stringExtra2);
            }
        }
        if (this.p) {
            ArrayList arrayList2 = new ArrayList(1);
            this.r = arrayList2;
            arrayList2.add(medalListBean);
            iL7 = 0;
        } else {
            list = MedalUploadSaveManager.r().u().get(medalListBean.getTypeCode());
            if (list == null) {
                a7b.m("MedalListDetailActivity", "get same type medal is null");
                this.r = new ArrayList();
            } else {
                this.r = new ArrayList(list.size());
                while (r1.hasNext()) {
                    if (medalListBean3.isOnline()) {
                        this.r.add(medalListBean3);
                    } else if (m7(medalListBean3, medalListBean)) {
                        this.r.add(medalListBean);
                    }
                }
            }
            iL7 = l7(medalListBean, this.r);
        }
        a7b.f("MedalListDetailActivity", "medal list position:" + iL7);
        if (!lza.a(this.r) && this.r.size() > 1) {
            s.setDotsCount(this.r.size());
        }
        s.setCurrentPosition(iL7);
        MedalListDetailPageAdapter medalListDetailPageAdapter2 = new MedalListDetailPageAdapter(getSupportFragmentManager());
        medalListDetailPageAdapter2.a(this.r, this.p);
        this.f5213n.setAdapter(medalListDetailPageAdapter2);
        OnPageChangeCallback onPageChangeCallback2 = new OnPageChangeCallback(s);
        this.o = onPageChangeCallback2;
        this.f5213n.addOnPageChangeListener(onPageChangeCallback2);
        this.f5213n.setCurrentItem(iL7, false);
        if (qe0.y(this)) {
            a78.f(this, "https://health.heytapdownload.com/medal/medal_background_dark.png", R$drawable.operation_medal_list_detail_bg, (ImageView) findViewById(com.heytap.health.operation.R$id.img_medal_detail_bg));
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.p) {
            getMenuInflater().inflate(R$menu.operation_medal_details_menu, menu);
            this.m.setIsTitleCenterStyle(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f5213n.removeOnPageChangeListener(this.o);
        s = null;
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        List<MedalListBean> list;
        int itemId = menuItem.getItemId();
        if (this.p) {
            if (itemId == com.heytap.health.operation.R$id.menu_cancel) {
                List<MedalListBean> list2 = this.r;
                if (list2 != null && !list2.isEmpty()) {
                    this.q.a(this.r.get(0), true);
                }
                finish();
                return true;
            }
        } else if (itemId == 16908332 && (list = this.r) != null && !list.isEmpty()) {
            this.q.a(this.r.get(0), false);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
