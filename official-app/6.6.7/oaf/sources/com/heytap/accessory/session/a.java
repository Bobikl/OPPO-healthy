package com.heytap.accessory.session;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String i = "a";
    public static SecureRandom j = new SecureRandom();
    public static Map<Long, List<Long>> k = new ConcurrentHashMap();
    public long a;
    public long b;
    public boolean d;
    public com.heytap.accessory.transport.b e;
    public Handler f;
    public a g;
    public int c = 1;
    public e h = null;

    public static final class a implements Runnable {
        public static final String b = "a";
        public WeakReference<a> a;

        public a(a aVar) {
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
            a aVar = this.g;
            if (aVar == null) {
                this.g = new a(this);
            } else {
                this.f.removeCallbacks(aVar);
            }
            this.f.postDelayed(this.g, 4000L);
            com.heytap.accessory.base.logging.a.e(i, "registered for SpaceAvailable callBack->  session: " + this.b);
        }
    }

    public final synchronized void f() {
        if (this.g == null) {
            com.heytap.accessory.base.logging.a.e(i, "Not giving dummy onSpaceAvailable() for sessionId: " + this.b + " as it's cancelled explicitly.");
        } else if (this.h != null) {
            com.heytap.accessory.base.logging.a.e(i, "giving dummy onSpaceAvailable() for sessionId: " + this.b);
            this.h.a(this.b, false);
            this.f.postDelayed(this.g, 4000L);
        }
    }

    public synchronized boolean g() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.d) {
                a aVar = this.g;
                if (aVar != null) {
                    this.f.removeCallbacks(aVar);
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
        return "AFSession{mAccessoryId=" + this.a + ", mId=" + this.b + ", mChannelType=" + this.c + '}';
    }

    public static long a(long j2) {
        long jNextInt;
        List<Long> copyOnWriteArrayList = k.get(Long.valueOf(j2));
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        long jB = b(j2);
        do {
            jNextInt = ((long) j.nextInt((int) jB)) + 32;
        } while (copyOnWriteArrayList.contains(Long.valueOf(jNextInt)));
        copyOnWriteArrayList.add(Long.valueOf(jNextInt));
        k.put(Long.valueOf(j2), copyOnWriteArrayList);
        return jNextInt;
    }

    public e b() {
        return this.h;
    }

    public com.heytap.accessory.transport.b c() {
        return this.e;
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
        com.heytap.accessory.transport.b bVar = this.e;
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
        this.e = bVar;
    }

    public static String a(Map<Long, a> map) {
        HashMap map2 = new HashMap();
        for (Long l : map.keySet()) {
            a aVar = map.get(l);
            if (aVar != null) {
                map2.put(l, Long.valueOf(aVar.a()));
            }
        }
        return map2.toString();
    }
}
