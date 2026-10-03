package com.heytap.okhttp.extension.hubble.cloudconfig;

import com.oplus.aiunit.vision.al9;
import com.oplus.aiunit.vision.r7b;
import com.oplus.aiunit.vision.xhl;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/heytap/okhttp/extension/hubble/cloudconfig/HubbleConfigEntity;", "invoke"}, k = 3, mv = {1, 4, 0})
final class HubbleConfigLogic$setCloudConfigCtrl$2 extends Lambda implements Function1<HubbleConfigEntity, Unit> {
    final /* synthetic */ r7b $logger;
    final /* synthetic */ al9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubbleConfigLogic$setCloudConfigCtrl$2(al9 al9Var, r7b r7bVar) {
        super(1);
        this.$logger = r7bVar;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HubbleConfigEntity hubbleConfigEntity) {
        invoke2(hubbleConfigEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull HubbleConfigEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        al9.b(null, it);
        if (xhl.INSTANCE.a(this.$logger) != null) {
            throw null;
        }
        r7b r7bVar = this.$logger;
        StringBuilder sb = new StringBuilder();
        sb.append("CloudConfig#HubbleConfigEntity: isOpen = ");
        HubbleConfigEntity hubbleConfigEntityA = al9.a(null);
        sb.append(hubbleConfigEntityA != null ? hubbleConfigEntityA.getIsOpen() : null);
        sb.append("， connectDelay = ");
        HubbleConfigEntity hubbleConfigEntityA2 = al9.a(null);
        sb.append(hubbleConfigEntityA2 != null ? hubbleConfigEntityA2.getConnectDelay() : null);
        r7b.b(r7bVar, "HubbleLog", sb.toString(), null, null, 12, null);
    }
}
