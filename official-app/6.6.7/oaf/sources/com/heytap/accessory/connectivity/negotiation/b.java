package com.heytap.accessory.connectivity.negotiation;

import android.util.ArrayMap;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.bean.TrafficReport;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.session.g;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.parser.ServiceProfileBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static final String i = "b";
    public static volatile b j;
    public static com.heytap.accessory.connectivity.interfaces.b k = new a();
    public static com.heytap.accessory.connectivity.interfaces.a l = new b();
    public Map<Long, com.heytap.accessory.session.a> a = new HashMap();
    public Map<String, Integer> b = new HashMap();
    public Map<Long, List<Integer>> c = new HashMap();
    public Map<Long, Map<Integer, String>> d = new ConcurrentHashMap();
    public Map<Long, List<e>> e = new ConcurrentHashMap();
    public List<f> f = new ArrayList();
    public List<Long> g = new CopyOnWriteArrayList();
    public com.heytap.accessory.transport.d.i h = new d();

    public class a implements com.heytap.accessory.connectivity.interfaces.b {
        @Override // com.heytap.accessory.connectivity.interfaces.b
        public void a(int i, com.heytap.accessory.base.bean.b bVar, int i2) {
        }

        @Override // com.heytap.accessory.connectivity.interfaces.b
        public void a(com.heytap.accessory.connectivity.params.c cVar, int i, int i2) {
            com.heytap.accessory.base.logging.a.a(b.i, "onServerListenSuccess: connectionParam = " + cVar.a() + " connectivityType = " + i + " status = " + i2);
            int i3 = cVar.a;
            List<Long> listA = null;
            for (f fVar : b.b().f) {
                if (fVar.a == i && fVar.b == i3) {
                    listA = fVar.a();
                }
            }
            if (listA == null) {
                return;
            }
            synchronized (this) {
                Iterator<Long> it = listA.iterator();
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    com.heytap.accessory.base.logging.a.a(b.i, "ClientInfo:  accessoryId = " + jLongValue);
                    List<e> list = (List) b.b().e.get(Long.valueOf(jLongValue));
                    if (list != null) {
                        boolean z = true;
                        for (e eVar : list) {
                            com.heytap.accessory.base.logging.a.a(b.i, "channelInfo:  channelInfo.mChannelType = " + eVar.b + " channelInfo.mHasChecked = " + eVar.e);
                            if (eVar.b == i3) {
                                eVar.c = i2;
                                eVar.d = cVar.a();
                                eVar.e = true;
                                Map arrayMap = (Map) b.b().d.get(Long.valueOf(jLongValue));
                                if (arrayMap == null) {
                                    arrayMap = new ArrayMap();
                                    b.b().d.put(Long.valueOf(jLongValue), arrayMap);
                                }
                                arrayMap.put(Integer.valueOf(eVar.b), eVar.d);
                            }
                            if (!eVar.e) {
                                z = false;
                            }
                        }
                        if (z) {
                            com.heytap.accessory.base.logging.a.a(b.i, "channelInfos all Checked:  start sending response to client");
                            b.b().a(jLongValue, com.heytap.accessory.connectivity.negotiation.a.b(jLongValue, 4L, list));
                            b.b().e.remove(Long.valueOf(jLongValue));
                            it.remove();
                        }
                    }
                }
            }
        }

        @Override // com.heytap.accessory.connectivity.interfaces.b
        public void a(com.heytap.accessory.base.bean.b bVar, int i) {
            com.heytap.accessory.base.logging.a.c(b.i, "Connection accepted accessory address:" + HexUtils.hideAddress(bVar.d()) + ", accessory connectType:" + bVar.h() + ",channelType:" + i);
            com.heytap.accessory.connectivity.c.b().b(bVar, i, null);
            com.heytap.accessory.transport.d.f().b(bVar, i);
            g.o().a(i);
            b.b().a(bVar.l(), i);
            com.heytap.accessory.transport.credit.b.a().a(bVar.l(), bVar.h(), i);
        }
    }

    public class b implements com.heytap.accessory.connectivity.interfaces.a {
        @Override // com.heytap.accessory.connectivity.interfaces.a
        public int a(long j, int i, Buffer buffer) {
            com.heytap.accessory.base.logging.a.a(b.i, "onMessageReceived:" + j);
            return -1;
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public void a(long j, int i, long j2, com.heytap.accessory.message.b bVar) {
            com.heytap.accessory.base.logging.a.a(b.i, "onMessageDispatched. accessoryId:" + j + " sessionId:" + j2);
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public void a(long j, int i, int i2, int i3) {
            com.heytap.accessory.base.logging.a.a(b.i, "onConnectionStateChanged. accessoryId:" + j + " status:" + i2);
            com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
            if (bVarA == null) {
                com.heytap.accessory.base.logging.a.e(b.i, "onConnectionStateChanged. accessory is null");
                return;
            }
            if (2 != i2) {
                b.b().c(j, i);
                b.b().d(j, i);
            } else {
                com.heytap.accessory.transport.d.f().b(bVarA, i);
                g.o().a(i);
                b.b().a(j, i);
                com.heytap.accessory.transport.credit.b.a().a(j, bVarA.h(), i);
            }
        }
    }

    public static class e {
        public String d;
        public String a = null;
        public int b = 1;
        public int c = -1;
        public boolean e = false;

        public int b() {
            return this.b;
        }

        public String c() {
            return this.d;
        }

        public int d() {
            return this.c;
        }

        public void b(int i) {
            this.c = i;
        }

        public void b(String str) {
            this.d = str;
        }

        public String a() {
            return this.a;
        }

        public void a(String str) {
            this.a = str;
        }

        public void a(int i) {
            this.b = i;
        }
    }

    public static class f {
        public int a = 1;
        public int b = 1;
        public List<Long> c = new ArrayList();

        public List<Long> a() {
            return this.c;
        }

        public void a(long j) {
            if (this.c.contains(Long.valueOf(j))) {
                return;
            }
            this.c.add(Long.valueOf(j));
        }
    }

    public b() {
        com.heytap.accessory.transport.d.f().d(this.h);
        c();
    }

    public final void a(long j2, com.heytap.accessory.session.a aVar, boolean z) {
    }

    public void e(long j2, int i2) {
        if (i2 != 2 && i2 != 1) {
            com.heytap.accessory.base.logging.a.a(i, "connect type not support negotiate");
            return;
        }
        List<Integer> listA = b().a(j2);
        if (listA == null) {
            return;
        }
        Iterator it = new ArrayList(listA).iterator();
        while (it.hasNext()) {
            a(j2, ((Integer) it.next()).intValue(), i2);
        }
    }

    public class c implements com.heytap.accessory.session.e {
        public final /* synthetic */ com.heytap.accessory.session.a a;
        public final /* synthetic */ long b;

        public c(com.heytap.accessory.session.a aVar, long j) {
            this.a = aVar;
            this.b = j;
        }

        @Override // com.heytap.accessory.session.e
        public void a(com.heytap.accessory.message.b bVar, TrafficReport trafficReport) {
            com.heytap.accessory.base.logging.a.a(b.i, "SL onMessageReceived");
            b.this.a(bVar, this.a);
        }

        @Override // com.heytap.accessory.session.e
        public boolean b() {
            return false;
        }

        @Override // com.heytap.accessory.session.e
        public void a(long j, boolean z) {
            com.heytap.accessory.base.logging.a.a(b.i, "SL onSpaceAvailable");
            b.this.a(this.b, this.a, z);
        }

        @Override // com.heytap.accessory.session.e
        public void a() {
            com.heytap.accessory.base.logging.a.a(b.i, "SL onFlushed");
        }
    }

    public final synchronized boolean d(long j2, int i2) {
        try {
            if (1 == i2 || 3 == i2) {
                com.heytap.accessory.base.logging.a.e(i, "add type not allowed");
                return false;
            }
            if (!this.d.containsKey(Long.valueOf(j2))) {
                return false;
            }
            Map<Integer, String> map = this.d.get(Long.valueOf(j2));
            if (map == null) {
                return false;
            }
            if (!map.containsKey(Integer.valueOf(i2))) {
                return false;
            }
            map.remove(Integer.valueOf(i2));
            com.heytap.accessory.base.logging.a.a(i, "remove connectionParams accessoryId = " + j2 + " channelType = " + i2);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static b b() {
        if (j == null) {
            synchronized (b.class) {
                if (j == null) {
                    j = new b();
                }
            }
        }
        return j;
    }

    public final void c() {
        this.b.put("default", 1);
        this.b.put(ConnectConstant.CHANNEL_NAME_FILETRANSFER, 0);
        this.b.put(ConnectConstant.CHANNEL_NAME_STREAMING, 2);
        this.b.put(ConnectConstant.CHANNEL_NAME_CONTROL, 3);
    }

    public class d implements com.heytap.accessory.transport.d.i {
        public d() {
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(com.heytap.accessory.base.bean.a aVar) {
            com.heytap.accessory.base.logging.a.a(b.i, "TL onConnectionStateChanged accessoryId = " + aVar.a() + " channelType = " + aVar.b() + " eventCode = " + aVar.e());
            if (4 != aVar.e()) {
                b.this.a(aVar.a(), aVar.b(), aVar.c());
            }
        }

        @Override // com.heytap.accessory.transport.d.i
        public void b(long j, long j2) {
            com.heytap.accessory.base.logging.a.a(b.i, "TL onSessionFlushed " + j + " , " + j2);
        }

        @Override // com.heytap.accessory.transport.d.i
        public void c(long j, long j2) {
            com.heytap.accessory.base.logging.a.a(b.i, "TL onSessionSpaceAvailable " + j + " , " + j2);
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(long j, long j2) {
            com.heytap.accessory.base.logging.a.a(b.i, "TL onMessageLost " + j + " , " + j2);
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(long j, long j2, com.heytap.accessory.message.a aVar) {
            com.heytap.accessory.base.logging.a.a(b.i, "TL onMessageReceived " + j + " , " + j2);
            com.heytap.accessory.session.a aVar2 = (com.heytap.accessory.session.a) b.this.a.get(Long.valueOf(j));
            if (aVar2 == null) {
                com.heytap.accessory.base.logging.a.e(b.i, "TL session not exist " + j + " , " + j2);
                return;
            }
            com.heytap.accessory.message.b bVar = new com.heytap.accessory.message.b(j, j2);
            bVar.a(aVar);
            b.this.a(bVar, aVar2);
        }
    }

    public boolean c(long j2, List<String> list) {
        com.heytap.accessory.session.a aVar;
        com.heytap.accessory.base.logging.a.a(i, "nego channel " + list + " , " + j2);
        if (!a(list) || (aVar = this.a.get(Long.valueOf(j2))) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        return a(j2, aVar, com.heytap.accessory.connectivity.negotiation.a.a(j2, aVar.a(), arrayList));
    }

    public void a(int i2, int i3) {
        com.heytap.accessory.base.logging.a.a(i, "startServerListener. channelType:" + i3);
        com.heytap.accessory.connectivity.c.b().a(i2, i3, k);
    }

    public void b(int i2, int i3) {
        com.heytap.accessory.base.logging.a.a(i, "stopServerListener. channelType:" + i3);
        com.heytap.accessory.connectivity.c.b().c(i2, i3);
    }

    public boolean a(com.heytap.accessory.base.bean.b bVar, int i2) {
        com.heytap.accessory.base.logging.a.a(i, "connectDevice. accessoryId:" + bVar.l() + " channelType:" + i2);
        return com.heytap.accessory.connectivity.c.b().a(bVar, i2, l);
    }

    public void b(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.base.logging.a.a(i, "reserved session nego");
        com.heytap.accessory.session.a aVarD = com.heytap.accessory.session.a.d(bVar.l());
        aVarD.a(4L, false);
        a(bVar, aVarD);
        a(bVar.l(), aVarD);
        this.a.put(Long.valueOf(bVar.l()), aVarD);
    }

    public void a(com.heytap.accessory.base.bean.b bVar) {
        this.a.remove(Long.valueOf(bVar.l()));
    }

    public final void a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.session.a aVar) {
        com.heytap.accessory.transport.d.f().a(bVar.l(), aVar.a(), 4, 3, bVar.h(), bVar.H(), bVar.C(), bVar.g());
    }

    public final boolean c(long j2, int i2) {
        List<Integer> list;
        if (1 != i2 && 3 != i2) {
            if (!this.c.containsKey(Long.valueOf(j2)) || (list = this.c.get(Long.valueOf(j2))) == null || !list.contains(Integer.valueOf(i2))) {
                return false;
            }
            list.remove(Integer.valueOf(i2));
            return true;
        }
        com.heytap.accessory.base.logging.a.e(i, "add type not allowed");
        return false;
    }

    public final void a(long j2, com.heytap.accessory.session.a aVar) {
        g.o().a(aVar, b(j2, aVar));
    }

    public final void a(com.heytap.accessory.message.b bVar, com.heytap.accessory.session.a aVar) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(i, "NCM message null");
            return;
        }
        int iA = com.heytap.accessory.connectivity.negotiation.a.a(bVar.c());
        com.heytap.accessory.base.logging.a.a(i, "NCM handleMessageReceived " + iA);
        if (1 == iA) {
            a(bVar.a(), com.heytap.accessory.connectivity.negotiation.a.b(bVar.c()));
        } else if (2 == iA) {
            b(bVar.a(), com.heytap.accessory.connectivity.negotiation.a.c(bVar.c()));
        }
    }

    public final com.heytap.accessory.session.e b(long j2, com.heytap.accessory.session.a aVar) {
        return new c(aVar, j2);
    }

    public final e b(String str) {
        if (str == null || !this.b.containsKey(str)) {
            return null;
        }
        e eVar = new e();
        eVar.a(str);
        eVar.a(this.b.get(str).intValue());
        return eVar;
    }

    public final boolean b(long j2, List<e> list) {
        com.heytap.accessory.base.logging.a.a(i, "parseNegoParamsAndConnect ");
        Map<Integer, String> arrayMap = this.d.get(Long.valueOf(j2));
        if (arrayMap == null) {
            arrayMap = new ArrayMap<>();
            this.d.put(Long.valueOf(j2), arrayMap);
        }
        int size = arrayMap.size();
        for (e eVar : list) {
            if (eVar.c != 1) {
                arrayMap.put(Integer.valueOf(eVar.b), eVar.d);
                b().a(AccessoryManager.h().a(j2), eVar.b);
            }
        }
        if (arrayMap.size() <= size) {
            return false;
        }
        com.heytap.accessory.base.logging.a.a(i, "channelParams size increased, mark accessoryId ");
        this.g.add(Long.valueOf(j2));
        return false;
    }

    public final void a(long j2, int i2, int i3) {
        b().c(j2, i2);
        b().d(j2, i2);
        if (!this.g.contains(Long.valueOf(j2))) {
            com.heytap.accessory.base.logging.a.a(i, "remover negotiate server: channelType =  " + i2);
            b().b(i3, i2);
            return;
        }
        List<Integer> listA = b().a(j2);
        if (listA == null || listA.isEmpty()) {
            com.heytap.accessory.base.logging.a.a(i, "all channel clear, remove marked connected accessoryId");
            this.g.remove(Long.valueOf(j2));
        }
    }

    public synchronized String b(long j2, int i2) {
        if (this.d.get(Long.valueOf(j2)) == null || this.d.get(Long.valueOf(j2)).get(Integer.valueOf(i2)) == null) {
            return null;
        }
        String str = this.d.get(Long.valueOf(j2)).get(Integer.valueOf(i2));
        com.heytap.accessory.base.logging.a.a(i, "getConnectionParamStr:  " + str + " accessoryId = " + j2 + " channelType = " + i2);
        return str;
    }

    public final boolean a(long j2, com.heytap.accessory.session.a aVar, com.heytap.accessory.message.a aVar2) {
        return g.o().a(j2, aVar, aVar2) == 0;
    }

    public boolean a(long j2, com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.session.a aVar2;
        com.heytap.accessory.base.logging.a.a(i, "sendResponseMessage ");
        if (aVar == null || (aVar2 = this.a.get(Long.valueOf(j2))) == null) {
            return false;
        }
        return a(j2, aVar2, aVar);
    }

    public final boolean a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!a(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (!this.b.containsKey(str)) {
            if (this.b.size() >= 128) {
                com.heytap.accessory.base.logging.a.e(i, "Too many channels.");
                return false;
            }
            this.b.put(str, Integer.valueOf(ServiceProfileBuilder.generateChannelType(str)));
        }
        return ("default".equalsIgnoreCase(str) || ConnectConstant.CHANNEL_NAME_CONTROL.equalsIgnoreCase(str)) ? false : true;
    }

    public final synchronized void a(long j2, List<e> list) {
        boolean z;
        String str = i;
        com.heytap.accessory.base.logging.a.a(str, "createNegoParamsAndStartListening ");
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j2);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.e(str, "onConnectionStateChanged. accessory is null");
            return;
        }
        int iH = bVarA.h();
        List<e> arrayList = this.e.get(Long.valueOf(j2));
        ArrayList<e> arrayList2 = new ArrayList(list);
        if (arrayList != null) {
            for (e eVar : list) {
                Iterator<e> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().b == eVar.b) {
                        arrayList2.remove(eVar);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                com.heytap.accessory.base.logging.a.a(i, "all request are in progress! ");
                return;
            }
        } else {
            arrayList = new ArrayList<>();
            this.e.put(Long.valueOf(j2), arrayList);
        }
        for (e eVar2 : arrayList2) {
            arrayList.add(eVar2);
            Iterator<f> it2 = this.f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                f next = it2.next();
                if (next.b == eVar2.b && next.a == iH) {
                    next.a(j2);
                    z = true;
                    break;
                }
            }
            if (!z) {
                f fVar = new f();
                fVar.a = iH;
                fVar.b = eVar2.b;
                fVar.a(j2);
                this.f.add(fVar);
            }
        }
        Iterator<e> it3 = list.iterator();
        while (it3.hasNext()) {
            b().a(iH, it3.next().b);
        }
    }

    public List<Integer> a(long j2) {
        return this.c.get(Long.valueOf(j2));
    }

    public final boolean a(long j2, int i2) {
        if (1 != i2 && 3 != i2) {
            if (!this.c.containsKey(Long.valueOf(j2))) {
                this.c.put(Long.valueOf(j2), new ArrayList());
            }
            List<Integer> list = this.c.get(Long.valueOf(j2));
            if (list.contains(Integer.valueOf(i2))) {
                com.heytap.accessory.base.logging.a.e(i, "add duplicate type");
                return false;
            }
            list.add(Integer.valueOf(i2));
            this.c.put(Long.valueOf(j2), list);
            return true;
        }
        com.heytap.accessory.base.logging.a.e(i, "add type not allowed");
        return false;
    }
}
