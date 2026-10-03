package com.heytap.health.devicepair.manager.task;

import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.devicepair.manager.a;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b93;
import com.oplus.aiunit.vision.dc5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.t93;
import com.oplus.aiunit.vision.v83;
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
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/TaskCheckSupportVersion;", "Lcom/heytap/health/devicepair/manager/a;", "Lcom/heytap/health/devicepair/manager/ResultData;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "s", "Lcom/oplus/aiunit/vision/t93;", LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/t93;", "checkSupportCallback", "", "n", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "", "o", "I", "NOT_NETWORK", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;Lcom/oplus/aiunit/vision/t93;)V", "Companion", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskCheckSupportVersion extends a {
    public static final int MSG_ANDROID_NOT_SUPPORT = 132;
    public static final int MSG_DEVICE_MODEL_NOT_SUPPORT = 133;
    public static final int MSG_NEED_UPDATE = 131;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final t93 checkSupportCallback;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int NOT_NETWORK;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/devicepair/manager/task/TaskCheckSupportVersion$b", "Lcom/oplus/aiunit/vision/v83;", "", "onSuccess", "", "tips", "a", "error", "onFail", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements v83 {
        public final /* synthetic */ Continuation<ResultData> a;
        public final /* synthetic */ TaskCheckSupportVersion b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Continuation<? super ResultData> continuation, TaskCheckSupportVersion taskCheckSupportVersion) {
            this.a = continuation;
            this.b = taskCheckSupportVersion;
        }

        @Override // com.oplus.aiunit.vision.v83
        public void a(@NotNull String tips) {
            Intrinsics.checkNotNullParameter(tips, "tips");
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(this.b.b(132, ResultData.PairFailType.NORMAL, tips)));
        }

        @Override // com.oplus.aiunit.vision.v83
        public void onFail(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(a.c(this.b, 0, ResultData.PairFailType.NORMAL, "checkSupportVersion onError," + error, 1, null)));
        }

        @Override // com.oplus.aiunit.vision.v83
        public void onSuccess() {
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(ResultData.Companion.d(ResultData.INSTANCE, 0, "android version support", 1, null)));
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/heytap/health/devicepair/manager/task/TaskCheckSupportVersion$c", "Lcom/oplus/aiunit/vision/b93;", "", "c", "", "errorCode", "", "errMsg", "b", "a", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements b93 {
        public final /* synthetic */ Continuation<ResultData> a;
        public final /* synthetic */ TaskCheckSupportVersion b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Continuation<? super ResultData> continuation, TaskCheckSupportVersion taskCheckSupportVersion) {
            this.a = continuation;
            this.b = taskCheckSupportVersion;
        }

        @Override // com.oplus.aiunit.vision.b93
        public void a() {
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(ResultData.Companion.d(ResultData.INSTANCE, 0, "support,next", 1, null)));
        }

        @Override // com.oplus.aiunit.vision.b93
        public void b(int errorCode, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            int i = errorCode == 22202 ? 133 : 0;
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(this.b.b(i, ResultData.PairFailType.NORMAL, "checkSupportVersion onUnsupported,msg:" + errMsg)));
        }

        @Override // com.oplus.aiunit.vision.b93
        public void c() {
            Continuation<ResultData> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(this.b.b(131, ResultData.PairFailType.NORMAL, "checkSupportVersion need update app")));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskCheckSupportVersion(@NotNull PairContext pairContext, @NotNull t93 checkSupportCallback) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        Intrinsics.checkNotNullParameter(checkSupportCallback, "checkSupportCallback");
        this.checkSupportCallback = checkSupportCallback;
        this.TAG = "TaskCheckSupportVersion";
        this.NOT_NETWORK = 100;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0117  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.health.devicepair.manager.a
    @Nullable
    public Object a(@NotNull Continuation<? super ResultData> continuation) {
        TaskCheckSupportVersion$execute$1 taskCheckSupportVersion$execute$1;
        Ref.ObjectRef objectRef;
        final TaskCheckSupportVersion taskCheckSupportVersion;
        Ref.ObjectRef objectRef2;
        Object obj;
        Ref.ObjectRef objectRef3;
        final Ref.ObjectRef objectRef4;
        T t;
        Object objS;
        Ref.ObjectRef objectRef5;
        TaskCheckSupportVersion taskCheckSupportVersion2;
        T t2;
        if (continuation instanceof TaskCheckSupportVersion$execute$1) {
            taskCheckSupportVersion$execute$1 = (TaskCheckSupportVersion$execute$1) continuation;
            int i = taskCheckSupportVersion$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                taskCheckSupportVersion$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                taskCheckSupportVersion$execute$1 = new TaskCheckSupportVersion$execute$1(this, continuation);
            }
        } else {
            taskCheckSupportVersion$execute$1 = new TaskCheckSupportVersion$execute$1(this, continuation);
        }
        Object obj2 = taskCheckSupportVersion$execute$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = taskCheckSupportVersion$execute$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                objectRef2 = (Ref.ObjectRef) taskCheckSupportVersion$execute$1.L$2;
                objectRef3 = (Ref.ObjectRef) taskCheckSupportVersion$execute$1.L$1;
                taskCheckSupportVersion = (TaskCheckSupportVersion) taskCheckSupportVersion$execute$1.L$0;
                ResultKt.throwOnFailure(obj2);
                obj = obj2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef4 = (Ref.ObjectRef) taskCheckSupportVersion$execute$1.L$2;
                objectRef5 = (Ref.ObjectRef) taskCheckSupportVersion$execute$1.L$1;
                taskCheckSupportVersion2 = (TaskCheckSupportVersion) taskCheckSupportVersion$execute$1.L$0;
                ResultKt.throwOnFailure(obj2);
                t2 = obj2;
            }
            objectRef4.element = t2;
            ((ResultData) objectRef5.element).j(taskCheckSupportVersion2.getPairContext().getPairParams().getModel());
            taskCheckSupportVersion = taskCheckSupportVersion2;
            objectRef4 = objectRef5;
            if (!((ResultData) objectRef4.element).b()) {
                if (((ResultData) objectRef4.element).d() == 131) {
                    taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.this$0.checkSupportCallback.e(objectRef4.element);
                        }
                    });
                } else if (((ResultData) objectRef4.element).d() == taskCheckSupportVersion.NOT_NETWORK) {
                    taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.this$0.checkSupportCallback.b(objectRef4.element);
                        }
                    });
                } else if (((ResultData) objectRef4.element).d() == 132) {
                    taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.this$0.checkSupportCallback.c(objectRef4.element);
                        }
                    });
                } else if (((ResultData) objectRef4.element).d() == 133) {
                    taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.this$0.checkSupportCallback.d(objectRef4.element);
                        }
                    });
                }
            }
            return objectRef4.element;
        }
        ResultKt.throwOnFailure(obj2);
        ml4.a(getTAG(), "executor->start check support version");
        objectRef = new Ref.ObjectRef();
        if (rpc.c()) {
            taskCheckSupportVersion$execute$1.L$0 = this;
            taskCheckSupportVersion$execute$1.L$1 = objectRef;
            taskCheckSupportVersion$execute$1.L$2 = objectRef;
            taskCheckSupportVersion$execute$1.label = 1;
            Object objR = r(taskCheckSupportVersion$execute$1);
            if (objR == coroutine_suspended) {
                return coroutine_suspended;
            }
            taskCheckSupportVersion = this;
            objectRef2 = objectRef;
            obj = objR;
            objectRef3 = objectRef2;
        } else {
            ResultData resultDataB = b(this.NOT_NETWORK, ResultData.PairFailType.NORMAL, "checkSupportVersion not network");
            taskCheckSupportVersion = this;
            objectRef4 = objectRef;
            t = resultDataB;
        }
        objectRef.element = t;
        if (((ResultData) objectRef4.element).b()) {
            taskCheckSupportVersion$execute$1.L$0 = taskCheckSupportVersion;
            taskCheckSupportVersion$execute$1.L$1 = objectRef4;
            taskCheckSupportVersion$execute$1.L$2 = objectRef4;
            taskCheckSupportVersion$execute$1.label = 2;
            objS = taskCheckSupportVersion.s(taskCheckSupportVersion$execute$1);
            if (objS == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef5 = objectRef4;
            taskCheckSupportVersion2 = taskCheckSupportVersion;
            t2 = objS;
            objectRef4.element = t2;
            ((ResultData) objectRef5.element).j(taskCheckSupportVersion2.getPairContext().getPairParams().getModel());
            taskCheckSupportVersion = taskCheckSupportVersion2;
            objectRef4 = objectRef5;
        }
        if (!((ResultData) objectRef4.element).b()) {
            if (((ResultData) objectRef4.element).d() == 131) {
                taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.checkSupportCallback.e(objectRef4.element);
                    }
                });
            } else if (((ResultData) objectRef4.element).d() == taskCheckSupportVersion.NOT_NETWORK) {
                taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.checkSupportCallback.b(objectRef4.element);
                    }
                });
            } else if (((ResultData) objectRef4.element).d() == 132) {
                taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.checkSupportCallback.c(objectRef4.element);
                    }
                });
            } else if (((ResultData) objectRef4.element).d() == 133) {
                taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.checkSupportCallback.d(objectRef4.element);
                    }
                });
            }
        }
        return objectRef4.element;
        ResultData resultData = (ResultData) obj;
        objectRef = objectRef2;
        objectRef4 = objectRef3;
        t = resultData;
        objectRef.element = t;
        if (((ResultData) objectRef4.element).b()) {
            taskCheckSupportVersion$execute$1.L$0 = taskCheckSupportVersion;
            taskCheckSupportVersion$execute$1.L$1 = objectRef4;
            taskCheckSupportVersion$execute$1.L$2 = objectRef4;
            taskCheckSupportVersion$execute$1.label = 2;
            objS = taskCheckSupportVersion.s(taskCheckSupportVersion$execute$1);
            if (objS == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef5 = objectRef4;
            taskCheckSupportVersion2 = taskCheckSupportVersion;
            t2 = objS;
            objectRef4.element = t2;
            ((ResultData) objectRef5.element).j(taskCheckSupportVersion2.getPairContext().getPairParams().getModel());
            taskCheckSupportVersion = taskCheckSupportVersion2;
            objectRef4 = objectRef5;
        }
        if (!((ResultData) objectRef4.element).b()) {
            if (((ResultData) objectRef4.element).d() == 131) {
                taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.checkSupportCallback.e(objectRef4.element);
                    }
                });
            } else if (((ResultData) objectRef4.element).d() == taskCheckSupportVersion.NOT_NETWORK) {
                taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.checkSupportCallback.b(objectRef4.element);
                    }
                });
            } else if (((ResultData) objectRef4.element).d() == 132) {
                taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.checkSupportCallback.c(objectRef4.element);
                    }
                });
            } else if (((ResultData) objectRef4.element).d() == 133) {
                taskCheckSupportVersion.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckSupportVersion$execute$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.checkSupportCallback.d(objectRef4.element);
                    }
                });
            }
        }
        return objectRef4.element;
    }

    @Override // com.heytap.health.devicepair.manager.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    public final Object r(Continuation<? super ResultData> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        dc5.c(getPairContext().getContext(), getPairContext().getPairParams().getModel(), new b(safeContinuation, this));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final Object s(Continuation<? super ResultData> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        dc5.d(getPairContext().getContext(), getPairContext().getPairParams().getModel(), new c(safeContinuation, this));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
