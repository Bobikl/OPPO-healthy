package com.heytap.health.devicepair.manager.task.iwatch;

import com.heytap.health.devicepair.manager.PairContext;
import com.heytap.health.devicepair.manager.ResultData;
import com.heytap.health.devicepair.manager.a;
import com.heytap.health.devicepair.manager.helper.PairConnectHelper;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.t0a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/devicepair/manager/task/iwatch/TaskIWatchConnectDevice;", "Lcom/heytap/health/devicepair/manager/a;", "Lcom/heytap/health/devicepair/manager/ResultData;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/t0a;", LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/t0a;", "iWatchConnectDeviceCallback", "", "n", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "TAG", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;Lcom/oplus/aiunit/vision/t0a;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskIWatchConnectDevice extends a {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final t0a iWatchConnectDeviceCallback;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskIWatchConnectDevice(@NotNull PairContext pairContext, @NotNull t0a iWatchConnectDeviceCallback) {
        super(pairContext);
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        Intrinsics.checkNotNullParameter(iWatchConnectDeviceCallback, "iWatchConnectDeviceCallback");
        this.iWatchConnectDeviceCallback = iWatchConnectDeviceCallback;
        this.TAG = "TaskIWatchConnectDevice";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.health.devicepair.manager.a
    @Nullable
    public Object a(@NotNull Continuation<? super ResultData> continuation) {
        TaskIWatchConnectDevice$execute$1 taskIWatchConnectDevice$execute$1;
        if (continuation instanceof TaskIWatchConnectDevice$execute$1) {
            taskIWatchConnectDevice$execute$1 = (TaskIWatchConnectDevice$execute$1) continuation;
            int i = taskIWatchConnectDevice$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                taskIWatchConnectDevice$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                taskIWatchConnectDevice$execute$1 = new TaskIWatchConnectDevice$execute$1(this, continuation);
            }
        } else {
            taskIWatchConnectDevice$execute$1 = new TaskIWatchConnectDevice$execute$1(this, continuation);
        }
        Object objJ = taskIWatchConnectDevice$execute$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = taskIWatchConnectDevice$execute$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objJ);
            PairConnectHelper pairConnectHelper = new PairConnectHelper(getPairContext());
            getPairContext().n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.task.iwatch.TaskIWatchConnectDevice$execute$2
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
                    this.this$0.iWatchConnectDeviceCallback.b(ResultData.Companion.d(ResultData.INSTANCE, 0, null, 3, null));
                }
            });
            taskIWatchConnectDevice$execute$1.L$0 = this;
            taskIWatchConnectDevice$execute$1.label = 1;
            objJ = pairConnectHelper.j("iwatch", taskIWatchConnectDevice$execute$1);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (TaskIWatchConnectDevice) taskIWatchConnectDevice$execute$1.L$0;
            ResultKt.throwOnFailure(objJ);
        }
        PairConnectHelper.b bVar = (PairConnectHelper.b) objJ;
        ml4.d(this.getTAG(), "pair result:" + bVar);
        if (bVar.getIsConnect()) {
            return ResultData.Companion.d(ResultData.INSTANCE, 0, "connect success", 1, null);
        }
        return ResultData.Companion.b(ResultData.INSTANCE, 0, new ResultData.PairExpandBean(ResultData.PairFailType.BT_CONNECT_FAIL, bVar.getNode().getErrorCode() + " connect fail"), 1, null);
    }

    @Override // com.heytap.health.devicepair.manager.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }
}
