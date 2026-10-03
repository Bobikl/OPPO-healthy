package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes6.dex */
public final class rlk {
    public static final Object a = new Object();
    public static PowerManager.WakeLock b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f16251c;

    public static void a() {
        synchronized (a) {
            int i = f16251c + 1;
            f16251c = i;
            if (i == 1) {
                try {
                    Context contextB = w56.b();
                    if (contextB == null) {
                        z6b.u("UploadWakeLock", "acquire: DrsRuntime.context() is null, skip");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) contextB.getSystemService("power");
                    if (powerManager == null) {
                        z6b.u("UploadWakeLock", "acquire: PowerManager is null, skip");
                        return;
                    }
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "drs:upload");
                    b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                    b.acquire(30000L);
                    z6b.q("UploadWakeLock", "WakeLock acquired, timeout=30000ms");
                } catch (Throwable th) {
                    z6b.u("UploadWakeLock", "acquire failed: " + th.getMessage());
                    b = null;
                }
            } else {
                d();
                z6b.k("UploadWakeLock", "WakeLock refCount=" + f16251c);
            }
        }
    }

    public static void b() {
        synchronized (a) {
            int i = f16251c;
            if (i <= 0) {
                z6b.u("UploadWakeLock", "release called but refCount already 0");
                return;
            }
            int i2 = i - 1;
            f16251c = i2;
            if (i2 == 0) {
                c();
            } else {
                z6b.k("UploadWakeLock", "WakeLock release, remaining refCount=" + f16251c);
            }
        }
    }

    public static void c() {
        try {
            PowerManager.WakeLock wakeLock = b;
            if (wakeLock != null && wakeLock.isHeld()) {
                b.release();
                z6b.q("UploadWakeLock", "WakeLock released");
            }
        } catch (Throwable th) {
            z6b.u("UploadWakeLock", "release failed: " + th.getMessage());
        }
        b = null;
    }

    public static void d() {
        PowerManager.WakeLock wakeLock = b;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        try {
            b.acquire(30000L);
        } catch (Throwable unused) {
        }
    }
}
