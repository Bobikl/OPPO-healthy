package com.heytap.health.esim.nsc.dto;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sporthealth.blib.helper.NetDataErrorException;
import com.oplus.aiunit.vision.av1;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/heytap/health/esim/nsc/dto/OrdersNetSource;", "", "params", "", "Lcom/heytap/health/esim/nsc/dto/OrderVB;", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class OrdersNetSource {
    public static final int $stable = 0;

    @NotNull
    public static final OrdersNetSource INSTANCE = new OrdersNetSource();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@av1 @Nullable Object obj, @NotNull Continuation<? super List<OrderVB>> continuation) {
        OrdersNetSource$queryBillList$1 ordersNetSource$queryBillList$1;
        if (continuation instanceof OrdersNetSource$queryBillList$1) {
            ordersNetSource$queryBillList$1 = (OrdersNetSource$queryBillList$1) continuation;
            int i = ordersNetSource$queryBillList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ordersNetSource$queryBillList$1.label = i - Integer.MIN_VALUE;
            } else {
                ordersNetSource$queryBillList$1 = new OrdersNetSource$queryBillList$1(this, continuation);
            }
        } else {
            ordersNetSource$queryBillList$1 = new OrdersNetSource$queryBillList$1(this, continuation);
        }
        Object objA = ordersNetSource$queryBillList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ordersNetSource$queryBillList$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            b bVar = (b) com.heytap.health.network.core.a.l(b.class);
            ordersNetSource$queryBillList$1.label = 1;
            objA = bVar.a(obj, ordersNetSource$queryBillList$1);
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
            List list = (List) netResult.body;
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryBillList=>" + netResult.message);
    }
}
