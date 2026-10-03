package androidx.paging;

import com.oplus.aiunit.vision.ixb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 !*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001!B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0011\u0010\u0015\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J\u001c\u0010 \u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J4\u0010\u001a\u001a\u00020\u0014*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0002R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/paging/RemoteMediatorAccessImpl;", "Key", "", "Value", "Landroidx/paging/RemoteMediatorAccessor;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "remoteMediator", "Landroidx/paging/RemoteMediator;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/paging/RemoteMediator;)V", "accessorState", "Landroidx/paging/AccessorStateHolder;", "isolationRunner", "Landroidx/paging/SingleRunner;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/paging/LoadStates;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "allowRefresh", "", "initialize", "Landroidx/paging/RemoteMediator$InitializeAction;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchBoundary", "launchRefresh", "requestLoad", "loadType", "Landroidx/paging/LoadType;", "pagingState", "Landroidx/paging/PagingState;", "requestRefreshIfAllowed", "retryFailed", "Companion", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRemoteMediatorAccessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/RemoteMediatorAccessImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,460:1\n1855#2,2:461\n*S KotlinDebug\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/RemoteMediatorAccessImpl\n*L\n439#1:461,2\n*E\n"})
final class RemoteMediatorAccessImpl<Key, Value> implements RemoteMediatorAccessor<Key, Value> {
    private static final int PRIORITY_APPEND_PREPEND = 1;
    private static final int PRIORITY_REFRESH = 2;

    @NotNull
    private final AccessorStateHolder<Key, Value> accessorState;

    @NotNull
    private final SingleRunner isolationRunner;

    @NotNull
    private final RemoteMediator<Key, Value> remoteMediator;

