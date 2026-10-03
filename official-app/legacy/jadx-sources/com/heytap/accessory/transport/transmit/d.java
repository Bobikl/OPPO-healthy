package com.heytap.accessory.transport.transmit;

import android.os.Handler;
import android.os.Looper;
import com.oplus.aiunit.vision.xnl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
public class d implements com.heytap.accessory.transport.transmit.b {
    public static final String m = "d";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Handler f2805n;
    public final long a;
    public final int b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.heytap.accessory.transport.transmit.a f2807e;
    public long h;
    public boolean i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2809l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2806c = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2808j = 0;
    public long k = 0;
    public final TreeMap<Long, b> f = new TreeMap<>();
    public com.heytap.accessory.transport.transmit.c g = com.heytap.accessory.transport.transmit.c.a;
    public final c d = new c();

    public static class b {
        public final com.heytap.accessory.message.b a;
        public int b;

        public b(com.heytap.accessory.message.b bVar) {
            this.a = bVar;
            this.b = 0;
        }
    }

    public final class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.base.logging.a.e(d.m, "Timer expired for BlockAck, sess:" + d.this.h);
            d.this.i = false;
            synchronized (d.this.f2806c) {
                if (d.this.g != null) {
                    com.heytap.accessory.transport.transmit.c cVar = d.this.g;
                    d dVar = d.this;
                    cVar.a(dVar, dVar.h);
                }
            }
        }

        public c() {
        }
    }

    static {
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("daemon");
        if (looperB != null) {
            f2805n = new Handler(looperB);
        }
    }

    public d(long j2, long j3, com.heytap.accessory.transport.transmit.a aVar, int i) {
        this.a = j2;
        this.h = j3;
        this.f2807e = aVar;
        this.b = i;
    }

    public void d() {
        Iterator<Map.Entry<Long, b>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            b value = it.next().getValue();
            if (value != null && value.a.f() == 0) {
                value.a.c().f().recycle();
            }
        }
        this.f.clear();
    }

    public List<com.heytap.accessory.message.b> e() {
        if (this.f.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Long l2 : this.f.descendingKeySet()) {
            b bVar = this.f.get(l2);
            if (bVar == null) {
                com.heytap.accessory.base.logging.a.e(m, "Message details not found for key " + l2);
            } else {
                arrayList.add(bVar.a);
            }
        }
        return arrayList;
    }

    public boolean f(long j2) {
        if ((j2 <= 10 && this.f2808j >= 65526) || j2 > this.f2808j) {
            return false;
        }
        com.heytap.accessory.base.logging.a.d(m, "Received Duplicate Block Ack with SeqNum:" + j2);
        return true;
    }

    public boolean g(long j2) {
        return this.f.containsKey(Long.valueOf(j2));
    }

    public boolean h(long j2) {
        b bVar = this.f.get(Long.valueOf(j2));
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(m, "Message details not found for seqNum " + j2);
            return false;
        }
        int i = bVar.b;
        if (i < 10) {
            bVar.b = i + 1;
            return true;
        }
        com.heytap.accessory.base.logging.a.e(m, "RETRY ATTEMPTS Exhausted");
        return false;
    }

    public com.heytap.accessory.transport.transmit.c i() {
        com.heytap.accessory.transport.transmit.c cVar;
        synchronized (this.f2806c) {
            cVar = this.g;
        }
        return cVar;
    }

    public long j() {
        return this.h;
    }

    public boolean k() {
        return this.f.isEmpty();
    }

    public boolean l() {
        if (this.f.size() < 10) {
            return false;
        }
        com.heytap.accessory.base.logging.a.d(m, "Current window size has reached Max window size");
        return true;
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public void b(long j2, com.heytap.accessory.message.b bVar) {
        synchronized (this.f2806c) {
            com.heytap.accessory.transport.transmit.c cVar = this.g;
            if (cVar != null) {
                cVar.a(this, bVar);
            }
        }
    }

    public void g() {
        Handler handler = f2805n;
        if (handler != null) {
            if (this.b == 16) {
                handler.postDelayed(this.d, 30000L);
            } else {
                handler.postDelayed(this.d, 10000L);
            }
            this.i = true;
        }
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public int a(long j2, com.heytap.accessory.message.b bVar) {
        synchronized (this.f2806c) {
            com.heytap.accessory.transport.transmit.c cVar = this.g;
            if (cVar == null) {
                return 1;
            }
            return cVar.b(this, bVar);
        }
    }

    public int c(com.heytap.accessory.message.b bVar) {
        com.heytap.accessory.message.b bVar2 = (this.b != 2 || bVar.c().g() <= 12275) ? bVar : new com.heytap.accessory.message.b(bVar);
        com.heytap.accessory.base.logging.a.d(m, "Msg sent to CL seq#:" + bVar2.c().i());
        return this.f2807e.a(this.a, this.h, bVar2);
    }

    public void f() {
        this.f2807e.a(this.a, this.h);
        d();
    }

    public final long i(long j2) {
        return j2 > xnl.PAYLOAD_SHORT_MAX ? j2 % xnl.PAYLOAD_SHORT_MAX : j2;
    }

    public void b(com.heytap.accessory.message.b bVar) {
        if (this.f.get(Long.valueOf(bVar.c().i())) == null && bVar.f() == 0) {
            com.heytap.accessory.base.logging.a.d(m, "Buffer is recycled ..");
            bVar.c().f().recycle();
        }
    }

    public int d(long j2) {
        return a(i(this.k), j2);
    }

    public void h() {
        Handler handler = f2805n;
        if (handler != null) {
            handler.removeCallbacks(this.d);
            this.i = false;
        }
    }

    public List<com.heytap.accessory.message.b> c(long j2) {
        long j3 = j2 - 1;
        com.heytap.accessory.base.logging.a.e(m, "Advance window - NAK seq#:" + j3);
        return a(j3);
    }

    public int e(long j2) {
        return a(i(this.k + 1), j2);
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public void a(com.heytap.accessory.misc.utils.d.b bVar) {
        synchronized (this.f2806c) {
            com.heytap.accessory.transport.transmit.c cVar = this.g;
            if (cVar != null) {
                cVar.a(this, bVar);
            }
        }
        bVar.f2614e.f().recycle();
    }

    public List<com.heytap.accessory.message.b> b(long j2) {
        com.heytap.accessory.base.logging.a.d(m, "Advance window - BlockAck seq#:" + j2);
        return a(j2);
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public boolean b() {
        return k();
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public void a() {
        synchronized (this.f2806c) {
            com.heytap.accessory.transport.transmit.c cVar = this.g;
            if (cVar != null) {
                cVar.c(this);
            }
        }
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public void a(int i) {
        if (i == 1) {
            com.heytap.accessory.base.logging.a.a(m, "connection moved to dormant");
            if (this.i) {
                h();
                this.f2809l = true;
                return;
            }
            return;
        }
        if (i == 2) {
            String str = m;
            com.heytap.accessory.base.logging.a.a(str, "connection is active");
            if (this.f2809l) {
                com.heytap.accessory.base.logging.a.a(str, "restarting ack timer");
                Handler handler = f2805n;
                if (handler != null) {
                    handler.postDelayed(this.d, 5000L);
                    this.i = true;
                }
                this.f2809l = false;
                return;
            }
            return;
        }
        com.heytap.accessory.base.logging.a.a(m, "unknown state received = " + i);
    }

    public void a(boolean z, boolean z2) {
        this.f2807e.a(this.a, this.h, z, z2);
    }

    public void a(com.heytap.accessory.message.b bVar) {
        b bVar2 = new b(bVar);
        long jI = bVar.c().i();
        this.f.put(Long.valueOf(jI), bVar2);
        this.k = jI;
    }

    public List<com.heytap.accessory.message.b> a(List<com.heytap.accessory.misc.utils.d.a> list) {
        long size = list.size();
        com.heytap.accessory.base.logging.a.e(m, "Retrieving NAK packets # of Holes:" + size);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            com.heytap.accessory.misc.utils.d.a aVar = list.get(i);
            if (aVar.b() <= aVar.a()) {
                NavigableMap<Long, b> navigableMapSubMap = this.f.subMap(Long.valueOf(aVar.b()), true, Long.valueOf(aVar.a()), true);
                Iterator<Long> it = navigableMapSubMap.keySet().iterator();
                while (it.hasNext()) {
                    b bVar = this.f.get(it.next());
                    if (bVar != null) {
                        arrayList.add(bVar.a);
                    }
                }
                com.heytap.accessory.base.logging.a.e(m, "NAK Msgs in Hole " + (i + 1) + " : " + navigableMapSubMap.keySet());
            } else if (aVar.b() >= 65526 && aVar.a() <= 10) {
                NavigableMap<Long, b> navigableMapSubMap2 = this.f.subMap(Long.valueOf(aVar.b()), true, Long.valueOf(xnl.PAYLOAD_SHORT_MAX), true);
                NavigableMap<Long, b> navigableMapSubMap3 = this.f.subMap(1L, true, Long.valueOf(aVar.a()), true);
                Iterator<Long> it2 = navigableMapSubMap2.keySet().iterator();
                while (it2.hasNext()) {
                    b bVar2 = this.f.get(it2.next());
                    if (bVar2 != null) {
                        arrayList.add(bVar2.a);
                    }
                }
                Iterator<Long> it3 = navigableMapSubMap3.keySet().iterator();
                while (it3.hasNext()) {
                    b bVar3 = this.f.get(it3.next());
                    if (bVar3 != null) {
                        arrayList.add(bVar3.a);
                    }
                }
                com.heytap.accessory.base.logging.a.e(m, "NAK Msgs in Hole " + (i + 1) + " : " + navigableMapSubMap2.keySet() + " , " + navigableMapSubMap3.keySet());
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public void a(List<com.heytap.accessory.message.b> list, List<com.heytap.accessory.message.b> list2) {
        this.f2807e.a(this.a, this.h, list, list2);
    }

    public void a(com.heytap.accessory.transport.transmit.c cVar) {
        synchronized (this.f2806c) {
            this.g = cVar;
        }
    }

    public final int a(long j2, long j3) {
        if (j3 == j2) {
            com.heytap.accessory.base.logging.a.d(m, "TP_EXPECTED : " + j3);
            return 0;
        }
        if (j3 <= this.f2808j) {
            com.heytap.accessory.base.logging.a.d(m, "ACKNOWLEDGED : " + j3);
            return 3;
        }
        if (j3 < j2) {
            com.heytap.accessory.base.logging.a.d(m, "RETRANSMIT : " + j3);
            return 1;
        }
        com.heytap.accessory.base.logging.a.d(m, "UNEXPECTED : " + j3);
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    public final List<com.heytap.accessory.message.b> a(long j2) {
        NavigableMap<Long, b> navigableMapTailMap;
        NavigableMap<Long, b> navigableMapHeadMap = this.f.headMap(Long.valueOf(j2), true);
        ArrayList arrayList = null;
        if (j2 <= 10) {
            long j3 = this.f2808j;
            if (j3 >= 65526) {
                navigableMapTailMap = this.f.tailMap(Long.valueOf(j3), true);
            } else {
                navigableMapTailMap = null;
            }
        } else {
            navigableMapTailMap = null;
        }
        if (!navigableMapHeadMap.isEmpty()) {
            arrayList = new ArrayList();
            Iterator<Long> it = navigableMapHeadMap.keySet().iterator();
            while (it.hasNext()) {
                b bVar = this.f.get(it.next());
                if (bVar != null) {
                    arrayList.add(bVar.a);
                }
            }
            if (navigableMapTailMap != null && !navigableMapTailMap.isEmpty()) {
                Iterator<Long> it2 = navigableMapTailMap.keySet().iterator();
                while (it2.hasNext()) {
                    b bVar2 = this.f.get(it2.next());
                    if (bVar2 != null) {
                        arrayList.add(bVar2.a);
                    }
                }
            }
            com.heytap.accessory.base.logging.a.d(m, "Msgs Acknowledged : " + navigableMapHeadMap.keySet());
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                this.f.remove(Long.valueOf(((com.heytap.accessory.message.b) it3.next()).c().i()));
            }
            this.f2808j = j2;
        }
        return arrayList;
    }
}
