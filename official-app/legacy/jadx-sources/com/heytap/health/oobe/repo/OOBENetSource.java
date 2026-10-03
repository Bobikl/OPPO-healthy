package com.heytap.health.oobe.repo;

import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sporthealth.blib.helper.NetDataErrorException;
import com.oplus.aiunit.vision.CheckBindStatus;
import com.oplus.aiunit.vision.GetBindKey;
import com.oplus.aiunit.vision.OldestSupprotVersion;
import com.oplus.aiunit.vision.av1;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.e17;
import com.oplus.aiunit.vision.fk5;
import com.oplus.aiunit.vision.rc4;
import com.oplus.aiunit.vision.t04;
import io.protostuff.MapSchema;
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

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J/\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00042\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\rJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJ'\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0007J'\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0007J3\u0010\u0016\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0007J\u001d\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\rJ\u001f\u0010\u001d\u001a\u00020\u001c2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\rJ\u001f\u0010\u001e\u001a\u00020\u00012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\rJ\u001f\u0010 \u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\rJ!\u0010!\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\rJ3\u0010#\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0017J\u001f\u0010%\u001a\u00020$2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/heytap/health/oobe/repo/OOBENetSource;", "", t04.DEVICE_UNIQUE_ID, "model", "Lcom/heytap/sporthealth/blib/data/NetResult;", "Lcom/oplus/aiunit/vision/x83;", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "versionType", "Lcom/oplus/aiunit/vision/nfd;", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/l58;", b2n.f, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "params", "a", "b", LogFieldKey.MESSAGE_KEY, "appTerminalId", "n", "q", "ssoid", "o", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "Lcom/oplus/aiunit/vision/fk5;", "j", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/e17;", b2n.g, MapSchema.FIELD_NAME_ENTRY, "nickname", "d", "s", "mobileVaid", "r", "Lcom/oplus/aiunit/vision/rc4;", "f", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class OOBENetSource {

    @NotNull
    public static final OOBENetSource INSTANCE = new OOBENetSource();

    public static /* synthetic */ Object i(OOBENetSource oOBENetSource, Object obj, Continuation continuation, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "";
        }
        return oOBENetSource.h(obj, continuation);
    }

    public static /* synthetic */ Object p(OOBENetSource oOBENetSource, Object obj, Object obj2, Object obj3, Continuation continuation, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = "";
        }
        if ((i & 2) != 0) {
            obj2 = "";
        }
        if ((i & 4) != 0) {
            obj3 = "";
        }
        return oOBENetSource.o(obj, obj2, obj3, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@av1 @Nullable Object obj, @NotNull Continuation<Object> continuation) {
        OOBENetSource$bindDeviceWithRegisterWarranty$1 oOBENetSource$bindDeviceWithRegisterWarranty$1;
        if (continuation instanceof OOBENetSource$bindDeviceWithRegisterWarranty$1) {
            oOBENetSource$bindDeviceWithRegisterWarranty$1 = (OOBENetSource$bindDeviceWithRegisterWarranty$1) continuation;
            int i = oOBENetSource$bindDeviceWithRegisterWarranty$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$bindDeviceWithRegisterWarranty$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$bindDeviceWithRegisterWarranty$1 = new OOBENetSource$bindDeviceWithRegisterWarranty$1(this, continuation);
            }
        } else {
            oOBENetSource$bindDeviceWithRegisterWarranty$1 = new OOBENetSource$bindDeviceWithRegisterWarranty$1(this, continuation);
        }
        Object objJ = oOBENetSource$bindDeviceWithRegisterWarranty$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$bindDeviceWithRegisterWarranty$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objJ);
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            oOBENetSource$bindDeviceWithRegisterWarranty$1.label = 1;
            objJ = aVar.j(obj, oOBENetSource$bindDeviceWithRegisterWarranty$1);
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
            return netResult.body;
        }
        throw new NetDataErrorException(netResult.errorCode, "bindDeviceWithRegisterWarranty=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@av1 @Nullable Object obj, @NotNull Continuation<Object> continuation) {
        OOBENetSource$bindSecondaryDevice$1 oOBENetSource$bindSecondaryDevice$1;
        if (continuation instanceof OOBENetSource$bindSecondaryDevice$1) {
            oOBENetSource$bindSecondaryDevice$1 = (OOBENetSource$bindSecondaryDevice$1) continuation;
            int i = oOBENetSource$bindSecondaryDevice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$bindSecondaryDevice$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$bindSecondaryDevice$1 = new OOBENetSource$bindSecondaryDevice$1(this, continuation);
            }
        } else {
            oOBENetSource$bindSecondaryDevice$1 = new OOBENetSource$bindSecondaryDevice$1(this, continuation);
        }
        Object objM = oOBENetSource$bindSecondaryDevice$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$bindSecondaryDevice$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM);
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            oOBENetSource$bindSecondaryDevice$1.label = 1;
            objM = aVar.m(obj, oOBENetSource$bindSecondaryDevice$1);
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
            return netResult.body;
        }
        throw new NetDataErrorException(netResult.errorCode, "bindSecondaryDevice=>" + netResult.message);
    }

    @Nullable
    public final Object c(@NotNull Object obj, @NotNull Object obj2, @NotNull Continuation<? super NetResult<CheckBindStatus>> continuation) {
        return ((a) com.heytap.health.network.core.a.l(a.class)).p(MapsKt__MapsKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj), TuplesKt.to("model", obj2)), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(@NotNull Object obj, @NotNull Continuation<Object> continuation) {
        OOBENetSource$checkNickname$1 oOBENetSource$checkNickname$1;
        if (continuation instanceof OOBENetSource$checkNickname$1) {
            oOBENetSource$checkNickname$1 = (OOBENetSource$checkNickname$1) continuation;
            int i = oOBENetSource$checkNickname$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$checkNickname$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$checkNickname$1 = new OOBENetSource$checkNickname$1(this, continuation);
            }
        } else {
            oOBENetSource$checkNickname$1 = new OOBENetSource$checkNickname$1(this, continuation);
        }
        Object objC = oOBENetSource$checkNickname$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$checkNickname$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to("nickname", obj));
            a aVar = (a) com.heytap.health.network.core.a.j(a.class);
            oOBENetSource$checkNickname$1.label = 1;
            objC = aVar.c(mapMapOf, oOBENetSource$checkNickname$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        NetResult netResult = (NetResult) objC;
        if (netResult.isSucceed()) {
            return netResult.body;
        }
        throw new NetDataErrorException(netResult.errorCode, "checkNickname=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@av1 @Nullable Object obj, @NotNull Continuation<Object> continuation) {
        OOBENetSource$cleanVirtualAccount$1 oOBENetSource$cleanVirtualAccount$1;
        if (continuation instanceof OOBENetSource$cleanVirtualAccount$1) {
            oOBENetSource$cleanVirtualAccount$1 = (OOBENetSource$cleanVirtualAccount$1) continuation;
            int i = oOBENetSource$cleanVirtualAccount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$cleanVirtualAccount$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$cleanVirtualAccount$1 = new OOBENetSource$cleanVirtualAccount$1(this, continuation);
            }
        } else {
            oOBENetSource$cleanVirtualAccount$1 = new OOBENetSource$cleanVirtualAccount$1(this, continuation);
        }
        Object objB = oOBENetSource$cleanVirtualAccount$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$cleanVirtualAccount$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            oOBENetSource$cleanVirtualAccount$1.label = 1;
            objB = aVar.b(obj, oOBENetSource$cleanVirtualAccount$1);
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
        throw new NetDataErrorException(netResult.errorCode, "cleanVirtualAccount=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object f(@av1 @Nullable Object obj, @NotNull Continuation<? super rc4> continuation) {
        OOBENetSource$createVirtualAccount$1 oOBENetSource$createVirtualAccount$1;
        if (continuation instanceof OOBENetSource$createVirtualAccount$1) {
            oOBENetSource$createVirtualAccount$1 = (OOBENetSource$createVirtualAccount$1) continuation;
            int i = oOBENetSource$createVirtualAccount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$createVirtualAccount$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$createVirtualAccount$1 = new OOBENetSource$createVirtualAccount$1(this, continuation);
            }
        } else {
            oOBENetSource$createVirtualAccount$1 = new OOBENetSource$createVirtualAccount$1(this, continuation);
        }
        Object objF = oOBENetSource$createVirtualAccount$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$createVirtualAccount$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objF);
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            oOBENetSource$createVirtualAccount$1.label = 1;
            objF = aVar.f(obj, oOBENetSource$createVirtualAccount$1);
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objF);
        }
        NetResult netResult = (NetResult) objF;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "createVirtualAccount=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object g(@NotNull Object obj, @NotNull Continuation<? super GetBindKey> continuation) {
        OOBENetSource$getBindKey$1 oOBENetSource$getBindKey$1;
        if (continuation instanceof OOBENetSource$getBindKey$1) {
            oOBENetSource$getBindKey$1 = (OOBENetSource$getBindKey$1) continuation;
            int i = oOBENetSource$getBindKey$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$getBindKey$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$getBindKey$1 = new OOBENetSource$getBindKey$1(this, continuation);
            }
        } else {
            oOBENetSource$getBindKey$1 = new OOBENetSource$getBindKey$1(this, continuation);
        }
        Object objO = oOBENetSource$getBindKey$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$getBindKey$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objO);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            oOBENetSource$getBindKey$1.label = 1;
            objO = aVar.o(mapMapOf, oOBENetSource$getBindKey$1);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objO);
        }
        NetResult netResult = (NetResult) objO;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "getBindKey=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object h(@av1 @Nullable Object obj, @NotNull Continuation<? super e17> continuation) {
        OOBENetSource$getDeviceBindingRecords$1 oOBENetSource$getDeviceBindingRecords$1;
        if (continuation instanceof OOBENetSource$getDeviceBindingRecords$1) {
            oOBENetSource$getDeviceBindingRecords$1 = (OOBENetSource$getDeviceBindingRecords$1) continuation;
            int i = oOBENetSource$getDeviceBindingRecords$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$getDeviceBindingRecords$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$getDeviceBindingRecords$1 = new OOBENetSource$getDeviceBindingRecords$1(this, continuation);
            }
        } else {
            oOBENetSource$getDeviceBindingRecords$1 = new OOBENetSource$getDeviceBindingRecords$1(this, continuation);
        }
        Object objE = oOBENetSource$getDeviceBindingRecords$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$getDeviceBindingRecords$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objE);
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            oOBENetSource$getDeviceBindingRecords$1.label = 1;
            objE = aVar.e(obj, oOBENetSource$getDeviceBindingRecords$1);
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
        throw new NetDataErrorException(netResult.errorCode, "getDeviceBindingRecords=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object j(@NotNull Object obj, @NotNull Object obj2, @NotNull Continuation<? super fk5> continuation) {
        OOBENetSource$queryDeviceModelDetail$1 oOBENetSource$queryDeviceModelDetail$1;
        if (continuation instanceof OOBENetSource$queryDeviceModelDetail$1) {
            oOBENetSource$queryDeviceModelDetail$1 = (OOBENetSource$queryDeviceModelDetail$1) continuation;
            int i = oOBENetSource$queryDeviceModelDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$queryDeviceModelDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$queryDeviceModelDetail$1 = new OOBENetSource$queryDeviceModelDetail$1(this, continuation);
            }
        } else {
            oOBENetSource$queryDeviceModelDetail$1 = new OOBENetSource$queryDeviceModelDetail$1(this, continuation);
        }
        Object objK = oOBENetSource$queryDeviceModelDetail$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$queryDeviceModelDetail$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objK);
            Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("type", obj), TuplesKt.to("model", obj2));
            a aVar = (a) com.heytap.health.network.core.a.j(a.class);
            oOBENetSource$queryDeviceModelDetail$1.label = 1;
            objK = aVar.k(mapMapOf, oOBENetSource$queryDeviceModelDetail$1);
            if (objK == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objK);
        }
        NetResult netResult = (NetResult) objK;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryDeviceModelDetail=>" + netResult.message);
    }

    @Nullable
    public final Object k(@NotNull Object obj, @NotNull Object obj2, @NotNull Continuation<? super NetResult<OldestSupprotVersion>> continuation) {
        return ((a) com.heytap.health.network.core.a.j(a.class)).a(MapsKt__MapsKt.mapOf(TuplesKt.to("versionType", obj), TuplesKt.to("model", obj2)), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object l(@NotNull Object obj, @NotNull Continuation<Object> continuation) {
        OOBENetSource$queryUserInfoMask$1 oOBENetSource$queryUserInfoMask$1;
        if (continuation instanceof OOBENetSource$queryUserInfoMask$1) {
            oOBENetSource$queryUserInfoMask$1 = (OOBENetSource$queryUserInfoMask$1) continuation;
            int i = oOBENetSource$queryUserInfoMask$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$queryUserInfoMask$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$queryUserInfoMask$1 = new OOBENetSource$queryUserInfoMask$1(this, continuation);
            }
        } else {
            oOBENetSource$queryUserInfoMask$1 = new OOBENetSource$queryUserInfoMask$1(this, continuation);
        }
        Object objG = oOBENetSource$queryUserInfoMask$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$queryUserInfoMask$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objG);
            Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to("ssoid", obj));
            a aVar = (a) com.heytap.health.network.core.a.j(a.class);
            oOBENetSource$queryUserInfoMask$1.label = 1;
            objG = aVar.g(mapMapOf, oOBENetSource$queryUserInfoMask$1);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objG);
        }
        NetResult netResult = (NetResult) objG;
        if (netResult.isSucceed()) {
            D d = netResult.body;
            Intrinsics.checkNotNullExpressionValue(d, "result.body");
            return d;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryUserInfoMask=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object m(@av1 @Nullable Object obj, @NotNull Continuation<Object> continuation) {
        OOBENetSource$reportDeviceInfo$1 oOBENetSource$reportDeviceInfo$1;
        if (continuation instanceof OOBENetSource$reportDeviceInfo$1) {
            oOBENetSource$reportDeviceInfo$1 = (OOBENetSource$reportDeviceInfo$1) continuation;
            int i = oOBENetSource$reportDeviceInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$reportDeviceInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$reportDeviceInfo$1 = new OOBENetSource$reportDeviceInfo$1(this, continuation);
            }
        } else {
            oOBENetSource$reportDeviceInfo$1 = new OOBENetSource$reportDeviceInfo$1(this, continuation);
        }
        Object objH = oOBENetSource$reportDeviceInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$reportDeviceInfo$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objH);
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            oOBENetSource$reportDeviceInfo$1.label = 1;
            objH = aVar.h(obj, oOBENetSource$reportDeviceInfo$1);
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
            return netResult.body;
        }
        throw new NetDataErrorException(netResult.errorCode, "reportDeviceInfo=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object n(@NotNull Object obj, @NotNull Object obj2, @NotNull Continuation<Object> continuation) {
        OOBENetSource$unbindDevice$1 oOBENetSource$unbindDevice$1;
        if (continuation instanceof OOBENetSource$unbindDevice$1) {
            oOBENetSource$unbindDevice$1 = (OOBENetSource$unbindDevice$1) continuation;
            int i = oOBENetSource$unbindDevice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$unbindDevice$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$unbindDevice$1 = new OOBENetSource$unbindDevice$1(this, continuation);
            }
        } else {
            oOBENetSource$unbindDevice$1 = new OOBENetSource$unbindDevice$1(this, continuation);
        }
        Object objL = oOBENetSource$unbindDevice$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$unbindDevice$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objL);
            Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("appTerminalId", obj), TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj2));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            oOBENetSource$unbindDevice$1.label = 1;
            objL = aVar.l(mapMapOf, oOBENetSource$unbindDevice$1);
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
        throw new NetDataErrorException(netResult.errorCode, "unbindDevice=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object o(@NotNull Object obj, @NotNull Object obj2, @NotNull Object obj3, @NotNull Continuation<Object> continuation) {
        OOBENetSource$unbindDeviceWithVirtual$1 oOBENetSource$unbindDeviceWithVirtual$1;
        if (continuation instanceof OOBENetSource$unbindDeviceWithVirtual$1) {
            oOBENetSource$unbindDeviceWithVirtual$1 = (OOBENetSource$unbindDeviceWithVirtual$1) continuation;
            int i = oOBENetSource$unbindDeviceWithVirtual$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$unbindDeviceWithVirtual$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$unbindDeviceWithVirtual$1 = new OOBENetSource$unbindDeviceWithVirtual$1(this, continuation);
            }
        } else {
            oOBENetSource$unbindDeviceWithVirtual$1 = new OOBENetSource$unbindDeviceWithVirtual$1(this, continuation);
        }
        Object objN = oOBENetSource$unbindDeviceWithVirtual$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$unbindDeviceWithVirtual$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objN);
            Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("appTerminalId", obj), TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj2), TuplesKt.to("ssoid", obj3));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            oOBENetSource$unbindDeviceWithVirtual$1.label = 1;
            objN = aVar.n(mapMapOf, oOBENetSource$unbindDeviceWithVirtual$1);
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
            return netResult.body;
        }
        throw new NetDataErrorException(netResult.errorCode, "unbindDeviceWithVirtual=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object q(@NotNull Object obj, @NotNull Object obj2, @NotNull Continuation<Object> continuation) {
        OOBENetSource$unbindSecondaryDevice$1 oOBENetSource$unbindSecondaryDevice$1;
        if (continuation instanceof OOBENetSource$unbindSecondaryDevice$1) {
            oOBENetSource$unbindSecondaryDevice$1 = (OOBENetSource$unbindSecondaryDevice$1) continuation;
            int i = oOBENetSource$unbindSecondaryDevice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$unbindSecondaryDevice$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$unbindSecondaryDevice$1 = new OOBENetSource$unbindSecondaryDevice$1(this, continuation);
            }
        } else {
            oOBENetSource$unbindSecondaryDevice$1 = new OOBENetSource$unbindSecondaryDevice$1(this, continuation);
        }
        Object objD = oOBENetSource$unbindSecondaryDevice$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$unbindSecondaryDevice$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objD);
            Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("appTerminalId", obj), TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj2));
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            oOBENetSource$unbindSecondaryDevice$1.label = 1;
            objD = aVar.d(mapMapOf, oOBENetSource$unbindSecondaryDevice$1);
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
        throw new NetDataErrorException(netResult.errorCode, "unbindSecondaryDevice=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object r(@NotNull Object obj, @NotNull Object obj2, @NotNull Object obj3, @NotNull Continuation<Object> continuation) {
        OOBENetSource$updateMobileVaid$1 oOBENetSource$updateMobileVaid$1;
        if (continuation instanceof OOBENetSource$updateMobileVaid$1) {
            oOBENetSource$updateMobileVaid$1 = (OOBENetSource$updateMobileVaid$1) continuation;
            int i = oOBENetSource$updateMobileVaid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$updateMobileVaid$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$updateMobileVaid$1 = new OOBENetSource$updateMobileVaid$1(this, continuation);
            }
        } else {
            oOBENetSource$updateMobileVaid$1 = new OOBENetSource$updateMobileVaid$1(this, continuation);
        }
        Object objI = oOBENetSource$updateMobileVaid$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$updateMobileVaid$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objI);
            Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(t04.DEVICE_UNIQUE_ID, obj), TuplesKt.to("mobileVaid", obj2), TuplesKt.to("ssoid", obj3));
            a aVar = (a) com.heytap.health.network.core.a.j(a.class);
            oOBENetSource$updateMobileVaid$1.label = 1;
            objI = aVar.i(mapMapOf, oOBENetSource$updateMobileVaid$1);
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
            return netResult.body;
        }
        throw new NetDataErrorException(netResult.errorCode, "updateMobileVaid=>" + netResult.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object s(@av1 @Nullable Object obj, @NotNull Continuation<Object> continuation) {
        OOBENetSource$updateVirtualAccount$1 oOBENetSource$updateVirtualAccount$1;
        if (continuation instanceof OOBENetSource$updateVirtualAccount$1) {
            oOBENetSource$updateVirtualAccount$1 = (OOBENetSource$updateVirtualAccount$1) continuation;
            int i = oOBENetSource$updateVirtualAccount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oOBENetSource$updateVirtualAccount$1.label = i - Integer.MIN_VALUE;
            } else {
                oOBENetSource$updateVirtualAccount$1 = new OOBENetSource$updateVirtualAccount$1(this, continuation);
            }
        } else {
            oOBENetSource$updateVirtualAccount$1 = new OOBENetSource$updateVirtualAccount$1(this, continuation);
        }
        Object objQ = oOBENetSource$updateVirtualAccount$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oOBENetSource$updateVirtualAccount$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQ);
            a aVar = (a) com.heytap.health.network.core.a.j(a.class);
            oOBENetSource$updateVirtualAccount$1.label = 1;
            objQ = aVar.q(obj, oOBENetSource$updateVirtualAccount$1);
            if (objQ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objQ);
        }
        NetResult netResult = (NetResult) objQ;
        if (netResult.isSucceed()) {
            return netResult.body;
        }
        throw new NetDataErrorException(netResult.errorCode, "updateVirtualAccount=>" + netResult.message);
    }
}
