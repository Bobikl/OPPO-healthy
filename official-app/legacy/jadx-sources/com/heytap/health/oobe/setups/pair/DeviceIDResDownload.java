package com.heytap.health.oobe.setups.pair;

import com.heytap.health.devicepair.ui.devicepair.DevicePairResHelper;
import com.heytap.health.oobe.setups.PairStep;
import com.oplus.aiunit.vision.cqf;
import com.oplus.aiunit.vision.g71;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.h6e;
import com.oplus.aiunit.vision.i6e;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/oobe/setups/pair/DeviceIDResDownload;", "Lcom/oplus/aiunit/vision/g71;", "Lcom/oplus/aiunit/vision/gea$a;", "Lcom/oplus/aiunit/vision/h6e;", "Lcom/oplus/aiunit/vision/i6e;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "model", "", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/heytap/health/oobe/setups/PairStep$a;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getStatus", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "status", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceIDResDownload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceIDResDownload.kt\ncom/heytap/health/oobe/setups/pair/DeviceIDResDownload\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,28:1\n314#2,11:29\n*S KotlinDebug\n*F\n+ 1 DeviceIDResDownload.kt\ncom/heytap/health/oobe/setups/pair/DeviceIDResDownload\n*L\n21#1:29,11\n*E\n"})
public final class DeviceIDResDownload extends g71 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final MutableStateFlow<PairStep.a> status;

    public DeviceIDResDownload(@NotNull MutableStateFlow<PairStep.a> status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<h6e, i6e> aVar, @NotNull Continuation<? super i6e> continuation) {
        DeviceIDResDownload$intercept$1 deviceIDResDownload$intercept$1;
        if (continuation instanceof DeviceIDResDownload$intercept$1) {
            deviceIDResDownload$intercept$1 = (DeviceIDResDownload$intercept$1) continuation;
            int i = deviceIDResDownload$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deviceIDResDownload$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                deviceIDResDownload$intercept$1 = new DeviceIDResDownload$intercept$1(this, continuation);
            }
        } else {
            deviceIDResDownload$intercept$1 = new DeviceIDResDownload$intercept$1(this, continuation);
        }
        Object objA = deviceIDResDownload$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = deviceIDResDownload$intercept$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                aVar = (gea.a) deviceIDResDownload$intercept$1.L$1;
                this = (DeviceIDResDownload) deviceIDResDownload$intercept$1.L$0;
                ResultKt.throwOnFailure(objA);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
        }
        ResultKt.throwOnFailure(objA);
        c("DeviceIDResDownload -> start");
        this.status.setValue(PairStep.a.e.INSTANCE);
        String model = ((h6e) aVar.request()).getPairingData().getModel();
        deviceIDResDownload$intercept$1.L$0 = this;
        deviceIDResDownload$intercept$1.L$1 = aVar;
        deviceIDResDownload$intercept$1.label = 1;
        if (d(model, deviceIDResDownload$intercept$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.status.setValue(PairStep.a.d.INSTANCE);
        this.c("DeviceIDResDownload -> finish");
        cqf cqfVarRequest = aVar.request();
        deviceIDResDownload$intercept$1.L$0 = null;
        deviceIDResDownload$intercept$1.L$1 = null;
        deviceIDResDownload$intercept$1.label = 2;
        objA = aVar.a(cqfVarRequest, deviceIDResDownload$intercept$1);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    public final Object d(String str, Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        DevicePairResHelper.INSTANCE.b(str, new Function1<Boolean, Unit>() { // from class: com.heytap.health.oobe.setups.pair.DeviceIDResDownload$downloadSKURes$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (cancellableContinuationImpl.isActive() && z) {
                    cancellableContinuationImpl.resumeWith(Result.m5287constructorimpl(Boolean.valueOf(z)));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
