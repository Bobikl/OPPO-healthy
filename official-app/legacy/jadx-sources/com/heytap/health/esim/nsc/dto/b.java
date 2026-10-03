package com.heytap.health.esim.nsc.dto;

import com.heytap.sporthealth.blib.data.NetResult;
import com.oplus.aiunit.vision.av1;
import com.oplus.aiunit.vision.m1e;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J+\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/heytap/health/esim/nsc/dto/b;", "", "params", "Lcom/heytap/sporthealth/blib/data/NetResult;", "", "Lcom/heytap/health/esim/nsc/dto/OrderVB;", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
interface b {
    @m1e("v1/c2s/third/internet/queryBillList")
    @Nullable
    Object a(@av1 @Nullable Object obj, @NotNull Continuation<? super NetResult<List<OrderVB>>> continuation);
}
