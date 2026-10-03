package com.heytap.accessory.transport;

import android.util.ArrayMap;
import java.io.Serializable;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ArrayMap<Integer, Integer> f2801e;
    public static long f;
    public final PriorityBlockingQueue<com.heytap.accessory.transport.b> a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2802c;
    public int d;

    public static class b implements Comparator<com.heytap.accessory.transport.b>, Serializable {
        private static final long serialVersionUID = -7972841923213950758L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.heytap.accessory.transport.b bVar, com.heytap.accessory.transport.b bVar2) {
            com.heytap.accessory.base.logging.a.a("TransportQueue", "compare " + bVar.l() + " , " + bVar.c() + " , " + bVar.m() + " , " + bVar.i() + " , " + bVar2.l() + " , " + bVar2.c() + " , " + bVar2.m() + " , " + bVar2.c());
            if (bVar.c() != bVar2.c()) {
                return !(e.b(bVar.c(), bVar2.c()) > 0) ? 1 : -1;
            }
            if (bVar.i() != bVar2.i()) {
                return bVar.i() < bVar2.i() ? -1 : 1;
            }
            com.heytap.accessory.message.b bVarS = bVar.s();
            com.heytap.accessory.message.b bVarS2 = bVar2.s();
            if (bVarS == null || bVarS2 == null) {
                return bVar.m() <= bVar2.m() ? -1 : 1;
            }
            return !(bVarS.g() <= bVarS2.g()) ? 1 : -1;
        }

        public b() {
        }
    }

    static {
        ArrayMap<Integer, Integer> arrayMap = new ArrayMap<>();
        f2801e = arrayMap;
        arrayMap.put(0, 0);
        arrayMap.put(2, 1);
        arrayMap.put(1, 2);
        arrayMap.put(3, 3);
    }

    public e() {
        this.a = new PriorityBlockingQueue<>(16, new b());
        this.b = -1L;
        this.f2802c = 1;
        this.d = 1;
    }

    public static int b(int i, int i2) {
        ArrayMap<Integer, Integer> arrayMap = f2801e;
        if (arrayMap.get(Integer.valueOf(i)).intValue() > arrayMap.get(Integer.valueOf(i2)).intValue()) {
            return 1;
        }
        return arrayMap.get(Integer.valueOf(i)).equals(arrayMap.get(Integer.valueOf(i2))) ? 0 : -1;
    }

    public synchronized boolean c() {
        return this.f2802c == 0;
    }

    public synchronized void d() {
        this.f2802c = 0;
    }

    public synchronized com.heytap.accessory.transport.b e() {
        com.heytap.accessory.transport.b bVarPoll = this.a.poll();
        if (bVarPoll == null) {
            return null;
        }
        com.heytap.accessory.transport.b bVarPeek = this.a.peek();
        if (bVarPeek != null && bVarPeek.c() == bVarPoll.c()) {
            if (bVarPoll.i() < bVarPeek.i() - 3) {
                bVarPoll.c(bVarPeek.i());
            } else {
                bVarPoll.w();
            }
        }
        this.a.add(bVarPoll);
        return bVarPoll;
    }

    public synchronized void f() {
        this.f2802c = 1;
    }

    public synchronized int g() {
        return this.a.size();
    }

    public synchronized boolean a(com.heytap.accessory.transport.b bVar) {
        bVar.b(f);
        f++;
        if (this.a.contains(bVar)) {
            return false;
        }
        return this.a.add(bVar);
    }

    public synchronized boolean b(com.heytap.accessory.transport.b bVar) {
        return this.a.remove(bVar);
    }

    public synchronized int b() {
        return this.d;
    }

    public e(long j2, int i) {
        this.a = new PriorityBlockingQueue<>(16, new b());
        this.f2802c = 1;
        this.b = j2;
        this.d = i;
    }

    public synchronized long a() {
        return this.b;
    }
}
