package com.oplus.pantaconnect.sdk.connectionservice.account;

import android.content.Intent;
import com.oplus.pantaconnect.sdk.SealedResult;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/account/AccountClients;", "", "getAccountLoginIntent", "Ljava/util/concurrent/CompletableFuture;", "Landroid/content/Intent;", "queryAccountLoginStatus", "Lcom/oplus/pantaconnect/sdk/SealedResult;", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AccountClients {
    @NotNull
    CompletableFuture<Intent> getAccountLoginIntent();

    @NotNull
    CompletableFuture<SealedResult> queryAccountLoginStatus();
}
