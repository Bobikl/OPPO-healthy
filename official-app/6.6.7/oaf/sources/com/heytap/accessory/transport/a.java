package com.heytap.accessory.transport;

import android.util.ArrayMap;
import com.heytap.accessory.base.AccessoryManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String c = "a";
    public a a;
    public static final Object b = new Object();
    public static Map<Long, Map<Long, b>> d = new ArrayMap();

    public interface a {
        void a(long j, com.heytap.accessory.transport.b bVar);

        void a(long j, com.heytap.accessory.transport.b bVar, List<com.heytap.accessory.message.b> list, List<com.heytap.accessory.message.b> list2);

        void a(com.heytap.accessory.transport.b bVar, long j);

        void b(long j, com.heytap.accessory.transport.b bVar);

        void c(long j, com.heytap.accessory.transport.b bVar);

        void d(long j, com.heytap.accessory.transport.b bVar);

        void e(long j, com.heytap.accessory.transport.b bVar);
    }

    public static class b implements Comparable<b> {
        public com.heytap.accessory.transport.acknowledge.a a;
        public com.heytap.accessory.transport.assemble.a b;
        public int c;
        public com.heytap.accessory.transport.b d;
        public com.heytap.accessory.transport.transmit.b e;
        public long f;

        public b(com.heytap.accessory.transport.b bVar, com.heytap.accessory.transport.assemble.a aVar, com.heytap.accessory.transport.transmit.b bVar2, com.heytap.accessory.transport.acknowledge.a aVar2, int i) {
            this.d = bVar;
            this.b = aVar;
            this.e = bVar2;
            this.a = aVar2;
            this.c = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (this.d.c() == bVar.d.c()) {
                long j = bVar.f;
                if (j == 0) {
                    return this.f != 0 ? 1 : 0;
                }
                long j2 = this.f;
                if (j2 > j) {
                    return 1;
                }
                return j2 < j ? -1 : 0;
            }
            if (this.d.c() == 3 || this.d.c() == 1) {
                return -1;
            }
            if (bVar.d.c() == 3 || bVar.d.c() == 1) {
                return 1;
            }
            return bVar.d.c() - this.d.c();
        }

        public void a(long j) {
            this.f = j;
        }
    }

    public a(a aVar) {
        this.a = aVar;
    }

    public final void a(long j, int i, int i2, int i3, long j2, int i4) {
        if (a(j, i2, j2)) {
            com.heytap.accessory.transport.credit.b.a().c(j, i, i2);
        } else if (i4 > 0) {
            com.heytap.accessory.transport.credit.b.a().a(j, i, i2, i3, i4);
        }
        for (com.heytap.accessory.base.bean.b bVar : AccessoryManager.h().a(i)) {
            synchronized (b) {
                Map<Long, b> map = d.get(Long.valueOf(bVar.l()));
                if (map != null) {
                    ArrayList<b> arrayList = new ArrayList(map.values());
                    try {
                        Collections.sort(arrayList);
                    } catch (Exception unused) {
                        com.heytap.accessory.base.logging.a.b(c, "resetCredits sort exception");
                    }
                    for (b bVar2 : arrayList) {
                        if (bVar2.d.c() != 3 && bVar2.d.b() == i2) {
                            com.heytap.accessory.transport.b bVar3 = bVar2.d;
                            if (bVar3.n() && !bVar3.p()) {
                                this.a.e(bVar.l(), bVar3);
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean b(long j, long j2) {
        b bVarD;
        synchronized (b) {
            bVarD = d(j, j2);
        }
        if (bVarD == null) {
            com.heytap.accessory.base.logging.a.e(c, "Failed to flush data for sessionId: " + j2 + " Sessiondetails not found in map!");
            return false;
        }
        com.heytap.accessory.transport.b bVar = bVarD.d;
        if (bVar.o()) {
            return true;
        }
        com.heytap.accessory.transport.credit.b.a().a(j, bVar.d(), bVar.b(), bVar.c());
        bVar.b(3);
        bVar.b(true);
        com.heytap.accessory.base.logging.a.a(c, "flush() : flush request sent for session id : " + j2);
        return false;
    }

    public void c(long j) {
        synchronized (b) {
            Map<Long, b> map = d.get(Long.valueOf(j));
            if (map != null) {
                Iterator<Map.Entry<Long, b>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    b value = it.next().getValue();
                    if (value != null) {
                        com.heytap.accessory.transport.b bVar = value.d;
                        if (bVar.k() == 3) {
                            if (!bVar.o()) {
                                bVar.c(0);
                            } else if (!bVar.p()) {
                                bVar.c(2);
                            }
                            value.e.a(2);
                            value.a.a(2);
                            this.a.d(j, bVar);
                        }
                    }
                }
                com.heytap.accessory.base.logging.a.d(c, "SessionQueues moved to EMPTY state");
            }
        }
    }

    public void d(long j) {
        com.heytap.accessory.base.logging.a.a(c, "handling dormant event...");
        synchronized (b) {
            Map<Long, b> map = d.get(Long.valueOf(j));
            if (map != null) {
                for (Map.Entry<Long, b> entry : map.entrySet()) {
                    com.heytap.accessory.base.logging.a.a(c, "session found = " + entry.getKey());
                    b value = entry.getValue();
                    if (value != null) {
                        value.e.a(1);
                        value.a.a(1);
                    }
                }
            }
        }
    }

    public boolean e(long j) {
        boolean zContainsKey;
        synchronized (b) {
            zContainsKey = d.containsKey(Long.valueOf(j));
        }
        return zContainsKey;
    }

    public void f(long j, long j2) {
        b bVarE;
        synchronized (b) {
            bVarE = e(j, j2);
        }
        a(j, bVarE);
    }

    public boolean g(long j) {
        boolean z;
        synchronized (b) {
            Map<Long, b> map = d.get(Long.valueOf(j));
            if (map != null) {
                Iterator<Map.Entry<Long, b>> it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<Long, b> next = it.next();
                        b value = next.getValue();
                        int iK = value.d.k();
                        if (iK != 2 && iK != 3) {
                            com.heytap.accessory.base.logging.a.e(c, "Session queue NOT EMPTY empty for sessionId: " + next.getKey() + "!");
                            break;
                        }
                        if (!value.e.b()) {
                            com.heytap.accessory.base.logging.a.e(c, "Re-Xmtter queue NOT EMPTY for sessionId: " + next.getKey() + "!");
                            break;
                        }
                        if (value.a.b()) {
                            com.heytap.accessory.base.logging.a.e(c, "ACK time out present for sessionId: " + next.getKey() + "!");
                            break;
                        }
                    } else {
                        z = true;
                    }
                }
            } else {
                com.heytap.accessory.base.logging.a.e(c, "Sessions not found for accessoryId: " + j + "!");
            }
            z = false;
        }
        return z;
    }

    public void h(long j) {
        synchronized (b) {
            Map<Long, b> map = d.get(Long.valueOf(j));
            if (map != null) {
                Iterator<Map.Entry<Long, b>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().d.c(3);
                }
            }
        }
        com.heytap.accessory.base.logging.a.e(c, "SessionQueues moved to SQ_STALLED state");
    }

    public final b e(long j, long j2) {
        Map<Long, b> map = d.get(Long.valueOf(j));
        b bVar = null;
        if (map != null) {
            b bVarRemove = map.remove(Long.valueOf(j2));
            bVar = bVarRemove != null ? bVarRemove : null;
            if (map.isEmpty()) {
                d.remove(Long.valueOf(j));
            }
        }
        return bVar;
    }

    public boolean f(long j) {
        boolean z;
        synchronized (b) {
            z = d(j, 1024L) != null;
        }
        return z;
    }

    public final b d(long j, long j2) {
        if (d.containsKey(Long.valueOf(j))) {
            return d.get(Long.valueOf(j)).get(Long.valueOf(j2));
        }
        return null;
    }

    public void b(long j) {
        Map<Long, b> mapRemove;
        synchronized (b) {
            mapRemove = d.remove(Long.valueOf(j));
        }
        int iD = -1;
        if (mapRemove != null) {
            Iterator<Map.Entry<Long, b>> it = mapRemove.entrySet().iterator();
            while (it.hasNext()) {
                b value = it.next().getValue();
                if (value != null) {
                    com.heytap.accessory.base.logging.a.d(c, "Clearing session queue:" + value.d.l());
                    iD = value.d.d();
                    a(j, value);
                }
            }
            mapRemove.clear();
        }
        b(j, iD, 0L);
    }

    public int c(long j, long j2) {
        b bVar;
        synchronized (b) {
            return (!d.containsKey(Long.valueOf(j)) || (bVar = d.get(Long.valueOf(j)).get(Long.valueOf(j2))) == null || bVar.b == null || !bVar.b.a()) ? 0 : 2;
        }
    }

    public b a(long j, com.heytap.accessory.transport.b bVar, com.heytap.accessory.message.b bVar2) {
        b bVar3;
        synchronized (b) {
            Map<Long, b> map = d.get(Long.valueOf(j));
            if (map == null) {
                bVar3 = null;
            } else if (map.get(Long.valueOf(bVar2.e())) == null) {
                com.heytap.accessory.base.logging.a.e(c, "Session already cleanedup : " + bVar2.e());
                if (bVar.l() == 1024 && !bVar.o()) {
                    this.a.a(j, bVar);
                }
                bVar3 = null;
            } else {
                bVar3 = map.get(Long.valueOf(bVar.l()));
            }
        }
        return bVar3;
    }

    public void b(long j, com.heytap.accessory.transport.b bVar) {
        synchronized (b) {
            if (bVar.o()) {
                this.a.c(j, bVar);
            }
        }
    }

    public int a(long j, com.heytap.accessory.message.a aVar) {
        int iA;
        long j2 = aVar.j();
        synchronized (b) {
            b bVarD = d(j, j2);
            if (bVarD != null) {
                iA = a(j, aVar, bVarD);
                if (iA == 0) {
                    if (bVarD.d.k() != 0) {
                        this.a.a(j, bVarD.d);
                    }
                    iA = 0;
                } else if (iA == 3) {
                    this.a.b(j, bVarD.d);
                    iA = -1;
                }
            } else {
                com.heytap.accessory.base.logging.a.b(c, "Error cannot find session with ID: " + j2);
                iA = -2;
            }
        }
        return iA;
    }

    public final void b(long j, int i, long j2) {
        if (a(j, -1, j2)) {
            com.heytap.accessory.transport.credit.b.a().a(j, i);
            for (com.heytap.accessory.base.bean.b bVar : AccessoryManager.h().a(i)) {
                synchronized (b) {
                    Map<Long, b> map = d.get(Long.valueOf(bVar.l()));
                    if (map != null) {
                        ArrayList<b> arrayList = new ArrayList(map.values());
                        try {
                            Collections.sort(arrayList);
                        } catch (Exception unused) {
                            com.heytap.accessory.base.logging.a.b(c, "resetCredits sort exception");
                        }
                        for (b bVar2 : arrayList) {
                            if (bVar2.d.c() != 3) {
                                com.heytap.accessory.transport.b bVar3 = bVar2.d;
                                if (bVar3.n() && !bVar3.p()) {
                                    this.a.e(bVar.l(), bVar3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(long j, long j2) {
        b bVarD = d(j, j2);
        if (bVarD != null && bVarD.d != null) {
            com.heytap.accessory.transport.b bVar = bVarD.d;
            if (bVar.c() != 3 && !bVar.o()) {
                com.heytap.accessory.transport.credit.b.a().a(j, bVar.d(), bVar.b(), bVar.c());
            }
            if (bVarD.a != null) {
                bVarD.a.a();
            }
            if (bVarD.e != null) {
                bVarD.e.a();
            }
            bVar.v();
            return;
        }
        com.heytap.accessory.base.logging.a.b(c, "cleanSessionCache failed. detailRecord or sessionQueue is null, " + j + ", " + j2);
    }

    public int a(long j, com.heytap.accessory.message.b bVar, b bVar2) {
        return bVar2.e.a(j, bVar);
    }

    public void a(long j, long j2, List<com.heytap.accessory.message.b> list, List<com.heytap.accessory.message.b> list2) {
        synchronized (b) {
            b bVarD = d(j, j2);
            if (bVarD != null) {
                com.heytap.accessory.transport.b bVar = bVarD.d;
                this.a.a(j, bVar, list, list2);
                if (bVar.o()) {
                    if (bVar.k() == 1 && bVar.c() != 3) {
                        com.heytap.accessory.transport.credit.b.a().a(j, bVar.d(), bVar.b(), bVar.c());
                    }
                    if (bVar.k() != 0) {
                        bVar.c(2);
                    }
                    this.a.a(bVar, j);
                } else {
                    bVar.c(0);
                    this.a.a(j, bVar);
                }
            }
        }
    }

    public void a(long j, long j2, boolean z, boolean z2) {
        String str = c;
        com.heytap.accessory.base.logging.a.a(str, "updateQueueStatus:  sendStatus = " + z + " isRetransmitPacket = " + z2);
        synchronized (b) {
            b bVarD = d(j, j2);
            if (bVarD != null) {
                com.heytap.accessory.transport.b bVar = bVarD.d;
                com.heytap.accessory.base.logging.a.a(str, "current sq sessionId:" + bVar.l() + ", current sq size:" + bVar.f());
                if (!z) {
                    bVar.c(1);
                    this.a.c(j, bVar);
                } else if (bVar.o()) {
                    if (bVar.c() != 3 && !z2) {
                        com.heytap.accessory.base.logging.a.a(str, "current sq is empty,decrementSessionCount:" + bVar.l());
                        com.heytap.accessory.transport.credit.b.a().a(j, bVar.d(), bVar.b(), bVar.c());
                    }
                    bVar.c(2);
                    this.a.a(bVar, j);
                } else {
                    bVar.c(0);
                    this.a.a(j, bVar);
                }
            }
        }
    }

    public void a(long j, com.heytap.accessory.misc.utils.d.b bVar) {
        b bVarD;
        synchronized (b) {
            bVarD = d(j, bVar.g);
        }
        if (bVarD == null) {
            com.heytap.accessory.base.logging.a.e(c, "Session Details not present for " + bVar.g);
            return;
        }
        byte b2 = bVar.d;
        if (b2 == 0) {
            c.a(bVar, bVarD.c);
            bVarD.a.a(bVar);
        } else {
            if (b2 != 1) {
                com.heytap.accessory.base.logging.a.e(c, "Unsupported Frame Type :" + ((int) bVar.d));
                return;
            }
            if (c.a(bVar)) {
                bVarD.e.a(bVar);
            }
        }
    }

    public void a(long j, int i, long j2, com.heytap.accessory.message.b bVar) {
        b bVarD;
        int iC = !bVar.c().f().isRecycled() ? bVar.c().c() : -1;
        synchronized (b) {
            bVarD = d(j, j2);
        }
        if (bVarD == null) {
            com.heytap.accessory.base.logging.a.e(c, "Session Details not present for " + j2);
            return;
        }
        bVarD.e.b(j, bVar);
        a(j, bVarD.d.d(), i, bVarD.d.c(), j2, iC);
    }

    public void a(long j, com.heytap.accessory.message.b bVar) {
        synchronized (b) {
            b bVarD = d(j, 1024L);
            if (bVarD != null) {
                com.heytap.accessory.transport.b bVar2 = bVarD.d;
                bVar2.a(bVar);
                this.a.a(j, bVar2);
            } else {
                com.heytap.accessory.base.logging.a.b(c, "Session Details not present for Ack !");
            }
        }
    }

    public void a(long j) {
        if (e(j)) {
            return;
        }
        synchronized (b) {
            d.put(Long.valueOf(j), new ArrayMap());
        }
    }

    public void a(long j, long j2, b bVar) {
        synchronized (b) {
            if (!d.containsKey(Long.valueOf(j))) {
                d.put(Long.valueOf(j), new ArrayMap());
            }
            com.heytap.accessory.base.logging.a.c(c, "updateRecord accessoryId:" + j + ",sessionId:" + j2 + ",SessionDetailRecord sessionId:" + bVar.d.l());
            d.get(Long.valueOf(j)).put(Long.valueOf(j2), bVar);
        }
    }

    public boolean a(long j, List<Long> list) {
        boolean z;
        synchronized (b) {
            z = d.containsKey(Long.valueOf(j)) && d.get(Long.valueOf(j)).keySet().containsAll(list);
        }
        return z;
    }

    public final int a(long j, com.heytap.accessory.message.a aVar, b bVar) {
        long j2 = aVar.j();
        com.heytap.accessory.transport.b bVar2 = bVar.d;
        if (bVar2.l() != j2) {
            com.heytap.accessory.base.logging.a.b(c, "Session id mismatch! Requested Session: " + j2 + " Found session: " + bVar2.l());
            return -2;
        }
        if (bVar2.k() == 3) {
            com.heytap.accessory.base.logging.a.e(c, "SessionQueue[" + j2 + "] is in STALLED state! accessoryId: " + j);
            return 3;
        }
        a(j, bVar2);
        if (bVar2.c() != 3) {
            if (!com.heytap.accessory.transport.credit.b.a().a(j, bVar2.d(), bVar2.b(), bVar2.c(), aVar.c(), bVar2.k() == 2)) {
                com.heytap.accessory.base.logging.a.e(c, "Rejecting this packet. No sufficient credits for session : " + j2);
                bVar2.a(true);
                return -1;
            }
        }
        List<com.heytap.accessory.message.b> listB = bVar.b.b(j, aVar);
        if (listB == null) {
            com.heytap.accessory.base.logging.a.b(c, "Error while preparing fragments for session : " + j2);
            return -4;
        }
        for (com.heytap.accessory.message.b bVar3 : listB) {
            bVar3.a(bVar2.b());
            com.heytap.accessory.base.logging.a.d(c, "add to sessionQueue, " + bVar3.d());
            bVar2.a(bVar3);
        }
        com.heytap.accessory.base.d.b(j);
        return 0;
    }

    public final void a(long j, com.heytap.accessory.transport.b bVar) {
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.e(c, "checkSessionQueueType:unexpected connect!");
            return;
        }
        if (bVarA.o() == 0) {
            if (bVar.b() != 1) {
                com.heytap.accessory.base.logging.a.e(c, "Not support, channel type error : " + bVar.c());
                bVar.a(1);
                return;
            }
            return;
        }
        if (bVar.b() == 1 || bVar.b() == 3) {
            return;
        }
        List<Integer> listA = com.heytap.accessory.connectivity.negotiation.b.b().a(j);
        if (listA == null || !listA.contains(Integer.valueOf(bVar.c()))) {
            com.heytap.accessory.base.logging.a.e(c, "Not nego for now, type " + bVar.c());
            bVar.a(1);
        }
    }

    public final boolean a(long j, int i, long j2) {
        synchronized (b) {
            Map<Long, b> map = d.get(Long.valueOf(j));
            if (map != null) {
                if (AccessoryManager.h().a(j) != null && i != -1) {
                    Iterator<Map.Entry<Long, b>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        com.heytap.accessory.transport.b bVar = it.next().getValue().d;
                        if (bVar != null && bVar.b() == i && !bVar.o() && bVar.k() != 1 && bVar.k() != 3) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return true;
        }
    }

    public final void a(long j, b bVar) {
        if (bVar != null) {
            com.heytap.accessory.transport.b bVar2 = bVar.d;
            this.a.c(j, bVar2);
            if (bVar2.c() != 3 && !bVar2.o()) {
                com.heytap.accessory.transport.credit.b.a().a(j, bVar2.d(), bVar2.b(), bVar2.c());
            }
            if (bVar.a != null) {
                bVar.a.a();
            }
            if (bVar.e != null) {
                bVar.e.a();
            }
            bVar2.u();
        }
    }
}
