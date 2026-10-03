package com.oplus.aiunit.vision;

import com.heytap.health.watch.notification.ParsedNotificationActionProto;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/vxc;", "Lcom/oplus/aiunit/vision/gz9;", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "f", "", "commandId", "", "data", "a", "b", "d", "", "key", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/watch/notification/ParsedNotificationActionProto;", "actionReply", "c", "Lcom/oplus/aiunit/vision/m9k;", "Lcom/oplus/aiunit/vision/m9k;", "worker", "<init>", "()V", "Companion", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class vxc implements gz9 {

    @NotNull
    public static final String TAG = "NTF_TransceiverConvert";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public m9k worker;

    @Override // com.oplus.aiunit.vision.gz9
    public void a(int commandId, @Nullable byte[] data) {
        m9k m9kVar = this.worker;
        if (m9kVar != null) {
            m9kVar.a(commandId, data);
        }
    }

    @Override // com.oplus.aiunit.vision.gz9
    public void b(@Nullable byte[] data) {
        m9k m9kVar = this.worker;
        if (m9kVar != null) {
            m9kVar.b(data);
        }
    }

    public void c(@NotNull ParsedNotificationActionProto actionReply) {
        Intrinsics.checkNotNullParameter(actionReply, "actionReply");
        m9k m9kVar = this.worker;
        if (m9kVar != null) {
            m9kVar.i(actionReply);
        }
    }

    public void d(@Nullable byte[] data) {
        m9k m9kVar = this.worker;
        if (m9kVar != null) {
            m9kVar.l(data);
        }
    }

    public void e(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        m9k m9kVar = this.worker;
        if (m9kVar != null) {
            m9kVar.n(key);
        }
    }

    public final void f(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.worker = m9k.INSTANCE.a(node);
    }
}
