package com.heytap.health.wallet.bus.ui.activities;

import android.os.Bundle;
import android.view.View;
import com.heytap.health.wallet.bus.event.FinishBusEvent;
import com.heytap.wallet.business.common.util.CmdExecUtils;
import com.heytap.wallet.business.ui.activities.NfcBaseActivity;
import com.oplus.aiunit.vision.a94;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.u2j;
import com.oplus.aiunit.vision.xsc;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes18.dex */
public class BusBaseActivity extends NfcBaseActivity implements View.OnClickListener {

    public class a extends xsc {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(View view) {
            BusBaseActivity.this.onClick(view);
        }
    }

    @Override // com.heytap.wallet.business.ui.activities.NfcBaseActivity
    public void A7() {
    }

    public void B7(int i, String str) {
        t6b.b(this.s, "sendFailEvent type mOpType" + i);
        CmdExecUtils.c(i, str);
    }

    public void C7(int i, String str) {
        t6b.b(this.s, "sendSuccessEvent type mOpType" + i);
        CmdExecUtils.e(i, str);
    }

    public void D7(View view) {
        if (view != null) {
            view.setOnClickListener(new a());
        }
    }

    @u2j(threadMode = ThreadMode.MAIN)
    public void finishBusActivity(FinishBusEvent finishBusEvent) {
        if (a94.a(this)) {
            finish();
        }
    }

    @Override // com.heytap.wallet.business.ui.activities.NfcBaseActivity
    public int getLayoutId() {
        return 0;
    }

    @Override // com.heytap.wallet.business.ui.activities.NfcBaseActivity, com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.heytap.wallet.business.ui.activities.NfcBaseActivity, com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x7();
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        y7();
    }

    @Override // com.heytap.wallet.business.ui.activities.NfcBaseActivity, com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
