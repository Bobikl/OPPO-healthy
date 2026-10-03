package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.EmptyCoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012-\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u0013\u001a\u00020\u000bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u000bH\u0014J\b\u0010\u001d\u001a\u00020\u000bH\u0014R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/CoroutineLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MediatorLiveData;", "context", "Lkotlin/coroutines/CoroutineContext;", "timeoutInMs", "", "block", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;)V", "blockRunner", "Landroidx/lifecycle/BlockRunner;", "emittedSource", "Landroidx/lifecycle/EmittedSource;", "clearSource", "clearSource$lifecycle_livedata_ktx_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSource", "Lkotlinx/coroutines/DisposableHandle;", "source", "Landroidx/lifecycle/LiveData;", "emitSource$lifecycle_livedata_ktx_release", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActive", "onInactive", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {

    @Nullable
    private BlockRunner<T> blockRunner;

    @Nullable
    private EmittedSource emittedSource;

    public /* synthetic */ CoroutineLiveData(CoroutineContext coroutineContext, long j2, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i & 2) != 0 ? 5000L : j2, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object clearSource$lifecycle_livedata_ktx_release(@NotNull Continuation<? super Unit> continuation) {
        CoroutineLiveData$clearSource$1 coroutineLiveData$clearSource$1;
        if (continuation instanceof CoroutineLiveData$clearSource$1) {
            coroutineLiveData$clearSource$1 = (CoroutineLiveData$clearSource$1) continuation;
            int i = coroutineLiveData$clearSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$clearSource$1.label = i - Integer.MIN_VALUE;
            } else {
                coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, continuation);
            }
        } else {
            coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, continuation);
        }
        Object obj = coroutineLiveData$clearSource$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = coroutineLiveData$clearSource$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            EmittedSource emittedSource = this.emittedSource;
            if (emittedSource != null) {
                coroutineLiveData$clearSource$1.L$0 = this;
                coroutineLiveData$clearSource$1.label = 1;
                if (emittedSource.disposeNow(coroutineLiveData$clearSource$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (CoroutineLiveData) coroutineLiveData$clearSource$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.emittedSource = null;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object emitSource$lifecycle_livedata_ktx_release(@NotNull LiveData<T> liveData, @NotNull Continuation<? super DisposableHandle> continuation) {
        CoroutineLiveData$emitSource$1 coroutineLiveData$emitSource$1;
        if (continuation instanceof CoroutineLiveData$emitSource$1) {
            coroutineLiveData$emitSource$1 = (CoroutineLiveData$emitSource$1) continuation;
            int i = coroutineLiveData$emitSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$emitSource$1.label = i - Integer.MIN_VALUE;
            } else {
                coroutineLiveData$emitSource$1 = new CoroutineLiveData$emitSource$1(this, continuation);
            }
        } else {
            coroutineLiveData$emitSource$1 = new CoroutineLiveData$emitSource$1(this, continuation);
        }
        Object objAddDisposableSource = coroutineLiveData$emitSource$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = coroutineLiveData$emitSource$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                liveData = (LiveData) coroutineLiveData$emitSource$1.L$1;
                this = (CoroutineLiveData) coroutineLiveData$emitSource$1.L$0;
                ResultKt.throwOnFailure(objAddDisposableSource);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (CoroutineLiveData) coroutineLiveData$emitSource$1.L$0;
                ResultKt.throwOnFailure(objAddDisposableSource);
            }
            EmittedSource emittedSource = (EmittedSource) objAddDisposableSource;
            this.emittedSource = emittedSource;
            return emittedSource;
        }
        ResultKt.throwOnFailure(objAddDisposableSource);
        coroutineLiveData$emitSource$1.L$0 = this;
        coroutineLiveData$emitSource$1.L$1 = liveData;
        coroutineLiveData$emitSource$1.label = 1;
        if (clearSource$lifecycle_livedata_ktx_release(coroutineLiveData$emitSource$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        coroutineLiveData$emitSource$1.L$0 = this;
        coroutineLiveData$emitSource$1.L$1 = null;
        coroutineLiveData$emitSource$1.label = 2;
        objAddDisposableSource = CoroutineLiveDataKt.addDisposableSource(this, liveData, coroutineLiveData$emitSource$1);
        if (objAddDisposableSource == coroutine_suspended) {
            return coroutine_suspended;
        }
        EmittedSource emittedSource2 = (EmittedSource) objAddDisposableSource;
        this.emittedSource = emittedSource2;
        return emittedSource2;
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }

    public CoroutineLiveData(@NotNull CoroutineContext context, long j2, @NotNull Function2<? super LiveDataScope<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.blockRunner = new BlockRunner<>(this, block, j2, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(context).plus(SupervisorKt.SupervisorJob((Job) context.get(Job.INSTANCE)))), new Function0<Unit>(this) { // from class: androidx.lifecycle.CoroutineLiveData.1
            final /* synthetic */ CoroutineLiveData<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((CoroutineLiveData) this.this$0).blockRunner = null;
            }
        });
    }
}
