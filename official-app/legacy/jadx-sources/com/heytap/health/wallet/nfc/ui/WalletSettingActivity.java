package com.heytap.health.wallet.nfc.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$id;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.wallet.BaseActivityEx;
import com.heytap.health.wallet.R$layout;
import com.heytap.health.wallet.event.NetStateChangeEvent;
import com.heytap.health.wallet.network.bus.params.UserCardsParam;
import com.heytap.health.wallet.network.bus.rsp.UserCards;
import com.heytap.health.wallet.widget.RelativeItemLayout;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.bol;
import com.oplus.aiunit.vision.e7l;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.ie7;
import com.oplus.aiunit.vision.k7l;
import com.oplus.aiunit.vision.ma2;
import com.oplus.aiunit.vision.mo6;
import com.oplus.aiunit.vision.p1l;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.u2j;
import com.oplus.aiunit.vision.vik;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.x81;
import com.oplus.aiunit.vision.zv8;
import java.util.Calendar;
import java.util.HashMap;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/main/mine")
public class WalletSettingActivity extends BaseActivityEx implements View.OnClickListener {
    public static boolean hasJumpToSignInFingerPrint = false;

    @Autowired
    public String A;
    public ConstraintLayout B;
    public RelativeItemLayout u;
    public RelativeItemLayout v;
    public RelativeItemLayout w;
    public String z;
    public String t = zv8.H5_PATH + "watch-nfc/buscard_use_skills.html";
    public String x = "";
    public long y = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.heytap.health.wallet.nfc.ui.WalletSettingActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0680a implements Runnable {
            public RunnableC0680a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WalletSettingActivity.this.B7();
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WalletSettingActivity.this.z = aec.o();
            WalletSettingActivity.this.runOnUiThread(new RunnableC0680a());
        }
    }

    public class b extends ie7<UserCards> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NonNull String str, @NonNull String str2) {
            t6b.f("WalletSettingActivity", "onReqFail code: " + str + " msg: " + str2);
        }

        @Override // com.oplus.aiunit.vision.ie7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(UserCards userCards) {
            if (userCards.getUseCourseUrl() == null) {
                t6b.i("WalletSettingActivity", "get busUseCourseUrl failed!");
                return;
            }
            WalletSettingActivity.this.t = userCards.getUseCourseUrl();
            t6b.b("WalletSettingActivity", "busUseCourseUrl = " + WalletSettingActivity.this.t);
        }
    }

    @SuppressLint({"AutoDispose"})
    public final void B7() {
        UserCardsParam userCardsParam = new UserCardsParam(this.z);
        ((ma2) e7l.INSTANCE.a(ma2.class)).n(userCardsParam).L0(su8.c()).n0(f30.c()).subscribe(new b());
    }

    public final void C7() {
        this.B.setVisibility(0);
        D7();
        hasJumpToSignInFingerPrint = false;
    }

    public void D7() {
        this.B.setVisibility(0);
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initView() {
        R1(this, (COUIToolbar) findViewById(R$id.lib_base_toolbar), true);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(com.heytap.health.wallet.R$id.cl_one_click_repair);
        this.B = constraintLayout;
        constraintLayout.setVisibility(0);
        int i = com.oppo.lib.common.R$id.divider_line;
        if (findViewById(i) != null) {
            findViewById(i).setVisibility(8);
        }
        this.u = (RelativeItemLayout) p1l.a(this, com.heytap.health.wallet.R$id.item_user_note_bus);
        this.v = (RelativeItemLayout) p1l.a(this, com.heytap.health.wallet.R$id.item_user_note_entrance);
        RelativeItemLayout relativeItemLayout = (RelativeItemLayout) p1l.a(this, com.heytap.health.wallet.R$id.item_user_faq);
        this.w = relativeItemLayout;
        relativeItemLayout.setVisibility(0);
        this.u.setOnClickListener(this);
        this.v.setOnClickListener(this);
        this.w.setOnClickListener(this);
        this.B.setOnClickListener(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        new HashMap();
        if (timeInMillis - this.y > 500) {
            this.y = timeInMillis;
            int id = view.getId();
            if (id == com.heytap.health.wallet.R$id.item_user_note_bus) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.t);
                sb.append(this.t.contains("?") ? "&" : "?");
                sb.append("type=");
                sb.append(k7l.b());
                x81.c(this, sb.toString());
                return;
            }
            if (id == com.heytap.health.wallet.R$id.item_user_note_entrance) {
                x81.c(this, mo6.b());
                return;
            }
            if (id == com.heytap.health.wallet.R$id.item_user_faq) {
                vik.a(2);
                x0.d().b("/main/FullScreenWeb").withString("webUrl", bol.USER_FAQ_URL).navigation(this);
            } else if (id == com.heytap.health.wallet.R$id.cl_one_click_repair) {
                vik.a(1);
                x81.c(this, "/main/autoRepair");
            }
        }
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.layout_mine);
        ThreadUtils.doInBackground(new a());
        x0.d().f(this);
        v7();
        initView();
        hasJumpToSignInFingerPrint = false;
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        w7();
        super.onDestroy();
    }

    @u2j(threadMode = ThreadMode.MAIN)
    public void onNetworkChanged(NetStateChangeEvent netStateChangeEvent) {
        if (netStateChangeEvent == null || netStateChangeEvent.isNoneNet()) {
            return;
        }
        C7();
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
