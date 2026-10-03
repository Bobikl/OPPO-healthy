package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.IndexedValue;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class CachedPageEventFlow$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<PageEvent<T>> $src;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$job$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "it", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "emit", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ CachedPageEventFlow<T> this$0;

        public AnonymousClass1(CachedPageEventFlow<T> cachedPageEventFlow) {
            this.this$0 = cachedPageEventFlow;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((IndexedValue) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object emit(@NotNull IndexedValue<? extends PageEvent<T>> indexedValue, @NotNull Continuation<? super Unit> continuation) {
            CachedPageEventFlow$job$1$1$emit$1 cachedPageEventFlow$job$1$1$emit$1;
            if (continuation instanceof CachedPageEventFlow$job$1$1$emit$1) {
                cachedPageEventFlow$job$1$1$emit$1 = (CachedPageEventFlow$job$1$1$emit$1) continuation;
                int i = cachedPageEventFlow$job$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cachedPageEventFlow$job$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    cachedPageEventFlow$job$1$1$emit$1 = new CachedPageEventFlow$job$1$1$emit$1(this, continuation);
                }
            } else {
                cachedPageEventFlow$job$1$1$emit$1 = new CachedPageEventFlow$job$1$1$emit$1(this, continuation);
            }
            Object obj = cachedPageEventFlow$job$1$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = cachedPageEventFlow$job$1$1$emit$1.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    indexedValue = (IndexedValue) cachedPageEventFlow$job$1$1$emit$1.L$1;
                    this = (AnonymousClass1) cachedPageEventFlow$job$1$1$emit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = ((CachedPageEventFlow) this.this$0).mutableSharedSrc;
            cachedPageEventFlow$job$1$1$emit$1.L$0 = this;
            cachedPageEventFlow$job$1$1$emit$1.L$1 = indexedValue;
            cachedPageEventFlow$job$1$1$emit$1.label = 1;
            if (mutableSharedFlow.emit(indexedValue, cachedPageEventFlow$job$1$1$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            FlattenedPageController flattenedPageController = ((CachedPageEventFlow) this.this$0).pageController;
            cachedPageEventFlow$job$1$1$emit$1.L$0 = null;
            cachedPageEventFlow$job$1$1$emit$1.L$1 = null;
            cachedPageEventFlow$job$1$1$emit$1.label = 2;
            if (flattenedPageController.record(indexedValue, cachedPageEventFlow$job$1$1$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CachedPageEventFlow$job$1(Flow<? extends PageEvent<T>> flow, CachedPageEventFlow<T> cachedPageEventFlow, Continuation<? super CachedPageEventFlow$job$1> continuation) {
        super(2, continuation);
        this.$src = flow;
        this.this$0 = cachedPageEventFlow;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CachedPageEventFlow$job$1(this.$src, this.this$0, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowWithIndex = FlowKt.withIndex(this.$src);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (flowWithIndex.collect(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CachedPageEventFlow$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
