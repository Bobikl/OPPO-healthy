package com.oplus.drs.core.schduler;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.ja3;
import com.oplus.aiunit.vision.nlk;
import com.oplus.aiunit.vision.ou3;
import com.oplus.aiunit.vision.t56;
import com.oplus.aiunit.vision.u56;
import com.oplus.aiunit.vision.vq7;
import com.oplus.aiunit.vision.w56;
import com.oplus.aiunit.vision.weg;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.base.ChannelMode;
import com.oplus.drs.base.util.Consumer;
import com.oplus.drs.base.util.Supplier;
import com.oplus.drs.base.util.ToLongFunction;
import com.oplus.drs.core.upload.upload.UploadPipelineV2;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.weatherservicesdk.data.Weather;
import com.oppo.obus.common.configmetadata.core.entity.common.MinCommonConfig;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class UploadJobScheduler {
    public static final Random a = new Random();
    public static final nlk b = new vq7();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nlk f19791c = new ja3();
    public static final h d = new h("PSEUDO", new a(), new b(), new c(), BackendStrategy.FIXED_THREAD, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f19792e = new h("NON_REALTIME", new d(), new e(), new f(), BackendStrategy.THRESHOLD, new g(285639111, UploadJobService.class));

    public enum Backend {
        NONE,
        THREAD,
        JOB
    }

    public enum BackendStrategy {
        FIXED_THREAD,
        FIXED_JOB,
        THRESHOLD
    }

    public class a implements ToLongFunction<Context> {
        @Override // com.oplus.drs.base.util.ToLongFunction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public long applyAsLong(Context context) {
            return UploadJobScheduler.s(context);
        }
    }

    public class b implements Consumer<Context> {
        @Override // com.oplus.drs.base.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Context context) {
            UploadPipelineV2.getInstance(context).triggerPseudo();
        }
    }

    public class c implements Supplier<nlk> {
        @Override // com.oplus.drs.base.util.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public nlk get() {
            return UploadJobScheduler.r();
        }
    }

    public class d implements ToLongFunction<Context> {
        @Override // com.oplus.drs.base.util.ToLongFunction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public long applyAsLong(Context context) {
            return UploadJobScheduler.q(context, w56.a());
        }
    }

    public class e implements Consumer<Context> {
        @Override // com.oplus.drs.base.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Context context) {
            UploadPipelineV2.getInstance(context).triggerNr();
        }
    }

    public class f implements Supplier<nlk> {
        @Override // com.oplus.drs.base.util.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public nlk get() {
            return UploadJobScheduler.r();
        }
    }

    public static final class g {
        public final int a;
        public final Class<?> b;

        public g(int i, Class<?> cls) {
            this.a = i;
            this.b = cls;
        }
    }

    public static final class h {
        public final String a;
        public final ToLongFunction<Context> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Consumer<Context> f19793c;
        public final Supplier<nlk> d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final BackendStrategy f19794e;
        public final g f;
        public final AtomicBoolean g = new AtomicBoolean(false);
        public final AtomicLong h = new AtomicLong(0);
        public final AtomicReference<ScheduledFuture<?>> i = new AtomicReference<>();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile Backend f19795j = Backend.NONE;
        public volatile long k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile long f19796l = -1;

        public class a implements Runnable {
            public final /* synthetic */ long i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Context f19797j;

            public a(long j2, Context context) {
                this.i = j2;
                this.f19797j = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                Backend backend = h.this.f19795j;
                Backend backend2 = Backend.THREAD;
                if (backend == backend2 && this.i == h.this.h.get()) {
                    long jU = h.this.u(this.f19797j);
                    long jM = h.this.m(this.f19797j, jU);
                    z6b.q("UploadJobScheduler", h.this.a + " triggered, next=" + h.this.o(jM) + ", base=" + h.this.o(jU) + ", " + h.this.p() + ", policy=" + UploadJobScheduler.l() + h.this.h(jU, jM));
                    h.this.v(this.f19797j, "thread");
                    if (h.this.f19795j == backend2 && this.i == h.this.h.get()) {
                        h.this.x(this.f19797j, jM, ParserTag.LOOP);
                    }
                }
            }
        }

        public h(String str, ToLongFunction<Context> toLongFunction, Consumer<Context> consumer, Supplier<nlk> supplier, BackendStrategy backendStrategy, g gVar) {
            this.a = str;
            this.b = toLongFunction;
            this.f19793c = consumer;
            this.d = supplier;
            this.f19794e = backendStrategy;
            this.f = gVar;
        }

        public final void A(Context context, String str) {
            long jU = u(context);
            if (this.k < 0) {
                this.k = UploadJobScheduler.o(jU);
            }
            x(context, this.k, str);
        }

        public final void B(Context context, Backend backend, String str) {
            if (backend == this.f19795j) {
                if (backend == Backend.THREAD) {
                    t(context, str);
                    return;
                } else {
                    if (backend == Backend.JOB) {
                        s(context, str);
                        return;
                    }
                    return;
                }
            }
            this.h.incrementAndGet();
            Backend backend2 = this.f19795j;
            Backend backend3 = Backend.THREAD;
            if (backend2 == backend3) {
                j("switch");
            } else if (this.f19795j == Backend.JOB) {
                i(context);
            }
            this.f19795j = backend;
            z6b.q("UploadJobScheduler", this.a + " backend switched to " + backend + " (" + str + ")");
            if (backend == backend3) {
                A(context, str);
            } else if (backend == Backend.JOB) {
                z(context, str);
            }
        }

        public final String h(long j2, long j3) {
            if (j2 <= 0) {
                return "";
            }
            double d = j3 / j2;
            return (d < 0.95d || d > 1.05d) ? String.format(", scale=%.2fx", Double.valueOf(d)) : "";
        }

        public final void i(Context context) {
            if (this.f == null || context == null) {
                return;
            }
            try {
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                if (jobScheduler != null) {
                    jobScheduler.cancel(this.f.a);
                }
            } catch (Throwable unused) {
            }
        }

        public final void j(String str) {
            ScheduledFuture<?> andSet = this.i.getAndSet(null);
            if (andSet != null && !andSet.isDone()) {
                andSet.cancel(false);
            }
            if (this.g.get()) {
                z6b.q("UploadJobScheduler", this.a + " thread cancelled, reason=" + str);
            }
        }

        public final Backend k(Context context) {
            BackendStrategy backendStrategy = this.f19794e;
            if (backendStrategy == BackendStrategy.FIXED_THREAD) {
                return Backend.THREAD;
            }
            if (backendStrategy != BackendStrategy.FIXED_JOB && u(context) < 3600000) {
                return Backend.THREAD;
            }
            return Backend.JOB;
        }

        public final long l(Context context, long j2) {
            return UploadJobScheduler.i(this.k >= 0 ? this.k : 0L, j2, this.d.get().a(context, j2));
        }

        public final long m(Context context, long j2) {
            return Math.max(nlk.MIN_DELAY_MS, this.d.get().a(context, j2));
        }

        public String n() {
            Context contextB = w56.b();
            Context applicationContext = contextB != null ? contextB.getApplicationContext() : null;
            long jU = applicationContext != null ? u(applicationContext) : 0L;
            StringBuilder sb = new StringBuilder();
            sb.append("PeriodicTask{name=");
            sb.append(this.a);
            sb.append(", strategy=");
            sb.append(this.f19794e);
            sb.append(", active=");
            sb.append(this.f19795j);
            sb.append(", base=");
            sb.append(jU > 0 ? weg.a(jU) : "N/A");
            sb.append(", firstDelayStable=");
            sb.append(this.k >= 0 ? weg.a(this.k) : "N/A");
            sb.append(", lastDelay=");
            sb.append(this.f19796l >= 0 ? weg.a(this.f19796l) : "N/A");
            sb.append(", policy=");
            sb.append(this.d.get().getClass().getSimpleName());
            sb.append("}");
            return sb.toString();
        }

        public final String o(long j2) {
            StringBuilder sb;
            StringBuilder sb2;
            if (j2 < 60000) {
                return (j2 / 1000) + "s";
            }
            if (j2 < 3600000) {
                long j3 = j2 / 60000;
                long j4 = (j2 % 60000) / 1000;
                if (j4 > 0) {
                    sb2 = new StringBuilder();
                    sb2.append(j3);
                    sb2.append(LogFieldKey.MESSAGE_KEY);
                    sb2.append(j4);
                    sb2.append("s");
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(j3);
                    sb2.append(LogFieldKey.MESSAGE_KEY);
                }
                return sb2.toString();
            }
            long j5 = j2 / 3600000;
            long j6 = (j2 % 3600000) / 60000;
            if (j6 > 0) {
                sb = new StringBuilder();
                sb.append(j5);
                sb.append(b2n.g);
                sb.append(j6);
                sb.append(LogFieldKey.MESSAGE_KEY);
            } else {
                sb = new StringBuilder();
                sb.append(j5);
                sb.append(b2n.g);
            }
            return sb.toString();
        }

        public final String p() {
            if ("PSEUDO".equals(this.a)) {
                return UploadJobScheduler.m();
            }
            return "NON_REALTIME".equals(this.a) ? UploadJobScheduler.k(w56.a()) : "unkown";
        }

        public void q(Context context) {
            if (this.f19795j != Backend.JOB) {
                z6b.u("UploadJobScheduler", this.a + " onJobTriggered ignored, active=" + this.f19795j);
                return;
            }
            long jU = u(context);
            long jL = l(context, jU);
            z6b.q("UploadJobScheduler", this.a + " triggered, next=" + o(jL) + ", base=" + o(jU) + ", " + p() + ", policy=" + UploadJobScheduler.l() + h(jU, jL));
            v(context, "job");
            w(context, jL, ParserTag.LOOP);
        }

        public void r(Context context) {
            if (context == null) {
                return;
            }
            if (this.g.get()) {
                B(context, k(context), "reschedule");
            } else {
                y(context);
            }
        }

        public final void s(Context context, String str) {
            if (this.f == null) {
                return;
            }
            long jU = u(context);
            if (this.k < 0) {
                this.k = UploadJobScheduler.o(jU);
            }
            w(context, l(context, jU), str);
        }

        public final void t(Context context, String str) {
            this.h.incrementAndGet();
            j("reschedule");
            long jU = u(context);
            if (this.k < 0) {
                this.k = UploadJobScheduler.o(jU);
            }
            x(context, m(context, jU), str);
        }

        public final long u(Context context) {
            long jApplyAsLong;
            try {
                jApplyAsLong = this.b.applyAsLong(context);
            } catch (Throwable unused) {
                jApplyAsLong = 0;
            }
            return Math.max(nlk.MIN_DELAY_MS, jApplyAsLong);
        }

        public final void v(Context context, String str) {
            try {
                this.f19793c.accept(context);
            } catch (Throwable th) {
                z6b.p("UploadJobScheduler", this.a + " " + str + " trigger error", th);
            }
        }

        public final void w(Context context, long j2, String str) {
            if (this.f == null || context == null) {
                return;
            }
            try {
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                if (jobScheduler == null) {
                    z6b.u("UploadJobScheduler", this.a + " scheduleJob: JobScheduler is null");
                    return;
                }
                ComponentName componentName = new ComponentName(context, this.f.b);
                long jMax = Math.max(0L, j2);
                long jU = u(context);
                JobInfo.Builder minimumLatency = new JobInfo.Builder(this.f.a, componentName).setRequiredNetworkType(1).setMinimumLatency(jMax);
                jobScheduler.cancel(this.f.a);
                int iSchedule = jobScheduler.schedule(minimumLatency.build());
                if (!"startup".equals(str)) {
                    z6b.q("UploadJobScheduler", this.a + " scheduleJob, reason=" + str + ", delay=" + o(jMax) + ", result=" + iSchedule);
                    return;
                }
                z6b.q("UploadJobScheduler", this.a + " first trigger in " + o(jMax) + " (random spread), base=" + o(jU) + ", " + p() + ", policy=" + UploadJobScheduler.l() + ", result=" + iSchedule);
            } catch (Throwable th) {
                z6b.p("UploadJobScheduler", this.a + " scheduleJob error", th);
            }
        }

        public final void x(Context context, long j2, String str) {
            if (this.f19795j != Backend.THREAD) {
                return;
            }
            long j3 = this.h.get();
            long jU = u(context);
            this.f19796l = j2;
            ScheduledFuture<?> andSet = this.i.getAndSet(u56.o().schedule(new a(j3, context), Math.max(0L, j2), TimeUnit.MILLISECONDS));
            if (andSet != null && !andSet.isDone()) {
                andSet.cancel(false);
            }
            if (!"startup".equals(str)) {
                z6b.q("UploadJobScheduler", this.a + " thread scheduled, reason=" + str + ", delay=" + o(j2));
                return;
            }
            z6b.q("UploadJobScheduler", this.a + " first trigger in " + o(j2) + " (random spread), base=" + o(jU) + ", " + p() + ", policy=" + UploadJobScheduler.l());
        }

        public void y(Context context) {
            if (context != null && this.g.compareAndSet(false, true)) {
                B(context, k(context), "startup");
            }
        }

        public final void z(Context context, String str) {
            if (this.f == null) {
                z6b.u("UploadJobScheduler", this.a + " startJob ignored: jobConfig=null");
                return;
            }
            long jU = u(context);
            if (this.k < 0) {
                this.k = UploadJobScheduler.o(jU);
            }
            w(context, this.k, str);
        }
    }

    public static long i(long j2, long j3, long j4) {
        if (j3 <= 0) {
            j3 = 7200000;
        }
        long jMax = Math.max(0L, j4);
        long jMin = Math.min(600000L, Math.max(10000L, j3 / 10)) / 1000;
        long jAbs = jMax - ((jMin > 0 ? (Math.abs(j2) / 1000) % (jMin + 1) : 0L) * 1000);
        if (jAbs < nlk.MIN_DELAY_MS) {
            jAbs = 180000;
        }
        return jAbs > jMax ? jMax : jAbs;
    }

    public static String j() {
        return "UploadJobScheduler Status:\n  mode: " + w56.a() + Weather.SEPARATOR + "  policy: " + r().getClass().getSimpleName() + Weather.SEPARATOR + "  tasks:\n    - " + d.n() + Weather.SEPARATOR + "    - " + f19792e.n() + Weather.SEPARATOR;
    }

    public static String k(ChannelMode channelMode) {
        MinCommonConfig minCommonConfigU = u();
        if (minCommonConfigU != null) {
            if (channelMode == ChannelMode.DRS) {
                int iIntValue = minCommonConfigU.getDrsUploadPeriodMinutes().intValue();
                if (iIntValue > 0) {
                    return "config:" + iIntValue + "min(DRS)";
                }
            } else {
                int iIntValue2 = minCommonConfigU.getDefaultObusUploadPeriodMinutes().intValue();
                if (iIntValue2 > 0) {
                    return "config:" + iIntValue2 + "min(OBUS)";
                }
            }
        }
        return channelMode == ChannelMode.DRS ? "default:120min(DRS)" : "default:15min(OBUS)";
    }

    public static String l() {
        if (!alf.e()) {
            return "FixedInterval";
        }
        return "ChinaTimeWindow(" + ja3.c() + ")";
    }

    public static String m() {
        int iIntValue;
        MinCommonConfig minCommonConfigU = u();
        if (minCommonConfigU == null || (iIntValue = minCommonConfigU.getPseudoPeriodMinutes().intValue()) <= 0) {
            return "default:5min";
        }
        return "config:" + iIntValue + "min";
    }

    public static void n(Context context, int i) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (i == 285639111) {
            f19792e.q(applicationContext);
            return;
        }
        z6b.u("UploadJobScheduler", "onJobTriggered: UNKNOWN jobId=" + i);
    }

    public static long o(long j2) {
        long jMax = (long) (Math.max(0L, j2) * 0.5d);
        if (jMax > 0) {
            return (long) (a.nextDouble() * jMax);
        }
        return 0L;
    }

    public static void p(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        d.r(applicationContext);
        f19792e.r(applicationContext);
    }

    public static long q(Context context, ChannelMode channelMode) {
        int iIntValue;
        MinCommonConfig minCommonConfigU = u();
        if (minCommonConfigU == null || (channelMode != ChannelMode.DRS ? (iIntValue = minCommonConfigU.getDefaultObusUploadPeriodMinutes().intValue()) <= 0 : (iIntValue = minCommonConfigU.getDrsUploadPeriodMinutes().intValue()) <= 0)) {
            return channelMode == ChannelMode.DRS ? 7200000L : 900000L;
        }
        return ((long) iIntValue) * 60000;
    }

    public static nlk r() {
        return alf.e() ? f19791c : b;
    }

    public static long s(Context context) {
        int iIntValue;
        MinCommonConfig minCommonConfigU = u();
        if (minCommonConfigU == null || (iIntValue = minCommonConfigU.getPseudoPeriodMinutes().intValue()) <= 0) {
            return 300000L;
        }
        return ((long) iIntValue) * 60000;
    }

    public static void t(Context context) {
        if (context == null) {
            return;
        }
        z6b.q("UploadJobScheduler", "UploadJobScheduler.start() called, channelMode=" + w56.a() + ", threshold=" + weg.a(3600000L));
        UploadPipelineV2.getInstance(context);
        Context applicationContext = context.getApplicationContext();
        d.y(applicationContext);
        f19792e.y(applicationContext);
    }

    public static MinCommonConfig u() {
        ou3 ou3Var = t56.configService;
        if (ou3Var != null) {
            return ou3Var.j();
        }
        return null;
    }
}
