package com.heytap.health.main;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.google.android.material.tabs.TabLayout;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.R;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.permission.wxbpermission.PermissionExplanation;
import com.heytap.health.base.step.StepService;
import com.heytap.health.base.switchManager.SwitchStateUtil;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.track.NxTrackHelper;
import com.heytap.health.base.ui.ActivityTransitionUtil;
import com.heytap.health.base.view.LottieWithoutOnSave;
import com.heytap.health.core.operation.space.SpaceView;
import com.heytap.health.device.ota.OTAUpgradeService;
import com.heytap.health.device.third.bgp.IBpgService;
import com.heytap.health.device_data_sync.IDeviceAccountService;
import com.heytap.health.device_data_sync.data_sync.IDataSyncService;
import com.heytap.health.device_pair.download.DeviceResDownlaodManagerApi;
import com.heytap.health.health.FunctionSwitch;
import com.heytap.health.health.HealthService;
import com.heytap.health.health.cardiovascular.CardiovascularService;
import com.heytap.health.health.cervicalspine.CervicalSpineHistoryService;
import com.heytap.health.health.hearing.HearingService;
import com.heytap.health.health.insight.InsightService;
import com.heytap.health.home.HomeDeviceFilterService;
import com.heytap.health.home.HomeFragment;
import com.heytap.health.main.MainActivity;
import com.heytap.health.menstrual.inter.MenstrualService;
import com.heytap.health.operations.router.providers.IOperatorProvider;
import com.heytap.health.receiver.AccountReceiver;
import com.heytap.health.safety.safetycheck.SafetyCheckManager;
import com.heytap.health.sport.mediadownload.IMediaDownloadService;
import com.heytap.health.watchpair.keepalivesettings.KeepAliveSettingUtil;
import com.oplus.aiunit.vision.at5;
import com.oplus.aiunit.vision.bjg;
import com.oplus.aiunit.vision.bu8;
import com.oplus.aiunit.vision.cgb;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.dfa;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.fz7;
import com.oplus.aiunit.vision.gf9;
import com.oplus.aiunit.vision.gpj;
import com.oplus.aiunit.vision.he8;
import com.oplus.aiunit.vision.hmg;
import com.oplus.aiunit.vision.hok;
import com.oplus.aiunit.vision.i5d;
import com.oplus.aiunit.vision.i7k;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.j7k;
import com.oplus.aiunit.vision.ja1;
import com.oplus.aiunit.vision.k7k;
import com.oplus.aiunit.vision.m7k;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.nz9;
import com.oplus.aiunit.vision.o5h;
import com.oplus.aiunit.vision.o7k;
import com.oplus.aiunit.vision.q5d;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.qs0;
import com.oplus.aiunit.vision.qw4;
import com.oplus.aiunit.vision.r8f;
import com.oplus.aiunit.vision.t8i;
import com.oplus.aiunit.vision.tfb;
import com.oplus.aiunit.vision.u5e;
import com.oplus.aiunit.vision.u7k;
import com.oplus.aiunit.vision.vyj;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.wp;
import com.oplus.aiunit.vision.wuf;
import com.oplus.aiunit.vision.x8f;
import com.oplus.aiunit.vision.xl9;
import com.oplus.aiunit.vision.xs5;
import com.oplus.aiunit.vision.y9j;
import com.oplus.aiunit.vision.ys5;
import com.oplus.aiunit.vision.zl9;
import com.oplus.aiunit.vision.zs5;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/app/MainActivity")
public class MainActivity extends BaseActivity implements ja1, NxTrackHelper.f, u7k {
    public static final String ACTION_UPGRADE_CHECKED = "action.upgrade.checked";
    public static final String EXTRA_FROM_INTERNAL = "from_internal";
    public static final String EXTRA_FROM_SHORT = "fromShort";
    public static final int UPGRADE_TYPE_AUTO = 0;
    public static final int UPGRADE_TYPE_MANUAL = 1;
    public fz7 A;
    public com.heytap.health.main.a.C0471a[] B;
    public m7k D;
    public int G;
    public tfb m;
    public TabLayout o;
    public long r;
    public SpaceView s;
    public at5 w;
    public AlertDialog x;
    public String[] y;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5981n = true;
    public int p = 0;
    public int q = -1;
    public final c t = new c();
    public final PermissionExplanation u = new PermissionExplanation();
    public final b v = new b();
    public boolean z = true ^ gpj.u();
    public long C = 0;
    public long E = 0;
    public boolean F = false;

