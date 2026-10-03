package com.heytap.health.devicepair.manager.task.iwatch;

import com.heytap.health.devicemanager.util.DeviceUtilsKt;
import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.devicepair.manager.task.basetask.BaseTaskBindKey;
import com.heytap.health.protocol.iwatch.IWatch$IWatchBindKeyResponse;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ko4;
import com.oplus.aiunit.vision.ml4;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/iwatch/TaskIWatchBindKey;", "Lcom/heytap/health/devicepair/manager/task/basetask/BaseTaskBindKey;", "Lcom/heytap/health/devicepair/manager/ResultData;", "s", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", LogFieldKey.MESSAGE_KEY, "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskIWatchBindKey extends BaseTaskBindKey {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskIWatchBindKey(@NotNull PairContext pairContext) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        this.TAG = "TaskIWatchBindKey";
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
        TaskIWatchBindKey$getSignByDevice$1 taskIWatchBindKey$getSignByDevice$1;
        Object objM5287constructorimpl;
        if (continuation instanceof TaskIWatchBindKey$getSignByDevice$1) {
            taskIWatchBindKey$getSignByDevice$1 = (TaskIWatchBindKey$getSignByDevice$1) continuation;
            int i = taskIWatchBindKey$getSignByDevice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                taskIWatchBindKey$getSignByDevice$1.label = i - Integer.MIN_VALUE;
            } else {
                taskIWatchBindKey$getSignByDevice$1 = new TaskIWatchBindKey$getSignByDevice$1(this, continuation);
            }
        } else {
            taskIWatchBindKey$getSignByDevice$1 = new TaskIWatchBindKey$getSignByDevice$1(this, continuation);
        }
        TaskIWatchBindKey$getSignByDevice$1 taskIWatchBindKey$getSignByDevice$2 = taskIWatchBindKey$getSignByDevice$1;
        Object objD = taskIWatchBindKey$getSignByDevice$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = taskIWatchBindKey$getSignByDevice$2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objD);
                Result.Companion companion = Result.INSTANCE;
                String id = getPairContext().getPairParams().getId();
                MessageEvent messageEventG = xxb.G(getPairContext().getBindKey());
                Intrinsics.checkNotNullExpressionValue(messageEventG, "getIWatchSign(pairContext.bindKey)");
                TaskIWatchBindKey$getSignByDevice$2$bindKey$1 taskIWatchBindKey$getSignByDevice$2$bindKey$1 = TaskIWatchBindKey$getSignByDevice$2$bindKey$1.INSTANCE;
                taskIWatchBindKey$getSignByDevice$2.L$0 = this;
                taskIWatchBindKey$getSignByDevice$2.label = 1;
                objD = DeviceUtilsKt.d(id, messageEventG, taskIWatchBindKey$getSignByDevice$2$bindKey$1, (56 & 8) != 0 ? ko4.c.INSTANCE : null, (56 & 16) != 0 ? 5000L : 0L, (56 & 32) != 0 ? 0 : 0, taskIWatchBindKey$getSignByDevice$2);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (TaskIWatchBindKey) taskIWatchBindKey$getSignByDevice$2.L$0;
                ResultKt.throwOnFailure(objD);
            }
            PairContext pairContext = this.getPairContext();
            String secretBindKey = ((IWatch$IWatchBindKeyResponse) objD).getSecretBindKey();
            Intrinsics.checkNotNullExpressionValue(secretBindKey, "bindKey.secretBindKey");
            pairContext.w(secretBindKey);
            objM5287constructorimpl = Result.m5287constructorimpl(ResultData.Companion.d(ResultData.INSTANCE, 0, "getSignSuccess", 1, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return objM5287constructorimpl;
        }
        ml4.c(this.getTAG(), "getSignFail:" + thM5290exceptionOrNullimpl.getMessage());
        ResultData.Companion companion3 = ResultData.INSTANCE;
        ResultData.PairFailType pairFailType = ResultData.PairFailType.PB;
        String message = thM5290exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = "";
        }
        return ResultData.Companion.b(companion3, 0, new ResultData.PairExpandBean(pairFailType, message), 1, null);
    }
}
