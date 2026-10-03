package com.heytap.accessory.connectivity;

import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.pair.connectivity.bt.BtRfConnection;
import com.heytap.accessory.utils.buffer.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public static final String e = "c";
    public static volatile c f;
    public Map<Long, com.heytap.accessory.connectivity.a> a = new ConcurrentHashMap();
    public final Map<Long, Map<Integer, f>> b = new ConcurrentHashMap();
    public final Map<Long, List<Buffer>> c = new ConcurrentHashMap();
    public com.heytap.accessory.connectivity.interfaces.a d = new a();

    public class a implements com.heytap.accessory.connectivity.interfaces.a {
        public a() {
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public int a(long j, int i, Buffer buffer) {
            return c.this.a(j, i, buffer);
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public void a(long j, int i, int i2, int i3) {
            c.this.b(j, i, i2, i3);
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public void a(long j, int i, long j2, com.heytap.accessory.message.b bVar) {
            c.this.a(j, i, j2, bVar);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ com.heytap.accessory.connectivity.a a;

        public b(c cVar, com.heytap.accessory.connectivity.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.e();
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ com.heytap.accessory.connectivity.a a;

        public c(c cVar, com.heytap.accessory.connectivity.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d();
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ com.heytap.accessory.connectivity.a a;

        public d(c cVar, com.heytap.accessory.connectivity.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.connectivity.a aVar = this.a;
            if (aVar instanceof com.heytap.accessory.connectivity.ble.d) {
                ((com.heytap.accessory.connectivity.ble.d) aVar).l();
            }
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ com.heytap.accessory.connectivity.a a;
        public final /* synthetic */ com.heytap.accessory.base.bean.b b;
        public final /* synthetic */ com.heytap.accessory.connectivity.interfaces.a c;

        public e(c cVar, com.heytap.accessory.connectivity.a aVar, com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar2) {
            this.a = aVar;
            this.b = bVar;
            this.c = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    public static class f {
        public com.heytap.accessory.connectivity.a a;
        public com.heytap.accessory.connectivity.interfaces.a b;

        public /* synthetic */ f(com.heytap.accessory.connectivity.interfaces.a aVar, com.heytap.accessory.connectivity.a aVar2, a aVar3) {
            this(aVar, aVar2);
        }

        public f(com.heytap.accessory.connectivity.interfaces.a aVar, com.heytap.accessory.connectivity.a aVar2) {
            this.a = aVar2;
            this.b = aVar;
        }
    }

    public static int a(int i, int i2) {
        return i2 == 1 ? 6 : 2;
    }

    public static c b() {
        if (f == null) {
            synchronized (c.class) {
                if (f == null) {
                    f = new c();
                }
            }
        }
        return f;
    }

    public boolean c() {
        Iterator<Map<Integer, f>> it = this.b.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator<f> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                if (it2.next().a instanceof com.heytap.accessory.connectivity.bt.b) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public boolean d(com.heytap.accessory.base.bean.b bVar) {
        return b(bVar, 1);
    }

    public static int a(int i, int i2, int i3) {
        int iA = a(i2, i3);
        if (i != 2 && i != 1) {
            if (i == 4) {
                return 235;
            }
            com.heytap.accessory.base.logging.a.b(e, "Invalid connection type: " + i);
            return 0;
        }
        return iA + BtRfConnection.MAXIMUM_PAYLOAD_SIZE_IN_BYTES;
    }

    public static int a(long j, int i, int i2, int i3) {
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
        int iV = bVarA != null ? bVarA.v() : 0;
        if (iV != 0) {
            return iV;
        }
        int iA = a(i, i2, i3);
        com.heytap.accessory.base.logging.a.e(e, "Using default limit " + iA);
        return iA;
    }

    public void c(int i, int i2) {
        com.heytap.accessory.connectivity.interfaces.c cVarB = b(i, i2);
        if (cVarB != null) {
            cVarB.a(i2);
        }
    }

    public com.heytap.accessory.connectivity.a c(com.heytap.accessory.base.bean.b bVar) {
        return a(bVar, 1);
    }

    public void b(long j, int i, int i2, int i3) {
        String str = e;
        com.heytap.accessory.base.logging.a.c(str, "Connection state changed. accessoryId:" + j + " status:" + i2);
        Map<Integer, f> map = this.b.get(Long.valueOf(j));
        if (map == null) {
            com.heytap.accessory.base.logging.a.e(str, "mConnectionDetailsMap for accessoryId:" + j + " is empty!");
            return;
        }
        f fVar = map.get(Integer.valueOf(i));
        if (fVar == null) {
            com.heytap.accessory.base.logging.a.e(str, "No Connection details found!");
            return;
        }
        if (i2 == 1) {
            fVar.a.f();
            fVar.a.g();
            fVar.b.a(j, i, 2, i3);
            if (i != 1) {
                f fVar2 = map.get(1);
                if (fVar2 == null) {
                    com.heytap.accessory.base.logging.a.e(str, "ConnectionDetails for channelType:1 is empty!");
                    return;
                } else {
                    fVar.b = fVar2.b;
                    return;
                }
            }
            return;
        }
        if (i2 == 4) {
            fVar.b.a(j, i, 1, i3);
            return;
        }
        if (i2 != 6) {
            f fVarRemove = map.remove(Integer.valueOf(i));
            if (fVarRemove != null) {
                a(fVarRemove.a);
                fVarRemove.b.a(j, i, 0, i3);
                return;
            }
            return;
        }
        f fVarRemove2 = map.remove(Integer.valueOf(i));
        if (fVarRemove2 != null) {
            fVarRemove2.b.a(j, i, 0, i3);
        }
    }

    public void a(long j, int i, com.heytap.accessory.connectivity.interfaces.a aVar) {
        f fVar = this.b.get(Long.valueOf(j)).get(Integer.valueOf(i));
        if (fVar != null) {
            fVar.b = aVar;
            List<Buffer> list = this.c.get(Long.valueOf(j));
            if (list != null) {
                com.heytap.accessory.base.logging.a.c(e, "Attempting redelivery of packets for accessory : " + j);
                Iterator<Buffer> it = list.iterator();
                synchronized (list) {
                    while (it.hasNext()) {
                        if (aVar.a(j, i, it.next()) == 0) {
                            it.remove();
                        }
                    }
                }
                return;
            }
            return;
        }
        com.heytap.accessory.base.logging.a.b(e, "Connection Details Map does not contain the accessory id : " + j);
    }

    public int a(long j, int i, Buffer buffer) {
        int iA;
        f fVar = this.b.get(Long.valueOf(j)).get(Integer.valueOf(i));
        if (fVar != null) {
            synchronized (fVar) {
                iA = fVar.b.a(j, i, buffer);
            }
            if (iA == 0) {
                return 0;
            }
            com.heytap.accessory.base.logging.a.e(e, "Could not deliver packet to upper layer for accessory : " + j);
            List<Buffer> arrayList = this.c.get(Long.valueOf(j));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.c.put(Long.valueOf(j), arrayList);
            }
            synchronized (arrayList) {
                arrayList.add(buffer);
            }
            return 0;
        }
        com.heytap.accessory.base.logging.a.b(e, "onMessageReceived : Failed to retrieve connection details for accessory Id: " + j);
        return 0;
    }

    public synchronized boolean b(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar) {
        return b(bVar, 1, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00d3  */
    public synchronized boolean b(com.heytap.accessory.base.bean.b bVar, int i, com.heytap.accessory.connectivity.interfaces.a aVar) {
        boolean z;
        synchronized (this) {
            if (bVar != null) {
                com.heytap.accessory.connectivity.a aVarA = com.heytap.accessory.connectivity.b.a(bVar.l(), bVar.h(), bVar.F(), i);
                String str = e;
                com.heytap.accessory.base.logging.a.c(str, "Opening connection for accessory id : " + bVar.l() + " with connectivity Flags :" + bVar.h());
                if (aVarA != null) {
                    a aVar2 = null;
                    f fVar = new f(aVar, aVarA, aVar2);
                    int iB = aVarA.b(bVar, this.d);
                    z = true;
                    if (1 == iB) {
                        aVarA.g();
                        Map<Integer, f> concurrentHashMap = this.b.get(Long.valueOf(bVar.l()));
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap<>();
                            this.b.put(Long.valueOf(bVar.l()), concurrentHashMap);
                        }
                        concurrentHashMap.put(Integer.valueOf(i), new f(aVar, aVarA, aVar2));
                        aVarA.f();
                        if (i != 1 && this.b.get(Long.valueOf(bVar.l())).get(1) != null) {
                            fVar.b = this.b.get(Long.valueOf(bVar.l())).get(1).b;
                        }
                    } else {
                        aVarA.c();
                        com.heytap.accessory.base.logging.a.b(str, "Invalid connection status! Returning ..." + iB);
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            throw th;
        }
        return z;
        return z;
    }

    public void a(long j, int i, long j2, com.heytap.accessory.message.b bVar) {
        f fVar = this.b.get(Long.valueOf(j)).get(Integer.valueOf(i));
        if (fVar != null) {
            synchronized (fVar) {
                fVar.b.a(j, i, j2, bVar);
            }
            return;
        }
        com.heytap.accessory.base.logging.a.b(e, "onMessageDispatched : Failed to retrieve connection details for accessory Id: " + j);
    }

    public boolean a(com.heytap.accessory.connectivity.a aVar) {
        return com.heytap.accessory.base.thread.a.b().a("daemon", new c(this, aVar), 0L);
    }

    public boolean a(long j) {
        return a(j, 1);
    }

    public boolean a(long j, int i) {
        f fVar = this.b.get(Long.valueOf(j)).get(Integer.valueOf(i));
        if (fVar == null) {
            com.heytap.accessory.base.logging.a.e(e, "Failed to resume the connection from DORMANT state! No connection present for accessoryId: " + j);
            return false;
        }
        com.heytap.accessory.connectivity.a aVar = fVar.a;
        if (aVar.b != 4) {
            com.heytap.accessory.base.logging.a.e(e, "Failed to resume the connection from DORMANT state! Current state=" + fVar.a.b);
            return false;
        }
        aVar.b();
        return true;
    }

    public void b(com.heytap.accessory.base.bean.b bVar) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(e, "Force closing connection failed. accessory is null");
            return;
        }
        String str = e;
        com.heytap.accessory.base.logging.a.c(str, "Force closing connection. Accessory ID :" + bVar.l());
        com.heytap.accessory.connectivity.a aVarC = c(bVar);
        if (aVarC != null) {
            b(aVarC);
            com.heytap.accessory.base.logging.a.c(str, "remove connection for accessory:" + bVar.l());
            this.a.remove(Long.valueOf(bVar.l()));
        } else {
            com.heytap.accessory.base.logging.a.b(str, "Force closing connection failed. connection is null");
        }
        List<Integer> listA = com.heytap.accessory.connectivity.negotiation.b.b().a(bVar.l());
        if (listA == null) {
            return;
        }
        Iterator<Integer> it = listA.iterator();
        while (it.hasNext()) {
            com.heytap.accessory.connectivity.a aVarA = a(bVar, it.next().intValue());
            if (aVarA != null) {
                b(aVarA);
            }
        }
    }

    public byte a(long j, long j2, com.heytap.accessory.message.b bVar) {
        return b(j, bVar.b(), j2, bVar);
    }

    public int a(com.heytap.accessory.connectivity.a aVar, long j, com.heytap.accessory.message.b bVar) {
        return aVar.a(bVar, j);
    }

    public void a() {
        com.heytap.accessory.connectivity.bt.b.j();
    }

    public boolean a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar) {
        return a(bVar, 1, aVar);
    }

    public boolean a(com.heytap.accessory.base.bean.b bVar, int i, com.heytap.accessory.connectivity.interfaces.a aVar) {
        com.heytap.accessory.connectivity.a aVarA;
        if (bVar == null) {
            return false;
        }
        if (i == 1) {
            aVarA = com.heytap.accessory.connectivity.b.a(bVar.l(), bVar.h(), bVar.F(), i);
            this.a.put(Long.valueOf(bVar.l()), aVarA);
        } else {
            aVarA = com.heytap.accessory.connectivity.b.a(bVar.l(), bVar.h(), bVar.F(), i);
        }
        String str = e;
        com.heytap.accessory.base.logging.a.c(str, "Connecting to.. accessoryId:" + bVar.l());
        if (aVarA == null) {
            com.heytap.accessory.base.logging.a.e(str, "connectDevice but conn is null");
            return false;
        }
        Map<Integer, f> concurrentHashMap = this.b.get(Long.valueOf(bVar.l()));
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this.b.put(Long.valueOf(bVar.l()), concurrentHashMap);
        }
        concurrentHashMap.put(Integer.valueOf(i), new f(aVar, aVarA, null));
        return a(aVarA, bVar, this.d);
    }

    public boolean b(com.heytap.accessory.connectivity.a aVar) {
        return com.heytap.accessory.base.thread.a.b().a("daemon", new b(this, aVar), 0L);
    }

    public boolean b(com.heytap.accessory.base.bean.b bVar, int i) {
        f fVar = this.b.get(Long.valueOf(bVar.l())).get(Integer.valueOf(i));
        if (fVar != null) {
            com.heytap.accessory.base.logging.a.c(e, "Setting CRC for Accessory ID : " + bVar.l());
            fVar.a.a(bVar.g() == 1);
        }
        return true;
    }

    public boolean a(com.heytap.accessory.base.bean.b bVar) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(e, "doRetryActivateConnect accessory is null");
            return false;
        }
        com.heytap.accessory.connectivity.a aVar = this.a.get(Long.valueOf(bVar.l()));
        String str = e;
        com.heytap.accessory.base.logging.a.c(str, "doRetryPd to accessoryId:" + bVar.l());
        if (aVar == null) {
            com.heytap.accessory.base.logging.a.e(str, "doRetryActivateConnect conn is null");
            return false;
        }
        return com.heytap.accessory.base.thread.a.b().a("connect_daemon", new d(this, aVar), 0L);
    }

    public byte b(long j) {
        List<Integer> listA = com.heytap.accessory.connectivity.negotiation.b.b().a(j);
        if (listA != null && !listA.isEmpty()) {
            Iterator<Integer> it = listA.iterator();
            while (it.hasNext()) {
                b(j, it.next().intValue());
            }
        }
        return b(j, 1);
    }

    public boolean a(com.heytap.accessory.connectivity.a aVar, com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.connectivity.interfaces.a aVar2) {
        return com.heytap.accessory.base.thread.a.b().a("connect_daemon", new e(this, aVar, bVar, aVar2), 0L);
    }

    public boolean a(int i, com.heytap.accessory.connectivity.interfaces.b bVar) {
        return a(i, 1, bVar);
    }

    public boolean a(int i, int i2, com.heytap.accessory.connectivity.interfaces.b bVar) {
        com.heytap.accessory.connectivity.interfaces.c cVarB = b(i, i2);
        if (cVarB == null) {
            return false;
        }
        cVarB.a(bVar, i2);
        return cVarB.b(i2);
    }

    public byte b(long j, int i) {
        f fVarRemove = this.b.get(Long.valueOf(j)).remove(Integer.valueOf(i));
        List<Buffer> listRemove = this.c.remove(Long.valueOf(j));
        String str = e;
        com.heytap.accessory.base.logging.a.c(str, "remove connection for accessory:" + j);
        this.a.remove(Long.valueOf(j));
        com.heytap.accessory.base.logging.a.a(str, "Closing Connection For AccessoryId : " + j + " , type " + i);
        if (listRemove != null) {
            synchronized (listRemove) {
                Iterator<Buffer> it = listRemove.iterator();
                while (it.hasNext()) {
                    it.next().recycle();
                }
            }
        }
        if (fVarRemove != null) {
            return a(fVarRemove.a) ? (byte) 0 : (byte) 1;
        }
        com.heytap.accessory.base.logging.a.e(e, "Closing Connection : Connection Details not found !! ");
        return (byte) 1;
    }

    public void a(int i) {
        c(i, 1);
    }

    public com.heytap.accessory.connectivity.a a(com.heytap.accessory.base.bean.b bVar, int i) {
        return com.heytap.accessory.connectivity.b.a(bVar, i);
    }

    public byte b(long j, int i, long j2, com.heytap.accessory.message.b bVar) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(e, "Sending Message : Message Item = null for accessory id : " + j);
            return (byte) 1;
        }
        if (i == 3) {
            i = 1;
        }
        f fVar = this.b.get(Long.valueOf(j)).get(Integer.valueOf(i));
        if (fVar == null) {
            com.heytap.accessory.base.logging.a.a(e, "channel = " + i + " not exist! send by default channel");
            fVar = this.b.get(Long.valueOf(j)).get(1);
            i = 1;
        }
        if (fVar != null) {
            com.heytap.accessory.base.logging.a.a(e, "sendMessage: channel = " + i + " " + fVar.hashCode() + ", sessionId:" + j2);
            return (byte) a(fVar.a, j2, bVar);
        }
        com.heytap.accessory.base.logging.a.b(e, "Sending Message : Connection Details are null for accessoryId : " + j);
        return (byte) 1;
    }

    public final com.heytap.accessory.connectivity.interfaces.c b(int i, int i2) {
        if (i == 2) {
            return com.heytap.accessory.connectivity.bt.c.c();
        }
        if (i == 1) {
            return com.heytap.accessory.connectivity.wifi.socket.b.d();
        }
        if (i == 4) {
            return com.heytap.accessory.connectivity.ble.callback.a.d();
        }
        return null;
    }
}
