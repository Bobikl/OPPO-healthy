package com.heytap.accessory.session;

import android.os.Handler;
import android.os.Looper;
import com.oplus.aiunit.vision.xx0;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static final String i = "a";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static SecureRandom f2690j = new SecureRandom();
    public static Map<Long, List<Long>> k = new ConcurrentHashMap();
    public long a;
    public long b;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.heytap.accessory.transport.b f2692e;
    public Handler f;
    public RunnableC0260a g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2691c = 1;
    public e h = null;

    /* JADX INFO: renamed from: com.heytap.accessory.session.a$a, reason: collision with other inner class name */
    public static final class RunnableC0260a implements Runnable {
        public static final String b = "a";
        public WeakReference<a> a;

        public RunnableC0260a(a aVar) {
            this.a = null;
            this.a = new WeakReference<>(aVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<a> weakReference = this.a;
            if (weakReference == null) {
                com.heytap.accessory.base.logging.a.e(b, "SendMsgTimeoutRunnable:  sessionRef is null!");
                return;
            }
            a aVar = weakReference.get();
            if (aVar == null) {
                com.heytap.accessory.base.logging.a.e(b, "SendMsgTimeoutRunnable:  thisInstance is null!");
            } else {
                aVar.f();
            }
        }
    }

    public a(long j2) {
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("daemon");
        if (looperB != null) {
            this.f = new Handler(looperB);
        }
        this.b = a(j2);
        this.a = j2;
    }

    public static long b(long j2) {
        return 992L;
    }

    public static boolean c(long j2) {
        return j2 < 32;
    }

    public static a d(long j2) {
        return new a(j2);
    }

    public synchronized void e(long j2) {
        this.d = true;
        e eVar = this.h;
        if (eVar == null || eVar.b()) {
            RunnableC0260a runnableC0260a = this.g;
            if (runnableC0260a == null) {
                this.g = new RunnableC0260a(this);
            } else {
                this.f.removeCallbacks(runnableC0260a);
            }
            this.f.postDelayed(this.g, xx0.SCROLL_DELAYED);
            com.heytap.accessory.base.logging.a.e(i, "registered for SpaceAvailable callBack->  session: " + this.b);
        }
    }

    public final synchronized void f() {
        if (this.g == null) {
            com.heytap.accessory.base.logging.a.e(i, "Not giving dummy onSpaceAvailable() for sessionId: " + this.b + " as it's cancelled explicitly.");
        } else if (this.h != null) {
            com.heytap.accessory.base.logging.a.e(i, "giving dummy onSpaceAvailable() for sessionId: " + this.b);
            this.h.a(this.b, false);
            this.f.postDelayed(this.g, xx0.SCROLL_DELAYED);
        }
    }

    public synchronized boolean g() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.d) {
                RunnableC0260a runnableC0260a = this.g;
                if (runnableC0260a != null) {
                    this.f.removeCallbacks(runnableC0260a);
                    this.g = null;
                }
                this.d = false;
                z = true;
            }
        }
        return z;
        return z;
    }

    public String toString() {
        return "AFSession{mAccessoryId=" + this.a + ", mId=" + this.b + ", mChannelType=" + this.f2691c + '}';
    }

    public static long a(long j2) {
        long jNextInt;
        List<Long> copyOnWriteArrayList = k.get(Long.valueOf(j2));
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        long jB = b(j2);
        do {
            jNextInt = ((long) f2690j.nextInt((int) jB)) + 32;
        } while (copyOnWriteArrayList.contains(Long.valueOf(jNextInt)));
        copyOnWriteArrayList.add(Long.valueOf(jNextInt));
        k.put(Long.valueOf(j2), copyOnWriteArrayList);
        return jNextInt;
    }

    public e b() {
        return this.h;
    }

    public com.heytap.accessory.transport.b c() {
        return this.f2692e;
    }

    public synchronized void d() {
        e eVar;
        com.heytap.accessory.base.logging.a.a(i, "onSpaceAvailable()-> session: " + this.b);
        if (g() && (eVar = this.h) != null) {
            eVar.a(this.b, true);
        }
    }

    public void e() {
        this.h = null;
        com.heytap.accessory.transport.b bVar = this.f2692e;
        if (bVar != null) {
            bVar.u();
        }
        g();
        List<Long> list = k.get(Long.valueOf(this.a));
        if (list == null) {
            com.heytap.accessory.base.logging.a.e(i, "Session Pool for accessory: " + this.a + " is not found!");
            return;
        }
        list.remove(Long.valueOf(this.b));
        if (list.isEmpty()) {
            k.remove(Long.valueOf(this.a));
        }
    }

    public void a(e eVar) {
        this.h = eVar;
    }

    public boolean a(long j2, boolean z) {
        if (this.b == j2) {
            com.heytap.accessory.base.logging.a.c(i, "Obtained id is the same as the requested id!!");
            return true;
        }
        List<Long> list = k.get(Long.valueOf(this.a));
        if (list == null) {
            com.heytap.accessory.base.logging.a.e(i, "Session Pool for accessory: " + this.a + " is not found!");
            return false;
        }
        long jB = b(this.a) + 32;
        if (j2 == 1) {
            list.clear();
            this.b = j2;
            return true;
        }
        if (list.contains(Long.valueOf(j2))) {
            com.heytap.accessory.base.logging.a.e(i, "Session id: " + j2 + ", is already in use!");
            return false;
        }
        if (z && j2 > jB) {
            com.heytap.accessory.base.logging.a.e(i, "Session id: " + j2 + ", is beyond available session limit!");
            return false;
        }
        list.remove(Long.valueOf(this.b));
        list.add(Long.valueOf(j2));
        this.b = j2;
        return true;
    }

    public long a() {
        return this.b;
    }

    public void a(com.heytap.accessory.transport.b bVar) {
        this.f2692e = bVar;
    }

    public static String a(Map<Long, a> map) {
        HashMap map2 = new HashMap();
        for (Long l2 : map.keySet()) {
            a aVar = map.get(l2);
            if (aVar != null) {
                map2.put(l2, Long.valueOf(aVar.a()));
            }
        }
        return map2.toString();
    }
}
