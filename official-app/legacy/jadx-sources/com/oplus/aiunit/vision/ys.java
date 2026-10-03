package com.oplus.aiunit.vision;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import androidx.core.app.AlarmManagerCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BuildCompat;

/* JADX INFO: loaded from: classes15.dex */
public class ys {
    public final String a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19123c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AlarmManager f19124e;
    public volatile boolean f;
    public PendingIntent g;
    public final String h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f19125j;
    public final BroadcastReceiver k;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Runnable runnable = ys.this.f19125j;
            if (runnable != null && ys.this.h.equals(intent.getAction())) {
                runnable.run();
            }
            synchronized (this) {
                if (ys.this.f) {
                    ys.this.k();
                }
            }
        }
    }

    public ys(Context context, String str, long j2) {
        this(context, str, j2, 2);
    }

    public void e(long j2) {
        m();
        this.f19123c = j2;
    }

    public final void f() {
        int i = this.d;
        if (i == 0 || i == 1) {
            qs.a(this.f19124e, i, System.currentTimeMillis() + this.f19123c, g());
        } else if (i == 2 || i == 3) {
            AlarmManagerCompat.setAndAllowWhileIdle(this.f19124e, i, SystemClock.elapsedRealtime() + this.f19123c, g());
        } else {
            a7b.b("AlarmScheduler", "undefined alarm type");
        }
    }

    public final PendingIntent g() {
        if (this.g == null) {
            Intent intent = new Intent(this.h);
            intent.setPackage(b78.a().getPackageName());
            this.g = PendingIntent.getBroadcast(this.b, 1001, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728);
        }
        return this.g;
    }

    public boolean h() {
        return this.f;
    }

    public final void i() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(this.h);
        rdf.b(this.b, this.k, intentFilter, v62.SPORT_HEALTH_BROADCAST_PERMISSION, null, 4);
        this.i = true;
    }

    public void j(Runnable runnable) {
        this.f19125j = runnable;
    }

    public final void k() {
        try {
            this.f19124e.cancel(g());
            f();
        } catch (Throwable th) {
            a7b.b("AlarmScheduler", "Set alarm occur exception:" + th.getMessage());
        }
    }

    public synchronized void l() {
        if (this.f) {
            return;
        }
        this.f = true;
        i();
        k();
    }

    public synchronized void m() {
        this.f = false;
        try {
            this.f19124e.cancel(g());
        } catch (Throwable th) {
            a7b.b("AlarmScheduler", "Cancel alarm occur exception:" + th.getMessage());
        }
        if (this.i) {
            this.b.unregisterReceiver(this.k);
            this.i = false;
        }
    }

    public ys(Context context, String str, long j2, int i) {
        this.a = "AlarmScheduler";
        this.f = false;
        this.i = false;
        this.k = new a();
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.f19123c = j2;
        this.d = i;
        this.f19124e = (AlarmManager) applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        this.h = str + "_ACTION_ALARM_SCHEDULER";
    }
}
