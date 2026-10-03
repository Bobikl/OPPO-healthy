package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.drs.base.ChannelMode;
import com.oplus.drs.base.util.NetworkUtils;
import com.oplus.drs.core.config.NoConfigAppStateManager;
import com.oplus.drs.core.config.impl.ConfigServiceImpl;
import com.oplus.drs.core.db.service.CapacityGovernor;
import com.oplus.drs.core.db.service.ConfigRepository;
import com.oplus.drs.core.net.request.ConfigQueryRequest;
import com.oplus.drs.core.reconciliation.DebugHelperReceiver;
import com.oplus.drs.core.rt.RtIngestWorker;
import com.oplus.drs.core.schduler.UploadJobScheduler;
import com.oplus.drs.core.upload.upload.UploadPipelineV2;
import com.oplus.drs.rom.sdk.comm.util.OpenIdUtils;
import com.oppo.obus.common.configmetadata.core.entity.AreaConfig;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class t56 {
    public static volatile qaf a = null;
    public static au3 configQueryService = null;
    public static ou3 configService = null;
    public static com.oplus.drs.core.monitor.b deviceMonitor = null;
    public static r7a ingestPipeline = null;
    public static NoConfigAppStateManager noConfigAppStateManager = null;
    public static final String sDrsCoreVersion = "DrsCore{1.0.0}";
    public static bmj todoService;
    public static plk uploadService;
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nu3 f16888c = new nu3();
    public static volatile boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f16889e = new AtomicBoolean(false);
    public static final AtomicBoolean f = new AtomicBoolean(false);

    public class a implements CapacityGovernor.f {
        public final /* synthetic */ ou3 a;

        public a(ou3 ou3Var) {
            this.a = ou3Var;
        }

        @Override // com.oplus.drs.core.db.service.CapacityGovernor.f
        public int a() {
            return this.a.a();
        }
    }

    public class b implements CapacityGovernor.d {
        @Override // com.oplus.drs.core.db.service.CapacityGovernor.d
        public void a(CapacityGovernor.e eVar) {
            if (eVar == null) {
                return;
            }
            try {
                z6b.q("DrsCore", "Capacity cleanup stats: " + eVar.a() + " rows deleted");
            } catch (Throwable th) {
                z6b.p("DrsCore", "CapacityGovernor reconciliation callback error", th);
            }
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ji0.c().d();
            z6b.q("DrsCore", w56.c(w56.b()) + t56.sDrsCoreVersion);
        }
    }

    public class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com.oplus.drs.base.ntp.b.f().i();
        }
    }

    public class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            t56.o();
        }
    }

    public class f implements Runnable {

        public class a implements NetworkUtils.e {

            /* JADX INFO: renamed from: com.oplus.aiunit.vision.t56$f$a$a, reason: collision with other inner class name */
            public class RunnableC0929a implements Runnable {
                public RunnableC0929a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    t56.o();
                }
            }

            public a() {
            }

            @Override // com.oplus.drs.base.util.NetworkUtils.e
            public void a() {
                if (w56.a() != ChannelMode.DRS || t56.f16889e.get()) {
                    return;
                }
                u56.l().submit(new RunnableC0929a());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkUtils.w(w56.h(), new a());
        }
    }

    public static void c() {
        if (w56.a() != ChannelMode.DRS) {
            return;
        }
        u56.l().submit(new e());
    }

    public static void d(String str, String str2) {
        try {
            Context contextH = w56.h();
            if (contextH == null) {
                return;
            }
            if (i(str)) {
                q7a.h(str);
                tpe.a(contextH, str);
            }
            if (i(str2)) {
                tpe.b(contextH, str2);
            }
        } catch (Throwable th) {
            z6b.p("DrsCore", "cacheDeviceIds error", th);
        }
    }

    public static synchronized void e(Context context) {
        if (!b.compareAndSet(false, true)) {
            z6b.q("DrsCore", "DrsCore.init() SKIPPED - already initialized");
            return;
        }
        z6b.q("DrsCore", "DrsCore.init() START");
        w56.e(context);
        u56.k(context);
        ConfigRepository configRepositoryB = v56.b(w56.h());
        com.oplus.drs.core.db.service.a aVarD = v56.d(w56.h());
        noConfigAppStateManager = new NoConfigAppStateManager(w56.h(), configRepositoryB);
        ConfigServiceImpl configServiceImpl = new ConfigServiceImpl(configRepositoryB, aVarD);
        configService = configServiceImpl;
        configServiceImpl.b("149700", bgf.RECONCILIATION_APP_KEY, bgf.RECONCILIATION_APP_SECRET);
        z6b.q("DrsCore", "Loading config from database synchronously");
        configService.l();
        configService.g();
        a = new qaf(v56.e(w56.h()), configService);
        uploadService = new qlk();
        configQueryService = new bu3();
        todoService = new cmj();
        ingestPipeline = new r7a(aVarD, configRepositoryB, a);
        z6b.q("DrsCore", "IngestPipeline created");
        g(aVarD, configService);
        fgf.b(new egf(context));
        z6b.q("DrsCore", "ReconciliationService registered");
        DebugHelperReceiver.f(context);
        RtIngestWorker.f();
        x0g.d();
        z6b.q("DrsCore", "RT workers initialized");
        f();
        com.oplus.drs.core.monitor.b bVar = new com.oplus.drs.core.monitor.b(context);
        deviceMonitor = bVar;
        bVar.j();
        z6b.q("DrsCore", "Calling UploadJobScheduler.start()");
        UploadJobScheduler.t(context);
        UploadPipelineV2.getInstance(context).triggerRealtimeOnAppStartup();
        rli.f(context);
        z6b.q("DrsCore", "DrsCore.init() COMPLETE - DRS Core initialized");
    }

    public static void f() {
        l();
        c();
        u56.b().submit(new c());
        u56.l().submit(new d());
    }

    public static void g(com.oplus.drs.core.db.service.a aVar, ou3 ou3Var) {
        CapacityGovernor capacityGovernorA = v56.a(w56.h());
        capacityGovernorA.o(w56.h(), new a(ou3Var), aVar);
        capacityGovernorA.y(new b());
    }

    public static boolean h() {
        return d;
    }

    public static boolean i(String str) {
        return (str == null || str.isEmpty() || OpenIdUtils.DEFAULT_VALUE.equals(str)) ? false : true;
    }

    public static NoConfigAppStateManager j() {
        return noConfigAppStateManager;
    }

    public static qaf k() {
        return a;
    }

    public static void l() {
        u56.l().submit(new f());
    }

    public static void m(String str) {
        if (!b.get() || str == null || str.isEmpty()) {
            return;
        }
        f16888c.i(str);
    }

    public static void n(boolean z) {
        d = z;
        z6b.q("DrsCore", "setForceJsonSerialization: " + z);
    }

    public static void o() {
        AtomicBoolean atomicBoolean = f16889e;
        if (atomicBoolean.get()) {
            return;
        }
        AtomicBoolean atomicBoolean2 = f;
        if (atomicBoolean2.compareAndSet(false, true)) {
            try {
                if (configService.e(vg0.b(vg0.e()).toString()) != null) {
                    atomicBoolean.set(true);
                    atomicBoolean2.set(false);
                    return;
                }
                AreaConfig areaConfigB = configQueryService.b(ConfigQueryRequest.buildAppIdsRequest(Collections.singletonList("149700")));
                if (areaConfigB != null) {
                    configService.c(areaConfigB);
                    atomicBoolean.set(true);
                    z6b.q("DrsCore", "Base config fetched and saved successfully");
                }
                atomicBoolean2.set(false);
            } catch (Throwable th) {
                try {
                    z6b.p("DrsCore", "tryFetchBaseConfig failed", th);
                } finally {
                    f.set(false);
                }
            }
        }
    }
}
