package com.oplus.drs.core.monitor;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.oplus.aiunit.vision.bmj;
import com.oplus.aiunit.vision.t56;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.core.config.TODOConfig;
import com.oplus.osense.OsenseResEventClient;
import com.oplus.osense.eventinfo.EventConfig;
import com.oplus.osense.eventinfo.OsenseConfig;
import com.oplus.osense.eventinfo.OsenseEventCallback;
import com.oplus.osense.eventinfo.OsenseEventResult;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements IMonitor {
    public final Context a;
    public volatile boolean b;
    public EventConfig i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile IMonitor.a f19780j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f19778c = 0;
    public volatile int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f19779e = -1;
    public volatile int f = -1;
    public volatile int g = -1;
    public volatile long h = -1;
    public volatile IMonitor.RestrictionLevel k = IMonitor.RestrictionLevel.LOW;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OsenseEventCallback f19781l = new a();

    public class a extends OsenseEventCallback {
        public a() {
        }

        public void onEventSceneChanged(OsenseEventResult osenseEventResult) {
            if (osenseEventResult == null) {
                return;
            }
            try {
                int eventType = osenseEventResult.getEventType();
                int eventStateType = osenseEventResult.getEventStateType();
                Bundle extraData = osenseEventResult.getExtraData();
                z6b.k("OsensePressureMonitor", "onEventSceneChanged in eventType = " + eventType + ", eventStateType=" + eventStateType + ", Bundle=" + c.x(extraData));
                if (eventType != 103) {
                    if (eventType == 110) {
                        c cVar = c.this;
                        cVar.d = c.A(extraData, "curOsenseThermalLevel", cVar.d);
                        c cVar2 = c.this;
                        cVar2.g = c.A(extraData, "currentTemperature", cVar2.g);
                        c cVar3 = c.this;
                        cVar3.h = c.B(extraData, "startTime", cVar3.h);
                        z6b.k("OsensePressureMonitor", "onEventSceneChanged THERMAL_LEVEL: level=" + c.this.d + "(" + c.I(c.this.d) + "), temperature=" + c.this.g + ", startTime=" + c.this.h + ", blockLevel=" + c.this.F() + ", extraKeys=" + c.x(extraData));
                        c cVar4 = c.this;
                        cVar4.D(cVar4.b());
                        return;
                    }
                    return;
                }
                c cVar5 = c.this;
                cVar5.f19778c = c.A(extraData, "level", cVar5.f19778c);
                c cVar6 = c.this;
                cVar6.f19779e = c.A(extraData, "cpuLoad", cVar6.f19779e);
                c cVar7 = c.this;
                cVar7.f = c.A(extraData, "lastCpuLoadLevel", cVar7.f);
                c cVar8 = c.this;
                cVar8.h = c.B(extraData, "startTime", cVar8.h);
                z6b.k("OsensePressureMonitor", "onEventSceneChanged CPU: level=" + c.this.f19778c + "(" + c.y(c.this.f19778c) + "), load=" + c.this.f19779e + ", lastLevel=" + c.this.f + ", startTime=" + c.this.h + ", blockLevel=" + c.this.E() + ", extraKeys=" + c.x(extraData));
                c cVar9 = c.this;
                cVar9.D(cVar9.b());
            } catch (Throwable unused) {
            }
        }
    }

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    public static int A(Bundle bundle, String str, int i) {
        if (bundle != null && str != null) {
            try {
                return bundle.getInt(str, i);
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    public static long B(Bundle bundle, String str, long j2) {
        if (bundle != null && str != null) {
            try {
                return bundle.getLong(str, j2);
            } catch (Throwable unused) {
            }
        }
        return j2;
    }

    public static String I(int i) {
        if (i == 1) {
            return "L1(~33C)";
        }
        if (i == 2) {
            return "L2(~37C)";
        }
        if (i == 3) {
            return "L3(~40C)";
        }
        if (i != 4) {
            return i != 5 ? LanConstants.OPERATOR_UNKNOWN : "L5(~47C)";
        }
        return "L4(~43C)";
    }

    public static String x(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        try {
            return String.valueOf(bundle.keySet());
        } catch (Throwable unused) {
            return NotificationCompat.CATEGORY_ERROR;
        }
    }

    public static String y(int i) {
        if (i == 1) {
            return "L1(load<80%)";
        }
        if (i != 2) {
            return i != 3 ? LanConstants.OPERATOR_UNKNOWN : "L3(load>95%)";
        }
        return "L2(80%<load<95%)";
    }

    public boolean C() {
        return this.b;
    }

    public final void D(IMonitor.RestrictionLevel restrictionLevel) {
        if (restrictionLevel == null || this.k == restrictionLevel) {
            return;
        }
        this.k = restrictionLevel;
        IMonitor.a aVar = this.f19780j;
        if (aVar != null) {
            try {
                aVar.a(restrictionLevel);
            } catch (Throwable unused) {
            }
        }
    }

    public final int E() {
        TODOConfig tODOConfigA;
        try {
            bmj bmjVar = t56.todoService;
            if (bmjVar == null || (tODOConfigA = bmjVar.a()) == null) {
                return 3;
            }
            return tODOConfigA.getOsenseCpuBlockLevel();
        } catch (Throwable unused) {
            return 3;
        }
    }

    public final int F() {
        TODOConfig tODOConfigA;
        try {
            bmj bmjVar = t56.todoService;
            if (bmjVar == null || (tODOConfigA = bmjVar.a()) == null) {
                return 3;
            }
            return tODOConfigA.getOsenseThermalBlockLevel();
        } catch (Throwable unused) {
            return 3;
        }
    }

    public void G(IMonitor.a aVar) {
        this.f19780j = aVar;
        try {
            D(b());
        } catch (Throwable unused) {
        }
    }

    public void H() {
        if (this.b) {
            return;
        }
        try {
            EventConfig eventConfig = new EventConfig(new HashSet());
            HashSet hashSet = new HashSet();
            Bundle bundle = new Bundle();
            boolean z = true;
            bundle.putBoolean("firstNotifyFlag", true);
            bundle.putBoolean("first_notify_flag", true);
            hashSet.add(new OsenseConfig(103, bundle));
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("firstNotifyFlag", true);
            bundle2.putBoolean("first_notify_flag", true);
            hashSet.add(new OsenseConfig(110, bundle2));
            eventConfig.setOsenseConfigSet(hashSet);
            int iRegisterEventCallback = OsenseResEventClient.getInstance().registerEventCallback(this.f19781l, eventConfig);
            if (iRegisterEventCallback != 1) {
                z = false;
            }
            this.b = z;
            if (this.b) {
                this.i = eventConfig;
            }
            z6b.q("OsensePressureMonitor", "startMonitoring ret=" + iRegisterEventCallback + ", started=" + this.b + ", thresholds={cpuLevel>=" + E() + ", thermalLevel>=" + F() + "}, events=" + hashSet);
        } catch (Throwable th) {
            this.b = false;
            this.i = null;
            z6b.u("OsensePressureMonitor", "startMonitoring failed, fallback to LOW. err=" + th);
        }
    }

    @Override // com.oplus.drs.core.monitor.IMonitor
    public IMonitor.RestrictionLevel b() {
        if (!this.b) {
            return IMonitor.RestrictionLevel.LOW;
        }
        int iE = E();
        int iF = F();
        if (this.f19778c < iE && this.d < iF) {
            return IMonitor.RestrictionLevel.LOW;
        }
        return IMonitor.RestrictionLevel.HIGH;
    }

    public String z() {
        if (!this.b) {
            return "Osense not started";
        }
        return "cpu=" + this.f19778c + "(" + y(this.f19778c) + "), load=" + this.f19779e + ", thermal=" + this.d + "(" + I(this.d) + "), temp=" + this.g;
    }
}
