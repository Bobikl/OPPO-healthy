package com.heytap.health.wallet.bus.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.wallet.bus.R$id;
import com.heytap.health.wallet.bus.R$layout;
import com.heytap.health.wallet.network.common.params.QueryQrCodeInfoReq;
import com.heytap.health.wallet.network.common.rsp.QrCodeCardInfo;
import com.heytap.health.wallet.network.common.rsp.QueryQrCodeInfoRsp;
import com.heytap.health.wallet.network.door.rsp.UserAllDeviceCardDto;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.a94;
import com.oplus.aiunit.vision.aak;
import com.oplus.aiunit.vision.cak;
import com.oplus.aiunit.vision.dak;
import com.oplus.aiunit.vision.drk;
import com.oplus.aiunit.vision.eak;
import com.oplus.aiunit.vision.erc;
import com.oplus.aiunit.vision.kfg;
import com.oplus.aiunit.vision.lid;
import com.oplus.aiunit.vision.nye;
import com.oplus.aiunit.vision.q1h;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.rr6;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.u2j;
import com.oplus.aiunit.vision.wrf;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.x50;
import com.oplus.aiunit.vision.z0k;
import com.oppo.lib.common.R$string;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/bus/batchMigrate/In")
public class TransitBatchMigrateInActivity extends BusBaseActivity implements dak, aak, erc.d, lid {

    @Autowired(name = "select_card_list")
    public List<UserAllDeviceCardDto> A;

    @Autowired(name = "voucherExtra")
    public String B;

    @Autowired(name = "cardType")
    public Byte C;
    public QueryQrCodeInfoReq D;
    public Handler E;
    public TextView H;
    public TextView I;
    public boolean J;
    public LottieAnimationView K;
    public LottieAnimationView L;
    public QrCodeCardInfo M;
    public q1h N;
    public boolean O;
    public boolean P;
    public TextView Q;
    public nye R;
    public int T;
    public eak w;
    public cak x;
    public erc y;

    @Autowired(name = "select_phone")
    public String z;
    public long F = 5000;
    public int G = 100;
    public int S = 0;
    public int U = 0;
    public int V = 0;
    public int W = 0;
    public int X = 1;
    public int Y = 0;
    public boolean Z = false;
    public boolean a0 = true;
    public Runnable b0 = new b();
    public nye.a c0 = new c();
    public Runnable d0 = new d();
    public float e0 = 585.1064f;

    public class a implements q1h.c {

