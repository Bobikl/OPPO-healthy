package com.heytap.health.settings.watch.sporthealthsettings.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.protocol.fitness.FitnessProto$EcgActiveState;
import com.heytap.health.protocol.fitness.FitnessProto$EcgActiveStateReply;
import com.heytap.health.settings.watch.sporthealthsettings.utils.EcgActiveStateUtils;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ad5;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.j1j;
import com.oplus.aiunit.vision.m6c;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.xm3;
import com.oplus.aiunit.vision.zq0;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/utils/EcgActiveStateUtils;", "", "Companion", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class EcgActiveStateUtils {
    public static final int $stable = 0;

    @NotNull
    public static final String ECG_ACTIVE_SETTING_KEY = "ECG_ACTIVATION_STATE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String a = "EcgActiveStateUtils";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\b\u0010\b\u001a\u00020\u0002H\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007J\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/utils/EcgActiveStateUtils$Companion;", "", "", "o", "Lcom/oplus/aiunit/vision/xm3;", "", "resultCallback", b2n.f, LogFieldKey.MESSAGE_KEY, "j", "()Ljava/lang/Boolean;", MapSchema.FIELD_NAME_ENTRY, b2n.g, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "n", "i", "", "TAG", "Ljava/lang/String;", LogFieldKey.LEVEL_KEY, "()Ljava/lang/String;", MapSchema.FIELD_NAME_KEY, "spKey", "ECG_ACTIVE_SETTING_KEY", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nEcgActiveStateUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcgActiveStateUtils.kt\ncom/heytap/health/settings/watch/sporthealthsettings/utils/EcgActiveStateUtils$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,266:1\n314#2,11:267\n*S KotlinDebug\n*F\n+ 1 EcgActiveStateUtils.kt\ncom/heytap/health/settings/watch/sporthealthsettings/utils/EcgActiveStateUtils$Companion\n*L\n192#1:267,11\n*E\n"})
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/m6c$a;", "result", "", "f", "(Lcom/oplus/aiunit/vision/m6c$a;)V"}, k = 3, mv = {1, 8, 0})
        public static final class a implements m6c {
            public final /* synthetic */ CancellableContinuation<Boolean> i;

            /* JADX WARN: Multi-variable type inference failed */
            public a(CancellableContinuation<? super Boolean> cancellableContinuation) {
                this.i = cancellableContinuation;
            }

            @Override // com.oplus.aiunit.vision.m6c
            public final void f(@NotNull m6c.a result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (!result.f()) {
                    if (result.g()) {
                        a7b.f(EcgActiveStateUtils.INSTANCE.l(), "get device EcgActive result type Time out");
                    } else {
                        a7b.f(EcgActiveStateUtils.INSTANCE.l(), "get device EcgActive result type BT error");
                    }
                    this.i.resumeWith(Result.m5287constructorimpl(null));
                    return;
                }
                try {
                    FitnessProto$EcgActiveStateReply from = FitnessProto$EcgActiveStateReply.parseFrom(result.e().getData());
                    int type = from.getType();
                    int value = from.getValue();
                    boolean z = true;
                    if (type != 1 || value != 1) {
                        z = false;
                    }
                    a7b.f(EcgActiveStateUtils.INSTANCE.l(), "get device EcgActive result isEcgActive: " + z);
                    this.i.resumeWith(Result.m5287constructorimpl(Boolean.valueOf(z)));
                } catch (InvalidProtocolBufferException e2) {
                    a7b.f(EcgActiveStateUtils.INSTANCE.l(), "Parse EcgActive response msg fail=" + e2);
                    this.i.resumeWith(Result.m5287constructorimpl(null));
                }
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0027  */
        public static final void f(xm3 xm3Var, m6c.a result) {
            boolean z;
            Intrinsics.checkNotNullParameter(result, "result");
            if (!result.f()) {
                if (result.g()) {
                    a7b.f(EcgActiveStateUtils.INSTANCE.l(), "enableEcgActive result time out");
                    return;
                } else {
                    a7b.f(EcgActiveStateUtils.INSTANCE.l(), "enableEcgActive result BT error");
                    return;
                }
            }
            try {
                FitnessProto$EcgActiveStateReply from = FitnessProto$EcgActiveStateReply.parseFrom(result.e().getData());
                int type = from.getType();
                int value = from.getValue();
                if (type == 2) {
                    z = true;
                    if (value != 1) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                a7b.f(EcgActiveStateUtils.INSTANCE.l(), "enableEcgActive result type: " + type + " value=" + value);
                if (xm3Var != null) {
                    xm3Var.onResult(Boolean.valueOf(z));
                }
            } catch (InvalidProtocolBufferException e2) {
                a7b.f(EcgActiveStateUtils.INSTANCE.l(), "Parse enableEcgActive response msg fail=" + e2);
            }
        }

        @JvmStatic
        public final void e(@Nullable final xm3<Boolean> resultCallback) {
            if (zq0.w().z()) {
                if (gl4.businessApi.i(gl4.managerApi.getCurrentConnectId()) != null) {
                    a7b.m(l(), "enableDeviceEcgActiveState() family device, no support");
                    return;
                }
                a7b.f(l(), "enable Ecg Active");
                zq0.w().S(new MessageEvent(5, 107, FitnessProto$EcgActiveState.newBuilder().setType(2).setValue(1).build().toByteArray()), 20000, new m6c() { // from class: com.oplus.aiunit.vision.kc6
                    @Override // com.oplus.aiunit.vision.m6c
                    public final void f(m6c.a aVar) {
                        EcgActiveStateUtils.Companion.f(resultCallback, aVar);
                    }
                });
            }
        }

        @JvmStatic
        public final void g(@NotNull xm3<Boolean> resultCallback) {
            Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
            Boolean boolJ = j();
            if (boolJ == null || !boolJ.booleanValue()) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.f()), null, null, new EcgActiveStateUtils$Companion$getAccountEcgActiveState$1(resultCallback, null), 3, null);
                return;
            }
            a7b.f(l(), "getAccountEcgActiveState() from Sp = " + boolJ);
            resultCallback.onResult(boolJ);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object h(Continuation<? super Boolean> continuation) throws Throwable {
            EcgActiveStateUtils$Companion$getCloudEcgActiveState$1 ecgActiveStateUtils$Companion$getCloudEcgActiveState$1;
            if (continuation instanceof EcgActiveStateUtils$Companion$getCloudEcgActiveState$1) {
                ecgActiveStateUtils$Companion$getCloudEcgActiveState$1 = (EcgActiveStateUtils$Companion$getCloudEcgActiveState$1) continuation;
                int i = ecgActiveStateUtils$Companion$getCloudEcgActiveState$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    ecgActiveStateUtils$Companion$getCloudEcgActiveState$1.label = i - Integer.MIN_VALUE;
                } else {
                    ecgActiveStateUtils$Companion$getCloudEcgActiveState$1 = new EcgActiveStateUtils$Companion$getCloudEcgActiveState$1(this, continuation);
                }
            } else {
                ecgActiveStateUtils$Companion$getCloudEcgActiveState$1 = new EcgActiveStateUtils$Companion$getCloudEcgActiveState$1(this, continuation);
            }
            Object objWithContext = ecgActiveStateUtils$Companion$getCloudEcgActiveState$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = ecgActiveStateUtils$Companion$getCloudEcgActiveState$1.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objWithContext);
                    CoroutineContext coroutineContextE = wq8.INSTANCE.e();
                    EcgActiveStateUtils$Companion$getCloudEcgActiveState$2 ecgActiveStateUtils$Companion$getCloudEcgActiveState$2 = new EcgActiveStateUtils$Companion$getCloudEcgActiveState$2(null);
                    ecgActiveStateUtils$Companion$getCloudEcgActiveState$1.L$0 = this;
                    ecgActiveStateUtils$Companion$getCloudEcgActiveState$1.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineContextE, ecgActiveStateUtils$Companion$getCloudEcgActiveState$2, ecgActiveStateUtils$Companion$getCloudEcgActiveState$1);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (Companion) ecgActiveStateUtils$Companion$getCloudEcgActiveState$1.L$0;
                    ResultKt.throwOnFailure(objWithContext);
                }
                return (Boolean) objWithContext;
            } catch (CancellationException e2) {
                a7b.c(this.l(), "Coroutine cancelled", e2);
                return null;
            } catch (Exception e3) {
                a7b.c(this.l(), "Coroutine context error", e3);
                return null;
            }
        }

        public final Object i(Continuation<? super Boolean> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            zq0.w().T(new MessageEvent(5, 107, FitnessProto$EcgActiveState.newBuilder().setType(1).setValue(1).build().toByteArray()), new a(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        @Nullable
        public final Boolean j() {
            boolean zN = v9g.x(ad5.SP_KEY_ECG_ACTIVE_STATE).n(k());
            Boolean boolValueOf = zN ? Boolean.valueOf(v9g.x(ad5.SP_KEY_ECG_ACTIVE_STATE).q(k())) : null;
            a7b.f(l(), "getEcgActiveStateSp() hasSp=" + zN + "; result=" + boolValueOf);
            return boolValueOf;
        }

        public final String k() {
            String strE = j1j.e(um.c().getSsoid() + "AccountEcgActiveState");
            Intrinsics.checkNotNullExpressionValue(strE, "strToMD5(mSsoid + \"AccountEcgActiveState\")");
            return strE;
        }

        @NotNull
        public final String l() {
            return EcgActiveStateUtils.a;
        }

        @JvmStatic
        public final void m() {
            n(true);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new EcgActiveStateUtils$Companion$saveAccountEcgActiveState$1(null), 3, null);
        }

        public final void n(boolean value) {
            l();
            StringBuilder sb = new StringBuilder();
            sb.append("setEcgActiveStateSp() value=");
            sb.append(value);
            v9g.x(ad5.SP_KEY_ECG_ACTIVE_STATE).W(k(), value);
        }

        @JvmStatic
        public final void o() {
            if (!zq0.w().z()) {
                a7b.b(l(), "syncDeviceEcgActiveState() fail bt no connect");
                return;
            }
            if (gl4.businessApi.i(gl4.managerApi.getCurrentConnectId()) != null) {
                a7b.b(l(), "syncDeviceEcgActiveState() family device, don't sync");
            } else {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new EcgActiveStateUtils$Companion$syncDeviceEcgActiveState$1(null), 3, null);
            }
        }
    }

    @JvmStatic
    public static final void b(@Nullable xm3<Boolean> xm3Var) {
        INSTANCE.e(xm3Var);
    }

    @JvmStatic
    public static final void c(@NotNull xm3<Boolean> xm3Var) {
        INSTANCE.g(xm3Var);
    }

    @JvmStatic
    public static final void d() {
        INSTANCE.m();
    }

    @JvmStatic
    public static final void e() {
        INSTANCE.o();
    }
}
