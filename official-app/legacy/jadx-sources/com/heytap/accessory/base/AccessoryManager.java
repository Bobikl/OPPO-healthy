package com.heytap.accessory.base;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcel;
import com.heytap.accessory.BaseMessage;
import com.heytap.accessory.Initializer;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.file.e;
import com.heytap.accessory.misc.constants.FrameworkServiceConstants;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.platform.services.FrameworkService;
import com.heytap.accessory.sdk.SdkWrapper;
import com.heytap.accessory.session.g;
import com.heytap.accessory.utils.BroadcastUtils;
import com.heytap.accessory.utils.HexUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class AccessoryManager {
    public static final int ACCESSORY_DISCONNECTED_NETWORK_FAILURE = 258;
    public static final int ACCESSORY_DISCONNECTED_NORMAL = 257;
    public static final int ACCESSORY_DISCONNECTED_PACKET_CORRUPTION = 256;
    public static final int ACCESSORY_EXPLICIT_DISCONNECT = 10;
    public static final String ACTION_ACCESSORY_ATTACHED = "android.accessory.device.action.ATTACHED";
    public static final String ACTION_ACCESSORY_ATTACHED_ADDRESS = "com.heytap.accessory.device.action.ACCESSORY_ATTACHED_ADDRESS";
    public static final String ACTION_ACCESSORY_ATTACHED_EVENT = "com.heytap.accessory.device.action.ACCESSORY_ATTACHED";
    public static final String ACTION_ACCESSORY_DETACHED = "android.accessory.device.action.DETACHED";
    public static final String ACTION_ACCESSORY_DETACHED_EVENT = "com.heytap.accessory.device.action.ACCESSORY_DETACHED";
    public static final String ACTION_ACCESSORY_SERVICE_CONNECTION_IND = "android.accessory.service.action.ACCESSORY_SERVICE_CONNECTION_IND";
    public static final String ACTION_ACCESSORY_STATUS_CHANGED = "com.heytap.accessory.action.ACCESSORY_STATUS_CHANGED";
    public static final String ACTION_SERVICE_CONNECTION_REQUESTED = "com.heytap.accessory.action.SERVICE_CONNECTION_REQUESTED";
    public static final String b = "AccessoryManager";
    public static AccessoryManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Map<Long, com.heytap.accessory.base.bean.b> f2415e;
    public static final Object a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f2414c = new HashSet();

    public class a implements c {
        public a() {
        }

        @Override // com.heytap.accessory.base.c
        public void a(com.heytap.accessory.base.bean.a aVar) {
            long jA = aVar.a();
            int iE = aVar.e();
            if (iE == 1) {
                com.heytap.accessory.base.logging.a.a(AccessoryManager.b, ">>> onAccessoryDisconnected (Error code : " + aVar.d() + ")");
                AccessoryManager.this.a(jA, aVar.d());
                return;
            }
            if (iE == 2) {
                com.heytap.accessory.base.logging.a.a(AccessoryManager.b, ">>> onAccessoryServiceRequestReceived");
                AccessoryManager.this.a(jA, aVar.g(), aVar.f(), aVar.h(), aVar.j(), aVar.i());
                return;
            }
            if (iE != 3) {
                if (iE != 5) {
                    com.heytap.accessory.base.logging.a.e(AccessoryManager.b, "Invalid event code! Ignoring ....");
                    return;
                }
                com.heytap.accessory.base.logging.a.a(AccessoryManager.b, ">>> onAccessoryStatusChanged");
                AccessoryManager.this.a(109, AccessoryManager.this.a(jA), 0);
                return;
            }
            com.heytap.accessory.base.logging.a.c(AccessoryManager.b + " - SLPTrack", ">>> onAccessoryDormant");
            com.heytap.accessory.base.bean.b bVarA = AccessoryManager.this.a(jA);
            if (bVarA == null || bVarA.A() != 10) {
                com.heytap.accessory.base.logging.a.e(AccessoryManager.b, "Closing down the connection as the accessory is not attached yet!");
                AccessoryManager.this.a(jA, aVar.d());
            }
        }
    }

    public AccessoryManager() {
        f2415e = new ConcurrentHashMap();
    }

    public static synchronized AccessoryManager h() {
        AccessoryManager accessoryManager;
        synchronized (AccessoryManager.class) {
            if (d == null) {
                d = new AccessoryManager();
            }
            accessoryManager = d;
        }
        return accessoryManager;
        return accessoryManager;
    }

    public synchronized long b(com.heytap.accessory.base.bean.b bVar, int i) {
        long j2;
        j2 = -1;
        try {
            if (bVar == null) {
                com.heytap.accessory.base.logging.a.e(b, "Cannot remove a null Accessory! returning ...");
            } else {
                String str = "com.heytap.accessory.device.action.ACCESSORY_DETACHED";
                if (bVar.A() != 10 && i != 10) {
                    str = "com.heytap.accessory.device.action.ACCESSORY_DISCONNECTED";
                }
                long jL = bVar.l();
                String str2 = b;
                com.heytap.accessory.base.logging.a.a(str2, "Remove acc:" + jL + " from FWK records. (errorCode:" + i + ")");
                com.heytap.accessory.base.bean.b bVarA = a(jL);
                if (bVarA == null) {
                    com.heytap.accessory.base.logging.a.e(str2, "Cannot remove Accessory! Not found in the map");
                } else {
                    if (bVarA.A() == 2) {
                        com.heytap.accessory.base.logging.a.e(str2, "Cleanup in progress");
                    } else {
                        bVarA.l(2);
                        b(bVar);
                        a(bVar.l(), i, str);
                        bVar.l(1);
                        bVar.b((byte) 0);
                    }
                    j2 = jL;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return j2;
    }

    public final void c(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.sdp.service.b.g().a(bVar);
        com.heytap.accessory.msgexp.b.d().a(bVar.l());
        if (bVar.o() == 1) {
            com.heytap.accessory.connectivity.negotiation.b.b().a(bVar);
        }
    }

    public c d() {
        return new a();
    }

    public final void e(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.sdp.service.b.g().b(bVar);
        com.heytap.accessory.msgexp.b.d().a(bVar, com.heytap.accessory.connectivity.core.b.d());
        if (bVar.o() == 1) {
            com.heytap.accessory.connectivity.negotiation.b.b().b(bVar);
        }
    }

    public final boolean f(com.heytap.accessory.base.bean.b bVar) {
        String strD = bVar.d();
        for (com.heytap.accessory.base.bean.b bVar2 : a(bVar.h())) {
            if (strD.equals(bVar2.d()) && 10 == bVar2.A() && bVar.F() == bVar2.F()) {
                return true;
            }
        }
        return false;
    }

    public Map<Long, g.j> g() {
        return g.o().n();
    }

    public void i(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.sdp.service.b.g().d(bVar, null);
    }

    public boolean d(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.msgexp.b.d().a(bVar.l());
        return g.o().c(bVar.l());
    }

    public boolean g(com.heytap.accessory.base.bean.b bVar) {
        return g.o().b(bVar);
    }

    public List<String> i() {
        return com.heytap.accessory.sdp.service.b.g().j();
    }

    public synchronized long a(com.heytap.accessory.base.bean.b bVar) {
        synchronized (this) {
            long j2 = -1;
            try {
                if (bVar == null) {
                    com.heytap.accessory.base.logging.a.b(b, "Invalid parameters! Returning ...");
                    return -1L;
                }
                if (f(bVar)) {
                    com.heytap.accessory.base.logging.a.c(b, "Accessory is already initialized. Returning ...");
                    return bVar.l();
                }
                com.heytap.accessory.base.bean.b bVarB = b(bVar.p(), bVar.h(), bVar.F());
                if (bVarB != null) {
                    com.heytap.accessory.base.logging.a.a(b, "Removing old accessory from Map");
                    h(bVarB);
                }
                if (!f2415e.containsKey(Long.valueOf(bVar.l()))) {
                    f2415e.put(Long.valueOf(bVar.l()), bVar);
                    com.heytap.accessory.base.logging.a.a(b, "AccessoryMap add(addAccessory):" + bVar);
                } else if (1 != bVar.A() && 2 != bVar.A()) {
                    com.heytap.accessory.base.logging.a.e(b, "Accessory already in the map, skip adding...");
                } else {
                    com.heytap.accessory.base.logging.a.e(b, "Accessory already in the map with state DISCONNECTED!");
                    j2 = 0;
                }
                com.heytap.accessory.connectivity.core.b.d().post(new Runnable() { // from class: com.oplus.aiunit.vision.bm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.b();
                    }
                });
                e(bVar);
                c cVarD = d();
                if (g(bVar)) {
                    a(bVar, cVarD);
                    return bVar.l();
                }
                c(bVar);
                String str = b;
                com.heytap.accessory.base.logging.a.a(str, "AccessoryMap remove:" + bVar.l());
                f2415e.remove(Long.valueOf(bVar.l()));
                a(bVar, "com.heytap.accessory.device.action.ACCESSORY_DETACHED", 0);
                com.heytap.accessory.base.logging.a.b(str, "Failed to connect to the accessory!");
                return j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String str) {
        boolean zRemove;
        Set<String> set = f2414c;
        synchronized (set) {
            zRemove = set.remove(str);
        }
        return zRemove;
    }

    public long e() {
        long jA;
        do {
            jA = ConnectConstant.a();
        } while (f2415e.get(Long.valueOf(jA)) != null);
        return jA;
    }

    public Map<Long, FrameworkConnection> f() {
        return FrameworkService.getClientMap();
    }

    public void h(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.base.logging.a.a(b, "removeAccessoryFromMap:" + bVar.l());
        f2415e.remove(Long.valueOf(bVar.l()));
    }

    public void c() {
        Set<String> set = f2414c;
        synchronized (set) {
            set.clear();
        }
    }

    public void c(long j2) {
        g.o().r(j2);
    }

    public void b() {
        boolean z;
        List<String> listI = i();
        Set<String> set = f2414c;
        synchronized (set) {
            for (String str : set) {
                Iterator<String> it = listI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().equalsIgnoreCase(str)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    com.heytap.accessory.base.logging.a.e(b, "Package \"" + str + "\" not registered!");
                    PlatformUtils.getContext().sendBroadcast(BroadcastUtils.getRegistrationIntent(str));
                }
            }
        }
    }

    public final void b(com.heytap.accessory.base.bean.b bVar) {
        synchronized (a) {
            if (b(bVar.l()) && bVar.A() != 1) {
                bVar.P();
                c(bVar.l());
                a(bVar, false, 2);
                d(bVar);
                e.b(bVar.l());
                com.heytap.accessory.stream.d.b(bVar.l());
            } else {
                com.heytap.accessory.base.logging.a.e(b, "Cleanup already done for accessory ID : " + bVar.l());
            }
        }
    }

    public void a(com.heytap.accessory.base.bean.b bVar, c cVar) {
        String str = b;
        com.heytap.accessory.base.logging.a.a(str, ">>> onAccessoryConnected");
        bVar.l(5);
        com.heytap.accessory.sdp.service.b.g().i();
        g.o().a(cVar);
        i(bVar);
        com.heytap.accessory.base.logging.a.a(str, "Initialized Accessory: " + bVar.l() + "; version=" + bVar.H());
    }

    public com.heytap.accessory.base.bean.b b(String str, int i, int i2) {
        for (com.heytap.accessory.base.bean.b bVar : f2415e.values()) {
            if (bVar.p() != null && bVar.p().equals(str) && bVar.h() == i && bVar.F() == i2) {
                return bVar;
            }
        }
        com.heytap.accessory.base.logging.a.c(b, "Accessory not found peerId:" + PlatformUtils.getAddrforLog(str) + " connectivity:" + i);
        return null;
    }

    public com.heytap.accessory.base.bean.b a(long j2) {
        return f2415e.get(Long.valueOf(j2));
    }

    public boolean b(String str) {
        boolean zContains;
        Set<String> set = f2414c;
        synchronized (set) {
            zContains = set.contains(str);
        }
        return zContains;
    }

    public com.heytap.accessory.base.bean.b a(String str, int i, int i2) {
        for (com.heytap.accessory.base.bean.b bVar : f2415e.values()) {
            if (bVar.d().equals(str) && bVar.h() == i && i2 == bVar.F()) {
                return bVar;
            }
        }
        com.heytap.accessory.base.logging.a.c(b, "Accessory not found address:" + PlatformUtils.getAddrforLog(str) + " connectivity:" + i + " uuid:" + i2);
        return null;
    }

    public List<com.heytap.accessory.base.bean.b> b(int i) {
        ArrayList<com.heytap.accessory.base.bean.b> arrayList = new ArrayList(f2415e.values());
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList();
        for (com.heytap.accessory.base.bean.b bVar : arrayList) {
            if ((bVar.h() & i) == bVar.h() && (bVar.A() == 10 || bVar.A() == 11)) {
                arrayList2.add(new com.heytap.accessory.base.bean.b(bVar));
            }
        }
        return arrayList2;
    }

    public List<com.heytap.accessory.base.bean.b> a(int i) {
        ArrayList<com.heytap.accessory.base.bean.b> arrayList = new ArrayList(f2415e.values());
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList();
        for (com.heytap.accessory.base.bean.b bVar : arrayList) {
            if ((bVar.h() & i) == bVar.h() && bVar.A() == 10) {
                arrayList2.add(new com.heytap.accessory.base.bean.b(bVar));
            }
        }
        return arrayList2;
    }

    public void a(String str) {
        Set<String> set = f2414c;
        synchronized (set) {
            set.add(str);
        }
    }

    public final boolean b(long j2) {
        return f2415e.containsKey(Long.valueOf(j2));
    }

    public void a(com.heytap.accessory.base.bean.b bVar, boolean z, int i) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(b, "Cannot proceed with cleaning up the service connections! Accessory object was found to be null");
            return;
        }
        Map<Long, FrameworkConnection> mapF = f();
        if (mapF != null && !mapF.isEmpty()) {
            ArrayList<FrameworkConnection> arrayList = new ArrayList(mapF.values());
            ArrayList<g.j> arrayList2 = new ArrayList(g().values());
            for (FrameworkConnection frameworkConnection : arrayList) {
                frameworkConnection.a(bVar);
                for (g.j jVar : arrayList2) {
                    long jA = com.heytap.accessory.misc.utils.c.a(jVar.a, String.valueOf(jVar.g), String.valueOf(jVar.h));
                    com.heytap.accessory.base.logging.a.a(b, "cleanUpServiceConnection: " + jA);
                    if (jVar.a == bVar.l() && ((!z || jVar.f2708l != 1) && frameworkConnection.b(jA))) {
                        frameworkConnection.a(jVar, i);
                    }
                    if (jVar.a == bVar.l()) {
                        g.o().q(jA);
                    }
                }
            }
            return;
        }
        com.heytap.accessory.base.logging.a.e(b, "Cannot proceed with cleaning up the service connections! No framework connections found");
    }

    public void a(long j2, int i, String str) {
        com.heytap.accessory.sdp.service.b.g().a(j2, i, str);
    }

    public void a(com.heytap.accessory.base.bean.b bVar, String str, int i) {
        int i2;
        int iA;
        Context context = PlatformUtils.getContext();
        Intent intent = new Intent(str, (Uri) null);
        if (Initializer.useOAFApp(context)) {
            intent.setPackage("com.heytap.accessory");
        } else {
            intent.setPackage(context.getPackageName());
        }
        bVar.a(false);
        com.heytap.accessory.base.bean.b bVar2 = new com.heytap.accessory.base.bean.b(bVar);
        String str2 = b;
        com.heytap.accessory.base.logging.a.a(str2, "publishAccessoryEvent privilege: " + bVar2.r() + ", action:" + str);
        if (!bVar2.r().isEmpty()) {
            List<String> listI = i();
            Map<String, List<String>> mapA = com.heytap.accessory.misc.utils.b.a(PlatformUtils.getContext()).a();
            for (String str3 : listI) {
                if (!str3.equalsIgnoreCase(bVar2.r()) && !mapA.containsKey(str3)) {
                    a(bVar2, str, str3);
                }
            }
            if (str.equals("com.heytap.accessory.device.action.ACCESSORY_ATTACHED")) {
                bVar.i("");
                bVar.l(10);
                return;
            }
            return;
        }
        if (!"com.heytap.accessory.device.action.ACCESSORY_DETACHED".equals(str) && !"com.heytap.accessory.device.action.ACCESSORY_DISCONNECTED".equals(str)) {
            if ("com.heytap.accessory.device.action.ACCESSORY_ATTACHED".equals(str)) {
                com.heytap.accessory.connectivity.core.b.e().l(bVar2);
                com.heytap.accessory.base.logging.a.a(str2, "attached event: start sync dormant.");
                com.heytap.accessory.connectivity.core.b.e().a(com.heytap.accessory.base.bean.c.a().b());
                com.heytap.accessory.connectivity.core.b.e().i(bVar2);
                if (i != -1) {
                    com.heytap.accessory.base.logging.a.c(str2, "Sending ATTACHED Broadcast. Accessory ID :" + bVar2);
                    intent.putExtra(FrameworkServiceConstants.EXTRA_ACCESSORY, com.heytap.accessory.sdk.a.a(bVar2));
                    intent.setAction(ACTION_ACCESSORY_ATTACHED);
                    a(context, intent);
                }
                a(114, bVar2, 0);
                byte bI = bVar2.i();
                if (bI == 8 || !com.heytap.accessory.sdk.accessorymanager.a.a(bVar2.h())) {
                    return;
                }
                int iA2 = com.heytap.accessory.sdk.accessorymanager.a.a(bI, bVar2.h()) + 1;
                com.heytap.accessory.base.logging.a.d(str2, "currentConnections++ : " + iA2 + " devCategory : " + ((int) bI) + " connectivity : " + bVar2.h());
                com.heytap.accessory.sdk.accessorymanager.a.a(bI, iA2, bVar2.h());
                return;
            }
            com.heytap.accessory.base.logging.a.e(str2, "publish unknown accessory event: " + str);
            return;
        }
        com.heytap.accessory.base.logging.a.c(str2, "Sending DETACHED Broadcast. Accessory ID: " + bVar2.l() + " (transport : " + bVar2.h() + ") action:" + str + " uuidType:" + bVar2.F());
        bVar2.c(new ArrayList());
        intent.putExtra(FrameworkServiceConstants.EXTRA_ACCESSORY, com.heytap.accessory.sdk.a.a(bVar2));
        if (2 == i) {
            intent.putExtra(FrameworkServiceConstants.EXTRA_DETACH_RECOVERY, i);
            i2 = 256;
        } else {
            i2 = 258;
            if (258 != i) {
                i2 = 257;
            }
        }
        if ("com.heytap.accessory.device.action.ACCESSORY_DISCONNECTED".equals(str)) {
            a(-1111, bVar2, i2);
        } else {
            a(115, bVar2, i2);
            byte bI2 = bVar2.i();
            if (bI2 != 8 && com.heytap.accessory.sdk.accessorymanager.a.a(bVar2.h()) && (iA = com.heytap.accessory.sdk.accessorymanager.a.a(bI2, bVar2.h())) > 0) {
                int i3 = iA - 1;
                com.heytap.accessory.base.logging.a.d(str2, "currentConnections-- : " + i3 + " devCategory : " + ((int) bI2) + " connectivity : " + bVar2.h());
                com.heytap.accessory.sdk.accessorymanager.a.a(bI2, i3, bVar2.h());
            }
        }
        com.heytap.accessory.connectivity.core.b.e().d(bVar2);
    }

    public final void a(Context context, Intent intent) {
        if (intent == null) {
            com.heytap.accessory.base.logging.a.b(b, "sendBroadcast, but intent is null", new Throwable("Intent cannot be null"));
            return;
        }
        com.heytap.accessory.base.logging.a.a(b, "sendBroadcast, action:" + intent.getAction() + "; extra = " + HexUtils.toString(intent.getExtras()));
        context.sendBroadcast(intent);
    }

    public void a(int i, com.heytap.accessory.base.bean.b bVar, int i2) {
        com.heytap.accessory.connectivity.core.util.a.a(bVar, i, i2);
    }

    public void a(com.heytap.accessory.base.bean.b bVar, String str, String str2) {
        Intent intent = new Intent(str, (Uri) null);
        if (str.equals("com.heytap.accessory.device.action.ACCESSORY_DETACHED")) {
            com.heytap.accessory.base.logging.a.a(b, "Channel has been locked. Accessory ID : " + bVar.l() + " Throwing detached to package [" + str2 + "] is now detached.");
            bVar.c(new ArrayList());
            intent.setPackage(str2);
            PlatformUtils.getContext().sendBroadcast(intent);
            return;
        }
        if (str.equals("com.heytap.accessory.device.action.ACCESSORY_ATTACHED")) {
            com.heytap.accessory.base.logging.a.a(b, "Channel has been activated/unlocked. Accessory ID: " + bVar.l() + "Throwing Attached to package [" + str2 + "] is now attached.");
            intent.setPackage(str2);
            PlatformUtils.getContext().sendBroadcast(intent);
        }
    }

    public final boolean a(String str, long j2, FrameworkServiceDescription frameworkServiceDescription, Intent intent) {
        Map<Long, FrameworkConnection> mapF = f();
        if (mapF != null && !mapF.isEmpty()) {
            Iterator<Map.Entry<Long, FrameworkConnection>> it = mapF.entrySet().iterator();
            while (it.hasNext()) {
                FrameworkConnection value = it.next().getValue();
                String str2 = b;
                com.heytap.accessory.base.logging.a.a(str2, "check packageName = " + str + "; client.package = " + value.m());
                if (value.m().equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("transactionId", j2);
                    bundle.putString("agentId", frameworkServiceDescription.a());
                    String strB = frameworkServiceDescription.b();
                    if (strB == null) {
                        com.heytap.accessory.base.logging.a.e(str2, "Implementation class not available");
                        return false;
                    }
                    bundle.putString("agentImplclass", strB);
                    PeerAgent peerAgent = (PeerAgent) intent.getParcelableExtra("peerAgent");
                    Parcel parcelObtain = Parcel.obtain();
                    peerAgent.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    bundle.putByteArray("peerAgent", parcelObtain.marshall());
                    parcelObtain.recycle();
                    if (!value.a(bundle)) {
                        com.heytap.accessory.base.logging.a.c(str2, "SC indication callback not registered");
                        break;
                    }
                    return true;
                }
            }
            return false;
        }
        com.heytap.accessory.base.logging.a.e(b, "No framework connections found");
        return false;
    }

    public void a(com.heytap.accessory.base.bean.b bVar, long j2, int i, int i2, FrameworkServiceDescription frameworkServiceDescription) {
        String strD = frameworkServiceDescription.d();
        Intent intentA = SdkWrapper.a(bVar, frameworkServiceDescription, i, j2);
        if (intentA == null) {
            com.heytap.accessory.base.logging.a.b(b, "Required service with Id : " + i + " not found in remote accessory : " + bVar.l());
            return;
        }
        intentA.putExtra("transactionId", j2);
        Context context = PlatformUtils.getContext();
        if (context == null) {
            com.heytap.accessory.base.logging.a.b(b, "Application context is null!!");
            return;
        }
        String str = b;
        com.heytap.accessory.base.logging.a.c(str, "sendBroadcast.. (" + i + ", " + i2 + ")");
        intentA.putExtra("agentImplclass", frameworkServiceDescription.b());
        boolean zA = a(strD, j2, frameworkServiceDescription, intentA);
        StringBuilder sb = new StringBuilder();
        sb.append("notifyCallback = ");
        sb.append(zA);
        com.heytap.accessory.base.logging.a.a(str, sb.toString());
        if (zA) {
            return;
        }
        com.heytap.accessory.base.logging.a.a(str, "sendBroadcast intent = " + intentA.toString());
        context.sendBroadcast(intentA);
    }

    public void a(String str, String str2) {
        Context context = PlatformUtils.getContext();
        if (context != null && str != null && str2 != null) {
            Intent intent = new Intent(BaseMessage.ACTION_ACCESSORY_MESSAGE_RECEIVED);
            intent.putExtra("agentImplclass", str2);
            intent.setFlags(32);
            intent.setPackage(str);
            context.sendBroadcast(intent);
            return;
        }
        com.heytap.accessory.base.logging.a.e(b, "Failed to unicast message to agent!");
    }

    public final void a(com.heytap.accessory.base.bean.b bVar, int i) {
        com.heytap.accessory.base.logging.a.a(b, "Accessory ID : " + bVar.l() + " is disconnected.");
        Message messageObtainMessage = com.heytap.accessory.connectivity.core.b.d().obtainMessage();
        messageObtainMessage.what = 106;
        messageObtainMessage.arg1 = i;
        messageObtainMessage.obj = bVar;
        com.heytap.accessory.connectivity.core.b.d().sendMessage(messageObtainMessage);
    }

    public void a(long j2, String str, int i, int i2) {
        g.o().a(j2, str, i, i2, (com.heytap.accessory.session.d) null, 1, false);
    }

    public final void a(long j2, int i) {
        com.heytap.accessory.base.bean.b bVar = f2415e.get(Long.valueOf(j2));
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(b, "Accessory id : " + j2 + " not found in the map! returning...");
            return;
        }
        a(bVar, i);
    }

    public void a(long j2, String str, int i, int i2, long j3, FrameworkServiceDescription frameworkServiceDescription) {
        com.heytap.accessory.base.bean.b bVar = f2415e.get(Long.valueOf(j2));
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.e(b, "Accessory id : " + j2 + " not present in the map. Cannot proceed with the service connection!");
            return;
        }
        if (!com.heytap.accessory.base.a.a(2, j2, String.valueOf(i2), String.valueOf(i))) {
            com.heytap.accessory.base.logging.a.e(b, "Rejecting the service request as accessory is dormant!");
            a(j2, str, i, i2);
        } else if (frameworkServiceDescription.d().length() != 0) {
            a(bVar, j3, i, i2, frameworkServiceDescription);
        } else {
            com.heytap.accessory.base.logging.a.e(b, "Rejecting the service request as I cannot not find a valid service component installed!");
            a(j2, str, i, i2);
        }
    }

    public void a(long j2, long j3, long j4) {
        Map<Long, com.heytap.accessory.session.a> map;
        g.j jVar = g().get(Long.valueOf(j2));
        if (jVar != null && (map = jVar.d) != null) {
            com.heytap.accessory.session.a aVar = map.get(Long.valueOf(j3));
            if (aVar == null) {
                com.heytap.accessory.base.logging.a.e(b, "setMaxWindowSize failed, session not found for channelId(" + j2 + ") channelId(" + j3 + ")");
                return;
            }
            com.heytap.accessory.transport.b bVarC = aVar.c();
            if (bVarC == null) {
                com.heytap.accessory.base.logging.a.e(b, "setMaxWindowSize failed, queue not found for channelId(" + j2 + ") channelId(" + j3 + ")");
                return;
            }
            bVarC.a(j4);
            return;
        }
        com.heytap.accessory.base.logging.a.e(b, "setMaxWindowSize failed, ConnectRecord or sessionMap is null for id(" + j2 + ")");
    }
}
