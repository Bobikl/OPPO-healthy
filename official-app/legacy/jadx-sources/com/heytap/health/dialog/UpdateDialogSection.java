package com.heytap.health.dialog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.heytap.health.core.router.setting.AppUpgradeService;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cs5;
import com.oplus.aiunit.vision.x0;

/* JADX INFO: loaded from: classes16.dex */
public class UpdateDialogSection extends DialogSection {
    public final AppUpgradeService r = (AppUpgradeService) x0.d().b("/settings/appUpgrade").navigation();
    public BroadcastReceiver s;

    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a7b.f(UpdateDialogSection.this.i, "upgrade receive");
            if (!TextUtils.equals("action.upgrade.checked", intent.getAction()) || UpdateDialogSection.this.r.I4(UpdateDialogSection.this.d())) {
                return;
            }
            UpdateDialogSection.this.m();
        }

        public a() {
        }
    }

    @Override // com.heytap.health.dialog.DialogSection
    public void j(cs5 cs5Var) {
        super.j(cs5Var);
        if (!this.r.m2()) {
            m();
        } else {
            n();
            this.r.D7(d());
        }
    }

    public void m() {
        DialogSection dialogSection = this.p;
        if (dialogSection != null) {
            this.f4118n.l(dialogSection);
        }
        o();
    }

    public final void n() {
        this.s = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action.upgrade.checked");
        LocalBroadcastManager.getInstance(d()).registerReceiver(this.s, intentFilter);
    }

    public final void o() {
        try {
            if (this.s != null) {
                LocalBroadcastManager.getInstance(d()).unregisterReceiver(this.s);
                this.s = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.heytap.health.dialog.DialogSection
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onActivityDestroy() {
        AppUpgradeService appUpgradeService = this.r;
        if (appUpgradeService != null) {
            appUpgradeService.destroy();
        }
        o();
    }
}
