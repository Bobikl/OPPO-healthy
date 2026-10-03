package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.heytap.health.sport.services.SportNotifyService;

/* JADX INFO: loaded from: classes17.dex */
public class jee {
    public boolean a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12860c;

    public static class a {

        @SuppressLint({"StaticFieldLeak"})
        public static jee a = new jee();
    }

    public jee() {
        v9g v9gVarX = v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY);
        if (ilj.D()) {
            this.b = v9gVarX.r(hq8.SP_KEY_FORCE_STABLE_NOTIFY, false);
            e(" current is support singleProcAlive phone notify state " + this.b);
            return;
        }
        if (!v9gVarX.n(hq8.SP_KEY_FORCE_STABLE_NOTIFY)) {
            v9gVarX.W(hq8.SP_KEY_FORCE_STABLE_NOTIFY, true);
        }
        this.b = v9gVarX.r(hq8.SP_KEY_FORCE_STABLE_NOTIFY, true);
        e(" current is not singleProcAlive phone notify state " + this.b);
    }

    public static jee c() {
        return a.a;
    }

    public static void e(String str) {
        a7b.f(hq8.INTENT_EXTRA_STABLE_NOTIFY, str);
    }

    public boolean a() {
        return this.f12860c && !g3k.x();
    }

    public void b(boolean z) {
        if (g3k.x()) {
            e("app is in tourist mode  -> ");
            return;
        }
        if (z == this.b) {
            e("shouldShowNotify state is the same  -> " + this.b);
            return;
        }
        this.b = z;
        v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(hq8.SP_KEY_FORCE_STABLE_NOTIFY, z);
        if (z) {
            ((SportNotifyService) x0.d().h(SportNotifyService.class)).q3();
            com.heytap.health.base.track.a.B(14, 0);
            Intent intent = new Intent("local_broad_start_sport");
            intent.putExtra(hq8.INTENT_EXTRA_STABLE_NOTIFY, true);
            LocalBroadcastManager.getInstance(b78.a()).sendBroadcast(intent);
            return;
        }
        com.heytap.health.base.track.a.B(14, 1);
        Intent intent2 = new Intent("local_broad_stop_sport");
        intent2.putExtra(hq8.INTENT_EXTRA_STABLE_NOTIFY, true);
        LocalBroadcastManager.getInstance(b78.a()).sendBroadcast(intent2);
        ((SportNotifyService) x0.d().h(SportNotifyService.class)).O3();
    }

    public boolean d() {
        return this.a;
    }

    public void f() {
        if (g3k.x()) {
            e(" update notify >> IsInTouristMode ");
            return;
        }
        this.f12860c = true;
        e(" update notify >> " + this.b);
        if (this.b) {
            ((SportNotifyService) x0.d().h(SportNotifyService.class)).q3();
        } else {
            ((SportNotifyService) x0.d().h(SportNotifyService.class)).O3();
        }
    }

    public void g(boolean z) {
        this.a = z;
    }
}
