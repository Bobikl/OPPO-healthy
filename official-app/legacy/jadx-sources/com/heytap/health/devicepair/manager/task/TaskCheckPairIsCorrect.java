package com.heytap.health.devicepair.manager.task;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.devicepair.manager.a;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.lkd;
import com.oplus.aiunit.vision.lr3;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.n6e;
import com.oplus.aiunit.vision.n93;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0003B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/TaskCheckPairIsCorrect;", "Lcom/heytap/health/devicepair/manager/a;", "Lcom/heytap/health/devicepair/manager/ResultData;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "q", "", LogFieldKey.MESSAGE_KEY, "Ljava/lang/String;", "pairTo", "Lcom/oplus/aiunit/vision/n93;", "n", "Lcom/oplus/aiunit/vision/n93;", "callback", "o", "f", "()Ljava/lang/String;", "TAG", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;Ljava/lang/String;Lcom/oplus/aiunit/vision/n93;)V", "Companion", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskCheckPairIsCorrect extends a {
    public static final int ERRORCODE_FAMILY_TO_SELF = 100;
    public static final int ERRORCODE_NOT_SUPPORT_FAMILY = 102;
    public static final int ERRORCODE_SECONDARY = 104;
    public static final int ERRORCODE_SECONDARY_FAMILY = 105;
    public static final int ERRORCODE_SELF_TO_FAMILY = 101;
    public static final int ERROR_CODE_NOT_SUPPORT_SECOND = 106;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String pairTo;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n93 callback;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskCheckPairIsCorrect(@NotNull PairContext pairContext, @NotNull String pairTo, @NotNull n93 callback) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        Intrinsics.checkNotNullParameter(pairTo, "pairTo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.pairTo = pairTo;
        this.callback = callback;
        this.TAG = "TaskCheckPairIsCorrect";
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0138  */
    /* JADX WARN: Code duplicated, block: B:46:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.health.devicepair.manager.a
    @Nullable
    public Object a(@NotNull Continuation<? super ResultData> continuation) {
        TaskCheckPairIsCorrect$execute$1 taskCheckPairIsCorrect$execute$1;
        int i;
        if (continuation instanceof TaskCheckPairIsCorrect$execute$1) {
            taskCheckPairIsCorrect$execute$1 = (TaskCheckPairIsCorrect$execute$1) continuation;
            int i2 = taskCheckPairIsCorrect$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taskCheckPairIsCorrect$execute$1.label = i2 - Integer.MIN_VALUE;
            } else {
                taskCheckPairIsCorrect$execute$1 = new TaskCheckPairIsCorrect$execute$1(this, continuation);
            }
        } else {
            taskCheckPairIsCorrect$execute$1 = new TaskCheckPairIsCorrect$execute$1(this, continuation);
        }
        Object objQ = taskCheckPairIsCorrect$execute$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = taskCheckPairIsCorrect$execute$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQ);
            boolean zB = n6e.b(this.pairTo);
            if (zB) {
                if (getPairContext().getPairParams().isSecond()) {
                    final ResultData resultDataB = b(105, ResultData.PairFailType.NORMAL, getPairContext().getPairParams().getModel() + " pair process error");
                    getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckPairIsCorrect$execute$2
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
                            this.this$0.callback.d(resultDataB);
                        }
                    });
                    return resultDataB;
                }
                if (!lkd.c(getPairContext().getPairParams().getModel()).e7()) {
                    final ResultData resultDataB2 = b(102, ResultData.PairFailType.NORMAL, getPairContext().getPairParams().getModel() + " not support pair family device");
                    getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckPairIsCorrect$execute$3
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
                            this.this$0.callback.a(resultDataB2);
                        }
                    });
                    return resultDataB2;
                }
            }
            lr3 lr3VarC = lc5.c(getPairContext().getPairParams().getId());
            if (((Boolean) lr3VarC.a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckPairIsCorrect$execute$4
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                    Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                    return Boolean.valueOf(applyInfo.getDeviceInfo() != null);
                }
            })).booleanValue()) {
                UserDeviceInfo userDeviceInfo = (UserDeviceInfo) lr3VarC.a(new Function1<DeviceInfo, UserDeviceInfo>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckPairIsCorrect$execute$isCurrTerminal$1
                    @Override // p010kotlin.jvm.functions.Function1
                    @Nullable
                    public final UserDeviceInfo invoke(@NotNull DeviceInfo applyInfo) {
                        Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                        return applyInfo.getDeviceInfo();
                    }
                });
                boolean z = userDeviceInfo != null && userDeviceInfo.isCurrTerminal();
                boolean zBooleanValue = ((Boolean) lr3VarC.a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckPairIsCorrect$execute$isFamilyDevice$1
                    @Override // p010kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                        Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                        return Boolean.valueOf(applyInfo.Ra());
                    }
                })).booleanValue();
                if (z && getPairContext().getPairParams().isSecond()) {
                    i = 104;
                } else if (getPairContext().getPairParams().isMigrate()) {
                    if (zB == zBooleanValue) {
                        i = 103;
                    } else if (zBooleanValue) {
                        i = 100;
                    } else {
                        i = 101;
                    }
                } else if (!zBooleanValue || zB) {
                    i = 103;
                } else {
                    i = 100;
                }
                if (i != 103) {
                    final ResultData resultDataB3 = b(i, ResultData.PairFailType.NORMAL, getPairContext().getPairParams().getModel() + " pair process error,fromFamily(" + zB + ") != isFamilyDevice(" + zBooleanValue + "),isMigrate:" + getPairContext().getPairParams().isMigrate());
                    getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckPairIsCorrect$execute$5
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
                            this.this$0.callback.d(resultDataB3);
                        }
                    });
                    return resultDataB3;
                }
            }
            if (getPairContext().getPairParams().isSecond()) {
                taskCheckPairIsCorrect$execute$1.L$0 = this;
                taskCheckPairIsCorrect$execute$1.label = 1;
                objQ = q(taskCheckPairIsCorrect$execute$1);
                if (objQ == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return ResultData.Companion.d(ResultData.INSTANCE, 0, this.getPairContext().getPairParams().getModel() + " pair to " + this.pairTo, 1, null);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this = (TaskCheckPairIsCorrect) taskCheckPairIsCorrect$execute$1.L$0;
        ResultKt.throwOnFailure(objQ);
        if (!((Boolean) objQ).booleanValue()) {
            final ResultData resultDataA = ResultData.INSTANCE.a(106, new ResultData.PairExpandBean(ResultData.PairFailType.NORMAL, "oaf not support bind second"));
            this.getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.TaskCheckPairIsCorrect$execute$6
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
                    this.this$0.callback.c(resultDataA);
                }
            });
            return resultDataA;
        }
        return ResultData.Companion.d(ResultData.INSTANCE, 0, this.getPairContext().getPairParams().getModel() + " pair to " + this.pairTo, 1, null);
    }

    @Override // com.heytap.health.devicepair.manager.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    public final Object q(Continuation<? super Boolean> continuation) {
        Object objM5287constructorimpl;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(Boxing.boxBoolean(gl4.managerApi.isSupportDynamicRegisterAgent()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            ml4.c(getTAG(), "checkOafSupportSecond fail " + thM5290exceptionOrNullimpl.getMessage());
            objM5287constructorimpl = Boxing.boxBoolean(false);
        }
        boolean zBooleanValue = ((Boolean) objM5287constructorimpl).booleanValue();
        ml4.d(getTAG(), "checkOafSupportSecond cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + ",supportDynamicRegisterAgent:" + zBooleanValue);
        return Boxing.boxBoolean(zBooleanValue);
    }
}
