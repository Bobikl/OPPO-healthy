package com.heytap.accessory.sdp.service;

import android.os.Handler;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.base.FrameworkConnection;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.bean.TrafficReport;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.misc.utils.g;
import com.heytap.accessory.sdp.service.protocol.ServiceDiscoveryUtils;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static final Object c = new Object();
    public static final String d;
    public static Map<Long, Integer> e;
    public static Map<Long, com.heytap.accessory.sdp.service.e> f;
    public static volatile b g;
    public static Map<Long, Runnable> h;
    public static Map<Long, Runnable> i;
    public static Handler j;
    public static Map<Long, Set<String>> k;
    public com.heytap.accessory.sdp.service.c a;
    public FrameworkConnection.d b;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.e();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<FrameworkServiceDescription> listF = b.this.a.f(this.a);
            if (listF == null) {
                com.heytap.accessory.base.logging.a.d(b.d, "No services to remove");
                return;
            }
            com.heytap.accessory.base.logging.a.a(b.d, "updateRemoteDevices: " + listF);
            b.this.a(listF, 0);
        }
    }

    public class c implements com.heytap.accessory.sdp.service.a {
        public c(b bVar) {
        }

        @Override // com.heytap.accessory.sdp.service.a
        public void a(long j, int i) {
            com.heytap.accessory.base.logging.a.e(b.d, "onCapabilityQueryFailure errorCode: " + i);
        }

        @Override // com.heytap.accessory.sdp.service.a
        public void a(long j, List<FrameworkServiceDescription> list) {
            com.heytap.accessory.base.logging.a.a(b.d, "oaf service sync onCapabilityAnswerReceived do nothing. ");
        }
    }

    public class d implements com.heytap.accessory.session.e {
        public final /* synthetic */ com.heytap.accessory.session.a a;
        public final /* synthetic */ long b;

        public d(com.heytap.accessory.session.a aVar, long j) {
            this.a = aVar;
            this.b = j;
        }

        @Override // com.heytap.accessory.session.e
        public void a() {
        }

        @Override // com.heytap.accessory.session.e
        public boolean b() {
            return false;
        }

        @Override // com.heytap.accessory.session.e
        public void a(com.heytap.accessory.message.b bVar, TrafficReport trafficReport) {
            b.this.b(bVar, this.a);
        }

        @Override // com.heytap.accessory.session.e
        public void a(long j, boolean z) {
            b.this.a(this.b, this.a, z);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ long a;
        public final /* synthetic */ com.heytap.accessory.session.a b;

        public e(long j, com.heytap.accessory.session.a aVar) {
            this.a = j;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!b.e.containsKey(Long.valueOf(this.a))) {
                com.heytap.accessory.base.logging.a.e(b.d, "sCapabilityDiscoveryAttemptsMap not contain accessoryId:" + this.a);
                return;
            }
            com.heytap.accessory.base.bean.b bVarA = b.this.a(this.a);
            if (bVarA != null) {
                if (b.this.b(bVarA, this.b)) {
                    b.this.c(bVarA, this.b);
                    return;
                } else {
                    com.heytap.accessory.base.logging.a.a(b.d, "Posting sync timeout failed. Accessory is removed");
                    return;
                }
            }
            com.heytap.accessory.base.logging.a.e(b.d, "accessoryId " + this.a + " not found in map!");
        }
    }

    public final class f implements com.heytap.accessory.transport.d.i {
        public /* synthetic */ f(b bVar, a aVar) {
            this();
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(long j, long j2) {
        }

        @Override // com.heytap.accessory.transport.d.i
        public void b(long j, long j2) {
        }

        @Override // com.heytap.accessory.transport.d.i
        public void c(long j, long j2) {
            com.heytap.accessory.session.a aVar;
            synchronized (b.c) {
                com.heytap.accessory.sdp.service.e eVar = (com.heytap.accessory.sdp.service.e) b.f.get(Long.valueOf(j));
                aVar = eVar != null ? eVar.c : null;
            }
            if (aVar != null) {
                b.this.a(j, aVar, true);
                return;
            }
            com.heytap.accessory.base.logging.a.b(b.d, "Capex Session not found for accessory: " + j);
        }

        public f() {
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(com.heytap.accessory.base.bean.a aVar) {
        }

        @Override // com.heytap.accessory.transport.d.i
        public void a(long j, long j2, com.heytap.accessory.message.a aVar) {
            com.heytap.accessory.session.a aVar2;
            com.heytap.accessory.message.b bVar = new com.heytap.accessory.message.b(j, j2);
            bVar.a(aVar);
            synchronized (b.c) {
                com.heytap.accessory.sdp.service.e eVar = (com.heytap.accessory.sdp.service.e) b.f.get(Long.valueOf(j));
                aVar2 = eVar != null ? eVar.c : null;
            }
            if (aVar2 == null) {
                com.heytap.accessory.base.logging.a.b(b.d, "Capex Session not found for accessory: " + j);
                return;
            }
            b.this.b(bVar, aVar2);
        }
    }

    static {
        Charset charset = StandardCharsets.UTF_8;
        d = b.class.getSimpleName();
        f = new ArrayMap();
        e = new ArrayMap();
        h = new ArrayMap();
        i = new ArrayMap();
        k = new ArrayMap();
    }

    public b() {
        Looper looperB = com.heytap.accessory.base.thread.a.b().b("daemon");
        if (looperB != null) {
            j = new Handler(looperB);
        }
        com.heytap.accessory.transport.d.f().a(new f(this, null));
        this.a = new com.heytap.accessory.sdp.service.c(j);
        j.post(new a());
    }

    public static synchronized b g() {
        if (g == null) {
            synchronized (b.class) {
                if (g == null) {
                    g = new b();
                }
            }
        }
        return g;
    }

    public synchronized void e(String str) {
        String str2 = d;
        com.heytap.accessory.base.logging.a.a(str2, "removeLocalServicesSync: " + str);
        List<FrameworkServiceDescription> listG = this.a.g(str);
        com.heytap.accessory.base.logging.a.a(str2, "removeLocalServicesSync agent list size" + listG.size());
        com.heytap.accessory.base.logging.a.a(str2, "updateRemoteDevices: " + listG);
        a(listG, 0);
    }

    public final void f(com.heytap.accessory.base.bean.b bVar) {
        bVar.l(10);
        a(bVar, "com.heytap.accessory.device.action.ACCESSORY_ATTACHED", 0);
        d(bVar);
        g.a(bVar.d(), com.heytap.accessory.connectivity.core.b.e().b(bVar));
        g.d(bVar.d());
        com.heytap.accessory.base.logging.a.c(d, "Capex initial sync complete,OAF connect success, uuid:" + bVar.F() + ", deviceId:" + HexUtils.hide(bVar.t()) + ", deviceType:" + ((int) bVar.i()));
    }

    public int h() {
        return this.a.f().size();
    }

    public void i() {
        HashSet<String> hashSet = new HashSet();
        Iterator<FrameworkServiceDescription> it = this.a.a(255).iterator();
        while (it.hasNext()) {
            String strD = it.next().d();
            if (!PlatformUtils.isPackageEnabled(strD)) {
                hashSet.add(strD);
            }
        }
        for (String str : hashSet) {
            com.heytap.accessory.base.logging.a.a(d, "Package: " + str + " removed/disabled. Remove from DB.");
            this.a.f(str);
        }
    }

    public synchronized List<String> j() {
        return this.a.e();
    }

    public final void c(com.heytap.accessory.base.bean.b bVar) {
        final long jL = bVar.l();
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.fjm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.c(jL);
            }
        };
        i.put(Long.valueOf(jL), runnable);
        a(runnable, 10000L);
    }

    public void d(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.session.a aVar) {
        if (bVar.O()) {
            bVar.l(6);
            c(bVar);
            com.heytap.accessory.base.logging.a.a(d, "Selective capex enabled, Intial sync after receiving query");
            return;
        }
        String str = d;
        com.heytap.accessory.base.logging.a.a(str, "Selective capex enabled, Proceeding for initial sync");
        if (!b(bVar, aVar)) {
            com.heytap.accessory.base.logging.a.a(str, "Posting sync timeout failed. Accessory is removed");
        } else {
            bVar.l(7);
            c(bVar, aVar);
        }
    }

    public long b(long j2) {
        com.heytap.accessory.session.a aVar;
        synchronized (c) {
            com.heytap.accessory.sdp.service.e eVar = f.get(Long.valueOf(j2));
            if (eVar == null || (aVar = eVar.c) == null) {
                return -1L;
            }
            return aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(long j2) {
        com.heytap.accessory.base.bean.b bVarA = a(j2);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.a(d, "Accessory " + j2 + " is already removed");
            return;
        }
        if (bVarA.A() == 6 || bVarA.A() == 8) {
            com.heytap.accessory.base.logging.a.a(d, "Capex waiting for query timed out for accessory " + j2 + ", removing accessory");
            e(bVarA);
        }
    }

    public void e(com.heytap.accessory.base.bean.b bVar) {
        AccessoryManager.h().b(bVar, 258);
    }

    public void a(com.heytap.accessory.base.bean.b bVar) {
        synchronized (c) {
            com.heytap.accessory.sdp.service.e eVarRemove = f.remove(Long.valueOf(bVar.l()));
            if (eVarRemove != null) {
                eVarRemove.c.e();
            }
        }
    }

    public final synchronized void e() {
        this.a.a();
    }

    public void b(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.session.a aVarD = com.heytap.accessory.session.a.d(bVar.l());
        aVarD.a(2L, false);
        a(bVar, aVarD);
        a(bVar.l(), aVarD);
        bVar.Q();
        com.heytap.accessory.sdp.service.e eVar = new com.heytap.accessory.sdp.service.e();
        synchronized (c) {
            eVar.c = aVarD;
            eVar.b = new LinkedList();
            a(bVar.l(), eVar, "createReservedSession");
        }
    }

    public void a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.session.a aVar) {
        com.heytap.accessory.transport.d.f().a(bVar.l(), aVar.a(), 4, 3, bVar.h(), bVar.H(), bVar.C(), bVar.g());
    }

    public synchronized void d(String str) {
        com.heytap.accessory.base.logging.a.a(d, "removeLocalServices: " + str);
        com.heytap.accessory.base.thread.a.b().a("daemon", new b(str), 0L);
    }

    public synchronized List<FrameworkServiceDescription> f(String str) {
        return this.a.h(str);
    }

    public void c(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.session.a aVar) {
        com.heytap.accessory.sdp.service.protocol.b serviceCapabilityParams = ServiceDiscoveryUtils.getServiceCapabilityParams(this.a.f(), 3, 1, this.a.a(bVar.d(), bVar.h(), bVar.F()));
        StringBuilder sb = new StringBuilder();
        String str = d;
        sb.append(str);
        sb.append(" - SLPTrack");
        com.heytap.accessory.base.logging.a.a(sb.toString(), "sendCapexSyncQueryMessage : " + serviceCapabilityParams.toString());
        if (aVar == null) {
            synchronized (c) {
                com.heytap.accessory.sdp.service.e eVar = f.get(Long.valueOf(bVar.l()));
                if (eVar != null) {
                    aVar = eVar.c;
                }
            }
        }
        a(bVar.l(), aVar, serviceCapabilityParams, 1);
        com.heytap.accessory.base.logging.a.a(str, "Sending CapEx query for initial sync up!");
    }

    public int f() {
        return this.a.d();
    }

    public final void d(com.heytap.accessory.base.bean.b bVar) {
        Set<String> setRemove;
        synchronized (k) {
            setRemove = k.remove(Long.valueOf(bVar.l()));
        }
        if (setRemove != null) {
            com.heytap.accessory.base.logging.a.c(d, "Processing pending profiles..");
            ArrayList arrayList = new ArrayList();
            for (FrameworkServiceDescription frameworkServiceDescription : this.a.a(bVar.h())) {
                if (setRemove.contains(frameworkServiceDescription.m())) {
                    arrayList.add(frameworkServiceDescription);
                    b(bVar.h(), frameworkServiceDescription.m());
                    com.heytap.accessory.base.logging.a.c(d, frameworkServiceDescription.d() + " # " + frameworkServiceDescription.m() + " # " + frameworkServiceDescription.p());
                }
            }
            a(arrayList, 1);
        }
    }

    public final synchronized List<String> a(List<String> list) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List<String> listF = this.a.f();
        for (String str : list) {
            if (listF.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public void a(FrameworkConnection.d dVar) {
        this.b = dVar;
    }

    public void a(long j2, List<FrameworkServiceDescription> list, int i2) {
        com.heytap.accessory.base.bean.b bVarA = a(j2);
        if (bVarA != null) {
            for (FrameworkServiceDescription frameworkServiceDescription : list) {
                com.heytap.accessory.base.logging.a.a(d, "Remove the service description for " + frameworkServiceDescription.d() + " accessoryId: " + j2);
                bVarA.b(frameworkServiceDescription);
                this.a.c(bVarA, frameworkServiceDescription);
                if (!bVarA.a(frameworkServiceDescription.m())) {
                    bVarA.a(ServiceDiscoveryUtils.createDummyRecord(frameworkServiceDescription.m(), bVarA.h()));
                }
            }
            this.a.a(bVarA, i2);
        }
    }

    public final boolean b(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.session.a aVar) {
        int iIntValue = e.containsKey(Long.valueOf(bVar.l())) ? e.get(Long.valueOf(bVar.l())).intValue() : 0;
        if (iIntValue > 2) {
            com.heytap.accessory.base.logging.a.a(d, "MAX attempts exhausted. Capex sync timed out!");
            e(bVar);
            return false;
        }
        com.heytap.accessory.base.logging.a.c(d, "Capex attempt count: " + iIntValue);
        long jL = bVar.l();
        Runnable runnableB = b(jL, aVar);
        e.put(Long.valueOf(jL), Integer.valueOf(iIntValue + 1));
        h.put(Long.valueOf(jL), runnableB);
        a(runnableB, 10000L);
        return true;
    }

    public synchronized String c(String str) {
        return this.a.d(str);
    }

    public final String c(com.heytap.accessory.message.b bVar) {
        Buffer bufferF = bVar.c().f();
        return ("length " + bufferF.getLength() + " , payload length " + bufferF.getPayloadLength() + " , offset " + bufferF.getOffset() + " , [ ") + " ]";
    }

    public com.heytap.accessory.session.e c(long j2, com.heytap.accessory.session.a aVar) {
        return new d(aVar, j2);
    }

    public void a(long j2, int i2, String str) {
        synchronized (c) {
            com.heytap.accessory.sdp.service.e eVarRemove = f.remove(Long.valueOf(j2));
            if (eVarRemove != null) {
                com.heytap.accessory.base.logging.a.c(d, "Cleaning Up for accessoryID: " + j2);
                Queue<com.heytap.accessory.message.a> queue = eVarRemove.b;
                if (queue != null) {
                    queue.clear();
                }
                if (eVarRemove.c != null) {
                    com.heytap.accessory.session.g.o().c(j2, eVarRemove.c);
                    eVarRemove.c.e();
                }
                CopyOnWriteArrayList<com.heytap.accessory.sdp.service.a> copyOnWriteArrayList = eVarRemove.a;
                if (copyOnWriteArrayList != null) {
                    Iterator<com.heytap.accessory.sdp.service.a> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        it.next().a(j2, 2);
                    }
                }
            }
        }
        Runnable runnableRemove = h.remove(Long.valueOf(j2));
        if (runnableRemove != null) {
            j.removeCallbacks(runnableRemove);
        }
        Runnable runnableRemove2 = i.remove(Long.valueOf(j2));
        if (runnableRemove2 != null) {
            j.removeCallbacks(runnableRemove2);
        }
        e.remove(Long.valueOf(j2));
        synchronized (k) {
            k.remove(Long.valueOf(j2));
        }
        com.heytap.accessory.session.g.o().a(j2);
        com.heytap.accessory.base.bean.b bVarA = a(j2);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.b(d, "cleanUp " + j2 + " was not found in map!");
            return;
        }
        a(bVarA, str, i2);
    }

    public void b(com.heytap.accessory.message.b bVar, List<com.heytap.accessory.sdp.service.a> list) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(d, "processCapabilityDiscoveryResponseMessage failed, MessageItem is null, return...");
            return;
        }
        long jA = bVar.a();
        com.heytap.accessory.sdp.service.protocol.b bVarA = a(bVar.c());
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.e(d, "processCapabilityDiscoveryResponseMessage failed, capabilityParams is null, return...");
            return;
        }
        com.heytap.accessory.base.bean.b bVarA2 = a(jA);
        if (bVarA2 == null) {
            com.heytap.accessory.base.logging.a.e(d, "Accessory with ID: " + jA + " is not Connected");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (bVarA2.A() < 10) {
            com.heytap.accessory.base.logging.a.a(d, "Processing CapEx response..state is " + bVarA2.A());
            if (bVarA.a.isEmpty() && bVarA.c != 0) {
                List<String> listF = this.a.f();
                if (listF.isEmpty()) {
                    this.a.d(bVarA2.d(), bVarA2.h(), bVarA2.F());
                    this.a.a(bVarA2, arrayList2, bVarA.c);
                }
                Iterator<FrameworkServiceDescription> it = a(this.a.c(bVarA2.d(), bVarA2.h(), bVarA2.F()), listF).iterator();
                while (it.hasNext()) {
                    bVarA2.a(it.next());
                }
                Iterator<com.heytap.accessory.sdp.service.a> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().a(jA, arrayList2);
                }
                return;
            }
            this.a.d(bVarA2.d(), bVarA2.h(), bVarA2.F());
            bVarA2.b();
        }
        int iH = bVarA2.h();
        Iterator<com.heytap.accessory.sdp.service.protocol.b.a> it3 = bVarA.a.iterator();
        while (it3.hasNext()) {
            com.heytap.accessory.sdp.service.protocol.b.a next = it3.next();
            for (com.heytap.accessory.sdp.service.protocol.b.c cVar : next.c) {
                int i2 = cVar.b;
                byte b2 = cVar.e;
                int i3 = (b2 & 3) == 0 ? 0 : 1;
                int i4 = (b2 & 8) == 0 ? 0 : 1;
                int i5 = (b2 & 4) == 0 ? 0 : 1;
                int i6 = (b2 & 16) != 0 ? 1 : 0;
                String str = d + " - SLPTrack";
                StringBuilder sb = new StringBuilder();
                Iterator<com.heytap.accessory.sdp.service.protocol.b.a> it4 = it3;
                sb.append("service response parse, role is ");
                sb.append((int) cVar.e);
                sb.append("; awakenable is ");
                sb.append(i6);
                com.heytap.accessory.base.logging.a.a(str, sb.toString());
                com.heytap.accessory.sdp.service.protocol.b.a aVar = next;
                arrayList2.add(new FrameworkServiceDescription(next.a, next.b, null, iH, String.valueOf(i2), cVar.d, ((cVar.a & 65280) >> 8) + "." + (cVar.a & 255), i3, i4, i5, cVar.c, i6));
                if (!arrayList.contains(cVar.d)) {
                    arrayList.add(cVar.d);
                }
                it3 = it4;
                next = aVar;
            }
        }
        String str2 = d;
        com.heytap.accessory.base.logging.a.a(str2, "Updating service records for accessory ID: " + jA);
        com.heytap.accessory.base.logging.a.a(str2 + " - SLPTrack", "receive response, , callbackSize: " + list.size() + " Updating serviceDescList: " + arrayList2);
        this.a.a(bVarA2, arrayList2, bVarA.c);
        Iterator<com.heytap.accessory.sdp.service.a> it5 = list.iterator();
        while (it5.hasNext()) {
            it5.next().a(jA, arrayList2);
        }
    }

    public final synchronized int a(long j2, com.heytap.accessory.session.a aVar, List<String> list, int i2) {
        int iGenerateCheckSum;
        com.heytap.accessory.sdp.service.protocol.b bVarFormServiceCapabilityParams;
        com.heytap.accessory.base.bean.b bVarA = a(j2);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.e(d, "[Capex] Cannot find accessory with ID: " + j2);
            return 1;
        }
        if (list.isEmpty() && i2 == 1) {
            com.heytap.accessory.base.logging.a.e(d, "[Capex] Received empty profileId list!");
            return 1;
        }
        ArrayList arrayList = new ArrayList();
        if (i2 == 1) {
            List<FrameworkServiceDescription> listA = this.a.a(bVarA.h(), list.get(0));
            if (listA != null && !listA.isEmpty()) {
                arrayList.add(listA.get(0));
            }
            if (arrayList.isEmpty()) {
                com.heytap.accessory.base.logging.a.e(d, "[Capex] Cant find a record locally. Therefore not sending out the Capex request!");
                return 1;
            }
        } else {
            List<FrameworkServiceDescription> listA2 = this.a.a(bVarA.h());
            com.heytap.accessory.base.logging.a.a(d, "ServiceDiscoveryMessageParams, localRecords: " + listA2.toString() + "\nprofileIds = " + list);
            HashSet hashSet = new HashSet();
            for (String str : list) {
                boolean z = false;
                for (FrameworkServiceDescription frameworkServiceDescription : listA2) {
                    if (frameworkServiceDescription.m().trim().equalsIgnoreCase(str)) {
                        arrayList.add(frameworkServiceDescription);
                        z = true;
                    }
                }
                if (!z) {
                    if (bVarA.A() == 10) {
                        com.heytap.accessory.base.logging.a.e(d, "check whether the package is registered");
                        AccessoryManager.h().b();
                    }
                    com.heytap.accessory.base.logging.a.a(d, "localRecords not contains the " + str + ". Therefore create a dummyRecord. And response the dummyRecord");
                    arrayList.add(ServiceDiscoveryUtils.createDummyRecord(str, bVarA.h()));
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                synchronized (k) {
                    k.put(Long.valueOf(j2), hashSet);
                }
            }
            throw th;
        }
        if (i2 == 1) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(((FrameworkServiceDescription) arrayList.get(0)).m());
            bVarFormServiceCapabilityParams = ServiceDiscoveryUtils.getServiceCapabilityParams(arrayList2, ((FrameworkServiceDescription) arrayList.get(0)).k() == 1 ? 3 : 0, 1, this.a.a(bVarA.d(), bVarA.h(), bVarA.F()));
            com.heytap.accessory.base.logging.a.a(d, "ServiceDiscoveryMessageParams, query request: " + bVarFormServiceCapabilityParams.toString());
        } else {
            synchronized (bVarA) {
                iGenerateCheckSum = ServiceDiscoveryUtils.generateCheckSum(this.a.a(255), bVarA.q());
            }
            bVarFormServiceCapabilityParams = ServiceDiscoveryUtils.formServiceCapabilityParams(arrayList, i2, iGenerateCheckSum, bVarA);
            com.heytap.accessory.base.logging.a.a(d, "ServiceDiscoveryMessageParams, response request: " + bVarFormServiceCapabilityParams.toString());
        }
        return a(j2, aVar, bVarFormServiceCapabilityParams, i2) ? 0 : 1;
    }

    public synchronized Pair<Integer, FrameworkServiceDescription> b(FrameworkServiceDescription frameworkServiceDescription) {
        return this.a.b(frameworkServiceDescription);
    }

    @Nullable
    public synchronized FrameworkServiceDescription b(String str) {
        return this.a.c(str);
    }

    public final void b(com.heytap.accessory.message.b bVar, com.heytap.accessory.session.a aVar) {
        if (bVar != null) {
            try {
                int iB = com.heytap.accessory.misc.utils.d.b(bVar.c());
                String str = d;
                com.heytap.accessory.base.logging.a.a(str, "handleMessageReceived msgType: " + iB);
                if (iB == 1) {
                    com.heytap.accessory.base.logging.a.c(str, "[receive Capex] query : " + c(bVar));
                    a(bVar, aVar);
                } else if (iB == 2) {
                    com.heytap.accessory.base.logging.a.c(str, "[receive Capex] response : " + c(bVar));
                    b(bVar);
                } else if (iB != 3) {
                    com.heytap.accessory.base.logging.a.e(str, "[receive Capex] I dont understand this capex msgType!!!");
                } else {
                    com.heytap.accessory.base.logging.a.c(str, "[receive Capex] incremental_update : " + c(bVar));
                    a(bVar);
                }
            } catch (Throwable th) {
                if (bVar.c() != null && bVar.c().f() != null) {
                    bVar.c().f().recycle();
                }
                throw th;
            }
        }
        if (bVar == null || bVar.c() == null || bVar.c().f() == null) {
            return;
        }
        bVar.c().f().recycle();
    }

    public final void b(com.heytap.accessory.message.b bVar) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        boolean z;
        long jA = bVar.a();
        String str = d;
        com.heytap.accessory.base.logging.a.a(str, "Received Capex RSP from accessoryId: " + jA);
        synchronized (c) {
            com.heytap.accessory.sdp.service.e eVar = f.get(Long.valueOf(jA));
            copyOnWriteArrayList = null;
            if (eVar != null) {
                z = true;
                if (eVar.a != null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList(eVar.a);
                }
            } else {
                z = false;
            }
        }
        if (z) {
            if (copyOnWriteArrayList == null) {
                com.heytap.accessory.base.logging.a.c(str, "IServiceExpEventListener not registered. Now adding...");
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                copyOnWriteArrayList.add(new c(this));
            }
            b(bVar, copyOnWriteArrayList);
        } else {
            com.heytap.accessory.base.logging.a.b(str, "[Capex] Cannot read the capability discovery state for accessory ID: " + jA);
        }
        com.heytap.accessory.base.bean.b bVarA = a(jA);
        if (bVarA != null) {
            Runnable runnable = h.get(Long.valueOf(jA));
            if (runnable != null) {
                j.removeCallbacks(runnable);
            }
            e.remove(Long.valueOf(jA));
            if (bVarA.A() == 9) {
                f(bVarA);
            } else if (bVarA.A() == 7) {
                bVarA.l(8);
                c(bVarA);
            }
        }
    }

    public final boolean a(long j2, com.heytap.accessory.session.a aVar, com.heytap.accessory.message.a aVar2) {
        com.heytap.accessory.sdp.service.e eVar;
        Queue<com.heytap.accessory.message.a> queue;
        if (com.heytap.accessory.session.g.o().a(j2, aVar, aVar2) == 0) {
            return true;
        }
        com.heytap.accessory.base.logging.a.a(d, "Could not enqueue at TL hence queuing at Capex Queue");
        synchronized (c) {
            if (f.containsKey(Long.valueOf(j2)) && (eVar = f.get(Long.valueOf(j2))) != null && (queue = eVar.b) != null) {
                queue.add(aVar2);
            }
        }
        return false;
    }

    public synchronized List<String> a(com.heytap.accessory.message.b bVar, List<String> list) {
        int iGenerateCheckSum;
        int iGenerateCheckSum2;
        if (bVar == null) {
            return new ArrayList();
        }
        long jA = bVar.a();
        com.heytap.accessory.sdp.service.protocol.b bVarA = a(bVar.c());
        StringBuilder sb = new StringBuilder();
        String str = d;
        sb.append(str);
        sb.append(" - SLPTrack");
        com.heytap.accessory.base.logging.a.a(sb.toString(), "receive remote service query: " + bVarA);
        com.heytap.accessory.base.bean.b bVarA2 = a(jA);
        if (bVarA2 == null) {
            com.heytap.accessory.base.logging.a.e(str, "Accessory with ID: " + jA + " is not Connected");
            return new ArrayList();
        }
        if (bVarA == null) {
            return list;
        }
        List<com.heytap.accessory.sdp.service.protocol.b.b> list2 = bVarA.b;
        if (list2.size() != 1) {
            for (com.heytap.accessory.sdp.service.protocol.b.b bVar2 : list2) {
                if (!list.contains(bVar2.a)) {
                    list.add(bVar2.a);
                }
                byte b2 = bVarA.f;
                if (b2 == 2 || b2 == 3) {
                    bVarA2.h(bVar2.a);
                }
            }
            synchronized (bVarA2) {
                iGenerateCheckSum2 = ServiceDiscoveryUtils.generateCheckSum(this.a.a(255), bVarA2.q());
            }
            if (iGenerateCheckSum2 == bVarA.c) {
                com.heytap.accessory.base.logging.a.c(d, "CheckSum received matches the local one");
                list = new ArrayList<>();
            }
            return list;
        }
        byte b3 = bVarA.f;
        if (b3 != 2 && b3 != 3) {
            list.add(bVarA.b.get(0).a);
        } else {
            com.heytap.accessory.sdp.service.protocol.b.b bVar3 = bVarA.b.get(0);
            com.heytap.accessory.base.logging.a.a(str, "[Capex] Registering for persistence for profile: " + bVar3.a);
            bVarA2.h(bVar3.a);
            list.add(bVar3.a);
            synchronized (bVarA2) {
                iGenerateCheckSum = ServiceDiscoveryUtils.generateCheckSum(this.a.a(255), bVarA2.q());
            }
            com.heytap.accessory.base.logging.a.c(str, "[Capex] CheckSum computed for accessory " + jA + ": " + iGenerateCheckSum + ". Received: " + bVarA.c);
            if (iGenerateCheckSum == bVarA.c) {
                com.heytap.accessory.base.logging.a.c(str, "CheckSum received from accessory " + jA + " matches the locally computed one");
                list = new ArrayList<>();
            } else {
                com.heytap.accessory.base.logging.a.c(str, "CheckSum values not matching!");
            }
        }
        return list;
    }

    public int b(String str, String str2) {
        for (Map.Entry<String, List<String>> entry : com.heytap.accessory.misc.utils.b.a(PlatformUtils.getContext()).b().entrySet()) {
            List<String> value = entry.getValue();
            if (entry.getKey().equalsIgnoreCase(str) && value.contains(str2)) {
                return 0;
            }
        }
        for (Map.Entry<String, List<String>> entry2 : com.heytap.accessory.misc.utils.b.a(PlatformUtils.getContext()).a().entrySet()) {
            List<String> value2 = entry2.getValue();
            if (entry2.getKey().equalsIgnoreCase(str) && value2.contains(str2)) {
                return 1;
            }
        }
        return 2;
    }

    public void b(int i2, String str) {
        com.heytap.accessory.session.a aVar;
        String str2 = d;
        com.heytap.accessory.base.logging.a.a(str2, "syncUpServices");
        List<com.heytap.accessory.base.bean.b> listB = AccessoryManager.h().b(i2);
        if (listB != null && !listB.isEmpty()) {
            for (com.heytap.accessory.base.bean.b bVar : listB) {
                synchronized (c) {
                    com.heytap.accessory.sdp.service.e eVar = f.get(Long.valueOf(bVar.l()));
                    if (eVar == null) {
                        com.heytap.accessory.base.logging.a.e(d, "ServiceStateHolder value is null, returning..");
                        return;
                    }
                    aVar = eVar.c;
                    if (aVar == null) {
                        com.heytap.accessory.base.logging.a.e(d, "ServiceStateHolder session is null, returning..");
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                a(bVar.l(), aVar, arrayList, 1);
            }
            return;
        }
        com.heytap.accessory.base.logging.a.e(str2, "no connectedAccessory found!");
    }

    public com.heytap.accessory.sdp.service.protocol.c b(com.heytap.accessory.message.a aVar) {
        return com.heytap.accessory.sdp.service.protocol.d.b(aVar);
    }

    public final Runnable b(long j2, com.heytap.accessory.session.a aVar) {
        return new e(j2, aVar);
    }

    public final List<FrameworkServiceDescription> a(List<FrameworkServiceDescription> list, List<String> list2) {
        String str = d;
        com.heytap.accessory.base.logging.a.a(str, "ServiceDiscoveryMessageParams populateServiceDescriptions persistentProfiles =  " + list2);
        com.heytap.accessory.base.logging.a.a(str, "ServiceDiscoveryMessageParams populateServiceDescriptions sdList =  " + list.toString());
        ArrayList arrayList = new ArrayList();
        for (FrameworkServiceDescription frameworkServiceDescription : list) {
            arrayList.add(frameworkServiceDescription);
            list2.remove(frameworkServiceDescription.m());
        }
        for (String str2 : list2) {
            com.heytap.accessory.base.logging.a.a(d, "[Capex] Populating with a default record for profile: " + str2 + " into the accessory object");
            arrayList.add(ServiceDiscoveryUtils.createDummyRecord(str2, 255));
        }
        return arrayList;
    }

    @WorkerThread
    public synchronized FrameworkServiceDescription a(FrameworkServiceDescription frameworkServiceDescription) {
        String str = d;
        StringBuilder sb = new StringBuilder();
        sb.append("addLocalService ");
        sb.append(frameworkServiceDescription == null ? "null" : frameworkServiceDescription.m());
        com.heytap.accessory.base.logging.a.a(str, sb.toString());
        com.heytap.accessory.sdp.service.d dVarA = this.a.a(frameworkServiceDescription);
        if (dVarA == null) {
            return null;
        }
        int iC = dVarA.c();
        if (iC != 1) {
            if (iC == 2) {
                return dVarA.a().get(0);
            }
            if (iC != 3) {
                com.heytap.accessory.base.logging.a.e(str, "Invalid status received " + dVarA.c());
                return dVarA.a().get(0);
            }
            a(dVarA.b(), 0);
        }
        b(frameworkServiceDescription.i(), frameworkServiceDescription.m());
        a(dVarA.a(), 1);
        com.heytap.accessory.base.logging.a.c(str, frameworkServiceDescription.d() + " # " + frameworkServiceDescription.m() + " # " + frameworkServiceDescription.p());
        return dVarA.a().get(0);
    }

    public synchronized List<FrameworkServiceDescription> a(int i2, String str) {
        return this.a.a(i2, str);
    }

    public synchronized FrameworkServiceDescription a(String str, String str2) {
        return this.a.a(str, str2);
    }

    public synchronized List<String> a(String str) {
        return this.a.a(str);
    }

    public final void a(com.heytap.accessory.message.b bVar, com.heytap.accessory.session.a aVar) {
        long jA = bVar.a();
        String str = d;
        com.heytap.accessory.base.logging.a.a(str, "Received Capex Query from accessoryId: " + jA);
        ArrayList arrayList = new ArrayList();
        List<String> listA = a(bVar, arrayList);
        com.heytap.accessory.base.logging.a.a(str, "ServiceDiscoveryMessageParams handleCapexQuery profileIds = " + listA);
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(jA);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.b(str, "Accessory is null " + jA);
            return;
        }
        if (bVarA.A() == 10) {
            com.heytap.accessory.base.logging.a.a(str, "NOT an initial sync up");
            if (bVarA.O()) {
                List<String> listA2 = bVarA.a(a(arrayList));
                long jA2 = this.a.a(bVarA.d(), bVarA.h(), bVarA.F());
                if (!listA2.isEmpty()) {
                    com.heytap.accessory.base.logging.a.a(str, "Sending query for sync up for accessory " + jA);
                    a(bVarA.l(), aVar, ServiceDiscoveryUtils.getServiceCapabilityParams(listA2, 3, 1, jA2), 1);
                }
            }
        }
        a(jA, aVar, listA, 2);
        if (bVarA.A() == 6) {
            bVarA.l(9);
            com.heytap.accessory.base.logging.a.a(str, "Sending query for pending accessory " + jA);
            com.heytap.accessory.sdp.service.protocol.b serviceCapabilityParams = ServiceDiscoveryUtils.getServiceCapabilityParams(a(arrayList), 3, 1, this.a.a(bVarA.d(), bVarA.h(), bVarA.F()));
            com.heytap.accessory.base.logging.a.a(str, "handleCapexQuery send " + serviceCapabilityParams.toString());
            if (b(bVarA, aVar)) {
                a(bVarA.l(), aVar, serviceCapabilityParams, 1);
                return;
            } else {
                com.heytap.accessory.base.logging.a.a(str, "Posting sync timeout failed. Accessory is removed");
                return;
            }
        }
        if (bVarA.A() == 8) {
            com.heytap.accessory.base.logging.a.a(str, "NOT a pending accessory " + jA + ", query already sent");
            f(bVarA);
        }
    }

    public final void a(com.heytap.accessory.message.b bVar) {
        b bVar2;
        long j2;
        long jA = bVar.a();
        String str = d;
        com.heytap.accessory.base.logging.a.c(str, "[Capex] Incremental Update Msg received from accessory " + jA);
        com.heytap.accessory.base.bean.b bVarA = a(jA);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.e(str, "[Capex] Incremental Accessory not found! " + jA);
            return;
        }
        com.heytap.accessory.sdp.service.protocol.c cVarB = b(bVar.c());
        if (cVarB == null) {
            com.heytap.accessory.base.logging.a.e(str, "[Capex] Update params not found!");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<com.heytap.accessory.sdp.service.protocol.c.a> it = cVarB.a.iterator();
        while (it.hasNext()) {
            com.heytap.accessory.sdp.service.protocol.c.a next = it.next();
            byte b2 = next.d;
            Iterator<com.heytap.accessory.sdp.service.protocol.c.b> it2 = next.c.iterator();
            while (it2.hasNext()) {
                com.heytap.accessory.sdp.service.protocol.c.b next2 = it2.next();
                int i2 = next2.a;
                int i3 = (65280 & i2) >> 8;
                int i4 = i2 & 255;
                byte b3 = next2.e;
                int i5 = (b3 & 3) == 0 ? 0 : 1;
                int i6 = (b3 & 8) == 0 ? 0 : 1;
                int i7 = (b3 & 4) == 0 ? 0 : 1;
                int i8 = (b3 & 16) == 0 ? 0 : 1;
                StringBuilder sb = new StringBuilder();
                Iterator<com.heytap.accessory.sdp.service.protocol.c.a> it3 = it;
                String str2 = d;
                sb.append(str2);
                Iterator<com.heytap.accessory.sdp.service.protocol.c.b> it4 = it2;
                sb.append("SLPTrack");
                com.heytap.accessory.base.logging.a.a(sb.toString(), "service incr role:" + ((int) next2.e) + "; awakenable:" + i8);
                com.heytap.accessory.base.bean.b bVar3 = bVarA;
                long j3 = jA;
                FrameworkServiceDescription frameworkServiceDescription = new FrameworkServiceDescription(next.a, next.b, null, bVarA.h(), String.valueOf(next2.b), next2.d, i3 + "." + i4, i5, i6, i7, next2.c, i8);
                if (b2 == 1) {
                    arrayList2.add(frameworkServiceDescription);
                    com.heytap.accessory.base.logging.a.c(str2, "[Capex] Received an install update for " + next.a + ", profile: " + next2.d);
                } else if (b2 == 0) {
                    arrayList.add(frameworkServiceDescription);
                    com.heytap.accessory.base.logging.a.c(str2, "[Capex] Received an uninstall update for " + next.a + ", profile: " + next2.d);
                }
                it = it3;
                it2 = it4;
                bVarA = bVar3;
                jA = j3;
            }
        }
        long j4 = jA;
        com.heytap.accessory.base.bean.b bVar4 = bVarA;
        if (arrayList.isEmpty()) {
            bVar2 = this;
            j2 = j4;
        } else {
            bVar2 = this;
            j2 = j4;
            bVar2.a(j2, arrayList, cVarB.b);
            FrameworkConnection.d dVar = bVar2.b;
            if (dVar != null) {
                dVar.a(arrayList, j2, 2);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        bVar2.a.a(bVar4, arrayList2, cVarB.b);
        FrameworkConnection.d dVar2 = bVar2.b;
        if (dVar2 != null) {
            dVar2.a(arrayList2, j2, 1);
        }
    }

    public void a(long j2, com.heytap.accessory.session.a aVar, boolean z) {
        Queue<com.heytap.accessory.message.a> queue;
        if (z) {
            synchronized (c) {
                com.heytap.accessory.sdp.service.e eVar = f.get(Long.valueOf(j2));
                if (eVar != null && (queue = eVar.b) != null && !queue.isEmpty()) {
                    com.heytap.accessory.base.logging.a.a(d, "onSpaceAvailable(" + z + ") : CapexSession processing the pending requests[" + eVar.b.size() + "]");
                    while (!eVar.b.isEmpty()) {
                        com.heytap.accessory.message.a aVarPoll = eVar.b.poll();
                        if (aVarPoll != null) {
                            if (!a(j2, aVar, aVarPoll)) {
                                com.heytap.accessory.base.logging.a.e(d, "Enqueue failed for sessionId: " + aVarPoll.j());
                                break;
                            }
                        } else {
                            com.heytap.accessory.base.logging.a.b(d, "message polled from queue of CD is null!");
                            return;
                        }
                    }
                } else {
                    com.heytap.accessory.base.logging.a.e(d, "onSpaceAvailable(" + z + ") : CapexSession ignoring this callback as there no pending requests in the queue...");
                }
                return;
            }
        }
        com.heytap.accessory.base.logging.a.e(d, "onSpaceAvailable(" + z + ") : CapexSession ignoring this dummy callback...");
    }

    public final synchronized void a(List<FrameworkServiceDescription> list, int i2) {
        int iGenerateCheckSum;
        com.heytap.accessory.base.logging.a.a(d, "updateRemoteDevices serviceRecords: " + list);
        ArrayMap arrayMap = new ArrayMap();
        for (FrameworkServiceDescription frameworkServiceDescription : list) {
            for (com.heytap.accessory.base.bean.b bVar : AccessoryManager.h().b(frameworkServiceDescription.i())) {
                synchronized (bVar) {
                    Iterator<String> it = bVar.q().iterator();
                    while (it.hasNext()) {
                        if (it.next().equalsIgnoreCase(frameworkServiceDescription.m())) {
                            com.heytap.accessory.base.logging.a.c(d, "[Capex] Sending incremental update message to accessory: " + bVar.l() + ", for profile: " + frameworkServiceDescription.m() + ". Update type: " + i2);
                            if (arrayMap.containsKey(Long.valueOf(bVar.l()))) {
                                ((List) arrayMap.get(Long.valueOf(bVar.l()))).add(frameworkServiceDescription);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(frameworkServiceDescription);
                                arrayMap.put(Long.valueOf(bVar.l()), arrayList);
                            }
                        }
                    }
                }
            }
        }
        if (arrayMap.isEmpty()) {
            com.heytap.accessory.base.logging.a.a(d, "Update list is empty");
        }
        for (Map.Entry entry : arrayMap.entrySet()) {
            com.heytap.accessory.base.bean.b bVarA = a(((Long) entry.getKey()).longValue());
            if (bVarA == null) {
                com.heytap.accessory.base.logging.a.e(d, "Accessory with id " + entry.getKey() + " was not found in map!");
            } else {
                synchronized (bVarA) {
                    iGenerateCheckSum = ServiceDiscoveryUtils.generateCheckSum(this.a.a(255), bVarA.q());
                }
                com.heytap.accessory.base.logging.a.a(d, "[Capex] Modified checksum to be sent to accesory " + entry.getKey() + " as part of incremental update is: " + iGenerateCheckSum);
                a(bVarA, (List<FrameworkServiceDescription>) entry.getValue(), i2, (long) iGenerateCheckSum);
            }
        }
    }

    public final void a(com.heytap.accessory.base.bean.b bVar, List<FrameworkServiceDescription> list, int i2, long j2) {
        long jB = b(bVar.l());
        com.heytap.accessory.message.a aVarA = com.heytap.accessory.sdp.service.protocol.d.a(ServiceDiscoveryUtils.formUpdateServiceCapabilityParams(list, i2, j2, bVar), bVar.l(), jB);
        com.heytap.accessory.session.a aVarE = com.heytap.accessory.session.g.o().e(bVar.l(), jB);
        if (aVarE == null) {
            synchronized (c) {
                com.heytap.accessory.sdp.service.e eVar = f.get(Long.valueOf(bVar.l()));
                if (eVar != null) {
                    aVarE = eVar.c;
                }
            }
        }
        if (aVarA != null && aVarE != null) {
            a(bVar.l(), aVarE, aVarA);
            return;
        }
        com.heytap.accessory.base.logging.a.b(d, "Invalid UpdateInfo - (" + aVarA + ", " + aVarE + ")");
    }

    public List<Integer> a(FrameworkServiceDescription frameworkServiceDescription, List<com.heytap.accessory.session.params.a.a> list) {
        return ServiceDiscoveryUtils.findCommonChannel(frameworkServiceDescription, list);
    }

    public boolean a(long j2, com.heytap.accessory.session.a aVar, com.heytap.accessory.sdp.service.protocol.b bVar, int i2) {
        com.heytap.accessory.message.a aVarB;
        if (aVar == null) {
            com.heytap.accessory.base.logging.a.b(d, "Sending Capex request failed. Session is null!");
            return false;
        }
        if (i2 == 1) {
            com.heytap.accessory.base.logging.a.c(d, "[send Capex] query");
            aVarB = com.heytap.accessory.sdp.service.protocol.d.a(bVar, j2, aVar.a());
        } else {
            com.heytap.accessory.base.logging.a.c(d, "[send Capex] response");
            aVarB = com.heytap.accessory.sdp.service.protocol.d.b(bVar, j2, aVar.a());
        }
        if (aVarB != null) {
            return a(j2, aVar, aVarB);
        }
        return false;
    }

    @Nullable
    public com.heytap.accessory.sdp.service.protocol.b a(com.heytap.accessory.message.a aVar) {
        return com.heytap.accessory.sdp.service.protocol.d.a(aVar);
    }

    public void a(Runnable runnable, long j2) {
        j.postDelayed(runnable, j2);
    }

    public void a(long j2, com.heytap.accessory.session.a aVar) {
        com.heytap.accessory.session.g.o().a(aVar, c(j2, aVar));
    }

    public void a(com.heytap.accessory.base.bean.b bVar, String str, int i2) {
        AccessoryManager.h().a(bVar, str, i2);
    }

    public com.heytap.accessory.base.bean.b a(long j2) {
        return AccessoryManager.h().a(j2);
    }

    public final void a(long j2, com.heytap.accessory.sdp.service.e eVar, String str) {
        f.put(Long.valueOf(j2), eVar);
    }
}
