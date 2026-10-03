package com.heytap.health.base.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import com.oplus.aiunit.vision.bvf;
import com.oplus.aiunit.vision.juk;
import com.oplus.aiunit.vision.kig;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
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
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BM\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u00124\u0010\u0012\u001a0\b\u0001\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\t\u001a\u00020\u00072\u001a\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bRH\u0010\u0012\u001a0\b\u0001\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R'\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/base/utils/AsyncResultCoroutine;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/juk;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcom/oplus/aiunit/vision/bvf;", "", "callback", "a", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function2;", "Lkotlin/Result;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/jvm/functions/Function2;", "block", "Landroidx/lifecycle/MutableLiveData;", "c", "Lkotlin/Lazy;", "f", "()Landroidx/lifecycle/MutableLiveData;", "liveData", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAsyncResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncResult.kt\ncom/heytap/health/base/utils/AsyncResultCoroutine\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,148:1\n314#2,11:149\n*S KotlinDebug\n*F\n+ 1 AsyncResult.kt\ncom/heytap/health/base/utils/AsyncResultCoroutine\n*L\n112#1:149,11\n*E\n"})
public final class AsyncResultCoroutine<T> implements juk<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final CoroutineScope scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<Function1<? super Result<? extends T>, Unit>, Continuation<? super Unit>, Object> block;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy liveData;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncResultCoroutine(@NotNull CoroutineScope scope, @NotNull Function2<? super Function1<? super Result<? extends T>, Unit>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(block, "block");
        this.scope = scope;
        this.block = block;
        this.liveData = LazyKt__LazyJVMKt.lazy(new Function0<MutableLiveData<bvf<T>>>() { // from class: com.heytap.health.base.utils.AsyncResultCoroutine$liveData$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final MutableLiveData<bvf<T>> invoke() {
                return new MutableLiveData<>();
            }
        });
    }

    @Override // com.oplus.aiunit.vision.iuk
    public void a(@Nullable Function1<? super bvf<T>, Unit> callback) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AsyncResultCoroutine$toCallback$1(this, callback, null), 3, null);
    }

    @Override // com.oplus.aiunit.vision.juk
    @Nullable
    public Object b(@NotNull Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AsyncResultCoroutine$toCoroutine$2$1(this, cancellableContinuationImpl, null), 3, null);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final MutableLiveData<bvf<T>> f() {
        return (MutableLiveData) this.liveData.getValue();
    }

    public /* synthetic */ AsyncResultCoroutine(CoroutineScope coroutineScope, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kig.INSTANCE : coroutineScope, function2);
    }
}
