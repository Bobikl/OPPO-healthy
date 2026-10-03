package com.glyphix.mas.service.version;

import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import androidx.core.util.Pair;
import com.glyphix.mas.g;
import com.glyphix.mas.h;
import com.glyphix.mas.i;
import com.heytap.log.consts.LogSenderConst;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes13.dex */
public class b extends com.glyphix.mas.d.b implements InterConnectManager {
    private String A;
    private String B;
    private String C;
    private MasFeatureMan D;
    com.glyphix.mas.f E = new a();
    private final Map<String, Pair<h, IBinder.DeathRecipient>> F = new ConcurrentHashMap();
    private boolean G = false;
    private Pair<g, IBinder.DeathRecipient> H = null;
    private Pair<h, IBinder.DeathRecipient> I = null;

    public class a extends com.glyphix.mas.f.b {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(com.glyphix.mas.b bVar) {
            for (Map.Entry<String, Pair<String, IBinder>> entry : InterConnectManager.wearEngineBinderList.entrySet()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event", com.glyphix.mas.utils.e.OnReadyOpen.ordinal());
                    jSONObject.put("data", new JSONObject());
                    bVar.b(entry.getValue().first, jSONObject.toString(), InterConnectManager.DeviceWearEngineMsgTopic, new InterConnectManager.a(null));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // com.glyphix.mas.f
        public void a(final boolean z) {
            InterConnectManager.deviceLinkStatusChangeDebounce.a(new Runnable() { // from class: com.glyphix.mas.service.version.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.b(z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(boolean z) {
            Map<String, Pair<com.glyphix.mas.f, IBinder.DeathRecipient>> map = InterConnectManager.linkStatusResolverArrayList;
            synchronized (map) {
                Iterator<Map.Entry<String, Pair<com.glyphix.mas.f, IBinder.DeathRecipient>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().getValue().first.a(z);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            if (z) {
                synchronized (InterConnectManager.wearEngineBinderList) {
                    b.this.execMasFeature(null, new MasFeatureExecutor() { // from class: com.glyphix.mas.service.version.e
                        @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                        public final void exec(com.glyphix.mas.b bVar) {
                            b.a.b(bVar);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.glyphix.mas.service.version.b$b, reason: collision with other inner class name */
    public class BinderC0223b extends h.b {
        public BinderC0223b() {
        }

        @Override // com.glyphix.mas.h
        public void c(String str) {
            try {
                if (new JSONObject(str).getString("fingerprint").equals(b.this.C)) {
                    b.this.G = true;
                    b.this.a(com.glyphix.mas.utils.e.OnOpen, new JSONObject(), new InterConnectManager.a(null));
                } else {
                    JSONObject jSONObject = new JSONObject();
                    com.glyphix.mas.utils.d dVar = com.glyphix.mas.utils.d.AuthFailed;
                    jSONObject.put("code", dVar.b());
                    jSONObject.put("data", dVar.c());
                    b.this.a(com.glyphix.mas.utils.e.OnError, jSONObject, new InterConnectManager.a(null));
                    b.this.G = false;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public class c extends h.b {
        public c() {
        }

        @Override // com.glyphix.mas.h
        public void c(String str) {
            h hVar = (h) ((Pair) b.this.F.get(b.this.A)).first;
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

    public class d extends com.glyphix.mas.c.b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ i f2344n;
        final /* synthetic */ String o;

        public class a extends com.glyphix.mas.c.b {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ i f2345n;

            public a(i iVar) {
                this.f2345n = iVar;
            }

            @Override // com.glyphix.mas.c
            public int a(String str) {
                this.f2345n.a(str);
                return 0;
            }

            @Override // com.glyphix.mas.c
            public int b(String str) {
                this.f2345n.b(str);
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

        public d(i iVar, String str) {
            this.f2344n = iVar;
            this.o = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, i iVar, com.glyphix.mas.b bVar) {
            bVar.b(str, new a(iVar));
        }

        @Override // com.glyphix.mas.c
        public int d(String str) {
            this.f2344n.d(str);
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
            b bVar = b.this;
            final i iVar = this.f2344n;
            final String str2 = this.o;
            bVar.execMasFeature(iVar, new MasFeatureExecutor() { // from class: com.glyphix.mas.service.version.f
                @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                public final void exec(com.glyphix.mas.b bVar2) {
                    this.a.a(str2, iVar, bVar2);
                }
            });
            return 0;
        }

        @Override // com.glyphix.mas.c
        public int b(String str) {
            this.f2344n.b(str);
            return 0;
        }
    }

    public class e extends h.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ h f2346j;

        public e(h hVar) {
            this.f2346j = hVar;
        }

        @Override // com.glyphix.mas.h
        public void c(String str) {
            try {
                this.f2346j.c(str);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    public b(String str, String str2, String str3, MasFeatureMan masFeatureMan) {
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.D = masFeatureMan;
        if (str == null || str2 == null) {
            return;
        }
        Map<String, Pair<String, IBinder>> map = InterConnectManager.wearEngineBinderList;
        if (map.containsKey(str.concat(str2))) {
            map.remove(str.concat(str2));
        }
        map.put(str.concat(str2), new Pair<>(str2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(com.glyphix.mas.b bVar) {
        bVar.f(InterConnectManager.MobileWearEnginePrefix + this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(com.glyphix.mas.b bVar) {
        bVar.a(InterConnectManager.MobileWearEnginePrefix + this.A, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(com.glyphix.mas.b bVar) {
        bVar.a(InterConnectManager.WearEngineAuthPrefix + this.A, new BinderC0223b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        try {
            JSONObject jSONObject = new JSONObject();
            com.glyphix.mas.utils.d dVar = com.glyphix.mas.utils.d.ClientClose;
            jSONObject.put("code", dVar.b());
            jSONObject.put("data", dVar.c());
            a(com.glyphix.mas.utils.e.OnClose, jSONObject, new InterConnectManager.a(null));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.H = null;
        execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.qfm
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                this.a.b(bVar);
            }
        });
        InterConnectManager.wearEngineConnectionChangeDebounce.a(new Runnable() { // from class: com.oplus.aiunit.vision.rfm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.F.remove(this.A);
        execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.sfm
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                this.a.d(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.I = null;
        execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.pfm
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                bVar.f("gx_rpc_log");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        try {
            JSONObject jSONObject = new JSONObject();
            com.glyphix.mas.utils.d dVar = com.glyphix.mas.utils.d.ClientClose;
            jSONObject.put("code", dVar.b());
            jSONObject.put("data", dVar.c());
            a(com.glyphix.mas.utils.e.OnClose, jSONObject, new InterConnectManager.a(null));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private void n() {
        execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.kfm
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                this.a.g(bVar);
            }
        });
    }

    @Override // com.glyphix.mas.d
    public int b() {
        return com.glyphix.mas.a.f;
    }

    @Override // com.glyphix.mas.service.version.InterConnectManager
    public com.glyphix.mas.b getGlyphixMasExecutor() {
        return this.D.getFeature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(com.glyphix.mas.b bVar) {
        bVar.f(InterConnectManager.MobileWearEnginePrefix + this.A);
    }

    @Override // com.glyphix.mas.d
    public void c(final String str, final i iVar) {
        com.glyphix.mas.utils.b.c().c(this.A, "check wear app is install", str);
        execMasFeature(iVar, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.wfm
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                com.glyphix.mas.service.version.b.a(str, iVar, bVar);
            }
        });
    }

    @Override // com.glyphix.mas.d
    public void d() {
        Map<String, Pair<com.glyphix.mas.f, IBinder.DeathRecipient>> map = InterConnectManager.linkStatusResolverArrayList;
        synchronized (map) {
            Pair<com.glyphix.mas.f, IBinder.DeathRecipient> pair = map.get(this.A);
            if (pair != null) {
                pair.first.asBinder().unlinkToDeath(pair.second, 0);
            }
            map.remove(this.A);
        }
    }

    @Override // com.glyphix.mas.d
    public void e() {
        if (this.F.containsKey(this.A)) {
            Pair<h, IBinder.DeathRecipient> pairRemove = this.F.remove(this.A);
            pairRemove.first.asBinder().unlinkToDeath(pairRemove.second, 0);
            execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.jfm
                @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                public final void exec(com.glyphix.mas.b bVar) {
                    this.a.h(bVar);
                }
            });
        }
    }

    @Override // com.glyphix.mas.d
    public void g() {
        Pair<h, IBinder.DeathRecipient> pair = this.I;
        if (pair != null) {
            pair.first.asBinder().unlinkToDeath(this.I.second, 0);
            this.I = null;
        }
        Pair<g, IBinder.DeathRecipient> pair2 = this.H;
        if (pair2 != null) {
            pair2.first.asBinder().unlinkToDeath(this.H.second, 0);
            this.H = null;
            InterConnectManager.wearEngineBinderList.remove(this.A + this.B);
            com.glyphix.mas.utils.b.c().c("wear engine client", this.A, "disconnect");
            cleanResolver();
            InterConnectManager.wearEngineConnectionChangeDebounce.a(new Runnable() { // from class: com.oplus.aiunit.vision.ffm
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.m();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(String str, i iVar, com.glyphix.mas.b bVar) {
        bVar.c(str, new InterConnectManager.a(iVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.glyphix.mas.f fVar) {
        com.glyphix.mas.utils.b.c().c("device link resolver destroy, remove listener");
        InterConnectManager.linkStatusResolverArrayList.remove(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.glyphix.mas.b bVar) {
        bVar.f(InterConnectManager.WearEngineAuthPrefix + this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.glyphix.mas.b bVar) {
        bVar.f(InterConnectManager.MobileWearEnginePrefix + this.A);
    }

    @Override // com.glyphix.mas.d
    public void a(final String str, final String str2, final i iVar) {
        execMasFeature(iVar, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.agm
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                com.glyphix.mas.service.version.b.a(str, str2, iVar, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFileType", true);
            jSONObject.put("fileUri", str);
            jSONObject.put(LogSenderConst.FILENAME, str2);
            a(com.glyphix.mas.utils.e.OnMessage, jSONObject, new InterConnectManager.a(null));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.glyphix.mas.d
    public void a(final i iVar) {
        com.glyphix.mas.utils.b.c().c(this.A, "get device info");
        execMasFeature(iVar, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.lfm
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                com.glyphix.mas.service.version.b.a(iVar, bVar);
            }
        });
    }

    @Override // com.glyphix.mas.d
    public void b(h hVar) {
        if (hVar == null) {
            return;
        }
        try {
            if (this.F.containsKey(this.A)) {
                Pair<h, IBinder.DeathRecipient> pairRemove = this.F.remove(this.A);
                pairRemove.first.asBinder().unlinkToDeath(pairRemove.second, 0);
                execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.mfm
                    @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                    public final void exec(com.glyphix.mas.b bVar) {
                        this.a.c(bVar);
                    }
                });
            }
            IBinder iBinderAsBinder = hVar.asBinder();
            IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.nfm
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    this.a.k();
                }
            };
            iBinderAsBinder.linkToDeath(deathRecipient, 0);
            this.F.put(this.A, new Pair<>(hVar, deathRecipient));
            execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.ofm
                @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                public final void exec(com.glyphix.mas.b bVar) {
                    this.a.e(bVar);
                }
            });
        } catch (RemoteException e2) {
            e2.printStackTrace();
            com.glyphix.mas.utils.b.c().b(this.A, "subscribe message error", e2.toString());
        }
    }

    @Override // com.glyphix.mas.d
    public IBinder a(int i) {
        return i == 263 ? new com.glyphix.mas.service.version.a(this.D.getFeature()) : this;
    }

    @Override // com.glyphix.mas.d
    public void c(String str, String str2, i iVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.glyphix.mas.utils.d dVar = com.glyphix.mas.utils.d.AuthFailed;
            jSONObject.put("code", dVar.b());
            jSONObject.put("msg", dVar.c());
            if (!this.G) {
                iVar.b(jSONObject.toString());
                return;
            }
            if (deviceSupportInterconnect()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("isFileType", false);
                jSONObject2.put("data", str2);
                com.glyphix.mas.utils.b.c().c(this.A, "send message to", str);
                a(com.glyphix.mas.utils.e.OnMessage, jSONObject2, new InterConnectManager.a(iVar));
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

    @Override // com.glyphix.mas.d
    public boolean a() {
        if (this.D.getFeature() == null) {
            return false;
        }
        try {
            return this.D.getFeature().a();
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // com.glyphix.mas.d
    public void a(ParcelFileDescriptor parcelFileDescriptor, String str, i iVar) {
        try {
            InterConnectManager.a aVar = new InterConnectManager.a(iVar, new InterConnectManager.c() { // from class: com.oplus.aiunit.vision.ufm
                @Override // com.glyphix.mas.service.version.InterConnectManager.c
                public final void a() {
                    com.glyphix.mas.service.version.b.h();
                }
            });
            if (this.D.getFeature() != null) {
                aVar.i(this.D.getFeature().a(parcelFileDescriptor, "", str, this.B, new d(iVar, str)));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2, i iVar, com.glyphix.mas.b bVar) {
        bVar.a(str, str2, "interconnect_common", new InterConnectManager.a(iVar));
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
    public /* synthetic */ void a(h hVar, com.glyphix.mas.b bVar) {
        bVar.a("gx_rpc_log", new e(hVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(JSONObject jSONObject, InterConnectManager.a aVar, com.glyphix.mas.b bVar) {
        bVar.b(this.B, jSONObject.toString(), InterConnectManager.DeviceWearEngineMsgTopic, aVar);
    }

    @Override // com.glyphix.mas.d
    public void a(final String str, final i iVar) {
        com.glyphix.mas.utils.b.c().c(this.A, "check wear app is install", str);
        execMasFeature(iVar, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.tfm
            @Override // com.glyphix.mas.service.version.MasFeatureExecutor
            public final void exec(com.glyphix.mas.b bVar) {
                com.glyphix.mas.service.version.b.b(str, iVar, bVar);
            }
        });
    }

    @Override // com.glyphix.mas.d
    public void a(final com.glyphix.mas.f fVar) {
        Pair<com.glyphix.mas.f, IBinder.DeathRecipient> pairRemove;
        Map<String, Pair<com.glyphix.mas.f, IBinder.DeathRecipient>> map = InterConnectManager.linkStatusResolverArrayList;
        synchronized (map) {
            try {
                if (map.containsKey(this.A) && (pairRemove = map.remove(this.A)) != null) {
                    pairRemove.first.asBinder().unlinkToDeath(pairRemove.second, 0);
                }
                IBinder iBinderAsBinder = fVar.asBinder();
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.bgm
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        com.glyphix.mas.service.version.b.c(fVar);
                    }
                };
                iBinderAsBinder.linkToDeath(deathRecipient, 0);
                map.put(this.A, new Pair<>(fVar, deathRecipient));
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.glyphix.mas.d
    public void a(g gVar) {
        try {
            n();
            a(com.glyphix.mas.utils.e.OnReadyOpen, new JSONObject(), new InterConnectManager.a(null));
            if (this.H != null) {
                g();
            }
            if (this.H == null) {
                IBinder iBinderAsBinder = gVar.asBinder();
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.vfm
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.a.j();
                    }
                };
                iBinderAsBinder.linkToDeath(deathRecipient, 0);
                this.H = new Pair<>(gVar, deathRecipient);
            }
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.glyphix.mas.d
    public void a(final h hVar) {
        try {
            if (this.I == null) {
                IBinder iBinderAsBinder = hVar.asBinder();
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.xfm
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.a.l();
                    }
                };
                iBinderAsBinder.linkToDeath(deathRecipient, 0);
                this.I = new Pair<>(hVar, deathRecipient);
            }
            execMasFeature(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.yfm
                @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                public final void exec(com.glyphix.mas.b bVar) {
                    this.a.a(hVar, bVar);
                }
            });
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.glyphix.mas.d
    public void a(ParcelFileDescriptor parcelFileDescriptor, final String str, final String str2, String str3, i iVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.glyphix.mas.utils.d dVar = com.glyphix.mas.utils.d.AuthFailed;
            jSONObject.put("code", dVar.b());
            jSONObject.put("msg", dVar.c());
            if (!this.G) {
                iVar.b(jSONObject.toString());
                return;
            }
            InterConnectManager.a aVar = new InterConnectManager.a(iVar, new InterConnectManager.c() { // from class: com.oplus.aiunit.vision.zfm
                @Override // com.glyphix.mas.service.version.InterConnectManager.c
                public final void a() {
                    this.a.c(str2, str);
                }
            });
            if (this.D.getFeature() != null) {
                aVar.i(this.D.getFeature().a(parcelFileDescriptor, str, str2, str3, aVar));
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

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.glyphix.mas.utils.e eVar, JSONObject jSONObject, final InterConnectManager.a aVar) {
        try {
            if (eVar == com.glyphix.mas.utils.e.OnClose || eVar == com.glyphix.mas.utils.e.OnOpen) {
                if (!checkNeedSyncStatus(this.B, System.identityHashCode(this) + "_", eVar)) {
                    return;
                }
            }
            final JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event", eVar.ordinal());
            jSONObject2.put("data", jSONObject);
            execMasFeature(aVar.f2336n, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.gfm
                @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                public final void exec(com.glyphix.mas.b bVar) {
                    this.a.a(jSONObject2, aVar, bVar);
                }
            });
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.glyphix.mas.d
    public void a(com.glyphix.mas.b bVar) {
        com.glyphix.mas.utils.b.c().c("set mas feature");
        this.D.setFeature(bVar);
        try {
            this.D.getFeature().b(this.E);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }
}
