package com.oplus.aiunit.vision;

import android.os.PowerManager;
import com.heytap.health.base.oplus.osense.LongCase;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class z9l {
    public static PowerManager.WakeLock a;
    public static Integer b;

    public class a extends p5d.a {
        public a(LongCase longCase) {
            super(longCase);
        }

        public void b(int i) {
            uml.d("WakeLockHelper", "cancelLongDurationTask() called with: requestId = [" + i + "]");
            p5d.INSTANCE.l(e88.b(), this);
        }

        public void f(int i, int i2) {
            uml.d("WakeLockHelper", "requestRunningTaskInfo() called with: requestId = [" + i + "], resultCode = [" + i2 + "]");
            z9l.b = Integer.valueOf(i);
        }
    }

    public static void b(long j) {
        uml.d("WakeLockHelper", "lock: time = [" + j + "]");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) e88.a().getSystemService("power")).newWakeLock(1, "connect:auto");
        a = wakeLockNewWakeLock;
        if (wakeLockNewWakeLock != null) {
            wakeLockNewWakeLock.setReferenceCounted(false);
            a.acquire(j);
        }
    }

    public static void c() {
        if (b == null) {
            uml.d("WakeLockHelper", "startOPlusOSenseRes");
            p5d.INSTANCE.l(e88.a(), new a(LongCase.WATCH_RECONNECT));
            return;
        }
        uml.d("WakeLockHelper", "startOPlusOSenseRes hasRequested!!!: requestId = [" + b + "]");
    }

    public static void d() {
        if (b == null) {
            uml.d("WakeLockHelper", "stopOPlusOSenseRes: no requestId !!!");
            return;
        }
        uml.d("WakeLockHelper", "stopOPlusOSenseRes: requestId = [" + b + "]");
        p5d.INSTANCE.m(e88.a(), b.intValue());
        b = null;
    }

    public static void e() {
        uml.d("WakeLockHelper", "unlock");
        PowerManager.WakeLock wakeLock = a;
        if (wakeLock != null) {
            wakeLock.release();
            a = null;
        }
    }
}
