package com.oplus.drs.core.monitor;

import android.content.Context;
import com.oplus.aiunit.vision.w56;
import com.oplus.drs.base.ChannelMode;

/* JADX INFO: loaded from: classes6.dex */
public class b implements IMonitor {
    public com.oplus.drs.core.monitor.a a;
    public d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.oplus.drs.core.monitor.c f19776c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile IMonitor.a f19777e;
    public volatile IMonitor.RestrictionLevel f = IMonitor.RestrictionLevel.LOW;
    public volatile boolean g = true;

    public class a implements IMonitor.a {
        public a() {
        }

        @Override // com.oplus.drs.core.monitor.IMonitor.a
        public void a(IMonitor.RestrictionLevel restrictionLevel) {
            b bVar = b.this;
            bVar.g(bVar.b());
        }
    }

    /* JADX INFO: renamed from: com.oplus.drs.core.monitor.b$b, reason: collision with other inner class name */
    public class C0959b implements IMonitor.a {
        public C0959b() {
        }

        @Override // com.oplus.drs.core.monitor.IMonitor.a
        public void a(IMonitor.RestrictionLevel restrictionLevel) {
            b bVar = b.this;
            bVar.g(bVar.b());
        }
    }

    public class c implements IMonitor.a {
        public c() {
        }

        @Override // com.oplus.drs.core.monitor.IMonitor.a
        public void a(IMonitor.RestrictionLevel restrictionLevel) {
            b bVar = b.this;
            bVar.g(bVar.b());
        }
    }

    public b(Context context) {
        this.a = new com.oplus.drs.core.monitor.a(context);
        this.b = new d(context);
        IMonitor iMonitorK = k(context);
        if (iMonitorK instanceof com.oplus.drs.core.monitor.c) {
            this.f19776c = (com.oplus.drs.core.monitor.c) iMonitorK;
        } else {
            this.f19776c = null;
        }
    }

    public static IMonitor k(Context context) {
        try {
            Class.forName("com.oplus.osense.OsenseResEventClient");
            return (IMonitor) com.oplus.drs.core.monitor.c.class.getConstructor(Context.class).newInstance(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.oplus.drs.core.monitor.IMonitor
    public IMonitor.RestrictionLevel a() {
        com.oplus.drs.core.monitor.c cVar;
        if (w56.a() == ChannelMode.STANDALONE) {
            return IMonitor.RestrictionLevel.LOW;
        }
        return (!this.d || (cVar = this.f19776c) == null) ? this.b.b() : cVar.b();
    }

    @Override // com.oplus.drs.core.monitor.IMonitor
    public IMonitor.RestrictionLevel b() {
        com.oplus.drs.core.monitor.c cVar;
        if (w56.a() == ChannelMode.STANDALONE) {
            return IMonitor.RestrictionLevel.LOW;
        }
        IMonitor.RestrictionLevel restrictionLevelB = this.g ? this.a.b() : IMonitor.RestrictionLevel.LOW;
        IMonitor.RestrictionLevel restrictionLevelB2 = (!this.d || (cVar = this.f19776c) == null) ? this.b.b() : cVar.b();
        return restrictionLevelB.ordinal() <= restrictionLevelB2.ordinal() ? restrictionLevelB2 : restrictionLevelB;
    }

    @Override // com.oplus.drs.core.monitor.IMonitor
    public String c() {
        IMonitor.RestrictionLevel restrictionLevelB;
        String str;
        String strG;
        com.oplus.drs.core.monitor.c cVar;
        try {
            IMonitor.RestrictionLevel restrictionLevelB2 = this.a.b();
            if (!this.d || (cVar = this.f19776c) == null) {
                restrictionLevelB = this.b.b();
                str = "Thermal";
                strG = this.b.g();
            } else {
                restrictionLevelB = cVar.b();
                str = "Osense";
                strG = this.f19776c.z();
            }
            return "Battery=[" + restrictionLevelB2 + ", " + this.a.n() + ", enabled=" + this.g + "], " + str + "=[" + restrictionLevelB + ", " + strG + "]";
        } catch (Throwable th) {
            return "Error:" + th.getMessage();
        }
    }

    public final void e() {
        try {
            com.oplus.drs.core.monitor.a aVar = this.a;
            if (aVar != null) {
                aVar.r(new a());
            }
        } catch (Throwable unused) {
        }
        try {
            com.oplus.drs.core.monitor.c cVar = this.f19776c;
            if (cVar != null) {
                cVar.G(new C0959b());
            }
        } catch (Throwable unused2) {
        }
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.j(new c());
            }
        } catch (Throwable unused3) {
        }
    }

    public String f() {
        try {
            return "BatteryMonitor: enabled=" + this.g + ", level=" + this.a.b() + ", " + this.a.n();
        } catch (Throwable th) {
            return "BatteryMonitor: Error - " + th.getMessage();
        }
    }

    public final void g(IMonitor.RestrictionLevel restrictionLevel) {
        if (restrictionLevel == null || this.f == restrictionLevel) {
            return;
        }
        this.f = restrictionLevel;
        IMonitor.a aVar = this.f19777e;
        if (aVar != null) {
            try {
                aVar.a(restrictionLevel);
            } catch (Throwable unused) {
            }
        }
    }

    public void h(boolean z) {
        this.g = z;
        g(b());
    }

    public void i(IMonitor.a aVar) {
        this.f19777e = aVar;
        e();
        g(b());
    }

    public void j() {
        if (w56.a() == ChannelMode.STANDALONE) {
            return;
        }
        this.a.t();
        com.oplus.drs.core.monitor.c cVar = this.f19776c;
        if (cVar != null) {
            try {
                cVar.H();
                com.oplus.drs.core.monitor.c cVar2 = this.f19776c;
                if (cVar2 instanceof com.oplus.drs.core.monitor.c) {
                    this.d = cVar2.C();
                } else {
                    this.d = false;
                }
            } catch (Throwable unused) {
                this.d = false;
            }
        }
        if (!this.d) {
            this.b.k();
        }
        e();
        g(b());
    }
}
