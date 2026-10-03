package com.heytap.accessory.msgexp;

import android.os.Handler;
import android.util.ArrayMap;
import com.heytap.accessory.transport.d;
import com.oplus.aiunit.vision.nlk;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static final String h = "a";
    public long a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f2617c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.heytap.accessory.session.a f2618e;
    public Map<Integer, C0249a> f = new ArrayMap();
    public Map<String, Integer> b = new ArrayMap();
    public int g = 0;
    public int d = 0;

    /* JADX INFO: renamed from: com.heytap.accessory.msgexp.a$a, reason: collision with other inner class name */
    public static class C0249a {
        public long a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2619c;
        public boolean d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f2620e;
        public b f;

        public C0249a(int i, long j2, String str, String str2) {
            this.f2619c = i;
            this.a = j2;
            this.f2620e = str;
            this.b = str2;
        }

        public synchronized String a() {
            return this.b;
        }

        public synchronized void b(Handler handler) {
            b bVar = new b(this.f2619c, this.a);
            this.f = bVar;
            handler.postDelayed(bVar, 21000L);
            this.d = true;
        }

        public synchronized String c() {
            return this.f2620e;
        }

        public synchronized boolean d() {
            return this.d;
        }

        public synchronized void a(Handler handler) {
            b bVar = this.f;
            if (bVar != null) {
                handler.removeCallbacks(bVar);
            }
        }

        public synchronized int b() {
            return this.f2619c;
        }
    }

    public static class b implements Runnable {
        public long a;
        public int b;

        public b(int i, long j2) {
            this.b = i;
            this.a = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.msgexp.b.d().b(this.a, this.b, 10103);
        }
    }

    public a(long j2, com.heytap.accessory.session.a aVar, Handler handler) {
        this.a = j2;
        this.f2618e = aVar;
        this.f2617c = handler;
    }

    public static a a(long j2, Handler handler) {
        return new a(j2, com.heytap.accessory.session.a.d(j2), handler);
    }

    public synchronized String b(int i) {
        C0249a c0249a;
        c0249a = this.f.get(Integer.valueOf(i));
        return c0249a != null ? c0249a.a() : null;
    }

    public synchronized String c(int i) {
        C0249a c0249a;
        c0249a = this.f.get(Integer.valueOf(i));
        return c0249a != null ? c0249a.c() : null;
    }

    public synchronized boolean d(int i) {
        C0249a c0249a;
        c0249a = this.f.get(Integer.valueOf(i));
        return c0249a != null ? c0249a.d() : true;
    }

    public synchronized void e(int i) {
        C0249a c0249a = this.f.get(Integer.valueOf(i));
        if (c0249a != null) {
            c0249a.b(this.f2617c);
        }
    }

    public synchronized int a(String str, String str2) {
        C0249a c0249a;
        if (this.d == 65535) {
            this.d = 0;
        }
        int i = this.d + 1;
        this.d = i;
        c0249a = new C0249a(i, this.a, str, str2);
        this.f.put(Integer.valueOf(c0249a.b()), c0249a);
        return c0249a.b();
    }

    public synchronized com.heytap.accessory.session.a b() {
        return this.f2618e;
    }

    public final d c() {
        return d.f();
    }

    public synchronized void d() {
        this.g = 0;
        notify();
    }

    public synchronized void a(int i) {
        C0249a c0249aRemove = this.f.remove(Integer.valueOf(i));
        if (c0249aRemove != null) {
            c0249aRemove.a(this.f2617c);
            com.heytap.accessory.base.logging.a.d(h, "cleared transaction<" + i + ">");
        }
    }

    public synchronized void a() {
        this.g = 2;
        notify();
        for (C0249a c0249a : this.f.values()) {
            if (c0249a.d()) {
                c0249a.a(this.f2617c);
                com.heytap.accessory.msgexp.b.d().a(this.a, c0249a.c(), c0249a.a(), c0249a.b(), 10102);
            }
        }
        this.f.clear();
        this.b.clear();
        this.f2618e.e();
    }

    public synchronized void a(String str) {
        Iterator<C0249a> it = this.f.values().iterator();
        while (it.hasNext()) {
            C0249a next = it.next();
            if (str.equals(next.c()) && !next.d()) {
                com.heytap.accessory.base.logging.a.e(h, " - clearing incomplete transaction<" + next.b() + "> for Agent: " + str + "!!!");
                it.remove();
            }
        }
    }

    public synchronized int a(com.heytap.accessory.message.a aVar) {
        int i;
        i = 0;
        try {
            try {
                int iA = c().a(this.a, aVar);
                if (iA == 0) {
                    e(aVar.l());
                    com.heytap.accessory.base.logging.a.a(h, ">>> timeout started for transaction<" + aVar.l() + ">");
                    this.g = 0;
                    notify();
                } else {
                    if (this.g == 2) {
                        notify();
                    } else if (iA == -1) {
                        this.g = 1;
                        i = 10108;
                        this.f2618e.e(this.a);
                        loop0: while (true) {
                            int i2 = 10108;
                            while (true) {
                                try {
                                    if (this.g != 0) {
                                        this.g = 1;
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        wait(nlk.MIN_DELAY_MS);
                                        int i3 = this.g;
                                        if (i3 == 0 || (i3 == 1 && ((int) (System.currentTimeMillis() - jCurrentTimeMillis)) < 180000)) {
                                            break loop0;
                                            break loop0;
                                        }
                                        com.heytap.accessory.base.logging.a.e(h, "write failed for MessageExchange! - status: " + this.g);
                                        if (this.g == 2) {
                                            try {
                                                notify();
                                                i2 = 10110;
                                            } catch (InterruptedException unused) {
                                                i = 10110;
                                                com.heytap.accessory.base.logging.a.e(h, "write interrupted on MessageExchange session status: " + this.g);
                                                return i;
                                            }
                                        }
                                    } else {
                                        i = i2;
                                        break loop0;
                                    }
                                } catch (InterruptedException unused2) {
                                    i = i2;
                                }
                            }
                        }
                    }
                    i = 10110;
                }
            } catch (InterruptedException unused3) {
            }
        } catch (Throwable th) {
            a(aVar.l());
            aVar.f().recycle();
            throw th;
        }
        return i;
    }
}
