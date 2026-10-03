package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.IndexedValue;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/paging/PageEvent;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
public final class CachedPageEventFlow$downstreamFlow$1<T> extends SuspendLambda implements Function2<FlowCollector<? super PageEvent<T>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u0002H\u008a@"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<IndexedValue<? extends PageEvent<T>>, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((IndexedValue) this.L$0) != null);
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@Nullable IndexedValue<? extends PageEvent<T>> indexedValue, @Nullable Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(indexedValue, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0018\u00010\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "indexedValue", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "emit", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<PageEvent<T>> $$this$flow;
        final /* synthetic */ Ref.IntRef $maxEventIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ref.IntRef intRef, FlowCollector<? super PageEvent<T>> flowCollector) {
            this.$maxEventIndex = intRef;
            this.$$this$flow = flowCollector;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((IndexedValue) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object emit(@Nullable IndexedValue<? extends PageEvent<T>> indexedValue, @NotNull Continuation<? super Unit> continuation) {
            CachedPageEventFlow$downstreamFlow$1$2$emit$1 cachedPageEventFlow$downstreamFlow$1$2$emit$1;
            if (continuation instanceof CachedPageEventFlow$downstreamFlow$1$2$emit$1) {
                cachedPageEventFlow$downstreamFlow$1$2$emit$1 = (CachedPageEventFlow$downstreamFlow$1$2$emit$1) continuation;
                int i = cachedPageEventFlow$downstreamFlow$1$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1 = new CachedPageEventFlow$downstreamFlow$1$2$emit$1(this, continuation);
                }
            } else {
                cachedPageEventFlow$downstreamFlow$1$2$emit$1 = new CachedPageEventFlow$downstreamFlow$1$2$emit$1(this, continuation);
            }
            Object obj = cachedPageEventFlow$downstreamFlow$1$2$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = cachedPageEventFlow$downstreamFlow$1$2$emit$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Intrinsics.checkNotNull(indexedValue);
                if (indexedValue.getIndex() > this.$maxEventIndex.element) {
                    FlowCollector<PageEvent<T>> flowCollector = this.$$this$flow;
                    PageEvent<T> value = indexedValue.getValue();
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.L$0 = this;
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.L$1 = indexedValue;
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.label = 1;
                    if (flowCollector.emit(value, cachedPageEventFlow$downstreamFlow$1$2$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            indexedValue = (IndexedValue) cachedPageEventFlow$downstreamFlow$1$2$emit$1.L$1;
            this = (AnonymousClass2) cachedPageEventFlow$downstreamFlow$1$2$emit$1.L$0;
            ResultKt.throwOnFailure(obj);
            this.$maxEventIndex.element = indexedValue.getIndex();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow<T> cachedPageEventFlow, Continuation<? super CachedPageEventFlow$downstreamFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = cachedPageEventFlow;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.this$0, continuation);
        cachedPageEventFlow$downstreamFlow$1.L$0 = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = Integer.MIN_VALUE;
            Flow flowTakeWhile = FlowKt.takeWhile(((CachedPageEventFlow) this.this$0).sharedForDownstream, new AnonymousClass1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(intRef, flowCollector);
            this.label = 1;
            if (flowTakeWhile.collect(anonymousClass2, this) == coroutine_suspended) {
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
    public final Object invoke(@NotNull FlowCollector<? super PageEvent<T>> flowCollector, @Nullable Continuation<? super Unit> continuation) {
        return ((CachedPageEventFlow$downstreamFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
