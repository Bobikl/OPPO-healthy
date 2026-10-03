package com.heytap.health.oobe.setups.pair.legals;

import com.heytap.health.oobe.Variants;
import com.heytap.health.oobe.dto.FailOOBEKt;
import com.heytap.health.oobe.repo.OOBENetSource;
import com.heytap.sporthealth.blib.data.NetResult;
import com.oplus.aiunit.vision.CheckBindStatus;
import com.oplus.aiunit.vision.a61;
import com.oplus.aiunit.vision.h6e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/heytap/health/oobe/setups/pair/legals/BindState;", "Lcom/oplus/aiunit/vision/a61;", "Lcom/oplus/aiunit/vision/h6e;", "t", "", "f", "(Lcom/oplus/aiunit/vision/h6e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class BindState extends a61 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.pva
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object a(@NotNull h6e h6eVar, @NotNull Continuation<? super Boolean> continuation) {
        BindState$trial$1 bindState$trial$1;
        if (continuation instanceof BindState$trial$1) {
            bindState$trial$1 = (BindState$trial$1) continuation;
            int i = bindState$trial$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bindState$trial$1.label = i - Integer.MIN_VALUE;
            } else {
                bindState$trial$1 = new BindState$trial$1(this, continuation);
            }
        } else {
            bindState$trial$1 = new BindState$trial$1(this, continuation);
        }
        Object objC = bindState$trial$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bindState$trial$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            if (h6eVar.getPairingData().isPairSecond()) {
                return Boxing.boxBoolean(true);
            }
            OOBENetSource oOBENetSource = OOBENetSource.INSTANCE;
            String address = h6eVar.getPairingData().getAddress();
            String model = h6eVar.getPairingData().getModel();
            bindState$trial$1.L$0 = this;
            bindState$trial$1.L$1 = h6eVar;
            bindState$trial$1.label = 1;
            objC = oOBENetSource.c(address, model, bindState$trial$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h6eVar = (h6e) bindState$trial$1.L$1;
            this = (BindState) bindState$trial$1.L$0;
            ResultKt.throwOnFailure(objC);
        }
        NetResult netResult = (NetResult) objC;
        if (netResult.isSucceed()) {
            return Boxing.boxBoolean(true);
        }
        this.c("BindState trial " + netResult);
        if (netResult.errorCode == 22200) {
            Variants pairingData = h6eVar.getPairingData();
            D d = netResult.body;
            Intrinsics.checkNotNull(d);
            throw FailOOBEKt.i(pairingData, ((CheckBindStatus) d).getAccountName());
        }
        throw FailOOBEKt.e("接口查询绑定状态异常", "checkBindStatus error\n" + netResult);
    }
}
