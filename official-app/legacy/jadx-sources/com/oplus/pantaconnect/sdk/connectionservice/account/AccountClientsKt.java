package com.oplus.pantaconnect.sdk.connectionservice.account;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"ACCOUNT_INTENT_KEY", "", "createAccountClients", "Lcom/oplus/pantaconnect/sdk/connectionservice/account/AccountClients;", "connectionservice_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AccountClientsKt {

    @NotNull
    private static final String ACCOUNT_INTENT_KEY = "accountIntent";

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final AccountClients createAccountClients() {
        return new AccountClientsImpl(null, 1, 0 == true ? 1 : 0);
    }
}
