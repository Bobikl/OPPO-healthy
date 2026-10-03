package com.heytap.health.telecom;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.health.telecom.TelecomApiProvider;
import com.heytap.health.telecom.aidl.ITelecomSync;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.cm9;
import com.oplus.health.apiprovider.ClientManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/telecom/TelecomApiProvider;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/telecom/aidl/ITelecomSync;", b2n.f, "Landroid/content/Context;", "context", "", "c", "b", "Lcom/heytap/health/telecom/aidl/ITelecomSync$Stub;", "i", "Lkotlin/Lazy;", "f", "()Lcom/heytap/health/telecom/aidl/ITelecomSync$Stub;", "binder", "<init>", "()V", "Companion", "a", "telecom_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TelecomApiProvider implements cm9<ITelecomSync> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy binder = LazyKt__LazyJVMKt.lazy(new Function0<TelecomApiProvider$binder$2.AnonymousClass1>() { // from class: com.heytap.health.telecom.TelecomApiProvider$binder$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.heytap.health.telecom.TelecomApiProvider$binder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new ITelecomSync.Stub() { // from class: com.heytap.health.telecom.TelecomApiProvider$binder$2.1
                @Override // com.heytap.health.telecom.aidl.ITelecomSync
                public void listenPhoneState() {
                    PhoneTelecomUtils phoneTelecomUtils = PhoneTelecomUtils.INSTANCE;
                    Context contextA = b78.a();
                    Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
                    phoneTelecomUtils.i(contextA);
                }

                @Override // com.heytap.health.telecom.aidl.ITelecomSync
                public void onAction(int action) {
                    a7b.f("TelHealth.TelecomApiProvider", "onAction called with action = [" + action + "]");
                    if (action == 1) {
                        TelecomOnceApiProvider.INSTANCE.c(true);
                        PhoneTelecomUtils phoneTelecomUtils = PhoneTelecomUtils.INSTANCE;
                        Context contextA = b78.a();
                        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
                        phoneTelecomUtils.i(contextA);
                        phoneTelecomUtils.m();
                        return;
                    }
                    if (action != 3) {
                        return;
                    }
                    PhoneTelecomUtils phoneTelecomUtils2 = PhoneTelecomUtils.INSTANCE;
                    Context contextA2 = b78.a();
                    Intrinsics.checkNotNullExpressionValue(contextA2, "getAppContext()");
                    phoneTelecomUtils2.n(contextA2);
                    phoneTelecomUtils2.s();
                }
            };
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.telecom.TelecomApiProvider$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/health/telecom/TelecomApiProvider$a;", "", "Lcom/heytap/health/telecom/aidl/ITelecomSync;", "b", "", "d", "()Lkotlin/Unit;", "<init>", "()V", "telecom_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final ITelecomSync c(IBinder iBinder) {
            return ITelecomSync.Stub.asInterface(iBinder);
        }

        @JvmStatic
        @Nullable
        public final ITelecomSync b() {
            return (ITelecomSync) ClientManager.getInstance().getBuildService("api_provider_telecom_transport", new ClientManager.a() { // from class: com.oplus.aiunit.vision.fqj
                @Override // com.oplus.health.apiprovider.ClientManager.a
                public final Object a(IBinder iBinder) {
                    return TelecomApiProvider.Companion.c(iBinder);
                }
            });
        }

        @Nullable
        public final Unit d() {
            try {
                ITelecomSync iTelecomSyncB = b();
                if (iTelecomSyncB == null) {
                    return null;
                }
                iTelecomSyncB.listenPhoneState();
                return Unit.INSTANCE;
            } catch (RemoteException e2) {
                a7b.b("TelHealth.TelecomApiProvider", "listenPhoneState exception: " + e2.getMessage());
                return Unit.INSTANCE;
            }
        }
    }

    @JvmStatic
    @Nullable
    public static final ITelecomSync e() {
        return INSTANCE.b();
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ITelecomSync.Stub f() {
        return (ITelecomSync.Stub) this.binder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ITelecomSync d() {
        return f();
    }
}
