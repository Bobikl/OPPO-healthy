package com.oplus.aiunit.vision;

import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import io.protostuff.MapSchema;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b)\u0010*J\u001f\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%¨\u0006+"}, d2 = {"Lcom/oplus/aiunit/vision/f7e;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "stageOneTime", "stageTwoTime", "c", "(JJ)Ljava/lang/Object;", "Ljava/util/concurrent/Callable;", "a", "Ljava/util/concurrent/Callable;", "getFirst", "()Ljava/util/concurrent/Callable;", "first", "b", "getSecond", "second", "", "Ljava/lang/String;", "TAG", "d", "Ljava/lang/Object;", "mResult", MapSchema.FIELD_NAME_ENTRY, "from", "Ljava/util/concurrent/CountDownLatch;", "f", "Ljava/util/concurrent/CountDownLatch;", "firstWarn", b2n.f, "doneLock", "Ljava/util/concurrent/atomic/AtomicInteger;", b2n.g, "Ljava/util/concurrent/atomic/AtomicInteger;", "atomicCount", "Lcom/oplus/aiunit/vision/qv8;", "i", "Lcom/oplus/aiunit/vision/qv8;", "firstThread", "j", "secondThread", "<init>", "(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Callable;)V", "lib_apiprovider_release"}, k = 1, mv = {1, 8, 0})
public final class f7e<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Callable<T> first;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Callable<T> second;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public volatile T mResult;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile String from;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final CountDownLatch firstWarn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final CountDownLatch doneLock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger atomicCount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final qv8 firstThread;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qv8 secondThread;

    public f7e(@NotNull Callable<T> first, @NotNull Callable<T> second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.first = first;
        this.second = second;
        this.TAG = "ParallelGetter";
        this.firstWarn = new CountDownLatch(1);
        this.doneLock = new CountDownLatch(1);
        this.atomicCount = new AtomicInteger(2);
        this.firstThread = new qv8(new Runnable() { // from class: com.oplus.aiunit.vision.d7e
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                f7e.d(this.i);
            }
        });
        this.secondThread = new qv8(new Runnable() { // from class: com.oplus.aiunit.vision.e7e
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                f7e.e(this.i);
            }
        });
    }

    public static final void d(f7e this$0) throws Exception {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long jUptimeMillis = SystemClock.uptimeMillis();
        T tCall = this$0.first.call();
        this$0.mResult = tCall;
        this$0.firstWarn.countDown();
        int iDecrementAndGet = this$0.atomicCount.decrementAndGet();
        a7b.f(this$0.TAG, "first delay=" + (SystemClock.uptimeMillis() - jUptimeMillis) + " success=" + (tCall != null));
        if (tCall != null || iDecrementAndGet == 1) {
            this$0.from = "first";
            this$0.doneLock.countDown();
        }
    }

    public static final void e(f7e this$0) throws Exception {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long jUptimeMillis = SystemClock.uptimeMillis();
        T tCall = this$0.second.call();
        this$0.mResult = tCall;
        int iDecrementAndGet = this$0.atomicCount.decrementAndGet();
        a7b.f(this$0.TAG, "second delay=" + (SystemClock.uptimeMillis() - jUptimeMillis) + " success=" + (tCall != null));
        if (tCall != null || iDecrementAndGet == 1) {
            this$0.from = "second";
            this$0.doneLock.countDown();
        }
    }

    @Nullable
    public final T c(long stageOneTime, long stageTwoTime) {
        String str;
        long jUptimeMillis;
        String str2;
        StringBuilder sb;
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        this.firstThread.start();
        try {
            this.firstWarn.await(stageOneTime, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            a7b.f(this.TAG, "firstStage with " + stageOneTime + " ex " + e2);
        }
        if (this.mResult != null) {
            a7b.f(this.TAG, "call finish0 delay=" + (SystemClock.uptimeMillis() - jUptimeMillis2) + " from=" + this.from);
            return this.mResult;
        }
        this.secondThread.start();
        try {
            try {
                this.doneLock.await(stageTwoTime, TimeUnit.MILLISECONDS);
                str = this.TAG;
                jUptimeMillis = SystemClock.uptimeMillis() - jUptimeMillis2;
                str2 = this.from;
                sb = new StringBuilder();
            } catch (Exception e3) {
                a7b.f(this.TAG, "secondStage with " + stageTwoTime + " ex " + e3);
                str = this.TAG;
                jUptimeMillis = SystemClock.uptimeMillis() - jUptimeMillis2;
                str2 = this.from;
                sb = new StringBuilder();
            }
            sb.append("call finish delay=");
            sb.append(jUptimeMillis);
            sb.append(" from=");
            sb.append(str2);
            a7b.f(str, sb.toString());
            return this.mResult;
        } catch (Throwable th) {
            a7b.f(this.TAG, "call finish delay=" + (SystemClock.uptimeMillis() - jUptimeMillis2) + " from=" + this.from);
            throw th;
        }
    }
}
