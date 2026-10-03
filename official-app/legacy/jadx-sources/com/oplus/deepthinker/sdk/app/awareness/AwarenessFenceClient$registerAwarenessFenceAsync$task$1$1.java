package com.oplus.deepthinker.sdk.app.awareness;

import android.os.Bundle;
import com.oplus.aiunit.vision.fp0;
import com.oplus.aiunit.vision.oea;
import com.oplus.deepthinker.sdk.app.awareness.fence.AwarenessFence;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class AwarenessFenceClient$registerAwarenessFenceAsync$task$1$1 extends Lambda implements Function0<Bundle> {
    final /* synthetic */ AwarenessFence $awarenessFence;
    final /* synthetic */ fp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwarenessFenceClient$registerAwarenessFenceAsync$task$1$1(fp0 fp0Var, AwarenessFence awarenessFence) {
        super(0);
        this.$awarenessFence = awarenessFence;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final Bundle invoke() {
        Bundle bundle = new Bundle();
        AwarenessFence awarenessFence = this.$awarenessFence;
        oea.Companion companion = oea.INSTANCE;
        companion.f(bundle, 523);
        companion.i(bundle, 101);
        companion.h(bundle, 10009);
        fp0.a(null, bundle, awarenessFence);
        return bundle;
    }
}
