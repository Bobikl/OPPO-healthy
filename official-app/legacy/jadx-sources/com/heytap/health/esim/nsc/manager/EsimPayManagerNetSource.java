package com.heytap.health.esim.nsc.manager;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sporthealth.blib.helper.NetDataErrorException;
import com.oplus.aiunit.vision.Order;
import com.oplus.aiunit.vision.OrderState;
import com.oplus.aiunit.vision.t04;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/esim/nsc/manager/EsimPayManagerNetSource;", "", "businessType", "comboThirdId", t04.DEVICE_UNIQUE_ID, "imei", "eid", "Lcom/oplus/aiunit/vision/lrd;", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderId", "Lcom/oplus/aiunit/vision/mrd;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class EsimPayManagerNetSource {
    public static final int $stable = 0;

    @NotNull
    public static final EsimPayManagerNetSource INSTANCE = new EsimPayManagerNetSource();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull Object obj, @NotNull Object obj2, @NotNull Object obj3, @NotNull Object obj4, @NotNull Object obj5, @NotNull Continuation<? super Order> continuation) {
        EsimPayManagerNetSource$createOrder$1 esimPayManagerNetSource$createOrder$1;
        if (continuation instanceof EsimPayManagerNetSource$createOrder$1) {
            esimPayManagerNetSource$createOrder$1 = (EsimPayManagerNetSource$createOrder$1) continuation;
            int i = esimPayManagerNetSource$createOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                esimPayManagerNetSource$createOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                esimPayManagerNetSource$createOrder$1 = new EsimPayManagerNetSource$createOrder$1(this, continuation);
            }
        } else {
            esimPayManagerNetSource$createOrder$1 = new EsimPayManagerNetSource$createOrder$1(this, continuation);
        }
        Object objA = esimPayManagerNetSource$createOrder$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = esimPayManagerNetSource$createOrder$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("businessType", obj), TuplesKt.to("comboThirdId", obj2), TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj3), TuplesKt.to("imei", obj4), TuplesKt.to("eid", obj5));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            esimPayManagerNetSource$createOrder$1.label = 1;
            objA = aVar.a(mapMapOf, esimPayManagerNetSource$createOrder$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        NetResult netResult = (NetResult) objA;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "createOrder=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull Object obj, @NotNull Continuation<? super OrderState> continuation) {
        EsimPayManagerNetSource$queryOrder$1 esimPayManagerNetSource$queryOrder$1;
        if (continuation instanceof EsimPayManagerNetSource$queryOrder$1) {
            esimPayManagerNetSource$queryOrder$1 = (EsimPayManagerNetSource$queryOrder$1) continuation;
            int i = esimPayManagerNetSource$queryOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                esimPayManagerNetSource$queryOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                esimPayManagerNetSource$queryOrder$1 = new EsimPayManagerNetSource$queryOrder$1(this, continuation);
            }
        } else {
            esimPayManagerNetSource$queryOrder$1 = new EsimPayManagerNetSource$queryOrder$1(this, continuation);
        }
        Object objB = esimPayManagerNetSource$queryOrder$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = esimPayManagerNetSource$queryOrder$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to("orderId", obj));
            a aVar = (a) com.heytap.health.network.core.a.j(a.class);
            esimPayManagerNetSource$queryOrder$1.label = 1;
            objB = aVar.b(mapMapOf, esimPayManagerNetSource$queryOrder$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objB);
        }
        NetResult netResult = (NetResult) objB;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryOrder=>" + netResult.message);
    }
}