    @NotNull
    private final CoroutineScope scope;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$initialize$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", i = {0}, l = {445}, m = "initialize", n = {"this"}, s = {"L$0"})
    public static final class C14251 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14251(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super C14251> continuation) {
            super(continuation);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.initialize(this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {386}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\u008a@"}, d2 = {"", "Key", "Value", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {ixb.DIVE_APNEA_ALARM}, m = "invokeSuspend", n = {"loadType"}, s = {"L$0"})
        public static final class C01141 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01141(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super C01141> continuation) {
                super(1, continuation);
                this.this$0 = remoteMediatorAccessImpl;
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new C01141(this.this$0, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002e  */
            /* JADX WARN: Code duplicated, block: B:13:0x0031  */
            /* JADX WARN: Code duplicated, block: B:15:0x004d A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:18:0x0054  */
            /* JADX WARN: Code duplicated, block: B:19:0x0063  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004b -> B:16:0x004e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x0054
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.label
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r5.L$0
                    androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                    p010kotlin.ResultKt.throwOnFailure(r6)
                    goto L4e
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L1b:
                    p010kotlin.ResultKt.throwOnFailure(r6)
                L1e:
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r6 = r5.this$0
                    androidx.paging.AccessorStateHolder r6 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r6)
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1 r1 = new p010kotlin.jvm.functions.Function1<androidx.paging.AccessorState<Key, Value>, p010kotlin.Pair<? extends androidx.paging.LoadType, ? extends androidx.paging.PagingState<Key, Value>>>() { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1
                        static {
                            /*
                                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1 r0 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1) androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1.INSTANCE androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C14261.C01141.C01151.<clinit>():void");
                        }

                        {
                            /*
                                r1 = this;
                                r0 = 1
                                r1.<init>(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C14261.C01141.C01151.<init>():void");
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                            /*
                                r0 = this;
                                androidx.paging.AccessorState r1 = (androidx.paging.AccessorState) r1
                                kotlin.Pair r0 = r0.invoke(r1)
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C14261.C01141.C01151.invoke(java.lang.Object):java.lang.Object");
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        @org.jetbrains.annotations.Nullable
                        public final p010kotlin.Pair<androidx.paging.LoadType, androidx.paging.PagingState<Key, Value>> invoke(@org.jetbrains.annotations.NotNull androidx.paging.AccessorState<Key, Value> r1) {
                            /*
                                r0 = this;
                                java.lang.String r0 = "it"
                                p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                                kotlin.Pair r0 = r1.getPendingBoundary()
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C14261.C01141.C01151.invoke(androidx.paging.AccessorState):kotlin.Pair");
                        }
                    }
                    java.lang.Object r6 = r6.use(r1)
                    kotlin.Pair r6 = (p010kotlin.Pair) r6
                    if (r6 != 0) goto L31
                    kotlin.Unit r5 = p010kotlin.Unit.INSTANCE
                    return r5
                L31:
                    java.lang.Object r1 = r6.component1()
                    androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                    java.lang.Object r6 = r6.component2()
                    androidx.paging.PagingState r6 = (androidx.paging.PagingState) r6
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r3 = r5.this$0
                    androidx.paging.RemoteMediator r3 = androidx.paging.RemoteMediatorAccessImpl.access$getRemoteMediator$p(r3)
                    r5.L$0 = r1
                    r5.label = r2
                    java.lang.Object r6 = r3.load(r1, r6, r5)
                    if (r6 != r0) goto L4e
                    return r0
                L4e:
                    androidx.paging.RemoteMediator$MediatorResult r6 = (androidx.paging.RemoteMediator.MediatorResult) r6
                    boolean r3 = r6 instanceof androidx.paging.RemoteMediator.MediatorResult.Success
                    if (r3 == 0) goto L63
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r3 = r5.this$0
                    androidx.paging.AccessorStateHolder r3 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r3)
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$2 r4 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$2
                    r4.<init>()
                    r3.use(r4)
                    goto L1e
                L63:
                    boolean r3 = r6 instanceof androidx.paging.RemoteMediator.MediatorResult.Error
                    if (r3 == 0) goto L1e
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r3 = r5.this$0
                    androidx.paging.AccessorStateHolder r3 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r3)
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$3 r4 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$3
                    r4.<init>()
                    r3.use(r4)
                    goto L1e
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C14261.C01141.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((C01141) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14261(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super C14261> continuation) {
            super(2, continuation);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C14261(this.this$0, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SingleRunner singleRunner = ((RemoteMediatorAccessImpl) this.this$0).isolationRunner;
                C01141 c01141 = new C01141(this.this$0, null);
                this.label = 1;
                if (singleRunner.runInIsolation(1, c01141, this) == coroutine_suspended) {
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
            return ((C14261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {314}, m = "invokeSuspend", n = {"launchAppendPrepend"}, s = {"L$0"})
    public static final class C14271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\u008a@"}, d2 = {"", "Key", "Value", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
        public static final class C01161 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.BooleanRef $launchAppendPrepend;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01161(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Ref.BooleanRef booleanRef, Continuation<? super C01161> continuation) {
                super(1, continuation);
                this.this$0 = remoteMediatorAccessImpl;
                this.$launchAppendPrepend = booleanRef;
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new C01161(this.this$0, this.$launchAppendPrepend, continuation);
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl;
                Ref.BooleanRef booleanRef;
                boolean zBooleanValue;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PagingState<Key, Value> pagingState = (PagingState) ((RemoteMediatorAccessImpl) this.this$0).accessorState.use(new Function1<AccessorState<Key, Value>, PagingState<Key, Value>>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$pendingPagingState$1
                        @Override // p010kotlin.jvm.functions.Function1
                        @Nullable
                        public final PagingState<Key, Value> invoke(@NotNull AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getPendingRefresh();
                        }
                    });
                    if (pagingState != null) {
                        RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl2 = this.this$0;
                        Ref.BooleanRef booleanRef2 = this.$launchAppendPrepend;
                        RemoteMediator remoteMediator = ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl2).remoteMediator;
                        LoadType loadType = LoadType.REFRESH;
                        this.L$0 = remoteMediatorAccessImpl2;
                        this.L$1 = booleanRef2;
                        this.label = 1;
                        obj = remoteMediator.load(loadType, pagingState, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        remoteMediatorAccessImpl = remoteMediatorAccessImpl2;
                        booleanRef = booleanRef2;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.L$1;
                remoteMediatorAccessImpl = (RemoteMediatorAccessImpl) this.L$0;
                ResultKt.throwOnFailure(obj);
                final RemoteMediator.MediatorResult mediatorResult = (RemoteMediator.MediatorResult) obj;
                if (mediatorResult instanceof RemoteMediator.MediatorResult.Success) {
                    zBooleanValue = ((Boolean) ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$1
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(@NotNull AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LoadType loadType2 = LoadType.REFRESH;
                            it.clearPendingRequest(loadType2);
                            if (((RemoteMediator.MediatorResult.Success) mediatorResult).getEndOfPaginationReached()) {
                                AccessorState.BlockState blockState = AccessorState.BlockState.COMPLETED;
                                it.setBlockState(loadType2, blockState);
                                it.setBlockState(LoadType.PREPEND, blockState);
                                it.setBlockState(LoadType.APPEND, blockState);
                                it.clearPendingRequests();
                            } else {
                                LoadType loadType3 = LoadType.PREPEND;
                                AccessorState.BlockState blockState2 = AccessorState.BlockState.UNBLOCKED;
                                it.setBlockState(loadType3, blockState2);
                                it.setBlockState(LoadType.APPEND, blockState2);
                            }
                            it.setError(LoadType.PREPEND, null);
                            it.setError(LoadType.APPEND, null);
                            return Boolean.valueOf(it.getPendingBoundary() != null);
                        }
                    })).booleanValue();
                } else {
                    if (!(mediatorResult instanceof RemoteMediator.MediatorResult.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zBooleanValue = ((Boolean) ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$2
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(@NotNull AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LoadType loadType2 = LoadType.REFRESH;
                            it.clearPendingRequest(loadType2);
                            it.setError(loadType2, new LoadState.Error(((RemoteMediator.MediatorResult.Error) mediatorResult).getThrowable()));
                            return Boolean.valueOf(it.getPendingBoundary() != null);
                        }
                    })).booleanValue();
                }
                booleanRef.element = zBooleanValue;
                return Unit.INSTANCE;
            }

            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((C01161) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14271(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super C14271> continuation) {
            super(2, continuation);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C14271(this.this$0, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                SingleRunner singleRunner = ((RemoteMediatorAccessImpl) this.this$0).isolationRunner;
                C01161 c01161 = new C01161(this.this$0, booleanRef2, null);
                this.L$0 = booleanRef2;
                this.label = 1;
                if (singleRunner.runInIsolation(2, c01161, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (booleanRef.element) {
                this.this$0.launchBoundary();
            }
            return Unit.INSTANCE;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C14271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public RemoteMediatorAccessImpl(@NotNull CoroutineScope scope, @NotNull RemoteMediator<Key, Value> remoteMediator) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(remoteMediator, "remoteMediator");
        this.scope = scope;
        this.remoteMediator = remoteMediator;
        this.accessorState = new AccessorStateHolder<>();
        this.isolationRunner = new SingleRunner(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBoundary() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C14261(this, null), 3, null);
    }

    private final void launchRefresh() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C14271(this, null), 3, null);
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void allowRefresh() {
        this.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl.allowRefresh.1
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AccessorState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull AccessorState<Key, Value> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setRefreshAllowed(true);
            }
        });
    }

    @Override // androidx.paging.RemoteMediatorAccessor
    @NotNull
    public StateFlow<LoadStates> getState() {
        return this.accessorState.getLoadStates();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.RemoteMediatorAccessor
    @Nullable
    public Object initialize(@NotNull Continuation<? super RemoteMediator.InitializeAction> continuation) {
        C14251 c14251;
        if (continuation instanceof C14251) {
            c14251 = (C14251) continuation;
            int i = c14251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14251.label = i - Integer.MIN_VALUE;
            } else {
                c14251 = new C14251(this, continuation);
            }
        } else {
            c14251 = new C14251(this, continuation);
        }
        Object objInitialize = c14251.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c14251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInitialize);
            RemoteMediator<Key, Value> remoteMediator = this.remoteMediator;
            c14251.L$0 = this;
            c14251.label = 1;
            objInitialize = remoteMediator.initialize(c14251);
            if (objInitialize == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (RemoteMediatorAccessImpl) c14251.L$0;
            ResultKt.throwOnFailure(objInitialize);
        }
        if (((RemoteMediator.InitializeAction) objInitialize) == RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH) {
            this.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl$initialize$2$1
                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke((AccessorState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull AccessorState<Key, Value> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    LoadType loadType = LoadType.APPEND;
                    AccessorState.BlockState blockState = AccessorState.BlockState.REQUIRES_REFRESH;
                    it.setBlockState(loadType, blockState);
                    it.setBlockState(LoadType.PREPEND, blockState);
                }
            });
        }
        return objInitialize;
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void requestLoad(@NotNull LoadType loadType, @NotNull PagingState<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        requestLoad(this.accessorState, loadType, pagingState);
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void requestRefreshIfAllowed(@NotNull final PagingState<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        this.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>(this) { // from class: androidx.paging.RemoteMediatorAccessImpl.requestRefreshIfAllowed.1
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AccessorState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull AccessorState<Key, Value> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getRefreshAllowed()) {
                    it.setRefreshAllowed(false);
                    RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl = this.this$0;
                    remoteMediatorAccessImpl.requestLoad(((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState, LoadType.REFRESH, pagingState);
                }
            }
        });
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void retryFailed(@NotNull PagingState<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        final ArrayList arrayList = new ArrayList();
        this.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl.retryFailed.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AccessorState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull AccessorState<Key, Value> accessorState) {
                Intrinsics.checkNotNullParameter(accessorState, "accessorState");
                LoadStates loadStatesComputeLoadStates = accessorState.computeLoadStates();
                boolean z = loadStatesComputeLoadStates.getRefresh() instanceof LoadState.Error;
                accessorState.clearErrors();
                if (z) {
                    List<LoadType> list = arrayList;
                    LoadType loadType = LoadType.REFRESH;
                    list.add(loadType);
                    accessorState.setBlockState(loadType, AccessorState.BlockState.UNBLOCKED);
                }
                if (loadStatesComputeLoadStates.getAppend() instanceof LoadState.Error) {
                    if (!z) {
                        arrayList.add(LoadType.APPEND);
                    }
                    accessorState.clearPendingRequest(LoadType.APPEND);
                }
                if (loadStatesComputeLoadStates.getPrepend() instanceof LoadState.Error) {
                    if (!z) {
                        arrayList.add(LoadType.PREPEND);
                    }
                    accessorState.clearPendingRequest(LoadType.PREPEND);
                }
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            requestLoad((LoadType) it.next(), pagingState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestLoad(AccessorStateHolder<Key, Value> accessorStateHolder, final LoadType loadType, final PagingState<Key, Value> pagingState) {
        if (((Boolean) accessorStateHolder.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$requestLoad$newRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull AccessorState<Key, Value> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.add(loadType, pagingState));
            }
        })).booleanValue()) {
            if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
                launchRefresh();
            } else {
                launchBoundary();
            }
        }
    }
}
