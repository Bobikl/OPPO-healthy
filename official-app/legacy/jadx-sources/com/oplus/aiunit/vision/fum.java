package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;

/* JADX INFO: loaded from: classes12.dex */
public final class fum {
    public rrm a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Messenger f11518c = null;

    public fum(Context context) {
        this.a = null;
        this.b = null;
        this.b = context.getApplicationContext();
        this.a = new rrm(this.b);
    }

    public final IBinder a(Intent intent) {
        this.a.w(intent);
        this.a.d(intent);
        Messenger messenger = new Messenger(this.a.s());
        this.f11518c = messenger;
        return messenger.getBinder();
    }

    public final void b() {
        try {
            rrm.F();
            this.a.q = com.autonavi.aps.amapapi.utils.k.b();
            this.a.r = com.autonavi.aps.amapapi.utils.k.a();
            this.a.c();
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ApsServiceCore", "onCreate");
        }
    }

    public final int c() {
        rrm rrmVar = this.a;
        return (rrmVar == null || rrmVar.z.isSelfStartServiceEnable()) ? 3 : 2;
    }

    public final void d() {
        try {
            rrm rrmVar = this.a;
            if (rrmVar != null) {
                rrmVar.s().sendEmptyMessage(11);
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "ApsServiceCore", "onDestroy");
        }
    }
}
