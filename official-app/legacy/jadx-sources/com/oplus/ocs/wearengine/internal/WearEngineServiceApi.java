package com.oplus.ocs.wearengine.internal;

import android.content.Context;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.nvj;
import com.oplus.aiunit.vision.ro;
import com.oplus.ocs.wearengine.aidl.IWearEngineApi;
import com.oplus.ocs.wearengine.bean.PermissionResultParcelable;
import io.protostuff.MapSchema;
import java.io.PrintWriter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/ocs/wearengine/internal/WearEngineServiceApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/oplus/ocs/wearengine/aidl/IWearEngineApi;", "f", "Landroid/content/Context;", "context", "", "c", "b", "Ljava/io/PrintWriter;", "writer", "", "", "args", "a", "(Ljava/io/PrintWriter;[Ljava/lang/String;)V", "Lcom/oplus/ocs/wearengine/aidl/IWearEngineApi$Stub;", "i", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/ocs/wearengine/aidl/IWearEngineApi$Stub;", "service", "<init>", "()V", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WearEngineServiceApi implements cm9<IWearEngineApi> {

    @NotNull
    public static final String WEARENGINE_SERVICE_API = "wearengine_service_api";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy service = LazyKt__LazyJVMKt.lazy(new Function0<WearEngineServiceApi$service$2.AnonymousClass1>() { // from class: com.oplus.ocs.wearengine.internal.WearEngineServiceApi$service$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.oplus.ocs.wearengine.internal.WearEngineServiceApi$service$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new IWearEngineApi.Stub() { // from class: com.oplus.ocs.wearengine.internal.WearEngineServiceApi$service$2.1
                @Override // com.oplus.ocs.wearengine.aidl.IWearEngineApi
                public boolean isForeground() {
                    return ro.c();
                }

                @Override // com.oplus.ocs.wearengine.aidl.IWearEngineApi
                public void onRequestPermission(@Nullable String packageName, int requestId, @Nullable PermissionResultParcelable permissionResult) {
                }
            };
        }
    });

    @Override // com.oplus.aiunit.vision.cm9
    public void a(@NotNull PrintWriter writer, @Nullable String[] args) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        try {
            writer.println("isForeground: " + e().isForeground());
        } catch (Exception e2) {
            nvj.b("WearEngineServiceApi", "dump error " + e2.getMessage(), new Object[0]);
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        nvj.c("WearEngineServiceApi", "onDestroy", new Object[0]);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        nvj.c("WearEngineServiceApi", "onCreate", new Object[0]);
    }

    public final IWearEngineApi.Stub e() {
        return (IWearEngineApi.Stub) this.service.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IWearEngineApi d() {
        return e();
    }
}
