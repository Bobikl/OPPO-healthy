package com.oplus.aiunit.vision;

import com.lifesense.weidong.lzsimplenetlibs.net.invoker.HttpStatus;
import io.protostuff.MapSchema;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/h6i;", "", "", "fps", "", "c", "", "presentationTimeUsec", "a", "b", "J", "ONE_MILLION", "prevPresentUsec", "prevMonoUsec", "d", "fixedFrameDurationUsec", "", MapSchema.FIELD_NAME_ENTRY, "Z", "loopReset", "<init>", "()V", "Companion", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final class h6i {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long prevPresentUsec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long prevMonoUsec;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long fixedFrameDurationUsec;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long ONE_MILLION = 1000000;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean loopReset = true;

    public final void a(long presentationTimeUsec) {
        long j2 = this.prevMonoUsec;
        long j3 = 0;
        if (j2 == 0) {
            this.prevMonoUsec = System.nanoTime() / ((long) 1000);
            this.prevPresentUsec = presentationTimeUsec;
            return;
        }
        if (this.loopReset) {
            this.prevPresentUsec = presentationTimeUsec - (this.ONE_MILLION / ((long) 30));
            this.loopReset = false;
        }
        long j4 = this.fixedFrameDurationUsec;
        if (j4 == 0) {
            j4 = presentationTimeUsec - this.prevPresentUsec;
        }
        if (j4 >= 0) {
            long j5 = this.ONE_MILLION;
            j3 = j4 > ((long) 10) * j5 ? j5 * ((long) 5) : j4;
        }
        long j6 = j2 + j3;
        long jNanoTime = System.nanoTime();
        long j7 = 1000;
        while (true) {
            long j8 = jNanoTime / j7;
            if (j8 >= j6 - ((long) 100)) {
                this.prevMonoUsec += j3;
                this.prevPresentUsec += j3;
                return;
            }
            long j9 = j6 - j8;
            if (j9 > HttpStatus.USER_CANCEL) {
                j9 = 500000;
            }
            try {
                Thread.sleep(j9 / j7, ((int) (j9 % j7)) * 1000);
            } catch (InterruptedException e2) {
                q0.INSTANCE.c("AnimPlayer.SpeedControlUtil", "e=" + e2, e2);
            }
            jNanoTime = System.nanoTime();
        }
    }

    public final void b() {
        this.prevPresentUsec = 0L;
        this.prevMonoUsec = 0L;
    }

    public final void c(int fps) {
        if (fps <= 0) {
            return;
        }
        this.fixedFrameDurationUsec = this.ONE_MILLION / ((long) fps);
    }
}
