package com.heytap.health.devicepair.manager.task;

import com.heytap.health.devicemanager.util.DeviceUtilsKt;
import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.devicepair.manager.a;
import com.heytap.health.devicepair.manager.task.basetask.BaseTaskBindKey;
import com.heytap.health.protocol.dm.DMProto$BindKey;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ko4;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.xxb;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/TaskBindKey;", "Lcom/heytap/health/devicepair/manager/task/basetask/BaseTaskBindKey;", "Lcom/heytap/health/devicepair/manager/ResultData;", "s", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", LogFieldKey.MESSAGE_KEY, "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskBindKey extends BaseTaskBindKey {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskBindKey(@NotNull PairContext pairContext) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        this.TAG = "TaskBindKey";
    }

    @Override // com.heytap.health.devicepair.manager.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.health.devicepair.manager.task.basetask.BaseTaskBindKey
    @Nullable
    public Object s(@NotNull Continuation<? super ResultData> continuation) {
        TaskBindKey$getSignByDevice$1 taskBindKey$getSignByDevice$1;
        Object objM5287constructorimpl;
        if (continuation instanceof TaskBindKey$getSignByDevice$1) {
            taskBindKey$getSignByDevice$1 = (TaskBindKey$getSignByDevice$1) continuation;
            int i = taskBindKey$getSignByDevice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                taskBindKey$getSignByDevice$1.label = i - Integer.MIN_VALUE;
            } else {
                taskBindKey$getSignByDevice$1 = new TaskBindKey$getSignByDevice$1(this, continuation);
            }
        } else {
            taskBindKey$getSignByDevice$1 = new TaskBindKey$getSignByDevice$1(this, continuation);
        }
        TaskBindKey$getSignByDevice$1 taskBindKey$getSignByDevice$2 = taskBindKey$getSignByDevice$1;
        Object objG = taskBindKey$getSignByDevice$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = taskBindKey$getSignByDevice$2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objG);
                Result.Companion companion = Result.INSTANCE;
                ra5.a aVar = ra5.a.INSTANCE;
                String id = getPairContext().getPairParams().getId();
                MessageEvent messageEventK = xxb.k(getPairContext().getBindKey());
                Intrinsics.checkNotNullExpressionValue(messageEventK, "getBindKeySignMessage(pairContext.bindKey)");
                TaskBindKey$getSignByDevice$signRsp$1$1 taskBindKey$getSignByDevice$signRsp$1$1 = TaskBindKey$getSignByDevice$signRsp$1$1.INSTANCE;
                taskBindKey$getSignByDevice$2.L$0 = this;
                taskBindKey$getSignByDevice$2.label = 1;
                objG = DeviceUtilsKt.g(aVar, id, messageEventK, taskBindKey$getSignByDevice$signRsp$1$1, (16 & 16) != 0 ? ko4.c.INSTANCE : null, (16 & 32) != 0 ? 5000L : 15000L, (16 & 64) != 0 ? 0 : 3, taskBindKey$getSignByDevice$2);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (TaskBindKey) taskBindKey$getSignByDevice$2.L$0;
                ResultKt.throwOnFailure(objG);
            }
            objM5287constructorimpl = Result.m5287constructorimpl((DMProto$BindKey) objG);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        TaskBindKey taskBindKey = this;
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            return a.c(taskBindKey, 0, ResultData.PairFailType.PB, "getSignByDevice error," + thM5290exceptionOrNullimpl.getMessage(), 1, null);
        }
        DMProto$BindKey dMProto$BindKey = (DMProto$BindKey) objM5287constructorimpl;
        String secretBindKey = dMProto$BindKey.getSecretBindKey();
        if (secretBindKey == null || secretBindKey.length() == 0) {
            return a.c(taskBindKey, 0, ResultData.PairFailType.PB, "getSignByDevice secretBindKey is empty", 1, null);
        }
        ml4.a(taskBindKey.getTAG(), "getSignByDevice sign: " + dMProto$BindKey.getSecretBindKey());
        PairContext pairContext = taskBindKey.getPairContext();
        String secretBindKey2 = dMProto$BindKey.getSecretBindKey();
        Intrinsics.checkNotNullExpressionValue(secretBindKey2, "signRsp.secretBindKey");
        pairContext.w(secretBindKey2);
        return ResultData.Companion.d(ResultData.INSTANCE, 0, "getSignByDevice success", 1, null);
    }
}
