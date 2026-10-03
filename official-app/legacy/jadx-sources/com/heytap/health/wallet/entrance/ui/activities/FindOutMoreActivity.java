package com.heytap.health.wallet.entrance.ui.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.wallet.BaseActivity;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.network.door.rsp.CheckConditionParam;
import com.heytap.health.wallet.network.door.rsp.ConditionCheckVo;
import com.heytap.wallet.business.entrance.router.EntranceOperateService;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.cr;
import com.oplus.aiunit.vision.e1j;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ie7;
import com.oplus.aiunit.vision.j7l;
import com.oplus.aiunit.vision.k6l;
import com.oplus.aiunit.vision.k7l;
import com.oplus.aiunit.vision.lfg;
import com.oplus.aiunit.vision.ls5;
import com.oplus.aiunit.vision.lsc;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.suc;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.xsc;
import com.oplus.aiunit.vision.y6l;
import com.oplus.aiunit.vision.z0k;
import com.oplus.aiunit.vision.zp;
import com.oppo.lib.common.R$string;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/entrance/findOutMore")
public class FindOutMoreActivity extends EntranceLoadingWebActivity {

    @Autowired(name = "url")
    public String A;

    @Autowired(name = "USER_RIGHT")
    public String B;
    public View C;
    public HealthButton D;
    public BaseActivity E;
    public LinearLayout F;
    public TextView G;
    public COUICheckBox H;
    public cr I;
    public zp J;

    @Autowired(name = "appCode")
    public String y;

    @Autowired(name = "TYPE")
    public String z;

    public class a extends ie7<ConditionCheckVo> {

        /* JADX INFO: renamed from: com.heytap.health.wallet.entrance.ui.activities.FindOutMoreActivity$a$a, reason: collision with other inner class name */
        public class C0675a implements suc<String, Integer, String, Integer, String> {
            public C0675a() {
            }

            @Override // com.oplus.aiunit.vision.suc
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(Integer num, String str) {
                FindOutMoreActivity.this.u7(str + "[" + num + "]");
            }

            @Override // com.oplus.aiunit.vision.suc
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                if ("SUC" == str) {
                    return;
                }
                FindOutMoreActivity.this.finish();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                FindOutMoreActivity.this.finish();
            }
        }

        public a() {
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NonNull String str, @NonNull String str2) {
            long j2 = Long.parseLong(str);
            if (j2 == EntranceOperateService.CODE_NEED_CLEAN) {
                FindOutMoreActivity.this.l7();
                FindOutMoreActivity.this.J.n(aec.o(), new C0675a());
                return;
            }
            if (j2 == zp.CODE_MAX_COUNT_LIMIT) {
                FindOutMoreActivity.this.l7();
                if (FindOutMoreActivity.this.isFinishing()) {
                    return;
                }
                FindOutMoreActivity findOutMoreActivity = FindOutMoreActivity.this;
                ls5.c(findOutMoreActivity, findOutMoreActivity.getResources().getString(R$string.wallet_dialog_no_title), str2, "", FindOutMoreActivity.this.getResources().getString(R$string.sure), null, new b(), false);
                return;
            }
            FindOutMoreActivity.this.u7(str2 + "[" + j2 + "]");
        }

