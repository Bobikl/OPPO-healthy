package com.oplus.pantaconnect.sdk.connectionservice.account;

import android.content.Intent;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&¨\u0006\b"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/account/Account;", "", "getAccountLoginIntent", "Ljava/util/concurrent/CompletableFuture;", "Landroid/content/Intent;", "queryAccountLoginStatus", "Lcom/oplus/pantaconnect/sdk/connectionservice/account/AccountLoginState;", "Companion", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Account {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/account/Account$Companion;", "", "()V", "create", "Lcom/oplus/pantaconnect/sdk/connectionservice/account/Account;", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Account create() {
            return new AccountImpl(null, 1, null);
        }
    }

    @JvmStatic
    @NotNull
    static Account create() {
        return INSTANCE.create();
    }

    @NotNull
    CompletableFuture<Intent> getAccountLoginIntent();

    @NotNull
    CompletableFuture<AccountLoginState> queryAccountLoginStatus();
}
