package coil.util;

import androidx.annotation.MainThread;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: coil.util.-Lifecycles, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "a", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleObserver;", "observer", "b", "coil-base_release"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "-Lifecycles")
@SourceDebugExtension({"SMAP\nLifecycles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycles.kt\ncoil/util/-Lifecycles\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n314#2,11:44\n1#3:55\n*S KotlinDebug\n*F\n+ 1 Lifecycles.kt\ncoil/util/-Lifecycles\n*L\n23#1:44,11\n*E\n"})
public final class Lifecycles {
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, coil.util.-Lifecycles$awaitStarted$2$1, java.lang.Object] */
    @MainThread
    @Nullable
    public static final Object a(@NotNull Lifecycle lifecycle, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Lifecycles$awaitStarted$1 lifecycles$awaitStarted$1;
        Lifecycle lifecycle2;
        Ref.ObjectRef objectRef;
        Throwable th;
        LifecycleObserver lifecycleObserver;
        LifecycleObserver lifecycleObserver2;
        if (continuation instanceof Lifecycles$awaitStarted$1) {
            lifecycles$awaitStarted$1 = (Lifecycles$awaitStarted$1) continuation;
            int i = lifecycles$awaitStarted$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lifecycles$awaitStarted$1.label = i - Integer.MIN_VALUE;
            } else {
                lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuation);
            }
        } else {
            lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuation);
        }
        Object obj = lifecycles$awaitStarted$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = lifecycles$awaitStarted$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) lifecycles$awaitStarted$1.L$1;
            lifecycle2 = (Lifecycle) lifecycles$awaitStarted$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                lifecycleObserver2 = (LifecycleObserver) objectRef.element;
                if (lifecycleObserver2 != null) {
                    lifecycle2.removeObserver(lifecycleObserver2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                lifecycleObserver = (LifecycleObserver) objectRef.element;
                if (lifecycleObserver != null) {
                    lifecycle2.removeObserver(lifecycleObserver);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        if (lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            return Unit.INSTANCE;
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            lifecycles$awaitStarted$1.L$0 = lifecycle;
            lifecycles$awaitStarted$1.L$1 = objectRef2;
            lifecycles$awaitStarted$1.label = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(lifecycles$awaitStarted$1), 1);
            cancellableContinuationImpl.initCancellability();
            ?? r3 = new DefaultLifecycleObserver() { // from class: coil.util.-Lifecycles$awaitStarted$2$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onStart(@NotNull LifecycleOwner owner) {
                    CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m5287constructorimpl(Unit.INSTANCE));
                }
            };
            objectRef2.element = r3;
            Intrinsics.checkNotNull(r3);
            lifecycle.addObserver((LifecycleObserver) r3);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(lifecycles$awaitStarted$1);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            lifecycleObserver2 = (LifecycleObserver) objectRef.element;
            if (lifecycleObserver2 != null) {
                lifecycle2.removeObserver(lifecycleObserver2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            th = th3;
            lifecycleObserver = (LifecycleObserver) objectRef.element;
            if (lifecycleObserver != null) {
                lifecycle2.removeObserver(lifecycleObserver);
            }
            throw th;
        }
    }

    @MainThread
    public static final void b(@NotNull Lifecycle lifecycle, @NotNull LifecycleObserver lifecycleObserver) {
        lifecycle.removeObserver(lifecycleObserver);
        lifecycle.addObserver(lifecycleObserver);
    }
}
