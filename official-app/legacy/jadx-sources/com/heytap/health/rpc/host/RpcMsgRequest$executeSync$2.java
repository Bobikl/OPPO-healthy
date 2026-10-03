package com.heytap.health.rpc.host;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/health/rpc/host/e$c;", "it", "", "invoke", "(Lcom/heytap/health/rpc/host/e$c;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class RpcMsgRequest$executeSync$2 extends Lambda implements Function1<e.c, Unit> {
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RpcMsgRequest$executeSync$2(e eVar) {
        super(1);
        this.this$0 = eVar;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(e.c cVar) {
        invoke2(cVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull e.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.b(it);
    }
}
