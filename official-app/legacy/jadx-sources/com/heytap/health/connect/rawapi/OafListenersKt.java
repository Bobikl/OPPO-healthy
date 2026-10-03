package com.heytap.health.connect.rawapi;

import com.heytap.health.adaptersdk.IFileCallback;
import com.heytap.health.adaptersdk.IMessageCallback;
import com.heytap.health.adaptersdk.INodeCallback;
import com.heytap.health.adaptersdk.IRunModeCallback;
import com.oplus.aiunit.vision.bqa;
import com.oplus.aiunit.vision.q43;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/adaptersdk/IFileCallback$Stub;", "a", "Lcom/heytap/health/adaptersdk/IFileCallback$Stub;", "()Lcom/heytap/health/adaptersdk/IFileCallback$Stub;", "oafIFileCallback", "Lcom/heytap/health/adaptersdk/IMessageCallback$Stub;", "b", "Lcom/heytap/health/adaptersdk/IMessageCallback$Stub;", "()Lcom/heytap/health/adaptersdk/IMessageCallback$Stub;", "oafIMessageCallback", "Lcom/heytap/health/adaptersdk/INodeCallback$Stub;", "c", "Lcom/heytap/health/adaptersdk/INodeCallback$Stub;", "()Lcom/heytap/health/adaptersdk/INodeCallback$Stub;", "oafINodeCallback", "Lcom/heytap/health/adaptersdk/IRunModeCallback$Stub;", "d", "Lcom/heytap/health/adaptersdk/IRunModeCallback$Stub;", "()Lcom/heytap/health/adaptersdk/IRunModeCallback$Stub;", "oafIRunModeCallback", "lib_heytapconnect_impl_release"}, k = 2, mv = {1, 8, 0})
public final class OafListenersKt {

    @NotNull
    public static final IFileCallback.Stub a = new IFileCallback.Stub() { // from class: com.heytap.health.connect.rawapi.OafListenersKt$oafIFileCallback$1
        @Override // com.heytap.health.adaptersdk.IFileCallback
        public void onProgressChanged(@NotNull String mac, @NotNull FileTransferTask ftTask) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(ftTask, "ftTask");
            q43.INSTANCE.K(ftTask);
        }

        @Override // com.heytap.health.adaptersdk.IFileCallback
        public void onTransferCompleted(@NotNull String mac, @NotNull FileTransferTask ftTask) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(ftTask, "ftTask");
            q43.INSTANCE.I(ftTask);
        }

        @Override // com.heytap.health.adaptersdk.IFileCallback
        public void onTransferRequested(@NotNull String mac, @NotNull FileTransferTask ftTask) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(ftTask, "ftTask");
            q43.INSTANCE.M(ftTask);
        }
    };

    @NotNull
    public static final IMessageCallback.Stub b = new IMessageCallback.Stub() { // from class: com.heytap.health.connect.rawapi.OafListenersKt$oafIMessageCallback$1
        @Override // com.heytap.health.adaptersdk.IMessageCallback
        public void onMessageReceived(@NotNull String mac, @NotNull MessageEvent event) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(event, "event");
            bqa.A(q43.INSTANCE, mac, event, false, 4, null);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final INodeCallback.Stub f3677c = new INodeCallback.Stub() { // from class: com.heytap.health.connect.rawapi.OafListenersKt$oafINodeCallback$1
        @Override // com.heytap.health.adaptersdk.INodeCallback
        public void onPeerConnected(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            q43.INSTANCE.n(node);
        }

        @Override // com.heytap.health.adaptersdk.INodeCallback
        public void onPeerDisConnected(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            q43.INSTANCE.o(node);
        }
    };

    @NotNull
    public static final IRunModeCallback.Stub d = new IRunModeCallback.Stub() { // from class: com.heytap.health.connect.rawapi.OafListenersKt$oafIRunModeCallback$1
        @Override // com.heytap.health.adaptersdk.IRunModeCallback
        public void onRunModeChanged(@NotNull Node node, int preMode, int currentMode) {
            Intrinsics.checkNotNullParameter(node, "node");
            q43.INSTANCE.e(node, preMode, currentMode);
        }
    };

    @NotNull
    public static final IFileCallback.Stub a() {
        return a;
    }

    @NotNull
    public static final IMessageCallback.Stub b() {
        return b;
    }

    @NotNull
    public static final INodeCallback.Stub c() {
        return f3677c;
    }

    @NotNull
    public static final IRunModeCallback.Stub d() {
        return d;
    }
}