    public class a implements TabLayout.OnTabSelectedListener {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            StringBuilder sb = new StringBuilder();
            sb.append("onTabReselected selected tab position:");
            sb.append(tab);
            int position = tab.getPosition();
            if (MainActivity.this.d8(position)) {
                BaseFragment baseFragmentC = MainActivity.this.A.c(MainActivity.this.B[position].d);
                if (baseFragmentC != null) {
                    baseFragmentC.Y();
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            View customView = tab.getCustomView();
            Objects.requireNonNull(customView);
            ((TextView) customView.findViewById(R.id.app_tv_main_tab)).setAlpha(0.9f);
            ((LottieWithoutOnSave) tab.getCustomView().findViewById(R.id.app_iv_main_tab)).playAnimation();
            int position = tab.getPosition();
            MainActivity.this.p = position;
            j7k.h(position);
            StringBuilder sb = new StringBuilder();
            sb.append("onTabSelected selected tab position:");
            sb.append(position);
            Bundle bundleN7 = MainActivity.this.N7();
            if (MainActivity.this.d8(position)) {
                MainActivity.this.H8(position, bundleN7);
            }
            MainActivity.this.A8(tab.getPosition());
            int iL7 = MainActivity.this.L7("com.heytap.health.device.tab.NewDeviceFragment");
            if (iL7 < 0 || position != iL7) {
                return;
            }
            fdg.x("health_share_preference_oobe").W("tab_device_has_clicked", true);
            tab.getCustomView().findViewById(R.id.device_red_dot_main_tab).setVisibility(8);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            ((TextView) tab.getCustomView().findViewById(R.id.app_tv_main_tab)).setAlpha(0.54f);
            LottieWithoutOnSave lottieWithoutOnSave = (LottieWithoutOnSave) tab.getCustomView().findViewById(R.id.app_iv_main_tab);
            lottieWithoutOnSave.setProgress(0.0f);
            lottieWithoutOnSave.cancelAnimation();
            if (MainActivity.this.x == null || !MainActivity.this.x.isShowing()) {
                return;
            }
            MainActivity.this.x.dismiss();
        }
    }

    public static class b extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            m8b.f("MainHomeCardFragment", "DeviceBindReceiver getAction:" + action);
            if (TextUtils.equals("pair_success_action", action)) {
                m8b.f("MainHomeCardFragment", "bind device success");
                fdg.x(o7k.STORE_TAB_NAME).W("KEY_ARCHIVES", false);
                gf9.e(true);
                gf9.g(false);
                KeepAliveSettingUtil.e0(1);
                return;
            }
            if (!TextUtils.equals("com.op.smartwear.native.unbind.UNBIND_DEVICE", action)) {
                m8b.f("MainHomeCardFragment", "DeviceBindReceiver action not match:" + action);
                return;
            }
            m8b.f("MainHomeCardFragment", "unbind device success");
            String stringExtra = intent.getStringExtra("msg_bt_address");
            StringBuilder sb = new StringBuilder();
            sb.append("receive mac adress:");
            sb.append(stringExtra);
            ((HomeDeviceFilterService) e1.d().h(HomeDeviceFilterService.class)).V9();
            gf9.e(false);
        }

