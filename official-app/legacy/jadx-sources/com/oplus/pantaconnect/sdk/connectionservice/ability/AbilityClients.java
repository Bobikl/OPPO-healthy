package com.oplus.pantaconnect.sdk.connectionservice.ability;

import android.os.Bundle;
import com.oplus.pantaconnect.sdk.connectionservice.connection.DisplayDevice;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH&J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/ability/AbilityClients;", "", "checkLocalAbility", "Ljava/util/concurrent/CompletableFuture;", "", "ability", "", "packageName", "", "getAppIdByPackageName", "getCachedDevicesByAbility", "", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DisplayDevice;", "extraData", "Landroid/os/Bundle;", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AbilityClients {
    @NotNull
    CompletableFuture<Boolean> checkLocalAbility(int ability, @NotNull String packageName);

    @NotNull
    CompletableFuture<Integer> getAppIdByPackageName(@NotNull String packageName);

    @NotNull
    CompletableFuture<List<DisplayDevice>> getCachedDevicesByAbility(int ability, @NotNull Bundle extraData);
}
