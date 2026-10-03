package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.oplus.drs.core.db.service.ConfigRepository;
import com.oplus.drs.core.model.OTrackEvent;
import com.oplus.drs.core.reconciliation.FlowControlReason;
import com.oplus.drs.core.reconciliation.ValidationReason;
import com.oplus.drs.core.rt.RtIngestWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class t6k {
    public static volatile t6k d;
    public final HandlerThread a;
    public final Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f16910c = new AtomicInteger(0);

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 2) {
                    t6k.this.s((jt5) message.obj);
                } else if (i == 3) {
                    t6k.this.v((e8e) message.obj);
                }
            } catch (Throwable th) {
                try {
                    z6b.p("TrackPreprocessThread", "handleMessage error", th);
                } finally {
                    t6k.this.f16910c.decrementAndGet();
                }
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ OTrackEvent i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List f16911j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ agf f16912l;

        public b(OTrackEvent oTrackEvent, List list, String str, agf agfVar) {
            this.i = oTrackEvent;
            this.f16911j = list;
            this.k = str;
            this.f16912l = agfVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            t6k.this.g(this.i);
            t6k.this.z(this.f16911j);
            t6k.this.u(this.k, this.f16911j, this.f16912l);
        }
    }

    public t6k() {
        HandlerThread handlerThread = new HandlerThread("DRS-Track-Preprocess", -2);
        this.a = handlerThread;
        handlerThread.start();
        this.b = new a(handlerThread.getLooper());
    }

    public static int i(ConfigRepository configRepository, sga sgaVar) {
        try {
            zs6 zs6VarJ = configRepository.j(sgaVar.a(), sgaVar.m(), sgaVar.n());
            if (zs6VarJ == null) {
                return -1;
            }
            return zs6VarJ.h == 2 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String k() {
        return UUID.randomUUID().toString();
    }

    public static ConfigRepository l() {
        try {
            Context contextH = w56.h();
            if (contextH == null) {
                return null;
            }
            return v56.b(contextH);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static t6k m() {
        if (d == null) {
            synchronized (t6k.class) {
                if (d == null) {
                    d = new t6k();
                }
            }
        }
        return d;
    }

    public static boolean o(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean q() {
        return b87.a(w56.h(), b87.FF_CORE_RT_DUAL_WORKER, true);
    }

    public static boolean r(OTrackEvent oTrackEvent) {
        return (oTrackEvent == null || o(oTrackEvent.app_id) || o(oTrackEvent.app_key) || o(oTrackEvent.app_secret) || o(oTrackEvent.event_group) || o(oTrackEvent.event_id) || o(oTrackEvent.pkgName)) ? false : true;
    }

    public final void g(OTrackEvent oTrackEvent) {
        if (oTrackEvent == null) {
            return;
        }
        try {
            String str = oTrackEvent.duid;
            if (str != null && !str.isEmpty()) {
                q7a.h(oTrackEvent.duid);
                tpe.a(w56.h(), oTrackEvent.duid);
            }
            String str2 = oTrackEvent.ouid;
            if (str2 == null || str2.isEmpty()) {
                return;
            }
            tpe.b(w56.h(), oTrackEvent.ouid);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[PHI: r14
  0x0068: PHI (r14v3 java.util.List<com.oplus.aiunit.vision.sga>) = 
  (r14v2 java.util.List<com.oplus.aiunit.vision.sga>)
  (r14v12 java.util.List<com.oplus.aiunit.vision.sga>)
  (r14v12 java.util.List<com.oplus.aiunit.vision.sga>)
 binds: [B:24:0x0053, B:27:0x005c, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean h(String str, List<sga> list, agf agfVar) {
        List<sga> arrayList;
        boolean z;
        ArrayList arrayList2;
        agf agfVar2;
        OTrackEvent oTrackEvent;
        try {
            OTrackEvent oTrackEvent2 = list.get(0).a;
            ConfigRepository configRepositoryL = l();
            ArrayList<sga> arrayList3 = null;
            if (configRepositoryL != null) {
                Iterator<sga> it = list.iterator();
                arrayList2 = null;
                arrayList = null;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    sga next = it.next();
                    int i = i(configRepositoryL, next);
                    if (i < 0) {
                        z = true;
                        break;
                    }
                    if (i > 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(next);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(next);
                    }
                }
            } else {
                arrayList = list;
                z = false;
                arrayList2 = null;
            }
            if (z) {
                arrayList2 = null;
            } else {
                list = arrayList;
            }
            if (q()) {
                arrayList3 = arrayList2;
            } else {
                if (list == null) {
                    list = new ArrayList<>();
                }
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    arrayList3 = arrayList2;
                } else {
                    list.addAll(arrayList2);
                }
            }
            boolean z2 = (arrayList3 == null || arrayList3.isEmpty()) ? false : true;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                RtIngestWorker rtIngestWorkerE = RtIngestWorker.e();
                if (rtIngestWorkerE != null) {
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    for (sga sgaVar : arrayList3) {
                        if (sgaVar != null && (oTrackEvent = sgaVar.a) != null) {
                            arrayList4.add(oTrackEvent);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        rtIngestWorkerE.d(arrayList4);
                    }
                } else {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.addAll(arrayList3);
                    z6b.u("TrackPreprocessThread", "RtIngestWorker not ready, fallback RT->NR, size=" + arrayList3.size());
                }
            }
            List<sga> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(z2 ? "-nr" : "");
                String string = sb.toString();
                if (z2) {
                    agf agfVar3 = new agf();
                    for (sga sgaVar2 : list2) {
                        agfVar3.d(sgaVar2.a() != null ? sgaVar2.a() : oTrackEvent2.app_id, sgaVar2.p(), 1);
                    }
                    agfVar2 = agfVar3;
                } else {
                    agfVar2 = agfVar;
                }
                u56.j().execute(new b(oTrackEvent2, list2, string, agfVar2));
            }
            if (z2) {
                agfVar.f();
            }
            return true;
        } catch (Throwable th) {
            z6b.p("TrackPreprocessThread", "classifyAndDispatch failed", th);
            return false;
        }
    }

    public final List<hxe> j(String str, List<sga> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<sga> it = list.iterator();
        while (it.hasNext()) {
            sga next = it.next();
            arrayList.add(new hxe(str, next != null ? next.C() : null));
        }
        return arrayList;
    }

    public int n() {
        return this.f16910c.get();
    }

    public boolean p() {
        return this.f16910c.get() > 200;
    }

    public final void s(jt5 jt5Var) {
        List<OTrackEvent> list = jt5Var.a;
        ut9 ut9Var = jt5Var.b;
        if (list == null || list.isEmpty()) {
            if (ut9Var != null) {
                ut9Var.a(Collections.emptyList(), Collections.emptyList());
                return;
            }
            return;
        }
        try {
            for (OTrackEvent oTrackEvent : list) {
                lg7.e().k(oTrackEvent, oTrackEvent.pkgName);
            }
        } catch (Throwable th) {
            z6b.p("TrackPreprocessThread", "FirstEventTracker error in direct mode, continue", th);
        }
        t(list, k(), true, ut9Var);
    }

    public final void t(List<OTrackEvent> list, String str, boolean z, ut9 ut9Var) {
        qaf qafVarK;
        int i = 0;
        OTrackEvent oTrackEvent = list.get(0);
        String str2 = oTrackEvent.app_id;
        agf agfVar = new agf();
        for (OTrackEvent oTrackEvent2 : list) {
            String str3 = oTrackEvent2.app_id;
            if (str3 == null) {
                str3 = str2;
            }
            agfVar.d(str3, oTrackEvent2.event_time, 1);
        }
        if (!z && (qafVarK = t56.k()) != null && qafVarK.d(str2, list.size()) != null) {
            agfVar.c(str2, oTrackEvent.event_time, 1, FlowControlReason.QUOTA_APP_EXCEEDED.getCode());
            agfVar.f();
            if (ut9Var != null) {
                w(ut9Var, list, str, 602, "quota_app_exceeded");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (OTrackEvent oTrackEvent3 : list) {
            if (r(oTrackEvent3)) {
                arrayList.add(new sga(oTrackEvent3, str));
            } else {
                i++;
            }
        }
        if (i > 0) {
            agfVar.e(str2, oTrackEvent.event_time, i, ValidationReason.MISSING_REQUIRED_FIELD.getCode());
            z6b.u("TrackPreprocessThread", "validation failed count=" + i);
        }
        if (arrayList.isEmpty()) {
            agfVar.f();
            if (ut9Var != null) {
                ut9Var.a(Collections.emptyList(), Collections.emptyList());
                return;
            }
            return;
        }
        if (h(str, arrayList, agfVar)) {
            if (ut9Var != null) {
                ut9Var.a(j(str, arrayList), Collections.emptyList());
            }
        } else {
            agfVar.e(str2, oTrackEvent.event_time, arrayList.size(), ValidationReason.OTHER.getCode());
            agfVar.f();
            if (ut9Var != null) {
                w(ut9Var, list, str, 601, "submit_failed");
            }
        }
    }

    public final void u(String str, List<sga> list, agf agfVar) {
        try {
            r7a r7aVar = t56.ingestPipeline;
            if (r7aVar != null) {
                r7aVar.f(str, list, agfVar);
            } else {
                agfVar.f();
            }
        } catch (Throwable th) {
            z6b.p("TrackPreprocessThread", "[" + str + "] processIngest error", th);
            if (list != null) {
                try {
                    if (list.isEmpty()) {
                        return;
                    }
                    agfVar.e(list.get(0).a(), list.get(0).p(), list.size(), ValidationReason.OTHER.getCode());
                    agfVar.f();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void v(e8e e8eVar) {
        List<OTrackEvent> list = e8eVar.a;
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = e8eVar.b;
        t(list, (str == null || str.isEmpty()) ? k() : e8eVar.b, false, null);
    }

    public final void w(ut9 ut9Var, List<OTrackEvent> list, String str, int i, String str2) {
        if (ut9Var == null) {
            return;
        }
        String strA = cxe.a(i);
        if (str2 != null) {
            strA = strA + ", reason=" + str2;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OTrackEvent> it = list.iterator();
        while (it.hasNext()) {
            OTrackEvent next = it.next();
            arrayList.add(new hxe(str, next != null ? next.uuid : null, i, strA));
        }
        ut9Var.a(Collections.emptyList(), arrayList);
    }

    public void x(List<OTrackEvent> list, ut9 ut9Var) {
        this.f16910c.incrementAndGet();
        this.b.sendMessage(this.b.obtainMessage(2, new jt5(list, ut9Var)));
    }

    public void y(List<OTrackEvent> list, String str) {
        this.f16910c.incrementAndGet();
        this.b.sendMessage(this.b.obtainMessage(3, new e8e(list, str)));
    }

    public final void z(List<sga> list) {
        String strA;
        try {
            ou3 ou3Var = t56.configService;
            if (ou3Var != null) {
                ou3Var.f();
                if (list == null || list.isEmpty() || (strA = list.get(0).a()) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(strA);
                t56.configService.k(arrayList);
            }
        } catch (Throwable th) {
            z6b.p("TrackPreprocessThread", "triggerConfigCheck failed", th);
        }
    }
}
