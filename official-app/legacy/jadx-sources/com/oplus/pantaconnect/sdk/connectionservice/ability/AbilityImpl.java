package com.oplus.pantaconnect.sdk.connectionservice.ability;

import android.os.Bundle;
import com.oplus.pantaconnect.sdk.connectionservice.connection.DisplayDevice;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/ability/AbilityImpl;", "Lcom/oplus/pantaconnect/sdk/connectionservice/ability/Ability;", "clients", "Lcom/oplus/pantaconnect/sdk/connectionservice/ability/AbilityClients;", "(Lcom/oplus/pantaconnect/sdk/connectionservice/ability/AbilityClients;)V", "checkLocalAbility", "Ljava/util/concurrent/CompletableFuture;", "", "ability", "", "packageName", "", "getAppIdByPackageName", "getCachedDevicesByAbility", "", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DisplayDevice;", "extraData", "Landroid/os/Bundle;", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AbilityImpl implements Ability {

    @NotNull
    private final AbilityClients clients;

    /* JADX WARN: Multi-variable type inference failed */
    public AbilityImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.ability.Ability
    @NotNull
    public CompletableFuture<Boolean> checkLocalAbility(int ability, @NotNull String packageName) {
        return this.clients.checkLocalAbility(ability, packageName);
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.ability.Ability
    @NotNull
    public CompletableFuture<Integer> getAppIdByPackageName(@NotNull String packageName) {
        return this.clients.getAppIdByPackageName(packageName);
    }

    @Override // com.oplus.pantaconnect.sdk.connectionservice.ability.Ability
    @NotNull
    public CompletableFuture<List<DisplayDevice>> getCachedDevicesByAbility(int ability, @NotNull Bundle extraData) {
        return this.clients.getCachedDevicesByAbility(ability, extraData);
    }

    public AbilityImpl(@NotNull AbilityClients abilityClients) {
        this.clients = abilityClients;
    }

    public /* synthetic */ AbilityImpl(AbilityClients abilityClients, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AbilityClientsKt.createAbilityClients() : abilityClients);
    }
}
