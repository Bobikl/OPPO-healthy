package com.glyphix.mas.service.version;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.util.Pair;
import com.glyphix.mas.i;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public interface InterConnectManager {
    public static final String DeviceWearEngineMsgTopic = "wear-engine-msg";
    public static final String MobileWearEnginePrefix = "wear-engine-";
    public static final String TAG = "com.glyphix.mas.service.version.InterConnectManager";
    public static final String WearEngineAuthPrefix = "wear-engine-auth-";
    public static final com.glyphix.mas.common.d wearEngineConnectionChangeDebounce = new com.glyphix.mas.common.d(200);
    public static final com.glyphix.mas.common.d deviceLinkStatusChangeDebounce = new com.glyphix.mas.common.d(200);
    public static final Map<String, Pair<com.glyphix.mas.f, IBinder.DeathRecipient>> linkStatusResolverArrayList = new ConcurrentHashMap();
    public static final Map<String, Pair<String, IBinder>> wearEngineBinderList = new ConcurrentHashMap();
    public static final ArrayList<a> resolverList = new ArrayList<>();
    public static final Map<String, String> serviceStatusMap = new ConcurrentHashMap();

    public static class a extends com.glyphix.mas.c.b {
        public static b s;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public i f2336n;
        private IBinder.DeathRecipient o;
        private c p;
        private final Object q;
        private String r;

        public a(i iVar) {
            this.o = null;
            this.p = null;
            this.q = new Object();
            this.r = "";
            this.f2336n = iVar;
            InterConnectManager.resolverList.add(this);
        }

        private void h() {
            i iVar;
            try {
                if (this.o != null && (iVar = this.f2336n) != null) {
                    iVar.asBinder().unlinkToDeath(this.o, 0);
                }
            } catch (NoSuchElementException e2) {
                e2.printStackTrace();
            }
        }

        public void i() {
            synchronized (this.q) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    com.glyphix.mas.utils.d dVar = com.glyphix.mas.utils.d.ClientClose;
                    jSONObject.put("code", dVar.b());
                    jSONObject.put("data", dVar.c());
                    b(jSONObject.toString());
                } catch (JSONException unused) {
                }
                s.a(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.dea
                    @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                    public final void exec(com.glyphix.mas.b bVar) {
                        this.a.b(bVar);
                    }
                });
            }
        }

        @Override // com.glyphix.mas.c
        public int retry() {
            return 2;
        }

        @Override // com.glyphix.mas.c
        public int timeout() {
            return 5000;
        }

        public a(i iVar, c cVar) {
            this.o = null;
            this.q = new Object();
            this.r = "";
            this.f2336n = iVar;
            this.p = cVar;
            InterConnectManager.resolverList.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.glyphix.mas.b bVar) {
            bVar.g(this.r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(final String str) {
            com.glyphix.mas.utils.b.c().e("wear engine resolver connection disconnect");
            s.a(null, new MasFeatureExecutor() { // from class: com.oplus.aiunit.vision.cea
                @Override // com.glyphix.mas.service.version.MasFeatureExecutor
                public final void exec(com.glyphix.mas.b bVar) {
                    bVar.g(str);
                }
            });
            this.f2336n = null;
        }

        @Override // com.glyphix.mas.c
        public int a(String str) {
            synchronized (this.q) {
                c cVar = this.p;
                if (cVar != null) {
                    cVar.a();
                }
                if (this.f2336n == null) {
                    com.glyphix.mas.utils.b.c().e("task exec success, but resolve is null");
                    return 0;
                }
                h();
                try {
                    this.f2336n.a(str);
                    this.f2336n = null;
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    com.glyphix.mas.utils.b.c().b(e2.toString());
                }
                return 0;
            }
        }

        @Override // com.glyphix.mas.c
        public int d(String str) {
            synchronized (this.q) {
                i iVar = this.f2336n;
                if (iVar == null) {
                    return 0;
                }
                try {
                    iVar.d(str);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    com.glyphix.mas.utils.b.c().b(e2.toString());
                }
                return 0;
            }
        }

        public void i(final String str) {
            try {
                this.r = str;
                IBinder iBinderAsBinder = this.f2336n.asBinder();
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.oplus.aiunit.vision.eea
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.a.h(str);
                    }
                };
                this.o = deathRecipient;
                iBinderAsBinder.linkToDeath(deathRecipient, 0);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.glyphix.mas.c
        public int b(String str) {
            synchronized (this.q) {
                try {
                    com.glyphix.mas.utils.b.c().b("exec failed", str);
                    h();
                    i iVar = this.f2336n;
                    if (iVar == null) {
                        com.glyphix.mas.utils.b.c().e("resolver is null");
                        return 0;
                    }
                    iVar.b(str);
                    this.f2336n = null;
                    return 0;
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    com.glyphix.mas.utils.b.c().b(e2.toString());
                }
            }
        }
    }

    public interface b {
        void a(i iVar, MasFeatureExecutor masFeatureExecutor);
    }

    public interface c {
        void a();
    }

    default boolean checkNeedSyncStatus(String str, String str2, com.glyphix.mas.utils.e eVar) {
        Map<String, String> map = serviceStatusMap;
        synchronized (map) {
            if (!map.containsKey(str)) {
                map.put(str, str2);
                return true;
            }
            if (!map.containsKey(str) || Objects.equals(map.get(str), str2)) {
                return true;
            }
            if (eVar != com.glyphix.mas.utils.e.OnOpen && eVar != com.glyphix.mas.utils.e.OnReadyOpen) {
                return false;
            }
            map.put(str, str2);
            return true;
        }
    }

    default void cleanResolver() {
        synchronized (resolverList) {
            int i = 0;
            while (true) {
                ArrayList<a> arrayList = resolverList;
                if (i < arrayList.size()) {
                    arrayList.get(i).i();
                    i++;
                } else {
                    arrayList.clear();
                }
            }
        }
    }

    default boolean deviceSupportInterconnect() {
        if (getGlyphixMasExecutor() == null) {
            return false;
        }
        try {
            com.glyphix.mas.utils.b.c().c(TAG, "deviceSupportInterconnect: " + getGlyphixMasExecutor().c());
            return getGlyphixMasExecutor().c() >= 2006002;
        } catch (RemoteException unused) {
            return false;
        }
    }

    default void execMasFeature(i iVar, MasFeatureExecutor masFeatureExecutor) {
        try {
            if (getGlyphixMasExecutor() == null) {
                com.glyphix.mas.utils.b.c().b("mas is not set feature executor");
                if (iVar == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1000);
                jSONObject.put("msg", "no device connect");
                iVar.b(jSONObject.toString());
            } else {
                try {
                    if (deviceSupportInterconnect() || iVar == null) {
                        masFeatureExecutor.exec(getGlyphixMasExecutor());
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    com.glyphix.mas.utils.d dVar = com.glyphix.mas.utils.d.DeviceNoSupport;
                    jSONObject2.put("code", dVar.b());
                    jSONObject2.put("msg", dVar.c());
                    iVar.b(jSONObject2.toString());
                } catch (RemoteException | JSONException unused) {
                    if (iVar == null) {
                        return;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("code", 1000);
                    jSONObject3.put("msg", "no device connect");
                    iVar.b(jSONObject3.toString());
                }
            }
        } catch (RemoteException | JSONException e2) {
            e2.printStackTrace();
        }
    }

    com.glyphix.mas.b getGlyphixMasExecutor();
}
