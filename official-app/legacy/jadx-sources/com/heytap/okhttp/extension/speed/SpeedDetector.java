package com.heytap.okhttp.extension.speed;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.o6i;
import com.oplus.aiunit.vision.p6i;
import io.protostuff.MapSchema;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u0001\u000bB!\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010-\u001a\u00020*¢\u0006\u0004\b0\u00101J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R#\u0010\"\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\fR\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00063"}, d2 = {"Lcom/heytap/okhttp/extension/speed/SpeedDetector;", "", "", "s", "", "bytes", "", "q", "r", "n", LogFieldKey.PROCESS_NAME_KEY, "a", "J", "fullDownSpeed", "b", "fullUpSpeed", "c", "detectAvgDownSpeed", "d", "detectAvgUoSpeed", "Ljava/util/concurrent/atomic/AtomicLong;", MapSchema.FIELD_NAME_ENTRY, "Lkotlin/Lazy;", LogFieldKey.MESSAGE_KEY, "()Ljava/util/concurrent/atomic/AtomicLong;", "downFlow", "f", "o", "upFlow", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", b2n.f, "getCallbackExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "callbackExecutor", "Ljava/lang/Runnable;", b2n.g, "getTask", "()Ljava/lang/Runnable;", "task", "i", "sampleRatio", "Lcom/oplus/aiunit/vision/p6i;", "j", "Lcom/oplus/aiunit/vision/p6i;", "manager", "Lcom/oplus/aiunit/vision/o6i;", "listener", "<init>", "(Lcom/oplus/aiunit/vision/o6i;JLcom/oplus/aiunit/vision/p6i;)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class SpeedDetector {

    @NotNull
    public static final String TAG = "SpeedDetector";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public volatile long fullDownSpeed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile long fullUpSpeed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public volatile long detectAvgDownSpeed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile long detectAvgUoSpeed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Lazy downFlow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Lazy upFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Lazy callbackExecutor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final Lazy task;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public volatile long sampleRatio;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final p6i manager;

    public SpeedDetector(@Nullable o6i o6iVar, long j2, @NotNull p6i manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.sampleRatio = j2;
        this.manager = manager;
        this.downFlow = LazyKt__LazyJVMKt.lazy(new Function0<AtomicLong>() { // from class: com.heytap.okhttp.extension.speed.SpeedDetector$downFlow$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final AtomicLong invoke() {
                return new AtomicLong(0L);
            }
        });
        this.upFlow = LazyKt__LazyJVMKt.lazy(new Function0<AtomicLong>() { // from class: com.heytap.okhttp.extension.speed.SpeedDetector$upFlow$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final AtomicLong invoke() {
                return new AtomicLong(0L);
            }
        });
        this.callbackExecutor = LazyKt__LazyJVMKt.lazy(new Function0<ScheduledExecutorService>() { // from class: com.heytap.okhttp.extension.speed.SpeedDetector$callbackExecutor$2
            @Override // p010kotlin.jvm.functions.Function0
            public final ScheduledExecutorService invoke() {
                return Executors.newScheduledThreadPool(2);
            }
        });
        this.task = LazyKt__LazyJVMKt.lazy(new Function0<Runnable>() { // from class: com.heytap.okhttp.extension.speed.SpeedDetector$task$2

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
            public static final class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    double andSet = (SpeedDetector$task$2.this.this$0.o().getAndSet(0L) / SpeedDetector$task$2.this.this$0.sampleRatio) * 0.9765625d;
                    double andSet2 = (SpeedDetector$task$2.this.this$0.m().getAndSet(0L) / SpeedDetector$task$2.this.this$0.sampleRatio) * 0.9765625d;
                    double d = 1024;
                    SpeedDetector$task$2.this.this$0.detectAvgUoSpeed = (long) (andSet * d);
                    SpeedDetector$task$2.this.this$0.detectAvgDownSpeed = (long) (andSet2 * d);
                    if (SpeedDetector$task$2.this.this$0.fullDownSpeed <= 0) {
                        SpeedDetector speedDetector = SpeedDetector$task$2.this.this$0;
                        speedDetector.fullDownSpeed = speedDetector.detectAvgDownSpeed;
                    }
                    if (SpeedDetector$task$2.this.this$0.fullUpSpeed <= 0) {
                        SpeedDetector speedDetector2 = SpeedDetector$task$2.this.this$0;
                        speedDetector2.fullUpSpeed = speedDetector2.detectAvgUoSpeed;
                    }
                    SpeedDetector.f(SpeedDetector$task$2.this.this$0);
                    SpeedDetector.f(SpeedDetector$task$2.this.this$0);
                }
            }

            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Runnable invoke() {
                return new a();
            }
        });
    }

    public static final /* synthetic */ o6i f(SpeedDetector speedDetector) {
        speedDetector.getClass();
        return null;
    }

    public final AtomicLong m() {
        return (AtomicLong) this.downFlow.getValue();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getFullDownSpeed() {
        return this.fullDownSpeed;
    }

    public final AtomicLong o() {
        return (AtomicLong) this.upFlow.getValue();
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getFullUpSpeed() {
        return this.fullUpSpeed;
    }

    public final void q(long bytes) {
        m().getAndAdd(bytes);
    }

    public final void r(long bytes) {
        o().getAndAdd(bytes);
    }

    public final boolean s() {
        return false;
    }
}
