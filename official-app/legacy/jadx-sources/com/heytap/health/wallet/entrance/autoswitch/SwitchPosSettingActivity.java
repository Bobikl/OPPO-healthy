package com.heytap.health.wallet.entrance.autoswitch;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.amap.api.services.help.Tip;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.base.R$id;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.wallet.BaseActivityEx;
import com.heytap.health.wallet.bean.Location;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.entrance.R$string;
import com.heytap.health.wallet.entrance.autoswitch.adapter.SwitchPositionAdapter;
import com.heytap.health.wallet.network.door.params.SwipeCardLocationVO;
import com.heytap.health.wallet.network.door.rsp.SwipeCardLocationsSettingRspVO;
import com.heytap.health.wallet.widget.CircleNetworkImageView;
import com.heytap.health.wallet.widget.RecyclerViewSpacesItemDecoration;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.drk;
import com.oplus.aiunit.vision.f58;
import com.oplus.aiunit.vision.ie7;
import com.oplus.aiunit.vision.ifb;
import com.oplus.aiunit.vision.ihg;
import com.oplus.aiunit.vision.j1l;
import com.oplus.aiunit.vision.j7l;
import com.oplus.aiunit.vision.l5j;
import com.oplus.aiunit.vision.pfb;
import com.oplus.aiunit.vision.qjd;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.smc;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.v13;
import com.oplus.aiunit.vision.x81;
import com.oplus.aiunit.vision.xsc;
import com.oplus.aiunit.vision.yu5;
import com.oplus.aiunit.vision.z0k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/switch/cardPosSetting")
public class SwitchPosSettingActivity extends BaseActivityEx {
    public static final int LOCATION_PERMISSION_REQUEST_CODE = 10010;
    public static final int MAX_POSITION_NUM = 5;

    @Autowired(name = "cardImg")
    public String A;

    @Autowired(name = "CARD_NAME")
    public String B;

    @Autowired(name = "aid")
    public String C;

    @Autowired(name = "appCode")
    public String D;

    @Autowired(name = "bean")
    public ArrayList<SwipeCardLocationVO> E;

    @Autowired(name = "from")
    public String F;
    public String G;
    public boolean H;
    public ifb I;
    public ie7<SwipeCardLocationsSettingRspVO> J = new g();
    public HealthButton t;
    public HealthButton u;
    public TextView v;
    public RecyclerView w;
    public View x;
    public CircleNetworkImageView y;
    public SwitchPositionAdapter z;

    public class a implements SwitchPositionAdapter.b {
        public a() {
        }

        @Override // com.heytap.health.wallet.entrance.autoswitch.adapter.SwitchPositionAdapter.b
        public void a(int i) {
            if (!drk.e(SwitchPosSettingActivity.this.E) && SwitchPosSettingActivity.this.E.size() > i) {
                SwitchPosSettingActivity.this.E.remove(i);
                SwitchPosSettingActivity.this.z.h(SwitchPosSettingActivity.this.E);
            }
            SwitchPosSettingActivity.this.j8(false);
        }
    }

    public class b extends xsc {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(View view) {
        }
    }

    public class c extends xsc {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(View view) {
            t6b.b("SwitchPosSetting", "setOnClickListener");
            SwitchPosSettingActivity.this.k8();
        }
    }

