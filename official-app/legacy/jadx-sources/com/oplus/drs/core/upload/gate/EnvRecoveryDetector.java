package com.oplus.drs.core.upload.gate;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.cee;
import com.oplus.aiunit.vision.toc;
import com.oplus.aiunit.vision.u56;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.base.util.Consumer;
import com.oplus.drs.core.upload.upload.ChannelType;
import java.util.EnumSet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class EnvRecoveryDetector {
    public final long a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19819c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f19820e;
    public State f;
    public final AtomicReference<c> g;
    public boolean h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ScheduledFuture<?> f19821j;

    @Nullable
    public volatile toc k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public volatile cee f19822l;

    @Nullable
    public volatile Consumer<d> m;

    public enum GateCheckProfile {
        FULL_CHECK,
        SKIP_BATTERY
    }

    public enum SignalType {
        NETWORK,
        RESTRICTION
    }

    public enum State {
        IDLE,
        WAITING_STABLE
    }

    public class a implements Runnable {
        public final /* synthetic */ toc i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ cee f19823j;
        public final /* synthetic */ Consumer k;

        public a(toc tocVar, cee ceeVar, Consumer consumer) {
            this.i = tocVar;
            this.f19823j = ceeVar;
            this.k = consumer;
        }

        @Override // java.lang.Runnable
        public void run() {
            EnvRecoveryDetector.this.g(this.i, this.f19823j, this.k);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SignalType.values().length];
            b = iArr;
            try {
                iArr[SignalType.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[SignalType.RESTRICTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[State.values().length];
            a = iArr2;
            try {
                iArr2[State.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[State.WAITING_STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class c {
        public final boolean a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19825c;
        public final long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f19826e;
        public final long f;

        public c(boolean z, boolean z2, boolean z3, long j2, long j3, long j4) {
            this.a = z;
            this.b = z2;
            this.f19825c = z3;
            this.d = j2;
            this.f19826e = j3;
            this.f = j4;
        }

        public c a(boolean z, long j2) {
            return new c(z, this.b, this.f19825c, j2, this.f19826e, this.f);
        }

        public c b(boolean z, boolean z2, long j2) {
            return new c(this.a, z, z2, this.d, j2, j2);
        }

        public String toString() {
            return "EnvSnapshot{net=" + this.a + ", normalOk=" + this.b + ", rtOk=" + this.f19825c + "}";
        }
    }

    public static final class d {
        public final EnumSet<GateCheckProfile> a;
        public final String b;

        public d(EnumSet<GateCheckProfile> enumSet, String str) {
            this.a = EnumSet.copyOf((EnumSet) enumSet);
            this.b = str;
        }

        @NonNull
        public EnumSet<ChannelType> a() {
            EnumSet<ChannelType> enumSetNoneOf = EnumSet.noneOf(ChannelType.class);
            if (this.a.contains(GateCheckProfile.SKIP_BATTERY)) {
                enumSetNoneOf.add(ChannelType.REALTIME);
            }
            if (this.a.contains(GateCheckProfile.FULL_CHECK)) {
                enumSetNoneOf.add(ChannelType.PSEUDO);
                enumSetNoneOf.add(ChannelType.NON_REALTIME);
            }
            return enumSetNoneOf;
        }
    }

    public EnvRecoveryDetector(long j2, long j3, boolean z) {
        this.f19820e = new Object();
        this.f = State.IDLE;
        this.h = false;
        this.i = false;
        this.f19821j = null;
        this.k = null;
        this.f19822l = null;
        this.m = null;
        this.a = Math.max(0L, j2);
        this.b = Math.min(Math.max(0L, j3), 2000L);
        this.f19819c = Math.max(0L, j3);
        this.d = z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.g = new AtomicReference<>(new c(false, false, false, jUptimeMillis, jUptimeMillis, jUptimeMillis));
    }

    public final void b() {
        ScheduledFuture<?> scheduledFuture = this.f19821j;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f19821j.cancel(false);
        }
        this.f19821j = null;
    }

    public final long c() {
        return this.d ? this.b : Math.min(this.b, this.a);
    }

    public final boolean d(@NonNull c cVar, boolean z, long j2) {
        boolean z2 = cVar.a && j2 - cVar.d >= (z ? this.b : this.f19819c);
        if (this.d) {
            return z2;
        }
        return z2 && (!z ? !(!cVar.b || ((j2 - cVar.f19826e) > this.a ? 1 : ((j2 - cVar.f19826e) == this.a ? 0 : -1)) < 0) : !(!cVar.f19825c || ((j2 - cVar.f) > this.a ? 1 : ((j2 - cVar.f) == this.a ? 0 : -1)) < 0));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public final long e(@NonNull c cVar, boolean z, long j2) {
        long jMax;
        long j3 = z ? this.b : this.f19819c;
        if (cVar.a) {
            long j4 = j3 - (j2 - cVar.d);
            if (j4 > 0) {
                jMax = Math.max(0L, j4);
            } else {
                jMax = 0;
            }
        } else {
            jMax = 0;
        }
        if (this.d) {
            return jMax;
        }
        if (z) {
            if (!cVar.f19825c) {
                return jMax;
            }
            long j5 = this.a - (j2 - cVar.f);
            return j5 > 0 ? Math.max(jMax, j5) : jMax;
        }
        if (!cVar.b) {
            return jMax;
        }
        long j6 = this.a - (j2 - cVar.f19826e);
        return j6 > 0 ? Math.max(jMax, j6) : jMax;
    }

    public void f(@NonNull toc tocVar, @NonNull cee ceeVar, @NonNull Consumer<d> consumer) {
        this.k = tocVar;
        this.f19822l = ceeVar;
        this.m = consumer;
        l();
        z6b.q("EnvRecoveryDetector", "configured with NetworkGate, PerformanceGate");
    }

    public final void g(@NonNull toc tocVar, @NonNull cee ceeVar, @NonNull Consumer<d> consumer) {
        d dVar;
        d dVar2;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this.f19820e) {
            k(tocVar, ceeVar, jUptimeMillis);
            c cVar = this.g.get();
            boolean z = false;
            boolean zD = d(cVar, false, jUptimeMillis);
            boolean zD2 = d(cVar, true, jUptimeMillis);
            long jE = e(cVar, false, jUptimeMillis);
            long jE2 = e(cVar, true, jUptimeMillis);
            EnumSet enumSetNoneOf = EnumSet.noneOf(GateCheckProfile.class);
            boolean z2 = zD && !this.h;
            if (zD2 && !this.i) {
                z = true;
            }
            z6b.k("EnvRecoveryDetector", "evaluate: normalStable=" + zD + ", rtStable=" + zD2 + ", lastNormal=" + this.h + ", lastRt=" + this.i);
            this.h = zD;
            this.i = zD2;
            if (z2 && jE <= 0) {
                enumSetNoneOf.add(GateCheckProfile.FULL_CHECK);
            }
            if (z && jE2 <= 0) {
                enumSetNoneOf.add(GateCheckProfile.SKIP_BATTERY);
            }
            if (enumSetNoneOf.isEmpty()) {
                dVar = null;
            } else {
                z6b.q("EnvRecoveryDetector", "evaluate: FIRE channels=" + enumSetNoneOf);
                dVar = new d(enumSetNoneOf, "stable");
            }
            dVar2 = dVar;
            long jH = h(jE, jE2);
            if (jH > 0) {
                this.f = State.WAITING_STABLE;
                m(jH, tocVar, ceeVar, consumer);
                z6b.k("EnvRecoveryDetector", "evaluate: reschedule after " + jH + "ms, rtWaitMs=" + jE2 + ", normalWaitMs=" + jE);
            } else {
                this.f = State.IDLE;
                z6b.k("EnvRecoveryDetector", "evaluate: no pending wait, back to IDLE");
            }
        }
        if (dVar2 != null) {
            try {
                consumer.accept(dVar2);
            } catch (Throwable th) {
                z6b.u("EnvRecoveryDetector", "callback error: " + th);
            }
        }
    }

    public final long h(long j2, long j3) {
        if (j2 <= 0) {
            return Math.max(0L, j3);
        }
        return j3 <= 0 ? Math.max(0L, j2) : Math.min(j2, j3);
    }

    public void i(@NonNull SignalType signalType) {
        toc tocVar = this.k;
        cee ceeVar = this.f19822l;
        Consumer<d> consumer = this.m;
        if (tocVar == null || ceeVar == null || consumer == null) {
            throw new IllegalStateException("EnvRecoveryDetector not configured. Call configure() first.");
        }
        j(signalType, tocVar, ceeVar, consumer);
    }

    public final void j(@NonNull SignalType signalType, @NonNull toc tocVar, @NonNull cee ceeVar, @NonNull Consumer<d> consumer) {
        if (signalType == SignalType.RESTRICTION && this.d) {
            z6b.k("EnvRecoveryDetector", "onSignal[RESTRICTION]: ignored in Standalone mode");
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this.f19820e) {
            o(signalType, tocVar, ceeVar, jUptimeMillis);
            int i = b.a[this.f.ordinal()];
            if (i == 1) {
                this.f = State.WAITING_STABLE;
                m(c(), tocVar, ceeVar, consumer);
                z6b.k("EnvRecoveryDetector", "onSignal[" + signalType + "]: IDLE -> WAITING_STABLE");
            } else if (i == 2) {
                z6b.k("EnvRecoveryDetector", "onSignal[" + signalType + "]: WAITING_STABLE, snapshot updated");
            }
        }
    }

    public final void k(@NonNull toc tocVar, @NonNull cee ceeVar, long j2) {
        c cVar = this.g.get();
        boolean zB = tocVar.b();
        boolean zD = ceeVar.b(false).d();
        boolean zD2 = ceeVar.b(true).d();
        boolean z = cVar.a;
        if ((zB == z && zD == cVar.b && zD2 == cVar.f19825c) ? false : true) {
            long j3 = cVar.d;
            long j4 = cVar.f19826e;
            if (zB != z) {
                j3 = j2;
            }
            long j5 = (zD == cVar.b && zD2 == cVar.f19825c) ? j4 : j2;
            this.g.set(new c(zB, zD, zD2, j3, j5, j5));
        }
    }

    public void l() {
        toc tocVar = this.k;
        cee ceeVar = this.f19822l;
        if (tocVar == null || ceeVar == null) {
            z6b.u("EnvRecoveryDetector", "reset: gates not configured");
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean zB = tocVar.b();
        boolean zD = ceeVar.b(false).d();
        boolean zD2 = ceeVar.b(true).d();
        this.g.set(new c(zB, zD, zD2, jUptimeMillis, jUptimeMillis, jUptimeMillis));
        boolean z = zB && zD;
        boolean z2 = zB && zD2;
        synchronized (this.f19820e) {
            this.f = State.IDLE;
            this.h = z;
            this.i = z2;
            b();
        }
        z6b.q("EnvRecoveryDetector", "reset: net=" + zB + ", restrictNormal=" + zD + ", restrictRt=" + zD2 + ", initialNormalOk=" + z + ", initialRtOk=" + z2);
    }

    public final void m(long j2, @NonNull toc tocVar, @NonNull cee ceeVar, @NonNull Consumer<d> consumer) {
        b();
        this.f19821j = u56.o().schedule(new a(tocVar, ceeVar, consumer), Math.max(0L, j2), TimeUnit.MILLISECONDS);
    }

    @NonNull
    public String n() {
        String str;
        synchronized (this.f19820e) {
            str = "EnvRecoveryDetector{standalone=" + this.d + ", state=" + this.f + ", snapshot=" + this.g.get() + ", lastNormalOk=" + this.h + ", lastRtOk=" + this.i + "}";
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007e  */
    public final void o(@NonNull SignalType signalType, @NonNull toc tocVar, @NonNull cee ceeVar, long j2) {
        c cVarA;
        c cVar = this.g.get();
        int i = b.b[signalType.ordinal()];
        if (i == 1) {
            boolean zB = tocVar.b();
            if (zB != cVar.a) {
                z6b.k("EnvRecoveryDetector", "updateSnapshot: NET " + cVar.a + " -> " + zB);
                cVarA = cVar.a(zB, j2);
            } else {
                cVarA = null;
            }
        } else if (i != 2) {
            cVarA = null;
        } else {
            boolean zD = ceeVar.b(false).d();
            boolean zD2 = ceeVar.b(true).d();
            if (zD == cVar.b && zD2 == cVar.f19825c) {
                cVarA = null;
            } else {
                z6b.k("EnvRecoveryDetector", "updateSnapshot: RESTRICT normal=" + zD + ", rt=" + zD2);
                cVarA = cVar.b(zD, zD2, j2);
            }
        }
        if (cVarA != null) {
            this.g.set(cVarA);
        }
    }

    public EnvRecoveryDetector(boolean z) {
        this(3000L, 5000L, z);
    }
}
