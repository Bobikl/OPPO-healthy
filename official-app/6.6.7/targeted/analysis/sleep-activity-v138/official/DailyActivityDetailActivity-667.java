package com.heytap.health.daily.ui;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.pad.PadFeature;
import com.heytap.health.base.praise.PraiseModule;
import com.heytap.health.base.share.SportShareDataBean;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.daily.R$id;
import com.heytap.health.daily.R$menu;
import com.heytap.health.daily.R$string;
import com.heytap.health.daily.bean.DailyActivityDayBean;
import com.heytap.health.daily.viewmodel.DailyActivityDetailViewModel;
import com.heytap.health.device_data_sync.data_sync.IDataSyncService;
import com.heytap.health.device_settings.setting.IDeviceSettingService;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.dq4;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.f15;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.g21;
import com.oplus.aiunit.vision.i7k;
import com.oplus.aiunit.vision.jzi;
import com.oplus.aiunit.vision.kzi;
import com.oplus.aiunit.vision.lld;
import com.oplus.aiunit.vision.lq2;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.n07;
import com.oplus.aiunit.vision.ot8;
import com.oplus.aiunit.vision.pwf;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.u5e;
import com.oplus.aiunit.vision.u7k;
import com.oplus.aiunit.vision.w4l;
import com.oplus.aiunit.vision.wv8;
import com.oplus.aiunit.vision.xj3;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.yj3;
import com.oplus.aiunit.vision.yye;
import com.oplus.aiunit.vision.za3;
import com.support.dialog.R$layout;
import com.support.dialog.R$style;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/daily/DailyActivityDetailActivity")
public class DailyActivityDetailActivity extends BaseActivity implements u7k, g21 {
    public FamilyMoreDataDetailConfigBean A;
    public COUIToolbar m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DailyActivityDetailViewModel f4888n;
    public LocalDate o;
    public d p;
    public ImageView q;
    public ImageView r;
    public TextView s;
    public ViewPager t;
    public ImageView u;
    public int v;
    public DailyCalendarPanelFrag w;
    public COUIBottomSheetDialogFragment x;
    public int y;
    public static LocalDate currentSelectedDate = LocalDate.now();
    public static final LocalDate C = LocalDate.of(2018, 12, 31);
    public static boolean isOnePlus = false;
    public final MutableLiveData<DailyActivityDayBean> z = new MutableLiveData<>();
    public boolean B = true;

