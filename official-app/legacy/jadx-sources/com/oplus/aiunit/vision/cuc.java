package com.oplus.aiunit.vision;

import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/cuc;", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", "a", "Lcom/oplus/wearable/linkservice/sdk/Node;", "c", "()Lcom/oplus/wearable/linkservice/sdk/Node;", "f", "(Lcom/oplus/wearable/linkservice/sdk/Node;)V", l9d.BUNDLE_KEY_NODE, "", "b", "Z", "()Z", "d", "(Z)V", "bonded", "Lcom/heytap/health/protocol/dm/DMProto$ConnectDeviceInfo;", "Lcom/heytap/health/protocol/dm/DMProto$ConnectDeviceInfo;", "()Lcom/heytap/health/protocol/dm/DMProto$ConnectDeviceInfo;", MapSchema.FIELD_NAME_ENTRY, "(Lcom/heytap/health/protocol/dm/DMProto$ConnectDeviceInfo;)V", "connectDeviceInfo", "<init>", "(Lcom/oplus/wearable/linkservice/sdk/Node;Z)V", "lib_heytapconnect_impl_release"}, k = 1, mv = {1, 8, 0})
public final class cuc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Node node;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean bonded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DMProto$ConnectDeviceInfo connectDeviceInfo;

    public cuc(@NotNull Node node, boolean z) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.node = node;
        this.bonded = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getBonded() {
        return this.bonded;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DMProto$ConnectDeviceInfo getConnectDeviceInfo() {
        return this.connectDeviceInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Node getNode() {
        return this.node;
    }

    public final void d(boolean z) {
        this.bonded = z;
    }

    public final void e(@Nullable DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo) {
        this.connectDeviceInfo = dMProto$ConnectDeviceInfo;
    }

    public final void f(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "<set-?>");
        this.node = node;
    }
}