        /* JADX INFO: renamed from: com.heytap.health.wallet.bus.ui.activities.TransitBatchMigrateInActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0670a implements Runnable {
            public RunnableC0670a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a94.a(TransitBatchMigrateInActivity.this)) {
                    x50.b(TransitBatchMigrateInActivity.this.K, "move_in_scan.json", wrf.DEFAULT_IMAGES_DIR_NAME, -1, -1, true);
                }
            }
        }

        public a() {
        }

        @Override // com.oplus.aiunit.vision.q1h.c
        public void a(int i, q1h.b bVar) {
            TransitBatchMigrateInActivity transitBatchMigrateInActivity = TransitBatchMigrateInActivity.this;
            transitBatchMigrateInActivity.N7(transitBatchMigrateInActivity.K);
            TransitBatchMigrateInActivity transitBatchMigrateInActivity2 = TransitBatchMigrateInActivity.this;
            transitBatchMigrateInActivity2.N7(transitBatchMigrateInActivity2.L);
        }

        @Override // com.oplus.aiunit.vision.q1h.c
        public void b(int i, q1h.b bVar) {
            x50.b(TransitBatchMigrateInActivity.this.L, "move_in_arrow.json", wrf.DEFAULT_IMAGES_DIR_NAME, -1, -1, true);
            TransitBatchMigrateInActivity.this.L.postDelayed(new RunnableC0670a(), 500L);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t6b.i(TransitBatchMigrateInActivity.this.s, "mQueryVoucherStatusRunnable_queryMigrateVoucherStatus");
            TransitBatchMigrateInActivity.this.w.b(TransitBatchMigrateInActivity.this.D);
        }
    }

    public class c implements nye.a {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.nye.a
        public void a(int i) {
            if (i > 0) {
                TransitBatchMigrateInActivity.this.X7(i - 1);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TransitBatchMigrateInActivity.this.Z) {
                return;
            }
            TransitBatchMigrateInActivity.this.O7();
        }
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity
    public void A7() {
        P7();
        S7();
        Q7();
        R7();
        if (TextUtils.isEmpty(this.B)) {
            T7();
            return;
        }
        r7();
        this.Q.setVisibility(8);
        W7();
        t6b.i(this.s, "renderView_scheduleRequestVoucherStatus");
    }

    @Override // com.oplus.aiunit.vision.aak
    public void E4(QrCodeCardInfo qrCodeCardInfo) {
        this.a0 = false;
        t6b.i(this.s, "migrateInFail");
    }

    public final void N7(LottieAnimationView lottieAnimationView) {
        if (lottieAnimationView != null) {
            lottieAnimationView.pauseAnimation();
            lottieAnimationView.cancelAnimation();
        }
    }

    public final void O7() {
        X7(this.X);
        int i = this.X + 1;
        this.X = i;
        if (i < 0) {
            this.X = 0;
        } else if (i > 95) {
            this.X = 95;
        }
        this.E.postDelayed(this.d0, (long) this.e0);
    }

    public final void P7() {
        this.A = (List) getIntent().getSerializableExtra("select_card_list");
        this.B = getIntent().getStringExtra("voucherExtra");
        this.C = Byte.valueOf(getIntent().getByteExtra("cardType", kfg.CARD_TYPE_TRANSIT_1.byteValue()));
        QueryQrCodeInfoReq queryQrCodeInfoReq = new QueryQrCodeInfoReq(this.B, this.u);
        this.D = queryQrCodeInfoReq;
        queryQrCodeInfoReq.setCardType(this.C);
        this.E = new Handler();
        if (drk.e(this.A)) {
            a7b.m(this.s, "mSelectedCardList is null finish");
            finish();
        }
    }

    public final void Q7() {
        this.y = new erc(this.u);
        this.w = new eak(this);
        this.x = new cak(this, this.B, 5, this.u, this.z, this.y, this, this);
    }

    public final void R7() {
        nye nyeVar = new nye();
        this.R = nyeVar;
        nyeVar.a(10);
        this.S += 10;
        this.R.h(new nye.b(this.c0));
        X7(0);
        this.R.j(15000L);
    }

    public final void S7() {
        this.H = (TextView) findViewById(R$id.title);
        this.I = (TextView) findViewById(R$id.sub_title);
        this.K = (LottieAnimationView) findViewById(R$id.card_animation_view);
        this.L = (LottieAnimationView) findViewById(R$id.arrow_animation_view);
        this.Q = (TextView) findViewById(R$id.tv_progress);
        if (this.A != null) {
            this.I.setText(String.format(getString(R$string.wallet_in_tip_per), String.valueOf(this.A.size())));
        }
        this.H.setText(getString(R$string.wallet_migrate_in_ing_hint));
        q1h q1hVarJ = q1h.j((RelativeLayout) findViewById(R$id.shift_card_layout), true);
        this.N = q1hVarJ;
        q1hVarJ.n(new a());
    }

    public final void T7() {
        List<UserAllDeviceCardDto> list = this.A;
        if (list == null) {
            return;
        }
        this.x.R(list);
    }

    public final void U7() {
        this.T = this.U + this.V + this.W;
        a7b.m(this.s, "mCurProgress:" + this.T + ",progressLenth=" + this.S);
        int i = this.T;
        if (i >= this.S) {
            X7(100);
        } else {
            this.R.i(i);
        }
    }

    public final void V7() {
        this.J = false;
        this.Z = false;
        this.X = 1;
        this.V = 0;
        this.W = 0;
        this.Y = 0;
        this.U = 10;
        U7();
        this.R.g();
        X7(0);
    }

    public final void W7() {
        Handler handler = this.E;
        if (handler != null) {
            handler.postDelayed(this.b0, this.F);
        } else {
            l7();
        }
    }

    public final void X7(int i) {
        this.Q.setText(getString(R$string.wallet_migrate_batch_progress_hint, Integer.valueOf(i)));
    }

    public final void Y7(int i) {
        if (i == 0) {
            int i2 = this.Y + 10;
            this.Y = i2;
            if (i2 > 95) {
                this.Y = 95;
            }
        } else {
            this.Y = i;
        }
        this.V = (this.Y * 10) / 100;
        U7();
    }

    @Override // com.oplus.aiunit.vision.aak
    public void a2(QueryQrCodeInfoRsp queryQrCodeInfoRsp) {
        if (queryQrCodeInfoRsp == null || drk.e(queryQrCodeInfoRsp.getQrCodeCardInfoList())) {
            return;
        }
        this.N.s(queryQrCodeInfoRsp.getQrCodeCardInfoList());
        this.x.D(queryQrCodeInfoRsp);
    }

    @Override // com.oplus.aiunit.vision.erc.d
    public void f2(int i, String str) {
        Y7(i);
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity
    public int getLayoutId() {
        return R$layout.activity_batch_migrate_card;
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity, com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.oplus.aiunit.vision.aak
    public void i4(QrCodeCardInfo qrCodeCardInfo, int i, int i2) {
        t6b.i(this.s, "beginMigrate mIsLastCardMigrateSuc=" + this.a0);
        this.M = qrCodeCardInfo;
        this.N.l(this.a0);
        this.H.setText(String.format(getString(R$string.wallet_migrate_in_doing), String.valueOf(i), String.valueOf(i2)));
        V7();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.G && i2 == -1 && intent != null) {
            List<QrCodeCardInfo> list = (List) intent.getSerializableExtra("failList");
            if (drk.e(list)) {
                finish();
                return;
            }
            this.a0 = true;
            this.O = false;
            this.K.setVisibility(0);
            this.L.setVisibility(0);
            this.x.N(list);
            this.P = true;
            if (TextUtils.isEmpty(this.B)) {
                return;
            }
            this.w.b(this.D);
        }
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.J) {
            finish();
        } else {
            z0k.f(qz0.mContext).o(R$string.wallet_migrate_in_back_press_tip);
        }
    }

    @u2j(threadMode = ThreadMode.MAIN)
    public void onBatchMigrateComplete(rr6 rr6Var) {
        if (a94.a(this)) {
            finish();
        }
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity, com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x0.d().f(this);
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        nye nyeVar = this.R;
        if (nyeVar != null) {
            nyeVar.k();
        }
        this.c0 = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(this.b0);
            this.E = null;
        }
        N7(this.K);
        N7(this.L);
        cak cakVar = this.x;
        if (cakVar != null) {
            cakVar.G();
        }
        super.onDestroy();
    }

    @Override // com.oplus.aiunit.vision.lid
    public void onProgress(int i) {
        Y7(i);
    }

    @Override // com.oplus.aiunit.vision.aak
    public void x4() {
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(this.b0);
            this.E = null;
        }
        N7(this.K);
        N7(this.L);
        this.K.setVisibility(8);
        this.L.setVisibility(8);
        t6b.i(this.s, "removeCallbacksAndMessages");
        this.J = true;
        t6b.i(this.s, "goToTransitBatchMigrateCardResultActivity");
        if (this.O) {
            return;
        }
        this.O = true;
        TransitBatchMigrateCardResultActivity.K7(this, this.x.y(), this.x.x(), 5, this.G, "");
        overridePendingTransition(0, 0);
    }

    @Override // com.oplus.aiunit.vision.aak
    public void y0(QrCodeCardInfo qrCodeCardInfo) {
        this.a0 = true;
        t6b.i(this.s, "migrateInSuccess");
        X7(100);
    }
}
