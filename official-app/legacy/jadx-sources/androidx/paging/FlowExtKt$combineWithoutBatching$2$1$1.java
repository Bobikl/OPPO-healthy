package androidx.paging;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1\n*L\n1#1,224:1\n*E\n"})
public final class FlowExtKt$combineWithoutBatching$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SimpleProducerScope<R> $$this$simpleChannelFlow;
    final /* synthetic */ Flow<Object> $flow;
    final /* synthetic */ AtomicInteger $incompleteFlows;
    final /* synthetic */ int $index;
    final /* synthetic */ UnbatchedFlowCombiner<T1, T2> $unbatchedFlowCombiner;
    int label;

    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1\n*L\n1#1,224:1\n*E\n"})
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ int $index;
        final /* synthetic */ UnbatchedFlowCombiner<T1, T2> $unbatchedFlowCombiner;

        public AnonymousClass1(UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, int i) {
            this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
            this.$index = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 flowExtKt$combineWithoutBatching$2$1$1$1$emit$1;
            if (continuation instanceof FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1) {
                flowExtKt$combineWithoutBatching$2$1$1$1$emit$1 = (FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1) continuation;
                int i = flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowExtKt$combineWithoutBatching$2$1$1$1$emit$1 = new FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1(this, continuation);
                }
            } else {
                flowExtKt$combineWithoutBatching$2$1$1$1$emit$1 = new FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1(this, continuation);
            }
            Object obj2 = flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj2);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj2);
            UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner = this.$unbatchedFlowCombiner;
            int i3 = this.$index;
            flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.label = 1;
            if (unbatchedFlowCombiner.onNext(i3, obj, flowExtKt$combineWithoutBatching$2$1$1$1$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.label = 2;
            if (YieldKt.yield(flowExtKt$combineWithoutBatching$2$1$1$1$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$1$1(Flow<? extends Object> flow, AtomicInteger atomicInteger, SimpleProducerScope<R> simpleProducerScope, UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, int i, Continuation<? super FlowExtKt$combineWithoutBatching$2$1$1> continuation) {
        super(2, continuation);
        this.$flow = flow;
        this.$incompleteFlows = atomicInteger;
        this.$$this$simpleChannelFlow = simpleProducerScope;
        this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
        this.$index = i;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowExtKt$combineWithoutBatching$2$1$1(this.$flow, this.$incompleteFlows, this.$$this$simpleChannelFlow, this.$unbatchedFlowCombiner, this.$index, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Object> flow = this.$flow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$unbatchedFlowCombiner, this.$index);
                this.label = 1;
                if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.$incompleteFlows.decrementAndGet() == 0) {
                SendChannel.DefaultImpls.close$default(this.$$this$simpleChannelFlow, null, 1, null);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (this.$incompleteFlows.decrementAndGet() == 0) {
                SendChannel.DefaultImpls.close$default(this.$$this$simpleChannelFlow, null, 1, null);
            }
            throw th;
        }
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowExtKt$combineWithoutBatching$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
