package com.heytap.health.device.ota;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.health.device.ota.OTAUpdateMainApi;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.op;
import com.oplus.health.apiprovider.ClientManager;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001b\u0010\u000e\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/device/ota/OTAUpdateMainApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/device/ota/IOTASyncMain;", "Lcom/heytap/health/device/ota/IOTASyncMain$Stub;", "f", "Landroid/content/Context;", "context", "", "c", "b", "i", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/device/ota/IOTASyncMain$Stub;", "mBinder", "<init>", "()V", "Companion", "a", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
public final class OTAUpdateMainApi implements cm9<IOTASyncMain> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mBinder = LazyKt__LazyJVMKt.lazy(new Function0<OTAUpdateMainApi$mBinder$2.AnonymousClass1>() { // from class: com.heytap.health.device.ota.OTAUpdateMainApi$mBinder$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.heytap.health.device.ota.OTAUpdateMainApi$mBinder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new IOTASyncMain.Stub() { // from class: com.heytap.health.device.ota.OTAUpdateMainApi$mBinder$2.1
                @Override // com.heytap.health.device.ota.IOTASyncMain
                public void onProgressClick() {
                    Activity activityS = op.n().s();
                    if (activityS instanceof OTAUpdateActivity) {
                        ((OTAUpdateActivity) activityS).C8();
                    }
                }
            };
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.device.ota.OTAUpdateMainApi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/device/ota/OTAUpdateMainApi$a;", "", "Lcom/heytap/health/device/ota/IOTASyncMain;", "b", "", "d", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final IOTASyncMain c(IBinder iBinder) {
            return IOTASyncMain.Stub.asInterface(iBinder);
        }

        @JvmStatic
        @Nullable
        public final IOTASyncMain b() {
            return (IOTASyncMain) ClientManager.getInstance().getBuildService("api_provider_ota_main", new ClientManager.a() { // from class: com.oplus.aiunit.vision.k8d
                @Override // com.oplus.health.apiprovider.ClientManager.a
                public final Object a(IBinder iBinder) {
                    return OTAUpdateMainApi.Companion.c(iBinder);
                }
            });
        }

        @JvmStatic
        public final void d() {
            try {
                IOTASyncMain iOTASyncMainB = b();
                if (iOTASyncMainB != null) {
                    iOTASyncMainB.onProgressClick();
                }
            } catch (RemoteException e2) {
                a7b.b("OTAUpdateMainApi", "onProgressClick " + e2.getMessage());
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final IOTASyncMain.Stub e() {
        return (IOTASyncMain.Stub) this.mBinder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IOTASyncMain.Stub d() {
        return e();
    }
}
