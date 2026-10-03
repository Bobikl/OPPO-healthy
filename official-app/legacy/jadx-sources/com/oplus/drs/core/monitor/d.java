package com.oplus.drs.core.monitor;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import com.oplus.aiunit.vision.z6b;

/* JADX INFO: loaded from: classes6.dex */
public class d implements IMonitor {
    public PowerManager b;
    public volatile IMonitor.a d;
    public int a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile IMonitor.RestrictionLevel f19783e = IMonitor.RestrictionLevel.LOW;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f19782c = new a();

    public class a implements PowerManager.OnThermalStatusChangedListener {
        public a() {
        }

        @Override // android.os.PowerManager.OnThermalStatusChangedListener
        public void onThermalStatusChanged(int i) {
            d.this.a = i;
            d dVar = d.this;
            dVar.i(dVar.h(i));
        }
    }

    public d(Context context) {
        this.b = (PowerManager) context.getSystemService("power");
    }

    @Override // com.oplus.drs.core.monitor.IMonitor
    public IMonitor.RestrictionLevel b() {
        IMonitor.RestrictionLevel restrictionLevel = IMonitor.RestrictionLevel.LOW;
        IMonitor.RestrictionLevel restrictionLevelH = h(this.a);
        z6b.k("ThermalMonitor", "getRestrictionLevel() result:" + restrictionLevelH);
        i(restrictionLevelH);
        return restrictionLevelH;
    }

    public String g() {
        return "status=" + l(this.a);
    }

    public final IMonitor.RestrictionLevel h(int i) {
        switch (i) {
            case 0:
            case 1:
                return IMonitor.RestrictionLevel.LOW;
            case 2:
                return IMonitor.RestrictionLevel.MID;
            case 3:
            case 4:
            case 5:
            case 6:
                return IMonitor.RestrictionLevel.HIGH;
            default:
                return IMonitor.RestrictionLevel.LOW;
        }
    }

    public final void i(IMonitor.RestrictionLevel restrictionLevel) {
        if (restrictionLevel == null || this.f19783e == restrictionLevel) {
            return;
        }
        this.f19783e = restrictionLevel;
        IMonitor.a aVar = this.d;
        if (aVar != null) {
            try {
                aVar.a(restrictionLevel);
            } catch (Throwable unused) {
            }
        }
    }

    public void j(IMonitor.a aVar) {
        this.d = aVar;
        try {
            i(b());
        } catch (Throwable unused) {
        }
    }

    public void k() {
        z6b.k("ThermalMonitor", "startMonitoring() runtime android-version:" + Build.VERSION.SDK_INT);
        Object obj = this.f19782c;
        if (obj != null) {
            this.b.addThermalStatusListener((PowerManager.OnThermalStatusChangedListener) obj);
        }
    }

    public final String l(int i) {
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "LIGHT";
            case 2:
                return "MODERATE";
            case 3:
                return "SEVERE";
            case 4:
                return "CRITICAL";
            case 5:
                return "EMERGENCY";
            case 6:
                return "SHUTDOWN";
            default:
                return "UNKNOWN(" + i + ")";
        }
    }
}