        public b() {
        }
    }

    public static class c extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            m8b.f("MainActivity", "VersionUpgradeReceiver, receive upgrade action, action:" + action);
            if (!TextUtils.equals("action.upgrade.checked", action)) {
                m8b.f("MainActivity", "action not match");
                return;
            }
            m8b.f("MainActivity", "VersionUpgradeReceiver, upgradeType:" + intent.getIntExtra(hok.EXTRA_UPGRADE_TYPE, 1));
        }

        public c() {
        }
    }

    public static /* synthetic */ void e8() {
        if (fdg.w().r("flag_account_login_watch", false)) {
            m8b.f("MainActivity", "notify account login");
            Bundle bundle = new Bundle();
            bundle.putBoolean(AccountReceiver.FLAG_FROM_WATCH, true);
            zl9.a(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f8() {
        try {
            T7();
            fdg.w().W("has_launched", true);
            o5h.h(this);
            u8();
            if (z8()) {
                s8();
                ((IDeviceAccountService) e1.d().h(IDeviceAccountService.class)).A(this);
            }
            ((MenstrualService) e1.d().h(MenstrualService.class)).m8(this);
            StepService stepService = (StepService) e1.d().b("/sports/step").navigation();
            stepService.W2(-1);
            stepService.y4();
            long jCurrentTimeMillis = System.currentTimeMillis();
            he8.f();
            r8f.c();
            x8f.a();
            if (z8()) {
                if (o7k.f()) {
                    B8();
                }
                ((DeviceResDownlaodManagerApi) e1.d().b("/device_pair/DeviceResDownloadManagerImpl").navigation()).P9(wuf.b.INSTANCE).a(null);
                wl4.managerApi.disableTryConnect(false, "MainActivity init");
            }
            y9j.c().d();
            m8b.f("MainActivity", "Sync all when main activity on create");
            ((IDataSyncService) e1.d().h(IDataSyncService.class)).R8(5);
            ((IOperatorProvider) e1.d().h(IOperatorProvider.class)).d2();
            ((FunctionSwitch) e1.d().h(FunctionSwitch.class)).x9();
            ((CervicalSpineHistoryService) e1.d().b("/cervicalspine/CervicalSpineService").navigation()).C9();
            this.u.c(this);
            ((MenstrualService) e1.d().b("/menstrual/MenstrualService").navigation()).h6();
            ((InsightService) e1.d().h(InsightService.class)).z3(this);
            StringBuilder sb = new StringBuilder();
            sb.append("initInBackgroundDelay: cost time is ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            this.m.C();
            X7();
            SwitchStateUtil.c();
            ((HealthService) e1.d().h(HealthService.class)).C0();
        } catch (Exception e2) {
            m8b.c("MainActivity", "initInBackground error " + e2.getMessage(), e2);
        }
    }

    public static /* synthetic */ void g8() {
        boolean zX = cn.c().x();
        boolean zF = o7k.f();
        if (zX || !zF) {
            return;
        }
        o7k.t(false);
        o7k.r(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsetsCompat h8(ViewGroup viewGroup, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars());
        viewGroup.setPadding(0, 0, 0, 0);
        this.o.setPadding(0, 0, 0, insets.bottom + qmg.a(this, 8.0f));
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i8() {
        fdg.x("sport_debug_mode_sp").l();
        this.x = null;
        cn.b().onDestroy();
        G8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j8() {
        fdg.x("steps_calories_threshold").T("last_use_health_timestamp", System.currentTimeMillis());
        this.m.u();
        if (z8()) {
            this.m.w();
        }
    }

    public static /* synthetic */ void k8() {
        m8b.f("MainActivity", "Sync all when main activity on resume");
        ((IDataSyncService) e1.d().h(IDataSyncService.class)).R8(6);
    }

    public static /* synthetic */ void l8() {
        ((StepService) e1.d().b("/sports/step").navigation()).W2(-1);
    }

    public static /* synthetic */ void m8() {
        ((CardiovascularService) e1.d().b("/cardiovascular/CardiovascularService").navigation()).j9(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n8() {
        this.m.J();
        bu8.INSTANCE.a().k();
        o5h.h(this);
        StepService stepService = (StepService) e1.d().b("/sports/step").navigation();
        stepService.W2(-1);
        stepService.y4();
        he8.f();
        r8f.c();
        x8f.a();
        if (z8()) {
            B8();
            ((DeviceResDownlaodManagerApi) e1.d().b("/device_pair/DeviceResDownloadManagerImpl").navigation()).P9(wuf.b.INSTANCE).a(null);
        }
        vyj.o();
        ((IDataSyncService) e1.d().h(IDataSyncService.class)).R8(5);
        ((CervicalSpineHistoryService) e1.d().b("/cervicalspine/CervicalSpineService").navigation()).C9();
        ((MenstrualService) e1.d().b("/menstrual/MenstrualService").navigation()).h6();
        X7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o8(boolean z) {
        if (z) {
            return;
        }
        ((IMediaDownloadService) e1.d().b("/sports/media/download/service").navigation()).v9();
        ThreadUtils.doInBackground("MainLogin", new Runnable() { // from class: com.oplus.aiunit.vision.ffb
            @Override // java.lang.Runnable
            public final void run() {
                this.i.n8();
            }
        });
    }

    public final void A8(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("showTabSpace() called with: index = [");
        sb.append(i);
        sb.append("]");
        if (i < 0 || i >= this.y.length || System.currentTimeMillis() - this.C < 2000 || i == 0) {
            return;
        }
        int i2 = 2 << i;
        m8b.f("MainActivity", "showSpaceOnce: index is " + i + " flag is " + i2 + " hasShow is " + ((this.G & i2) == i2));
        Object[] objArr = this.y;
        String str = objArr[i];
        if (str.equals(objArr[0])) {
            return;
        }
        m8b.f("MainActivity", "SpaceView dialog, pageCode is " + str);
        this.m.y(str, this.s.getCardCode());
    }

    public final void B8() {
        ((IBpgService) e1.d().b("/device/BpgServiceImpl").navigation()).n4();
    }

    public final void C8(int i, View view) {
        int iL7 = L7("com.heytap.health.device.tab.NewDeviceFragment");
        if (iL7 >= 0 && i == iL7 && !fdg.x("health_share_preference_oobe").r("tab_device_has_clicked", false)) {
            COUIHintRedDot cOUIHintRedDot = (COUIHintRedDot) view.findViewById(R.id.device_red_dot_main_tab);
            cOUIHintRedDot.setPointMode(1);
            cOUIHintRedDot.setVisibility(0);
        }
    }

    public final void D8() {
        m7k m7kVar = new m7k() { // from class: com.oplus.aiunit.vision.hfb
            @Override // com.oplus.aiunit.vision.m7k
            public final void a(boolean z) {
                this.a.o8(z);
            }
        };
        this.D = m7kVar;
        k7k.INSTANCE.a(m7kVar);
    }

    public final void E8() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.t);
    }

    public final void F8() {
        m8b.f("MainActivity", "unregisterDeviceBindReceiver");
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.v);
    }

    public final void G8() {
        try {
            if (this.z) {
                E8();
            }
            ((MenstrualService) e1.d().h(MenstrualService.class)).f4(this);
            if (z8()) {
                ((IDeviceAccountService) e1.d().h(IDeviceAccountService.class)).n(this);
                F8();
            }
            this.u.d(this);
        } catch (IllegalArgumentException e2) {
            m8b.b("MainActivity", "unregisterReceivers error:" + e2.getMessage());
        }
    }

    @Override // com.heytap.health.base.base.BaseViewSizeControl
    public boolean H5() {
        return false;
    }

    public final void H8(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("updateTab():");
        sb.append(i);
        if (!d8(i)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateTab ignore invalid tab position:");
            sb2.append(i);
            return;
        }
        BaseFragment baseFragmentB = this.A.b(R.id.realtab_content, this.B[i].d);
        if (baseFragmentB == null) {
            return;
        }
        if (bundle != null && !baseFragmentB.isStateSaved()) {
            baseFragmentB.setArguments(bundle);
            if (baseFragmentB.isAdded()) {
                baseFragmentB.b0();
            }
        }
        this.A.g(baseFragmentB, this.B[i].d);
        int i2 = 0;
        while (true) {
            com.heytap.health.main.a.C0471a[] c0471aArr = this.B;
            if (i2 >= c0471aArr.length) {
                return;
            }
            BaseFragment baseFragmentC = this.A.c(c0471aArr[i2].d);
            if (baseFragmentC != null) {
                baseFragmentC.Z(baseFragmentB, i2);
            }
            i2++;
        }
    }

    public final void I7() {
        try {
            if (getIntent().getBooleanExtra("fromShort", false) && i7k.x()) {
                i7k.q();
            }
        } catch (Exception e2) {
            m8b.b("MainActivity", "checkTouristFromShort e:" + e2.getMessage());
        }
    }

    public final void J7() {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.ofb
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.e8();
            }
        }, 1500L);
    }

    public final void K7(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.removeExtra("unbind_mac");
        intent.removeExtra("from_oobe");
        intent.removeExtra("from_phone_setting");
        intent.removeExtra("currentMac");
    }

    public final int L7(String str) {
        int i = 0;
        while (true) {
            com.heytap.health.main.a.C0471a[] c0471aArr = this.B;
            if (i >= c0471aArr.length) {
                return -1;
            }
            if (c0471aArr[i].d.equalsIgnoreCase(str)) {
                return i;
            }
            i++;
        }
    }

    public final int M7() {
        return com.heytap.health.main.a.c();
    }

    public final Bundle N7() {
        Intent intent = getIntent();
        if (intent == null || !c8()) {
            return null;
        }
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("unbind_mac");
        boolean booleanExtra = intent.getBooleanExtra("from_oobe", false);
        boolean booleanExtra2 = intent.getBooleanExtra("from_phone_setting", false);
        String stringExtra2 = intent.getStringExtra("currentMac");
        try {
            String stringExtra3 = intent.getStringExtra(bjg.SUB_TAB);
            StringBuilder sb = new StringBuilder();
            sb.append("Intent subTab = ");
            sb.append(stringExtra3);
            if (stringExtra3 != null) {
                this.q = Integer.parseInt(stringExtra3);
            }
        } catch (Exception unused) {
            this.q = -1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" getFragmentBundle(),unbindedMac:");
        sb2.append(stringExtra);
        sb2.append(" isFromOOBE:");
        sb2.append(booleanExtra);
        if (stringExtra != null || booleanExtra || booleanExtra2 || !TextUtils.isEmpty(stringExtra2)) {
            bundle.putString("unbind_mac", stringExtra);
            bundle.putBoolean("from_oobe", booleanExtra);
            bundle.putBoolean("from_phone_setting", booleanExtra2);
            bundle.putString("currentMac", stringExtra2);
        }
        intent.putExtra("unbind_mac", "");
        intent.putExtra("from_oobe", false);
        intent.putExtra("currentMac", "");
        int i = this.q;
        if (i != -1) {
            bundle.putInt(bjg.SUB_TAB, i);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("INTENT subTab2 = ");
        sb3.append(this.q);
        return bundle;
    }

    public int O7() {
        return this.o.getSelectedTabPosition();
    }

    public final void P7() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("unbind_mac");
        String stringExtra2 = intent.getStringExtra("currentMac");
        boolean booleanExtra = intent.getBooleanExtra("from_oobe", false);
        boolean booleanExtra2 = intent.getBooleanExtra("from_phone_setting", false);
        StringBuilder sb = new StringBuilder();
        sb.append(" gotoExpectedTab(),unbindedMac:");
        sb.append(stringExtra);
        sb.append(" isFromOOBE:");
        sb.append(booleanExtra);
        sb.append(" isPhoneSetting:");
        sb.append(booleanExtra2);
        sb.append("  currMac:");
        sb.append(stringExtra2);
        if (stringExtra == null && !booleanExtra && !booleanExtra2 && TextUtils.isEmpty(stringExtra2)) {
            a8();
        } else if (!c8() || !S7()) {
            K7(intent);
            x8();
            v8(intent);
            return;
        } else {
            int iL7 = L7("com.heytap.health.device.tab.NewDeviceFragment");
            if (this.o.getSelectedTabPosition() != iL7) {
                this.o.getTabAt(iL7).select();
            } else {
                H8(iL7, N7());
            }
        }
        v8(intent);
    }

    public final void Q7(Intent intent) {
        tfb tfbVar = this.m;
        if (tfbVar != null) {
            tfbVar.v(intent);
        }
    }

    public final void R7(Intent intent) {
        int iL7 = L7("com.heytap.sports.home.SportsHomeFragment");
        if (iL7 >= 0) {
            new hmg().a(this, intent, this.o, iL7);
        }
    }

    public final boolean S7() {
        return d8(L7("com.heytap.health.device.tab.NewDeviceFragment"));
    }

    public final void T7() {
        StringBuilder sb = new StringBuilder();
        sb.append("initData thread is ");
        sb.append(ThreadUtils.getName());
        this.m.start();
        bu8.INSTANCE.a().k();
        qw4.g();
        this.m.b();
    }

    public final void U7() {
        at5 at5Var = new at5(new ys5(this, getWindow().getDecorView().getRootView(), this));
        this.w = at5Var;
        at5Var.k();
    }

    public final void V7() {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.efb
            @Override // java.lang.Runnable
            public final void run() {
                this.i.f8();
            }
        });
        q8();
        J7();
        cn.a().F6(this);
        cn.b();
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.gfb
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.g8();
            }
        }, 5000L);
    }

    public final void W7(Bundle bundle) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.C = System.currentTimeMillis();
        k6(this, 0);
        i5d.i(false);
        Z7(bundle);
        qs0.a();
        StringBuilder sb = new StringBuilder();
        sb.append("initInUiThread: cost time is ");
        sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
    }

    public final void X7() {
        if (o7k.h()) {
            bu8.INSTANCE.a().h().initPush(true);
        }
    }

    public final void Y7() {
        TabLayout tabLayout = (TabLayout) findViewById(R.id.app_main_tab);
        this.o = tabLayout;
        tabLayout.setSelectedTabIndicator((Drawable) null);
        final ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: com.oplus.aiunit.vision.nfb
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.i.h8(viewGroup, view, windowInsetsCompat);
            }
        });
        this.y = com.heytap.health.main.a.b(this);
        com.heytap.health.main.a.C0471a[] c0471aArr = this.B;
        for (int i = 0; i < c0471aArr.length; i++) {
            TabLayout.Tab tabNewTab = this.o.newTab();
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.app_main_tab_item, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R.id.app_tv_main_tab)).setText(c0471aArr[i].f5982c);
            LottieWithoutOnSave lottieWithoutOnSave = (LottieWithoutOnSave) viewInflate.findViewById(R.id.app_iv_main_tab);
            if0.G(lottieWithoutOnSave, false);
            lottieWithoutOnSave.setAnimation(if0.y(this) ? c0471aArr[i].b : c0471aArr[i].a);
            tabNewTab.setCustomView(viewInflate);
            C8(i, viewInflate);
            this.o.addTab(tabNewTab, false);
        }
        this.o.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
        StringBuilder sb = new StringBuilder();
        sb.append("[initTabLayout] Tab size is ");
        sb.append(this.o.getTabCount());
    }

    public final void Z7(Bundle bundle) {
        setContentView(R.layout.app_activity_main);
        this.m = new cgb(this);
        U7();
        this.s = (SpaceView) findViewById(R.id.space_shallow);
        this.A = new fz7(getSupportFragmentManager());
        for (com.heytap.health.main.a.C0471a c0471a : this.B) {
            fz7 fz7Var = this.A;
            fz7Var.d(fz7Var.c(c0471a.d));
        }
        Y7();
        if (bundle != null) {
            int iL7 = L7(bundle.getString("tag_fragment", "com.heytap.health.home.HomeFragment"));
            if (iL7 >= this.o.getTabCount() || iL7 < 0) {
                x8();
            } else {
                this.o.getTabAt(iL7).select();
            }
            m8b.f("MainActivity", "[initView] current tab position is " + iL7);
        } else {
            P7();
        }
        if (i7k.x()) {
            return;
        }
        ((IMediaDownloadService) e1.d().b("/sports/media/download/service").navigation()).v9();
    }

    public final void a8() {
        int i;
        this.p = M7();
        try {
            String stringExtra = getIntent().getStringExtra("tab");
            String stringExtra2 = getIntent().getStringExtra(bjg.SUB_TAB);
            StringBuilder sb = new StringBuilder();
            sb.append("[getIntent] tab = ");
            sb.append(stringExtra);
            sb.append(",subTab = ");
            sb.append(stringExtra2);
            if (stringExtra != null) {
                int iL7 = L7(com.heytap.health.main.a.MAIN_MAPPING_ARRAY[Integer.parseInt(stringExtra)]);
                if (iL7 >= 0) {
                    this.p = iL7;
                } else {
                    this.p = 0;
                }
            }
            if (stringExtra2 != null) {
                this.q = Integer.parseInt(stringExtra2);
            }
        } catch (Exception unused) {
            this.p = 0;
            this.q = -1;
        }
        if (!d8(this.p)) {
            this.p = 0;
        }
        if (d8(this.p)) {
            this.o.getTabAt(this.p).select();
        } else {
            x8();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[intentTab] tab = ");
        sb2.append(this.p);
        sb2.append(",subTab = ");
        sb2.append(this.q);
        int iL8 = L7("com.heytap.sports.home.SportsHomeFragment");
        if (iL8 >= 0 && (i = this.p) == iL8 && this.q != -1) {
            BaseFragment baseFragmentC = this.A.c(this.B[i].d);
            Bundle bundle = new Bundle();
            bundle.putInt(bjg.SUB_TAB, this.q);
            boolean zIsStateSaved = getSupportFragmentManager().isStateSaved();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[intentTab] subtab = ");
            sb3.append(this.q);
            sb3.append(" fragment is ");
            sb3.append(baseFragmentC);
            sb3.append(" isStateSaved is ");
            sb3.append(zIsStateSaved);
            if (baseFragmentC != null && !zIsStateSaved) {
                this.q = -1;
                baseFragmentC.setArguments(bundle);
                m8b.b("MainActivity", "[intentTab] Fragment already added and state has been saved");
            }
        }
        getIntent().removeExtra("tab");
        getIntent().removeExtra(bjg.SUB_TAB);
    }

    public final void b8(Intent intent) {
        if (dfa.a(intent, AccountReceiver.FLAG_FROM_WATCH, false) && dfa.a(intent, AccountReceiver.WATCH_LOGIN_EVENT, false)) {
            zl9.a(intent.getExtras());
            intent.removeExtra(AccountReceiver.WATCH_LOGIN_EVENT);
        }
        if (dfa.a(intent, "flag_watch_login_ticket", false)) {
            ((IDeviceAccountService) e1.d().b("/device_data_sync/DeviceAccountServiceImpl").navigation()).pa();
            intent.removeExtra("flag_watch_login_ticket");
        }
    }

    public final boolean c8() {
        return u5e.c(this);
    }

    public final boolean d8(int i) {
        return i >= 0 && i < this.B.length && i < this.o.getTabCount();
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.oplus.aiunit.vision.oz0
    public boolean m1() {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        int selectedTabPosition = this.o.getSelectedTabPosition();
        BaseFragment baseFragmentC = d8(selectedTabPosition) ? this.A.c(this.B[selectedTabPosition].d) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult meFragment is ");
        sb.append(baseFragmentC);
        sb.append(" resultCode is ");
        sb.append(i2);
        sb.append(" requestCode is ");
        sb.append(i);
        if (baseFragmentC != null) {
            baseFragmentC.onActivityResult(i, i2, intent);
        }
        at5 at5Var = this.w;
        if (at5Var != null) {
            at5Var.i(i, i2, intent);
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        moveTaskToBack(true);
        w3();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m8b.f("MainActivity", "onConfigurationChanged");
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f5981n = true;
        if (getIntent().getBooleanExtra(EXTRA_FROM_INTERNAL, true)) {
            overridePendingTransition(R.anim.coui_fade_in_fast, 0);
        }
        ActivityTransitionUtil.INSTANCE.f(this);
        super.onCreate(bundle);
        q5d.INSTANCE.a(this, true);
        p8();
        W7(bundle);
        w8();
        V7();
        I7();
        R7(getIntent());
        b8(getIntent());
        Q7(getIntent());
        getWindow().setNavigationBarColor(getColor(R.color.lib_base_colorWhite));
        D8();
        this.E = System.currentTimeMillis();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.ifb
            @Override // java.lang.Runnable
            public final void run() {
                this.i.i8();
            }
        });
        super.onDestroy();
        this.m.onDestroy();
        this.w.g();
        k7k.INSTANCE.b(this.D);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            setIntent(intent);
            P7();
            R7(intent);
            b8(intent);
            Q7(intent);
        }
        I7();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        m8b.f("MainActivity", "onRestart() localNightMode " + getDelegate().getLocalNightMode());
        xl9.g().f();
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        m8b.f("MainActivity", "onRestoreInstanceState,not need to request permission");
        this.F = true;
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.jfb
            @Override // java.lang.Runnable
            public final void run() {
                this.i.j8();
            }
        });
        if (!this.f5981n) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.r;
            long j3 = jCurrentTimeMillis - j2;
            if (j2 != 0 && j3 >= 300000) {
                ((HearingService) e1.d().b("/hearing/HearingService").navigation()).Wa();
                ((CervicalSpineHistoryService) e1.d().b("/cervicalspine/CervicalSpineService").navigation()).C9();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j4 = this.E;
            long j5 = jCurrentTimeMillis2 - j4;
            if (j4 != 0 && j5 >= 300000) {
                this.E = System.currentTimeMillis();
                ThreadUtils.doInBackground("DataSync", new Runnable() { // from class: com.oplus.aiunit.vision.kfb
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.k8();
                    }
                });
            }
        }
        this.f5981n = false;
        if (!gpj.A()) {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.lfb
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.l8();
                }
            }, 1000L);
        }
        i7k.v(this, HomeFragment.TAG);
        if (z8()) {
            ((OTAUpgradeService) e1.d().b("/deviceota/OTAUpgradeServiceImpl").navigation()).n3();
        }
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.mfb
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.m8();
            }
        });
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        int selectedTabPosition = this.o.getSelectedTabPosition();
        if (d8(selectedTabPosition)) {
            String str = this.B[selectedTabPosition].d;
            bundle.putString("tag_fragment", str);
            m8b.f("MainActivity", "onSaveInstanceState fragment=" + str);
        } else {
            bundle.putString("tag_fragment", "com.heytap.health.home.HomeFragment");
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (wp.n().p() == this) {
            this.r = System.currentTimeMillis();
        } else {
            this.r = 0L;
        }
    }

    public final void p8() {
        this.B = new com.heytap.health.main.a().a(this);
    }

    public final void q8() {
        if (!this.F) {
            this.F = true;
        }
        this.m.p();
    }

    public void r8(Map<String, List<SpaceInfo>> map) {
        if (t8i.a(map, this.s.getCardCode())) {
            this.G = (2 << O7()) | this.G;
            this.s.setData(map);
            nz9 spaceViewRender = this.s.getSpaceViewRender();
            if (spaceViewRender instanceof xs5) {
                this.x = ((xs5) spaceViewRender).e();
                zs5.f(System.currentTimeMillis());
            }
        }
    }

    public final void s8() {
        m8b.f("MainActivity", "registerDeviceBindReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("pair_success_action");
        intentFilter.addAction("com.op.smartwear.native.unbind.UNBIND_DEVICE");
        LocalBroadcastManager.getInstance(this).registerReceiver(this.v, intentFilter);
    }

    public void t8(boolean z) {
        if (z) {
            u8();
        }
        this.z = z;
    }

    public final void u8() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action.upgrade.checked");
        LocalBroadcastManager.getInstance(this).registerReceiver(this.t, intentFilter);
    }

    public final void v8(Intent intent) {
        String strK = dfa.k(intent, "visitFrom");
        if (strK != null) {
            NxTrackHelper.Q(com.heytap.health.base.track.a.h("visitFrom", strK));
        }
    }

    public final void w8() {
        new SafetyCheckManager().d(this);
    }

    public final void x8() {
        if (d8(0)) {
            this.o.getTabAt(0).select();
        }
    }

    public void y8(tfb tfbVar) {
        this.m = tfbVar;
    }

    public final boolean z8() {
        return c8();
    }
}