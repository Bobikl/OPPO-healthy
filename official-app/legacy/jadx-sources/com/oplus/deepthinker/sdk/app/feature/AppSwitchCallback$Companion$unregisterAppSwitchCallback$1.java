package com.oplus.deepthinker.sdk.app.feature;

import android.os.Bundle;
import com.oplus.aiunit.vision.oea;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class AppSwitchCallback$Companion$unregisterAppSwitchCallback$1 extends Lambda implements Function0<Bundle> {
    public static final AppSwitchCallback$Companion$unregisterAppSwitchCallback$1 INSTANCE = new AppSwitchCallback$Companion$unregisterAppSwitchCallback$1();

    public AppSwitchCallback$Companion$unregisterAppSwitchCallback$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final Bundle invoke() {
        Bundle bundle = new Bundle();
        oea.Companion companion = oea.INSTANCE;
        companion.f(bundle, 3);
        companion.i(bundle, 102);
        return bundle;
    }
}
