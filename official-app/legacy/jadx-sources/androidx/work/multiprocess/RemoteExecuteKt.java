package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.IInterface;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.concurrent.futures.SuspendToFutureAdapter;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.Logger;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.SafeContinuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0080@¢\u0006\u0002\u0010\u0007\u001a<\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\b\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"execute", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/IInterface;", "iInterface", "dispatcher", "Landroidx/work/multiprocess/RemoteDispatcher;", "(Landroid/os/IInterface;Landroidx/work/multiprocess/RemoteDispatcher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/common/util/concurrent/ListenableFuture;", "executor", "Ljava/util/concurrent/Executor;", "unlinkToDeathSafely", "", "Landroid/os/IBinder;", "recipient", "Landroid/os/IBinder$DeathRecipient;", "work-multiprocess_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRemoteExecute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteExecute.kt\nandroidx/work/multiprocess/RemoteExecuteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public final class RemoteExecuteKt {

    /* JADX INFO: renamed from: androidx.work.multiprocess.RemoteExecuteKt$execute$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Landroid/os/IInterface;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.multiprocess.RemoteExecuteKt$execute$1", f = "RemoteExecute.kt", i = {}, l = {43, 50}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        final /* synthetic */ RemoteDispatcher<T> $dispatcher;
        final /* synthetic */ ListenableFuture<T> $iInterface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ListenableFuture<T> listenableFuture, RemoteDispatcher<T> remoteDispatcher, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$iInterface = listenableFuture;
            this.$dispatcher = remoteDispatcher;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$iInterface, this.$dispatcher, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                }
                ResultKt.throwOnFailure(obj);
                ListenableFuture<T> listenableFuture = this.$iInterface;
                this.label = 1;
                obj = ListenableFutureKt.await(listenableFuture, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                IInterface iInterface = (IInterface) obj;
                RemoteDispatcher<T> remoteDispatcher = this.$dispatcher;
                this.label = 2;
                obj = RemoteExecuteKt.execute(iInterface, (RemoteDispatcher<IInterface>) remoteDispatcher, (Continuation<? super byte[]>) this);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            } catch (Throwable th) {
                if (!(th instanceof CancellationException)) {
                    Logger.get().error(ListenableWorkerImplClient.TAG, "Unable to bind to service", th);
                }
                throw th;
            }
        }

        @Override // p010kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.work.multiprocess.RemoteExecuteKt$execute$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.multiprocess.RemoteExecuteKt", f = "RemoteExecute.kt", i = {0, 0, 0, 0}, l = {61}, m = "execute", n = {"iInterface", "dispatcher", "deathRecipient", "binder"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class AnonymousClass2<T extends IInterface> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteExecuteKt.execute((IInterface) null, (RemoteDispatcher<IInterface>) null, this);
        }
    }

    @NotNull
    public static final <T extends IInterface> ListenableFuture<byte[]> execute(@NotNull Executor executor, @NotNull ListenableFuture<T> iInterface, @NotNull RemoteDispatcher<T> dispatcher) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(iInterface, "iInterface");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return SuspendToFutureAdapter.INSTANCE.launchFuture(ExecutorsKt.from(executor).plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), false, new AnonymousClass1(iInterface, dispatcher, null));
    }

    private static final void unlinkToDeathSafely(IBinder iBinder, IBinder.DeathRecipient deathRecipient) {
        try {
            iBinder.unlinkToDeath(deathRecipient, 0);
        } catch (NoSuchElementException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:32:0x009d, B:34:0x00a1, B:35:0x00ac), top: B:45:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.os.IBinder$DeathRecipient, androidx.work.multiprocess.RemoteExecuteKt$execute$3$localRecipient$1] */
    @Nullable
    public static final <T extends IInterface> Object execute(@NotNull T t, @NotNull RemoteDispatcher<T> remoteDispatcher, @NotNull Continuation<? super byte[]> continuation) {
        AnonymousClass2 anonymousClass2;
        Ref.ObjectRef objectRef;
        Throwable th;
        IBinder binder;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i = anonymousClass2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(continuation);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(continuation);
        }
        Object obj = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            IBinder iBinderAsBinder = t.asBinder();
            try {
                anonymousClass2.L$0 = t;
                anonymousClass2.L$1 = remoteDispatcher;
                anonymousClass2.L$2 = objectRef2;
                anonymousClass2.L$3 = iBinderAsBinder;
                anonymousClass2.label = 1;
                final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(anonymousClass2));
                ?? r5 = new IBinder.DeathRecipient() { // from class: androidx.work.multiprocess.RemoteExecuteKt$execute$3$localRecipient$1
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        Continuation<byte[]> continuation2 = safeContinuation;
                        Result.Companion companion = Result.INSTANCE;
                        continuation2.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new RuntimeException("Binder died"))));
                    }
                };
                objectRef2.element = r5;
                iBinderAsBinder.linkToDeath(r5, 0);
                remoteDispatcher.execute(t, new IWorkManagerImplCallback.Stub() { // from class: androidx.work.multiprocess.RemoteExecuteKt$execute$3$1
                    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
                    public void onFailure(String error) {
                        Continuation<byte[]> continuation2 = safeContinuation;
                        Result.Companion companion = Result.INSTANCE;
                        continuation2.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new RuntimeException(error))));
                    }

                    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
                    public void onSuccess(byte[] response) {
                        Intrinsics.checkNotNullParameter(response, "response");
                        safeContinuation.resumeWith(Result.m5287constructorimpl(response));
                    }
                });
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(anonymousClass2);
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                obj = orThrow;
                binder = iBinderAsBinder;
            } catch (Throwable th2) {
                objectRef = objectRef2;
                th = th2;
                binder = iBinderAsBinder;
                if (!(th instanceof CancellationException)) {
                    Logger.get().error(ListenableWorkerImplClient.TAG, "Unable to execute", th);
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            binder = (IBinder) anonymousClass2.L$3;
            objectRef = (Ref.ObjectRef) anonymousClass2.L$2;
            try {
                ResultKt.throwOnFailure(obj);
                binder = binder;
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (!(th instanceof CancellationException)) {
                        Logger.get().error(ListenableWorkerImplClient.TAG, "Unable to execute", th);
                    }
                    throw th;
                } catch (Throwable th4) {
                    IBinder.DeathRecipient deathRecipient = (IBinder.DeathRecipient) objectRef.element;
                    if (deathRecipient != null) {
                        Intrinsics.checkNotNullExpressionValue(binder, "binder");
                        unlinkToDeathSafely(binder, deathRecipient);
                    }
                    throw th4;
                }
            }
        }
        byte[] bArr = (byte[]) obj;
        IBinder.DeathRecipient deathRecipient2 = (IBinder.DeathRecipient) objectRef.element;
        if (deathRecipient2 != null) {
            Intrinsics.checkNotNullExpressionValue(binder, "binder");
            unlinkToDeathSafely(binder, deathRecipient2);
        }
        return bArr;
    }
}