    public class a implements ViewPager.OnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPageSelected position is ");
            sb.append(i);
            DailyActivityDetailActivity.this.v = i;
            DailyActivityDetailActivity.this.o = DailyActivityDetailActivity.C.plusDays(i + 1);
            DailyActivityDetailActivity.currentSelectedDate = DailyActivityDetailActivity.this.o;
            DailyActivityDetailActivity dailyActivityDetailActivity = DailyActivityDetailActivity.this;
            dailyActivityDetailActivity.f8(dailyActivityDetailActivity.o);
            if (!DailyActivityDetailActivity.this.u5()) {
                com.heytap.health.base.track.a.x().a(xmk.TAG_MODULE_ID, -1).b();
            }
            DailyActivityDetailActivity.this.f4888n.B(DailyActivityDetailActivity.this.o, DailyActivityDetailActivity.this.z);
        }
    }

    public class b extends jzi {
        public b(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override // com.oplus.aiunit.vision.u91
        public void b(@NonNull kzi kziVar) {
            m8b.f("DailyActivityDetailActivity", "prepareFetchData:" + this.f18736c);
            if (!f(this.f18736c)) {
                DailyActivityDetailActivity.this.o = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.f18736c), ZoneId.systemDefault()).toLocalDate();
            } else if (DailyActivityDetailActivity.this.o == null) {
                DailyActivityDetailActivity.this.o = LocalDate.now();
            }
            LocalDate localDateN7 = DailyActivityDetailActivity.this.N7();
            if (localDateN7 != null) {
                DailyActivityDetailActivity.this.o = localDateN7;
            }
            DailyActivityDetailActivity.this.P7();
            DailyActivityDetailActivity.this.U7();
            if (fdg.x("device_bind_list").q("device_bind_support_ecg")) {
                DailyActivityDetailActivity.this.findViewById(R$id.health_authentication_explanation_tv).setVisibility(0);
            }
        }
    }

    public class c implements yj3 {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.yj3
        public void a() {
            DailyActivityDetailActivity.super.onBackPressed();
        }

        @Override // com.oplus.aiunit.vision.yj3
        public void b() {
            e1.d().b("/settings/PrivacyDataSettingActivity").navigation();
        }

        @Override // com.oplus.aiunit.vision.yj3
        public void onFinish() {
            DailyActivityDetailActivity.super.onBackPressed();
        }
    }

    public class d extends FragmentStatePagerAdapter {
        public int a;
        public Map<Integer, DailyActivityPagerFragment> b;

        public d(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.b = new HashMap();
        }

        public void a(int i) {
            this.a = i;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            this.b.remove(Integer.valueOf(i));
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.a;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NonNull
        public Fragment getItem(int i) {
            LocalDate localDatePlusDays = DailyActivityDetailActivity.C.plusDays(i + 1);
            StringBuilder sb = new StringBuilder();
            sb.append("viewpager:getItem: ");
            sb.append(i);
            sb.append("/mDate:");
            sb.append(localDatePlusDays.toString());
            DailyActivityPagerFragment dailyActivityPagerFragmentN0 = DailyActivityPagerFragment.n0(localDatePlusDays, i, DailyActivityDetailActivity.this.A);
            this.b.put(Integer.valueOf(i), dailyActivityPagerFragmentN0);
            return dailyActivityPagerFragmentN0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NonNull Object obj) {
            return -2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W7(Integer num) throws Throwable {
        m8b.f("DailyActivityDetailActivity", "sportDataStats size = " + num);
        this.B = num.intValue() >= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X7(View view) {
        h8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y7(View view) {
        if (!u5()) {
            com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 2).a(xmk.TAG_POSTION1, 2).a("element", M7(this.o.plusDays(-1L))).b();
        }
        this.t.setCurrentItem(this.v - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z7(View view) {
        if (!u5()) {
            com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 2).a("element", M7(this.o.plusDays(1L))).b();
        }
        this.t.setCurrentItem(this.v + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a8(View view) {
        h8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b8() {
        isOnePlus = lld.INSTANCE.a();
        L7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c8(DialogInterface dialogInterface, int i) {
        m8b.f("DailyActivityDetailActivity", "showSelectOriginDialog onClick:" + i);
        if (i == 0) {
            if (!u5()) {
                com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 2).a(xmk.TAG_POSTION2, 2).a("element", 1).b();
            }
            this.f4888n.A(-2);
        } else if (i == 1) {
            if (!u5()) {
                com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 2).a(xmk.TAG_POSTION2, 2).a("element", 2).b();
            }
            this.f4888n.A(-3);
        }
        dialogInterface.dismiss();
    }

    @Override // com.heytap.health.base.base.BaseViewSizeControl
    public boolean H5() {
        return false;
    }

    public void I7(LocalDate localDate) {
        currentSelectedDate = localDate;
        if (!u5()) {
            com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 2).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, 2).a("element", M7(localDate)).b();
        }
        int epochDay = (int) (localDate.toEpochDay() - C.toEpochDay());
        StringBuilder sb = new StringBuilder();
        sb.append("panelFrag sumNumOfDay is ");
        sb.append(epochDay);
        sb.append(" ,data ");
        sb.append(localDate);
        this.t.setCurrentItem(epochDay - 1, false);
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = this.x;
        if (cOUIBottomSheetDialogFragment != null) {
            cOUIBottomSheetDialogFragment.dismiss();
        }
    }

    @SuppressLint({"AutoDispose", "CheckResult"})
    public final void L7() {
        xj3.a().K0(wv8.c()).a(new b24() { // from class: com.oplus.aiunit.vision.rq4
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) throws Throwable {
                this.i.W7((Integer) obj);
            }
        });
    }

    public String M7(LocalDate localDate) {
        return q15.t(localDate);
    }

    @Nullable
    public final LocalDate N7() {
        Long lValueOf;
        FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean = this.A;
        if (familyMoreDataDetailConfigBean != null) {
            lValueOf = Long.valueOf(familyMoreDataDetailConfigBean.getDayTime());
        } else {
            String stringExtra = getIntent().getStringExtra("date");
            if (TextUtils.isEmpty(stringExtra)) {
                lValueOf = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("jumpTime:");
                sb.append((Object) null);
                lValueOf = Long.valueOf(q15.e(stringExtra));
            }
        }
        if (lValueOf == null || lValueOf.longValue() <= 0) {
            return null;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(lValueOf.longValue()), ZoneId.systemDefault()).toLocalDate();
    }

    public final boolean O7() {
        String strH = ot8.h();
        if (((IDataSyncService) e1.d().h(IDataSyncService.class)).O7(strH)) {
            this.f4888n.A(-2);
        }
        return ((IDataSyncService) e1.d().h(IDataSyncService.class)).O7(strH);
    }

    public final void P7() {
        if (u5()) {
            this.f4888n.y(this.A.getSsoid());
        }
        if (u5()) {
            this.f4888n.B(this.o, this.z);
        } else {
            this.f4888n.B(LocalDate.now(), this.z);
        }
    }

    public void Q7() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LocalDate localDateN7 = N7();
        if (localDateN7 != null) {
            this.o = localDateN7;
        } else {
            this.o = LocalDate.now();
        }
        long epochDay = this.o.toEpochDay();
        LocalDate localDate = C;
        this.v = ((int) (epochDay - localDate.toEpochDay())) - 1;
        this.y = (int) (LocalDate.now().toEpochDay() - localDate.toEpochDay());
        m8b.f("DailyActivityDetailActivity", "initDateList mIndex= " + this.v + "; mTotalDays = " + this.y);
        StringBuilder sb = new StringBuilder();
        sb.append("initDateList cost ");
        sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
    }

    public void R7() {
        this.s = (TextView) findViewById(R$id.tv_daily_date);
        this.q = (ImageView) findViewById(R$id.iv_last);
        this.r = (ImageView) findViewById(R$id.iv_next);
        w4l.d(this, findViewById(R$id.health_daily_activity_date_select));
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.sq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.X7(view);
            }
        });
        if (this.o == null) {
            this.o = LocalDate.now();
        }
        f8(this.o);
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.tq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.Y7(view);
            }
        });
        this.r.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.uq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.Z7(view);
            }
        });
    }

    public final void S7() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(com.heytap.health.base.R$id.lib_base_toolbar);
        this.m = cOUIToolbar;
        cOUIToolbar.setTitle(getResources().getString(R$string.health_daily_activity));
        this.m.setBackgroundColor(getColor(R$color.lib_base_card_white_bg));
        S1(this, this.m, true);
    }

    public final void T7() {
        this.f4888n = (DailyActivityDetailViewModel) new ViewModelProvider(this).get(DailyActivityDetailViewModel.class);
        new b(this).h(dq4.class);
    }

    public final void U7() {
        this.t = (ViewPager) findViewById(R$id.health_daily_activity_view_pager);
        d dVar = new d(getSupportFragmentManager());
        this.p = dVar;
        dVar.a(this.y);
        this.t.setAdapter(this.p);
        this.t.setCurrentItem(this.v, false);
        this.t.addOnPageChangeListener(new a());
    }

    public final void V7() {
        SportShareDataBean sportShareDataBean = new SportShareDataBean();
        sportShareDataBean.setHasLongImage(false);
        sportShareDataBean.setAvatar(fdg.w().D("user_avatar"));
        sportShareDataBean.setUserName(cn.c().c());
        sportShareDataBean.setEndTime(f15.a(f15.b(currentSelectedDate)));
        sportShareDataBean.setHasRoute(false);
        sportShareDataBean.setImageShareType(1);
        DailyActivityDayBean value = this.z.getValue();
        if (value != null) {
            String str = String.format(getString(com.heytap.health.base.R$string.lib_base_step), Integer.valueOf(value.getCurrentStep()));
            String str2 = String.format(getString(com.heytap.health.base.R$string.lib_base_share_static_activity), Integer.valueOf(value.getCurrentActive()));
            String str3 = String.format(getString(com.heytap.health.base.R$string.lib_base_share_static_dym_cailor), Integer.valueOf(value.getCurrentCalorie()));
            String str4 = String.format(getString(com.heytap.health.base.R$string.lib_base_share_static_time), Integer.valueOf(value.getCurrentTime()));
            sportShareDataBean.setMainInfo(str);
            sportShareDataBean.setMainInfoHasUnit(true);
            sportShareDataBean.setSubInfoLeft(str3);
            sportShareDataBean.setSubInfoMiddle(str4);
            sportShareDataBean.setSubInfoRight(str2);
        } else {
            m8b.b("DailyActivityDetailActivity", "dailyDetailBean is null!");
        }
        sportShareDataBean.setChangePicBg(true);
        sportShareDataBean.setImgPageCode(pwf.a.DAILY_DETAIL);
        sportShareDataBean.setImgCardCode("02");
        sportShareDataBean.setCardTitleType(getString(R$string.health_daily_activity));
        sportShareDataBean.setLaunchPraiseModule(PraiseModule.APP_RECORD_SHARE.getValue());
        e1.d().b("/sports/SportShareActivity").withParcelable("sportShareDataKey", sportShareDataBean).navigation();
    }

    @Override // com.oplus.aiunit.vision.rz0
    public boolean a4() {
        return true;
    }

    public void f8(LocalDate localDate) {
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDatePlusDays = C.plusDays(1L);
        if (lq2.a(localDateNow, "yyyyMMMdd").equals(lq2.a(localDate, "yyyyMMMdd"))) {
            this.r.setVisibility(8);
        } else {
            this.r.setVisibility(0);
        }
        if (lq2.a(localDatePlusDays, "yyyyMMMdd").equals(lq2.a(localDate, "yyyyMMMdd"))) {
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
        }
        this.s.setText(M7(localDate));
    }

    @Override // android.app.Activity
    public void finish() {
        x4(this);
        super.finish();
    }

    public final void g8(@Nullable Bundle bundle) {
        if (bundle == null || !bundle.containsKey("DailyActivityDetailActivity")) {
            return;
        }
        this.o = (LocalDate) BundleCompat.getSerializable(bundle, "DailyActivityDetailActivity", LocalDate.class);
    }

    public final void h8() {
        if (!u5()) {
            com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 2).a(xmk.TAG_POSTION1, 3).a(xmk.TAG_POSTION2, -1).b();
        }
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = this.x;
        if (cOUIBottomSheetDialogFragment != null) {
            cOUIBottomSheetDialogFragment.dismiss();
        }
        COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment2 = new COUIBottomSheetDialogFragment();
        this.x = cOUIBottomSheetDialogFragment2;
        cOUIBottomSheetDialogFragment2.setDraggable(false);
        DailyCalendarPanelFrag dailyCalendarPanelFrag = new DailyCalendarPanelFrag();
        this.w = dailyCalendarPanelFrag;
        dailyCalendarPanelFrag.setLocalDate(this.o);
        if (u5()) {
            this.w.initSsoid(this.A.getSsoid());
        }
        this.x.setMainPanelFragment(this.w);
        this.x.show(getSupportFragmentManager(), "calendarPanelfragment");
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void i8() {
        boolean[] zArr = new boolean[2];
        if (this.f4888n.x() == -2) {
            zArr[0] = true;
            zArr[1] = false;
        } else {
            zArr[0] = false;
            zArr[1] = true;
        }
        za3 za3Var = new za3(this, R$layout.coui_select_dialog_singlechoice, new CharSequence[]{getResources().getString(R$string.health_daily_detail_step_phone_and_device), getResources().getString(R$string.health_daily_detail_step_device)}, null, zArr, new boolean[]{false, false}, false);
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(this, R$style.COUIAlertDialog_Bottom);
        healthAlertDialogBuilder.setTitle(R$string.health_daily_detail_data_origin);
        healthAlertDialogBuilder.setAdapter(za3Var, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.oq4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.c8(dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.setNegativeButton(com.heytap.health.base.R$string.lib_base_share_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.pq4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        healthAlertDialogBuilder.show();
    }

    public void initIntent() {
        this.A = (FamilyMoreDataDetailConfigBean) getIntent().getSerializableExtra("ARGUMENT_MORE_DATA_DETAIL");
    }

    public final void initView() {
        ImageView imageView = (ImageView) findViewById(R$id.iv_down);
        this.u = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.qq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.a8(view);
            }
        });
        S7();
        R7();
    }

    public final void j8() {
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(this, R$style.COUIAlertDialog_Bottom);
        healthAlertDialogBuilder.setTitle(R$string.health_daily_detail_step_source_dialog_title);
        healthAlertDialogBuilder.setMessage(R$string.health_daily_detail_step_source_dialog_content_1);
        healthAlertDialogBuilder.setPositiveButton(com.heytap.health.health_base.R$string.health_base_update_watch_version_ok, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.mq4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        healthAlertDialogBuilder.show();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (yye.m()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jC = xj3.c();
            long jB = xj3.b();
            m8b.f("DailyActivityDetailActivity", "lastOpenTime = " + jC);
            if (xj3.d(jC, jCurrentTimeMillis) && xj3.e(jCurrentTimeMillis, jB) && this.B) {
                xj3.g(new c());
            } else {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
        }
        xj3.f();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.heytap.health.daily.R$layout.health_daily_activity_activity_detail);
        getWindow().getDecorView().setBackground(new ColorDrawable(getColor(R$color.lib_base_card_white_bg)));
        initIntent();
        g8(bundle);
        Q7();
        initView();
        T7();
        lld.INSTANCE.b(true);
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.nq4
            @Override // java.lang.Runnable
            public final void run() {
                this.i.b8();
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuItem menuItemFindItem;
        getMenuInflater().inflate(R$menu.health_daily_action_daily_activity_menu, menu);
        m8b.f("DailyActivityDetailActivity", "onCreateOptionsMenu");
        if (!n07.a()) {
            menu.getItem(4).setVisible(true);
        }
        if (!O7()) {
            menu.getItem(2).setVisible(true);
        }
        if (u5()) {
            menu.findItem(R$id.daily_share).setVisible(false);
            menu.findItem(R$id.setgoals).setVisible(false);
            menu.findItem(R$id.dataOrigin).setVisible(false);
            menu.findItem(R$id.notice).setVisible(false);
        }
        if ((!u5e.d(this, PadFeature.MENU_GOAL_CALORIE) || !u5e.d(this, PadFeature.MENU_GOAL_STEP)) && (menuItemFindItem = menu.findItem(R$id.setgoals)) != null) {
            menuItemFindItem.setVisible(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        currentSelectedDate = LocalDate.now();
        super.onDestroy();
        lld.INSTANCE.b(false);
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R$id.daily_share) {
            if (!i7k.j()) {
                if (!u5()) {
                    com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 1).b();
                }
                V7();
            }
        } else if (itemId == R$id.setgoals) {
            if (!i7k.j()) {
                if (!u5()) {
                    com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 2).a(xmk.TAG_POSTION2, 1).b();
                }
                ((IDeviceSettingService) e1.d().h(IDeviceSettingService.class)).o0(this);
            }
        } else if (itemId == R$id.aboutstats) {
            if (!u5()) {
                com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 1).a(xmk.TAG_POSTION1, 2).a(xmk.TAG_POSTION2, 3).b();
            }
            startActivity(new Intent(this, (Class<?>) DailyActivityExplanationActivity.class));
        } else if (itemId == R$id.notice) {
            j8();
        } else if (itemId == R$id.dataOrigin) {
            i8();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("DailyActivityDetailActivity", this.o);
    }

    public final boolean u5() {
        return this.A != null;
    }
}