    public class d extends xsc {
        public d() {
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(View view) {
            if (drk.e(SwitchPosSettingActivity.this.E) || SwitchPosSettingActivity.this.E.size() < 5) {
                if (SwitchPosSettingActivity.this.M7(b78.a())) {
                    SwitchPosSettingActivity.this.f8();
                } else {
                    SwitchPosSettingActivity.this.i8(R$string.card_setting_open_gps_title, R$string.card_setting_open_gps_card_msg, 0);
                }
            }
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public final /* synthetic */ int i;

        public e(int i) {
            this.i = i;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (i == -1) {
                SwitchPosSettingActivity switchPosSettingActivity = SwitchPosSettingActivity.this;
                switchPosSettingActivity.h8(switchPosSettingActivity, this.i);
            }
        }
    }

    public class f implements PermissionRequestDialog.d {
        public f() {
        }

        @Override // com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog.d
        public void Y1() {
            t6b.i("SwitchPosSetting", "location onGranted");
            SwitchPosSettingActivity.this.d8();
        }

        @Override // com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog.d
        public void Z5() {
            t6b.b("SwitchPosSetting", "permission nag click!");
        }
    }

    public class g extends ie7<SwipeCardLocationsSettingRspVO> {
        public g() {
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NonNull String str, @NonNull String str2) {
            SwitchPosSettingActivity.this.m7();
            t6b.f("SwitchPosSetting", "update door locations list fail = " + str2);
            z0k.f(b78.a()).q(str2);
            if (SwitchPosSettingActivity.this.H) {
                return;
            }
            SwitchPosSettingActivity.this.P7();
        }

        @Override // com.oplus.aiunit.vision.ie7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(SwipeCardLocationsSettingRspVO swipeCardLocationsSettingRspVO) {
            SwitchPosSettingActivity.this.m7();
            if (swipeCardLocationsSettingRspVO == null || !swipeCardLocationsSettingRspVO.getResult().booleanValue()) {
                return;
            }
            t6b.f("SwitchPosSetting", "update door locations list success");
            String str = SwitchPosSettingActivity.this.G;
            SwitchPosSettingActivity switchPosSettingActivity = SwitchPosSettingActivity.this;
            l5j.m(str, switchPosSettingActivity.D, switchPosSettingActivity.C, switchPosSettingActivity.E, swipeCardLocationsSettingRspVO.getUpdateTimestamp());
            if (SwitchPosSettingActivity.this.H) {
                SwitchPosSettingActivity.this.N7();
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("bean", SwitchPosSettingActivity.this.E);
            SwitchPosSettingActivity.this.setResult(-1, intent);
            SwitchPosSettingActivity.this.P7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y7() {
        this.z.h(this.E);
        j8(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z7(List list) {
        ArrayList<SwipeCardLocationVO> arrayList = new ArrayList<>();
        this.E = arrayList;
        arrayList.addAll(list);
        t6b.b("SwitchPosSetting", "loadData mSwitchLocations = " + this.E);
        this.w.post(new Runnable() { // from class: com.oplus.aiunit.vision.n6j
            @Override // java.lang.Runnable
            public final void run() {
                this.i.Y7();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a8() {
        this.E = new ArrayList<>();
        c8(getIntent());
        t6b.b("SwitchPosSetting", "loadData mIsOpenNewCard = " + this.E);
    }

    public final boolean M7(Context context) {
        return ((LocationManager) context.getSystemService("location")).isProviderEnabled(f58.GPS);
    }

    public final void N7() {
        ihg.a().f("KEY_ACTION", "add").f("KEY_APP_CODE", this.D).f("KEY_CARD_AID", this.C).f("KEY_CARD_AID", this.C).f("CARD_TYPE", "3").f("from", "").b(this, "/entrance/detail");
        P7();
    }

    public final String O7(int i) {
        try {
            return smc.a(this.E.get(i).getLocation(), smc.e(this.G), this.G.substring(52, 68));
        } catch (Exception e2) {
            t6b.c(e2.getLocalizedMessage());
            return null;
        }
    }

    public final void P7() {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    public final void Q7(FragmentActivity fragmentActivity, int i) {
        x81.e(fragmentActivity, "/switch/cardPosMap", new Bundle(), i);
    }

    public final void R7(TextView textView) {
        textView.setText(R$string.bus_add_location);
        textView.setOnClickListener(new d());
        t6b.b("SwitchPosSetting", "isShowAdd = " + X7());
        g8(textView, X7());
    }

    public final void S7() {
        pfb.e();
        this.G = aec.o();
        this.I = new ifb(qz0.mContext);
        if (getIntent() != null) {
            this.A = getIntent().getStringExtra("cardImg");
            this.B = getIntent().getStringExtra("CARD_NAME");
            this.C = getIntent().getStringExtra("aid");
            this.D = getIntent().getStringExtra("appCode");
            this.E = (ArrayList) getIntent().getSerializableExtra("bean");
            this.H = getIntent().getBooleanExtra("EXTRA_ENTRANCE_CARD_FLG", false);
        }
        t6b.b("SwitchPosSetting", "initData mCardName = " + this.B + "mCardImg = " + this.A + "mIsOpenNewCard = " + this.H + "mSwitchLocations " + this.E);
        this.y.setImageUrl(this.A);
        W7();
        this.z.i(aec.i());
        b8();
    }

    public final void T7() {
        this.z.setOnDeleteListener(new a());
        j8(true);
    }

    public final void U7(TextView textView) {
        textView.setText(com.oppo.lib.common.R$string.complete);
        textView.setOnClickListener(new b());
    }

    public final void V7(HealthButton healthButton, boolean z) {
        healthButton.setText(R$string.finish);
        healthButton.setOnClickListener(new c());
        if (drk.e(this.E) && z) {
            j1l.a(this.t);
        } else {
            j1l.b(this.t);
        }
    }

    public final void W7() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        this.f6122n = cOUIToolbar;
        cOUIToolbar.setTitle(R$string.entrance_add_location_title);
        f7(this.f6122n, true);
    }

    public final boolean X7() {
        return drk.e(this.E) || this.E.size() < 5;
    }

    public final void b8() {
        t6b.b("SwitchPosSetting", "loadData mIsOpenNewCard = " + this.H + "mSwitchLocations = " + this.E);
        if (this.H) {
            this.w.post(new Runnable() { // from class: com.oplus.aiunit.vision.m6j
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.a8();
                }
            });
        } else {
            l5j.j(aec.i(), this.D, this.C, new qjd() { // from class: com.oplus.aiunit.vision.l6j
                @Override // com.oplus.aiunit.vision.qjd
                public final void callback(Object obj) {
                    this.a.Z7((List) obj);
                }
            });
        }
    }

    public final void c8(@NonNull Intent intent) {
        Tip tip = (Tip) intent.getParcelableExtra("bean");
        t6b.i("SwitchPosSetting", "location onPosMapResult poiInfo = " + tip);
        String stringExtra = intent.getStringExtra("cityCode");
        if (tip == null || TextUtils.isEmpty(tip.getAddress())) {
            return;
        }
        SwipeCardLocationVO swipeCardLocationVO = new SwipeCardLocationVO();
        Location location = new Location();
        location.setAddress(tip.getAddress());
        location.setCityCode(stringExtra);
        if (tip.getPoint() == null) {
            t6b.i("SwitchPosSetting", "no latitude or longitude，ignore this position");
            return;
        }
        location.setLatitude(tip.getPoint().getLatitude() + "");
        location.setLongitude(tip.getPoint().getLongitude() + "");
        location.setShowName(tip.getName());
        location.setTimestamp(Long.valueOf(System.currentTimeMillis()));
        swipeCardLocationVO.setLocation(v13.b(this.G, new Gson().toJson(location)));
        e8(tip, swipeCardLocationVO, drk.e(this.E));
    }

    public final void d8() {
        t6b.b("SwitchPosSetting", "openSelectSwipeCardAddress");
        Q7(this, 1);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    public final void e8(Tip tip, SwipeCardLocationVO swipeCardLocationVO, boolean z) {
        boolean z2;
        Location location;
        if (!z) {
            int i = 0;
            while (true) {
                if (i < this.E.size()) {
                    if (this.E.get(i) != null && this.E.get(i).getLocation() != null) {
                        String strO7 = O7(i);
                        if (!TextUtils.isEmpty(strO7) && (location = (Location) new Gson().fromJson(strO7, new TypeToken<Location>() { // from class: com.heytap.health.wallet.entrance.autoswitch.SwitchPosSettingActivity.8
                        }.getType())) != null && !TextUtils.isEmpty(location.getLatitude()) && !TextUtils.isEmpty(location.getLongitude())) {
                            if (location.getLatitude().equalsIgnoreCase(tip.getPoint().getLatitude() + "")) {
                                if (location.getLongitude().equalsIgnoreCase(tip.getPoint().getLongitude() + "")) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i++;
                }
            }
            if (z2) {
            }
            this.E.add(swipeCardLocationVO);
            this.z.h(this.E);
            j8(false);
        }
        this.E = new ArrayList<>();
        z2 = false;
        if (z2) {
            this.E.add(swipeCardLocationVO);
            this.z.h(this.E);
            j8(false);
        }
    }

    public final void f8() {
        new PermissionRequestDialog.b(this, 18).t(new String[]{"android.permission.ACCESS_FINE_LOCATION"}).r(new f()).x();
    }

    public final void g8(TextView textView, boolean z) {
        textView.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c A[Catch: ActivityNotFoundException -> 0x0020, TRY_LEAVE, TryCatch #1 {ActivityNotFoundException -> 0x0020, blocks: (B:4:0x0011, B:6:0x0015, B:7:0x001c), top: B:18:0x0011 }] */
    public final void h8(Context context, int i) {
        Intent intent = new Intent();
        intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.addFlags(268435456);
        if (i > 0) {
            try {
                if (context instanceof Activity) {
                    ((Activity) context).startActivityForResult(intent, i);
                } else {
                    context.startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                intent.setAction("android.settings.SETTINGS");
                try {
                    context.startActivity(intent);
                } catch (Exception e2) {
                    t6b.b("SwitchPosSetting", "e = " + e2.getMessage());
                }
            }
        } else {
            context.startActivity(intent);
        }
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void i8(int i, int i2, int i3) {
        e eVar = new e(i3);
        new HealthAlertDialogBuilder(this).setTitle(i).setMessage(i2).setPositiveButton(com.oppo.lib.common.R$string.go_to_set, eVar).setNegativeButton(R$string.cancel, eVar).show();
    }

    public final void initView() {
        this.x = findViewById(com.heytap.health.wallet.entrance.R$id.ll_root);
        this.y = (CircleNetworkImageView) findViewById(com.heytap.health.wallet.entrance.R$id.themeImgLayout);
        this.u = (HealthButton) findViewById(com.heytap.health.wallet.entrance.R$id.tvSkip);
        this.v = (TextView) findViewById(com.heytap.health.wallet.entrance.R$id.tvTip);
        this.t = (HealthButton) findViewById(com.heytap.health.wallet.entrance.R$id.btnNext);
        RecyclerView recyclerView = (RecyclerView) findViewById(com.heytap.health.wallet.entrance.R$id.rv_list);
        this.w = recyclerView;
        recyclerView.hasFixedSize();
        this.w.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.z = new SwitchPositionAdapter(this);
        this.w.addItemDecoration(new RecyclerViewSpacesItemDecoration(0, 0, 0, yu5.a(b78.a(), 12.0f)));
        this.w.setAdapter(this.z);
        j7l.z();
        this.v.setText(getResources().getString(R$string.bus_switch_pos_tip, 5));
    }

    public final void j8(boolean z) {
        t6b.b("SwitchPosSetting", "updateBtnListener = " + z + "mIsOpenNewCard = " + this.H + "mSwitchLocations = " + this.E);
        if (!this.H) {
            V7(this.t, z);
            R7(this.u);
        } else if (drk.e(this.E)) {
            R7(this.t);
            U7(this.u);
        } else {
            V7(this.t, false);
            R7(this.u);
        }
    }

    public final void k8() {
        A();
        l5j.r(this.G, this.D, this.E, this.J);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent == null || i2 != -1) {
            return;
        }
        c8(intent);
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        P7();
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_switch_pos_setting);
        initView();
        S7();
        T7();
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
