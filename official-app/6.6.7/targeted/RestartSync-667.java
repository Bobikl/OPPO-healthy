package com.oplus.aiunit.p007vision;

import com.heytap.health.watch.notification.ParsedNotificationActionProto;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/nzc;", "Lcom/oplus/aiunit/vision/n0a;", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", "", "f", "", "commandId", "", "data", "a", "b", "d", "", "key", "e", "Lcom/heytap/health/watch/notification/ParsedNotificationActionProto;", "actionReply", "c", "Lcom/oplus/aiunit/vision/odk;", "Lcom/oplus/aiunit/vision/odk;", "worker", "<init>", "()V", "Companion", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class nzc implements n0a {

    @NotNull
    public static final String TAG = "NTF_TransceiverConvert";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public odk worker;

    @Override // com.oplus.aiunit.p007vision.n0a
    public void a(int commandId, @Nullable byte[] data) {
        odk odkVar = this.worker;
        if (odkVar != null) {
            odkVar.a(commandId, data);
        }
    }

    @Override // com.oplus.aiunit.p007vision.n0a
    public void b(@Nullable byte[] data) {
        odk odkVar = this.worker;
        if (odkVar != null) {
            odkVar.b(data);
        }
    }

    public void c(@NotNull ParsedNotificationActionProto actionReply) {
        Intrinsics.checkNotNullParameter(actionReply, "actionReply");
        odk odkVar = this.worker;
        if (odkVar != null) {
            odkVar.i(actionReply);
        }
    }

    public void d(@Nullable byte[] data) {
        odk odkVar = this.worker;
        if (odkVar != null) {
            odkVar.l(data);
        }
    }

    public void e(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        odk odkVar = this.worker;
        if (odkVar != null) {
            odkVar.n(key);
        }
    }

    public final void f(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.worker = odk.INSTANCE.a(node);
    }
}
