package com.heytap.health.wallet.entrance.ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.heytap.health.wallet.BaseActivityEx;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.gg7;
import com.oplus.aiunit.vision.k6l;
import com.oplus.aiunit.vision.u2j;
import com.oplus.aiunit.vision.xsc;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes18.dex */
public abstract class EntranceBaseActivity extends BaseActivityEx implements View.OnClickListener {
    public int t;

    public class a extends xsc {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(View view) {
            EntranceBaseActivity.this.onClick(view);
        }
    }

    public EntranceBaseActivity(int i) {
        this.t = i;
    }

    public abstract void A7();

    public void B7(View view) {
        if (view != null) {
            view.setOnClickListener(new a());
        }
    }

    public abstract void C7();

    @u2j(threadMode = ThreadMode.MAIN)
    public void finishEntranceActivity(gg7 gg7Var) {
        finish();
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void init() {
        z7();
        y7();
        C7();
        A7();
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = this.t;
        if (i != 0) {
            setContentView(i);
        }
        init();
        v7();
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        w7();
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public boolean x7(Context context) {
        if (!k6l.c().f()) {
            return false;
        }
        if (aec.f(context)) {
            return true;
        }
        aec.k(this);
        return false;
    }

    public abstract void y7();

    public abstract void z7();
}
