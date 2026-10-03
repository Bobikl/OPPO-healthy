package com.heytap.health.esim.nsc.dto;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sporthealth.blib.helper.NetDataErrorException;
import com.oplus.aiunit.vision.AcInfo;
import com.oplus.aiunit.vision.AcStatus;
import com.oplus.aiunit.vision.ApplyStatus;
import com.oplus.aiunit.vision.CardInfo;
import com.oplus.aiunit.vision.Combo;
import com.oplus.aiunit.vision.ExchangeCombo;
import com.oplus.aiunit.vision.Migrate;
import com.oplus.aiunit.vision.NextCombo;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.ko0;
import com.oplus.aiunit.vision.t04;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJE\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0005J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00112\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0010J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0005J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0005J1\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\tJ;\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0005J#\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00112\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0005J\u001d\u0010'\u001a\u00020&2\b\b\u0002\u0010%\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0005J'\u0010*\u001a\u00020)2\b\b\u0002\u0010(\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/heytap/health/esim/nsc/dto/NetWorkServiceNetSource;", "", t04.DEVICE_UNIQUE_ID, "Lcom/heytap/sporthealth/blib/data/NetResult;", LogFieldKey.LEVEL_KEY, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imei", "eid", "d", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "comboThirdId", "payType", "Lcom/oplus/aiunit/vision/ko0;", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/health/esim/nsc/dto/UserCombo;", LogFieldKey.MESSAGE_KEY, "comboType", "Lcom/oplus/aiunit/vision/zl3;", "j", "Lcom/oplus/aiunit/vision/oqc;", "n", "c", "Lcom/oplus/aiunit/vision/fa;", "f", "oldDeviceUniqueId", "newDeviceUniqueId", "Lcom/oplus/aiunit/vision/tzb;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/uj;", b2n.f, "Lcom/oplus/aiunit/vision/lu6;", MapSchema.FIELD_NAME_KEY, "iccid", "Lcom/oplus/aiunit/vision/zz2;", "i", "planId", "Lcom/oplus/aiunit/vision/kf0;", b2n.g, "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class NetWorkServiceNetSource {
    public static final int $stable = 0;

    @NotNull
    public static final NetWorkServiceNetSource INSTANCE = new NetWorkServiceNetSource();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull Object obj, @NotNull Object obj2, @NotNull Object obj3, @NotNull Object obj4, @NotNull Object obj5, @NotNull Continuation<? super ko0> continuation) {
        NetWorkServiceNetSource$autoRenewal$1 netWorkServiceNetSource$autoRenewal$1;
        if (continuation instanceof NetWorkServiceNetSource$autoRenewal$1) {
            netWorkServiceNetSource$autoRenewal$1 = (NetWorkServiceNetSource$autoRenewal$1) continuation;
            int i = netWorkServiceNetSource$autoRenewal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netWorkServiceNetSource$autoRenewal$1.label = i - Integer.MIN_VALUE;
            } else {
                netWorkServiceNetSource$autoRenewal$1 = new NetWorkServiceNetSource$autoRenewal$1(this, continuation);
            }
        } else {
            netWorkServiceNetSource$autoRenewal$1 = new NetWorkServiceNetSource$autoRenewal$1(this, continuation);
        }
        Object objL = netWorkServiceNetSource$autoRenewal$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = netWorkServiceNetSource$autoRenewal$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objL);
            Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj), TuplesKt.to("comboThirdId", obj2), TuplesKt.to("imei", obj3), TuplesKt.to("eid", obj4), TuplesKt.to("payType", obj5));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            netWorkServiceNetSource$autoRenewal$1.label = 1;
            objL = aVar.l(mapMapOf, netWorkServiceNetSource$autoRenewal$1);
            if (objL == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objL);
        }
        NetResult netResult = (NetResult) objL;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "autoRenewal=>" + netResult.message);
    }

    @Nullable
    public final Object b(@NotNull Object obj, @NotNull Object obj2, @NotNull Continuation<? super NetResult<Object>> continuation) {
        return ((a) com.heytap.health.network.core.a.l(a.class)).f(MapsKt__MapsKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj), TuplesKt.to("comboThirdId", obj2)), continuation);
    }

    @Nullable
    public final Object c(@NotNull Object obj, @NotNull Continuation<? super NetResult<Object>> continuation) {
        return ((a) com.heytap.health.network.core.a.l(a.class)).c(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj)), continuation);
    }

    @Nullable
    public final Object d(@NotNull Object obj, @NotNull Object obj2, @NotNull Object obj3, @NotNull Continuation<? super NetResult<Object>> continuation) {
        return ((a) com.heytap.health.network.core.a.l(a.class)).g(MapsKt__MapsKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj), TuplesKt.to("imei", obj2), TuplesKt.to("eid", obj3)), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@NotNull Object obj, @NotNull Object obj2, @NotNull Object obj3, @NotNull Object obj4, @NotNull Continuation<? super Migrate> continuation) {
        NetWorkServiceNetSource$migrateUsage$1 netWorkServiceNetSource$migrateUsage$1;
        if (continuation instanceof NetWorkServiceNetSource$migrateUsage$1) {
            netWorkServiceNetSource$migrateUsage$1 = (NetWorkServiceNetSource$migrateUsage$1) continuation;
            int i = netWorkServiceNetSource$migrateUsage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netWorkServiceNetSource$migrateUsage$1.label = i - Integer.MIN_VALUE;
            } else {
                netWorkServiceNetSource$migrateUsage$1 = new NetWorkServiceNetSource$migrateUsage$1(this, continuation);
            }
        } else {
            netWorkServiceNetSource$migrateUsage$1 = new NetWorkServiceNetSource$migrateUsage$1(this, continuation);
        }
        Object objE = netWorkServiceNetSource$migrateUsage$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = netWorkServiceNetSource$migrateUsage$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objE);
            Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("oldDeviceUniqueId", obj), TuplesKt.to("newDeviceUniqueId", obj2), TuplesKt.to("imei", obj3), TuplesKt.to("eid", obj4));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            netWorkServiceNetSource$migrateUsage$1.label = 1;
            objE = aVar.e(mapMapOf, netWorkServiceNetSource$migrateUsage$1);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objE);
        }
        NetResult netResult = (NetResult) objE;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "migrateUsage=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object f(@NotNull Object obj, @NotNull Object obj2, @NotNull Object obj3, @NotNull Continuation<? super AcInfo> continuation) {
        NetWorkServiceNetSource$queryAcInfo$1 netWorkServiceNetSource$queryAcInfo$1;
        if (continuation instanceof NetWorkServiceNetSource$queryAcInfo$1) {
            netWorkServiceNetSource$queryAcInfo$1 = (NetWorkServiceNetSource$queryAcInfo$1) continuation;
            int i = netWorkServiceNetSource$queryAcInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netWorkServiceNetSource$queryAcInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                netWorkServiceNetSource$queryAcInfo$1 = new NetWorkServiceNetSource$queryAcInfo$1(this, continuation);
            }
        } else {
            netWorkServiceNetSource$queryAcInfo$1 = new NetWorkServiceNetSource$queryAcInfo$1(this, continuation);
        }
        Object objD = netWorkServiceNetSource$queryAcInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = netWorkServiceNetSource$queryAcInfo$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objD);
            Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj), TuplesKt.to("imei", obj2), TuplesKt.to("eid", obj3));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            netWorkServiceNetSource$queryAcInfo$1.label = 1;
            objD = aVar.d(mapMapOf, netWorkServiceNetSource$queryAcInfo$1);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objD);
        }
        NetResult netResult = (NetResult) objD;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryAcInfo=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object g(@NotNull Object obj, @NotNull Continuation<? super AcStatus> continuation) {
        NetWorkServiceNetSource$queryAcStatus$1 netWorkServiceNetSource$queryAcStatus$1;
        if (continuation instanceof NetWorkServiceNetSource$queryAcStatus$1) {
            netWorkServiceNetSource$queryAcStatus$1 = (NetWorkServiceNetSource$queryAcStatus$1) continuation;
            int i = netWorkServiceNetSource$queryAcStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netWorkServiceNetSource$queryAcStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                netWorkServiceNetSource$queryAcStatus$1 = new NetWorkServiceNetSource$queryAcStatus$1(this, continuation);
            }
        } else {
            netWorkServiceNetSource$queryAcStatus$1 = new NetWorkServiceNetSource$queryAcStatus$1(this, continuation);
        }
        Object objJ = netWorkServiceNetSource$queryAcStatus$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = netWorkServiceNetSource$queryAcStatus$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objJ);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            netWorkServiceNetSource$queryAcStatus$1.label = 1;
            objJ = aVar.j(mapMapOf, netWorkServiceNetSource$queryAcStatus$1);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objJ);
        }
        NetResult netResult = (NetResult) objJ;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryAcStatus=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object h(@NotNull Object obj, @NotNull Object obj2, @NotNull Continuation<? super ApplyStatus> continuation) {
        NetWorkServiceNetSource$queryApplyStatus$1 netWorkServiceNetSource$queryApplyStatus$1;
        if (continuation instanceof NetWorkServiceNetSource$queryApplyStatus$1) {
            netWorkServiceNetSource$queryApplyStatus$1 = (NetWorkServiceNetSource$queryApplyStatus$1) continuation;
            int i = netWorkServiceNetSource$queryApplyStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netWorkServiceNetSource$queryApplyStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                netWorkServiceNetSource$queryApplyStatus$1 = new NetWorkServiceNetSource$queryApplyStatus$1(this, continuation);
            }
        } else {
            netWorkServiceNetSource$queryApplyStatus$1 = new NetWorkServiceNetSource$queryApplyStatus$1(this, continuation);
        }
        Object objI = netWorkServiceNetSource$queryApplyStatus$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = netWorkServiceNetSource$queryApplyStatus$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objI);
            Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("planId", obj), TuplesKt.to("eid", obj2));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            netWorkServiceNetSource$queryApplyStatus$1.label = 1;
            objI = aVar.i(mapMapOf, netWorkServiceNetSource$queryApplyStatus$1);
            if (objI == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objI);
        }
        NetResult netResult = (NetResult) objI;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryApplyStatus=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object i(@NotNull Object obj, @NotNull Continuation<? super CardInfo> continuation) {
        NetWorkServiceNetSource$queryCardInfo$1 netWorkServiceNetSource$queryCardInfo$1;
        if (continuation instanceof NetWorkServiceNetSource$queryCardInfo$1) {
            netWorkServiceNetSource$queryCardInfo$1 = (NetWorkServiceNetSource$queryCardInfo$1) continuation;
            int i = netWorkServiceNetSource$queryCardInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netWorkServiceNetSource$queryCardInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                netWorkServiceNetSource$queryCardInfo$1 = new NetWorkServiceNetSource$queryCardInfo$1(this, continuation);
            }
        } else {
            netWorkServiceNetSource$queryCardInfo$1 = new NetWorkServiceNetSource$queryCardInfo$1(this, continuation);
        }
        Object objH = netWorkServiceNetSource$queryCardInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = netWorkServiceNetSource$queryCardInfo$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objH);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to("iccid", obj));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            netWorkServiceNetSource$queryCardInfo$1.label = 1;
            objH = aVar.h(mapMapOf, netWorkServiceNetSource$queryCardInfo$1);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objH);
        }
        NetResult netResult = (NetResult) objH;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryCardInfo=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object j(@NotNull Object obj, @NotNull Object obj2, @NotNull Continuation<? super List<Combo>> continuation) {
        NetWorkServiceNetSource$queryComboList$1 netWorkServiceNetSource$queryComboList$1;
        if (continuation instanceof NetWorkServiceNetSource$queryComboList$1) {
            netWorkServiceNetSource$queryComboList$1 = (NetWorkServiceNetSource$queryComboList$1) continuation;
            int i = netWorkServiceNetSource$queryComboList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netWorkServiceNetSource$queryComboList$1.label = i - Integer.MIN_VALUE;
            } else {
                netWorkServiceNetSource$queryComboList$1 = new NetWorkServiceNetSource$queryComboList$1(this, continuation);
            }
        } else {
            netWorkServiceNetSource$queryComboList$1 = new NetWorkServiceNetSource$queryComboList$1(this, continuation);
        }
        Object objB = netWorkServiceNetSource$queryComboList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = netWorkServiceNetSource$queryComboList$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj), TuplesKt.to("comboType", obj2));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            netWorkServiceNetSource$queryComboList$1.label = 1;
            objB = aVar.b(mapMapOf, netWorkServiceNetSource$queryComboList$1);
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
            List list = (List) netResult.body;
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryComboList=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object k(@NotNull Object obj, @NotNull Continuation<? super List<ExchangeCombo>> continuation) {
        NetWorkServiceNetSource$queryExchangeComboList$1 netWorkServiceNetSource$queryExchangeComboList$1;
        if (continuation instanceof NetWorkServiceNetSource$queryExchangeComboList$1) {
            netWorkServiceNetSource$queryExchangeComboList$1 = (NetWorkServiceNetSource$queryExchangeComboList$1) continuation;
            int i = netWorkServiceNetSource$queryExchangeComboList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netWorkServiceNetSource$queryExchangeComboList$1.label = i - Integer.MIN_VALUE;
            } else {
                netWorkServiceNetSource$queryExchangeComboList$1 = new NetWorkServiceNetSource$queryExchangeComboList$1(this, continuation);
            }
        } else {
            netWorkServiceNetSource$queryExchangeComboList$1 = new NetWorkServiceNetSource$queryExchangeComboList$1(this, continuation);
        }
        Object objN = netWorkServiceNetSource$queryExchangeComboList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = netWorkServiceNetSource$queryExchangeComboList$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objN);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            netWorkServiceNetSource$queryExchangeComboList$1.label = 1;
            objN = aVar.n(mapMapOf, netWorkServiceNetSource$queryExchangeComboList$1);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
        }
        NetResult netResult = (NetResult) objN;
        if (netResult.isSucceed()) {
            List list = (List) netResult.body;
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryExchangeComboList=>" + netResult.message);
    }

    @Nullable
    public final Object l(@NotNull Object obj, @NotNull Continuation<? super NetResult<Object>> continuation) {
        return ((a) com.heytap.health.network.core.a.l(a.class)).k(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj)), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object m(@NotNull Object obj, @NotNull Continuation<? super List<UserCombo>> continuation) {
        NetWorkServiceNetSource$queryUserComboList$1 netWorkServiceNetSource$queryUserComboList$1;
        if (continuation instanceof NetWorkServiceNetSource$queryUserComboList$1) {
            netWorkServiceNetSource$queryUserComboList$1 = (NetWorkServiceNetSource$queryUserComboList$1) continuation;
            int i = netWorkServiceNetSource$queryUserComboList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netWorkServiceNetSource$queryUserComboList$1.label = i - Integer.MIN_VALUE;
            } else {
                netWorkServiceNetSource$queryUserComboList$1 = new NetWorkServiceNetSource$queryUserComboList$1(this, continuation);
            }
        } else {
            netWorkServiceNetSource$queryUserComboList$1 = new NetWorkServiceNetSource$queryUserComboList$1(this, continuation);
        }
        Object objA = netWorkServiceNetSource$queryUserComboList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = netWorkServiceNetSource$queryUserComboList$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            netWorkServiceNetSource$queryUserComboList$1.label = 1;
            objA = aVar.a(mapMapOf, netWorkServiceNetSource$queryUserComboList$1);
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
        throw new NetDataErrorException(netResult.errorCode, "queryUserComboList=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object n(@NotNull Object obj, @NotNull Continuation<? super List<NextCombo>> continuation) {
        NetWorkServiceNetSource$queryUserPlanChangeComboList$1 netWorkServiceNetSource$queryUserPlanChangeComboList$1;
        if (continuation instanceof NetWorkServiceNetSource$queryUserPlanChangeComboList$1) {
            netWorkServiceNetSource$queryUserPlanChangeComboList$1 = (NetWorkServiceNetSource$queryUserPlanChangeComboList$1) continuation;
            int i = netWorkServiceNetSource$queryUserPlanChangeComboList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netWorkServiceNetSource$queryUserPlanChangeComboList$1.label = i - Integer.MIN_VALUE;
            } else {
                netWorkServiceNetSource$queryUserPlanChangeComboList$1 = new NetWorkServiceNetSource$queryUserPlanChangeComboList$1(this, continuation);
            }
        } else {
            netWorkServiceNetSource$queryUserPlanChangeComboList$1 = new NetWorkServiceNetSource$queryUserPlanChangeComboList$1(this, continuation);
        }
        Object objM = netWorkServiceNetSource$queryUserPlanChangeComboList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = netWorkServiceNetSource$queryUserPlanChangeComboList$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            netWorkServiceNetSource$queryUserPlanChangeComboList$1.label = 1;
            objM = aVar.m(mapMapOf, netWorkServiceNetSource$queryUserPlanChangeComboList$1);
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM);
        }
        NetResult netResult = (NetResult) objM;
        if (netResult.isSucceed()) {
            List list = (List) netResult.body;
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryUserPlanChangeComboList=>" + netResult.message);
    }
}
