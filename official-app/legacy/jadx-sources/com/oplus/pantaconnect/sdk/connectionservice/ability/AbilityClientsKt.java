package com.oplus.pantaconnect.sdk.connectionservice.ability;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"createAbilityClients", "Lcom/oplus/pantaconnect/sdk/connectionservice/ability/AbilityClients;", "connectionservice_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AbilityClientsKt {
    @NotNull
    public static final AbilityClients createAbilityClients() {
        return new AbilityClientsImpl();
    }
}
