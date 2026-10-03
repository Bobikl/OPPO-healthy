package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.rpc.host.IRpcMsgApi;
import com.heytap.health.rpc.host.RpcMsgApiImpl;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/vzf;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/rpc/host/IRpcMsgApi;", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "", "c", "b", "<init>", "()V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
public final class vzf implements cm9<IRpcMsgApi> {
    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f("RpcMsgApiProvider", "RpcMsgApiProvider onDestroy");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f("RpcMsgApiProvider", "RpcMsgApiProvider onCreate");
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public IRpcMsgApi d() {
        a7b.f("RpcMsgApiProvider", "RpcMsgApiProvider get service ");
        return RpcMsgApiImpl.INSTANCE;
    }
}
