package com.heytap.health.wallet.entrance.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.entrance.R$string;
import com.heytap.health.wallet.location.LocationInfoEntity;
import com.heytap.health.wallet.model.NfcCardDetail;
import com.heytap.health.wallet.network.door.params.ActiveSmartCardParam;
import com.heytap.health.wallet.network.door.rsp.CardDetail;
import com.heytap.health.wallet.router.WatchCardsUpdateService;
import com.heytap.wallet.business.common.util.CmdExecUtils;
import com.heytap.wallet.business.entrance.domain.req.AddressInfo;
import com.oplus.aiunit.vision.a3b;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.ao6;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.e7l;
import com.oplus.aiunit.vision.eq;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.fkj;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ie7;
import com.oplus.aiunit.vision.ifb;
import com.oplus.aiunit.vision.ihg;
import com.oplus.aiunit.vision.k06;
import com.oplus.aiunit.vision.q5b;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.smc;
import com.oplus.aiunit.vision.sr6;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.v13;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.y6l;
import com.oplus.aiunit.vision.ydc;
import com.oplus.aiunit.vision.z0k;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/entrance/active")
public class EntranceActiveActivity extends EntranceBaseActivity {
    public static final String KEY_ACTION = "KEY_ACTION";
    public static final String KEY_APP_CODE = "KEY_APP_CODE";
    public static final String KEY_CARD_AID = "KEY_CARD_AID";
    public TextView A;
    public WeakReference<EntranceActiveActivity> B;
    public ie7<Boolean> C;

    @Autowired(name = "KEY_APP_CODE")
    public String u;

    @Autowired(name = "KEY_CARD_AID")
    public String v;

    @Autowired(name = "KEY_ACTION")
    public String w;

    @Autowired(name = "CARD_TYPE")
    public String x;
    public COUIToolbar y;
    public HealthButton z;

    public class a implements PermissionRequestDialog.d {
        public a() {
        }

        @Override // com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog.d
        public void Y1() {
            EntranceActiveActivity.this.S7();
        }

        @Override // com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog.d
        public void Z5() {
            t6b.b(EntranceActiveActivity.this.s, "permission nag click!");
        }
    }

