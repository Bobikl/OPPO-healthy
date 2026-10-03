package com.heytap.health.oobe.setups.pair;

import com.heytap.health.oobe.OOBELogKt;
import com.heytap.health.oobe.Variants;
import com.heytap.health.oobe.dto.FailOOBEKt;
import com.heytap.health.oobe.repo.OOBEDevice;
import com.heytap.health.oobe.repo.OOBENetSource;
import com.heytap.health.protocol.dm.DMProto$BindKey;
import com.heytap.health.protocol.iwatch.IWatch$IWatchBindKeyResponse;
import com.oplus.aiunit.vision.GetBindKey;
import com.oplus.aiunit.vision.g71;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.h6e;
import com.oplus.aiunit.vision.i6e;
import com.oplus.aiunit.vision.xxb;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/heytap/health/oobe/setups/pair/GetSecretBindKey;", "Lcom/oplus/aiunit/vision/g71;", "Lcom/oplus/aiunit/vision/gea$a;", "Lcom/oplus/aiunit/vision/h6e;", "Lcom/oplus/aiunit/vision/i6e;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class GetSecretBindKey extends g71 {
    /* JADX WARN: Code duplicated, block: B:42:0x012a A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:19:0x0055, B:51:0x0191, B:52:0x019d, B:22:0x006e, B:46:0x0157, B:25:0x0087, B:40:0x00f4, B:42:0x012a, B:47:0x0164), top: B:63:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0151 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0152  */
    /* JADX WARN: Code duplicated, block: B:47:0x0164 A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:19:0x0055, B:51:0x0191, B:52:0x019d, B:22:0x006e, B:46:0x0157, B:25:0x0087, B:40:0x00f4, B:42:0x012a, B:47:0x0164), top: B:63:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x018b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x018c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.oplus.aiunit.vision.gea$a, com.oplus.aiunit.vision.gea$a<com.oplus.aiunit.vision.h6e, com.oplus.aiunit.vision.i6e>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.heytap.health.oobe.OOBEPairingData] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.oplus.aiunit.vision.gea$a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<h6e, i6e> aVar, @NotNull Continuation<? super i6e> continuation) {
        GetSecretBindKey$intercept$1 getSecretBindKey$intercept$1;
        h6e h6eVar;
        GetSecretBindKey getSecretBindKey;
        h6e h6eVar2;
        ?? r7;
        Variants variants;
        Object obj;
        Object objU;
        h6e h6eVar3;
        ?? r5;
        GetSecretBindKey getSecretBindKey2;
        h6e h6eVar4;
        Object objU2;
        ?? r6;
        h6e h6eVar5;
        Variants variants2;
        ?? r8;
        Variants variants3;
        if (continuation instanceof GetSecretBindKey$intercept$1) {
            getSecretBindKey$intercept$1 = (GetSecretBindKey$intercept$1) continuation;
            int i = getSecretBindKey$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSecretBindKey$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                getSecretBindKey$intercept$1 = new GetSecretBindKey$intercept$1(this, continuation);
            }
        } else {
            getSecretBindKey$intercept$1 = new GetSecretBindKey$intercept$1(this, continuation);
        }
        Object objA = getSecretBindKey$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = getSecretBindKey$intercept$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(objA);
                }
                if (i2 == 2) {
                    h6eVar2 = (h6e) getSecretBindKey$intercept$1.L$4;
                    Variants variants4 = (Variants) getSecretBindKey$intercept$1.L$3;
                    h6e h6eVar6 = (h6e) getSecretBindKey$intercept$1.L$2;
                    gea.a aVar2 = (gea.a) getSecretBindKey$intercept$1.L$1;
                    getSecretBindKey = (GetSecretBindKey) getSecretBindKey$intercept$1.L$0;
                    ResultKt.throwOnFailure(objA);
                    obj = objA;
                    h6eVar = h6eVar6;
                    r7 = aVar2;
                    variants = variants4;
                    h6eVar2.f(((GetBindKey) obj).getKey());
                    h6eVar.getDeviceInfo().setBindKey(h6eVar.getBindKey());
                    getSecretBindKey.c("GetSecretBindKey -> from cloud succeed" + OOBELogKt.b(h6eVar.getBindKey()));
                    if (variants.isPairIWatch()) {
                        OOBEDevice oOBEDevice = OOBEDevice.INSTANCE;
                        String address = variants.getAddress();
                        MessageEvent messageEventG = xxb.G(h6eVar.getBindKey());
                        Intrinsics.checkNotNullExpressionValue(messageEventG, "getIWatchSign(request.bindKey)");
                        GetSecretBindKey$intercept$2 getSecretBindKey$intercept$2 = GetSecretBindKey$intercept$2.INSTANCE;
                        getSecretBindKey$intercept$1.L$0 = getSecretBindKey;
                        getSecretBindKey$intercept$1.L$1 = r7;
                        getSecretBindKey$intercept$1.L$2 = h6eVar;
                        getSecretBindKey$intercept$1.L$3 = variants;
                        getSecretBindKey$intercept$1.L$4 = h6eVar;
                        getSecretBindKey$intercept$1.label = 3;
                        objU2 = oOBEDevice.u(address, messageEventG, getSecretBindKey$intercept$2, getSecretBindKey$intercept$1);
                        if (objU2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        h6eVar3 = h6eVar;
                        r6 = r7;
                        getSecretBindKey2 = getSecretBindKey;
                        objA = objU2;
                        h6eVar5 = h6eVar3;
                        variants2 = variants;
                        String secretBindKey = ((IWatch$IWatchBindKeyResponse) objA).getSecretBindKey();
                        Intrinsics.checkNotNullExpressionValue(secretBindKey, "OOBEDevice.sendMessage(\n…          ).secretBindKey");
                        h6eVar5.i(secretBindKey);
                        r8 = r6;
                        aVar = variants2;
                    } else {
                        OOBEDevice oOBEDevice2 = OOBEDevice.INSTANCE;
                        String address2 = variants.getAddress();
                        MessageEvent messageEventK = xxb.k(h6eVar.getBindKey());
                        Intrinsics.checkNotNullExpressionValue(messageEventK, "getBindKeySignMessage(request.bindKey)");
                        GetSecretBindKey$intercept$3 getSecretBindKey$intercept$3 = GetSecretBindKey$intercept$3.INSTANCE;
                        getSecretBindKey$intercept$1.L$0 = getSecretBindKey;
                        getSecretBindKey$intercept$1.L$1 = r7;
                        getSecretBindKey$intercept$1.L$2 = h6eVar;
                        getSecretBindKey$intercept$1.L$3 = variants;
                        getSecretBindKey$intercept$1.L$4 = h6eVar;
                        getSecretBindKey$intercept$1.label = 4;
                        objU = oOBEDevice2.u(address2, messageEventK, getSecretBindKey$intercept$3, getSecretBindKey$intercept$1);
                        if (objU == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        h6eVar3 = h6eVar;
                        r5 = r7;
                        getSecretBindKey2 = getSecretBindKey;
                        objA = objU;
                        h6eVar4 = h6eVar3;
                        variants3 = variants;
                        String secretBindKey2 = ((DMProto$BindKey) objA).getSecretBindKey();
                        Intrinsics.checkNotNullExpressionValue(secretBindKey2, "OOBEDevice.sendMessage(\n…          ).secretBindKey");
                        h6eVar4.i(secretBindKey2);
                        r8 = r5;
                        aVar = variants3;
                    }
                } else if (i2 == 3) {
                    h6eVar5 = (h6e) getSecretBindKey$intercept$1.L$4;
                    Variants variants5 = (Variants) getSecretBindKey$intercept$1.L$3;
                    h6eVar3 = (h6e) getSecretBindKey$intercept$1.L$2;
                    gea.a aVar3 = (gea.a) getSecretBindKey$intercept$1.L$1;
                    getSecretBindKey2 = (GetSecretBindKey) getSecretBindKey$intercept$1.L$0;
                    ResultKt.throwOnFailure(objA);
                    r6 = aVar3;
                    variants2 = variants5;
                    String secretBindKey3 = ((IWatch$IWatchBindKeyResponse) objA).getSecretBindKey();
                    Intrinsics.checkNotNullExpressionValue(secretBindKey3, "OOBEDevice.sendMessage(\n…          ).secretBindKey");
                    h6eVar5.i(secretBindKey3);
                    r8 = r6;
                    aVar = variants2;
                } else if (i2 == 4) {
                    h6eVar4 = (h6e) getSecretBindKey$intercept$1.L$4;
                    Variants variants6 = (Variants) getSecretBindKey$intercept$1.L$3;
                    h6eVar3 = (h6e) getSecretBindKey$intercept$1.L$2;
                    gea.a aVar4 = (gea.a) getSecretBindKey$intercept$1.L$1;
                    getSecretBindKey2 = (GetSecretBindKey) getSecretBindKey$intercept$1.L$0;
                    ResultKt.throwOnFailure(objA);
                    r5 = aVar4;
                    variants3 = variants6;
                    String secretBindKey4 = ((DMProto$BindKey) objA).getSecretBindKey();
                    Intrinsics.checkNotNullExpressionValue(secretBindKey4, "OOBEDevice.sendMessage(\n…          ).secretBindKey");
                    h6eVar4.i(secretBindKey4);
                    r8 = r5;
                    aVar = variants3;
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objA);
                }
            }
            ResultKt.throwOnFailure(objA);
            h6eVar = (h6e) aVar.request();
            Variants pairingData = h6eVar.getPairingData();
            if (!OOBEDevice.INSTANCE.i(pairingData.getAddress())) {
                c("GetSecretBindKey -> current device[" + pairingData.getModel() + "] no support bind key, ignore");
                getSecretBindKey$intercept$1.label = 1;
                objA = aVar.a(h6eVar, getSecretBindKey$intercept$1);
                return objA == coroutine_suspended ? coroutine_suspended : objA;
            }
            try {
                OOBENetSource oOBENetSource = OOBENetSource.INSTANCE;
                String address3 = pairingData.getAddress();
                getSecretBindKey$intercept$1.L$0 = this;
                getSecretBindKey$intercept$1.L$1 = aVar;
                getSecretBindKey$intercept$1.L$2 = h6eVar;
                getSecretBindKey$intercept$1.L$3 = pairingData;
                getSecretBindKey$intercept$1.L$4 = h6eVar;
                getSecretBindKey$intercept$1.label = 2;
                Object objG = oOBENetSource.g(address3, getSecretBindKey$intercept$1);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
                getSecretBindKey = this;
                h6eVar2 = h6eVar;
                r7 = aVar;
                variants = pairingData;
                obj = objG;
                h6eVar2.f(((GetBindKey) obj).getKey());
                h6eVar.getDeviceInfo().setBindKey(h6eVar.getBindKey());
                getSecretBindKey.c("GetSecretBindKey -> from cloud succeed" + OOBELogKt.b(h6eVar.getBindKey()));
                if (variants.isPairIWatch()) {
                    OOBEDevice oOBEDevice3 = OOBEDevice.INSTANCE;
                    String address4 = variants.getAddress();
                    MessageEvent messageEventG2 = xxb.G(h6eVar.getBindKey());
                    Intrinsics.checkNotNullExpressionValue(messageEventG2, "getIWatchSign(request.bindKey)");
                    GetSecretBindKey$intercept$2 getSecretBindKey$intercept$4 = GetSecretBindKey$intercept$2.INSTANCE;
                    getSecretBindKey$intercept$1.L$0 = getSecretBindKey;
                    getSecretBindKey$intercept$1.L$1 = r7;
                    getSecretBindKey$intercept$1.L$2 = h6eVar;
                    getSecretBindKey$intercept$1.L$3 = variants;
                    getSecretBindKey$intercept$1.L$4 = h6eVar;
                    getSecretBindKey$intercept$1.label = 3;
                    objU2 = oOBEDevice3.u(address4, messageEventG2, getSecretBindKey$intercept$4, getSecretBindKey$intercept$1);
                    if (objU2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    h6eVar3 = h6eVar;
                    r6 = r7;
                    getSecretBindKey2 = getSecretBindKey;
                    objA = objU2;
                    h6eVar5 = h6eVar3;
                    variants2 = variants;
                    String secretBindKey5 = ((IWatch$IWatchBindKeyResponse) objA).getSecretBindKey();
                    Intrinsics.checkNotNullExpressionValue(secretBindKey5, "OOBEDevice.sendMessage(\n…          ).secretBindKey");
                    h6eVar5.i(secretBindKey5);
                    r8 = r6;
                    aVar = variants2;
                } else {
                    OOBEDevice oOBEDevice4 = OOBEDevice.INSTANCE;
                    String address5 = variants.getAddress();
                    MessageEvent messageEventK2 = xxb.k(h6eVar.getBindKey());
                    Intrinsics.checkNotNullExpressionValue(messageEventK2, "getBindKeySignMessage(request.bindKey)");
                    GetSecretBindKey$intercept$3 getSecretBindKey$intercept$5 = GetSecretBindKey$intercept$3.INSTANCE;
                    getSecretBindKey$intercept$1.L$0 = getSecretBindKey;
                    getSecretBindKey$intercept$1.L$1 = r7;
                    getSecretBindKey$intercept$1.L$2 = h6eVar;
                    getSecretBindKey$intercept$1.L$3 = variants;
                    getSecretBindKey$intercept$1.L$4 = h6eVar;
                    getSecretBindKey$intercept$1.label = 4;
                    objU = oOBEDevice4.u(address5, messageEventK2, getSecretBindKey$intercept$5, getSecretBindKey$intercept$1);
                    if (objU == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    h6eVar3 = h6eVar;
                    r5 = r7;
                    getSecretBindKey2 = getSecretBindKey;
                    objA = objU;
                    h6eVar4 = h6eVar3;
                    variants3 = variants;
                    String secretBindKey6 = ((DMProto$BindKey) objA).getSecretBindKey();
                    Intrinsics.checkNotNullExpressionValue(secretBindKey6, "OOBEDevice.sendMessage(\n…          ).secretBindKey");
                    h6eVar4.i(secretBindKey6);
                    r8 = r5;
                    aVar = variants3;
                }
            } catch (Throwable th) {
                th = th;
                aVar = pairingData;
                throw FailOOBEKt.f(aVar, null, "getBindKeyError\n" + th.getMessage(), 2, null);
            }
            h6eVar3.getDeviceInfo().setSign(h6eVar3.getDeviceBindKey());
            getSecretBindKey2.c("GetSecretBindKey -> from device succeed" + OOBELogKt.b(h6eVar3.getDeviceBindKey()));
            getSecretBindKey$intercept$1.L$0 = null;
            getSecretBindKey$intercept$1.L$1 = null;
            getSecretBindKey$intercept$1.L$2 = null;
            getSecretBindKey$intercept$1.L$3 = null;
            getSecretBindKey$intercept$1.L$4 = null;
            getSecretBindKey$intercept$1.label = 5;
            objA = r8.a(h6eVar3, getSecretBindKey$intercept$1);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
