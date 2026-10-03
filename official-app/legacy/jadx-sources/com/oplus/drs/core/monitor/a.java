package com.oplus.drs.core.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import com.oplus.aiunit.vision.bmj;
import com.oplus.aiunit.vision.t56;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.core.config.TODOConfig;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes6.dex */
public class a implements IMonitor {
    public BatteryManager a;
    public Context b;
    public volatile IMonitor.a g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f19774c = false;
    public volatile boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f19775e = -1;
    public volatile long f = 0;
    public volatile IMonitor.RestrictionLevel h = IMonitor.RestrictionLevel.LOW;
    public final BroadcastReceiver i = new C0958a();

    /* JADX INFO: renamed from: com.oplus.drs.core.monitor.a$a, reason: collision with other inner class name */
    public class C0958a extends BroadcastReceiver {
        public C0958a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intProperty;
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            if (intent == null) {
                return;
            }
            try {
                int intExtra = intent.getIntExtra("status", -1);
                boolean z = 2 == intExtra || 5 == intExtra;
                try {
                    intProperty = a.this.a != null ? a.this.a.getIntProperty(4) : -1;
                } catch (Throwable unused) {
                }
                if (!a.this.u(intProperty)) {
                    int intExtra2 = intent.getIntExtra("level", -1);
                    int intExtra3 = intent.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        intProperty = (intExtra2 * 100) / intExtra3;
                    }
                }
                a.this.d = z;
                a.this.f19775e = intProperty;
                a aVar = a.this;
                aVar.o(aVar.s(aVar.d, a.this.f19775e) ? IMonitor.RestrictionLevel.HIGH : IMonitor.RestrictionLevel.LOW);
                z6b.k("BatteryMonitor", "onReceive() isCharging=" + a.this.d + " percent=" + a.this.f19775e);
            } catch (Throwable unused2) {
            }
        }
    }

    public a(Context context) {
        this.a = (BatteryManager) context.getSystemService("batterymanager");
        this.b = context.getApplicationContext();
    }

    @Override // com.oplus.drs.core.monitor.IMonitor
    public IMonitor.RestrictionLevel b() {
        boolean z = this.d;
        int i = this.f19775e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.f19774c && !s(z, i) && u(i) && i >= q() * 2 && jCurrentTimeMillis < this.f) {
            return IMonitor.RestrictionLevel.LOW;
        }
        if (!u(i) || jCurrentTimeMillis >= this.f) {
            p();
            z = this.d;
            i = this.f19775e;
        }
        z6b.k("BatteryMonitor", "getRestrictionLevel() isCharging:" + z + " percent:" + i);
        if (s(z, i)) {
            l();
            IMonitor.RestrictionLevel restrictionLevel = IMonitor.RestrictionLevel.HIGH;
            o(restrictionLevel);
            return restrictionLevel;
        }
        m();
        IMonitor.RestrictionLevel restrictionLevel2 = IMonitor.RestrictionLevel.LOW;
        o(restrictionLevel2);
        return restrictionLevel2;
    }

    public final void l() {
        if (this.f19774c) {
            return;
        }
        try {
            this.b.registerReceiver(this.i, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f19774c = true;
            z6b.k("BatteryMonitor", "ensureReceiverRegistered ok");
        } catch (Throwable th) {
            this.f19774c = false;
            z6b.u("BatteryMonitor", "ensureReceiverRegistered failed: " + th);
        }
    }

    public final void m() {
        if (this.f19774c) {
            try {
                this.b.unregisterReceiver(this.i);
            } catch (Throwable unused) {
            }
            this.f19774c = false;
            z6b.k("BatteryMonitor", "ensureReceiverUnregistered ok");
        }
    }

    public String n() {
        return "charging=" + this.d + ", percent=" + this.f19775e;
    }

    public final void o(IMonitor.RestrictionLevel restrictionLevel) {
        if (restrictionLevel == null || this.h == restrictionLevel) {
            return;
        }
        this.h = restrictionLevel;
        IMonitor.a aVar = this.g;
        if (aVar != null) {
            try {
                aVar.a(restrictionLevel);
            } catch (Throwable unused) {
            }
        }
    }

    public final void p() {
        try {
            Intent intentRegisterReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                this.i.onReceive(this.b, intentRegisterReceiver);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = this.f19775e;
            if (this.d || !u(i) || i < q() * 2) {
                this.f = jCurrentTimeMillis;
            } else {
                this.f = jCurrentTimeMillis + 1200000;
            }
        } catch (Throwable unused) {
        }
    }

    public final int q() {
        TODOConfig tODOConfigA;
        try {
            bmj bmjVar = t56.todoService;
            if (bmjVar == null || (tODOConfigA = bmjVar.a()) == null) {
                return 20;
            }
            return tODOConfigA.getLowBatteryBlockPercent();
        } catch (Throwable unused) {
            return 20;
        }
    }

    public void r(IMonitor.a aVar) {
        this.g = aVar;
        try {
            o(b());
        } catch (Throwable unused) {
        }
    }

    public final boolean s(boolean z, int i) {
        return !z && u(i) && i < q();
    }

    public void t() {
        p();
        if (s(this.d, this.f19775e)) {
            l();
        } else {
            m();
        }
    }

    public final boolean u(int i) {
        return i > 0 && i <= 100;
    }
}
