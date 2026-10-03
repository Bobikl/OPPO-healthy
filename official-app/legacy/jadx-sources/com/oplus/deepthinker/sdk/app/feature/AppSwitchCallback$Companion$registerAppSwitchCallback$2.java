package com.oplus.deepthinker.sdk.app.feature;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.oplus.aiunit.vision.g5g;
import com.oplus.aiunit.vision.oea;
import com.oplus.deepthinker.platform.server.IDeepThinkerBridge;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/oplus/deepthinker/platform/server/IDeepThinkerBridge;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class AppSwitchCallback$Companion$registerAppSwitchCallback$2 extends Lambda implements Function1<IDeepThinkerBridge, Unit> {
    final /* synthetic */ AppSwitchCallback $callback;
    final /* synthetic */ AppSwitchCallback.b $config;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSwitchCallback$Companion$registerAppSwitchCallback$2(AppSwitchCallback appSwitchCallback, AppSwitchCallback.b bVar) {
        super(1);
        this.$callback = appSwitchCallback;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IDeepThinkerBridge iDeepThinkerBridge) throws PendingIntent.CanceledException {
        invoke2(iDeepThinkerBridge);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull IDeepThinkerBridge it) throws PendingIntent.CanceledException {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            oea.b(new oea().f(it).d(this.$callback.tag, this.$callback).e(new Function0<Bundle>(null) { // from class: com.oplus.deepthinker.sdk.app.feature.AppSwitchCallback$Companion$registerAppSwitchCallback$2.1
                final /* synthetic */ AppSwitchCallback.b $config;

                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final Bundle invoke() {
                    Bundle bundle = new Bundle();
                    oea.Companion companion = oea.INSTANCE;
                    companion.f(bundle, 3);
                    companion.i(bundle, 101);
                    throw null;
                }
            }), "AtomFeature", "v1", false, 4, null);
        } catch (RemoteException e2) {
            g5g.c("AppSwitchCallback", Intrinsics.stringPlus("registerAppSwitchCallback : ", e2));
        }
    }
}
