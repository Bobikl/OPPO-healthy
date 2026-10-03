package com.oplus.deepthinker.sdk.app.awareness;

import com.oplus.aiunit.vision.g5g;
import com.oplus.deepthinker.sdk.app.awareness.capability.AwarenessEventCallBack;
import com.oplus.deepthinker.sdk.app.awareness.capability.CapabilityEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/deepthinker/sdk/app/awareness/AwarenessEventClient$registerAwarenessEventAsync$callback$1", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/AwarenessEventCallBack;", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEvent;", "capabilityEvent", "", "onEventStateChanged", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final class AwarenessEventClient$registerAwarenessEventAsync$callback$1 extends AwarenessEventCallBack {
    public AwarenessEventClient$registerAwarenessEventAsync$callback$1(String str) {
        super(str);
    }

    @Override // com.oplus.deepthinker.sdk.app.awareness.capability.AwarenessEventCallBack
    public void onEventStateChanged(@NotNull CapabilityEvent<?> capabilityEvent) {
        Intrinsics.checkNotNullParameter(capabilityEvent, "capabilityEvent");
        g5g.e("AwarenessEventClient", Intrinsics.stringPlus("onEventStateChanged: event id = ", Integer.valueOf(capabilityEvent.getEventId())));
    }
}
