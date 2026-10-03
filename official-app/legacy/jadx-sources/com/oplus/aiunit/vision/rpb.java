package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.heartrate.measure.entity.HeartMeasureResult;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b*\u0001*\u0018\u0000 02\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010%\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/oplus/aiunit/vision/rpb;", "Lcom/oplus/aiunit/vision/sq9;", "Landroid/content/Context;", "context", "", "init", "b", MapSchema.FIELD_NAME_ENTRY, "a", "Lcom/oplus/aiunit/vision/tq9;", "listener", "d", "c", "q", "r", LogFieldKey.MESSAGE_KEY, "n", "", "last", "o", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/qq9;", "Lcom/oplus/aiunit/vision/qq9;", "iHeartMeasure", "Ljava/util/Timer;", "Ljava/util/Timer;", "mTimer", "Ljava/util/TimerTask;", "Ljava/util/TimerTask;", "mTimerTask", "Lcom/oplus/aiunit/vision/tq9;", "mListener", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mScheduleTimer", "f", "mReady", "Ljava/util/concurrent/atomic/AtomicInteger;", b2n.f, "Ljava/util/concurrent/atomic/AtomicInteger;", "mExecTime", "com/oplus/aiunit/vision/rpb$c", b2n.g, "Lcom/oplus/aiunit/vision/rpb$c;", "mMeasureWrapper", "<init>", "(Lcom/oplus/aiunit/vision/qq9;)V", "Companion", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class rpb implements sq9 {

    @NotNull
    public static final String TAG = "MeasureExecuteManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final qq9 iHeartMeasure;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Timer mTimer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TimerTask mTimerTask;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public tq9 mListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean mScheduleTimer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean mReady;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger mExecTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final c mMeasureWrapper;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/oplus/aiunit/vision/rpb$b", "Ljava/util/TimerTask;", "", "run", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            rpb.this.mExecTime.addAndGet(1);
            d6b.INSTANCE.a(rpb.TAG, "execute " + rpb.this.mExecTime + " s");
            if (rpb.this.mExecTime.get() == 11) {
                rpb.p(rpb.this, 0, 1, null);
            } else if (rpb.this.mExecTime.get() >= 26) {
                rpb.this.n();
                rpb.this.r();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/oplus/aiunit/vision/rpb$c", "Lcom/oplus/aiunit/vision/rq9;", "Lcom/heytap/health/heartrate/measure/entity/HeartMeasureResult;", "output", "", "G", "H", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements rq9 {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.rq9
        public void G(@NotNull HeartMeasureResult output) {
            Intrinsics.checkNotNullParameter(output, "output");
            tq9 tq9Var = rpb.this.mListener;
            if (tq9Var != null) {
                tq9Var.G(output);
            }
        }

        @Override // com.oplus.aiunit.vision.rq9
        public void H(@NotNull HeartMeasureResult output) {
            Intrinsics.checkNotNullParameter(output, "output");
            d6b.INSTANCE.a(rpb.TAG, "onMeasure : " + output);
            rpb.this.l();
            if (output.getWarnStatus() == 2 || output.getWarnStatus() == 3 || output.getWarnStatus() == 4) {
                rpb.this.n();
                rpb.this.q();
                return;
            }
            int i = 26 - rpb.this.mExecTime.get();
            if (i < 0) {
                i = 0;
            }
            tq9 tq9Var = rpb.this.mListener;
            if (tq9Var != null) {
                tq9Var.Y3(output, i);
            }
        }
    }

    public rpb(@NotNull qq9 iHeartMeasure) {
        Intrinsics.checkNotNullParameter(iHeartMeasure, "iHeartMeasure");
        this.iHeartMeasure = iHeartMeasure;
        this.mScheduleTimer = new AtomicBoolean(false);
        this.mReady = new AtomicBoolean(false);
        this.mExecTime = new AtomicInteger();
        this.mMeasureWrapper = new c();
    }

    public static /* synthetic */ void p(rpb rpbVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 15;
        }
        rpbVar.o(i);
    }

    @Override // com.oplus.aiunit.vision.sq9
    public void a() {
        this.iHeartMeasure.a();
        k();
    }

    @Override // com.oplus.aiunit.vision.sq9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m();
        this.iHeartMeasure.b(context);
    }

    @Override // com.oplus.aiunit.vision.sq9
    public void c(@NotNull tq9 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = null;
    }

    @Override // com.oplus.aiunit.vision.sq9
    public void d(@NotNull tq9 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    @Override // com.oplus.aiunit.vision.sq9
    public void e() {
        n();
        r();
        d6b.INSTANCE.a(TAG, "endMeasure");
    }

    @Override // com.oplus.aiunit.vision.sq9
    public void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r();
        m();
        this.iHeartMeasure.init(context);
        this.iHeartMeasure.d(this.mMeasureWrapper);
    }

    public final void k() {
        Timer timer;
        if (!this.mScheduleTimer.compareAndSet(false, true) || (timer = this.mTimer) == null) {
            return;
        }
        timer.schedule(this.mTimerTask, 0L, 1000L);
    }

    public final void l() {
        tq9 tq9Var;
        if (!this.mReady.compareAndSet(false, true) || (tq9Var = this.mListener) == null) {
            return;
        }
        tq9Var.Z();
    }

    public final void m() {
        if (this.mTimer == null && this.mTimerTask == null) {
            this.mTimer = new Timer();
            this.mTimerTask = new b();
        }
    }

    public final void n() {
        tq9 tq9Var;
        HeartMeasureResult heartMeasureResultC = this.iHeartMeasure.c();
        if (heartMeasureResultC != null && (tq9Var = this.mListener) != null) {
            tq9Var.q2(heartMeasureResultC);
        }
        lz.INSTANCE.a();
        d6b.INSTANCE.a(TAG, "onEnd : " + heartMeasureResultC);
    }

    public final void o(int last) {
        d6b.INSTANCE.a(TAG, "onNotifyLast " + last + " s");
        tq9 tq9Var = this.mListener;
        if (tq9Var != null) {
            tq9Var.A5(last);
        }
    }

    public void q() {
        d6b.INSTANCE.a(TAG, "release");
        this.mListener = null;
        r();
        this.iHeartMeasure.e(this.mMeasureWrapper);
        this.iHeartMeasure.release();
        lz.INSTANCE.a();
    }

    public final void r() {
        d6b.INSTANCE.a(TAG, "resetTimer");
        Timer timer = this.mTimer;
        if (timer != null) {
            timer.cancel();
        }
        TimerTask timerTask = this.mTimerTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.mExecTime.set(0);
        this.mScheduleTimer.set(false);
        this.mReady.set(false);
        this.mTimerTask = null;
        this.mTimer = null;
    }
}
