package com.oplus.channel.server.utils;

import android.os.Handler;
import android.os.HandlerThread;
import com.oplus.channel.server.ServerChannel;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/oplus/channel/server/utils/WorkHandler;", "", "()V", "delayMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Runnable;", "", "handler", "Landroid/os/Handler;", "handlerThread", "Landroid/os/HandlerThread;", "post", "", "r", "postDelayed", ClickApiEntity.TIME, "quitSafely", "removeCallbacks", "Companion", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WorkHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String NAME = "ServerChannel";

    @NotNull
    private static final String TAG = "WorkHandler";

    @Nullable
    private static volatile WorkHandler instance;

    @NotNull
    private ConcurrentHashMap<Runnable, Long> delayMap;

    @Nullable
    private volatile Handler handler;

    @NotNull
    private final HandlerThread handlerThread;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078B@BX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/oplus/channel/server/utils/WorkHandler$Companion;", "", "()V", "NAME", "", "TAG", "<set-?>", "Lcom/oplus/channel/server/utils/WorkHandler;", "instance", "getInstance", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WorkHandler getInstance() {
            WorkHandler workHandler = WorkHandler.instance;
            if (workHandler == null) {
                synchronized (this) {
                    workHandler = WorkHandler.instance;
                    if (workHandler == null) {
                        workHandler = new WorkHandler(null);
                        WorkHandler.instance = workHandler;
                        LogUtil.i(WorkHandler.TAG, Intrinsics.stringPlus("getInstance, instance ", WorkHandler.instance));
                    }
                }
            }
            return workHandler;
        }
    }

    public /* synthetic */ WorkHandler(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void post(@NotNull Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        Handler handler = this.handler;
        Boolean boolValueOf = null;
        if ((handler == null ? null : Boolean.valueOf(handler.post(r))) == null) {
            synchronized (WorkHandler.class) {
                Handler handler2 = this.handler;
                if (handler2 != null) {
                    boolValueOf = Boolean.valueOf(handler2.post(r));
                }
                if (boolValueOf == null) {
                    LogUtil.d(TAG, "post handler is null, add to map.");
                    this.delayMap.put(r, 0L);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public final void postDelayed(@NotNull Runnable r, long time) {
        Intrinsics.checkNotNullParameter(r, "r");
        Handler handler = this.handler;
        Boolean boolValueOf = null;
        if ((handler == null ? null : Boolean.valueOf(handler.postDelayed(r, time))) == null) {
            synchronized (WorkHandler.class) {
                Handler handler2 = this.handler;
                if (handler2 != null) {
                    boolValueOf = Boolean.valueOf(handler2.postDelayed(r, time));
                }
                if (boolValueOf == null) {
                    LogUtil.d(TAG, "postDelayed handler is null, add to map.");
                    this.delayMap.put(r, Long.valueOf(time));
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public final void quitSafely() {
        synchronized (WorkHandler.class) {
            LogUtil.d(TAG, "quitSafely.");
            instance = null;
            this.handlerThread.quitSafely();
            this.handler = null;
            this.delayMap.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeCallbacks(@NotNull Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        synchronized (WorkHandler.class) {
            LogUtil.d(TAG, "removeCallbacks.");
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(r);
            }
            this.delayMap.remove(r);
        }
    }

    private WorkHandler() {
        this.delayMap = new ConcurrentHashMap<>();
        HandlerThread handlerThread = new HandlerThread() { // from class: com.oplus.channel.server.utils.WorkHandler$handlerThread$1
            {
                super(ServerChannel.TAG);
            }

            @Override // android.os.HandlerThread
            public void onLooperPrepared() {
                Object objM5287constructorimpl;
                super.onLooperPrepared();
                WorkHandler workHandler = this.this$0;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    synchronized (WorkHandler.class) {
                        LogUtil.d("WorkHandler", "onLooperPrepared.");
                        workHandler.handler = new Handler(getLooper());
                        for (Map.Entry entry : workHandler.delayMap.entrySet()) {
                            Handler handler = workHandler.handler;
                            if (handler != null) {
                                handler.postDelayed((Runnable) entry.getKey(), ((Number) entry.getValue()).longValue());
                            }
                        }
                        workHandler.delayMap.clear();
                    }
                    objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
                if (thM5290exceptionOrNullimpl != null) {
                    LogUtil.e("WorkHandler", Intrinsics.stringPlus("onLooperPrepared, error: ", thM5290exceptionOrNullimpl.getMessage()));
                }
            }
        };
        handlerThread.start();
        Unit unit = Unit.INSTANCE;
        this.handlerThread = handlerThread;
    }
}
