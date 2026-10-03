package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.functions.Function4;
import p010kotlin.jvm.internal.InlineMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0082\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00032?\b\u0004\u0010\b\u001a9\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001ah\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00110\u000329\b\u0004\u0010\b\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001ab\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00110\u000323\b\u0004\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001an\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0003\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u00032F\u0010\u0017\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a|\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00110\u00032\u0006\u0010\u001c\u001a\u0002H\u00042F\u0010\u0017\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001ap\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00110\u00032B\u0010\b\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u001f\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018¢\u0006\u0002\b!H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"NULL", "", "combineWithoutBatching", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "otherFlow", "transform", "Lkotlin/Function4;", "Landroidx/paging/CombineSource;", "Lkotlin/ParameterName;", "name", "updateFrom", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "simpleFlatMapLatest", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "value", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "simpleMapLatest", "simpleRunningReduce", "operation", "Lkotlin/Function3;", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "simpleScan", "initial", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "simpleTransformLatest", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ExtensionFunctionType;", "paging-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class FlowExtKt {

    @NotNull
    private static final Object NULL = new Object();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Landroidx/paging/SimpleProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2", f = "FlowExt.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n13644#2,3:225\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2\n*L\n145#1:225,3\n*E\n"})
    public static final class AnonymousClass2<R> extends SuspendLambda implements Function2<SimpleProducerScope<R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T2> $otherFlow;
        final /* synthetic */ Flow<T1> $this_combineWithoutBatching;
        final /* synthetic */ Function4<T1, T2, CombineSource, Continuation<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
        @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$2\n*L\n1#1,224:1\n*E\n"})
        public static final class C01052 extends Lambda implements Function0<Unit> {
            final /* synthetic */ CompletableJob $parentJob;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01052(CompletableJob completableJob) {
                super(0);
                this.$parentJob = completableJob;
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Job.DefaultImpls.cancel$default((Job) this.$parentJob, (CancellationException) null, 1, (Object) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Flow<? extends T1> flow, Flow<? extends T2> flow2, Function4<? super T1, ? super T2, ? super CombineSource, ? super Continuation<? super R>, ? extends Object> function4, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_combineWithoutBatching = flow;
            this.$otherFlow = flow2;
            this.$transform = function4;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_combineWithoutBatching, this.$otherFlow, this.$transform, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SimpleProducerScope<R> simpleProducerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(simpleProducerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.$transform, null));
                CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
                Flow[] flowArr = {this.$this_combineWithoutBatching, this.$otherFlow};
                int i2 = 0;
                int i3 = 0;
                while (i3 < 2) {
                    BuildersKt__Builders_commonKt.launch$default(simpleProducerScope, completableJobJob$default, null, new FlowExtKt$combineWithoutBatching$2$1$1(flowArr[i3], atomicInteger, simpleProducerScope, unbatchedFlowCombiner, i2, null), 2, null);
                    i3++;
                    i2++;
                }
                C01052 c01052 = new C01052(completableJobJob$default);
                this.label = 1;
                if (simpleProducerScope.awaitClose(c01052, this) == coroutine_suspended) {
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

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.$transform, null));
            CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            Flow[] flowArr = {this.$this_combineWithoutBatching, this.$otherFlow};
            int i = 0;
            int i2 = 0;
            while (i2 < 2) {
                int i3 = i + 1;
                BuildersKt__Builders_commonKt.launch$default(simpleProducerScope, completableJobJob$default, null, new FlowExtKt$combineWithoutBatching$2$1$1(flowArr[i2], atomicInteger, simpleProducerScope, unbatchedFlowCombiner, Integer.valueOf(i).intValue(), null), 2, null);
                Unit unit = Unit.INSTANCE;
                i2++;
                i = i3;
            }
            C01052 c01052 = new C01052(completableJobJob$default);
            InlineMarker.mark(0);
            simpleProducerScope.awaitClose(c01052, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleFlatMapLatest$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleFlatMapLatest$1", f = "FlowExt.kt", i = {}, l = {99, 99}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleFlatMapLatest$1\n*L\n1#1,224:1\n*E\n"})
    public static final class AnonymousClass1<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super Flow<? extends R>>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$transform = function2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.FlowExtKt$simpleFlatMapLatest$1<R, T> for r5v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p010kotlin.ResultKt.throwOnFailure(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                java.lang.Object r1 = r5.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                p010kotlin.ResultKt.throwOnFailure(r6)
                goto L39
            L22:
                p010kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r6 = r5.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> r4 = r5.$transform
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.emitAll(r1, r6, r5)
                if (r5 != r0) goto L47
                return r0
            L47:
                kotlin.Unit r5 = p010kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.FlowExtKt$simpleFlatMapLatest$1<R, T> for r2v3 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend$$forInline(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r3 = r2.L$0
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                java.lang.Object r0 = r2.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, java.lang.Object> r1 = r2.$transform
                java.lang.Object r0 = r1.invoke(r0, r2)
                kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
                r1 = 0
                p010kotlin.jvm.internal.InlineMarker.mark(r1)
                kotlinx.coroutines.flow.FlowKt.emitAll(r3, r0, r2)
                r2 = 1
                p010kotlin.jvm.internal.InlineMarker.mark(r2)
                kotlin.Unit r2 = p010kotlin.Unit.INSTANCE
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.AnonymousClass1.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        @Override // p010kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super R> flowCollector, T t, @Nullable Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, continuation);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.L$1 = t;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleMapLatest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleMapLatest$1", f = "FlowExt.kt", i = {}, l = {106, 106}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleMapLatest$1\n*L\n1#1,224:1\n*E\n"})
    public static final class C14021<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14021(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super C14021> continuation) {
            super(3, continuation);
            this.$transform = function2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.FlowExtKt$simpleMapLatest$1<R, T> for r5v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p010kotlin.ResultKt.throwOnFailure(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                java.lang.Object r1 = r5.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                p010kotlin.ResultKt.throwOnFailure(r6)
                goto L39
            L22:
                p010kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r6 = r5.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r5.$transform
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r5 = r1.emit(r6, r5)
                if (r5 != r0) goto L45
                return r0
            L45:
                kotlin.Unit r5 = p010kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C14021.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.FlowExtKt$simpleMapLatest$1<R, T> for r2v3 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend$$forInline(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r3 = r2.L$0
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                java.lang.Object r0 = r2.L$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r2.$transform
                java.lang.Object r0 = r1.invoke(r0, r2)
                r1 = 0
                p010kotlin.jvm.internal.InlineMarker.mark(r1)
                r3.emit(r0, r2)
                r2 = 1
                p010kotlin.jvm.internal.InlineMarker.mark(r2)
                kotlin.Unit r2 = p010kotlin.Unit.INSTANCE
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C14021.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        @Override // p010kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super R> flowCollector, T t, @Nullable Continuation<? super Unit> continuation) {
            C14021 c14021 = new C14021(this.$transform, continuation);
            c14021.L$0 = flowCollector;
            c14021.L$1 = t;
            return c14021.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14031<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> $operation;
        final /* synthetic */ Flow<T> $this_simpleRunningReduce;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C01061<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<T> $$this$flow;
            final /* synthetic */ Ref.ObjectRef<Object> $accumulator;
            final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> $operation;

            /* JADX WARN: Multi-variable type inference failed */
            public C01061(Ref.ObjectRef<Object> objectRef, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, FlowCollector<? super T> flowCollector) {
                this.$accumulator = objectRef;
                this.$operation = function3;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x007e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
                FlowExtKt$simpleRunningReduce$1$1$emit$1 flowExtKt$simpleRunningReduce$1$1$emit$1;
                Ref.ObjectRef<Object> objectRef;
                C01061<T> c01061;
                Ref.ObjectRef<Object> objectRef2;
                FlowCollector<T> flowCollector;
                T t2;
                if (continuation instanceof FlowExtKt$simpleRunningReduce$1$1$emit$1) {
                    flowExtKt$simpleRunningReduce$1$1$emit$1 = (FlowExtKt$simpleRunningReduce$1$1$emit$1) continuation;
                    int i = flowExtKt$simpleRunningReduce$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        flowExtKt$simpleRunningReduce$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        flowExtKt$simpleRunningReduce$1$1$emit$1 = new FlowExtKt$simpleRunningReduce$1$1$emit$1(this, continuation);
                    }
                } else {
                    flowExtKt$simpleRunningReduce$1$1$emit$1 = new FlowExtKt$simpleRunningReduce$1$1$emit$1(this, continuation);
                }
                Object obj = flowExtKt$simpleRunningReduce$1$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = flowExtKt$simpleRunningReduce$1$1$emit$1.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        objectRef2 = (Ref.ObjectRef) flowExtKt$simpleRunningReduce$1$1$emit$1.L$1;
                        c01061 = (C01061) flowExtKt$simpleRunningReduce$1$1$emit$1.L$0;
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
                objectRef = this.$accumulator;
                if (objectRef.element != FlowExtKt.NULL) {
                    Function3<T, T, Continuation<? super T>, Object> function3 = this.$operation;
                    T t3 = this.$accumulator.element;
                    flowExtKt$simpleRunningReduce$1$1$emit$1.L$0 = this;
                    flowExtKt$simpleRunningReduce$1$1$emit$1.L$1 = objectRef;
                    flowExtKt$simpleRunningReduce$1$1$emit$1.label = 1;
                    Object objInvoke = function3.invoke(t3, t, flowExtKt$simpleRunningReduce$1$1$emit$1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c01061 = this;
                    objectRef2 = objectRef;
                    obj = objInvoke;
                }
                objectRef.element = t;
                flowCollector = this.$$this$flow;
                t2 = this.$accumulator.element;
                flowExtKt$simpleRunningReduce$1$1$emit$1.L$0 = null;
                flowExtKt$simpleRunningReduce$1$1$emit$1.L$1 = null;
                flowExtKt$simpleRunningReduce$1$1$emit$1.label = 2;
                if (flowCollector.emit(t2, flowExtKt$simpleRunningReduce$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
                Object obj2 = obj;
                objectRef = objectRef2;
                this = c01061;
                t = (T) obj2;
                objectRef.element = t;
                flowCollector = this.$$this$flow;
                t2 = this.$accumulator.element;
                flowExtKt$simpleRunningReduce$1$1$emit$1.L$0 = null;
                flowExtKt$simpleRunningReduce$1$1$emit$1.L$1 = null;
                flowExtKt$simpleRunningReduce$1$1$emit$1.label = 2;
                if (flowCollector.emit(t2, flowExtKt$simpleRunningReduce$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14031(Flow<? extends T> flow, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, Continuation<? super C14031> continuation) {
            super(2, continuation);
            this.$this_simpleRunningReduce = flow;
            this.$operation = function3;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C14031 c14031 = new C14031(this.$this_simpleRunningReduce, this.$operation, continuation);
            c14031.L$0 = obj;
            return c14031;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) FlowExtKt.NULL;
                Flow<T> flow = this.$this_simpleRunningReduce;
                C01061 c01061 = new C01061(objectRef, this.$operation, flowCollector);
                this.label = 1;
                if (flow.collect(c01061, this) == coroutine_suspended) {
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
        public final Object invoke(@NotNull FlowCollector<? super T> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((C14031) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleScan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", i = {0, 0}, l = {55, 56}, m = "invokeSuspend", n = {"$this$flow", "accumulator"}, s = {"L$0", "L$1"})
    public static final class C14041<R> extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ R $initial;
        final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;
        final /* synthetic */ Flow<T> $this_simpleScan;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleScan$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C01071<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<R> $$this$flow;
            final /* synthetic */ Ref.ObjectRef<R> $accumulator;
            final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;

            /* JADX WARN: Multi-variable type inference failed */
            public C01071(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, FlowCollector<? super R> flowCollector) {
                this.$accumulator = objectRef;
                this.$operation = function3;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
                FlowExtKt$simpleScan$1$1$emit$1 flowExtKt$simpleScan$1$1$emit$1;
                C01071<T> c01071;
                Ref.ObjectRef<R> objectRef;
                if (continuation instanceof FlowExtKt$simpleScan$1$1$emit$1) {
                    flowExtKt$simpleScan$1$1$emit$1 = (FlowExtKt$simpleScan$1$1$emit$1) continuation;
                    int i = flowExtKt$simpleScan$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        flowExtKt$simpleScan$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        flowExtKt$simpleScan$1$1$emit$1 = new FlowExtKt$simpleScan$1$1$emit$1(this, continuation);
                    }
                } else {
                    flowExtKt$simpleScan$1$1$emit$1 = new FlowExtKt$simpleScan$1$1$emit$1(this, continuation);
                }
                Object obj = flowExtKt$simpleScan$1$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = flowExtKt$simpleScan$1$1$emit$1.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        objectRef = (Ref.ObjectRef) flowExtKt$simpleScan$1$1$emit$1.L$1;
                        c01071 = (C01071) flowExtKt$simpleScan$1$1$emit$1.L$0;
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
                Ref.ObjectRef<R> objectRef2 = this.$accumulator;
                Function3<R, T, Continuation<? super R>, Object> function3 = this.$operation;
                R r = objectRef2.element;
                flowExtKt$simpleScan$1$1$emit$1.L$0 = this;
                flowExtKt$simpleScan$1$1$emit$1.L$1 = objectRef2;
                flowExtKt$simpleScan$1$1$emit$1.label = 1;
                Object objInvoke = function3.invoke(r, t, flowExtKt$simpleScan$1$1$emit$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c01071 = this;
                objectRef = objectRef2;
                obj = (T) objInvoke;
                objectRef.element = (T) obj;
                FlowCollector<R> flowCollector = c01071.$$this$flow;
                R r2 = c01071.$accumulator.element;
                flowExtKt$simpleScan$1$1$emit$1.L$0 = null;
                flowExtKt$simpleScan$1$1$emit$1.L$1 = null;
                flowExtKt$simpleScan$1$1$emit$1.label = 2;
                if (flowCollector.emit(r2, flowExtKt$simpleScan$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14041(R r, Flow<? extends T> flow, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super C14041> continuation) {
            super(2, continuation);
            this.$initial = r;
            this.$this_simpleScan = flow;
            this.$operation = function3;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C14041 c14041 = new C14041(this.$initial, this.$this_simpleScan, this.$operation, continuation);
            c14041.L$0 = obj;
            return c14041;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to androidx.paging.FlowExtKt$simpleScan$1<R> for r6v4 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p010kotlin.ResultKt.throwOnFailure(r7)
                goto L5b
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                java.lang.Object r1 = r6.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r3 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
                p010kotlin.ResultKt.throwOnFailure(r7)
                goto L44
            L26:
                p010kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                R r4 = r6.$initial
                r1.element = r4
                r6.L$0 = r7
                r6.L$1 = r1
                r6.label = r3
                java.lang.Object r3 = r7.emit(r4, r6)
                if (r3 != r0) goto L43
                return r0
            L43:
                r3 = r7
            L44:
                kotlinx.coroutines.flow.Flow<T> r7 = r6.$this_simpleScan
                androidx.paging.FlowExtKt$simpleScan$1$1 r4 = new androidx.paging.FlowExtKt$simpleScan$1$1
                kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r6.$operation
                r4.<init>(r1, r5, r3)
                r1 = 0
                r6.L$0 = r1
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r6 = r7.collect(r4, r6)
                if (r6 != r0) goto L5b
                return r0
            L5b:
                kotlin.Unit r6 = p010kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C14041.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super R> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((C14041) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Landroidx/paging/SimpleProducerScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14051<R> extends SuspendLambda implements Function2<SimpleProducerScope<R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<T> $this_simpleTransformLatest;
        final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
        public static final class C01081<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
            final /* synthetic */ ChannelFlowCollector<R> $collector;
            final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> $transform;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01081(Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, ChannelFlowCollector<R> channelFlowCollector, Continuation<? super C01081> continuation) {
                super(2, continuation);
                this.$transform = function3;
                this.$collector = channelFlowCollector;
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C01081 c01081 = new C01081(this.$transform, this.$collector, continuation);
                c01081.L$0 = obj;
                return c01081;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.FlowExtKt$simpleTransformLatest$1$1<T> for r4v4 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.label
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    p010kotlin.ResultKt.throwOnFailure(r5)
                    goto L29
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L17:
                    p010kotlin.ResultKt.throwOnFailure(r5)
                    java.lang.Object r5 = r4.L$0
                    kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r4.$transform
                    androidx.paging.ChannelFlowCollector<R> r3 = r4.$collector
                    r4.label = r2
                    java.lang.Object r4 = r1.invoke(r3, r5, r4)
                    if (r4 != r0) goto L29
                    return r0
                L29:
                    kotlin.Unit r4 = p010kotlin.Unit.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C14051.C01081.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p010kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(T t, @Nullable Continuation<? super Unit> continuation) {
                return ((C01081) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14051(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C14051> continuation) {
            super(2, continuation);
            this.$this_simpleTransformLatest = flow;
            this.$transform = function3;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C14051 c14051 = new C14051(this.$this_simpleTransformLatest, this.$transform, continuation);
            c14051.L$0 = obj;
            return c14051;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SimpleProducerScope<R> simpleProducerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C14051) create(simpleProducerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                Flow<T> flow = this.$this_simpleTransformLatest;
                C01081 c01081 = new C01081(this.$transform, new ChannelFlowCollector(simpleProducerScope), null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c01081, this) == coroutine_suspended) {
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
    }

    @Nullable
    public static final <T1, T2, R> Object combineWithoutBatching(@NotNull Flow<? extends T1> flow, @NotNull Flow<? extends T2> flow2, @NotNull Function4<? super T1, ? super T2, ? super CombineSource, ? super Continuation<? super R>, ? extends Object> function4, @NotNull Continuation<? super Flow<? extends R>> continuation) {
        return SimpleChannelFlowKt.simpleChannelFlow(new AnonymousClass2(flow, flow2, function4, null));
    }

    @NotNull
    public static final <T, R> Flow<R> simpleFlatMapLatest(@NotNull Flow<? extends T> flow, @NotNull Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return simpleTransformLatest(flow, new AnonymousClass1(transform, null));
    }

    @NotNull
    public static final <T, R> Flow<R> simpleMapLatest(@NotNull Flow<? extends T> flow, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return simpleTransformLatest(flow, new C14021(transform, null));
    }

    @NotNull
    public static final <T> Flow<T> simpleRunningReduce(@NotNull Flow<? extends T> flow, @NotNull Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> operation) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return FlowKt.flow(new C14031(flow, operation, null));
    }

    @NotNull
    public static final <T, R> Flow<R> simpleScan(@NotNull Flow<? extends T> flow, R r, @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> operation) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return FlowKt.flow(new C14041(r, flow, operation, null));
    }

    @NotNull
    public static final <T, R> Flow<R> simpleTransformLatest(@NotNull Flow<? extends T> flow, @NotNull Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SimpleChannelFlowKt.simpleChannelFlow(new C14051(flow, transform, null));
    }
}
