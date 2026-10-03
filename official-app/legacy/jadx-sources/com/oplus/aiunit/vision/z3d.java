package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u000b\u000fB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R$\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/z3d;", "", "", "name", "Lkotlin/Function1;", "Landroid/os/Message;", "Lkotlin/ParameterName;", "msg", "", "handleMessage", "Landroid/os/Handler;", "a", "Landroid/os/HandlerThread;", "c", "Landroid/os/Looper;", "b", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "handler", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class z3d {
    public static final long DELAYED_TIME = 600000;
    public static final int OS_WHAT_RECORDING = 7;
    public static final int OS_WHAT_SENSOR = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Handler handler;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\r\u001a\u00020\f\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R/\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/z3d$b;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "a", "Lkotlin/jvm/functions/Function1;", "handleMsg", "Landroid/os/Looper;", "looper", "<init>", "(Lcom/oplus/aiunit/vision/z3d;Landroid/os/Looper;Lkotlin/jvm/functions/Function1;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Function1<Message, Unit> handleMsg;
        public final /* synthetic */ z3d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull z3d z3dVar, @NotNull Looper looper, Function1<? super Message, Unit> handleMsg) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(handleMsg, "handleMsg");
            this.b = z3dVar;
            this.handleMsg = handleMsg;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.handleMsg.invoke(msg);
        }
    }

    @NotNull
    public final Handler a(@NotNull String name, @NotNull Function1<? super Message, Unit> handleMessage) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(handleMessage, "handleMessage");
        if (this.handler == null) {
            this.handler = new b(this, b(name), handleMessage);
        }
        Handler handler = this.handler;
        Intrinsics.checkNotNull(handler);
        return handler;
    }

    public final Looper b(String name) {
        Looper looper = c(name).getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "handlerThread.looper");
        return looper;
    }

    public final HandlerThread c(String name) {
        HandlerThread handlerThread = new HandlerThread(name);
        handlerThread.start();
        return handlerThread;
    }
}
