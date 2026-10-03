package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Pair;
import com.oplus.drs.core.model.OTrackEvent;
import com.oplus.drs.core.model.TrackType;
import com.oplus.drs.rom.sdk.comm.DrsSdkCore;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import com.oplus.drs.rom.sdk.comm.util.OpenIdUtils;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public final class e66 {
    public static final ScheduledExecutorService g = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.oplus.aiunit.vision.d66
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return e66.l(runnable);
        }
    });
    public String a;
    public df3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lf3 f10801c;
    public tga d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10802e = false;
    public bf3 f = new a();

    public class a implements bf3 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.bf3
        public void b(int i) {
            super.b(i);
        }
    }

    public class b implements ju9<String> {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ ScheduledFuture[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ OTrackEvent f10803c;
        public final /* synthetic */ bf3 d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Runnable f10804e;

        public b(AtomicBoolean atomicBoolean, ScheduledFuture[] scheduledFutureArr, OTrackEvent oTrackEvent, bf3 bf3Var, Runnable runnable) {
            this.a = atomicBoolean;
            this.b = scheduledFutureArr;
            this.f10803c = oTrackEvent;
            this.d = bf3Var;
            this.f10804e = runnable;
        }

        @Override // com.oplus.aiunit.vision.ju9
        public void a(int i, String str, Throwable th) {
            if (this.a.compareAndSet(false, true)) {
                ScheduledFuture scheduledFuture = this.b[0];
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                TrackLogger.o("DRS_SDK_COMMON_DrsTrackImpl", "RT IPC failed, fallback to batch mode, code=%s, msg=%s", Integer.valueOf(i), str);
                this.f10804e.run();
            }
        }

        @Override // com.oplus.aiunit.vision.ju9
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            if (this.a.compareAndSet(false, true)) {
                ScheduledFuture scheduledFuture = this.b[0];
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                OTrackEvent oTrackEvent = this.f10803c;
                TrackLogger.c("DRS_SDK_COMMON_DrsTrackImpl", "RT IPC direct send success, eventGroup=%s, eventId=%s", oTrackEvent.event_group, oTrackEvent.event_id);
                bf3 bf3Var = this.d;
                if (bf3Var != null) {
                    bf3Var.c(0L);
                }
            }
        }
    }

    public e66(Context context, String str) {
        this.a = str;
    }

    public static boolean i(String str) {
        return str == null || str.isEmpty() || OpenIdUtils.DEFAULT_VALUE.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(ScheduledFuture[] scheduledFutureArr, OTrackEvent oTrackEvent, bf3 bf3Var) {
        ScheduledFuture scheduledFuture = scheduledFutureArr[0];
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        d(oTrackEvent, bf3Var);
    }

    public static /* synthetic */ void k(AtomicBoolean atomicBoolean, Runnable runnable) {
        if (atomicBoolean.compareAndSet(false, true)) {
            TrackLogger.o("DRS_SDK_COMMON_DrsTrackImpl", "RT IPC timeout after %dms, fallback to batch", 10000L);
            runnable.run();
        }
    }

    public static /* synthetic */ Thread l(Runnable runnable) {
        Thread thread = new Thread(runnable, "drs-sdk-rt-watchdog");
        thread.setDaemon(true);
        return thread;
    }

    public static String m(String str) {
        if (str == null || str.isEmpty()) {
            return "(empty)";
        }
        if (str.length() <= 8) {
            return str;
        }
        return "***" + str.substring(str.length() - 8);
    }

    public void d(OTrackEvent oTrackEvent, bf3 bf3Var) {
        if (oTrackEvent == null) {
            TrackLogger.e("DRS_SDK_COMMON_DrsTrackImpl", "OTrackEvent event cannot be null", new Object[0]);
            if (bf3Var != null) {
                bf3Var.a(-1, "OTrackEvent event cannot be null");
                return;
            }
            return;
        }
        if (!this.f10802e) {
            TrackLogger.e("DRS_SDK_COMMON_DrsTrackImpl", "DrsTrack not initialized, appId=%s", oTrackEvent.app_id);
            if (bf3Var != null) {
                bf3Var.a(-1, "DrsTrack not initialized");
                return;
            }
            return;
        }
        try {
            if (this.b != null) {
                String str = oTrackEvent.app_key;
                if (str == null || str.isEmpty()) {
                    oTrackEvent.app_key = this.b.a();
                }
                String str2 = oTrackEvent.app_secret;
                if (str2 == null || str2.isEmpty()) {
                    oTrackEvent.app_secret = this.b.b();
                }
                String str3 = oTrackEvent.channel;
                if (str3 == null || str3.isEmpty()) {
                    oTrackEvent.channel = this.b.c();
                }
                if (oTrackEvent.custom_header == null && this.b.d() != null) {
                    oTrackEvent.custom_header = this.b.d();
                }
            }
            String str4 = oTrackEvent.duid;
            f(oTrackEvent);
            TrackLogger.c("DRS_SDK_COMMON_DrsTrackImpl", "commitData prefilter check, appId=%s, group=%s, eventId=%s, duidBefore=%s, duidAfter=%s", oTrackEvent.app_id, oTrackEvent.event_group, oTrackEvent.event_id, m(str4), m(oTrackEvent.duid));
            if (!sjg.r().M(oTrackEvent)) {
                TrackLogger.h("DRS_SDK_COMMON_DrsTrackImpl", "Event filtered before cache, appId=%s, group=%s, eventId=%s, duid=%s", oTrackEvent.app_id, oTrackEvent.event_group, oTrackEvent.event_id, m(oTrackEvent.duid));
                if (bf3Var != null) {
                    bf3Var.c(0L);
                    return;
                }
                return;
            }
            long jW = this.f10801c.w(oTrackEvent);
            if (jW > 0) {
                TrackLogger.c("DRS_SDK_COMMON_DrsTrackImpl", "Data committed successfully: id=%s", Long.valueOf(jW));
                if (bf3Var != null) {
                    bf3Var.c(jW);
                }
                this.d.S();
                return;
            }
            TrackLogger.e("DRS_SDK_COMMON_DrsTrackImpl", "Failed to commit event", new Object[0]);
            if (bf3Var != null) {
                bf3Var.a(-1, "Failed to write event to cache");
            }
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_DrsTrackImpl", "Commit event exception", e2, new Object[0]);
            if (bf3Var != null) {
                bf3Var.a(-1, "Exception: " + e2.getMessage());
            }
        }
    }

    public void e(final OTrackEvent oTrackEvent, final bf3 bf3Var) {
        if (oTrackEvent == null) {
            TrackLogger.e("DRS_SDK_COMMON_DrsTrackImpl", "commitRealtimeData: event is null", new Object[0]);
            if (bf3Var != null) {
                bf3Var.a(-1, "event is null");
                return;
            }
            return;
        }
        if (!this.f10802e) {
            TrackLogger.e("DRS_SDK_COMMON_DrsTrackImpl", "commitRealtimeData: not initialized, appId=%s", oTrackEvent.app_id);
            if (bf3Var != null) {
                bf3Var.a(-1, "DrsTrack not initialized");
                return;
            }
            return;
        }
        if (!b87.a(c90.a(), b87.FF_SDK_RT_DIRECT_IPC, true)) {
            d(oTrackEvent, bf3Var);
            return;
        }
        try {
            if (this.b != null) {
                String str = oTrackEvent.app_key;
                if (str == null || str.isEmpty()) {
                    oTrackEvent.app_key = this.b.a();
                }
                String str2 = oTrackEvent.app_secret;
                if (str2 == null || str2.isEmpty()) {
                    oTrackEvent.app_secret = this.b.b();
                }
                String str3 = oTrackEvent.channel;
                if (str3 == null || str3.isEmpty()) {
                    oTrackEvent.channel = this.b.c();
                }
                if (oTrackEvent.custom_header == null && this.b.d() != null) {
                    oTrackEvent.custom_header = this.b.d();
                }
            }
            f(oTrackEvent);
            String str4 = oTrackEvent.uuid;
            if (str4 == null || str4.isEmpty()) {
                oTrackEvent.uuid = UUID.randomUUID().toString();
            }
            OTrackEvent oTrackEventFromJson = OTrackEvent.fromJson(oTrackEvent.toJson());
            if (oTrackEventFromJson == null) {
                d(oTrackEvent, bf3Var);
                return;
            }
            if (b87.a(c90.a(), b87.FF_SHARED_NTP_IN_SDK, true)) {
                Pair<Long, Integer> pairI = com.oplus.drs.base.ntp.b.f().i();
                oTrackEventFromJson.event_time = ((Long) pairI.first).longValue();
                oTrackEventFromJson.event_time_type = ((Integer) pairI.second).intValue();
            }
            byte[] bytes = ("[" + oTrackEventFromJson.toJson() + "]").getBytes(StandardCharsets.UTF_8);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final ScheduledFuture[] scheduledFutureArr = {g.schedule(new Runnable() { // from class: com.oplus.aiunit.vision.c66
                @Override // java.lang.Runnable
                public final void run() {
                    e66.k(atomicBoolean, runnable);
                }
            }, 10000L, TimeUnit.MILLISECONDS)};
            final Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.b66
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.j(scheduledFutureArr, oTrackEvent, bf3Var);
                }
            };
            ku9.f().r(bytes, new b(atomicBoolean, scheduledFutureArr, oTrackEventFromJson, bf3Var, runnable));
        } catch (Exception e2) {
            TrackLogger.d("DRS_SDK_COMMON_DrsTrackImpl", "commitRealtimeData exception, fallback to batch", e2, new Object[0]);
            d(oTrackEvent, bf3Var);
        }
    }

    public final void f(OTrackEvent oTrackEvent) {
        if (oTrackEvent == null) {
            return;
        }
        try {
            String str = oTrackEvent.pkgName;
            if (str == null || str.isEmpty()) {
                oTrackEvent.pkgName = c90.a().getPackageName();
            }
            String str2 = oTrackEvent.duid;
            if (str2 == null || str2.isEmpty()) {
                oTrackEvent.duid = OpenIdUtils.k(c90.a());
            }
            String str3 = oTrackEvent.ouid;
            if (str3 == null || str3.isEmpty()) {
                oTrackEvent.ouid = OpenIdUtils.n(c90.a());
            }
            if (i(oTrackEvent.duid) || i(oTrackEvent.ouid)) {
                OpenIdUtils.h(c90.a());
                if (i(oTrackEvent.duid)) {
                    oTrackEvent.duid = OpenIdUtils.k(c90.a());
                }
                if (i(oTrackEvent.ouid)) {
                    oTrackEvent.ouid = OpenIdUtils.n(c90.a());
                }
            }
            z6b.r("DRS_SDK_COMMON_DrsTrackImpl", "fillFieldsForRuleCheck: appId=" + oTrackEvent.app_id + ", duid=" + oTrackEvent.duid + ", ouid=" + oTrackEvent.ouid);
        } catch (Throwable th) {
            TrackLogger.o("DRS_SDK_COMMON_DrsTrackImpl", "fillFieldsForRuleCheck failed: %s", th.getMessage());
        }
    }

    public void g() {
        this.d.S();
    }

    public void h(df3 df3Var) {
        synchronized (this) {
            if (this.f10802e) {
                TrackLogger.o("DRS_SDK_COMMON_DrsTrackImpl", "DrsSdk init done.", new Object[0]);
                return;
            }
            TrackLogger.h("DRS_SDK_COMMON_DrsTrackImpl", "start init DrsSdk, appId=%s", this.a);
            try {
                this.b = df3Var;
                this.f10801c = new lf3(c90.a(), this.a, new flk(), this.f, this.b);
                if (b87.a(c90.a(), b87.FF_SHARED_NTP_IN_SDK, true)) {
                    com.oplus.drs.base.ntp.b.f().i();
                }
                af3 appConfig = DrsSdkCore.getAppConfig();
                this.d = new tga(c90.a(), this.a, new flk(), this.f10801c, this.f, appConfig != null ? appConfig.f() : TrackType.OBUS);
                sjg.r().v(c90.a(), this.a);
                this.f10802e = true;
                TrackLogger.h("DRS_SDK_COMMON_DrsTrackImpl", "DrsSdk init success.", new Object[0]);
            } catch (Exception e2) {
                TrackLogger.d("DRS_SDK_COMMON_DrsTrackImpl", "DrsSdk inti failed", e2, new Object[0]);
            }
        }
    }
}
