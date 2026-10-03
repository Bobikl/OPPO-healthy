package com.heytap.health.esim.mgr;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.wearable.lpa.proto.LPASyncProto;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.xp6;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.Observable;
import java.util.Observer;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0010\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/esim/mgr/EsimSubManager;", "", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "", "d", "", "commandId", "", "data", MapSchema.FIELD_NAME_ENTRY, "operatorType", "f", "Ljava/util/Observer;", "o", "a", "b", "Lcom/heytap/health/esim/mgr/EsimSubManager$a;", "Lkotlin/Lazy;", "c", "()Lcom/heytap/health/esim/mgr/EsimSubManager$a;", "mObservable", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class EsimSubManager {

    @NotNull
    public static final EsimSubManager INSTANCE = new EsimSubManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mObservable = LazyKt__LazyJVMKt.lazy(new Function0<a>() { // from class: com.heytap.health.esim.mgr.EsimSubManager$mObservable$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final EsimSubManager.a invoke() {
            return new EsimSubManager.a();
        }
    });
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/heytap/health/esim/mgr/EsimSubManager$a;", "Ljava/util/Observable;", "", "obj", "", "a", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends Observable {
        public static final int $stable = 0;

        public final void a(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            setChanged();
            notifyObservers(obj);
        }
    }

    public final void a(@Nullable Observer o) {
        if (o != null) {
            INSTANCE.c().addObserver(o);
        }
    }

    public final void b(@Nullable Observer o) {
        if (o != null) {
            INSTANCE.c().deleteObserver(o);
        }
    }

    public final a c() {
        return (a) mObservable.getValue();
    }

    public final void d(@NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        byte[] data = messageEvent.getData();
        int commandId = messageEvent.getCommandId();
        a7b.f("EsimHealth.EsimSubManager", "onMessageReceived commandId = " + commandId);
        if (1 == commandId) {
            try {
                a aVarC = c();
                LPASyncProto.GetEsimInfo from = LPASyncProto.GetEsimInfo.parseFrom(data);
                Intrinsics.checkNotNullExpressionValue(from, "parseFrom(data)");
                aVarC.a(from);
                return;
            } catch (InvalidProtocolBufferException e2) {
                a7b.b("EsimHealth.EsimSubManager", "GET_PROFILES e = " + e2.getMessage());
                return;
            }
        }
        if (3 == commandId) {
            try {
                a aVarC2 = c();
                LPASyncProto.RepalyEnableProfile from2 = LPASyncProto.RepalyEnableProfile.parseFrom(data);
                Intrinsics.checkNotNullExpressionValue(from2, "parseFrom(data)");
                aVarC2.a(from2);
                return;
            } catch (InvalidProtocolBufferException e3) {
                a7b.b("EsimHealth.EsimSubManager", "SET_EUICC_ENABLE e = " + e3.getMessage());
                return;
            }
        }
        if (4 == commandId) {
            try {
                a aVarC3 = c();
                LPASyncProto.RepalyDeleteProfile from3 = LPASyncProto.RepalyDeleteProfile.parseFrom(data);
                Intrinsics.checkNotNullExpressionValue(from3, "parseFrom(data)");
                aVarC3.a(from3);
                return;
            } catch (InvalidProtocolBufferException e4) {
                a7b.b("EsimHealth.EsimSubManager", "DELETE_PROFILE e = " + e4.getMessage());
                return;
            }
        }
        if (5 == commandId) {
            try {
                LPASyncProto.ReportingStatus reportingStatus = LPASyncProto.ReportingStatus.parseFrom(data);
                a aVarC4 = c();
                Intrinsics.checkNotNullExpressionValue(reportingStatus, "reportingStatus");
                aVarC4.a(reportingStatus);
                return;
            } catch (InvalidProtocolBufferException e5) {
                a7b.b("EsimHealth.EsimSubManager", "ACTIVE_REPORTING_STATUS e = " + e5.getMessage());
                return;
            }
        }
        if (6 == commandId) {
            try {
                a aVarC5 = c();
                LPASyncProto.RepalyResetEuicc from4 = LPASyncProto.RepalyResetEuicc.parseFrom(data);
                Intrinsics.checkNotNullExpressionValue(from4, "parseFrom(data)");
                aVarC5.a(from4);
                return;
            } catch (InvalidProtocolBufferException e6) {
                a7b.b("EsimHealth.EsimSubManager", "RESET_EUICC e = " + e6.getMessage());
                return;
            }
        }
        if (9 == commandId) {
            try {
                a aVarC6 = c();
                LPASyncProto.EncryptProfile from5 = LPASyncProto.EncryptProfile.parseFrom(data);
                Intrinsics.checkNotNullExpressionValue(from5, "parseFrom(data)");
                aVarC6.a(from5);
            } catch (InvalidProtocolBufferException e7) {
                a7b.b("EsimHealth.EsimSubManager", "GET_ENCRYPTED_ESIM_INFO e = " + e7.getMessage());
            }
        }
    }

    public final void e(int commandId, @Nullable byte[] data) {
        a7b.f("EsimHealth.EsimSubManager", "sendMessage commandId " + commandId);
        MessageEvent messageEvent = new MessageEvent(14, commandId, data);
        messageEvent.setEncryptOption(2);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new EsimSubManager$sendMessage$1(messageEvent, null), 3, null);
    }

    public final void f(int operatorType) {
        if (xp6.a(gl4.managerApi.getCurrActiveMac()).c4()) {
            e(7, LPASyncProto.EsimProcess.newBuilder().setOperatorType(operatorType).build().toByteArray());
        } else {
            a7b.b("EsimHealth.EsimSubManager", "sendStartEsimProcess not support");
        }
    }
}
