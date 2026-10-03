package com.heytap.health.rpc.host;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/heytap/health/rpc/host/e$b;", "it", "", "invoke", "(Lcom/heytap/health/rpc/host/e$b;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class RpcMsgRequest$executeSyncForResp$2 extends Lambda implements Function1<e.b, Unit> {
    final /* synthetic */ int $timeout;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RpcMsgRequest$executeSyncForResp$2(e eVar, int i) {
        super(1);
        this.this$0 = eVar;
        this.$timeout = i;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(e.b bVar) {
        invoke2(bVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.a(it, this.$timeout);
    }
}
