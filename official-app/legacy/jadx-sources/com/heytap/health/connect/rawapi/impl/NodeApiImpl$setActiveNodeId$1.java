package com.heytap.health.connect.rawapi.impl;

import android.os.RemoteException;
import com.heytap.health.connect.rawapi.IHeytap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "iHeytap", "Lcom/heytap/health/connect/rawapi/IHeytap;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class NodeApiImpl$setActiveNodeId$1 extends Lambda implements Function1<IHeytap, Unit> {
    final /* synthetic */ String $mac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeApiImpl$setActiveNodeId$1(String str) {
        super(1);
        this.$mac = str;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) throws RemoteException {
        invoke2(iHeytap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull IHeytap iHeytap) throws RemoteException {
        Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
        iHeytap.setActiveDevice(this.$mac);
    }
}
