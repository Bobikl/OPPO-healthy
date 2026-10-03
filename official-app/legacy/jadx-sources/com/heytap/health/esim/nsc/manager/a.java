package com.heytap.health.esim.nsc.manager;

import com.heytap.sporthealth.blib.data.NetResult;
import com.oplus.aiunit.vision.Order;
import com.oplus.aiunit.vision.OrderState;
import com.oplus.aiunit.vision.av1;
import com.oplus.aiunit.vision.m1e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/heytap/health/esim/nsc/manager/a;", "", "params", "Lcom/heytap/sporthealth/blib/data/NetResult;", "Lcom/oplus/aiunit/vision/lrd;", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/mrd;", "b", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
interface a {
    @m1e("v1/c2s/third/internet/createOrder")
    @Nullable
    Object a(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<Order>> continuation);

    @m1e("v1/c2s/third/internet/queryOrder")
    @Nullable
    Object b(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<OrderState>> continuation);
}
