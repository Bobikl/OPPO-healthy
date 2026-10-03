package com.oplus.aiunit.vision;

import android.os.SystemClock;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u001d\u0018\u0000 -2\u00020\u0001:\u0001\u000bBC\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010\"\u001a\u00020\b\u0012\b\b\u0002\u0010&\u001a\u00020\b\u0012\b\b\u0002\u0010*\u001a\u00020\b¢\u0006\u0004\b+\u0010,J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010&\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000e\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\"\u0010*\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u000e\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001e¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/p6i;", "", "", MapSchema.FIELD_NAME_ENTRY, "f", "", "c", "d", "", "speed", "bytesRead", "a", "bytesWritten", "b", "J", "downTimeBarrier", "upTimeBarrier", "", "D", "getUpLimit", "()D", "setUpLimit", "(D)V", "upLimit", "getDownLimit", "setDownLimit", "downLimit", "getUpSpeed", "()J", "setUpSpeed", "(J)V", "upSpeed", "getDownSpeed", "setDownSpeed", "downSpeed", b2n.f, "getMinUpSpeed", "setMinUpSpeed", "minUpSpeed", b2n.g, "getMinDownSpeed", "setMinDownSpeed", "minDownSpeed", "<init>", "(DDJJJJ)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class p6i {
    public static final long BLOCK = 8192;
    public static final long FACTOR = 1000000;
    public static final long MILLI = 1000000000;
    public static final long MIN_SPEED = 1024;

    @NotNull
    public static final String TAG = "SpeedManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public volatile long downTimeBarrier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile long upTimeBarrier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public volatile double upLimit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile double downLimit;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public volatile long upSpeed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public volatile long downSpeed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public volatile long minUpSpeed;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public volatile long minDownSpeed;

    public p6i(double d, double d2, long j2, long j3, long j4, long j5) {
        this.upLimit = d;
        this.downLimit = d2;
        this.upSpeed = j2;
        this.downSpeed = j3;
        this.minUpSpeed = j4;
        this.minDownSpeed = j5;
    }

    public final void a(long speed, long bytesRead) {
        if ((speed <= 0 || this.downLimit >= 1) && this.downSpeed <= 0) {
            return;
        }
        long j2 = this.downSpeed;
        long jMax = Math.max(speed, this.minDownSpeed);
        if (j2 <= 0) {
            j2 = jMax;
        }
        long j3 = (long) ((bytesRead * MILLI) / (j2 * (j2 > 0 ? 1.0d : this.downLimit)));
        synchronized (this) {
            this.downTimeBarrier += Math.max(j3, System.nanoTime() - this.downTimeBarrier);
            Unit unit = Unit.INSTANCE;
        }
        long j4 = this.downTimeBarrier;
        long jNanoTime = System.nanoTime();
        while (true) {
            long j5 = j4 - jNanoTime;
            if (j5 < MILLI) {
                return;
            }
            try {
                SystemClock.sleep(j5 / 1000000);
                j4 = this.downTimeBarrier;
                jNanoTime = System.nanoTime();
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    public final void b(long speed, long bytesWritten) {
        if ((speed <= 0 || this.upLimit >= 1.0d) && this.upSpeed <= 0) {
            return;
        }
        long j2 = this.upSpeed;
        long jMax = Math.max(speed, this.minUpSpeed);
        if (j2 <= 0) {
            j2 = jMax;
        }
        long j3 = (long) ((bytesWritten * MILLI) / (j2 * (j2 <= 0 ? this.upLimit : 1.0d)));
        synchronized (this) {
            this.upTimeBarrier += Math.max(j3, System.nanoTime() - this.upTimeBarrier);
            Unit unit = Unit.INSTANCE;
        }
        long j4 = this.upTimeBarrier;
        long jNanoTime = System.nanoTime();
        while (true) {
            long j5 = j4 - jNanoTime;
            if (j5 < MILLI) {
                return;
            }
            try {
                SystemClock.sleep(j5 / 1000000);
                j4 = this.upTimeBarrier;
                jNanoTime = System.nanoTime();
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    public final void c() {
        long j2 = this.downTimeBarrier;
        long jNanoTime = System.nanoTime();
        while (true) {
            long j3 = j2 - jNanoTime;
            if (j3 < MILLI) {
                return;
            }
            try {
                SystemClock.sleep(j3 / 1000000);
                j2 = this.downTimeBarrier;
                jNanoTime = System.nanoTime();
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    public final void d() {
        long j2 = this.upTimeBarrier;
        long jNanoTime = System.nanoTime();
        while (true) {
            long j3 = j2 - jNanoTime;
            if (j3 < MILLI) {
                return;
            }
            try {
                SystemClock.sleep(j3 / 1000000);
                j2 = this.upTimeBarrier;
                jNanoTime = System.nanoTime();
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    public final boolean e() {
        return ((double) 1) - this.downLimit > Double.MIN_VALUE || this.downSpeed > 0;
    }

    public final boolean f() {
        return ((double) 1) - this.upLimit > Double.MIN_VALUE || this.upSpeed > 0;
    }

    public /* synthetic */ p6i(double d, double d2, long j2, long j3, long j4, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0d : d, (i & 2) == 0 ? d2 : 1.0d, (i & 4) != 0 ? 0L : j2, (i & 8) == 0 ? j3 : 0L, (i & 16) != 0 ? 1024L : j4, (i & 32) == 0 ? j5 : 1024L);
    }
}
