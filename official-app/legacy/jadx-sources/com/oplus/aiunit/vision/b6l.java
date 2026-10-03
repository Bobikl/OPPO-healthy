package com.oplus.aiunit.vision;

import android.os.PowerManager;
import com.heytap.health.base.oplus.osense.LongCase;

/* JADX INFO: loaded from: classes5.dex */
public class b6l {
    public static PowerManager.WakeLock a;
    public static Integer b;

    public class a extends x3d.a {
        public a(LongCase longCase) {
            super(longCase);
        }

        @Override // com.oplus.aiunit.vision.x3d.a
        public void b(int i) {
            wil.d("WakeLockHelper", "cancelLongDurationTask() called with: requestId = [" + i + "]");
            x3d.INSTANCE.l(b78.b(), this);
        }

        @Override // com.oplus.aiunit.vision.x3d.a
        public void f(int i, int i2) {
            wil.d("WakeLockHelper", "requestRunningTaskInfo() called with: requestId = [" + i + "], resultCode = [" + i2 + "]");
            b6l.b = Integer.valueOf(i);
        }
    }

    public static void b(long j2) {
        wil.d("WakeLockHelper", "lock: time = [" + j2 + "]");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b78.a().getSystemService("power")).newWakeLock(1, "connect:auto");
        a = wakeLockNewWakeLock;
        if (wakeLockNewWakeLock != null) {
            wakeLockNewWakeLock.setReferenceCounted(false);
            a.acquire(j2);
        }
    }

    public static void c() {
        if (b == null) {
            wil.d("WakeLockHelper", "startOPlusOSenseRes");
            x3d.INSTANCE.l(b78.a(), new a(LongCase.WATCH_RECONNECT));
            return;
        }
        wil.d("WakeLockHelper", "startOPlusOSenseRes hasRequested!!!: requestId = [" + b + "]");
    }

    public static void d() {
        if (b == null) {
            wil.d("WakeLockHelper", "stopOPlusOSenseRes: no requestId !!!");
            return;
        }
        wil.d("WakeLockHelper", "stopOPlusOSenseRes: requestId = [" + b + "]");
        x3d.INSTANCE.m(b78.a(), b.intValue());
        b = null;
    }

    public static void e() {
        wil.d("WakeLockHelper", "unlock");
        PowerManager.WakeLock wakeLock = a;
        if (wakeLock != null) {
            wakeLock.release();
            a = null;
        }
    }
}
