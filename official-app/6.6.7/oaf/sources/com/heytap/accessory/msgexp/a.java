package com.heytap.accessory.msgexp;

import android.os.Handler;
import android.util.ArrayMap;
import com.heytap.accessory.BaseMessage;
import com.heytap.accessory.transport.d;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String h = "a";
    public long a;
    public Handler c;
    public com.heytap.accessory.session.a e;
    public Map<Integer, a> f = new ArrayMap();
    public Map<String, Integer> b = new ArrayMap();
    public int g = 0;
    public int d = 0;

    public static class a {
        public long a;
        public String b;
        public int c;
        public boolean d = false;
        public String e;
        public b f;

        public a(int i, long j, String str, String str2) {
            this.c = i;
            this.a = j;
            this.e = str;
            this.b = str2;
        }

        public synchronized String a() {
            return this.b;
        }

        public synchronized void b(Handler handler) {
            b bVar = new b(this.c, this.a);
            this.f = bVar;
            handler.postDelayed(bVar, 21000L);
            this.d = true;
        }

        public synchronized String c() {
            return this.e;
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
            return this.c;
        }
    }

    public static class b implements Runnable {
        public long a;
        public int b;

        public b(int i, long j) {
            this.b = i;
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.msgexp.b.d().b(this.a, this.b, 10103);
        }
    }

    public a(long j, com.heytap.accessory.session.a aVar, Handler handler) {
        this.a = j;
        this.e = aVar;
        this.c = handler;
    }

    public static a a(long j, Handler handler) {
        return new a(j, com.heytap.accessory.session.a.d(j), handler);
    }

    public synchronized String b(int i) {
        a aVar;
        aVar = this.f.get(Integer.valueOf(i));
        return aVar != null ? aVar.a() : null;
    }

    public synchronized String c(int i) {
        a aVar;
        aVar = this.f.get(Integer.valueOf(i));
        return aVar != null ? aVar.c() : null;
    }

    public synchronized boolean d(int i) {
        a aVar;
        aVar = this.f.get(Integer.valueOf(i));
        return aVar != null ? aVar.d() : true;
    }

    public synchronized void e(int i) {
        a aVar = this.f.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.b(this.c);
        }
    }

    public synchronized int a(String str, String str2) {
        a aVar;
        if (this.d == 65535) {
            this.d = 0;
        }
        int i = this.d + 1;
        this.d = i;
        aVar = new a(i, this.a, str, str2);
        this.f.put(Integer.valueOf(aVar.b()), aVar);
        return aVar.b();
    }

    public synchronized com.heytap.accessory.session.a b() {
        return this.e;
    }

    public final d c() {
        return d.f();
    }

    public synchronized void d() {
        this.g = 0;
        notify();
    }

    public synchronized void a(int i) {
        a aVarRemove = this.f.remove(Integer.valueOf(i));
        if (aVarRemove != null) {
            aVarRemove.a(this.c);
            com.heytap.accessory.base.logging.a.d(h, "cleared transaction<" + i + ">");
        }
    }

    public synchronized void a() {
        this.g = 2;
        notify();
        for (a aVar : this.f.values()) {
            if (aVar.d()) {
                aVar.a(this.c);
                com.heytap.accessory.msgexp.b.d().a(this.a, aVar.c(), aVar.a(), aVar.b(), 10102);
            }
        }
        this.f.clear();
        this.b.clear();
        this.e.e();
    }

    public synchronized void a(String str) {
        Iterator<a> it = this.f.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
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
                        i = BaseMessage.ERROR_TIMED_OUT;
                        this.e.e(this.a);
                        loop0: while (true) {
                            int i2 = 10108;
                            while (true) {
                                try {
                                    if (this.g != 0) {
                                        this.g = 1;
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        wait(180000L);
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
