package com.heytap.health.dialog;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.heytap.health.home.HomeMovingService;
import com.heytap.health.sport.moving.ISportLifecycle;
import com.heytap.health.sport.moving.MoveLifecycleManager;
import com.oplus.aiunit.vision.cs5;
import com.oplus.aiunit.vision.np9;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.x0;

/* JADX INFO: loaded from: classes16.dex */
public class MovingDialogSection extends DialogSection implements np9 {

    @Autowired
    public HomeMovingService r;

    @Override // com.oplus.aiunit.vision.np9
    public void i0() {
    }

    @Override // com.heytap.health.dialog.DialogSection
    public void j(cs5 cs5Var) {
        x0.d().f(this);
        super.j(cs5Var);
        StringBuilder sb = new StringBuilder();
        sb.append("onStart movingService:");
        sb.append(this.r);
        this.r.x5(d());
        this.r.H4(this);
        if (v9g.x("preference_sport").q("is_in_motion")) {
            this.r.u1(null);
        } else {
            l();
        }
    }

    public void l() {
        DialogSection dialogSection = this.p;
        if (dialogSection != null) {
            this.f4118n.l(dialogSection);
            this.p = null;
        }
    }

    @Override // com.heytap.health.dialog.DialogSection
    public void onActivityDestroy() {
        super.onActivityDestroy();
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityDestroy movingService:");
        sb.append(this.r);
        this.r.Y0(false);
        this.r.H4(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onActivityOnPause() {
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityOnPause movingService:");
        sb.append(this.r);
        this.r.Y0(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onActivityOnResume() {
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityOnResume movingService:");
        sb.append(this.r);
        sb.append("\nsp.UserInMotion:");
        sb.append(v9g.x("preference_sport").q("is_in_motion"));
        sb.append("\nmovingState:");
        MoveLifecycleManager moveLifecycleManager = MoveLifecycleManager.INSTANCE;
        sb.append(moveLifecycleManager.m());
        if (v9g.x("preference_sport").q("is_in_motion") && moveLifecycleManager.m() == ISportLifecycle.State.DEFAULT) {
            this.r.Y0(true);
        }
    }
}
