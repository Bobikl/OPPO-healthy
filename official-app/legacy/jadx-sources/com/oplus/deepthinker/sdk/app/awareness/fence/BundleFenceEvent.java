package com.oplus.deepthinker.sdk.app.awareness.fence;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/fence/BundleFenceEvent;", "Lcom/oplus/deepthinker/sdk/app/awareness/fence/FenceEvent;", "Landroid/os/Bundle;", "fenceEvent", "fenceType", "", "(Landroid/os/Bundle;Ljava/lang/String;)V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BundleFenceEvent extends FenceEvent<Bundle> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleFenceEvent(@NotNull Bundle fenceEvent, @NotNull String fenceType) {
        super(Bundle.class, fenceEvent, fenceType);
        Intrinsics.checkNotNullParameter(fenceEvent, "fenceEvent");
        Intrinsics.checkNotNullParameter(fenceType, "fenceType");
    }
}
