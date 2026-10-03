package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.heytap.health.heartrate.measure.entity.HeartMeasureResult;
import io.protostuff.MapSchema;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u000b\tB\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0002R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/z19;", "", "", "d", "Lcom/heytap/health/heartrate/measure/entity/HeartMeasureResult;", "outputData", "c", "", MapSchema.FIELD_NAME_ENTRY, "b", "Landroid/os/HandlerThread;", "a", "Landroid/os/HandlerThread;", "mHandlerThread", "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mHasInit", "mReady", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class z19 {
    public static final int READY_MSG = 0;

    @NotNull
    public static final String TAG = "HeartMeasurePreHandle";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public HandlerThread mHandlerThread;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Handler mHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean mHasInit = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean mReady = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/z19$b;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Landroid/os/Looper;", "looper", "<init>", "(Lcom/oplus/aiunit/vision/z19;Landroid/os/Looper;)V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public final class b extends Handler {
        public final /* synthetic */ z19 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull z19 z19Var, Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.a = z19Var;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 0) {
                d6b.INSTANCE.a(z19.TAG, "ready");
                this.a.mReady.set(true);
            }
        }
    }

    public final void b() {
        this.mReady.set(false);
        this.mHasInit.set(false);
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        HandlerThread handlerThread2 = this.mHandlerThread;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        this.mHandlerThread = null;
        this.mHandler = null;
    }

    public final void c(@NotNull HeartMeasureResult outputData) {
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        d6b d6bVar = d6b.INSTANCE;
        d6bVar.a(TAG, outputData.toString());
        if (outputData.getWarnStatus() == 0 && outputData.getMotionStatus() == 1) {
            return;
        }
        d6bVar.a(TAG, "status err, reset count down");
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(0);
        }
        Handler handler2 = this.mHandler;
        if (handler2 != null) {
            handler2.sendEmptyMessageDelayed(0, 3000L);
        }
    }

    public final void d() {
        if (this.mHasInit.compareAndSet(false, true)) {
            HandlerThread handlerThread = new HandlerThread(TAG);
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            HandlerThread handlerThread2 = this.mHandlerThread;
            if (handlerThread2 != null) {
                Looper looper = handlerThread2.getLooper();
                Intrinsics.checkNotNullExpressionValue(looper, "it.looper");
                this.mHandler = new b(this, looper);
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendEmptyMessageDelayed(0, 3000L);
            }
        }
    }

    public final boolean e() {
        return this.mReady.get();
    }
}
