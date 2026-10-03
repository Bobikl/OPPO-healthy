package com.oplus.utrace.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/oplus/utrace/utils/SafeHandlerThread;", "Ljava/lang/Thread;", "name", "", "priority", "", "(Ljava/lang/String;I)V", "(Ljava/lang/String;)V", "exceptionHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "getExceptionHandler", "()Ljava/lang/Thread$UncaughtExceptionHandler;", "setExceptionHandler", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "getLooper", "()Landroid/os/Looper;", "mHandler", "mLooper", "mPriority", "quit", "", "quitSafely", "run", "", "testMessageQueue", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SafeHandlerThread extends Thread {

    @Nullable
    private Thread.UncaughtExceptionHandler exceptionHandler;

    @Nullable
    private Handler mHandler;

    @Nullable
    private Looper mLooper;
    private int mPriority;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeHandlerThread(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "name");
    }

    private final boolean testMessageQueue() {
        Handler handler = getHandler();
        if (handler != null) {
            return handler.sendEmptyMessageAtTime(Integer.MAX_VALUE, SystemClock.uptimeMillis());
        }
        return false;
    }

    @Nullable
    public final Thread.UncaughtExceptionHandler getExceptionHandler() {
        return this.exceptionHandler;
    }

    @Nullable
    public final Handler getHandler() {
        Looper looper;
        if (this.mHandler == null) {
            synchronized (this) {
                if (this.mHandler == null && (looper = getLooper()) != null) {
                    this.mHandler = new Handler(looper);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return this.mHandler;
    }

    @Nullable
    public final Looper getLooper() {
        boolean z;
        if (!isAlive()) {
            return null;
        }
        synchronized (this) {
            z = false;
            while (isAlive() && this.mLooper == null) {
                try {
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return this.mLooper;
    }

    public final boolean quit() {
        Looper looper = getLooper();
        if (looper == null) {
            return false;
        }
        looper.quit();
        return true;
    }

    public final boolean quitSafely() {
        Looper looper = getLooper();
        if (looper == null) {
            return false;
        }
        looper.quitSafely();
        return true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Object obj;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Looper.prepare();
        synchronized (this) {
            this.mLooper = Looper.myLooper();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        Process.setThreadPriority(this.mPriority);
        do {
            try {
                Result.Companion companion = Result.Companion;
                Looper.loop();
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null && (uncaughtExceptionHandler = this.exceptionHandler) != null) {
                uncaughtExceptionHandler.uncaughtException(this, th2);
            }
        } while (testMessageQueue());
        Log.i("UTrace.Sdk.Thread", "thread '" + getName() + "' is quiting");
    }

    public final void setExceptionHandler(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.exceptionHandler = uncaughtExceptionHandler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafeHandlerThread(@NotNull String str, int i) {
        this(str);
        Intrinsics.checkNotNullParameter(str, "name");
        this.mPriority = i;
    }
}
