package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.oplus.nearx.track.internal.common.UploadType;
import com.oplus.nearx.track.internal.record.TrackBean;
import com.oplus.nearx.track.internal.utils.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\f\tB\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/idf;", "", "", y15.PARAMS_DATA_TYPE, "", "c", "Lcom/oplus/nearx/track/internal/record/TrackBean;", "trackBean", "d", "b", "Landroid/os/Message;", "msg", "a", "", "J", "appId", "Ljava/lang/Object;", "mHandlerLock", "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "Lcom/oplus/aiunit/vision/fz9;", "trackUploadManager", "<init>", "(JLcom/oplus/aiunit/vision/fz9;)V", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class idf {
    public static final int FLUSH_CACHE = 500;
    public static final int FLUSH_REALTIME = 200;
    public static final int FLUSH_REALTIME_WITH_TRACK_BEAN = 20;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long appId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object mHandlerLock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Handler mHandler;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/idf$b;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Lcom/oplus/aiunit/vision/fz9;", "a", "Lcom/oplus/aiunit/vision/fz9;", "getTrackUploadManager", "()Lcom/oplus/aiunit/vision/fz9;", "trackUploadManager", "Landroid/os/Looper;", "looper", "<init>", "(Landroid/os/Looper;Lcom/oplus/aiunit/vision/fz9;)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final fz9 trackUploadManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Looper looper, @NotNull fz9 trackUploadManager) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(trackUploadManager, "trackUploadManager");
            this.trackUploadManager = trackUploadManager;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            try {
                long j2 = msg.arg1;
                int i = msg.arg2;
                Logger.b(k6k.e(), "RealtimeWorker", "appId[" + j2 + "] do upload messageId=[" + msg.what + ']', null, null, 12, null);
                int i2 = msg.what;
                if (i2 == 20) {
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.oplus.nearx.track.internal.record.TrackBean");
                    this.trackUploadManager.b((TrackBean) obj);
                } else if (i2 == 200) {
                    this.trackUploadManager.g(UploadType.REALTIME.getUploadType(), i);
                } else if (i2 != 500) {
                    Logger.j(k6k.e(), "RealtimeWorker", "Unexpected message received by TrackData worker: " + msg, null, null, 12, null);
                } else {
                    this.trackUploadManager.f();
                }
            } catch (RuntimeException e2) {
                Logger.j(k6k.e(), "RealtimeWorker", "Worker throw an unhandled exception", e2, null, 8, null);
            }
        }
    }

    public idf(long j2, @NotNull fz9 trackUploadManager) {
        Intrinsics.checkNotNullParameter(trackUploadManager, "trackUploadManager");
        this.appId = j2;
        this.mHandlerLock = new Object();
        HandlerThread handlerThread = new HandlerThread("com.oplus.nearx.track.internal.upload.TrackUploadManager.RealTimeWorker." + j2, 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "thread.looper");
        this.mHandler = new b(looper, trackUploadManager);
    }

    public final void a(Message msg) {
        synchronized (this.mHandlerLock) {
            Handler handler = this.mHandler;
            if (handler == null) {
                Logger.j(k6k.e(), "RealtimeWorker", "Dead worker dropping a message: " + msg.what, null, null, 12, null);
            } else {
                int i = msg.what;
                if (i == 20 || !handler.hasMessages(i)) {
                    Logger.b(k6k.e(), "RealtimeWorker", "appId=[" + this.appId + "] send immediately messageId=[" + msg.what + "]---current thread[" + Thread.currentThread() + ']', null, null, 12, null);
                    this.mHandler.sendMessage(msg);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void b() {
        Message m = Message.obtain();
        m.what = 500;
        m.arg1 = (int) this.appId;
        Intrinsics.checkNotNullExpressionValue(m, "m");
        a(m);
    }

    public final void c(int dataType) {
        Message m = Message.obtain();
        m.what = 200;
        m.arg1 = (int) this.appId;
        m.arg2 = dataType;
        Intrinsics.checkNotNullExpressionValue(m, "m");
        a(m);
    }

    public final void d(@NotNull TrackBean trackBean) {
        Intrinsics.checkNotNullParameter(trackBean, "trackBean");
        Message m = Message.obtain();
        m.what = 20;
        m.obj = trackBean;
        m.arg1 = (int) this.appId;
        Intrinsics.checkNotNullExpressionValue(m, "m");
        a(m);
    }
}
