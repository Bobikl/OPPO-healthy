package com.heytap.accessory.base;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.ArrayMap;
import androidx.annotation.WorkerThread;
import com.heytap.accessory.BaseAgent;
import com.heytap.accessory.BaseMessage;
import com.heytap.accessory.WriteStatus;
import com.heytap.accessory.api.IDeathCallback;
import com.heytap.accessory.api.IMsgExpCallback;
import com.heytap.accessory.api.IPeerAgentCallback;
import com.heytap.accessory.api.IServiceConnectionIndicationCallback;
import com.heytap.accessory.base.FrameworkConnection;
import com.heytap.accessory.base.bean.FrameworkServiceChannelDescription;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.base.database.AccessoryDatabase;
import com.heytap.accessory.base.database.r;
import com.heytap.accessory.bean.TrafficReport;
import com.heytap.accessory.misc.constants.FrameworkServiceConstants;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.platform.services.FrameworkService;
import com.heytap.accessory.sdk.SdkWrapper;
import com.heytap.accessory.security.k;
import com.heytap.accessory.session.g;
import com.heytap.accessory.transport.f;
import com.heytap.accessory.utils.AFArraysUtils;
import com.heytap.accessory.utils.BroadcastUtils;
import com.heytap.accessory.utils.ResourceParserException;
import com.heytap.accessory.utils.SystemUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FrameworkConnection {
    public static final String r = "FrameworkConnection";
    public static final Object s = new Object();
    public static Map<String, List<e>> t;
    public final List<Long> a;
    public final Map<Long, List<Long>> c;
    public final boolean d;
    public List<String> f;
    public Context i;
    public DeathCallback j;
    public com.heytap.accessory.base.b k;
    public com.heytap.accessory.session.d l;
    public ResultReceiver m;
    public IDeathCallback n;
    public IServiceConnectionIndicationCallback o;
    public final Map<String, List<com.heytap.accessory.base.bean.b>> q;
    public final Object b = new Object();
    public final TreeSet<String> e = new TreeSet<>();
    public ResultReceiver g = null;
    public Map<String, SdkWrapper.a> h = new ConcurrentHashMap();
    public List<com.heytap.accessory.base.bean.b> p = new CopyOnWriteArrayList();

    public static class FrameworkReceiver extends ResultReceiver {
        public FrameworkReceiver(FrameworkConnection frameworkConnection) {
            super(null);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (bundle == null) {
                com.heytap.accessory.base.logging.a.b(FrameworkConnection.r, "onReceiveResult(): received null data!");
            } else if (i == 0) {
                BufferPool.recycle(bundle.getByteArray("com.heytap.accessory.adapter.extra.READ_BYTES"));
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (FrameworkConnection.this) {
                List list = (List) FrameworkConnection.t.get(this.a);
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((e) it.next()).a == FrameworkConnection.this) {
                            it.remove();
                            com.heytap.accessory.base.logging.a.d(FrameworkConnection.r, "Removed incremental update callback for:" + this.a);
                        }
                    }
                }
            }
        }
    }

    public class c implements com.heytap.accessory.session.e {
        public final /* synthetic */ g.j a;
        public final /* synthetic */ long b;
        public final /* synthetic */ com.heytap.accessory.session.a c;

        public c(g.j jVar, long j, com.heytap.accessory.session.a aVar) {
            this.a = jVar;
            this.b = j;
            this.c = aVar;
        }

        @Override // com.heytap.accessory.session.e
        public void a(com.heytap.accessory.message.b bVar, TrafficReport trafficReport) {
            if (bVar == null) {
                com.heytap.accessory.base.logging.a.b(FrameworkConnection.r, "item is null");
                return;
            }
            g.j jVar = this.a;
            long jA = com.heytap.accessory.misc.utils.c.a(jVar.a, String.valueOf(jVar.g), String.valueOf(this.a.h));
            synchronized (FrameworkConnection.this.b) {
                if (!FrameworkConnection.this.c.containsKey(Long.valueOf(jA))) {
                    b(bVar, trafficReport);
                    return;
                }
                com.heytap.accessory.base.logging.a.e(FrameworkConnection.r, "Skipping message. CloseServiceConn already requested: Session: " + bVar.e());
            }
        }

        @Override // com.heytap.accessory.session.e
        public boolean b() {
            return false;
        }

        public final void b(com.heytap.accessory.message.b bVar, TrafficReport trafficReport) {
            Buffer buffer;
            Buffer buffer2;
            Buffer buffer3;
            Buffer bufferA = null;
            Buffer bufferObtain = null;
            try {
                Buffer bufferF = bVar.c().f();
                try {
                    byte[] buffer4 = bufferF.getBuffer();
                    int offset = bufferF.getOffset();
                    int payloadLength = bufferF.getPayloadLength();
                    byte bA = SdkWrapper.a(bufferF);
                    int iA = f.a(bVar.a(), bVar.e());
                    com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(bVar.a());
                    if (bVarA == null) {
                        com.heytap.accessory.base.logging.a.b(FrameworkConnection.r, "Accessory not found");
                    } else {
                        if ((buffer4[offset] & 4) != 0 && (payloadLength = FrameworkConnection.this.a(this.a, buffer4, offset, payloadLength)) <= 1) {
                            com.heytap.accessory.base.logging.a.b(FrameworkConnection.r, "Message Decryption failed!");
                            a(false, bufferF, null, null, null, null);
                            a(false, bufferF, null, null, null, null);
                            return;
                        }
                        if (bVarA.L() && (bA & 16) != 0) {
                            bufferA = FrameworkConnection.this.a(iA, buffer4, offset + 1, payloadLength - 1);
                            if (bufferA == null) {
                                com.heytap.accessory.base.logging.a.b(FrameworkConnection.r, "Decompression Failed: Corrupt packet");
                                a(false, bufferF, null, null, null, null);
                                a(false, bufferF, null, null, bufferA, null);
                                return;
                            } else {
                                buffer4 = bufferA.getBuffer();
                                buffer4[offset] = bA;
                                payloadLength = bufferA.getPayloadLength() + 1;
                            }
                        }
                        com.heytap.accessory.base.logging.a.d(FrameworkConnection.r, "onMessageReceived(" + FrameworkConnection.this.k.d() + ") offset:" + offset + " length:" + payloadLength);
                        FrameworkConnection.b(buffer4, offset, payloadLength);
                        if (buffer4.length >= iA) {
                            int i = offset + payloadLength;
                            try {
                                bufferObtain = BufferPool.obtain(i);
                                bufferObtain.extractFrom(buffer4, 0, i);
                                buffer4 = bufferObtain.getBuffer();
                            } catch (Exception unused) {
                                com.heytap.accessory.base.logging.a.b(FrameworkConnection.r, "sendDataToApp buffer error.");
                            }
                        }
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("com.heytap.accessory.adapter.extra.READ_BYTES", buffer4);
                        bundle.putInt("com.heytap.accessory.adapter.extra.READ_OFFSET", offset);
                        bundle.putInt("com.heytap.accessory.adapter.extra.READ_LENGHT", payloadLength);
                        bundle.putByte(FrameworkServiceConstants.EXTRA_READ_SDK_HEADER, bA);
                        bundle.putAll(trafficReport.getBundle());
                        if (FrameworkConnection.this.j == null || FrameworkConnection.this.j.asBinder().isBinderAlive()) {
                            com.heytap.accessory.base.logging.a.a(FrameworkConnection.r, "Binder is Alive, give receive data to app:" + FrameworkConnection.this.k.c());
                            FrameworkConnection.this.a(this.a.b.get(Long.valueOf(this.b)), 201, bundle);
                        } else {
                            com.heytap.accessory.base.logging.a.e(FrameworkConnection.r, "Application is already killed!!! Data will not be sent!");
                            FrameworkService.cleanUpFrameworkConnection(FrameworkConnection.this.k.a());
                        }
                    }
                    a(false, bufferF, null, null, bufferA, bufferObtain);
                } catch (Throwable th) {
                    th = th;
                    buffer2 = bufferA;
                    buffer3 = bufferObtain;
                    buffer = bufferF;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        a(false, buffer, null, null, buffer2, buffer3);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                buffer = null;
                buffer2 = null;
                buffer3 = null;
            }
        }

        public final void a(boolean z, Buffer buffer, Buffer buffer2, Buffer buffer3, Buffer buffer4, Buffer buffer5) {
            if (!FrameworkConnection.this.d) {
                buffer.recycle();
            }
            if ((!FrameworkConnection.this.d || z) && buffer2 != null) {
                buffer2.recycle();
            }
            if ((!FrameworkConnection.this.d || buffer4 != null) && buffer3 != null) {
                buffer3.recycle();
            }
            if (FrameworkConnection.this.d || buffer4 == null) {
                return;
            }
            buffer4.recycle();
        }

        @Override // com.heytap.accessory.session.e
        public void a(long j, boolean z) {
            g.j jVar = this.a;
            long jA = com.heytap.accessory.misc.utils.c.a(jVar.a, String.valueOf(jVar.g), String.valueOf(this.a.h));
            synchronized (FrameworkConnection.this.b) {
                if (FrameworkConnection.this.c.containsKey(Long.valueOf(jA))) {
                    com.heytap.accessory.base.logging.a.e(FrameworkConnection.r, "Skip onSpaceAvailable. CloseServiceConn already requested: Session: " + this.c.a());
                    return;
                }
                com.heytap.accessory.base.logging.a.a(FrameworkConnection.r, "ISessionEventListener-onSpaceAvailable()");
                Bundle bundle = new Bundle();
                bundle.putBoolean(FrameworkServiceConstants.EXTRA_SEND_TIMEOUT, z);
                FrameworkConnection.this.a(this.a.b.get(Long.valueOf(this.b)), 202, bundle);
            }
        }

        @Override // com.heytap.accessory.session.e
        public void a() {
            FrameworkConnection.this.g(this.c.a());
        }
    }

    public interface d {
        void a(List<FrameworkServiceDescription> list, long j, int i);
    }

    public static class e {
        public FrameworkConnection a;
        public Object b;

        public e(FrameworkConnection frameworkConnection, Object obj) {
            this.a = frameworkConnection;
            this.b = obj;
        }
    }

    static {
        com.heytap.accessory.sdp.service.b.g().a(j());
        t = new ArrayMap();
    }

    public FrameworkConnection(String str, int i) {
        this.k = new com.heytap.accessory.base.b(PlatformUtils.getUniqueClientVal(i, str), str);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.c = new ArrayMap();
        this.q = Collections.synchronizedMap(new ArrayMap());
        this.f = new ArrayList();
        this.a = new CopyOnWriteArrayList();
        this.d = PlatformUtils.isClientInAFPProcess(i);
        this.i = PlatformUtils.getContext();
    }

    public static d j() {
        return new d() { // from class: com.oplus.aiunit.vision.e08
            @Override // com.heytap.accessory.base.FrameworkConnection.d
            public final void a(List list, long j, int i) {
                FrameworkConnection.a(list, j, i);
            }
        };
    }

    public ResultReceiver f() {
        if (!this.d) {
            return null;
        }
        if (this.m == null) {
            this.m = new FrameworkReceiver(this);
        }
        return this.m;
    }

    public String g() {
        return this.k.a() == null ? "" : this.k.a();
    }

    public final void h(long j) {
        com.heytap.accessory.base.bean.b bVarE = e(j);
        if (bVarE != null) {
            AccessoryManager.h().a(bVarE, "com.heytap.accessory.device.action.ACCESSORY_DETACHED", -1);
        }
    }

    public FrameworkServiceDescription i(String str) {
        if (str != null && !str.isEmpty()) {
            this.k.a(0);
            return e(str);
        }
        com.heytap.accessory.base.logging.a.e(r, "Invalid parameters. in retrieveFrameworkServiceComponentDescription() ...");
        this.k.a(769);
        return null;
    }

    public int k() {
        return this.k.b();
    }

    public final int l() {
        return g.o().p();
    }

    public String m() {
        return this.k.c() == null ? "" : this.k.c();
    }

    public com.heytap.accessory.session.d n() {
        if (this.l == null) {
            this.l = new a();
        }
        return this.l;
    }

    public void d(long j) {
        e().a(e(j), true, 3);
    }

    public AccessoryManager e() {
        return AccessoryManager.h();
    }

    public void j(String str) {
        if (str == null) {
            com.heytap.accessory.base.logging.a.e(r, "Failed to unregister Mex callback!");
        } else {
            h(str);
            this.f.remove(str);
        }
    }

    public final void k(long j) {
        g.j jVarF = f(j);
        if (jVarF == null) {
            com.heytap.accessory.base.logging.a.e(r, "Can't find the service record to send close!");
            return;
        }
        String str = jVarF.m;
        int i = jVarF.h;
        long j2 = jVarF.a;
        com.heytap.accessory.base.logging.a.d(r, "All sessions flushed conn:" + j + " " + str);
        a(j2, str, jVarF.g, i);
    }

    public final void c(long j) {
        com.heytap.accessory.base.bean.b bVarE = e(j);
        com.heytap.accessory.base.logging.a.a(r, "Channel has been unlocked");
        if (bVarE == null || bVarE.A() != 11) {
            return;
        }
        AccessoryManager.h().a(bVarE, "com.heytap.accessory.device.action.ACCESSORY_ATTACHED", -1);
    }

    public Bundle d(String str) {
        FrameworkServiceDescription frameworkServiceDescriptionE = e(str);
        Bundle bundle = new Bundle();
        if (frameworkServiceDescriptionE == null) {
            com.heytap.accessory.base.logging.a.e(r, "Failed to find Service description for Local Agent ID:" + str);
        } else {
            bundle.putString("packageName", frameworkServiceDescriptionE.d());
            bundle.putString("agentImplclass", frameworkServiceDescriptionE.b());
        }
        return bundle;
    }

    public com.heytap.accessory.base.bean.b e(long j) {
        return AccessoryManager.h().a(j);
    }

    public void g(long j) {
        long jLongValue;
        List<Long> list;
        synchronized (this.b) {
            Iterator<Map.Entry<Long, List<Long>>> it = this.c.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    jLongValue = -1;
                    break;
                }
                Map.Entry<Long, List<Long>> next = it.next();
                if (next.getValue().contains(Long.valueOf(j))) {
                    jLongValue = next.getKey().longValue();
                    break;
                }
            }
        }
        if (jLongValue == -1) {
            com.heytap.accessory.base.logging.a.e(r, "onFlush() : connection is INVALID!!! for session id = " + j);
            return;
        }
        synchronized (this.b) {
            list = this.c.get(Long.valueOf(jLongValue));
        }
        if (list == null) {
            com.heytap.accessory.base.logging.a.b(r, "No session map found for connection id" + jLongValue);
            return;
        }
        list.remove(Long.valueOf(j));
        if (list.isEmpty()) {
            k(jLongValue);
            synchronized (this.b) {
                this.c.remove(Long.valueOf(jLongValue));
            }
            return;
        }
        synchronized (this.b) {
            this.c.remove(Long.valueOf(jLongValue));
            this.c.put(Long.valueOf(jLongValue), list);
        }
    }

    public final void h(String str) {
        if (str == null) {
            com.heytap.accessory.base.logging.a.e(r, "Failed to unregister Mex callback! agentId is null");
        } else {
            com.heytap.accessory.msgexp.b.d().a(str);
        }
    }

    @WorkerThread
    public final FrameworkServiceDescription b(FrameworkServiceDescription frameworkServiceDescription) {
        if (frameworkServiceDescription.p() == this.k.d()) {
            com.heytap.accessory.base.logging.a.a(r, "sdk version code has been updated");
        } else {
            frameworkServiceDescription.b(this.k.d());
            r.a(AccessoryDatabase.b(this.i).c()).a(this.k.d(), frameworkServiceDescription.d(), frameworkServiceDescription.b());
            com.heytap.accessory.sdp.service.b.g().b(frameworkServiceDescription.i(), frameworkServiceDescription.m());
        }
        return frameworkServiceDescription;
    }

    public final FrameworkServiceDescription e(String str) {
        return com.heytap.accessory.sdp.service.b.g().b(str);
    }

    public final int f(String str) {
        return com.heytap.accessory.sdp.service.b.g().b(this.k.c(), str);
    }

    public DeathCallback h() {
        return this.j;
    }

    public void j(long j) {
        g.o().r(j);
    }

    public g.j f(long j) {
        return g.o().h(j);
    }

    public IDeathCallback i() {
        return this.n;
    }

    public FrameworkServiceDescription c(String str) {
        this.k.a(0);
        if (str == null) {
            this.k.a(769);
            com.heytap.accessory.base.logging.a.b(r, "fetchServiceDescription - invalid agent class name");
            return null;
        }
        FrameworkServiceDescription frameworkServiceDescriptionA = com.heytap.accessory.sdp.service.b.g().a(this.k.c(), str);
        if (frameworkServiceDescriptionA == null) {
            com.heytap.accessory.base.logging.a.e(r, "service record not found, agentImplClass = " + str);
            this.k.a(BaseAgent.SERVICE_RECORD_NOT_FOUND);
        } else {
            a(frameworkServiceDescriptionA);
        }
        return frameworkServiceDescriptionA;
    }

    public g.j i(long j) {
        this.a.remove(Long.valueOf(j));
        return g.o().q(j);
    }

    public static /* synthetic */ void a(List list, long j, int i) {
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.e(r, "IncrUpdate Callback : Accessory is null");
            return;
        }
        com.heytap.accessory.base.bean.b bVar = new com.heytap.accessory.base.bean.b(bVarA);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FrameworkServiceDescription frameworkServiceDescription = (FrameworkServiceDescription) it.next();
            Parcel parcelObtain = Parcel.obtain();
            ArrayList arrayList = new ArrayList();
            arrayList.add(frameworkServiceDescription);
            bVar.c(arrayList);
            String str = r;
            com.heytap.accessory.base.logging.a.d(str, "Checking for profile : " + frameworkServiceDescription.m());
            int i2 = frameworkServiceDescription.o() == 1 ? 0 : 1;
            List<e> list2 = t.get(frameworkServiceDescription.m() + "_" + i2);
            if (list2 == null) {
                com.heytap.accessory.base.logging.a.e(str, "IncrUpdate: No app registered receiver for this profile: " + frameworkServiceDescription.m() + "_" + i2);
                parcelObtain.recycle();
            } else {
                for (e eVar : list2) {
                    if (i == 1) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(bVar);
                        ((SdkWrapper.a) eVar.b).a(0, arrayList2);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(bVar);
                        ((SdkWrapper.a) eVar.b).a(1, arrayList3);
                    }
                    com.heytap.accessory.base.logging.a.c(r, "Incremental Update Successful. Sent the callback to the applications with profile Id: " + frameworkServiceDescription.m() + " and status code " + i);
                }
                parcelObtain.recycle();
            }
        }
    }

    public void d() {
        com.heytap.accessory.base.logging.a.c(r, "Clean up FWK conn:" + this.k.a());
        Iterator<Long> it = this.a.iterator();
        while (it.hasNext()) {
            b(String.valueOf(it.next()));
        }
        Iterator<String> it2 = this.e.iterator();
        while (it2.hasNext()) {
            g(it2.next());
        }
        this.e.clear();
        this.h.clear();
        this.g = null;
        Iterator<String> it3 = this.f.iterator();
        while (it3.hasNext()) {
            h(it3.next());
        }
        this.f.clear();
    }

    public boolean b(String str) {
        g.j jVarF = f(Long.parseLong(str));
        if (jVarF == null) {
            com.heytap.accessory.base.logging.a.e(r, "closeServiceConnection failed.. record is null!!");
            return false;
        }
        if (!jVarF.i) {
            synchronized (s) {
                jVarF.f = null;
            }
            i(Long.parseLong(str));
            com.heytap.accessory.base.logging.a.e(r, "closeServiceConnection failed.. connection already closed or still pending negotiation!!");
            return false;
        }
        String str2 = r;
        com.heytap.accessory.base.logging.a.a(str2, "Attempt to close SC connectionId:" + str);
        boolean zB = b(jVarF);
        com.heytap.accessory.base.logging.a.a(str2, "Attempt to close SC result: " + zB);
        this.k.a(zB ? 0 : 20001);
        return zB;
    }

    public Buffer c(byte[] bArr, int i, int i2) {
        return com.heytap.accessory.misc.utils.a.a(bArr, i, i2);
    }

    public boolean b(g.j jVar) {
        String strValueOf = String.valueOf(jVar.g);
        String strValueOf2 = String.valueOf(jVar.h);
        long j = jVar.a;
        long jA = com.heytap.accessory.misc.utils.c.a(j, strValueOf, strValueOf2);
        Map<Long, com.heytap.accessory.session.a> map = jVar.d;
        if (map == null) {
            return true;
        }
        synchronized (this.b) {
            if (this.c.containsKey(Long.valueOf(jA))) {
                com.heytap.accessory.base.logging.a.e(r, "Closure request already in progress!!");
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<Long, com.heytap.accessory.session.a>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().getValue().a()));
            }
            if (arrayList.isEmpty()) {
                k(jA);
                return true;
            }
            synchronized (this.b) {
                this.c.put(Long.valueOf(jA), arrayList);
            }
            Iterator it2 = new ArrayList(arrayList).iterator();
            while (it2.hasNext()) {
                a(j, ((Long) it2.next()).longValue());
            }
            return true;
        }
    }

    public class a implements com.heytap.accessory.session.d {
        public a() {
        }

        @Override // com.heytap.accessory.session.d
        public void a(long j, String str, String str2, Map<Long, com.heytap.accessory.session.a> map) {
            boolean z;
            long jA = com.heytap.accessory.misc.utils.c.a(j, str, str2);
            g.j jVarF = FrameworkConnection.this.f(jA);
            if (jVarF == null || map == null || map.isEmpty()) {
                return;
            }
            jVarF.d.clear();
            jVarF.d = map;
            jVarF.i = true;
            FrameworkConnection.this.a(jVarF);
            synchronized (FrameworkConnection.s) {
                z = jVarF.f != null;
            }
            if (!z) {
                com.heytap.accessory.base.logging.a.e(FrameworkConnection.r, "Connection Setup Callback is NULL!! Closing down the service connection!");
                FrameworkConnection.this.b(String.valueOf(jA));
                return;
            }
            synchronized (FrameworkConnection.s) {
                Bundle bundle = new Bundle();
                bundle.putString(FrameworkServiceConstants.SERVICE_CONNECTION_ID, String.valueOf(jA));
                bundle.putString(FrameworkServiceConstants.EXTRA_CONSUMER_ID, str);
                bundle.putLongArray("channelId", AFArraysUtils.toArray(map.keySet()));
                FrameworkConnection.this.b(jVarF.f, 100, bundle);
                jVarF.f = null;
                com.heytap.accessory.base.logging.a.c(FrameworkConnection.r, "SC negotiation SUCCESS (" + str + ", " + str2 + ") with connection ID: " + jA + ",available channelIds:" + map.keySet().size());
            }
        }

        @Override // com.heytap.accessory.session.d
        public void a(long j, String str, String str2, int i) {
            FrameworkConnection.this.a(j, str, str2, i);
        }

        @Override // com.heytap.accessory.session.d
        public void a(long j, String str, int i) {
            FrameworkConnection.this.a(j, str, i);
        }
    }

    public final void g(String str) {
        this.k.a(new b(str));
    }

    @WorkerThread
    public void a(byte[] bArr) throws ResourceParserException {
        FrameworkService.registerComponents(this.k.c(), bArr);
    }

    @WorkerThread
    public void a(FrameworkServiceDescription frameworkServiceDescription) {
        b(frameworkServiceDescription);
    }

    public void a(String str, IMsgExpCallback iMsgExpCallback) {
        if (str != null && iMsgExpCallback != null) {
            com.heytap.accessory.msgexp.b.d().a(str, iMsgExpCallback);
            this.f.add(str);
        } else {
            com.heytap.accessory.base.logging.a.e(r, "Failed to register Mex callback!");
        }
    }

    public synchronized int a(long j, String str, IPeerAgentCallback iPeerAgentCallback) {
        SdkWrapper.a aVarA;
        FrameworkServiceDescription frameworkServiceDescriptionE = e(str);
        if (frameworkServiceDescriptionE == null) {
            com.heytap.accessory.base.logging.a.b(r, "Local Service description not found for agentId:" + str);
            return 3081;
        }
        String str2 = frameworkServiceDescriptionE.m() + "_" + frameworkServiceDescriptionE.o();
        if (this.h.containsKey(str2)) {
            com.heytap.accessory.base.logging.a.a(r, "profile already registered for incremental update");
            aVarA = this.h.get(str2);
        } else {
            aVarA = null;
        }
        if (aVarA == null) {
            aVarA = SdkWrapper.a(iPeerAgentCallback, frameworkServiceDescriptionE);
            e eVar = new e(this, aVarA);
            List<e> list = t.get(str2);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eVar);
                t.put(str2, arrayList);
            } else {
                list.add(eVar);
            }
            this.h.put(str2, aVarA);
            this.e.add(str2);
            com.heytap.accessory.base.logging.a.a(r, "Added profile:" + frameworkServiceDescriptionE.m() + "_" + frameworkServiceDescriptionE.o() + " for incremental update");
        }
        if (SdkWrapper.a(aVarA)) {
            com.heytap.accessory.base.logging.a.b(r, "Previous find peer response still pending for agentId : " + str);
            return 10003;
        }
        aVarA.b();
        if (a(j, frameworkServiceDescriptionE, aVarA)) {
            return 0;
        }
        aVarA.c();
        return 3072;
    }

    public final void b(int i) {
        if (i == 4628) {
            this.k.a(10007);
            return;
        }
        if (i == 4627) {
            this.k.a(10006);
            return;
        }
        if (i == 4640) {
            this.k.a(10010);
            return;
        }
        if (i == 4641) {
            this.k.a(1038);
        } else if (i == 4642) {
            this.k.a(1039);
        } else if (i == 4643) {
            this.k.a(BaseAgent.CONNECTION_FAILURE_CHANNELID_MISMATCH);
        }
    }

    public final void b(long j, long j2) {
        g.o().i(j, j2);
    }

    public static void b(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = -1;
        }
        for (int i4 = i + i2; i4 < bArr.length; i4++) {
            bArr[i4] = -1;
        }
    }

    public final void b(Object obj, int i, Bundle bundle) {
        if (obj == null) {
            com.heytap.accessory.base.logging.a.e(r, "Connection Event callback is null!");
        } else {
            ((com.heytap.accessory.sdk.b.c) obj).a(i, bundle);
        }
    }

    public synchronized boolean a(long j, FrameworkServiceDescription frameworkServiceDescription, SdkWrapper.a aVar) {
        String strM = frameworkServiceDescription.m();
        frameworkServiceDescription.o();
        this.k.a(0);
        if (aVar == null) {
            com.heytap.accessory.base.logging.a.b(r, "No result receiver callback present.");
            this.k.a(3073);
            return false;
        }
        List<com.heytap.accessory.base.bean.b> listA = a(255, f(strM));
        com.heytap.accessory.base.logging.a.a(r, "initiateCapabilityDiscovery: connectedAccessories size is " + listA.size());
        new ArrayList();
        ArrayList<com.heytap.accessory.base.bean.b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (-1 == j) {
            arrayList.addAll(listA);
        } else {
            for (com.heytap.accessory.base.bean.b bVar : listA) {
                if (j == bVar.l()) {
                    arrayList.add(bVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            com.heytap.accessory.base.logging.a.e(r, "No connected accessories found. Returning ....");
            this.k.a(3076);
            return a(10001, strM, aVar);
        }
        for (com.heytap.accessory.base.bean.b bVar2 : arrayList) {
            if (bVar2.a(strM)) {
                com.heytap.accessory.base.bean.b bVar3 = new com.heytap.accessory.base.bean.b(bVar2);
                bVar3.a();
                arrayList2.add(bVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            this.p = arrayList2;
            this.q.put(strM, arrayList2);
            com.heytap.accessory.base.logging.a.a(r, "requestedProfileId: " + strM + " for:" + this.k.c());
            return a(102, strM, aVar);
        }
        com.heytap.accessory.base.logging.a.c(r, "requestedProfileId:" + strM + " not found");
        return a(10002, strM, aVar);
    }

    public boolean b(long j) {
        return this.a.contains(Long.valueOf(j));
    }

    public final int b(g.j jVar, byte[] bArr, int i, int i2) {
        FrameworkServiceDescription frameworkServiceDescriptionE;
        long j;
        int i3;
        if (jVar.j) {
            frameworkServiceDescriptionE = e(String.valueOf(jVar.g));
        } else {
            frameworkServiceDescriptionE = e(String.valueOf(jVar.h));
        }
        if (frameworkServiceDescriptionE == null) {
            com.heytap.accessory.base.logging.a.b(r, "Message Encryption failed.. service description is not found");
            return 1;
        }
        if (frameworkServiceDescriptionE.o() == 0) {
            boolean z = jVar.j;
            j = z ? jVar.g : jVar.h;
            i3 = z ? jVar.h : jVar.g;
        } else {
            boolean z2 = jVar.j;
            j = z2 ? jVar.h : jVar.g;
            i3 = z2 ? jVar.g : jVar.h;
        }
        int iB = k.a((com.heytap.accessory.connectivity.core.interfaces.a) null).b(jVar.a, j, i3, bArr, i + 1, i2 - 1);
        if (iB > 0) {
            return iB + 1;
        }
        com.heytap.accessory.base.logging.a.b(r, "Message Encryption failed!! (" + iB + ") offset=" + i + "; length=" + i2);
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x03e4  */
    public Bundle a(long j, String str, String str2, Object obj, List<String> list, List<?> list2, Object obj2) {
        FrameworkServiceDescription next;
        FrameworkServiceDescription frameworkServiceDescription;
        String str3;
        long j2;
        g.j jVarF;
        FrameworkServiceDescription next2;
        com.heytap.accessory.base.bean.b bVarE = e(j);
        if (bVarE != null && bVarE.A() == 10) {
            Iterator<FrameworkServiceDescription> it = bVarE.x().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.a().trim().equals(str2));
            if (next == null) {
                com.heytap.accessory.base.logging.a.e(r, "Unable to recover details to make a service connection for initiator ID " + str + " & for acceptor ID:" + str2);
                this.k.a(10008);
                return a(false, this.k.b());
            }
            int iH = next.h();
            long jA = com.heytap.accessory.misc.utils.c.a(j, str, str2);
            FrameworkServiceDescription frameworkServiceDescriptionI = i(str);
            if (frameworkServiceDescriptionI == null) {
                com.heytap.accessory.base.logging.a.e(r, "Unable to find a registered component with ID: " + str + "Trying to find the correct registered ID");
                String strM = next.m();
                Iterator<FrameworkServiceDescription> it2 = com.heytap.accessory.sdp.service.b.g().f(this.k.c()).iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!next2.m().trim().equalsIgnoreCase(strM));
                if (next2 == null) {
                    com.heytap.accessory.base.logging.a.b(r, "Unable to recover local service profile to make a service connection for initiator ID " + str + " & for acceptor ID:" + str2 + " for Profile:" + strM);
                    this.k.a(10008);
                    return a(false, this.k.b());
                }
                String str4 = r;
                com.heytap.accessory.base.logging.a.c(str4, "Successfully recovered actual registered Id for profile:" + strM + "Received Initiator ID:" + str + " Recovered Inititator ID:" + next2.a() + " & for acceptor ID:" + str2);
                String strA = next2.a();
                FrameworkServiceDescription frameworkServiceDescriptionI2 = i(strA);
                if (frameworkServiceDescriptionI2 == null) {
                    com.heytap.accessory.base.logging.a.b(str4, "Unable to recover local service profile with channel details for initiator ID " + str + " & for acceptor ID:" + str2 + " for Profile:" + strM);
                    this.k.a(10008);
                    return a(false, this.k.b());
                }
                this.i.sendBroadcast(BroadcastUtils.getRegistrationIntent(this.k.c()));
                frameworkServiceDescription = frameworkServiceDescriptionI2;
                str3 = strA;
            } else {
                frameworkServiceDescription = frameworkServiceDescriptionI;
                str3 = str;
            }
            if (obj == null) {
                com.heytap.accessory.base.logging.a.e(r, "Invalid parameters. connectionSetupCallback is null ...");
                this.k.a(BaseAgent.ERROR_CONNECTION_INVALID_PARAM);
                return a(false, this.k.b());
            }
            int iL = frameworkServiceDescription.l();
            if (bVarE.A() != 10 && (iL != 1 || bVarE.A() != 11)) {
                com.heytap.accessory.base.logging.a.e(r, "No accessory found with accessory ID: " + j);
                this.k.a(10004);
                return a(false, this.k.b());
            }
            g.j jVarF2 = f(jA);
            if (jVarF2 != null && jVarF2.i) {
                com.heytap.accessory.base.logging.a.e(r, "A pair of components cannot have multiple open service connections!");
                this.k.a(10005);
                return a(false, this.k.b());
            }
            if (jVarF2 != null) {
                com.heytap.accessory.base.logging.a.e(r, "Another service connection with the pair (" + str + ", " + str2 + ") is pending negotiation.\nRejecting this service connection request");
                this.k.a(10009);
                return a(false, this.k.b());
            }
            if (frameworkServiceDescription.l() == 0) {
                d(j);
                j(j);
                a(j);
            }
            if (!str.equals(str3) && (jVarF = f((jA = com.heytap.accessory.misc.utils.c.a(j, str3, str2)))) != null) {
                if (jVarF.i) {
                    com.heytap.accessory.base.logging.a.e(r, "A pair of components cannot have multiple open service connections!(localInitiator)");
                    this.k.a(10005);
                    return a(false, this.k.b());
                }
                com.heytap.accessory.base.logging.a.e(r, "Another service connection with the pair (" + str + ", " + str2 + ") is pending negotiation.(localInitiator)\nRejecting this service connection request");
                this.k.a(10009);
                return a(false, this.k.b());
            }
            com.heytap.accessory.base.logging.a.d(r, "Local app initiates SC (" + str3 + ", " + str2 + ")");
            g.j jVar = new g.j();
            jVar.a = j;
            jVar.g = Integer.parseInt(str3);
            frameworkServiceDescription.o();
            jVar.h = Integer.parseInt(str2);
            jVar.m = frameworkServiceDescription.m();
            jVar.c = frameworkServiceDescription.f();
            frameworkServiceDescription.d();
            jVar.d = new ArrayMap();
            jVar.b = new ArrayMap();
            jVar.i = false;
            jVar.l = frameworkServiceDescription.l();
            jVar.j = true;
            synchronized (s) {
                jVar.f = obj;
            }
            jVar.e = obj2;
            Iterator<String> it3 = list.iterator();
            int i = 0;
            while (it3.hasNext()) {
                jVar.b.put(Long.valueOf(Long.parseLong(it3.next())), list2.get(i));
                i++;
            }
            com.heytap.accessory.session.d dVarN = n();
            a(jA, jVar);
            long j3 = jA;
            String str5 = str3;
            int iA = a(jVar.a, jVar.g, jVar.m, dVarN, jVar.h, jVar.c, j3, iH);
            if (iA == 1) {
                j2 = j3;
                if (!g.o().l(j2)) {
                }
                com.heytap.accessory.base.logging.a.d(r, "Added SC record (" + jVar.g + ", " + jVar.h + ")");
                if (iA == 2) {
                    dVarN.a(j, str5, str2, g.o().g(j2));
                }
                return a(true, 0);
            }
            j2 = j3;
            if (iA != 2) {
                com.heytap.accessory.base.logging.a.e(r, "Could not enqueue the service connection request!");
                if (bVarE.A() == 11 && bVarE.r().equals(this.k.c())) {
                    c(j);
                }
                b(l());
                i(j2);
                return a(false, this.k.b());
            }
            com.heytap.accessory.base.logging.a.d(r, "Added SC record (" + jVar.g + ", " + jVar.h + ")");
            if (iA == 2) {
                dVarN.a(j, str5, str2, g.o().g(j2));
            }
            return a(true, 0);
        }
        com.heytap.accessory.base.logging.a.e(r, "Unable to recover Accessory to make a service connection for initiator ID " + str + " & for acceptor ID:" + str2);
        this.k.a(10004);
        return a(false, this.k.b());
    }

    public final void a(long j) {
        com.heytap.accessory.base.bean.b bVarE = e(j);
        if (bVarE != null) {
            com.heytap.accessory.base.logging.a.a(r, "Channel has been locked. Setting privilege package to " + this.k.c());
            bVarE.l(11);
            bVarE.i(this.k.c());
            h(j);
        }
    }

    public FrameworkServiceDescription a(String str, String str2) {
        this.k.a(0);
        if (str != null && str2 != null) {
            FrameworkServiceDescription frameworkServiceDescriptionA = com.heytap.accessory.sdp.service.b.g().a(str, str2);
            if (frameworkServiceDescriptionA != null) {
                return frameworkServiceDescriptionA;
            }
            this.k.a(BaseAgent.SERVICE_RECORD_NOT_FOUND);
            return frameworkServiceDescriptionA;
        }
        this.k.a(769);
        com.heytap.accessory.base.logging.a.b(r, "fetchServiceDescription - invalid package or agent class");
        return null;
    }

    public Bundle a(String str, String str2, String str3, long j, final ResultReceiver resultReceiver) {
        this.k.a(0);
        if (resultReceiver == null) {
            com.heytap.accessory.base.logging.a.e(r, "Result receiver is null for app authentication!!");
            this.k.a(1537);
            return a(false, this.k.b());
        }
        com.heytap.accessory.base.bean.b bVarE = e(j);
        if (bVarE != null && bVarE.A() != 2 && bVarE.A() != 1) {
            if (a(str, str2, str3, j, new com.heytap.accessory.session.c() { // from class: com.oplus.aiunit.vision.d08
                @Override // com.heytap.accessory.session.c
                public final void a(int i, byte[] bArr) {
                    FrameworkConnection.a(resultReceiver, i, bArr);
                }
            })) {
                return a(true, 0);
            }
            this.k.a(10014);
            return a(false, this.k.b());
        }
        com.heytap.accessory.base.logging.a.e(r, "Accessory not found!");
        this.k.a(10014);
        return a(false, this.k.b());
    }

    public static /* synthetic */ void a(ResultReceiver resultReceiver, int i, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("PEER_AGENT_KEY", bArr);
        bundle.putInt("CERT_TYPE", i);
        resultReceiver.send(6, bundle);
    }

    public boolean a(String str, String str2, String str3, long j, com.heytap.accessory.session.c cVar) {
        return g.o().a(str, str2, str3, j, cVar);
    }

    public Bundle a(long j, String str, String str2, boolean z, List<String> list, List<?> list2, Object obj, long j2) {
        com.heytap.accessory.base.bean.b bVarE = e(j);
        if (bVarE != null && bVarE.A() != 2 && bVarE.A() != 1 && str2 != null && !str2.isEmpty()) {
            FrameworkServiceDescription frameworkServiceDescriptionI = i(str2);
            if (frameworkServiceDescriptionI == null) {
                this.k.a(10012);
                return a(this.k.b());
            }
            String strM = frameworkServiceDescriptionI.m();
            if (strM.isEmpty()) {
                this.k.a(10012);
                return a(this.k.b());
            }
            String str3 = r;
            com.heytap.accessory.base.logging.a.d(str3, "Local app responded to SC req (" + str + ", " + str2 + ")");
            if (z) {
                long jA = com.heytap.accessory.misc.utils.c.a(j, str, str2);
                g.j jVarF = f(jA);
                com.heytap.accessory.base.logging.a.a(str3, "shouldAccept, connectionId = " + jA);
                if (jVarF == null) {
                    com.heytap.accessory.base.logging.a.e(str3, "Received a response for a service connection request after time-out! Returning ...");
                    this.k.a(1286);
                    return a(this.k.b());
                }
                if (jVarF.i) {
                    this.k.a(10005);
                    com.heytap.accessory.base.logging.a.e(str3, "Connection Already Exists !! returning ..");
                    return a(this.k.b());
                }
                if (jVarF.n == j2) {
                    com.heytap.accessory.base.logging.a.a(str3, "serviceConnectionResponse transactionId equal");
                    jVarF.l = frameworkServiceDescriptionI.l();
                    jVarF.i = true;
                    frameworkServiceDescriptionI.o();
                    jVarF.c = frameworkServiceDescriptionI.f();
                    frameworkServiceDescriptionI.d();
                    jVarF.e = obj;
                    this.a.add(Long.valueOf(jA));
                    Iterator<String> it = list.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        jVarF.b.put(Long.valueOf(Long.parseLong(it.next())), list2.get(i));
                        i++;
                    }
                    if (!b(jA)) {
                        com.heytap.accessory.base.logging.a.e(r, "Connection no longer valid! Therefore, returning an empty string as connection id");
                        return a(this.k.b());
                    }
                    Map<Long, com.heytap.accessory.session.a> mapA = a(j, strM, Integer.parseInt(str), Integer.parseInt(str2), n(), 0);
                    if (mapA.isEmpty()) {
                        com.heytap.accessory.base.logging.a.e(r, "channelMap is empty!");
                        return a(this.k.b());
                    }
                    jVarF.d = mapA;
                    a(jVarF);
                    com.heytap.accessory.base.logging.a.d(r, "Updated connectionId:" + jA + " channel:" + com.heytap.accessory.session.a.a(mapA));
                    return a(String.valueOf(jA), mapA.keySet());
                }
                this.k.a(10006);
                com.heytap.accessory.base.logging.a.e(str3, "Connection has already timed out & new connection has arrived !! returning ..");
                return a(this.k.b());
            }
            this.k.a(10007);
            com.heytap.accessory.base.logging.a.e(str3, "I cannot accept this connection request. Better luck next time!");
            long jA2 = com.heytap.accessory.misc.utils.c.a(j, str, str2);
            g.j jVarF2 = f(jA2);
            if (jVarF2 == null) {
                com.heytap.accessory.base.logging.a.e(str3, "connection request has already timed out ignoring rejection");
            } else if (jVarF2.n == j2) {
                com.heytap.accessory.base.logging.a.a(str3, "Connection record found. Rejecting service connection");
            } else {
                com.heytap.accessory.base.logging.a.e(str3, "Connection record found. But transaction Id does not match. Ignoring this reject request");
                return a(this.k.b());
            }
            i(jA2);
            com.heytap.accessory.base.bean.b bVarE2 = e(j);
            a(j, strM, Integer.parseInt(str), Integer.parseInt(str2), (com.heytap.accessory.session.d) null, 1);
            if (bVarE2 != null && bVarE2.A() == 11 && bVarE2.r().equals(this.k.c())) {
                c(j);
            }
            return a(this.k.b());
        }
        com.heytap.accessory.base.logging.a.b(r, "Invalid parameters. in serviceConnectionResponse() ...");
        this.k.a(1281);
        return a(this.k.b());
    }

    public WriteStatus a(String str, long j, byte[] bArr, int i, int i2, int i3) {
        int iB;
        byte[] buffer;
        int offset;
        Buffer buffer2;
        int i4;
        Buffer bufferC;
        this.k.a(0);
        if (bArr == null) {
            com.heytap.accessory.base.logging.a.b(r, "Invalid data received! returning ...(data == null)");
            this.k.a(2817);
            return new WriteStatus(-1, i2);
        }
        if (bArr.length > 1 && i2 > 1 && bArr.length >= i + i2) {
            g.j jVarF = f(Long.parseLong(str));
            if (jVarF == null) {
                com.heytap.accessory.base.logging.a.b(r, "write failed..ConnectionRecord is null for connId:" + str + "! returning ...");
                return new WriteStatus(-1, i2);
            }
            if (jVarF.j && !com.heytap.accessory.base.a.a(3, jVarF.a, String.valueOf(jVarF.g), String.valueOf(jVarF.h))) {
                com.heytap.accessory.base.logging.a.b(r, "initiator,write failed..current accessory is dormant!");
                return new WriteStatus(-2, i2);
            }
            if (!jVarF.j && !com.heytap.accessory.base.a.a(3, jVarF.a, String.valueOf(jVarF.h), String.valueOf(jVarF.g))) {
                com.heytap.accessory.base.logging.a.b(r, "acceptor write failed..current accessory is dormant!");
                return new WriteStatus(-2, i2);
            }
            com.heytap.accessory.session.a aVarA = a(jVarF, j);
            if (aVarA == null) {
                com.heytap.accessory.base.logging.a.b(r, "write failed..Session is null! Returning ...");
                return new WriteStatus(-1, i2);
            }
            String str2 = r;
            com.heytap.accessory.base.logging.a.d(str2, "write(): [" + i + "," + i2 + "] " + bArr.length + " compressMode:" + i3 + " channelId:" + j);
            com.heytap.accessory.base.bean.b bVarE = e(jVarF.a);
            if (bVarE != null && bVarE.A() != 2 && bVarE.A() != 1) {
                if (!bVarE.L() || ((i3 != 1 && (i3 != 3 || i2 <= 512)) || (bufferC = c(bArr, (i4 = i + 1), i2 - 1)) == null)) {
                    iB = i2;
                } else {
                    SystemUtils.arraycopy(bufferC.getBuffer(), bufferC.getOffset(), bArr, i4, bufferC.getPayloadLength());
                    iB = bufferC.getPayloadLength() + 1;
                    bArr[i] = (byte) (bArr[i] | 16);
                    bufferC.recycle();
                }
                byte b2 = bArr[i];
                if ((b2 & 4) != 0) {
                    com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(jVarF.a);
                    if (bVarA != null && bVarA.E() != 0) {
                        if (bArr.length < iB + 8 + 2 + 24) {
                            Buffer bufferWrapPayload = BufferPool.wrapPayload(bArr, i, iB, 8, 26);
                            buffer = bufferWrapPayload.getBuffer();
                            offset = bufferWrapPayload.getOffset();
                            int payloadLength = bufferWrapPayload.getPayloadLength();
                            com.heytap.accessory.base.logging.a.e(str2, "write(" + this.k.d() + "): enlarged buffer [" + offset + "," + payloadLength + "] " + buffer.length);
                            buffer2 = bufferWrapPayload;
                            iB = payloadLength;
                        } else {
                            buffer2 = null;
                            buffer = bArr;
                            offset = i;
                        }
                        iB = b(jVarF, buffer, offset, iB);
                        if (iB <= 1) {
                            com.heytap.accessory.base.logging.a.b(str2, "Message Encryption failed!");
                            if (buffer2 != null) {
                                buffer2.recycle();
                            }
                            return new WriteStatus(-1, iB);
                        }
                        com.heytap.accessory.base.logging.a.d(str2, "write(): buffer encrypted[" + offset + "," + iB + "] " + buffer.length);
                    } else {
                        com.heytap.accessory.base.logging.a.b(str2, "Accessory not found OR is legacy! " + bVarA);
                        return new WriteStatus(-1, iB);
                    }
                } else {
                    bArr[i] = (byte) (b2 & (-5));
                    buffer = bArr;
                    offset = i;
                }
                this.k.a(0);
                return new WriteStatus(a(jVarF.a, aVarA, buffer, offset, iB), iB);
            }
            com.heytap.accessory.base.logging.a.b(str2, "Accessory not found" + bVarE);
            return new WriteStatus(-1, i2);
        }
        com.heytap.accessory.base.logging.a.b(r, "Invalid length received! (data = " + bArr.length + ", offset = " + i + "; length = " + i2 + ") returning ...");
        this.k.a(2817);
        return new WriteStatus(-1, i2);
    }

    public Buffer a(int i, byte[] bArr, int i2, int i3) {
        return com.heytap.accessory.misc.utils.a.a(i, bArr, i2, i3);
    }

    public com.heytap.accessory.session.a a(g.j jVar, long j) {
        return jVar.d.get(Long.valueOf(j));
    }

    public WriteStatus a(String str, long j, String str2, byte[] bArr, int i, int i2, boolean z) {
        int i3;
        boolean z2;
        String str3;
        com.heytap.accessory.message.a aVar;
        Buffer bufferC;
        if (bArr != null && str != null) {
            if (bArr.length > 7 && i2 > 0 && bArr.length >= i + i2) {
                if (!a(j, str2)) {
                    com.heytap.accessory.base.logging.a.b(r, "Canont send Message - invalid Peer Agent!");
                    return new WriteStatus(BaseMessage.ERROR_PEER_AGENT_INVALID, i2);
                }
                String str4 = r;
                com.heytap.accessory.base.logging.a.d(str4, "write(boolean) : [" + i + "," + i2 + "] " + bArr.length);
                com.heytap.accessory.base.bean.b bVarE = e(j);
                if (bVarE != null && bVarE.A() != 2 && bVarE.A() != 1) {
                    boolean zL = bVarE.L();
                    if (!zL || i2 <= 512 || (bufferC = c(bArr, i, i2)) == null) {
                        i3 = i2;
                        z2 = false;
                    } else {
                        SystemUtils.arraycopy(bufferC.getBuffer(), bufferC.getOffset(), bArr, i, bufferC.getPayloadLength());
                        int payloadLength = bufferC.getPayloadLength();
                        bufferC.recycle();
                        i3 = payloadLength;
                        z2 = true;
                    }
                    if (!z) {
                        str3 = str4;
                    } else {
                        if (bArr.length < i + i3 + 24) {
                            com.heytap.accessory.base.logging.a.b(str4, "Invalid length received!!! (data = " + bArr.length + ", offset = " + i + "; length = " + i3 + ") returning ...");
                            return new WriteStatus(BaseMessage.ERROR_TRANSACTION_FAILED, i3);
                        }
                        str3 = str4;
                        int iB = k.a((com.heytap.accessory.connectivity.core.interfaces.a) null).b(j, Long.parseLong(str), Long.parseLong(str2), bArr, i, i3);
                        if (iB <= 0) {
                            com.heytap.accessory.base.logging.a.b(str3, "Message Encryption failed! (" + iB + ") offset=" + i + "; length=" + i3);
                            return new WriteStatus(BaseMessage.ERROR_TRANSACTION_FAILED, i3);
                        }
                        i3 = iB;
                    }
                    com.heytap.accessory.base.logging.a.d(str3, "wrap message : 7" + i3 + "82 , " + bArr.length + " , " + zL);
                    if (bArr.length >= i3 + 7 + 8 + 2) {
                        aVar = com.heytap.accessory.message.a.a(3L, bArr, i, i3, 15, 2);
                    } else {
                        aVar = new com.heytap.accessory.message.a(3L);
                        aVar.a(j, 3L, bArr, i, i3);
                    }
                    if (z2) {
                        aVar.a(true);
                    }
                    aVar.b(str);
                    aVar.a(str2);
                    aVar.b(z);
                    aVar.h(0);
                    return new WriteStatus(com.heytap.accessory.msgexp.b.d().b(j, aVar), i3);
                }
                com.heytap.accessory.base.logging.a.b(str4, "Accessory not found" + bVarE);
                return new WriteStatus(BaseMessage.ERROR_TRANSACTION_FAILED, i2);
            }
            com.heytap.accessory.base.logging.a.b(r, "Invalid length received!! (data = " + bArr.length + ", offset = " + i + "; length = " + i2 + ") returning ...");
            return new WriteStatus(BaseMessage.ERROR_TRANSACTION_FAILED, i2);
        }
        com.heytap.accessory.base.logging.a.b(r, "Invalid data received! returning ...(data == null || srcAgentId == null)");
        return new WriteStatus(BaseMessage.ERROR_TRANSACTION_FAILED, i2);
    }

    public void a(long j, int i, int i2) {
        com.heytap.accessory.base.logging.a.d(r, "sendACK <" + i + ">  status : " + i2);
        com.heytap.accessory.message.a aVarC = com.heytap.accessory.message.a.c(j, 3L, 3);
        if (aVarC != null) {
            aVarC.h(1);
            aVarC.g(i2);
            aVarC.i(i);
            com.heytap.accessory.msgexp.b.d().b(j, aVarC);
        }
    }

    public final boolean a(long j, String str) {
        com.heytap.accessory.base.bean.b bVarA;
        if (str == null || (bVarA = AccessoryManager.h().a(j)) == null) {
            return false;
        }
        Iterator<FrameworkServiceDescription> it = bVarA.x().iterator();
        while (it.hasNext()) {
            if (it.next().a().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j, long j2) {
        g.o().c(j, j2);
    }

    public List<com.heytap.accessory.base.bean.b> a(int i, int i2) {
        if (i2 != 1 && i2 != 0) {
            return AccessoryManager.h().a(i);
        }
        return AccessoryManager.h().b(i);
    }

    public boolean a(final int i, final String str, final SdkWrapper.a aVar) {
        if (this.k.a(new Runnable() { // from class: com.oplus.aiunit.vision.c08
            @Override // java.lang.Runnable
            public final void run() {
                this.i.a(str, i, aVar);
            }
        }, 0L)) {
            return true;
        }
        com.heytap.accessory.base.logging.a.b(r, "failed to post CapabilityAnswer");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i, SdkWrapper.a aVar) {
        String str2 = r;
        com.heytap.accessory.base.logging.a.d(str2, "Send capa answer to app " + str);
        List<com.heytap.accessory.base.bean.b> listRemove = this.q.remove(str);
        if (listRemove == null) {
            com.heytap.accessory.base.logging.a.e(str2, "removeResult is empty. profileId: " + str + ", state:" + i + " map: " + this.q.keySet());
        } else {
            com.heytap.accessory.base.logging.a.d(str2, "CapexAccessory:" + listRemove + ", state:" + i);
        }
        aVar.a(i, listRemove);
    }

    public void a(long j, String str, int i) {
        g.j jVarF = f(Long.parseLong(str));
        com.heytap.accessory.base.bean.b bVarE = e(j);
        if (jVarF != null) {
            a(jVarF, i);
            if (bVarE != null && bVarE.A() == 11 && jVarF.l == 0) {
                c(j);
                return;
            }
            return;
        }
        if (bVarE != null && bVarE.A() == 11) {
            c(j);
            return;
        }
        com.heytap.accessory.base.logging.a.c(r, "onDisconnection recycleSessions for unexpected,connectionId:" + str);
        b(j, Long.parseLong(str));
        synchronized (this.b) {
            this.c.remove(Long.valueOf(Long.parseLong(str)));
        }
    }

    public void a(long j, String str, String str2, int i) {
        b(i);
        String str3 = r;
        com.heytap.accessory.base.logging.a.e(str3, "Service Connection negotiation FAILED with initiator ID: " + str + "; errorCode:" + i);
        long jA = com.heytap.accessory.misc.utils.c.a(j, str, str2);
        g.j jVarF = f(jA);
        if (jVarF == null) {
            com.heytap.accessory.base.logging.a.e(str3, "Service Connection Record not found!");
            return;
        }
        boolean z = false;
        if (i == 4613) {
            jVarF.k = -1;
        } else if (i == 4627 || i == 4644) {
            jVarF.k = -2;
        } else {
            z = true;
        }
        synchronized (s) {
            if (z) {
                if (jVarF.f != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FrameworkServiceConstants.EXTRA_CONSUMER_ID, str);
                    bundle.putInt(FrameworkServiceConstants.EXTRA_ERROR, this.k.b());
                    com.heytap.accessory.base.logging.a.b(str3, "[agent_connect]" + jVarF.m + "connect failed cause:" + this.k.b());
                    b(jVarF.f, 101, bundle);
                    jVarF.f = null;
                }
            }
        }
        com.heytap.accessory.base.bean.b bVarE = e(j);
        if (bVarE != null && bVarE.A() == 11 && jVarF.l == 0) {
            c(j);
        }
        if (z) {
            i(jA);
        } else {
            b(jVarF);
        }
    }

    public void a(String str) {
        com.heytap.accessory.base.logging.a.c(r, "Clean up fwk connection agentId:" + str + " " + this.k.c());
        FrameworkServiceDescription frameworkServiceDescriptionE = e(str);
        if (frameworkServiceDescriptionE != null) {
            for (Long l : this.a) {
                g.j jVarF = f(l.longValue());
                if (jVarF == null) {
                    com.heytap.accessory.base.logging.a.e(r, "Null connection record for connection: " + l);
                } else if (jVarF.j && String.valueOf(jVarF.g).equals(str) && !jVarF.i) {
                    synchronized (s) {
                        jVarF.f = null;
                    }
                }
            }
            String str2 = frameworkServiceDescriptionE.m() + "_" + frameworkServiceDescriptionE.o();
            this.h.remove(str2);
            g(str2);
        }
    }

    public void a(g.j jVar, int i) {
        int i2;
        boolean z;
        if (jVar == null) {
            com.heytap.accessory.base.logging.a.e(r, "Drop SC failed. conn is null.");
            return;
        }
        if (!k.a((com.heytap.accessory.connectivity.core.interfaces.a) null).a(jVar.a, jVar.h, jVar.g)) {
            com.heytap.accessory.base.logging.a.e(r, "remote-local removeAppCipher failed!");
        } else {
            com.heytap.accessory.base.logging.a.a(r, "remote-local removeAppCipher success!");
        }
        long jA = com.heytap.accessory.misc.utils.c.a(jVar.a, String.valueOf(jVar.g), String.valueOf(jVar.h));
        if (!b(jA)) {
            com.heytap.accessory.base.logging.a.e(r, "tearServiceConnection.. connection record not found for connection id : " + jA);
            return;
        }
        String str = r;
        com.heytap.accessory.base.logging.a.c(str, "Drop SC conn:" + jA);
        Map<Long, Object> map = jVar.b;
        if (map != null) {
            synchronized (map) {
                jVar.b.clear();
            }
        }
        b(jVar.a, jA);
        int i3 = jVar.k;
        if (i3 == -1) {
            this.k.a(5);
            i2 = 10005;
        } else if (i3 == -2) {
            this.k.a(10006);
            i2 = 10006;
        } else {
            this.k.a(3328);
            i2 = 10004;
        }
        synchronized (s) {
            if (jVar.f != null) {
                Bundle bundle = new Bundle();
                bundle.putInt(FrameworkServiceConstants.EXTRA_ERROR, i2);
                com.heytap.accessory.base.logging.a.b(str, this.k.b() + " # " + PlatformUtils.getsBuildVersion() + " # " + PlatformUtils.getsSapVersionName() + " # " + jVar.m);
                b(jVar.f, 101, bundle);
                jVar.f = null;
                z = true;
            } else {
                z = false;
            }
        }
        Bundle bundle2 = new Bundle();
        if (!z && jVar.e != null) {
            this.k.a(3328);
            if (i == 0) {
                bundle2.putInt(FrameworkServiceConstants.CONNECTION_ERROR_KEY, 300);
                b(jVar.e, 300, bundle2);
            } else if (i == 2 || i == 3) {
                bundle2.putInt(FrameworkServiceConstants.CONNECTION_ERROR_KEY, 203);
                b(jVar.e, 203, bundle2);
            } else if (i == 1) {
                bundle2.putInt(FrameworkServiceConstants.CONNECTION_ERROR_KEY, 204);
                com.heytap.accessory.base.logging.a.b(str, "CONNECTION_LOST_RETRANSMISSION_FAILED # " + PlatformUtils.getsBuildVersion() + " # " + PlatformUtils.getsSapVersionName() + " # " + jVar.m);
                b(jVar.e, 203, bundle2);
            }
        }
        synchronized (this.b) {
            this.c.remove(Long.valueOf(jA));
        }
        i(jA);
    }

    public int a(long j, int i, String str, com.heytap.accessory.session.d dVar, int i2, List<FrameworkServiceChannelDescription> list, long j2, int i3) {
        return g.o().a(j, str, i, i2, j2, list, dVar, 1, i3);
    }

    public final Map<Long, com.heytap.accessory.session.a> a(long j, String str, int i, int i2, com.heytap.accessory.session.d dVar, int i3) {
        return g.o().a(j, str, i, i2, dVar, i3, false);
    }

    public final boolean a(long j, String str, int i, int i2) {
        return g.o().a(j, str, i, i2);
    }

    public final void a(com.heytap.accessory.session.a aVar, g.j jVar, long j) {
        g.o().a(aVar, new c(jVar, j, aVar));
    }

    public final void a(g.j jVar) {
        this.k.a(0);
        synchronized (jVar.b) {
            Iterator<Map.Entry<Long, Object>> it = jVar.b.entrySet().iterator();
            while (it.hasNext()) {
                Long key = it.next().getKey();
                com.heytap.accessory.session.a aVar = jVar.d.get(key);
                if (aVar != null) {
                    com.heytap.accessory.base.logging.a.d(r, "Registering channel sess:" + aVar.a());
                }
                a(aVar, jVar, key.longValue());
            }
        }
    }

    public void a(com.heytap.accessory.base.bean.b bVar) {
        List<com.heytap.accessory.base.bean.b> list = this.p;
        if (list != null) {
            a(list, bVar.l());
        }
        Map<String, List<com.heytap.accessory.base.bean.b>> map = this.q;
        if (map != null && !map.isEmpty()) {
            synchronized (this.q) {
                Iterator<Map.Entry<String, List<com.heytap.accessory.base.bean.b>>> it = this.q.entrySet().iterator();
                while (it.hasNext()) {
                    a(it.next().getValue(), bVar.l());
                }
            }
            return;
        }
        com.heytap.accessory.base.logging.a.e(r, "mTargetAccessoriesMap is null or empty");
    }

    public int a(long j, com.heytap.accessory.session.a aVar, byte[] bArr, int i, int i2) {
        com.heytap.accessory.message.a aVar2;
        if (bArr.length >= i2 + 8 + 2) {
            aVar2 = com.heytap.accessory.message.a.a(aVar.a(), bArr, i, i2, 8, 2);
        } else {
            aVar2 = new com.heytap.accessory.message.a(aVar.a());
            aVar2.a(j, aVar.a(), bArr, i, i2);
        }
        return g.o().a(j, aVar, aVar2);
    }

    public int a(String str, long j, byte[] bArr, int i, int i2) {
        com.heytap.accessory.message.a aVar;
        String str2 = r;
        com.heytap.accessory.base.logging.a.d(str2, "requestMessageDispatch(): [" + i + "," + i2 + "] " + bArr.length);
        g.j jVarF = f(Long.parseLong(str));
        if (jVarF == null) {
            com.heytap.accessory.base.logging.a.b(str2, "write failed..ConnectionRecord is null for connId:" + str + "!! returning ...");
            return -1;
        }
        com.heytap.accessory.session.a aVar2 = jVarF.d.get(Long.valueOf(j));
        if (aVar2 == null) {
            com.heytap.accessory.base.logging.a.b(str2, "write failed..Session is null!! Returning ...");
            return -1;
        }
        if (bArr.length >= i2 + 8 + 2) {
            aVar = com.heytap.accessory.message.a.a(aVar2.a(), bArr, i, i2, 8, 2);
        } else {
            aVar = new com.heytap.accessory.message.a(aVar2.a());
            aVar.a(jVarF.a, aVar2.a(), bArr, i, i2);
        }
        return g.o().a(jVarF.a, aVar2, aVar);
    }

    public void a(String str, long j) {
        g.j jVarF = f(Long.parseLong(str));
        if (jVarF == null) {
            com.heytap.accessory.base.logging.a.b(r, "removeMessageCache failed..ConnectionRecord is null for connId:" + str + "!! returning ...");
            return;
        }
        com.heytap.accessory.session.a aVar = jVarF.d.get(Long.valueOf(j));
        if (aVar == null) {
            com.heytap.accessory.base.logging.a.b(r, "removeMessageCache failed..Session is null!! Returning ...");
            return;
        }
        com.heytap.accessory.base.logging.a.d(r, "removeMessageCache, connectionId: " + str + ", channelId:" + j + ", sessionId:" + aVar.a());
        g.o().b(jVarF.a, aVar);
    }

    public boolean a(ResultReceiver resultReceiver, int i) {
        if (this.g == null) {
            com.heytap.accessory.base.logging.a.d(r, "ResultReceiver for incremental capex update registered");
            this.g = resultReceiver;
        }
        this.k.b(i);
        com.heytap.accessory.base.logging.a.d(r, "init() Package: '" + this.k.c() + "' sdkVersionCode=" + this.k.d());
        return true;
    }

    public void a(DeathCallback deathCallback) {
        this.j = deathCallback;
    }

    public void a(IDeathCallback iDeathCallback) {
        this.n = iDeathCallback;
    }

    public final void a(Object obj, int i, Bundle bundle) {
        if (obj == null) {
            com.heytap.accessory.base.logging.a.e(r, "Channel Event callback is null!");
        } else {
            ((com.heytap.accessory.sdk.b.b) obj).a(i, bundle);
        }
    }

    public final Bundle a(boolean z, int i) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("status", z);
        bundle.putInt("errorcode", i);
        return bundle;
    }

    public final Bundle a(String str, Set<Long> set) {
        Bundle bundle = new Bundle();
        bundle.putString("connectionId", str);
        bundle.putInt("errorcode", 0);
        bundle.putLongArray("channelId", AFArraysUtils.toArray(set));
        return bundle;
    }

    public final Bundle a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("errorcode", i);
        return bundle;
    }

    public void a(long j, g.j jVar) {
        g.o().a(j, jVar);
        this.a.add(Long.valueOf(j));
    }

    public boolean a(Bundle bundle) {
        if (this.o != null) {
            try {
                String str = r;
                com.heytap.accessory.base.logging.a.c(str, "Sent sc indication via callback before:" + m());
                this.o.onServiceConnectionRequested(bundle);
                com.heytap.accessory.base.logging.a.c(str, "Sent sc indication via callback");
                return true;
            } catch (RemoteException e2) {
                com.heytap.accessory.base.logging.a.e(r, "notifyServiceConnectionIndication error," + e2);
            } catch (IllegalStateException unused) {
                com.heytap.accessory.base.logging.a.e(r, "[" + m() + "] - targetSdk 26 or above");
                return true;
            }
        }
        com.heytap.accessory.base.logging.a.a(r, "mScIndicationCallback is null, maybe agent is not started.");
        return false;
    }

    public void a(IServiceConnectionIndicationCallback iServiceConnectionIndicationCallback) {
        this.o = iServiceConnectionIndicationCallback;
    }

    public final int a(g.j jVar, byte[] bArr, int i, int i2) {
        FrameworkServiceDescription frameworkServiceDescriptionE;
        long j;
        int i3;
        if (jVar.j) {
            frameworkServiceDescriptionE = e(String.valueOf(jVar.g));
        } else {
            frameworkServiceDescriptionE = e(String.valueOf(jVar.h));
        }
        if (frameworkServiceDescriptionE == null) {
            com.heytap.accessory.base.logging.a.b(r, "Message Decryption failed.. service description is not found");
            return 1;
        }
        if (frameworkServiceDescriptionE.o() == 0) {
            boolean z = jVar.j;
            j = z ? jVar.g : jVar.h;
            i3 = z ? jVar.h : jVar.g;
        } else {
            boolean z2 = jVar.j;
            j = z2 ? jVar.h : jVar.g;
            i3 = z2 ? jVar.g : jVar.h;
        }
        long j2 = i3;
        long j3 = j;
        String str = r;
        com.heytap.accessory.base.logging.a.a(str, "isInitiator:" + jVar.j + ",role:" + frameworkServiceDescriptionE.o() + ",providerId:" + j3 + ",consumerId:" + j2);
        int iA = k.a((com.heytap.accessory.connectivity.core.interfaces.a) null).a(jVar.a, j3, j2, bArr, i + 1, i2 + (-1));
        if (iA > 0) {
            return iA + 1;
        }
        com.heytap.accessory.base.logging.a.b(str, "Message Decryption Failed! (" + iA + ") offset=" + i + "; length=" + i2);
        return 1;
    }

    public final boolean a(List<com.heytap.accessory.base.bean.b> list, long j) {
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size).l() == j) {
                    list.remove(size);
                    return true;
                }
            }
        }
        return false;
    }
}
