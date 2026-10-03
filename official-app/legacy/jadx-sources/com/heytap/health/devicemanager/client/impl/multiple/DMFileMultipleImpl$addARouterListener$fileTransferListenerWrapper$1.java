package com.heytap.health.devicemanager.client.impl.multiple;

import com.oplus.aiunit.vision.ra5;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/heytap/health/devicemanager/client/impl/multiple/DMFileMultipleImpl$ArouterFileTransferListenerWrapper;", "Lcom/heytap/health/devicemanager/client/impl/multiple/DMFileMultipleImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class DMFileMultipleImpl$addARouterListener$fileTransferListenerWrapper$1 extends Lambda implements Function0<DMFileMultipleImpl.ArouterFileTransferListenerWrapper> {
    final /* synthetic */ String $aroutePath;
    final /* synthetic */ ra5 $role;
    final /* synthetic */ DMFileMultipleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DMFileMultipleImpl$addARouterListener$fileTransferListenerWrapper$1(DMFileMultipleImpl dMFileMultipleImpl, ra5 ra5Var, String str) {
        super(0);
        this.this$0 = dMFileMultipleImpl;
        this.$role = ra5Var;
        this.$aroutePath = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final DMFileMultipleImpl.ArouterFileTransferListenerWrapper invoke() {
        return new DMFileMultipleImpl.ArouterFileTransferListenerWrapper(this.this$0, this.$role.getValue(), this.$aroutePath);
    }
}
