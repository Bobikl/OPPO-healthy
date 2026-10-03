package com.heytap.health.oobe.setups.pair;

import android.content.Context;
import com.heytap.health.oobe.Variants;
import com.heytap.health.oobe.dto.OOBEFail;
import com.heytap.health.oobe.fail.OOBEException;
import com.heytap.health.oobe.repo.OOBEDevice;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.cqf;
import com.oplus.aiunit.vision.g71;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.h6e;
import com.oplus.aiunit.vision.i6e;
import com.oplus.aiunit.vision.laj;
import com.oplus.aiunit.vision.s9j;
import io.protostuff.MapSchema;
import java.util.LinkedList;
import java.util.Queue;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/oobe/setups/pair/SyncTime;", "Lcom/oplus/aiunit/vision/g71;", "Lcom/oplus/aiunit/vision/gea$a;", "Lcom/oplus/aiunit/vision/h6e;", "Lcom/oplus/aiunit/vision/i6e;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/oobe/OOBEPairingData;", "pairingData", "Lkotlin/Result;", "", MapSchema.FIELD_NAME_ENTRY, "(Lcom/heytap/health/oobe/OOBEPairingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSyncTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncTime.kt\ncom/heytap/health/oobe/setups/pair/SyncTime\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,76:1\n314#2,11:77\n*S KotlinDebug\n*F\n+ 1 SyncTime.kt\ncom/heytap/health/oobe/setups/pair/SyncTime\n*L\n48#1:77,11\n*E\n"})
public final class SyncTime extends g71 {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/oobe/setups/pair/SyncTime$a", "Lcom/oplus/aiunit/vision/s9j$a;", "Landroid/content/Context;", "context", "", "deviceMac", "deviceModel", "b", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends s9j.a {
        public final /* synthetic */ CancellableContinuation<Result<Boolean>> a;
        public final /* synthetic */ Variants b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CancellableContinuation<? super Result<Boolean>> cancellableContinuation, Variants variants) {
            this.a = cancellableContinuation;
            this.b = variants;
        }

        @Override // com.oplus.aiunit.vision.s9j.a
        @NotNull
        public String b(@NotNull Context context, @NotNull String deviceMac, @NotNull String deviceModel) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(deviceMac, "deviceMac");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            if (!this.a.isActive()) {
                return "";
            }
            CancellableContinuation<Result<Boolean>> cancellableContinuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(Result.m5286boximpl(Result.m5287constructorimpl(ResultKt.createFailure(new OOBEException(new OOBEFail(null, null, null, this.b, 0, null, "syncTimeout", 55, null)))))));
            return "";
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/heytap/health/oobe/setups/pair/SyncTime$b", "Lcom/oplus/aiunit/vision/laj;", "", "t", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends laj {
        public final /* synthetic */ CancellableContinuation<Result<Boolean>> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Queue<s9j> queue, CancellableContinuation<? super Result<Boolean>> cancellableContinuation, Context context, String str, String str2) {
            super(context, str, str2, queue, true);
            this.y = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.laj
        public void t() {
            l();
            if (this.y.isActive()) {
                CancellableContinuation<Result<Boolean>> cancellableContinuation = this.y;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(Result.m5286boximpl(Result.m5287constructorimpl(Boolean.TRUE))));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<h6e, i6e> aVar, @NotNull Continuation<? super i6e> continuation) {
        SyncTime$intercept$1 syncTime$intercept$1;
        if (continuation instanceof SyncTime$intercept$1) {
            syncTime$intercept$1 = (SyncTime$intercept$1) continuation;
            int i = syncTime$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                syncTime$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                syncTime$intercept$1 = new SyncTime$intercept$1(this, continuation);
            }
        } else {
            syncTime$intercept$1 = new SyncTime$intercept$1(this, continuation);
        }
        Object objWithTimeoutOrNull = syncTime$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = syncTime$intercept$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            Variants pairingData = ((h6e) aVar.request()).getPairingData();
            if (pairingData.isPairIWatch()) {
                c("pair iwatch, no need sync time");
                cqf cqfVarRequest = aVar.request();
                syncTime$intercept$1.label = 1;
                objWithTimeoutOrNull = aVar.a(cqfVarRequest, syncTime$intercept$1);
                return objWithTimeoutOrNull == coroutine_suspended ? coroutine_suspended : objWithTimeoutOrNull;
            }
            if (pairingData.isPairSecond()) {
                c("pair second device, no need sync time");
                cqf cqfVarRequest2 = aVar.request();
                syncTime$intercept$1.label = 2;
                objWithTimeoutOrNull = aVar.a(cqfVarRequest2, syncTime$intercept$1);
                return objWithTimeoutOrNull == coroutine_suspended ? coroutine_suspended : objWithTimeoutOrNull;
            }
            if (OOBEDevice.INSTANCE.e(pairingData.getAddress())) {
                c("device is bind, pair no need sync time");
                cqf cqfVarRequest3 = aVar.request();
                syncTime$intercept$1.label = 3;
                objWithTimeoutOrNull = aVar.a(cqfVarRequest3, syncTime$intercept$1);
                return objWithTimeoutOrNull == coroutine_suspended ? coroutine_suspended : objWithTimeoutOrNull;
            }
            c("SyncTime start");
            SyncTime$intercept$result$1 syncTime$intercept$result$1 = new SyncTime$intercept$result$1(this, pairingData, null);
            syncTime$intercept$1.L$0 = this;
            syncTime$intercept$1.L$1 = aVar;
            syncTime$intercept$1.label = 4;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(101000L, syncTime$intercept$result$1, syncTime$intercept$1);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.c("SyncTime success -> " + ((Unit) objWithTimeoutOrNull));
            cqf cqfVarRequest4 = aVar.request();
            syncTime$intercept$1.L$0 = null;
            syncTime$intercept$1.L$1 = null;
            syncTime$intercept$1.label = 5;
            objWithTimeoutOrNull = aVar.a(cqfVarRequest4, syncTime$intercept$1);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            if (i2 == 2) {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            if (i2 == 3) {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            if (i2 == 4) {
                aVar = (gea.a) syncTime$intercept$1.L$1;
                this = (SyncTime) syncTime$intercept$1.L$0;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                this.c("SyncTime success -> " + ((Unit) objWithTimeoutOrNull));
                cqf cqfVarRequest5 = aVar.request();
                syncTime$intercept$1.L$0 = null;
                syncTime$intercept$1.L$1 = null;
                syncTime$intercept$1.label = 5;
                objWithTimeoutOrNull = aVar.a(cqfVarRequest5, syncTime$intercept$1);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
        }
        return objWithTimeoutOrNull;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Variants variants, Continuation<? super Result<Boolean>> continuation) {
        SyncTime$syncTime$1 syncTime$syncTime$1;
        if (continuation instanceof SyncTime$syncTime$1) {
            syncTime$syncTime$1 = (SyncTime$syncTime$1) continuation;
            int i = syncTime$syncTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                syncTime$syncTime$1.label = i - Integer.MIN_VALUE;
            } else {
                syncTime$syncTime$1 = new SyncTime$syncTime$1(this, continuation);
            }
        } else {
            syncTime$syncTime$1 = new SyncTime$syncTime$1(this, continuation);
        }
        Object result = syncTime$syncTime$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = syncTime$syncTime$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            syncTime$syncTime$1.L$0 = variants;
            syncTime$syncTime$1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(syncTime$syncTime$1), 1);
            cancellableContinuationImpl.initCancellability();
            LinkedList linkedList = new LinkedList();
            linkedList.offer(new s9j("com.op.smartwear.native.time.RECEIVER").h(new a(cancellableContinuationImpl, variants)));
            new b(linkedList, cancellableContinuationImpl, b78.a(), variants.getAddress(), variants.getModel()).r();
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(syncTime$syncTime$1);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(result);
        }
        return ((Result) result).getValue();
    }
}
