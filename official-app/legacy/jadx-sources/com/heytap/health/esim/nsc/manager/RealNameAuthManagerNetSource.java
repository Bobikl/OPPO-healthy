package com.heytap.health.esim.nsc.manager;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sporthealth.blib.helper.NetDataErrorException;
import com.oplus.aiunit.vision.RealNameStatus;
import com.oplus.aiunit.vision.RealNameUrl;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/heytap/health/esim/nsc/manager/RealNameAuthManagerNetSource;", "", "iccid", "Lcom/oplus/aiunit/vision/rcf;", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/qcf;", "b", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RealNameAuthManagerNetSource {
    public static final int $stable = 0;

    @NotNull
    public static final RealNameAuthManagerNetSource INSTANCE = new RealNameAuthManagerNetSource();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull Object obj, @NotNull Continuation<? super RealNameUrl> continuation) {
        RealNameAuthManagerNetSource$queryRealNameAuth$1 realNameAuthManagerNetSource$queryRealNameAuth$1;
        if (continuation instanceof RealNameAuthManagerNetSource$queryRealNameAuth$1) {
            realNameAuthManagerNetSource$queryRealNameAuth$1 = (RealNameAuthManagerNetSource$queryRealNameAuth$1) continuation;
            int i = realNameAuthManagerNetSource$queryRealNameAuth$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realNameAuthManagerNetSource$queryRealNameAuth$1.label = i - Integer.MIN_VALUE;
            } else {
                realNameAuthManagerNetSource$queryRealNameAuth$1 = new RealNameAuthManagerNetSource$queryRealNameAuth$1(this, continuation);
            }
        } else {
            realNameAuthManagerNetSource$queryRealNameAuth$1 = new RealNameAuthManagerNetSource$queryRealNameAuth$1(this, continuation);
        }
        Object objA = realNameAuthManagerNetSource$queryRealNameAuth$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = realNameAuthManagerNetSource$queryRealNameAuth$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to("iccid", obj));
            c cVar = (c) com.heytap.health.network.core.a.l(c.class);
            realNameAuthManagerNetSource$queryRealNameAuth$1.label = 1;
            objA = cVar.a(mapMapOf, realNameAuthManagerNetSource$queryRealNameAuth$1);
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
        throw new NetDataErrorException(netResult.errorCode, "queryRealNameAuth=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull Object obj, @NotNull Continuation<? super RealNameStatus> continuation) {
        RealNameAuthManagerNetSource$queryRealNameStatus$1 realNameAuthManagerNetSource$queryRealNameStatus$1;
        if (continuation instanceof RealNameAuthManagerNetSource$queryRealNameStatus$1) {
            realNameAuthManagerNetSource$queryRealNameStatus$1 = (RealNameAuthManagerNetSource$queryRealNameStatus$1) continuation;
            int i = realNameAuthManagerNetSource$queryRealNameStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                realNameAuthManagerNetSource$queryRealNameStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                realNameAuthManagerNetSource$queryRealNameStatus$1 = new RealNameAuthManagerNetSource$queryRealNameStatus$1(this, continuation);
            }
        } else {
            realNameAuthManagerNetSource$queryRealNameStatus$1 = new RealNameAuthManagerNetSource$queryRealNameStatus$1(this, continuation);
        }
        Object objB = realNameAuthManagerNetSource$queryRealNameStatus$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = realNameAuthManagerNetSource$queryRealNameStatus$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to("iccid", obj));
            c cVar = (c) com.heytap.health.network.core.a.l(c.class);
            realNameAuthManagerNetSource$queryRealNameStatus$1.label = 1;
            objB = cVar.b(mapMapOf, realNameAuthManagerNetSource$queryRealNameStatus$1);
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
        throw new NetDataErrorException(netResult.errorCode, "queryRealNameStatus=>" + netResult.message);
    }
}
