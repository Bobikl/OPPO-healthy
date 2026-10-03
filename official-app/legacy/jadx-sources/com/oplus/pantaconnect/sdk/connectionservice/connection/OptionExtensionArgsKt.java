package com.oplus.pantaconnect.sdk.connectionservice.connection;

import android.os.Process;
import com.oplus.pantaconnect.connection.ConnectExtensionArgs;
import com.oplus.pantaconnect.sdk.PlatformInitialization;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"options", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/OptionExtensionArgs;", "Lcom/oplus/pantaconnect/connection/ConnectExtensionArgs;", "toParams", "connectionservice_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OptionExtensionArgsKt {
    @NotNull
    public static final OptionExtensionArgs options(@NotNull ConnectExtensionArgs connectExtensionArgs) {
        return new OptionExtensionArgs(Boolean.valueOf(connectExtensionArgs.getForce()), Boolean.valueOf(connectExtensionArgs.getAddBlacklist()), Boolean.valueOf(connectExtensionArgs.getIsCloseAll()));
    }

    @NotNull
    public static final ConnectExtensionArgs toParams(@NotNull OptionExtensionArgs optionExtensionArgs) {
        ConnectExtensionArgs.Builder builderNewBuilder = ConnectExtensionArgs.newBuilder();
        Boolean force = optionExtensionArgs.getForce();
        Boolean bool = Boolean.TRUE;
        return builderNewBuilder.setForce(Intrinsics.areEqual(force, bool)).setAddBlacklist(Intrinsics.areEqual(optionExtensionArgs.getAddBlacklist(), bool)).setIsCloseAll(Intrinsics.areEqual(optionExtensionArgs.isCloseAll(), bool)).setPid(Process.myPid()).setPkg(PlatformInitialization.INSTANCE.getContext().getPackageName()).build();
    }
}
