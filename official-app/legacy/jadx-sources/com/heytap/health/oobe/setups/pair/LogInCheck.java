package com.heytap.health.oobe.setups.pair;

import com.heytap.health.oobe.Variants;
import com.heytap.health.oobe.dto.FailOOBEKt;
import com.oplus.aiunit.vision.dm;
import com.oplus.aiunit.vision.g71;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.h6e;
import com.oplus.aiunit.vision.i6e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/heytap/health/oobe/setups/pair/LogInCheck;", "Lcom/oplus/aiunit/vision/g71;", "Lcom/oplus/aiunit/vision/gea$a;", "Lcom/oplus/aiunit/vision/h6e;", "Lcom/oplus/aiunit/vision/i6e;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class LogInCheck extends g71 {
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<h6e, i6e> aVar, @NotNull Continuation<? super i6e> continuation) {
        LogInCheck$intercept$1 logInCheck$intercept$1;
        if (continuation instanceof LogInCheck$intercept$1) {
            logInCheck$intercept$1 = (LogInCheck$intercept$1) continuation;
            int i = logInCheck$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                logInCheck$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                logInCheck$intercept$1 = new LogInCheck$intercept$1(this, continuation);
            }
        } else {
            logInCheck$intercept$1 = new LogInCheck$intercept$1(this, continuation);
        }
        Object objA = logInCheck$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = logInCheck$intercept$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            h6e h6eVar = (h6e) aVar.request();
            Variants pairingData = h6eVar.getPairingData();
            dm dmVar = dm.INSTANCE;
            if (dmVar.e()) {
                c("LogInCheck -> account already login ->device:" + pairingData.getAccountNumber());
                logInCheck$intercept$1.label = 1;
                objA = aVar.a(h6eVar, logInCheck$intercept$1);
                return objA == coroutine_suspended ? coroutine_suspended : objA;
            }
            c("LogInCheck -> account not login ->device account: " + pairingData.getAccountNumber());
            String ticket = pairingData.getTicket();
            logInCheck$intercept$1.L$0 = this;
            logInCheck$intercept$1.L$1 = aVar;
            logInCheck$intercept$1.label = 2;
            objA = dmVar.a(ticket, logInCheck$intercept$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) objA).booleanValue()) {
                return new i6e(false, FailOOBEKt.e("账号自动登陆失败, 请检查账号登陆状态", "auto login error"));
            }
            logInCheck$intercept$1.L$0 = null;
            logInCheck$intercept$1.L$1 = null;
            logInCheck$intercept$1.label = 3;
            objA = this.a(aVar, logInCheck$intercept$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objA);
            }
            if (i2 == 2) {
                aVar = (gea.a) logInCheck$intercept$1.L$1;
                this = (LogInCheck) logInCheck$intercept$1.L$0;
                ResultKt.throwOnFailure(objA);
                if (!((Boolean) objA).booleanValue()) {
                    return new i6e(false, FailOOBEKt.e("账号自动登陆失败, 请检查账号登陆状态", "auto login error"));
                }
                logInCheck$intercept$1.L$0 = null;
                logInCheck$intercept$1.L$1 = null;
                logInCheck$intercept$1.label = 3;
                objA = this.a(aVar, logInCheck$intercept$1);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
        }
        return objA;
    }
}
