package androidx.paging;

import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.platform.account.webview.constant.Constants;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0003\u000f\u0010\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J9\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/paging/SingleRunner;", "", "cancelPreviousInEqualPriority", "", "(Z)V", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "Landroidx/paging/SingleRunner$Holder;", "runInIsolation", "", "priority", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancelIsolatedRunnerException", "Companion", "Holder", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleRunner {
    public static final int DEFAULT_PRIORITY = 0;

    @NotNull
    private final Holder holder;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "runner", "Landroidx/paging/SingleRunner;", "(Landroidx/paging/SingleRunner;)V", "getRunner", "()Landroidx/paging/SingleRunner;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CancelIsolatedRunnerException extends CancellationException {

        @NotNull
        private final SingleRunner runner;

        public CancelIsolatedRunnerException(@NotNull SingleRunner runner) {
            Intrinsics.checkNotNullParameter(runner, "runner");
            this.runner = runner;
        }

        @NotNull
        public final SingleRunner getRunner() {
            return this.runner;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/paging/SingleRunner$Holder;", "", "singleRunner", "Landroidx/paging/SingleRunner;", "cancelPreviousInEqualPriority", "", "(Landroidx/paging/SingleRunner;Z)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "previous", "Lkotlinx/coroutines/Job;", "previousPriority", "", Constants.JsbConstants.METHOD_FINISH, "", "job", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEnqueue", "priority", "(ILkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSingleRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleRunner.kt\nandroidx/paging/SingleRunner$Holder\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,123:1\n107#2,10:124\n107#2,10:134\n*S KotlinDebug\n*F\n+ 1 SingleRunner.kt\nandroidx/paging/SingleRunner$Holder\n*L\n92#1:124,10\n111#1:134,10\n*E\n"})
    public static final class Holder {
        private final boolean cancelPreviousInEqualPriority;

        @NotNull
        private final Mutex mutex;

        @Nullable
        private Job previous;
        private int previousPriority;

        @NotNull
        private final SingleRunner singleRunner;

        public Holder(@NotNull SingleRunner singleRunner, boolean z) {
            Intrinsics.checkNotNullParameter(singleRunner, "singleRunner");
            this.singleRunner = singleRunner;
            this.cancelPreviousInEqualPriority = z;
            this.mutex = MutexKt.Mutex$default(false, 1, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object onFinish(@NotNull Job job, @NotNull Continuation<? super Unit> continuation) {
            SingleRunner$Holder$onFinish$1 singleRunner$Holder$onFinish$1;
            Mutex mutex;
            if (continuation instanceof SingleRunner$Holder$onFinish$1) {
                singleRunner$Holder$onFinish$1 = (SingleRunner$Holder$onFinish$1) continuation;
                int i = singleRunner$Holder$onFinish$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    singleRunner$Holder$onFinish$1.label = i - Integer.MIN_VALUE;
                } else {
                    singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(this, continuation);
                }
            } else {
                singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(this, continuation);
            }
            Object obj = singleRunner$Holder$onFinish$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = singleRunner$Holder$onFinish$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.mutex;
                singleRunner$Holder$onFinish$1.L$0 = this;
                singleRunner$Holder$onFinish$1.L$1 = job;
                singleRunner$Holder$onFinish$1.L$2 = mutex;
                singleRunner$Holder$onFinish$1.label = 1;
                if (mutex.lock(null, singleRunner$Holder$onFinish$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Mutex mutex2 = (Mutex) singleRunner$Holder$onFinish$1.L$2;
                job = (Job) singleRunner$Holder$onFinish$1.L$1;
                Holder holder = (Holder) singleRunner$Holder$onFinish$1.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex2;
                this = holder;
            }
            try {
                if (job == this.previous) {
                    this.previous = null;
                }
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            } finally {
                mutex.unlock(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object tryEnqueue(int i, @NotNull Job job, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
            SingleRunner$Holder$tryEnqueue$1 singleRunner$Holder$tryEnqueue$1;
            Mutex mutex;
            Holder holder;
            int i2;
            Mutex mutex2;
            int i3;
            if (continuation instanceof SingleRunner$Holder$tryEnqueue$1) {
                singleRunner$Holder$tryEnqueue$1 = (SingleRunner$Holder$tryEnqueue$1) continuation;
                int i4 = singleRunner$Holder$tryEnqueue$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    singleRunner$Holder$tryEnqueue$1.label = i4 - Integer.MIN_VALUE;
                } else {
                    singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(this, continuation);
                }
            } else {
                singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(this, continuation);
            }
            Object obj = singleRunner$Holder$tryEnqueue$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = singleRunner$Holder$tryEnqueue$1.label;
            boolean z = true;
            try {
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    mutex = this.mutex;
                    singleRunner$Holder$tryEnqueue$1.L$0 = this;
                    singleRunner$Holder$tryEnqueue$1.L$1 = job;
                    singleRunner$Holder$tryEnqueue$1.L$2 = mutex;
                    singleRunner$Holder$tryEnqueue$1.I$0 = i;
                    singleRunner$Holder$tryEnqueue$1.label = 1;
                    if (mutex.lock(null, singleRunner$Holder$tryEnqueue$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = singleRunner$Holder$tryEnqueue$1.I$0;
                        mutex2 = (Mutex) singleRunner$Holder$tryEnqueue$1.L$2;
                        job = (Job) singleRunner$Holder$tryEnqueue$1.L$1;
                        holder = (Holder) singleRunner$Holder$tryEnqueue$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            mutex = mutex2;
                            i = i2;
                            this = holder;
                            this.previous = job;
                            this.previousPriority = i;
                            mutex2 = mutex;
                            Boolean boolBoxBoolean = Boxing.boxBoolean(z);
                            mutex2.unlock(null);
                            return boolBoxBoolean;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    i = singleRunner$Holder$tryEnqueue$1.I$0;
                    Mutex mutex3 = (Mutex) singleRunner$Holder$tryEnqueue$1.L$2;
                    job = (Job) singleRunner$Holder$tryEnqueue$1.L$1;
                    Holder holder2 = (Holder) singleRunner$Holder$tryEnqueue$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    this = holder2;
                }
                Job job2 = this.previous;
                if (job2 == null || !job2.isActive() || (i3 = this.previousPriority) < i || (i3 == i && this.cancelPreviousInEqualPriority)) {
                    if (job2 != null) {
                        job2.cancel((CancellationException) new CancelIsolatedRunnerException(this.singleRunner));
                    }
                    if (job2 != null) {
                        singleRunner$Holder$tryEnqueue$1.L$0 = this;
                        singleRunner$Holder$tryEnqueue$1.L$1 = job;
                        singleRunner$Holder$tryEnqueue$1.L$2 = mutex;
                        singleRunner$Holder$tryEnqueue$1.I$0 = i;
                        singleRunner$Holder$tryEnqueue$1.label = 2;
                        if (job2.join(singleRunner$Holder$tryEnqueue$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        holder = this;
                        i2 = i;
                        mutex2 = mutex;
                        mutex = mutex2;
                        i = i2;
                        this = holder;
                    }
                    this.previous = job;
                    this.previousPriority = i;
                } else {
                    z = false;
                }
                mutex2 = mutex;
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(z);
                mutex2.unlock(null);
                return boolBoxBoolean2;
            } catch (Throwable th2) {
                th = th2;
                mutex2 = mutex;
                mutex2.unlock(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.paging.SingleRunner$runInIsolation$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", i = {0}, l = {49}, m = "runInIsolation", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleRunner.this.runInIsolation(0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.SingleRunner$runInIsolation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", i = {0, 1}, l = {53, 59, 61, 61}, m = "invokeSuspend", n = {"myJob", "myJob"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $block;
        final /* synthetic */ int $priority;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(int i, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$priority = i;
            this.$block = function1;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = SingleRunner.this.new AnonymousClass2(this.$priority, this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.paging.SingleRunner$Holder] */
        /* JADX WARN: Type inference failed for: r8v0, types: [androidx.paging.SingleRunner$runInIsolation$2, java.lang.Object, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r8v1, types: [androidx.paging.SingleRunner$runInIsolation$2, kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v16, types: [androidx.paging.SingleRunner$Holder] */
        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Job job;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            int i = 4;
            try {
                if (r1 != 0) {
                    if (r1 == 1) {
                        Job job2 = (Job) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        job = job2;
                    } else if (r1 == 2) {
                        Job job3 = (Job) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        r1 = job3;
                        r1 = job;
                        ?? r9 = SingleRunner.this.holder;
                        i = 0;
                        this.L$0 = null;
                        this.label = 3;
                        this = r9.onFinish(r1, this);
                        if (this == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (r1 != 3) {
                            if (r1 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(Job.INSTANCE);
                if (element == null) {
                    throw new IllegalStateException("Internal error. coroutineScope should've created a job.".toString());
                }
                Job job4 = (Job) element;
                Holder holder = SingleRunner.this.holder;
                int i2 = this.$priority;
                this.L$0 = job4;
                this.label = 1;
                Object objTryEnqueue = holder.tryEnqueue(i2, job4, this);
                if (objTryEnqueue == coroutine_suspended) {
                    return coroutine_suspended;
                }
                job = job4;
                obj = objTryEnqueue;
                if (((Boolean) obj).booleanValue()) {
                    Function1<Continuation<? super Unit>, Object> function1 = this.$block;
                    this.L$0 = job;
                    this.label = 2;
                    if (function1.invoke(this) == coroutine_suspended) {
                        r1 = job;
                        return coroutine_suspended;
                    }
                    r1 = job;
                    ?? r10 = SingleRunner.this.holder;
                    i = 0;
                    this.L$0 = null;
                    this.label = 3;
                    this = r10.onFinish(r1, this);
                    if (this == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                ?? r3 = SingleRunner.this.holder;
                this.L$0 = th2;
                this.label = i;
                if (r3.onFinish(r1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th2;
            }
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SingleRunner() {
        this(false, 1, null);
    }

    public static /* synthetic */ Object runInIsolation$default(SingleRunner singleRunner, int i, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return singleRunner.runInIsolation(i, function1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.paging.SingleRunner, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Nullable
    public final Object runInIsolation(int i, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(i, function1, null);
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(anonymousClass2, anonymousClass1);
                this = objCoroutineScope;
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SingleRunner singleRunner = (SingleRunner) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
                this = singleRunner;
            }
        } catch (CancelIsolatedRunnerException e2) {
            if (e2.getRunner() != this) {
                throw e2;
            }
        }
        return Unit.INSTANCE;
    }

    public SingleRunner(boolean z) {
        this.holder = new Holder(this, z);
    }

    public /* synthetic */ SingleRunner(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
