package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class eqc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f11019e;
    public static final long f;
    public static final Set<String> g;
    public static volatile eqc h;
    public final Context a;
    public final ur9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11020c;
    public volatile boolean d;

    public class a implements b {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.eqc.b
        public long elapsedRealtime() {
            return SystemClock.elapsedRealtime();
        }
    }

    public interface b {
        long elapsedRealtime();
    }

    static {
        f11019e = e() ? 60000L : 900000L;
        f = e() ? 300000L : 86400000L;
        g = new HashSet(Arrays.asList("com.android.launcher", "com.android.settings", "com.android.contacts", "com.oplus.logkit", "com.android.phone", "com.oplus.trafficmonitor", "com.oplus.screenshot", "com.oplus.upgradeguide"));
    }

    public eqc(Context context) {
        Context contextH = w56.h();
        if (contextH == null) {
            contextH = context != null ? context.getApplicationContext() : null;
        }
        this.a = contextH;
        this.b = opa.a(contextH, "drs_app_storage");
        this.f11020c = new a();
    }

    public static eqc b(Context context) {
        if (h == null) {
            synchronized (eqc.class) {
                if (h == null) {
                    h = new eqc(context);
                }
            }
        }
        return h;
    }

    public static boolean e() {
        return false;
    }

    public long a() {
        long jI = i();
        try {
            long j2 = this.b.getLong("sales_last_seen_elapsed", -1L);
            this.b.putLong("sales_last_seen_elapsed", jI);
            if (j2 >= 0 && jI < j2) {
                z6b.u("NewDeviceSalesGuard", "elapsedRealtime rollback detected, lastSeen=" + j2 + ", nowElapsed=" + jI + ", markReleased(REBOOT)");
                g("REBOOT");
                this.d = true;
            }
        } catch (Throwable unused) {
        }
        return 0L;
    }

    public long c() {
        try {
            return this.b.getLong("sales_last_seen_elapsed", -1L);
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public boolean d() {
        if (this.d || this.b.getBoolean("sales_restriction_released", false)) {
            this.d = true;
            return false;
        }
        long jI = i();
        long j2 = f11019e;
        boolean z = jI < j2;
        if (z) {
            z6b.q("NewDeviceSalesGuard", "inNoBreakWindow=TRUE, remainMs=" + (j2 - jI));
        }
        return z;
    }

    public boolean f(boolean z, boolean z2) {
        if (!z || this.d) {
            return true;
        }
        if (this.b.getBoolean("sales_restriction_released", false)) {
            this.d = true;
            return true;
        }
        long jI = i();
        a();
        if (jI < f11019e) {
            return false;
        }
        if (z2) {
            z6b.q("NewDeviceSalesGuard", "NewDeviceGuard RELEASED by WLAN");
            g("WLAN");
            this.d = true;
            return true;
        }
        if (jI > f) {
            z6b.q("NewDeviceSalesGuard", "NewDeviceGuard RELEASED by OVER_24H");
            g("OVER_24H");
            this.d = true;
            return true;
        }
        z6b.q("NewDeviceSalesGuard", "NewDeviceGuard blocked: firstDayWindow, elapsedMs=" + jI + ", isWifi=" + z2);
        return false;
    }

    public final void g(String str) {
        try {
            this.b.putBoolean("sales_restriction_released", true);
            if (str != null) {
                this.b.putString("sales_release_reason", str);
            }
            z6b.q("NewDeviceSalesGuard", "markReleased: reason=" + str + ", nowElapsedMs=" + i() + ", lastSeenElapsedMs=" + c());
        } catch (Throwable unused) {
        }
    }

    public long h() {
        return f11019e;
    }

    public final long i() {
        try {
            return this.f11020c.elapsedRealtime();
        } catch (Throwable unused) {
            return SystemClock.elapsedRealtime();
        }
    }
}
