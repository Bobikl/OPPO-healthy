package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.UiThread;
import androidx.lifecycle.Observer;
import com.heytap.health.core.provider.StepDataObserverManager;
import com.heytap.health.core.provider.adapter.open.SportDataAdapter;
import com.heytap.health.settings.me.thirdpartbinding.wechat.WXSportReceiver;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.Calendar;

/* JADX INFO: loaded from: classes17.dex */
public class ycb {
    public static final int STATUS_CLOSE = 0;
    public static final int STATUS_OPEN = 1;
    public static final int STATUS_UNKNOWN = -1;
    public static final int SYNC_RESULT_DELAY = 3;
    public static final int SYNC_RESULT_FAIL = 2;
    public static final int SYNC_RESULT_IS_QUICKLY = 5;
    public static final int SYNC_RESULT_NOT_SUPPORT = 4;
    public static final int SYNC_RESULT_PLUGIN_NOT_INSTALL = 6;
    public static final int SYNC_RESULT_SUCCESS = 1;
    public boolean a;
    public volatile boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f18970c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StepDataObserverManager.a f18971e;

    public static class a {
        public static final ycb a = new ycb();
    }

    public static ycb i() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Integer num) {
        if (num.intValue() == 1) {
            H(false, true).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        a7b.f("MMStepSyncManager", "On App Step Changed, at=" + (System.currentTimeMillis() / 1000));
        I(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        H(false, true).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        H(false, true).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        H(true, true).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(boolean z, boolean z2, ccd ccdVar) throws Throwable {
        Context contextA = b78.a();
        int i = 2;
        if (v3d.h(contextA)) {
            a7b.b("MMStepSyncManager", "SportDataAdapter isOPlusPhoneMoving!!!");
            com.heytap.health.base.track.a.p().a("type", "isOPlusPhoneMoving").b();
            x(ccdVar, 2);
            return;
        }
        Bundle bundleF = SportDataAdapter.F(contextA);
        if (bundleF == null || !bundleF.containsKey("step")) {
            StringBuilder sb = new StringBuilder();
            sb.append("SportDataAdapter bundle null(or no step):");
            sb.append(bundleF == null);
            a7b.f("MMStepSyncManager", sb.toString());
            x(ccdVar, 2);
            return;
        }
        long j2 = bundleF.getLong("step", -1L);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SportDataAdapter.query:");
        sb2.append(j2);
        if (j2 <= 0) {
            a7b.f("MMStepSyncManager", "Health App Step is 0, return; " + j2);
            x(ccdVar, 2);
            return;
        }
        long jO = o();
        long jN = n();
        long jCurrentTimeMillis = jO > 0 ? 301000 - (System.currentTimeMillis() - jO) : 0L;
        this.f18970c.removeCallbacksAndMessages(null);
        if (jCurrentTimeMillis > 0) {
            a7b.f("MMStepSyncManager", "Delay sync step, delayMillis:" + jCurrentTimeMillis + "ms");
            this.f18970c.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.vcb
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.s();
                }
            }, jCurrentTimeMillis);
            x(ccdVar, 3);
            return;
        }
        long jD = D(j2, jO, jN);
        int iE = E(jD);
        if (jD != j2) {
            a7b.f("MMStepSyncManager", "current step count is too many;");
            this.f18970c.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.wcb
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.t();
                }
            }, 301000L);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("ret = ");
        sb3.append(iE);
        sb3.append(",sync step=");
        sb3.append(jD);
        if (z) {
            this.d = iE;
        }
        if (iE == 1) {
            B(jD);
            if (!p()) {
                y(false);
            }
            z(0);
            i = 1;
        } else if (iE == 3902) {
            a7b.f("MMStepSyncManager", "Sync step fail(extStepSwitchNotOpen), ret=" + iE);
            if (l() >= 5) {
                y(true);
                i = 4;
            } else {
                z(l() + 1);
            }
        } else if (iE == 3903) {
            i = 5;
        } else if (iE == 3906) {
            i = 6;
        } else if (!z2) {
            a7b.f("MMStepSyncManager", "Sync step fail, try again in a minute");
            this.f18970c.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.xcb
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.u();
                }
            }, 60000L);
        }
        C();
        x(ccdVar, i);
    }

    public void A(int i) {
        v9g.x("health_share_preference_settings").S("SETTING_SYNC_WECHAT_STEP_STATUS", i);
        if (i == 1) {
            F();
            WXSportReceiver.c();
        } else {
            G();
            WXSportReceiver.d();
        }
    }

    public final void B(long j2) {
        v9g.x("health_share_preference_settings").T("SETTING_SYNC_WECHAT_STEP_COUNT", j2);
    }

    public final void C() {
        v9g.x("health_share_preference_settings").T("SETTING_SYNC_WECHAT_STEP_TIME", System.currentTimeMillis());
    }

    public final long D(long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = j(jCurrentTimeMillis);
        if (j3 > j8) {
            StringBuilder sb = new StringBuilder();
            sb.append("segmentStepCount() last sync in today stepCount > lastSyncStepCount:");
            sb.append(j2 > j4);
            a7b.f("MMStepSyncManager", sb.toString());
            j5 = ((jCurrentTimeMillis - j3) / 300000) * 1000;
            j6 = j4;
        } else {
            a7b.f("MMStepSyncManager", "segmentStepCount() last sync not in today;");
            j5 = ((jCurrentTimeMillis - j8) / 300000) * 1000;
            j6 = 0;
        }
        if (j5 < j2 - j6) {
            j7 = j6 + j5;
            a7b.f("MMStepSyncManager", "segmentStepCount() Unable to synchronize steps to WeChat at once(ableSyncStepCount:" + j5 + ")");
        } else {
            j7 = j2;
        }
        a7b.f("MMStepSyncManager", "segmentStepCount() lastSyncTime:" + j3 + ",zeroTime:" + j8);
        return j7;
    }

    public final int E(long j2) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("Start setStep stepCount > 0:");
        sb.append(j2 > 0);
        a7b.f("MMStepSyncManager", sb.toString());
        Context contextA = b78.a();
        if (!this.a) {
            String str = vzg.WECHAT_APP_ID;
            this.a = WXAPIFactory.createWXAPI(contextA, str).registerApp(str);
        }
        int iA = mcb.a(contextA, vzg.WECHAT_APP_ID, System.currentTimeMillis() / 1000, j2, 1L);
        a7b.f("MMStepSyncManager", "Set step result=" + iA);
        return iA;
    }

    public final synchronized void F() {
        if (!this.b) {
            this.b = true;
            StepDataObserverManager.INSTANCE.addListener(this.f18971e);
        }
    }

    public final synchronized void G() {
        if (this.b) {
            StepDataObserverManager.INSTANCE.removeListener(this.f18971e);
            this.b = false;
        }
        this.f18970c.removeCallbacksAndMessages(null);
    }

    public final lbd<Integer> H(final boolean z, final boolean z2) {
        a7b.f("MMStepSyncManager", "Start sync step to mm, is retry=" + z);
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.scb
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.v(z2, z, ccdVar);
            }
        }).L0(su8.c());
    }

    public void I(boolean z) {
        int iM = m();
        if (iM == 1) {
            H(false, z).c();
            return;
        }
        if (iM != -1) {
            G();
            WXSportReceiver.d();
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            w();
        } else {
            this.f18970c.post(new Runnable() { // from class: com.oplus.aiunit.vision.rcb
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.w();
                }
            });
        }
    }

    public lbd<Integer> J(boolean z) {
        return H(false, z);
    }

    public void h() {
        v9g.x("health_share_preference_settings").a0("SETTING_SYNC_WECHAT_STEP_STATUS");
        v9g.x("health_share_preference_settings").a0("SETTING_SYNC_WECHAT_STEP_TIME");
        v9g.x("health_share_preference_settings").a0("SETTING_SYNC_WECHAT_STEP_SUPPORT");
        v9g.x("health_share_preference_settings").a0("SETTING_SYNC_WECHAT_STEP_SUPPORT_COUNT");
        v9g.x("health_share_preference_settings").a0("SETTING_SYNC_WECHAT_STEP_COUNT");
    }

    public final long j(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public boolean k() {
        return this.d == 1;
    }

    public int l() {
        return v9g.x("health_share_preference_settings").z("SETTING_SYNC_WECHAT_STEP_SUPPORT_COUNT", 0);
    }

    public int m() {
        return v9g.x("health_share_preference_settings").z("SETTING_SYNC_WECHAT_STEP_STATUS", -1);
    }

    public final long n() {
        return v9g.x("health_share_preference_settings").B("SETTING_SYNC_WECHAT_STEP_COUNT", 0L);
    }

    public long o() {
        return v9g.x("health_share_preference_settings").B("SETTING_SYNC_WECHAT_STEP_TIME", -1L);
    }

    public boolean p() {
        return v9g.x("health_share_preference_settings").r("SETTING_SYNC_WECHAT_STEP_SUPPORT", true);
    }

    @UiThread
    public final void w() {
        pcb.c().observeForever(new Observer() { // from class: com.oplus.aiunit.vision.ucb
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.q((Integer) obj);
            }
        });
    }

    public final void x(ml6<Integer> ml6Var, int i) {
        ml6Var.onNext(Integer.valueOf(i));
        ml6Var.onComplete();
    }

    public final void y(boolean z) {
        v9g.x("health_share_preference_settings").W("SETTING_SYNC_WECHAT_STEP_SUPPORT", !z);
    }

    public final void z(int i) {
        v9g.x("health_share_preference_settings").S("SETTING_SYNC_WECHAT_STEP_SUPPORT_COUNT", i);
    }

    public ycb() {
        this.a = false;
        this.b = false;
        this.f18970c = new Handler(Looper.getMainLooper());
        this.f18971e = new StepDataObserverManager.a() { // from class: com.oplus.aiunit.vision.tcb
            @Override // com.heytap.health.core.provider.StepDataObserverManager.a
            public final void a() {
                this.a.r();
            }
        };
        if (m() == 1) {
            F();
            WXSportReceiver.c();
        }
    }
}
