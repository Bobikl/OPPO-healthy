package com.heytap.health.connect.rawapi.call;

import android.annotation.SuppressLint;
import com.heytap.health.connect.rawapi.call.Call;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.RetryOpt;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cyb;
import com.oplus.aiunit.vision.dyb;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.iuf;
import com.oplus.aiunit.vision.nxb;
import com.oplus.aiunit.vision.oea;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.sxb;
import com.oplus.aiunit.vision.wil;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 T2\u00020\u0001:\u0001\u0007B/\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010(\u001a\u00020#\u0012\u0006\u0010Q\u001a\u00020\u0004¢\u0006\u0004\bR\u0010SJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0016\u001a\u00020\bJ\b\u0010\u0017\u001a\u00020\u0006H\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0003R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0017\u00100\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b.\u0010/R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010\u001fR\u0018\u0010J\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001b\u0010N\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, d2 = {"Lcom/heytap/health/connect/rawapi/call/Call;", "Lcom/oplus/aiunit/vision/nxb$c;", "", "success", "", "code", "", "a", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "D", "G", "y", "C", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/sxb;", oea.CALLBACK, LogFieldKey.PROCESS_NAME_KEY, "r", "H", "o", "Lcom/heytap/health/connect/rawapi/call/CallException;", MapSchema.FIELD_NAME_ENTRY, "z", "Ljava/lang/String;", "x", "()Ljava/lang/String;", "b", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "t", "()Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "mEvent", "", "c", "J", "w", "()J", "mTimeOut", "d", "Z", "mFinished", "Lcom/oplus/aiunit/vision/wvf;", "Lcom/oplus/aiunit/vision/wvf;", "u", "()Lcom/oplus/aiunit/vision/wvf;", "mRetryOpt", "Lcom/oplus/aiunit/vision/cyb;", "f", "Lcom/oplus/aiunit/vision/cyb;", "v", "()Lcom/oplus/aiunit/vision/cyb;", "mRspIdentify", "", b2n.f, "Ljava/lang/Throwable;", "mCallStack", "Lkotlinx/coroutines/CancellableContinuation;", b2n.g, "Lkotlinx/coroutines/CancellableContinuation;", "mCoroutine", "i", "Lcom/oplus/aiunit/vision/sxb;", "mMessageCallback", "Ljava/util/concurrent/CountDownLatch;", "j", "Ljava/util/concurrent/CountDownLatch;", "mThreadLock", MapSchema.FIELD_NAME_KEY, "mResult", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/connect/rawapi/call/CallException;", "mException", LogFieldKey.MESSAGE_KEY, "Lkotlin/Lazy;", "s", "mDescribe", "Lcom/oplus/aiunit/vision/iuf;", "rspType", "retry", "<init>", "(Ljava/lang/String;Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;Lcom/oplus/aiunit/vision/iuf;JI)V", "Companion", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Call.kt\ncom/heytap/health/connect/rawapi/call/Call\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,214:1\n314#2,11:215\n*S KotlinDebug\n*F\n+ 1 Call.kt\ncom/heytap/health/connect/rawapi/call/Call\n*L\n150#1:215,11\n*E\n"})
public final class Call implements nxb.c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f3679n = new AtomicInteger(1);

    @NotNull
    public static final Lazy<ThreadPoolExecutor> o = LazyKt__LazyJVMKt.lazy(Call$Companion$mExecutor$2.INSTANCE);

    @NotNull
    public static final String tag = "MsgCall";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String mac;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MessageEvent mEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long mTimeOut;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean mFinished;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RetryOpt mRetryOpt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final cyb mRspIdentify;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Throwable mCallStack;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public CancellableContinuation<? super MessageEvent> mCoroutine;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public sxb mMessageCallback;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile CountDownLatch mThreadLock;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public volatile MessageEvent mResult;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile CallException mException;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy mDescribe;

    /* JADX INFO: renamed from: com.heytap.health.connect.rawapi.call.Call$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\bR!\u0010\t\u001a\u00020\u00028BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/connect/rawapi/call/Call$a;", "", "Ljava/util/concurrent/ThreadPoolExecutor;", "mExecutor$delegate", "Lkotlin/Lazy;", "b", "()Ljava/util/concurrent/ThreadPoolExecutor;", "getMExecutor$annotations", "()V", "mExecutor", "", "tag", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNumber", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ThreadPoolExecutor b() {
            return (ThreadPoolExecutor) Call.o.getValue();
        }
    }

    public Call(@NotNull String mac, @NotNull MessageEvent mEvent, @NotNull iuf rspType, long j2, int i) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(mEvent, "mEvent");
        Intrinsics.checkNotNullParameter(rspType, "rspType");
        this.mac = mac;
        this.mEvent = mEvent;
        this.mTimeOut = j2;
        this.mRetryOpt = new RetryOpt(i);
        this.mRspIdentify = dyb.a(mEvent, mac, rspType);
        this.mCallStack = new Throwable();
        this.mDescribe = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.connect.rawapi.call.Call$mDescribe$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                StringBuffer stringBuffer = new StringBuffer();
                if (this.this$0.mCoroutine != null) {
                    stringBuffer.append("COR ");
                }
                if (this.this$0.mMessageCallback != null) {
                    stringBuffer.append("CBK ");
                }
                if (this.this$0.mThreadLock != null) {
                    stringBuffer.append("TLK ");
                }
                int length = this.this$0.getMEvent().getData() == null ? -1 : this.this$0.getMEvent().getData().length;
                return "Call(" + gdb.a(this.this$0.getMac()) + "@" + this.this$0.getMEvent().getServiceId() + "#" + this.this$0.getMEvent().getCommandId() + "^" + length + " => " + this.this$0.getMRspIdentify() + " tout=[" + this.this$0.getMTimeOut() + "*(1+" + this.this$0.getMRetryOpt().getMMaxRetry() + ")] [" + ((Object) stringBuffer) + "] ";
            }
        });
    }

    public static final void A(Ref.ObjectRef coroutine, CallException e2) {
        Intrinsics.checkNotNullParameter(coroutine, "$coroutine");
        Intrinsics.checkNotNullParameter(e2, "$e");
        CancellableContinuation cancellableContinuation = (CancellableContinuation) coroutine.element;
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(e2)));
        }
    }

    public static final void B(Ref.ObjectRef messageCallback, CallException e2, Call this$0) {
        Intrinsics.checkNotNullParameter(messageCallback, "$messageCallback");
        Intrinsics.checkNotNullParameter(e2, "$e");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            sxb sxbVar = (sxb) messageCallback.element;
            if (sxbVar != null) {
                sxbVar.b(e2);
            }
        } catch (Exception e3) {
            wil.b(tag, "exe onError: " + messageCallback.element + " failed e=" + e3 + "  call=" + this$0.H());
            if (qe0.w()) {
                e3.printStackTrace();
            }
        }
    }

    public static final void E(Ref.ObjectRef coroutine, MessageEvent event) {
        Intrinsics.checkNotNullParameter(coroutine, "$coroutine");
        Intrinsics.checkNotNullParameter(event, "$event");
        CancellableContinuation cancellableContinuation = (CancellableContinuation) coroutine.element;
        if (cancellableContinuation != null) {
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(event));
        }
    }

    public static final void F(Ref.ObjectRef messageCallback, String mac, MessageEvent event, Call this$0) {
        Intrinsics.checkNotNullParameter(messageCallback, "$messageCallback");
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(event, "$event");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            sxb sxbVar = (sxb) messageCallback.element;
            if (sxbVar != null) {
                sxbVar.a(mac, event);
            }
        } catch (Exception e2) {
            wil.b(tag, "exe onSuccess: " + messageCallback.element + " failed e=" + e2 + "  call=" + this$0.H());
            if (qe0.w()) {
                e2.printStackTrace();
            }
        }
    }

    public final void C() {
        CallException callException = new CallException(b.C0326b.INSTANCE, "send error: " + H());
        callException.setStackTrace(this.mCallStack.getStackTrace());
        z(callException);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlinx.coroutines.CancellableContinuation<? super com.oplus.wearable.linkservice.sdk.common.MessageEvent>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.oplus.aiunit.vision.sxb] */
    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public final void D(@NotNull final String mac, @NotNull final MessageEvent event) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        synchronized (this) {
            if (this.mFinished) {
                return;
            }
            this.mFinished = true;
            objectRef.element = this.mCoroutine;
            objectRef2.element = this.mMessageCallback;
            CountDownLatch countDownLatch = this.mThreadLock;
            o();
            Unit unit = Unit.INSTANCE;
            this.mResult = event;
            Companion companion = INSTANCE;
            companion.b().submit(new Runnable() { // from class: com.oplus.aiunit.vision.rr2
                @Override // java.lang.Runnable
                public final void run() {
                    Call.E(objectRef, event);
                }
            });
            companion.b().submit(new Runnable() { // from class: com.oplus.aiunit.vision.sr2
                @Override // java.lang.Runnable
                public final void run() {
                    Call.F(objectRef2, mac, event, this);
                }
            });
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    public final void G() {
        CallException callException = new CallException(b.c.INSTANCE, "exe timeout: " + H());
        callException.setStackTrace(this.mCallStack.getStackTrace());
        z(callException);
    }

    @NotNull
    public final String H() {
        return s() + " rst=" + this.mResult + ", ex=" + this.mException + ")";
    }

    @Override // com.oplus.aiunit.vision.nxb.c
    public void a(boolean success, int code) {
        if (success) {
            return;
        }
        wil.k(tag, "onSendResult: failed " + code);
        CallCache.INSTANCE.k(this);
        C();
    }

    public final void o() {
        this.mCoroutine = null;
        this.mMessageCallback = null;
        this.mThreadLock = null;
    }

    public final void p(@NotNull sxb cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.mMessageCallback = cb;
        CallCache.INSTANCE.f(this);
    }

    @Nullable
    public final Object q(@NotNull Continuation<? super MessageEvent> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.mCoroutine = cancellableContinuationImpl;
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.heytap.health.connect.rawapi.call.Call$executeSuspend$2$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                Call call = this.this$0;
                synchronized (call) {
                    if (call.mFinished) {
                        return;
                    }
                    call.mFinished = true;
                    call.o();
                    Unit unit = Unit.INSTANCE;
                    CallCache.INSTANCE.e(this.this$0);
                }
            }
        });
        CallCache.INSTANCE.f(this);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Nullable
    public final MessageEvent r() throws InterruptedException, CallException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this) {
            this.mResult = null;
            this.mException = null;
            this.mThreadLock = countDownLatch;
            Unit unit = Unit.INSTANCE;
        }
        CallCache.INSTANCE.f(this);
        countDownLatch.await((this.mTimeOut + ((long) 1000)) * ((long) (this.mRetryOpt.getMMaxRetry() + 1)), TimeUnit.MILLISECONDS);
        if (this.mException == null) {
            return this.mResult;
        }
        CallException callException = this.mException;
        Intrinsics.checkNotNull(callException);
        throw callException;
    }

    public final String s() {
        return (String) this.mDescribe.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final MessageEvent getMEvent() {
        return this.mEvent;
    }

    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public final RetryOpt getMRetryOpt() {
        return this.mRetryOpt;
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final cyb getMRspIdentify() {
        return this.mRspIdentify;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getMTimeOut() {
        return this.mTimeOut;
    }

    @NotNull
    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    public final void y() {
        CallException callException = new CallException(b.a.INSTANCE, "exe deviceDisconnect: " + H());
        callException.setStackTrace(this.mCallStack.getStackTrace());
        z(callException);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlinx.coroutines.CancellableContinuation<? super com.oplus.wearable.linkservice.sdk.common.MessageEvent>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.oplus.aiunit.vision.sxb] */
    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public final void z(final CallException e2) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        synchronized (this) {
            if (this.mFinished) {
                return;
            }
            this.mFinished = true;
            objectRef.element = this.mCoroutine;
            objectRef2.element = this.mMessageCallback;
            CountDownLatch countDownLatch = this.mThreadLock;
            o();
            Unit unit = Unit.INSTANCE;
            Companion companion = INSTANCE;
            companion.b().submit(new Runnable() { // from class: com.oplus.aiunit.vision.tr2
                @Override // java.lang.Runnable
                public final void run() {
                    Call.A(objectRef, e2);
                }
            });
            companion.b().submit(new Runnable() { // from class: com.oplus.aiunit.vision.ur2
                @Override // java.lang.Runnable
                public final void run() {
                    Call.B(objectRef2, e2, this);
                }
            });
            this.mException = e2;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
