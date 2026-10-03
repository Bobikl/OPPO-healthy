package com.oplus.aiunit.vision;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.heytap.health.base.track.quality.QualityTrack;
import com.heytap.health.base.track.quality.Scenes;
import com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBody;
import com.heytap.health.watch.watchface.proto.Proto$SyncMode;
import com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessage;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class jej implements os4 {
    public static final String TAG = "SyncManager";
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f12862j;
    public final HashMap<String, c> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<Runnable> f12863l;

    public class a implements ul4.a {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ul4.a
        public void onPeerConnected(@NonNull Node node) {
            ltl.d(jej.TAG, "[onConnect] --> device on line");
            jej.this.m(node.getNodeId());
        }

        @Override // com.oplus.aiunit.vision.ul4.a
        public void onPeerDisconnected(@NonNull Node node) {
            ltl.d(jej.TAG, "[onDisconnect] --> reset sync manager");
            jej.this.n(node.getNodeId());
            jej.this.j();
        }
    }

    public class b extends i4 {
        public b(Proto$WatchFaceMessage proto$WatchFaceMessage, boolean z) {
            super(proto$WatchFaceMessage, z);
        }

        @Override // com.oplus.aiunit.vision.czb
        public void a() {
        }

        @Override // com.oplus.aiunit.vision.czb
        public void b(int i) {
            int i2;
            if (i == -3) {
                QualityTrack.INSTANCE.e(Scenes.WATCH_FACE_SYNC, "同步失败，设备回复消息超时");
                i2 = 4;
            } else if (i == -4) {
                QualityTrack.INSTANCE.e(Scenes.WATCH_FACE_SYNC, "同步失败，设备处于小核模式");
                i2 = 3;
            } else {
                i2 = 2;
            }
            ltl.d(jej.TAG, "onSendFail errorCode " + i2);
            eoi.a(i2, 3);
        }
    }

    public static class c {
        public String a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f12864c;
        public long d;
    }

    public static class d {
        public static final jej a = new jej();
    }

    public static jej f() {
        return d.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(final String str, ccd ccdVar) throws Throwable {
        synchronized (jej.class) {
            if (this.f12862j == 0) {
                ltl.d(TAG, "[startSync] --> status=0, sync right now");
                h(str);
            } else {
                ltl.d(TAG, "[startSync] --> status=1, add to task");
                this.f12863l.add(new Runnable() { // from class: com.oplus.aiunit.vision.iej
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.h(str);
                    }
                });
            }
        }
        ccdVar.onComplete();
    }

    public final synchronized void d() {
        Iterator<Map.Entry<String, c>> it = this.k.entrySet().iterator();
        while (it.hasNext()) {
            c value = it.next().getValue();
            value.b = 0L;
            value.f12864c = 0L;
            value.d = 0L;
        }
    }

    public void e() {
        j();
        d();
    }

    public final long g() {
        return SystemClock.elapsedRealtime() + 14400000;
    }

    @Override // com.oplus.aiunit.vision.os4
    public synchronized String getDeviceMac() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.os4
    public synchronized void i6(String str, int i, int i2) {
        ltl.d(TAG, "[onDataChanged] --> status = " + i + ", cmd=" + i2);
        if (i == -1 && i2 == 3) {
            QualityTrack.INSTANCE.f(Scenes.WATCH_FACE_SYNC);
            c cVar = this.k.get(str);
            if (cVar != null) {
                cVar.d = g();
                ltl.a(TAG, "[onDataChanged] --> update lastSyncTimestamp=" + cVar.d + ", mac=" + str);
            }
        } else if (i2 == 3) {
            QualityTrack.INSTANCE.e(Scenes.WATCH_FACE_SYNC, "同步失败：" + i);
        }
        if ((i <= 5 && i >= -1) && i2 == 3) {
            if (this.f12863l.size() > 0) {
                ltl.d(TAG, "[onDataChanged] --> remove task, run this");
                this.f12863l.remove(0).run();
            } else {
                this.f12862j = 0;
                ltl.d(TAG, "[onDataChanged] --> task is empty, status = 0");
            }
        }
    }

    public void j() {
        this.f12863l.clear();
        this.f12862j = 0;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final synchronized void h(String str) {
        int iU;
        QualityTrack qualityTrack = QualityTrack.INSTANCE;
        Scenes scenes = Scenes.WATCH_FACE_SYNC;
        qualityTrack.b(scenes);
        boolean z = true;
        this.f12862j = 1;
        c cVar = this.k.get(str);
        if (cVar == null) {
            ltl.b(TAG, "[runSync] --> this node not exist, wait onConnect, id=" + v0j.b(str));
            this.f12862j = 0;
            qualityTrack.e(scenes, "this node not exist");
            return;
        }
        long j2 = cVar.f12864c;
        long j3 = cVar.d;
        boolean z2 = g() - j3 > 14400000;
        ltl.d(TAG, "[runSync] --> lastSyncTimestamp=" + j3 + ", forceSync=" + z2);
        i11 i11VarJ = ntl.m().j(str);
        boolean z3 = z2 || i11VarJ == null || i11VarJ.h() == null || i11VarJ.e() == null || i11VarJ.k() == null || i11VarJ.k().isEmpty();
        try {
            iU = com.heytap.health.watchface.business.creation.db.a.a().u(str);
        } catch (Exception e2) {
            ltl.j(TAG, "[runSync] exception = ", e2);
            if (!com.heytap.health.watchface.business.creation.db.b.a(e2)) {
                QualityTrack.INSTANCE.e(Scenes.WATCH_FACE_SYNC, "同步失败 " + e2);
                eoi.a(4, 3);
                return;
            }
            iU = 0;
        }
        ltl.d(TAG, "[runSync] --> forceSync check=" + z3 + " count " + iU);
        Proto$WatchFaceMessage proto$WatchFaceMessageB = nbl.b(2, Proto$MessageEnhanceBody.newBuilder().setSyncMode(Proto$SyncMode.newBuilder().setForceSync(z3 ? 1 : 2).setIsClearHealth(iU == 0 ? 1 : 2).build()).build());
        b bVar = new b(proto$WatchFaceMessageB, true);
        if (j3 >= j2) {
            z = false;
        }
        ltl.d(TAG, "[runSync] --> run , needSync=" + z + ", forceSync=" + z3);
        this.i = str;
        if (j3 == 0 || z || z3) {
            bVar.i();
            ltl.d(TAG, "[runSync] --> run , message=" + proto$WatchFaceMessageB.getHeader().getActionAnchor());
            bzb.c().k(proto$WatchFaceMessageB, bVar);
        } else {
            ltl.d(TAG, "[runSync] --> no need sync");
            bVar.a();
            eoi.b(str, -1, 3);
            bue.j().r();
        }
    }

    public void l(final String str) {
        lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.hej
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.i(str, ccdVar);
            }
        }).L0(su8.c()).n0(su8.c()).c();
    }

    public synchronized void m(String str) {
        c cVar = this.k.get(str);
        long jG = g();
        if (cVar != null) {
            ltl.a(TAG, "[updateNodeConnect] --> node id=" + str + ", update connect=" + jG);
            cVar.b = jG;
        } else {
            ltl.a(TAG, "[updateNodeConnect] --> node id=" + str + ", first connect=" + jG);
            c cVar2 = new c();
            cVar2.a = str;
            cVar2.b = jG;
            this.k.put(str, cVar2);
        }
    }

    public final synchronized void n(String str) {
        c cVar = this.k.get(str);
        long jG = g();
        if (cVar != null) {
            ltl.a(TAG, "[updateNodeDisConnect] --> node id=" + str + ", update disconnect=" + jG);
            cVar.f12864c = jG;
        } else {
            ltl.b(TAG, "[updateNodeDisConnect] --> error = this node never connected,  node id=" + v0j.b(str));
        }
    }

    public jej() {
        this.i = "";
        this.f12862j = 0;
        this.k = new HashMap<>();
        this.f12863l = new ArrayList();
        gl4.devicePrimary.nodeApi.g(new a());
        String currentConnectId = gl4.managerApi.getCurrentConnectId();
        if (currentConnectId != null) {
            m(currentConnectId);
        }
        ntl.m().q(this);
    }
}
