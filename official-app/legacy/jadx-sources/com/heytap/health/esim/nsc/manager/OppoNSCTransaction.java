package com.heytap.health.esim.nsc.manager;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.nsc.dto.NetWorkServiceNetSource;
import com.heytap.health.esim.nsc.dto.UserCombo;
import com.heytap.sporthealth.blib.helper.SilentUIStateException;
import com.heytap.sporthealth.blib.helper.UISwitchKt;
import com.oplus.aiunit.vision.Order;
import com.oplus.aiunit.vision.dkf;
import com.oplus.aiunit.vision.ko0;
import com.oplus.aiunit.vision.sae;
import com.oplus.aiunit.vision.sbe;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJR\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0082@ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/esim/nsc/manager/OppoNSCTransaction;", "Lcom/heytap/health/esim/nsc/manager/NSCTransaction;", "Landroid/content/Context;", "context", "", "comboThirdId", t04.DEVICE_UNIQUE_ID, "eid", "imei", "", "businessType", "Lkotlin/Result;", "", "f", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Lcom/heytap/health/esim/nsc/dto/UserCombo;", "userCombo", "", "a", "(Landroid/content/Context;Lcom/heytap/health/esim/nsc/dto/UserCombo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", sbe.PAY_SDK_PREPAYTOKEN, sbe.PAY_SDK_PARTNERID, "i", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class OppoNSCTransaction extends NSCTransaction {
    public static final int $stable = 0;

    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.health.esim.nsc.manager.NSCTransaction
    @Nullable
    public Object a(@NotNull Context context, @NotNull UserCombo userCombo, @NotNull Continuation<? super Unit> continuation) {
        OppoNSCTransaction$autoRenewal$1 oppoNSCTransaction$autoRenewal$1;
        OppoNSCTransaction oppoNSCTransaction;
        ko0 ko0Var;
        String productId;
        String orderId;
        if (continuation instanceof OppoNSCTransaction$autoRenewal$1) {
            oppoNSCTransaction$autoRenewal$1 = (OppoNSCTransaction$autoRenewal$1) continuation;
            int i = oppoNSCTransaction$autoRenewal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oppoNSCTransaction$autoRenewal$1.label = i - Integer.MIN_VALUE;
            } else {
                oppoNSCTransaction$autoRenewal$1 = new OppoNSCTransaction$autoRenewal$1(this, continuation);
            }
        } else {
            oppoNSCTransaction$autoRenewal$1 = new OppoNSCTransaction$autoRenewal$1(this, continuation);
        }
        Object objA = oppoNSCTransaction$autoRenewal$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oppoNSCTransaction$autoRenewal$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                context = (Context) oppoNSCTransaction$autoRenewal$1.L$1;
                this = (OppoNSCTransaction) oppoNSCTransaction$autoRenewal$1.L$0;
                ResultKt.throwOnFailure(objA);
            } else if (i2 == 2) {
                ko0Var = (ko0) oppoNSCTransaction$autoRenewal$1.L$1;
                oppoNSCTransaction = (OppoNSCTransaction) oppoNSCTransaction$autoRenewal$1.L$0;
                ResultKt.throwOnFailure(objA);
                if (((Boolean) objA).booleanValue()) {
                    throw new SilentUIStateException(null, "oppo pay cancelled", 1, null);
                }
                productId = ko0Var.getProductId();
                orderId = ko0Var.getOrderId();
                oppoNSCTransaction$autoRenewal$1.L$0 = null;
                oppoNSCTransaction$autoRenewal$1.L$1 = null;
                oppoNSCTransaction$autoRenewal$1.label = 3;
                if (oppoNSCTransaction.c(productId, orderId, oppoNSCTransaction$autoRenewal$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objA);
        NetWorkServiceNetSource netWorkServiceNetSource = NetWorkServiceNetSource.INSTANCE;
        String mac = userCombo.getMac();
        String id = userCombo.getId();
        String imei = userCombo.getImei();
        String eid = userCombo.getEid();
        Integer numBoxInt = Boxing.boxInt(1);
        oppoNSCTransaction$autoRenewal$1.L$0 = this;
        oppoNSCTransaction$autoRenewal$1.L$1 = context;
        oppoNSCTransaction$autoRenewal$1.label = 1;
        objA = netWorkServiceNetSource.a(mac, id, imei, eid, numBoxInt, oppoNSCTransaction$autoRenewal$1);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        ko0 ko0Var2 = (ko0) objA;
        String str = ko0Var2.getCom.oplus.aiunit.vision.sbe.PAY_SDK_PREPAYTOKEN java.lang.String();
        String partnerCode = ko0Var2.getPartnerCode();
        oppoNSCTransaction$autoRenewal$1.L$0 = this;
        oppoNSCTransaction$autoRenewal$1.L$1 = ko0Var2;
        oppoNSCTransaction$autoRenewal$1.label = 2;
        objA = this.i(context, str, partnerCode, oppoNSCTransaction$autoRenewal$1);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        oppoNSCTransaction = this;
        ko0Var = ko0Var2;
        if (((Boolean) objA).booleanValue()) {
            throw new SilentUIStateException(null, "oppo pay cancelled", 1, null);
        }
        productId = ko0Var.getProductId();
        orderId = ko0Var.getOrderId();
        oppoNSCTransaction$autoRenewal$1.L$0 = null;
        oppoNSCTransaction$autoRenewal$1.L$1 = null;
        oppoNSCTransaction$autoRenewal$1.label = 3;
        if (oppoNSCTransaction.c(productId, orderId, oppoNSCTransaction$autoRenewal$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.heytap.health.esim.nsc.manager.NSCTransaction
    @Nullable
    public Object d(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull Continuation<? super Result<Boolean>> continuation) {
        OppoNSCTransaction$pay$1 oppoNSCTransaction$pay$1;
        if (continuation instanceof OppoNSCTransaction$pay$1) {
            oppoNSCTransaction$pay$1 = (OppoNSCTransaction$pay$1) continuation;
            int i2 = oppoNSCTransaction$pay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oppoNSCTransaction$pay$1.label = i2 - Integer.MIN_VALUE;
            } else {
                oppoNSCTransaction$pay$1 = new OppoNSCTransaction$pay$1(this, continuation);
            }
        } else {
            oppoNSCTransaction$pay$1 = new OppoNSCTransaction$pay$1(this, continuation);
        }
        OppoNSCTransaction$pay$1 oppoNSCTransaction$pay$2 = oppoNSCTransaction$pay$1;
        Object obj = oppoNSCTransaction$pay$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oppoNSCTransaction$pay$2.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        Function2<? super Order, ? super Continuation<? super Boolean>, ? extends Object> oppoNSCTransaction$pay$3 = new OppoNSCTransaction$pay$2(this, context, null);
        oppoNSCTransaction$pay$2.label = 1;
        Object objB = b(context, str, str2, str3, str4, i, oppoNSCTransaction$pay$3, oppoNSCTransaction$pay$2);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.heytap.health.esim.nsc.manager.NSCTransaction
    @Nullable
    public Object f(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull Continuation<? super Result<Boolean>> continuation) {
        OppoNSCTransaction$sign$1 oppoNSCTransaction$sign$1;
        if (continuation instanceof OppoNSCTransaction$sign$1) {
            oppoNSCTransaction$sign$1 = (OppoNSCTransaction$sign$1) continuation;
            int i2 = oppoNSCTransaction$sign$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oppoNSCTransaction$sign$1.label = i2 - Integer.MIN_VALUE;
            } else {
                oppoNSCTransaction$sign$1 = new OppoNSCTransaction$sign$1(this, continuation);
            }
        } else {
            oppoNSCTransaction$sign$1 = new OppoNSCTransaction$sign$1(this, continuation);
        }
        OppoNSCTransaction$sign$1 oppoNSCTransaction$sign$2 = oppoNSCTransaction$sign$1;
        Object obj = oppoNSCTransaction$sign$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oppoNSCTransaction$sign$2.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        Function2<? super Order, ? super Continuation<? super Boolean>, ? extends Object> oppoNSCTransaction$sign$3 = new OppoNSCTransaction$sign$2(this, context, null);
        oppoNSCTransaction$sign$2.label = 1;
        Object objB = b(context, str, str2, str3, str4, i, oppoNSCTransaction$sign$3, oppoNSCTransaction$sign$2);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    public final Object i(Context context, String str, String str2, Continuation<? super Boolean> continuation) {
        return UISwitchKt.a(context, new OppoNSCTransaction$oppoPay$2(context, str, str2), new Function1<Function1<? super Boolean, ? extends Unit>, Unit>() { // from class: com.heytap.health.esim.nsc.manager.OppoNSCTransaction$oppoPay$3
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super Boolean, ? extends Unit> function1) {
                invoke2((Function1<? super Boolean, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super Boolean, Unit> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                dkf.INSTANCE.a("oppo pay release on page quit");
                sae.h().e();
                it.invoke(Boolean.TRUE);
            }
        }, continuation);
    }
}