    public class b implements ifb.b {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ifb.b
        public void a(LocationInfoEntity locationInfoEntity) {
            if (locationInfoEntity == null) {
                EntranceActiveActivity.this.m7();
                t6b.b(EntranceActiveActivity.this.s, "Location is null ");
                Context context = qz0.mContext;
                z0k.f(context).t(context, EntranceActiveActivity.this.getResources().getString(R$string.entrance_get_location_error));
                return;
            }
            String strC = "";
            String strE = GsonUtil.e(new AddressInfo(String.valueOf(locationInfoEntity.getLongitude()), String.valueOf(locationInfoEntity.getLatitude()), "", ""));
            t6b.b(EntranceActiveActivity.this.s, "addressInfo toJson: " + strE);
            try {
                strC = smc.c(strE, smc.e(aec.o()), aec.o().substring(52, 68));
            } catch (Exception e2) {
                t6b.d(EntranceActiveActivity.this.s, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
            ((k06) e7l.INSTANCE.a(k06.class)).h(new ActiveSmartCardParam(strC, EntranceActiveActivity.this.u, aec.o())).L0(su8.c()).n0(f30.c()).subscribe(EntranceActiveActivity.this.C);
        }
    }

    public class c extends ie7<Boolean> {

        public class a extends ie7<CardDetail> {
            public a() {
            }

            @Override // com.oplus.aiunit.vision.ie7
            public void a(@NonNull String str, @NonNull String str2) {
                t6b.d(EntranceActiveActivity.this.s, "getDetail onReqFail, code: " + str + " msg" + str2);
                EntranceActiveActivity.this.m7();
            }

            @Override // com.oplus.aiunit.vision.ie7
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void c(CardDetail cardDetail) {
                String cardName;
                String cardUrl;
                EntranceActiveActivity.this.m7();
                if (cardDetail != null) {
                    cardName = cardDetail.getCardName();
                    cardUrl = cardDetail.getCardUrl();
                } else {
                    cardName = "";
                    cardUrl = "";
                }
                v13.m(EntranceActiveActivity.this.v, cardUrl);
                NfcCardDetail nfcCardDetail = new NfcCardDetail();
                nfcCardDetail.setAppCode(EntranceActiveActivity.this.u);
                nfcCardDetail.setAid(EntranceActiveActivity.this.v);
                nfcCardDetail.setCardName(cardName);
                nfcCardDetail.setIsDefault(true);
                ydc.n().s(nfcCardDetail, false, "6");
            }
        }

        public c() {
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NonNull String str, @NonNull String str2) {
            t6b.b(EntranceActiveActivity.this.s, "activeCallBack onReqFail =  " + str2);
            EntranceActiveActivity.this.m7();
            Context context = qz0.mContext;
            z0k.f(context).t(context, str2);
        }

        public final void d() {
            if (!y6l.a(gl4.managerApi.getCurrentConnectId()).v()) {
                t6b.b(EntranceActiveActivity.this.s, "noticeSysNfcAddCard not support");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("from", "wear");
            fkj.d().g(b78.a(), "6", EntranceActiveActivity.this.v, "add", bundle);
        }

        @Override // com.oplus.aiunit.vision.ie7
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(Boolean bool) {
            if (bool.booleanValue()) {
                Context context = qz0.mContext;
                z0k.f(context).t(context, EntranceActiveActivity.this.getResources().getString(com.oppo.lib.common.R$string.wallet_access_card_actice_suc));
                g();
                CmdExecUtils.e(1, EntranceActiveActivity.this.v);
                EntranceActiveActivity.this.P7();
                f(EntranceActiveActivity.this.v);
                d();
                EntranceActiveActivity.this.O7(true);
            }
        }

        public final void f(String str) {
            ((WatchCardsUpdateService) x0.d().b("/main/watchCardsUpdate").navigation()).Ia(str);
        }

        public final void g() {
            new eq(EntranceActiveActivity.this.B.get()).c(EntranceActiveActivity.this.u, aec.o(), new a());
        }
    }

    public EntranceActiveActivity() {
        super(R$layout.layout_card_active);
        this.C = new c();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void A7() {
        B7(this.z);
        B7(this.A);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void C7() {
    }

    public final void G7() {
        ao6 ao6Var = new ao6();
        ao6Var.d(ao6.REVISE_CARD_DETAIL);
        sr6.c().l(ao6Var);
    }

    public final void O7(boolean z) {
        G7();
        R7(z);
    }

    public final void P7() {
        t6b.b(this.s, "OpenAndActive setDefault");
        ((WatchCardsUpdateService) x0.d().b("/main/watchCardsUpdate").navigation()).A8(this.v);
    }

    public final void Q7() {
        if (q5b.a(qz0.mContext)) {
            new PermissionRequestDialog.b(this, 18).t(new String[]{"android.permission.ACCESS_FINE_LOCATION"}).r(new a()).x();
        } else {
            a3b.b(this);
        }
    }

    public final void R7(boolean z) {
        boolean zV = y6l.a(gl4.managerApi.getCurrentConnectId()).v();
        if (z && zV) {
            ihg.a().f("KEY_ACTION", "add").f("KEY_APP_CODE", this.u).f("KEY_CARD_AID", this.v).f("CARD_TYPE", "3").f("from", "").b(this.B.get(), "/entrance/entranceOpenSuc");
        } else {
            ihg.a().f("KEY_ACTION", "add").f("KEY_APP_CODE", this.u).f("KEY_CARD_AID", this.v).f("CARD_TYPE", "3").f("from", "").b(this, "/entrance/detail");
        }
        finish();
    }

    public final void S7() {
        s7(R$string.activiating);
        Context context = qz0.mContext;
        ifb ifbVar = new ifb(context);
        ifbVar.f(new b());
        ifbVar.h(context);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.activeCard) {
            Q7();
        } else if (view.getId() == R$id.notActiveCard) {
            O7(false);
        }
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.B = new WeakReference<>(this);
        t6b.b(this.s, "Enter onCreate");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void openOptionsMenu() {
        super.openOptionsMenu();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void y7() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(com.heytap.health.base.R$id.lib_base_toolbar);
        this.y = cOUIToolbar;
        cOUIToolbar.setVisibility(8);
        this.z = (HealthButton) findViewById(R$id.activeCard);
        this.A = (TextView) findViewById(R$id.notActiveCard);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void z7() {
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        try {
            this.u = intent.getStringExtra("KEY_APP_CODE");
            this.v = intent.getStringExtra("KEY_CARD_AID");
            this.w = intent.getStringExtra("KEY_ACTION");
            this.x = intent.getStringExtra("CARD_TYPE");
        } catch (Exception e2) {
            t6b.d(this.s, "initData, intent handle exception: " + e2.getMessage());
        }
    }
}
