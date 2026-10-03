package com.oplus.deepthinker.sdk.app.awareness;

import android.os.Bundle;
import com.oplus.aiunit.vision.ep0;
import com.oplus.aiunit.vision.oea;
import com.oplus.deepthinker.sdk.app.awareness.capability.CapabilityEventCategory;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class AwarenessEventClient$registerAwarenessEventAsync$task$1$1 extends Lambda implements Function0<Bundle> {
    final /* synthetic */ CapabilityEventCategory $category;
    final /* synthetic */ ep0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwarenessEventClient$registerAwarenessEventAsync$task$1$1(ep0 ep0Var, CapabilityEventCategory capabilityEventCategory) {
        super(0);
        this.$category = capabilityEventCategory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final Bundle invoke() {
        Bundle bundle = new Bundle();
        CapabilityEventCategory capabilityEventCategory = this.$category;
        oea.Companion companion = oea.INSTANCE;
        companion.f(bundle, 522);
        companion.i(bundle, 101);
        companion.h(bundle, 10008);
        ep0.a(null, bundle, capabilityEventCategory);
        return bundle;
    }
}
