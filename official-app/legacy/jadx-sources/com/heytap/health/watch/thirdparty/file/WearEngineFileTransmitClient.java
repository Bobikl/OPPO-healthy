package com.heytap.health.watch.thirdparty.file;

import com.oplus.aiunit.vision.nc7;
import com.oplus.ocs.wearengine.p2pclient.file.SendFileRequest;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/watch/thirdparty/file/WearEngineFileTransmitClient;", "", "", ParserTag.TAG_URI, "Lcom/oplus/ocs/wearengine/p2pclient/file/SendFileRequest;", "sendFileRequest", "Lcom/oplus/aiunit/vision/nc7;", "fileTaskListener", "d", "taskId", "", "b", "<init>", "()V", "Companion", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WearEngineFileTransmitClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Lazy<WearEngineFileTransmitClient> a = LazyKt__LazyJVMKt.lazy(new Function0<WearEngineFileTransmitClient>() { // from class: com.heytap.health.watch.thirdparty.file.WearEngineFileTransmitClient$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final WearEngineFileTransmitClient invoke() {
            return new WearEngineFileTransmitClient(null);
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.watch.thirdparty.file.WearEngineFileTransmitClient$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/heytap/health/watch/thirdparty/file/WearEngineFileTransmitClient$a;", "", "Lcom/heytap/health/watch/thirdparty/file/WearEngineFileTransmitClient;", "instance$delegate", "Lkotlin/Lazy;", "a", "()Lcom/heytap/health/watch/thirdparty/file/WearEngineFileTransmitClient;", "instance", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final WearEngineFileTransmitClient a() {
            return (WearEngineFileTransmitClient) WearEngineFileTransmitClient.a.getValue();
        }
    }

    public WearEngineFileTransmitClient() {
    }

    public /* synthetic */ WearEngineFileTransmitClient(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final WearEngineFileTransmitClient c() {
        return INSTANCE.a();
    }

    public final void b(@NotNull String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        WearEngineFileTransmitManager.INSTANCE.a().m(taskId);
    }

    @Nullable
    public final String d(@NotNull String uri, @NotNull SendFileRequest sendFileRequest, @NotNull nc7 fileTaskListener) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(sendFileRequest, "sendFileRequest");
        Intrinsics.checkNotNullParameter(fileTaskListener, "fileTaskListener");
        return WearEngineFileTransmitManager.INSTANCE.a().l(uri, sendFileRequest, fileTaskListener);
    }
}
