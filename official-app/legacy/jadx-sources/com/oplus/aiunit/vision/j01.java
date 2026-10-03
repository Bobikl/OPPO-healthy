package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.coloros.sceneservice.sceneprovider.service.BaseSceneService;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/j01;", "Lcom/coloros/sceneservice/sceneprovider/service/BaseSceneService;", "Landroid/os/Bundle;", "bundle", "", "d", "handleBundle", "", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "Companion", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public abstract class j01 extends BaseSceneService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static boolean a;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.j01$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/j01$a;", "", "", "status", "", "a", fkj.PARAM_SWITCH_STATUS, "Z", "getSwitchStatus", "()Z", "b", "(Z)V", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(boolean status) {
            b(status);
        }

        public final void b(boolean z) {
            j01.a = z;
        }
    }

    public abstract void d(@Nullable Bundle bundle);

    public final boolean e() {
        if (mvc.a(gl4.managerApi.getCurrentConnectId()).r0()) {
            return !com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.k(rsk.VAD_TYPE_BREENO);
        }
        return true;
    }

    @Override // com.coloros.sceneservice.sceneprovider.service.BaseSceneService
    @Deprecated(message = "Deprecated in Java")
    public void handleBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.handleBundle(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append("[handleBundle] --> ");
        sb.append(bundle);
        if (a && !e()) {
            d(bundle);
            return;
        }
        a7b.m("NTF_BaseBreenoService", "handleBundle: need reject, switchStatus=" + a);
    }
}
