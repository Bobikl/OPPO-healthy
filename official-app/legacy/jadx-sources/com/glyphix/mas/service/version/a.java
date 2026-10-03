package com.glyphix.mas.service.version;

import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.util.Pair;
import com.glyphix.mas.g;
import com.glyphix.mas.h;
import com.glyphix.mas.i;
import com.heytap.log.consts.LogSenderConst;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes13.dex */
public class a extends com.glyphix.mas.e.b implements InterConnectManager {
    private final Map<String, Pair<h, IBinder.DeathRecipient>> A = new ConcurrentHashMap();
    private Map<String, Pair<g, IBinder.DeathRecipient>> B = new ConcurrentHashMap();
    private Pair<h, IBinder.DeathRecipient> C = null;
    public com.glyphix.mas.b z;

    /* JADX INFO: renamed from: com.glyphix.mas.service.version.a$a, reason: collision with other inner class name */
    public class BinderC0221a extends h.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f2337j;

        public BinderC0221a(String str) {
            this.f2337j = str;
        }

        @Override // com.glyphix.mas.h
        public void c(String str) {
            h hVar = (h) ((Pair) a.this.A.get(this.f2337j)).first;
            if (hVar == null) {
                return;
            }
            try {
                hVar.c(new JSONTokener(str).nextValue().toString());
            } catch (RemoteException | JSONException e2) {
                e2.printStackTrace();
                com.glyphix.mas.utils.b.c().b(e2.toString());
            }
        }
    }

    public class b extends com.glyphix.mas.c.b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ i f2338n;
        final /* synthetic */ String o;

        /* JADX INFO: renamed from: com.glyphix.mas.service.version.a$b$a, reason: collision with other inner class name */
        public class BinderC0222a extends com.glyphix.mas.c.b {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ i f2339n;

            public BinderC0222a(i iVar) {
                this.f2339n = iVar;
            }

            @Override // com.glyphix.mas.c
            public int a(String str) {
                this.f2339n.a(str);
                return 0;
            }

            @Override // com.glyphix.mas.c
            public int b(String str) {
                this.f2339n.b(str);
                return 0;
            }

            @Override // com.glyphix.mas.c
            public int d(String str) {
                return 0;
            }

            @Override // com.glyphix.mas.c
            public int retry() {
                return 0;
            }

            @Override // com.glyphix.mas.c
            public int timeout() {
                return 3000;
            }
        }

        public b(i iVar, String str) {
            this.f2338n = iVar;
            this.o = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, i iVar, com.glyphix.mas.b bVar) {
            bVar.b(str, new BinderC0222a(iVar));
        }

        @Override // com.glyphix.mas.c
        public int d(String str) {
            this.f2338n.d(str);
            return 0;
        }

        @Override // com.glyphix.mas.c
        public int retry() {
            return 0;
        }

        @Override // com.glyphix.mas.c
        public int timeout() {
            return 3000;
        }

        @Override // com.glyphix.mas.c
        public int a(String str) {
            a aVar = a.this;
            final i iVar = this.f2338n;
            final String str2 = this.o;
            aVar.execMasFeature(iVar, new MasFeatureExecutor() { // from class: com.glyphix.mas.service.version.c
                @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                public final void exec(com.glyphix.mas.b bVar) {
                    this.a.a(str2, iVar, bVar);
                }
            });
            return 0;
        }

        @Override // com.glyphix.mas.c
        public int b(String str) {
            this.f2338n.b(str);
            return 0;
        }
    }

    public class c extends h.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ h f2340j;

        public c(h hVar) {
            this.f2340j = hVar;
        }

        @Override // com.glyphix.mas.h
        public void c(String str) {
            try {
                this.f2340j.c(str);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    public a(com.glyphix.mas.b bVar) {
        this.z = null;
        this.z = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.C = null;
        execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.z8m
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                bVar.f("gx_rpc_log");
            }
        });
    }

    @Override // com.glyphix.mas.service.version.InterConnectManager
    public com.glyphix.mas.b getGlyphixMasExecutor() {
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.glyphix.mas.f fVar) {
        com.glyphix.mas.utils.b.c().c("device link resolver destroy, remove listener");
        InterConnectManager.linkStatusResolverArrayList.remove(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.glyphix.mas.utils.d dVar = com.glyphix.mas.utils.d.ClientClose;
            jSONObject.put("code", dVar.b());
            jSONObject.put("data", dVar.c());
            a(str, com.glyphix.mas.utils.e.OnClose, jSONObject, new InterConnectManager.a(null));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(final String str) {
        this.A.remove(str);
        execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.w8m
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                bVar.f(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.glyphix.mas.utils.d dVar = com.glyphix.mas.utils.d.ClientClose;
            jSONObject.put("code", dVar.b());
            jSONObject.put("data", dVar.c());
            a(str, com.glyphix.mas.utils.e.OnClose, jSONObject, new InterConnectManager.a(null));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.glyphix.mas.e
    public void a(final String str, final String str2, final i iVar) {
        execMasFeature(iVar, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.a9m
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                com.glyphix.mas.service.version.a.a(str, str2, iVar, bVar);
            }
        });
    }

    @Override // com.glyphix.mas.e
    public int b() {
        return com.glyphix.mas.a.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final String str, final String str2) {
        this.B.remove(str);
        execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.k8m
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                com.glyphix.mas.service.version.a.a(str, bVar);
            }
        });
        InterConnectManager.wearEngineConnectionChangeDebounce.a(new Runnable() { // from class: com.oplus.aiunit.vision.v8m
            @Override // java.lang.Runnable
            public final void run() {
                this.i.h(str2);
            }
        });
    }

    @Override // com.glyphix.mas.e
    public boolean a() {
        com.glyphix.mas.b bVar = this.z;
        if (bVar == null) {
            return false;
        }
        try {
            return bVar.a();
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // com.glyphix.mas.e
    public void b(String str, final i iVar) {
        com.glyphix.mas.utils.b.c().c(str, "get device info");
        execMasFeature(iVar, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.x8m
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                com.glyphix.mas.service.version.a.a(iVar, bVar);
            }
        });
    }

    @Override // com.glyphix.mas.e
    public void d(String str, final String str2, final i iVar) {
        com.glyphix.mas.utils.b.c().c(str, "launch app", str2);
        execMasFeature(iVar, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.y8m
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                com.glyphix.mas.service.version.a.b(str2, iVar, bVar);
            }
        });
    }

    @Override // com.glyphix.mas.e
    public void e(String str) {
        Map<String, Pair<com.glyphix.mas.f, IBinder.DeathRecipient>> map = InterConnectManager.linkStatusResolverArrayList;
        synchronized (map) {
            Pair<com.glyphix.mas.f, IBinder.DeathRecipient> pair = map.get(str);
            if (pair != null) {
                pair.first.asBinder().unlinkToDeath(pair.second, 0);
            }
            map.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str, com.glyphix.mas.b bVar) {
        bVar.a(str, new BinderC0221a(str));
    }

    @Override // com.glyphix.mas.e
    public void a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2, i iVar) {
        try {
            InterConnectManager.a aVar = new InterConnectManager.a(iVar, new InterConnectManager.c() { // from class: com.oplus.aiunit.vision.m8m
                @Override // com.glyphix.mas.service.version.InterConnectManager.c
                public final void a() {
                    com.glyphix.mas.service.version.a.h();
                }
            });
            com.glyphix.mas.b bVar = this.z;
            if (bVar != null) {
                aVar.i(bVar.a(parcelFileDescriptor, "", str2, str, new b(iVar, str2)));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1000);
                jSONObject.put("msg", "no device connect");
                iVar.b(jSONObject.toString());
            } catch (RemoteException | JSONException e2) {
                e2.printStackTrace();
            }
        } catch (RemoteException e3) {
            e3.printStackTrace();
            try {
                iVar.b("wear engine push file failed," + e3.toString());
            } catch (RemoteException e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // com.glyphix.mas.e
    public void b(String str, final String str2, final i iVar) {
        com.glyphix.mas.utils.b.c().c(str, "check wear app is install", str2);
        execMasFeature(iVar, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.d9m
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                com.glyphix.mas.service.version.a.a(str2, iVar, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2, i iVar, com.glyphix.mas.b bVar) {
        bVar.a(str, str2, "interconnect_common", new InterConnectManager.a(iVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(String str, i iVar, com.glyphix.mas.b bVar) {
        bVar.c(str, new InterConnectManager.a(iVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(i iVar, com.glyphix.mas.b bVar) {
        bVar.a(new InterConnectManager.a(iVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, i iVar, com.glyphix.mas.b bVar) {
        bVar.a(str, new InterConnectManager.a(iVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, com.glyphix.mas.b bVar) {
        bVar.f(InterConnectManager.WearEngineAuthPrefix + str);
    }

    @Override // com.glyphix.mas.e
    public void b(String str, String str2, h hVar) {
        a(str2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, com.glyphix.mas.b bVar) {
        bVar.a("gx_rpc_log", new c(hVar));
    }

    @Override // com.glyphix.mas.e
    public void b(String str, final String str2) {
        Pair<h, IBinder.DeathRecipient> pair = this.C;
        if (pair != null) {
            pair.first.asBinder().unlinkToDeath(this.C.second, 0);
            this.C = null;
        }
        if (this.B.containsKey(str)) {
            Pair<g, IBinder.DeathRecipient> pair2 = this.B.get(str);
            pair2.first.asBinder().unlinkToDeath(pair2.second, 0);
            this.B.remove(str);
            InterConnectManager.wearEngineBinderList.remove(str + str2);
            com.glyphix.mas.utils.b.c().c("wear engine client", str, "disconnect");
            cleanResolver();
            InterConnectManager.wearEngineConnectionChangeDebounce.a(new Runnable() { // from class: com.oplus.aiunit.vision.l8m
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.j(str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFileType", true);
            jSONObject.put("fileUri", str);
            jSONObject.put(LogSenderConst.FILENAME, str2);
            a(str3, com.glyphix.mas.utils.e.OnMessage, jSONObject, new InterConnectManager.a(null));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, JSONObject jSONObject, InterConnectManager.a aVar, com.glyphix.mas.b bVar) {
        bVar.b(str, jSONObject.toString(), InterConnectManager.DeviceWearEngineMsgTopic, aVar);
    }

    @Override // com.glyphix.mas.e
    public void a(String str, final com.glyphix.mas.f fVar) {
        Pair<com.glyphix.mas.f, IBinder.DeathRecipient> pairRemove;
        Map<String, Pair<com.glyphix.mas.f, IBinder.DeathRecipient>> map = InterConnectManager.linkStatusResolverArrayList;
        synchronized (map) {
            try {
                if (map.containsKey(str) && (pairRemove = map.remove(str)) != null) {
                    pairRemove.first.asBinder().unlinkToDeath(pairRemove.second, 0);
                }
                IBinder iBinderAsBinder = fVar.asBinder();
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.u8m
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        com.glyphix.mas.service.version.a.c(fVar);
                    }
                };
                iBinderAsBinder.linkToDeath(deathRecipient, 0);
                map.put(str, new Pair<>(fVar, deathRecipient));
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.glyphix.mas.e
    public void a(final String str, final String str2, g gVar) {
        try {
            a(str2, com.glyphix.mas.utils.e.OnReadyOpen, new JSONObject(), new InterConnectManager.a(null));
            if (this.B.containsKey(str)) {
                b(str, str2);
                this.B.remove(str);
            } else {
                IBinder iBinderAsBinder = gVar.asBinder();
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.q8m
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.a.c(str, str2);
                    }
                };
                iBinderAsBinder.linkToDeath(deathRecipient, 0);
                this.B.put(str, new Pair<>(gVar, deathRecipient));
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.glyphix.mas.e
    public void a(final h hVar) {
        try {
            if (this.C == null) {
                IBinder iBinderAsBinder = hVar.asBinder();
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.b9m
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.a.i();
                    }
                };
                iBinderAsBinder.linkToDeath(deathRecipient, 0);
                this.C = new Pair<>(hVar, deathRecipient);
            }
            execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.c9m
                @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                public final void exec(com.glyphix.mas.b bVar) {
                    this.a.a(hVar, bVar);
                }
            });
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.glyphix.mas.e
    public void a(ParcelFileDescriptor parcelFileDescriptor, final String str, final String str2, final String str3, i iVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.glyphix.mas.utils.d dVar = com.glyphix.mas.utils.d.AuthFailed;
            jSONObject.put("code", dVar.b());
            jSONObject.put("msg", dVar.c());
            InterConnectManager.a aVar = new InterConnectManager.a(iVar, new InterConnectManager.c() { // from class: com.oplus.aiunit.vision.s8m
                @Override // com.glyphix.mas.service.version.InterConnectManager.c
                public final void a() {
                    this.a.a(str2, str, str3);
                }
            });
            com.glyphix.mas.b bVar = this.z;
            if (bVar != null) {
                aVar.i(bVar.a(parcelFileDescriptor, str, str2, str3, aVar));
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1000);
                jSONObject2.put("msg", "no device connect");
                iVar.b(jSONObject2.toString());
            } catch (RemoteException | JSONException e2) {
                e2.printStackTrace();
            }
        } catch (RemoteException | JSONException e3) {
            e3.printStackTrace();
            try {
                iVar.b("wear engine push file failed," + e3.toString());
            } catch (RemoteException e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // com.glyphix.mas.e
    public void a(String str, String str2, String str3, i iVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.glyphix.mas.utils.d dVar = com.glyphix.mas.utils.d.AuthFailed;
            jSONObject.put("code", dVar.b());
            jSONObject.put("msg", dVar.c());
            if (deviceSupportInterconnect()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("isFileType", false);
                jSONObject2.put("data", str3);
                com.glyphix.mas.utils.b.c().c(str, "send message to", str2);
                a(str2, com.glyphix.mas.utils.e.OnMessage, jSONObject2, new InterConnectManager.a(iVar));
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            com.glyphix.mas.utils.d dVar2 = com.glyphix.mas.utils.d.DeviceNoSupport;
            jSONObject3.put("code", dVar2.b());
            jSONObject3.put("msg", dVar2.c());
            iVar.b(jSONObject3.toString());
        } catch (RemoteException | JSONException e2) {
            e2.printStackTrace();
        }
    }

    private void a(final String str, com.glyphix.mas.utils.e eVar, JSONObject jSONObject, final InterConnectManager.a aVar) {
        try {
            if (eVar == com.glyphix.mas.utils.e.OnClose || eVar == com.glyphix.mas.utils.e.OnOpen) {
                if (!checkNeedSyncStatus(str, System.identityHashCode(this) + "_", eVar)) {
                    return;
                }
            }
            final JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event", eVar.ordinal());
            jSONObject2.put("data", jSONObject);
            execMasFeature(aVar.f2336n, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.r8m
                @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                public final void exec(com.glyphix.mas.b bVar) {
                    com.glyphix.mas.service.version.a.a(str, jSONObject2, aVar, bVar);
                }
            });
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.glyphix.mas.e
    public void a(String str, String str2, h hVar) {
        Log.e(InterConnectManager.TAG, "subscribeAuthMessage: " + str + " " + str2);
        a(str2, hVar);
    }

    private void a(final String str, h hVar) {
        if (hVar == null) {
            com.glyphix.mas.utils.b.c().e("subscribe message resolver is null");
            return;
        }
        try {
            if (this.A.containsKey(str)) {
                Pair<h, IBinder.DeathRecipient> pairRemove = this.A.remove(str);
                pairRemove.first.asBinder().unlinkToDeath(pairRemove.second, 0);
                execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.n8m
                    @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                    public final void exec(com.glyphix.mas.b bVar) {
                        bVar.f(str);
                    }
                });
            }
            IBinder iBinderAsBinder = hVar.asBinder();
            IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.o8m
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    this.a.i(str);
                }
            };
            iBinderAsBinder.linkToDeath(deathRecipient, 0);
            this.A.put(str, new Pair<>(hVar, deathRecipient));
            execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.p8m
                @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                public final void exec(com.glyphix.mas.b bVar) {
                    this.a.c(str, bVar);
                }
            });
        } catch (RemoteException e2) {
            e2.printStackTrace();
            com.glyphix.mas.utils.b.c().b(str, "subscribe message error", e2.toString());
        }
    }

    @Override // com.glyphix.mas.e
    public void a(String str, final String str2) {
        com.glyphix.mas.utils.b.c().c(str, "unsubscribe message", str2);
        if (this.A.containsKey(str2)) {
            Pair<h, IBinder.DeathRecipient> pairRemove = this.A.remove(str2);
            pairRemove.first.asBinder().unlinkToDeath(pairRemove.second, 0);
            execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.t8m
                @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                public final void exec(com.glyphix.mas.b bVar) {
                    bVar.f(str2);
                }
            });
        }
    }
}