        @Override // com.oplus.aiunit.vision.ie7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(ConditionCheckVo conditionCheckVo) {
            FindOutMoreActivity.this.l7();
        }
    }

    public class b extends xsc {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(View view) {
            if (!FindOutMoreActivity.this.H.isChecked()) {
                z0k.f(FindOutMoreActivity.this).s(FindOutMoreActivity.this, com.heytap.health.wallet.entrance.R$string.please_read_user_note);
                return;
            }
            if (!rpc.c()) {
                z0k.f(FindOutMoreActivity.this).s(FindOutMoreActivity.this, com.heytap.health.wallet.entrance.R$string.entrance_white_index_network_error);
                return;
            }
            t6b.a("FindOutMoreActivity, addCardBtn click, type: " + FindOutMoreActivity.this.z + "  agreementUrl: " + FindOutMoreActivity.this.B);
            if ("/entrance/whiteIndex".equals(FindOutMoreActivity.this.z)) {
                FindOutMoreActivity.this.X7();
            } else if ("/entrance/enrollIndex".equals(FindOutMoreActivity.this.z)) {
                FindOutMoreActivity.this.W7();
            }
        }
    }

    public class c implements lsc.a {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.lsc.a
        public void a(Object obj) {
            t6b.a("checkRemoteDeviceSt, onResultGet, result: " + obj);
            if (obj != null && !Boolean.parseBoolean(obj.toString())) {
                FindOutMoreActivity.this.m7();
                k7l.j(FindOutMoreActivity.this, false);
            } else {
                FindOutMoreActivity.this.m7();
                FindOutMoreActivity findOutMoreActivity = FindOutMoreActivity.this;
                lfg.c(findOutMoreActivity, findOutMoreActivity.y, "");
            }
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public final /* synthetic */ boolean i;

        public e(boolean z) {
            this.i = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            t6b.b(FindOutMoreActivity.this.s, "start suck card on wearable device");
            if (this.i) {
                return;
            }
            FindOutMoreActivity.this.d8();
        }
    }

    public class f implements lsc.a {
        public f() {
        }

        @Override // com.oplus.aiunit.vision.lsc.a
        public void a(Object obj) {
            t6b.a("checkRemoteDeviceSt, onResultGet, result: " + obj);
            if (obj == null || Boolean.parseBoolean(obj.toString())) {
                FindOutMoreActivity.this.m7();
                FindOutMoreActivity.this.Z7();
            } else {
                FindOutMoreActivity.this.m7();
                k7l.j(FindOutMoreActivity.this, false);
            }
        }
    }

    @Override // com.heytap.health.base.base.BaseViewSizeControl
    public boolean F5() {
        return false;
    }

    @Override // com.heytap.health.wallet.web.HybridWebActivity
    public void F7(View view) {
        this.C = view;
        a8();
        Y7();
        c8();
        b8();
    }

    @Override // com.heytap.health.wallet.web.HybridWebActivity
    public int G7() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.s);
        sb.append(" onlayoutId, id: ");
        int i = R$layout.layout_find_out_more;
        sb.append(i);
        t6b.a(sb.toString());
        return i;
    }

    public final void T7() {
        finish();
    }

    public final void U7() {
        r7();
        CheckConditionParam checkConditionParam = new CheckConditionParam();
        checkConditionParam.setAppCode(this.y);
        checkConditionParam.setCplc(aec.o());
        this.J.j(checkConditionParam, new a());
    }

    public final boolean V7(Context context) {
        if (aec.e(context)) {
            return true;
        }
        aec.k(this);
        return false;
    }

    public final void W7() {
        String strM = aec.m();
        t6b.b(this.s, "clickEntityBtn version = " + strM);
        boolean z = !e1j.l(strM) && (Integer.parseInt(strM) < 10000 || Integer.parseInt(strM) >= 10108);
        if (y6l.a(j7l.t()).x3()) {
            t6b.b(this.s, "clickEntityBtn supportEncDoorCard!");
            d8();
        } else if (!k6l.c().f()) {
            boolean z2 = y6l.a(gl4.managerApi.getCurrentConnectId()).H2() && !z;
            ls5.e(this, getResources().getString(R$string.wallet_dialog_no_title), z2 ? getResources().getString(com.heytap.health.wallet.entrance.R$string.hint_wearable_not_support_nfc) : getResources().getString(com.heytap.health.wallet.entrance.R$string.hint_use_wearable_nfc), z2 ? "" : getResources().getString(com.heytap.health.wallet.entrance.R$string.cancel), getResources().getString(R$string.sure), new d(), new e(z2));
        } else if (V7(this.E)) {
            Z7();
        }
    }

    public final void X7() {
        if (k7l.a()) {
            A();
            new lsc(new c()).d();
        }
    }

    public final void Y7() {
        this.D = (HealthButton) this.C.findViewById(R$id.addCardBtn);
        this.F = (LinearLayout) this.C.findViewById(R$id.wv_container);
        this.G = (TextView) this.C.findViewById(R$id.agreement);
        this.H = (COUICheckBox) this.C.findViewById(R$id.checkBox);
    }

    public final void Z7() {
        lfg.n(this.E, this.y, "");
    }

    public final void a8() {
        Intent intent = getIntent();
        t6b.a("FindOutMoreActivity initData, intent: " + intent);
        if (intent == null) {
            z0k.f(this).s(this, com.heytap.health.wallet.entrance.R$string.param_error);
            finish();
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("USER_RIGHT");
            this.B = stringExtra;
            if (TextUtils.isEmpty(stringExtra)) {
                z0k.f(this).s(this, com.heytap.health.wallet.entrance.R$string.param_error);
                finish();
                return;
            }
            if (getIntent().hasExtra("appCode")) {
                this.y = getIntent().getStringExtra("appCode");
            }
            if (getIntent().hasExtra("TYPE")) {
                this.z = getIntent().getStringExtra("TYPE");
            }
            this.I = new cr(this);
            this.J = new zp(this);
        } catch (Exception unused) {
        }
    }

    public final void b8() {
        this.D.setOnClickListener(new b());
    }

    public final void c8() {
        this.v.setTitle("");
        this.v.setVisibility(0);
        this.F.setPadding(0, this.v.getLayoutParams().height, 0, 0);
        this.I.b(this.G, this.H, this.y);
        if ("/entrance/whiteIndex".equals(this.z)) {
            this.D.setText(com.heytap.health.wallet.entrance.R$string.entrance_card_add_offline);
        } else if ("/entrance/enrollIndex".equals(this.z)) {
            this.D.setText(com.heytap.health.wallet.entrance.R$string.entrance_add_card);
        } else {
            this.D.setText(com.heytap.health.wallet.entrance.R$string.entrance_card_add_offline);
        }
    }

    public final void d8() {
        if (k7l.a()) {
            A();
            new lsc(new f()).d();
        }
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceLoadingWebActivity, com.heytap.health.wallet.web.HybridWebActivity, com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        lfg.c(this, this.y, "");
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        T7();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceLoadingWebActivity, com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = this;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        U7();
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        super.setTitle("");
    }

    @Override // com.heytap.health.wallet.web.HybridWebActivity, com.heytap.health.wallet.web.WebviewLoadingActivity
    public boolean x7() {
        return true;
    }
}
