package com.heytap.health.wallet;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.AlertDialog;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.wallet.widget.NetStatusErrorView;
import com.oplus.aiunit.vision.d84;
import com.oplus.aiunit.vision.grc;
import com.oplus.aiunit.vision.z30;
import com.oplus.anim.EffectiveAnimationView;
import com.support.dialog.R$style;

/* JADX INFO: loaded from: classes18.dex */
public class BaseActivity extends com.heytap.health.base.base.BaseActivity {
    public static final int REQ_CODE = 100;
    public static final int RESULT_CODE_FINISH = 101;
    public static final int SYSTEM_UI_FLAG_OP_STATUS_BAR_TINT = 16;
    public AlertDialog m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public COUIToolbar f6122n;
    public grc p;
    public d84 q;
    public boolean o = false;
    public String r = getClass().getSimpleName();

    public class a implements ViewTreeObserver.OnWindowAttachListener {
        public final /* synthetic */ EffectiveAnimationView a;

        public a(EffectiveAnimationView effectiveAnimationView) {
            this.a = effectiveAnimationView;
        }

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowAttached() {
            this.a.playAnimation();
        }

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowDetached() {
            this.a.pauseAnimation();
        }
    }

    public void A() {
        s7(com.oppo.lib.common.R$string.color_loading_view_access_string);
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public void l7() {
        d84 d84Var = this.q;
        if (d84Var != null) {
            d84Var.e();
        }
    }

    public void m7() {
        AlertDialog alertDialog = this.m;
        if (alertDialog == null || !alertDialog.isShowing() || isFinishing()) {
            return;
        }
        this.m.dismiss();
        this.m = null;
    }

    public void n7() {
        d84 d84Var = this.q;
        if (d84Var != null) {
            d84Var.g();
        }
    }

    public void o7(boolean z) {
        AlertDialog alertDialog;
        if (isFinishing() || (alertDialog = this.m) == null) {
            return;
        }
        alertDialog.setCancelable(z);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.q = new d84();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        m7();
        super.onDestroy();
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        grc grcVar = this.p;
        if (grcVar != null) {
            grcVar.d(this);
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        grc grcVar = this.p;
        if (grcVar != null) {
            grcVar.c(this);
        }
    }

    public void p7(NetStatusErrorView netStatusErrorView) {
        d84 d84Var = this.q;
        if (d84Var != null) {
            d84Var.f(netStatusErrorView);
        }
    }

    public void q7(boolean z) {
        grc grcVar = new grc();
        this.p = grcVar;
        grcVar.b(z);
        this.p.a(this);
    }

    public void r7() {
        d84 d84Var = this.q;
        if (d84Var != null) {
            d84Var.h();
        }
    }

    public void s7(int i) {
        if (isFinishing()) {
            return;
        }
        if (this.m == null) {
            this.m = new HealthAlertDialogBuilder(this, R$style.COUIAlertDialog_Rotating).setTitle(i).X(17).setCancelable(false).show();
        }
        AlertDialog alertDialog = this.m;
        if (alertDialog != null) {
            z30.a(alertDialog);
        }
        View decorView = this.m.getWindow().getDecorView();
        if (decorView != null) {
            decorView.getViewTreeObserver().addOnWindowAttachListener(new a((EffectiveAnimationView) decorView.findViewById(com.support.dialog.R$id.progress)));
        }
    }

    public void t7(int i, String str) {
        d84 d84Var = this.q;
        if (d84Var != null) {
            d84Var.i(i, str);
        }
    }

    public void u7(String str) {
        d84 d84Var = this.q;
        if (d84Var != null) {
            d84Var.j(str);
        }
    }
}
