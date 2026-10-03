package com.heytap.health.wallet.entrance.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.entrance.model.detail.BaseDetailModel;
import com.oplus.aiunit.vision.ihg;
import com.oplus.aiunit.vision.lrc;
import com.oplus.aiunit.vision.qjd;
import com.oplus.aiunit.vision.qz2;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.tz5;
import com.oplus.aiunit.vision.x81;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/entrance/entranceOpenSuc")
public class OpenSucActivity extends EntranceBaseActivity {

    @Autowired(name = "CARD_TYPE")
    public String A;
    public qz2 B;
    public HealthButton u;
    public HealthButton v;

    @Autowired(name = "appCode")
    public String w;

    @Autowired(name = "aid")
    public String x;

    @Autowired(name = "cardImg")
    public String y;

    @Autowired(name = "CARD_NAME")
    public String z;

    public class a implements qjd<BaseDetailModel> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.qjd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void callback(BaseDetailModel baseDetailModel) {
            OpenSucActivity.this.m7();
            if (baseDetailModel != null) {
                OpenSucActivity.this.y = baseDetailModel.getCardUrl();
                OpenSucActivity.this.z = baseDetailModel.getCardName();
                t6b.b("OpenSucActivity", "loadData cardImg = " + OpenSucActivity.this.y + "cardName = " + OpenSucActivity.this.z + "appCard = " + OpenSucActivity.this.w);
            }
        }
    }

    public OpenSucActivity() {
        super(R$layout.activity_layout_open_sucess);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void A7() {
        B7(this.u);
        B7(this.v);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void C7() {
    }

    public final void D7() {
        ihg.a().f("KEY_ACTION", "add").f("KEY_APP_CODE", this.w).f("KEY_CARD_AID", this.x).f("CARD_TYPE", "3").f("from", "").b(this, "/entrance/detail");
        finish();
    }

    public final void E7() {
        Bundle bundle = new Bundle();
        bundle.putString("cardImg", this.y);
        bundle.putString("CARD_NAME", this.z);
        bundle.putString("aid", this.x);
        bundle.putString("appCode", this.w);
        bundle.putString("from", "");
        bundle.putBoolean("EXTRA_ENTRANCE_CARD_FLG", true);
        x81.d(this, "/switch/cardPosMap", bundle);
    }

    public final void F7() {
        t6b.b("OpenSucActivity", "loadData cardType = " + this.A);
        A();
        this.B.a(new a());
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
        if (view.getId() == R$id.skip_btn) {
            D7();
        } else if (view.getId() == R$id.add_btn) {
            E7();
        }
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void y7() {
        this.u = (HealthButton) findViewById(R$id.skip_btn);
        this.v = (HealthButton) findViewById(R$id.add_btn);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void z7() {
        Intent intent = getIntent();
        if (intent != null) {
            this.w = intent.getStringExtra("KEY_APP_CODE");
            this.x = intent.getStringExtra("KEY_CARD_AID");
            this.A = intent.getStringExtra("CARD_TYPE");
            this.z = intent.getStringExtra("CARD_NAME");
            this.y = intent.getStringExtra("cardImg");
            t6b.b("OpenSucActivity", "appCode = " + this.w + "aid = " + this.x + "cardType = " + this.A + "cardName = " + this.z + "cardImg = " + this.y);
        } else {
            finish();
        }
        if (!"3".equals(this.A) && "5".equals(this.A)) {
            this.B = new lrc(this.x, this.w, this);
        } else {
            this.B = new tz5(this.x, this.w, this);
        }
        F7();
    }
}
