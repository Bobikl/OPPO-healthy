package com.heytap.health.base.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.utils.AsyncResult;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bdd;
import com.oplus.aiunit.vision.bvf;
import com.oplus.aiunit.vision.ccd;
import com.oplus.aiunit.vision.juk;
import com.oplus.aiunit.vision.lbd;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B0\u0012$\u0010\u000e\u001a \u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00070\u0005ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\t\u001a\u00020\u00072\u001a\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\nH\u0016R5\u0010\u000e\u001a \u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\rR'\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/base/utils/AsyncResult;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/juk;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcom/oplus/aiunit/vision/bvf;", "", "callback", "a", "Lcom/oplus/aiunit/vision/lbd;", b2n.f, "Lkotlin/Result;", "Lkotlin/jvm/functions/Function1;", "block", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Lazy;", "f", "()Landroidx/lifecycle/MutableLiveData;", "mLiveData", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAsyncResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncResult.kt\ncom/heytap/health/base/utils/AsyncResult\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,148:1\n314#2,11:149\n*S KotlinDebug\n*F\n+ 1 AsyncResult.kt\ncom/heytap/health/base/utils/AsyncResult\n*L\n68#1:149,11\n*E\n"})
public final class AsyncResult<T> implements juk<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<Function1<? super Result<? extends T>, Unit>, Unit> block;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy mLiveData;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncResult(@NotNull Function1<? super Function1<? super Result<? extends T>, Unit>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
        this.mLiveData = LazyKt__LazyJVMKt.lazy(new Function0<MutableLiveData<bvf<T>>>() { // from class: com.heytap.health.base.utils.AsyncResult$mLiveData$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final MutableLiveData<bvf<T>> invoke() {
                return new MutableLiveData<>();
            }
        });
    }

    public static final void h(AsyncResult this$0, final ccd emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this$0.block.invoke(new Function1<Result<? extends T>, Unit>() { // from class: com.heytap.health.base.utils.AsyncResult$toObservable$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(((Result) obj).getValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                emitter.onNext(new bvf<>(obj));
                emitter.onComplete();
            }
        });
    }

    @Override // com.oplus.aiunit.vision.iuk
    public void a(@Nullable final Function1<? super bvf<T>, Unit> callback) {
        this.block.invoke(new Function1<Result<? extends T>, Unit>() { // from class: com.heytap.health.base.utils.AsyncResult$toCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(((Result) obj).getValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                Function1<bvf<T>, Unit> function1 = callback;
                if (function1 != null) {
                    function1.invoke(new bvf<>(obj));
                }
            }
        });
    }

    @Override // com.oplus.aiunit.vision.juk
    @Nullable
    public Object b(@NotNull Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.block.invoke(new Function1<Result<? extends T>, Unit>() { // from class: com.heytap.health.base.utils.AsyncResult$toCoroutine$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(((Result) obj).getValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                cancellableContinuationImpl.resumeWith(obj);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final MutableLiveData<bvf<T>> f() {
        return (MutableLiveData) this.mLiveData.getValue();
    }

    @NotNull
    public lbd<bvf<T>> g() {
        lbd<bvf<T>> lbdVarW = lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.cj0
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) {
                AsyncResult.h(this.a, ccdVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(lbdVarW, "create { emitter ->\n    …)\n            }\n        }");
        return lbdVarW;
    }
}
